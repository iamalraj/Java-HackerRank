/*
 HackerRank
 
 Q6 : In this problem, you are given N integers. You need to find the maximum number of unique integers among all the possible 
 	  contiguous subarrays of size M.

      Input Format

	  The first line of input contains two integers N and M: representing the total number of integers and the size of the 
	  subarray, respectively. The next line contains N space separated integers.
	  
	  Output Format

	  Print the maximum number of unique integers among all possible contiguous subarrays of size M.

	  Sample Input

	  6 3
      5 3 5 2 3 2

      Sample Output

      3
 
 */


import java.util.*;

public class Solution6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Deque<Integer>deque=new ArrayDeque<Integer>();
		HashSet<Integer>set=new HashSet<Integer>();
		
		System.out.println("Enter the number of integers and the size of the sub array :");
		int numIntegers=sc.nextInt();//number of integers
		int sizeSubArray=sc.nextInt();//maximum size of sub-array

		int maxUnique=0;
		
		System.out.println("Enter the numbers seperated by space :");
		for(int i=0;i<numIntegers;i++)
		{
			int numbers = sc.nextInt();
			deque.push(numbers);//pushes all the numbers to the Deque as entered
			set.add(numbers);//adds unique number to the set
			
			
			if (deque.size()==sizeSubArray) //when size of sub-array becomes maximum size given by user
			{
				maxUnique=Math.max(set.size(),maxUnique);// maximum unique numbers at that instance by getting size of Set
				int num=deque.remove();//remove the first element from Deque head
				if(!deque.contains(num))// if Deque doesn't have further occurrences of the removed number at that instance 
				{
					set.remove(num);// remove the number from set as well
				}
			}
		}
		
		System.out.println("The maximum number of unique integers among all possible contiguous subarrays is :\n"+maxUnique);
		sc.close();	
	}

}

/*
I/O format changed for better readability.

Input and Output:

Enter the number of integers and the size of the sub array :
6 3
Enter the numbers seperated by space :
5 3 5 2 3 2
The maximum number of unique integers among all possible contiguous subarrays is :
3
*/
