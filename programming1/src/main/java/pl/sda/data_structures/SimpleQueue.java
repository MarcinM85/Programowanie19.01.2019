package pl.sda.data_structures;

import javax.xml.soap.Node;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj kolejke, przechowujaca dane typu int
 * Kolejka powininna posiadac nastepujace metody:
 *  - enqueue - dodaje element do kolejki
 *  - dequeue - usuwa element z kolejki
 *  - peek - pozwala podejrzec element na poczatku kolejki
 *  - isEmpty - sprawdza czy kolejka jest pusta
 */
public class SimpleQueue {
    private static final int NOT_FOUND = -1;
    private Node head;
    private Node tail;
    private int size;

    public void enqueue(int element) {
        Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            Node temp = tail;
            tail = newNode;
            temp.nextNode = tail;
        }
        size++;
    }

    public void dequeue() {
//      while(!simpleQueue){
//
//      }
        if(isEmpty())
            return;

        Node temp = head;
        head = head.nextNode;
        temp = null;
        size--;
    }

    public int peek() {
        if(head == null) {
            return NOT_FOUND;
        }
        return head.value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
}
