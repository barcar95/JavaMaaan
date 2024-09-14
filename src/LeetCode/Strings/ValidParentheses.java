package LeetCode.Strings;

/*
20. Valid Parentheses

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.

Example 2:
Input: s = "()[]{}"
Output: true

Example 3:
Input: s = "(]"
Output: false
 */

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
//        create a stack
        Stack<Character> stack = new Stack<>();
//        create a hashmap and put closing bracket as the key and opening bracket as the value
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

//        iterate through string and put characters in stack
        for (char symbol : s.toCharArray()) {
//        set conditional to check if symbol is an opener by checking against hashmap
            if (map.containsValue(symbol)) {
                stack.push(symbol);
//         if stack is not empty and symbol is a closing symbol and the top of stack is equal to the value pair of the symbol
            } else if (!stack.isEmpty() && map.containsKey(symbol) && map.get(symbol) == stack.peek()) {
//              take off from top of stack
                stack.pop();
            } else {
                return false;
            }
        }
//      check if stack is empty at the end of iteration, return boolean
        return stack.isEmpty();
    }

    public static void main(String[] args){
        String s = "()[]{}";
        System.out.println(isValid(s));

        String t = "(";
        System.out.println(isValid(t));
    }
}
