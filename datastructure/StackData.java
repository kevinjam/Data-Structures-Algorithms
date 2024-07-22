package datastructure;
import java.util.Stack;
public class StackData {

    private Stack<Integer> example(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        return stack;
    }

    public static void main(String[] args) {
        StackData stackData = new StackData();
        stackData.example();
        stackData.example().push(4);
        var isEmpty = stackData.example().isEmpty();
        System.out.printf("Stack is empty: %b ", isEmpty);
        var position = stackData.example().search(1);
        System.out.printf("position of 1 is %d ", position);

        System.out.printf("Stack data {} "+ stackData.example());
    }
}
