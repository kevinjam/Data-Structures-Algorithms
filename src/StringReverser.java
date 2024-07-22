package src;

import java.util.Stack;

public class StringReverser {
//    Write a function that takes a String
//    and returns a new String with the elements in reverse order.

    public String reversedOrder(String reversed){
        if (reversed ==null)
            throw new IllegalArgumentException("String is null");
        if (reversed.contains(" "))
            reversed = reversed.replace(" ", "");
        Stack<Character> newStack = new Stack<>();
        for(char ch: reversed.toCharArray()){
            newStack.push(ch);
        }

        StringBuffer result = new StringBuffer();
        while(!newStack.isEmpty())
            result.append(newStack.pop());
        return result.toString();
    }

}
