/*
HackerRank
Q1: You are given n lines. 
	In each line there are zero or more integers. 
	You need to answer a few queries where you need to tell the number located in y position of x line.
	
	Standard I/O
	5
	5 41 77 74 22 44
	1 12
	4 37 34 36 52
	0
	3 20 22 33
	5
	1 3
	3 4
	3 1
	4 3
	5 5
	
*/


import java.util.*;

public class Solution {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of lines : ");
        int numLines = sc.nextInt();
        
        @SuppressWarnings("rawtypes")
		ArrayList<ArrayList> listArray = new ArrayList<ArrayList>();//ArrayList to store List of numbers in each line
       
        for(int i = 0;i<numLines;i++){
        	System.out.println("Enter the number of elements in Line "+(i+1)+" , followed by elements separated by space :");
            int numOfIntegers = sc.nextInt();
            
            ArrayList<Integer> intArrayList =  new ArrayList<Integer>();// ArrayList to store values in each line
            
            for(int j=0;j<numOfIntegers;j++){
                intArrayList.add((sc.nextInt()));// add element to ArrayList
            }
            
            listArray.add(intArrayList);// add ArrayList to ArrayList storing all the lists
            sc.nextLine();// go to next line
        }
        System.out.println("Added successfully");
        
        System.out.println("Enter the number of queries : ");
        int numQueries = sc.nextInt();
        
        for(int i=0;i<numQueries;i++){
        	System.out.println("Enter the line number followed by the element number : ");
            int x = sc.nextInt()-1;// Line number
            int y = sc.nextInt()-1;// Element index
            
            sc.nextLine();
            
            if(x<listArray.size() && y<listArray.get(x).size()){
                System.out.println(listArray.get(x).get(y));
            }
            else{
                    System.out.println("ERROR!");
                }
        }sc.close();
    }
}

/*
I/O format changed for better readability.
Input and Output:

Enter the number of lines : 
5
Enter the number of elements in Line 1 , followed by elements separated by space :
5 41 77 74 22 44
Enter the number of elements in Line 2 , followed by elements separated by space :
1 12
Enter the number of elements in Line 3 , followed by elements separated by space :
4 37 34 36 52 
Enter the number of elements in Line 4 , followed by elements separated by space :
0
Enter the number of elements in Line 5 , followed by elements separated by space :
3 20 22 33
Added successfully
Enter the number of queries : 
3
Enter the line number followed by the element number : 
1 3
74
Enter the line number followed by the element number : 
3 4
52
Enter the line number followed by the element number : 
5 5
ERROR!
*/