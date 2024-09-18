package LeetCode.Arrays;

/*
1. Two Sum

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
 */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
//        create hashmap with indexes as keys and number as values
        HashMap<Integer, Integer> map = new HashMap<>();
//        iterate through int array
        for(int i=0; i < nums.length; i++){
//        subtract index in int array from target and remaining value to hashmap
          int difference = target - nums[i];
//        set conditional if difference in map as key, return array of [map value, current index]
          if(map.containsKey(difference)){
              return new int[]{map.get(difference), i};
          }
          map.put(nums[i], i);
        }
//      if no values add to target, return empty array
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
