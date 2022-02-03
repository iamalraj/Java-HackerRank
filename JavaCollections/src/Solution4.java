/*
HackerRank

Q4:	A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

	Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})"

	Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

	Given a string, determine if it is balanced or not.

	Input Format

	There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

	The part of the code that handles input operation is already provided in the editor.

	Output Format

	For each case, print 'true' if the string is balanced, 'false' otherwise.

	Sample Input

	{}()
	({()})
	{}(
	[]
	Sample Output

	true
	true
	false
	true

*/

import java.util.*;

public class Solution4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())//continuously read input from user
		{
			String input = sc.next();
			Boolean isBalanced=checkBalance(input,'{','}')&&checkBalance(input,'(',')')&&checkBalance(input,'[',']');
			System.out.println(isBalanced);
		}
		
		sc.close();
	}
	//function to check if the input is balanced
	public static Boolean checkBalance(String input,char opening,char closing) {
		Stack<String>stack=new Stack<>(); //stack to store input tokens
		for(int i=0;i<input.length();i++) {
			char character=input.charAt(i);
			
			//character is closing "} or ] or )" and stack is not empty
			if(character==closing) {
				if(!stack.empty()) {
					stack.pop();
				}
				else {
					return false;//stack empty and closing character found : isBalanced = false
				}
			}
			if(character==opening) {
				stack.push(String.valueOf(character));// if opening character found, then push character to stack
			}
		}
		return stack.empty();
	}

}


/*
Input and Output

{{}}
true
{{}
false
[]
true
[[]]}
false
{[()]}
true


*/
