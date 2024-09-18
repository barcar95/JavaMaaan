package LeetCode.Strings;

/*
3. Longest Substring Without Repeating Characters.

Given a string s, find the length of the longest
substring without repeating characters.

Example 1:

Input: s = "abcabcbb"
Output: 3

Example 2:

Input: s = "bbbbb"
Output: 1
 */

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
//      initialize max variable to keep track of substring length count
        int max = 0;
//        set up left and right pointer variables for sliding window
        int leftPointer = 0;
        int rightPointer = 0;

//        set up hash set
        HashSet<Character> set = new HashSet<>();
//        iterate through char in string using sliding window technique
        while (rightPointer < s.length()){
//        setup condition for repetition by searching set
            if (!set.contains(s.charAt(rightPointer))){
                set.add(s.charAt(rightPointer));
//              right pointer moves forward, slide window is bigger
                rightPointer++;
//              get the maximum value between current max value and size of hashset
                max = Math.max(set.size(), max);
            } else {
//        if condition not met, shorten sliding window by deleting character at left pointer and moving it up by 1
                while(set.contains(s.charAt(rightPointer))){
                    set.remove(s.charAt(leftPointer));
                    leftPointer++;
                }
//              adding char at current right window since it's no longer in set(by left pointer)
                set.add(s.charAt(rightPointer));
                rightPointer++;
            }

        }
//        return count variable
    return max;
    }
    public static void main(String[] args){
//        String s = "bbbbbbb";
//        System.out.println(lengthOfLongestSubstring(s));

        String t = "pwewkew";
        System.out.println(lengthOfLongestSubstring(t));
    }
}
