package Generics;

import Generics.GenericList;

public class GenericsRun {
    public static void main(String[] args) {
        GenericList<Integer> list = new GenericList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        list.remove(30);
        System.out.println(list);
    }
}
