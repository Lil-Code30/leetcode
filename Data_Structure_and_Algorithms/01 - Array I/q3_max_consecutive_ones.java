// https://leetcode.com/problems/max-consecutive-ones/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i

public class Main{
    public static void main(int[] nums){

        public int findMaxConsecutiveOnes(int[] nums) {
            /**
             the starting point is when nums[i] = 1 and nums[i+1] = 1
             the ending point is when nums[i-1] = 1 and nums[i] = 0

             */

            int count = 0;
            int max = 0;

            for(int i = 0; i < nums.length; i++){
                if(nums[i] == 1){
                    count++;
                    max = max > count ? max : count;
                }else{
                    count = 0;
                }
            }

            return max;

        }
    }
}