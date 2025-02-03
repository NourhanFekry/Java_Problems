package Problems;

public class SingleNumberProblem {

    /*Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

    You must implement a solution with a linear runtime complexity and use only constant extra space.*/

    //Answer


    public int singleNumber(int[] nums) {

        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }


}
