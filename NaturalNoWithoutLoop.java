import java.util.*;
public class NaturalNoWithoutLoop {
    static void NaturalNo(int a,int b){
        if(a==b){
            System.out.print(b);
        }else{
            System.out.print(a+" ");
            NaturalNo(a+1, b);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        NaturalNo(1,a);
    }
}
