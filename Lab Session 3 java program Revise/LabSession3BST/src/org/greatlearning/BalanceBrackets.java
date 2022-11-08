// JAVA program problem Lab session 3
/*
 * Write a program o balancing Brackets, using a suitable data structure
 * to print whether the string entered is a Balanced Bracket Or Unbalanced String.
 */

package org.greatlearning;

import java.util.Stack;

public class BalanceBrackets {
	public static boolean isStringBalanced(String bracktExpression) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < bracktExpression.length(); i++) {
			char ch = bracktExpression.charAt(i);
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
				continue;
			}
			if (stack.isEmpty()) {
				return false;
			}
			char c;
			switch (ch) {
			case '}':
				c = stack.pop();
				if (c == '(' || c == '[')
					return false;
				break;
			case ')':
				c = stack.pop();
				if (c == '{' || c == '[')
					return false;
				break;
			case ']':
				c = stack.pop();
				if (c == '(' || c == '{')
					return false;
				break;
			default:
				break;
			}

		}
		return (stack.isEmpty());
	}

	// Driver code

	public static void main(String s[]) {
		String expr = "([[{}]])";
		boolean res = isStringBalanced(expr);
		if (res) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
