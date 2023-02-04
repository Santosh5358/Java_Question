/*Question:- For a given integer (32 bit integer). Remove all zeros (0) from binary from of the integer and print the value in Decimal.

            Ex: 123=> 1111011-> Remove 0 from the binary form => 111111

            >> print it in decimal => 63
Input:      123

Output:   63

Code :- 
*/
public class Main1
{
	public static void main(String[] args) {
		int a=123;
		String s="";
        while (a > 0) {
            int k=a % 2;
            if(k!=0){
                s+=k;
            }
            a = a / 2;
        }
        int d=Integer.parseInt(s,2);
        System.out.println(d);
        
	}
}
