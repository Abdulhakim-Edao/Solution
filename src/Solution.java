import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
//        int[ ] res = new int[1];
        int a = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=0; i<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    return new int[] { i, j };
                }
                else{
                    return null;
                }
            }
        }
        return null;
    }

    public static void main(String[] args){
        Solution s = new Solution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[ ] nums = new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target number:");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(s.twoSum(nums, target)));
    }
}
