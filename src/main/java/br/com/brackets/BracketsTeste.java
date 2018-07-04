package br.com.brackets;

import java.util.Stack;

public class BracketsTeste {
	
	public boolean isValid(String brackets) {
		char[] bracketsArray = brackets.toCharArray();

		if (brackets.length() == 0) {
			return true;
		}
		Stack<Character> stack = new Stack<Character>();

		for (Character bracketsA : bracketsArray) {
			if (bracketsA == '(' || bracketsA == '{' || bracketsA == '[') {
				stack.push(bracketsA);
			}

			if (bracketsA == ')' || bracketsA == '}' || bracketsA == ']') {
				if (stack.isEmpty()) {
					return false;
				}
				char temp = stack.pop();
				if (!(temp == '(' && bracketsA == ')') && !(temp == '{' && bracketsA == '}')
						&& !(temp == '[' && bracketsA == ']')) {
					return false;
				}
			}
		}
		if (!stack.isEmpty()) {
			return false;
		}
		return true;
	}
}
