package pl.sda.data_structures;

/**
 * https://visualgo.net/en/list
 *
 * Zaimplementuj liste wiazana jednokierunkowa, przechowujaca dane typu int
 * Lista powininna posiadac nastepujace metody:
 *  - prepend - dodaje element na poczatek listy
 *  - append - dodaje element na koniec listy
 *  - insert - dodaje element na zadanym indeksie
 *  - remove - usuwa element na podanym indeksie z listy
 *  - getSize() - zwraca ilosc elementow w liscie
 *  - isEmpty - sprawdza czy lista jest
 *  - get - zwraca wartosc elementu na zadanym indeksie
 */
public class SimpleLinkedList {
    private static final int NOT_FOUND = -1;
    private SimpleLinkedList.Node head;
    private SimpleLinkedList.Node tail;
    private int size;

    private class Node {
        int value;
        Node nextNode;

        Node(int value) {
            this.value = value;
        }
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize(){
        return size;
    }

    public int prepend(int element){
        Node node= new Node(element);

        if (isEmpty()){
            return NOT_FOUND;
        }
        SimpleLinkedList.Node temp = head;
        head = head.nextNode;
        int returnValue = temp.value;
        temp = null;
        size--;
        return returnValue;
    }

    public void append(int element){
        SimpleLinkedList.Node newNode = new Node(element);

        if(head == null) {
            head = newNode;
            tail = newNode;
        } else {
            SimpleLinkedList.Node temp = tail;
            tail = newNode;
            temp.nextNode = tail;
        }
        size++;
    }

    public int get(int index){
        Node currentNode = head;
        int currentIndex = 0;
        while (currentIndex < index){
            currentNode = currentNode.nextNode;
            currentIndex++;
        }
        return currentNode.value;

    }
}
