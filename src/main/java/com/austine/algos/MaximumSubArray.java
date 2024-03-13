package com.api.openBank.algos;

public class MaximumSubArray {
    /**
     * Given an integer array nums, find the
     * subarray
     *  with the largest sum, and return its sum.
     *
     * Example 1:
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     * Example 2:
     *
     * Input: nums = [1]
     * Output: 1
     * Explanation: The subarray [1] has the largest sum 1.
     * Example 3:
     *
     * Input: nums = [5,4,-1,7,8]
     * Output: 23
     * Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
     *
     * https://leetcode.com/problems/maximum-subarray/
     * https://youtu.be/5WZl3MMT0Eg
     * @param
     */

    public static int maxSubArray(int[] nums) {
        //use the sliding window technique
        int n = nums.length;
        int max = Integer.MIN_VALUE, sum = 0;

        for(int i=0;i<n;i++){
            sum += nums[i];
            max = Math.max(sum,max);
            if(sum<0) sum = 0;
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
//        int[] arr={-2,1};
//        int[] arr={-1,-2};
        System.out.println(maxSubArray(arr));
    }
}
