// 3. Given a string s consisting of opening and closing parenthesis '(' and ')'. Find the length of the longest valid parenthesis substring.

// A parenthesis string is valid if:

//     For every opening parenthesis, there is a closing parenthesis.
//     The closing parenthesis must be after its opening parenthesis.

// Example:

// Input: s = "((()"
// Output: 2
// Explanation: The longest valid parenthesis substring is "()".
// Explanation: There exists a loop as last node is connected back to the second node.

import java.util.Stack;

public class LongestValidParentheses {
    public static int longestValid(String s) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1)
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    maxLength = Math.max(maxLength, i - stack.peek());
                } else {
                    stack.push(i);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "((()";
        int result = longestValid(s);
        System.out.println("Output: " + result);
    }
}
