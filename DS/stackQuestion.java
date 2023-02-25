package DS;
import java.util.*;
public class stackQuestion {
    public static void main(String[] args) {
        String s="(){}[]"; // true
        // String s="({[})";   // false
        System.out.println(VaildString(s));
    }

    static boolean VaildString(String s) {
        Stack <Character> stack=new Stack<>();
        char []c=s.toCharArray();
        for(char i:c){
            if(i=='}'){
                if(stack.peek()=='{'){
                    stack.pop();
                }else{
                    return false;
                }
            }else if(i==']'){
                if(stack.peek()=='['){
                    stack.pop();
                }else   
                    return false;

            }else if(i==')'){
                if(stack.peek()=='('){
                    stack.pop();
                }else
                    return false;
            }else{
                stack.push(i);
            }
        }
        if(stack.size()==0)
                return true;
            else
                return false;
    }
}
