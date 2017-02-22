/**
 * Created by syy on 2017/2/22.
 */
public class MainTest {

    public static void main(String[] args){
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(7);
        ListNode a3 = new ListNode(9);
        ListNode a4 = new ListNode(7);
        ListNode a5 = new ListNode(9);
        ListNode a6 = new ListNode(3);
        ListNode a7 = new ListNode(2);
        ListNode a8 = new ListNode(6);
        ListNode a9 = new ListNode(7);


        ListNode b1 = new ListNode(9);
        ListNode b2 = new ListNode(9);
        ListNode b3 = new ListNode(7);
        ListNode b4 = new ListNode(0);
        ListNode b5 = new ListNode(7);
        ListNode b6 = new ListNode(3);
        ListNode b7 = new ListNode(1);
        ListNode b8 = new ListNode(8);
        ListNode b9 = new ListNode(0);
        ListNode b10 = new ListNode(1);



//        a1.next=a2;
//        a2.next=a3;
//        a3.next=a4;
//        a4.next=a5;
//        a5.next=a6;
//        a6.next=a7;
//        a7.next=a8;
//        a8.next=a9;


        b1.next=b2;
//        b2.next=b3;
//        b3.next=b4;
//        b4.next=b5;
//        b5.next=b6;
//        b6.next=b7;
//        b7.next=b8;
//        b8.next=b9;
//        b9.next=b10;

        Solution1 solution = new Solution1();
        ListNode result = solution.addTwoNumbers(a1,b1);
        while(result!=null){
            System.out.print(result.val);
            result = result.next;
        }

    }
}
