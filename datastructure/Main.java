package datastructure;

public class Main {

//    Write a function that takes an array of integers
//    and returns a new array with the elements in reverse order.
    public static void main(String[] args) {
        //var dataReverse = "Chinabalire Janvier Kevin";
       // var stringReversed = new StringReverser();
        //var data =stringReversed.reversedOrder(dataReverse);
        //System.out.printf("%s", data);

       // var dataReverseInteger = 123456789;
       // var integerReversed = new IntegerReverser();
       // Integer reverse = integerReversed.reverse(dataReverseInteger);
       // System.out.printf("%d", reverse);

//        var str = "{1 + 2>";
//        Expression exp = new Expression();
//        boolean expressionBalanced = exp.isBalanced(str);
//        System.out.printf("Expression is balanced: %b", expressionBalanced);


        BinaryTree tree = new BinaryTree();
        tree.inset(7);
        tree.inset(4);
        tree.inset(9);
        tree.inset(1);
        tree.inset(6);
        tree.inset(8);
        tree.inset(10);
//        tree.traversePreOrder();
//        tree.traverseInOrder();
//        tree.traversePostOrder();
        System.out.println( tree.height());

    }


}
