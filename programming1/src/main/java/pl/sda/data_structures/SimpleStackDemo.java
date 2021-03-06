package pl.sda.data_structures;

public class SimpleStackDemo {

    public static void main(String[] args) {
        SimpleStack simpleStack = new SimpleStack();
        System.out.println(simpleStack.isEmpty() ? "Empty" : "not empty");
        System.out.println("Peek: " + simpleStack.peek());
        simpleStack.push(31);
        System.out.println(simpleStack.isEmpty() ? "Empty" : "Not empty");
        System.out.println("Peek: " + simpleStack.peek());


//        pop test

        System.out.println();
        simpleStack.push(10);
        simpleStack.push(13);
        simpleStack.push(50);
        simpleStack.push(230);

        while (!simpleStack.isEmpty()){
            System.out.println("Peek: " + simpleStack.peek());
            simpleStack.pop();
        }

        System.out.println(simpleStack.isEmpty() ? "Empty" : "not empty");
        System.out.println("Peek: " + simpleStack.peek());

    }
}
