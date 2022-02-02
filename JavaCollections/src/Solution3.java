/*
 HackerRank
 
 Q3: You are given a phone book that consists of people's names and their phone number. After that you will be given some person's name as query. 
 	 For each query, print the phone number of that person.
 	 
 	 Input Format
	 The first line will have an integer  denoting the number of entries in the phone book. Each entry consists of two lines: a name and the corresponding phone number.
     After these, there will be some queries. Each query will contain a person's name. Read the queries until end-of-file
 
 	 Output Format
 	 For each case, print "Not found" if the person has no entry in the phone book. Otherwise, print the person's name and phone number. See sample output for the exact format.
	 To make the problem easier, we provided a portion of the code in the editor. You can either complete that code or write completely on your own.
	 
	 Standard I/O
	 
	 Input
	 3
	 uncle sam
	 99912222
	 tom
	 11122222
	 harry
	 12299933
	 uncle sam
	 uncle tom
	 harry
	 
	 Output
	 uncle sam=99912222
	 Not found
	 harry=12299933
	 
 	
 */

import java.util.*;
public class Solution3 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		
		HashMap<String, Integer>phoneBook=new HashMap<>();// hashmap for storing name as key and number as value
		
		System.out.println("Enter the number of entires : ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter the name and phone number : ");

		for (int i=0;i<n;i++) {
			String name = sc.nextLine();
			int phone = sc.nextInt();
			sc.nextLine();
			phoneBook.put(name, phone);// add the entry to hashmap
		}
		
		System.out.println("All the entries are successfully added! Now you can start searching");
		
		// get search keyword from user until scanner has no tokens left 
		while(sc.hasNext()) {
			String search = sc.nextLine();//get search keyword(name)
			
			// match found
			try {
				int match = phoneBook.get(search);
				System.out.println(search+"="+match);
			}
			
			// match not found
			catch (Exception e){
				System.out.println("Not found");
			}
		}
	
		sc.close();
	}

}

/*
I/O format changed for better readability.
Input and Output:

Enter the number of entires : 
3
Enter the name and phone number : 
Uncle Sam
99912222
Tom
11122222
Harry
12299933
All the entries are successfully added! Now you can start searching
Uncle Sam
Uncle Sam=99912222
Uncle Tom
Not found
Harry
Harry=12299933

*/


