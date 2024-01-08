package Collections.Comparable;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ComparableRun {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        Collections.addAll(users, new User("S"), new User("A"));
        Collections.sort(users);
        System.out.println(users);
    }
}
