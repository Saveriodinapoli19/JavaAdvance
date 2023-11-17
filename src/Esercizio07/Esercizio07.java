package Esercizio07;


import java.util.HashSet;
import java.util.Iterator;


/*Scrivere una funzione che restituisca un hashset riempito
Leggere l'hashSet e stampre grandezza ed elementi*/
public class Esercizio07 {
    public static void main(String[] args) {
      function();

    }
    public static void function() {
        HashSet<String> index = new HashSet<>();
        index.add("1");
        index.add("2");
        index.add("3");
        System.out.println("Index : " + index);
        System.out.println("Index size = " + index.size());
        Iterator<String> iterator = index.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();

            System.out.println("Element = " + element);
        }
    }
}
