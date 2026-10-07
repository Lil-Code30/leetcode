// https://leetcode.com/problems/shuffle-the-array/description/?envType=problem-list-v2&envId=dsa-linear-shoal-array-i
public class Main{
    public static void main(int[] nums){

        public int[] shuffle(int[] nums, int n) {
            int[] newArr = new int[2 * n];

            /**
             * i : the pointer use to direct the first n halves (starting at index = 0)
             * k : the pointer use to direct the rest of the havles (starting at index = n)
             * j : the pointer use to direct where to input data in the new array ( incremented by 2)
             */

            for(int i = 0, k = n, j=0; i <= n-1; i++, j+=2, k++){
                newArr[j] = nums[i];
                newArr[j+1] = nums[k];
            }

            return newArr;
        }
}