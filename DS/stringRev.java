package DS;
import java.util.*;
public class stringRev {
    public static void main(String[] args) {
        String s="Santosh";
        StringReverse(s);
    }

    private static void StringReverse(String s) {
        Stack <Character> stack=new Stack<>();
        char [] c=s.toCharArray();
        for(char i:c){
            stack.push(i);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
