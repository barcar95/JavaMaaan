package LeetCode.Strings;

/*
125. Valid Palindrome

A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
 */

public class ValidPalindrome {
    public static boolean isPalindrome(String s){

//        use regex to remove all characters to empty space except for letters a-z, A-Z, and numbers 0-9
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
//        change new assigned string to lowercase char
//        String lCString = s.toLowerCase();
//        use two pointer method to compare characters to each other
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while(leftPointer < rightPointer){
            if(s.charAt(leftPointer) == s.charAt(rightPointer)){
                leftPointer++;
                rightPointer--;
            } else {
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
