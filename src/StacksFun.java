package src;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StacksFun {

    public static void main(String[] args) {
//        Stack<Integer> stack_arr = new Stack<>();
//        stack_arr.add(1);
//        stack_arr.add(2);
//        stack_arr.add(4);
//        stack_arr.add(5);
////        System.out.printf("%s", stack_arr.set(1,'P'));
//        System.out.printf("%s", stack_arr.peek());
//        stack_arr.push(6);
//        System.out.printf("%s", stack_arr );
        
    }

    public void splitStack(Stack<Integer> s) {
        Queue<Integer> q = new LinkedList<>();
        int neg =0;
        while (!s.isEmpty()){
            int temp = s.pop();
            if (temp < 0) neg ++;
            q.add(temp);
        }

        while (neg>0){
            if (q.peek() <0){
                s.push(q.remove());
                neg--;
            }else
                q.add(q.remove());
        }
        while (!q.isEmpty()) s.push(q.remove());

    }
}
