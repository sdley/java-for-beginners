package sn.sdley;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Souleymane");
        students.add("Mustafa");
        students.add("Aissatou");
        students.add("Mamadou");

        System.out.print("Les elements de la liste sont : ");
        System.out.println(students);
        System.out.println("La taille de la liste est : " + students.size());
        System.out.println();

        // Let's add elements to index 0 and 1
        students.add(0, "Marie");
        students.add(1, "Mike");

        System.out.print("Les elements de la liste sont maintenant : ");
        System.out.println(students);
        System.out.println("La taille de la liste est : " + students.size());
        System.out.println();

        // Affichage des elements avec une boucle for-each
        System.out.println("Affichage des elements avec une boucle for-each : ");
        for (String student : students)
            System.out.print(student + " ");
        System.out.println("\n");

        // Utilisation d'un objet Iterator
        System.out.println("Utilisation d'un objet Iterator : ");
        Iterator<String> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println("\n");


        // Utilisation de ListIterator
        ListIterator<String> litr = students.listIterator();
        System.out.println("***** Utilisation de ListIterator *****");
        System.out.println("Parcours ordre croissant : ");
        while (litr.hasNext()) {
            System.out.print(litr.next() + " ");
        }

        System.out.println("\n\nParcours ordre decroissant : ");
        while (litr.hasPrevious())
            System.out.print(litr.previous() + " ");

    }

}
