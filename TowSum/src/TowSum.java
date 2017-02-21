/**
 * Created by syy on 2017/2/21.
 */
public class TowSum {
    public static void  main(String[] args){
        int[] nums={3,2,4};
        int target =6 ;
        Solution2 solution = new Solution2();
        int[] result = solution.twoSum(nums,target);
        for(int i : result){
            System.out.println(i);
        }
    }
}
