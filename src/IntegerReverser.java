package src;

import java.util.Stack;

public class IntegerReverser {
    //    Write a function that takes a Integer
    //   and returns a new Integer with the elements in reverse order.

    public Integer reverse(Integer input){
        if (input == 0) {
            return 0; // Handle special case of zero
        }
        Stack<Integer> stack = new Stack<>();
        String reversedString;
        try {
            reversedString = Integer.toString(input).replace(" ", "");  // Remove spaces if present
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Input is not a valid integer");
        }
        for(int i: reversedString.toCharArray()){
            stack.push(i);
        }
        StringBuffer result = new StringBuffer();
     while (!stack.isEmpty()){
         result.append(stack.pop());
     }
     try {
         return Integer.parseInt(result.toString());
     }catch (NumberFormatException e) {
         throw new RuntimeException("Unexpected error during parsing");
     }
    }
}
