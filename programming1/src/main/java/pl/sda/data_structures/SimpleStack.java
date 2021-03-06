package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj stos, przechowujacy dane typu int
 * Stos powinien posiadac nastepujace metody:
 *  - pop - sciaga element ze stosu
 *  - push - odklada element na stos
 *  - peek - pozwala podejrzec element na wierzchu stosu
 *  - isEmpty - sprawdza czy stos jest

 */
public class SimpleStack {
    private static final int NOT_FOUND = -1;
    private  Node head;
    private  int size;

    public boolean isEmpty(){
        return size == 0;
    }

    public void push(int element){
        Node newNode = new Node(element);

        if (head == null){
            head = newNode;
        }else {
            Node temp = head;
            newNode.nextNode = temp;
            head = newNode;
        }
        size++;
    }
    public int peek(){
        return head == null ? -1 : head.value;
    }

    public int pop(){
        if(isEmpty()){
            return NOT_FOUND;
        }
        Node temp = head;
        head = head.nextNode;
        int returnValue = temp.value;
        temp = null;
        size--;
        return returnValue;
    }

    private class  Node{
        int value;
        Node nextNode;

        Node(int value){
            this.value = value;
        }
    }
}
