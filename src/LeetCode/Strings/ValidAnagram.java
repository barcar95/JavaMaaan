package LeetCode.Strings;

/*
242. Valid Anagram
Given two strings s and t, return true if t is an
anagram
 of s, and false otherwise.

Example 1:
Input: s = "anagram", t = "nagaram"
Output: true

Example 2:
Input: s = "rat", t = "car"
Output: false
 */

import java.util.HashMap;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        // create hashmap
        HashMap<Character, Integer> hash = new HashMap<>();
//            adds all char from string s to hash keys and increments value
        for (int i = 0; i < s.length(); i++) {
            hash.put(s.charAt(i), hash.getOrDefault(s.charAt(i), 0) + 1);
        }
//            iterates through string t and checks if char is in hash

        for (int j = 0; j < t.length(); j++) {
//                if char at t in hash, decrements value by 1 or defaults char to 0
            hash.put(t.charAt(j), hash.getOrDefault(t.charAt(j), 0) - 1);
        }
//          checks if values in hash are all at 0 since chars from both strings should be used up
        for (int val : hash.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
}

    public static void main(String[] args){
        String s = "a";
        String t = "ab";
        System.out.println(isAnagram(s,t));

        s = "rat";
        t = "car";
        System.out.println(isAnagram(s,t));
    }
}


