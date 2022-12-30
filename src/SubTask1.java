import java.util.Stack;

public class SubTask1 {

    public static boolean testString(String inputString){

        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < inputString.length(); i++){

            char ch = inputString.charAt(i);

            if(ch == '[' || ch == '(') stack.push(ch);

            if(ch == ']' || ch == ')'){

                if(stack.empty()) return false;

                char stackedChar = stack.pop();

                if((ch == '(' && stackedChar == ')') || (ch == '[' && stackedChar == ']')) return true;
            }
        }
        return stack.empty();
    }
}
