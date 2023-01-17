# Java_Question
Q1. 

Sample Input :-

2--------> number of students
1--------> RedID
Malik----->Fname
2---------> RedID
Akhtar----->Fane

Output:
  Students details sorted by Fname:-{2 Akhtar, 1 Malik}
  
  Code:-
  import java.util.*;
  public class Main
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

Q2. Check the sum of Tripet Exits
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
 
 public class Main
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
import java.util.*;
public class Main
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
