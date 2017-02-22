import java.util.ArrayList;

/**
 * Created by syy on 2017/2/22.
 */
public class Solution1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode data = null;
        ListNode last = null;
        int flag = 0 ; //进位数
        // 如果两个链表的下一个节点都为空，则结束
        while (l1!=null || l2!=null){
            int r = 0; // 两个数相加的结果
            if(l1 == null){
                r = 0 + l2.val;
                l2 = l2.next;
            }else if(l2 == null){
                r = l1.val + 0;
                l1 = l1.next;
            }else {
                r = l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;
            }
            r = r + flag;
            //是否需要进位
            ListNode result = null;
            if(r >= 10){
                r = r%10;
                result = new ListNode(r);
                flag = 1;
            }else{
                result = new ListNode(r);
                flag = 0;
            }

            if (data == null){
                data = result;
                last = result;
            }else {
                last.next=result;
                last = result;
            }
        }
        if (flag==1){
            ListNode r = new ListNode(1);
            last.next=r;
        }

        return data;
    }

}
