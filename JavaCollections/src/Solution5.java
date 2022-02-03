/*
HackerRank
Q5 : You are given "n" pairs of strings. Two pairs (a,b) and (c,d) are identical if a=c and b=d. That also implies (a,b) is not same as (b,a). 
	 After taking each pair as input, you need to print number of unique pairs you currently have.

	Input Format

	In the first line, there will be an integer  denoting number of pairs. 
	Each of the next  lines will contain two strings seperated by a single space.

	Output Format

	Print "n" lines. In the ith line, print number of unique pairs you have after taking ith pair as input.
	
	Sample Input

	5
	john tom
	john mary
	john tom
	mary anna
	mary anna
	
	Sample Output

	1
	2
	2
	3
	3
	
*/
import java.util.*;

public class Solution5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//read the number of pairs user want to provide
		System.out.println("Enter the number of pairs : ");
		int pair=sc.nextInt();
		sc.nextLine();
		
		String[] left=new String[pair]; // stores first entry in the pair
		String[] right=new String[pair];// stores second entry in the pair
		
		for(int i=0;i<pair;i++)
		{
			left[i]=sc.next();// stores first string from pair
			right[i]=sc.next(); // stores second string from pair
		}
		
		HashSet<String>uniquePair=new HashSet<>(pair);// HashSet to store unique pairs as Set Interface only allows unique values
		
		for(int i=0;i<pair;i++) {
			uniquePair.add(left[i]+" "+right[i]);// add pair to HashSet
			System.out.println(uniquePair.size()); // returns size of HashSet after each iteration
		}
		sc.close();
	}

}

/*
Input and Output

Input :

Enter the number of pairs : 
5
john tom
john mary
john tom
mary anna
mary anna

Output:

1
2
2
3
3
*/
