
/*# Java_Question
Q1.  Take input name and their marks and arrange the name according to their name and their marks using array /list 

Sample Input :-

2--------> number of students
1--------> RedID
Malik----->Fname
2---------> RedID
Akhtar----->Fane

Output:
  Students details sorted by Fname:-{2 Akhtar, 1 Malik}
  
  Code:-
  */
  import java.util.*;
 class Q1
  {
	public static void main(String[] args) {
		//System.out.println("Hello World");
		String s[]={"malik","akhtar"}; //avi,malik,ram,ravi
		int []ik={1,2};
		String cS[]=s.clone(); // malik,ram,ravi,avi
		Arrays.sort(s);

		
		for(int i=0;i<s.length;i++){ //    s[0]=avi,cs[3]=avi
		    for(int j=0;j<cS.length;j++){
		        if(s[i]==cS[j]){
		            System.out.println(ik[j]+" "+s[i]);
		        }
		    }
		}
	}
}
/* 
Q2. Check the sum of Tripet Exits or Not
 
 Sample Input :-
 
 8------->length of Array
 2------>elements 
 7
 4
 0
 9
 5
 1
 3
 6-------->target value
 
 Output:- 
 Triplet Exists
 
 Code:-
 */
class Q2
{
    public static void tripletSum(int[] arr, int x) {
        //int numberPairs = 0;
        boolean b=false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    //System.out.println(arr[i]+arr[j]+arr[k]);
                    if (arr[i] + arr[j] + arr[k] == x) {
                        b=true;
                        break;
                    }else  
                        b=false;
                }
                if(b==true){
                    break;
                }
            }
            if(b==true)
                break;
        }
        System.out.println(b);
        
    }
	public static void main(String[] args) {
		int a=2;
		int arr[]={1,2,3};
		tripletSum(arr, a);
	}
}
/* 
Q3.   Write a program to take input name deparment language and mail id using Array /List and print if python language exists in language also print their name who have python language in their hobby also use the id like for the 1st person input the id is "E22BCAU001 for the 1st input and for the second one the id is "E22BCAU002" and soo on 

Sample Test Case:

Input:-
ram----->name
cse------>deparment
python ,java,R---> language
ram@gmail.com-----> email

Output:-
python exists in E22BCAU001
ram

Code:-
*/

 class Q3
{
	public static void main(String[] args) {
		int a=3;
		String []n={"ram","ravi","Avi"};
		String []d={"cse","ece","mca"};
		String []l={"python,java,r","java,c","python"};
		String []m={"ram@gmail.com","ravi@gmail.com","avi@gmail.com"};
		for(int i=0;i<a;i++){
		    if(l[i].contains("python"))
		        System.out.println("python exxists in E22BCAU00"+i);
		    else
		        System.out.println("python does not exxists in E22BCAU00"+i);
		}
		for(int i=0;i<a;i++){
		    if(l[i].contains("python"))
		        System.out.println(n[i]);
		}
	}
}
/*
Q4. Mr. Radison is a Professor at Code Tantra University wanted to explain Pascal's Triangle problem to students, Help Mr. Radison to implement triangle problem with code by using recursion.

Pascal's Triangle:
	Pascal's triangle is a pattern of the triangle which is based on nCr.

Sample Test Case

Input:

4 #Number of sides

Output

[1, 3, 3, 11] ------>Display the required ouput in the given format.

Code:- 
// Print Pascal's Triangle in Java
*/

class Q4 {
	static int factorial(int i)
	{
		if (i == 0)
			return 1;
		return i * factorial(i - 1);
	}
	public static void main(String[] args)
	{
		int n = 4;
		String s="";
		for (int i = 0; i < n; i++) {
		    for (int j = 0; j <= i; j++) {

				// nCr formula
				if(i==3)
				    s+=factorial(i)/ (factorial(i - j)* factorial(j))+" ";
			}
		}
		System.out.print(s);
	}
}
/*
Q5 .  Fitness is a big challenge for all the kids nowadays, So, XYZ School has allotted N trays for N kids, each kid will be allotted 1 tray. Each tray is filled with N eggs Every kid is randomly allotted some number every day, all kids who are getting the same number must form a group. All the kids in that group must consume eggs that are equal to group size group size is 3 then all the kids in that group must consume 3 eggs from their tray.

Principal wanted a dashboard that displays the number of eggs left in each tray. Can you help with a program that accepts the number of kids or number of trays N and the random number picked by each kid and print the number of eggs left in each tray?

Read the input from STDIN and print the output to STDOUT. Do not write arbitrary strings anywhere in the program, as these contribute to the standard output and testcases will fail.

Input Format The first line of input must contain N, the total number of trays

The second line of input contains N random numbers that are selected by N students Each number is separated by a single while space

Output Format:-

The output contains a dashboard that displays the number of eggs left in oach tray, separated by a single while space

Sample Inputt: 
8
12522544
Sample Output1: 
75655666

Explanation1:
The total number of trays and total number of students and total number of eggs in each tray. -8 And the random numbers selected by students are 1, 2, 5, 2, 2,5,4,4

There is only 1 student who picked the random as 1,50 he/she will consume only one egg therefor left over eggs 8-1=7
There are 3 students who picked the random as 2:so they will consume three eggs therefor left over eggs 8-3=5 
There are 2 students who picked the random as 5, so they will consume two eggs, therefor left over eggs 8-2=6
There are 3 students who picked the random as 2,so they will consume three eggs, therefor left over eggs 8-3=5
There are 3 students who picked the random as 2,so they will consume three eggs, therefor left over eggs 8-3=5
There are 2 students who picked the random as 5, so they will consume two eggs, therefor left over eggs 8-2=6
There are 2 students who picked the random as 4, so they will consume two eggs, therefor left over eggs 8-2=6
There are 2 students who picked the random as 4, so they will consume two eggs, therefor left over eggs 8-2=6

Code :- 
*/

class Q5
{
	public static void main(String[] args) {
		int a[]={1,2,5,2,2,5,4,4};
		int len=a.length;
		
		for(int i=0;i<len;i++){
		    int c=1;
		    for(int j=0;j<len;j++){
		        if(i==j){
		            continue;
		        }
		        else if(a[i]==a[j]){
		            c++;
		          
		        }
		    }
		    System.out.print((len-c)+" ");
		}
	}
}
public class Main{
	public static void main(String[] args) {
		Q1 q1=new Q1();
		Q2 q2=new Q2();
		Q3 q3=new Q3();
		Q4 q4=new Q4();
		Q5 q5=new Q5();
		int Question=5;
		switch(Question) {
			case 1:
			  q1.main(args);
			  break;
			case 2:
			  // code block
			  break;
			case 3:
			  // code block
			  break;
			case 4:
			  // code block
				break;
			case 5:
				break;
		  }
	}
}
