import static org.junit.jupiter.api.Assertions.*;

class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList test = new MyLinkedList(10);
        test.add(1,2);
        test.add(1,2);
        test.add(1,2);
        test.add(1,2);

        test.addFirst(3);
        test.addFirst(5);
        test.addFirst(11);


        test.printList();

    }

}