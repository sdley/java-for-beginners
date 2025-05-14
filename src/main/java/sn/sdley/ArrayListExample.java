package sn.sdley;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main (String[] args) {
        ArrayList<String> states = new ArrayList<>();

        ArrayList<String> names;
        names = new ArrayList<>();

        names.add("Souleymane");
        names.add("Mustafa");
        names.add("Aissatou");
        names.add("Mamadou");
        names.add(2, "Jean");

        System.out.println("Names [initial]: " + names);

        String sdley=names.get(0);
        System.out.println("First name [names.get(0)]: " + sdley);

        names.remove(2);

        names.remove(names.size() - 1);

        names.remove("Mamadou");

        System.out.println("List size: " + names.size());
        System.out.println("Names [final]: " + names);
    }
}
