/*
HackerRank
Q2: For this problem, we have  types of queries you can perform on a List:

	Insert  at index :
	Insert
	x y

	Delete the element at index :
	Delete
	x
	Given a list L, of N integers, perform Q queries on the list.
	Once all queries are completed, print the modified list as a single line of space-separated integers.
*/
import java.util.*;

public class Solution2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements : ");//get the number of elements to be stored in ArrayList
		int numElements = sc.nextInt();
		
		ArrayList<Integer>numList = new ArrayList<>();// ArrayList to store numbers
		for(int i=0;i<numElements;i++) {
				numList.add(sc.nextInt());// Add new element to the List
		}
		
		System.out.println("Enter the number of queries : ");
		int numQueries = sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<numQueries;i++) {
			String query=sc.nextLine();
			
			// add new element to index provided by user
			if(query.equals("Insert")) {
				String[] queryArray = sc.nextLine().split(" ");
				//convert string array elements to integer index and element for adding to ArrayList
				numList.add((Integer.parseInt(queryArray[0])),(Integer.parseInt(queryArray[1])));
			}
			
			// delete element at index provided by user
			else {
				numList.remove(Integer.parseInt(sc.nextLine()));
			}	
		}
		
		for(int num : numList) {
		System.out.print(num+" ");	
		}
		sc.close();
	}
}

/*
I/O format changed for better readability.
Input and Output:

Enter the number of elements : 
5
12 0 1 78 12
Enter the number of queries : 
2
Insert
5 23
Delete
0
0 1 78 12 23 
*/
