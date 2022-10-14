import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        NewArrayList<Integer> newArrayList = new NewArrayList<>();
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.set(2, 4);

        System.out.println(newArrayList.toString());

        NewLinkedList<Integer> newLinkedList = new NewLinkedList<>();
        newLinkedList.addLast(1);
        newLinkedList.addFirst(2);
        newLinkedList.addFirst(3);

        System.out.println(newLinkedList.toString());

    }
}