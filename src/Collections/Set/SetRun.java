package Collections.Set;

import java.util.*;

public class SetRun {
    public static void main(String[] args) {
        // Remove the duplicates from the linked list
        LinkedList<Integer> linkedList = new LinkedList<>();
        Collections.addAll(linkedList, 1,2,1,2,3,4,3,5,6,7,12,8,9);

        System.out.println(linkedList);

        Set<Integer> set = new LinkedHashSet<>(linkedList);
        System.out.println(set);

        linkedList = new LinkedList<>(set);
        System.out.println(linkedList);
    }
}
