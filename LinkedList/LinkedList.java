package LinkedList;

/** Linked List implementation using a static inner Node class */
public class LinkedList<E> {
    Node<E> head;

    static class Node<E> {
        E data; // value, generic type
        Node<E> next;

        Node(E data) { // node constructor, takes in value of generic type and sets the pointer to null
            this.data = data;
            next = null;
        }
    }

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        int count = 0;
        Node<E> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insert(E value) {
        Node<E> newNode = new Node<>(value);

        if (head == null) { // if list is empty, set head as node
            head = newNode;
        } else { // otherwise, traverse list to last node
            Node<E> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // methods todo later
    }

    public void insertFront(E value) {

    }

    public E getHeadValue() {
        return head.data;
    }

    public void printAllValues() {
        Node<E> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    /**
     * // There has to be a better way of doing this but this method is used to
     * reverse the list in a cleaner way
     */
    public Node<E> ReverseHelper() {
        Node<E> previous = null;

        while (head != null) {
            Node<E> nextNode = head.next; // ref to next node

            head.next = previous; // making head point to previous and break the link
            previous = head; // shifting previous to head so next node can point to this node
            head = nextNode; // head is now next node
        }
        return previous; // head will be null at end so return previous as new head
    }

    public void Reverse() {
        head = ReverseHelper();
    }

}
