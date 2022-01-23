package LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> lst = new LinkedList<>();

        for (int i = 0; i < 15; i++) {
            lst.insert(i);
        }

        lst.printAllValues();

        lst.Reverse();

        lst.printAllValues();
    }
}
