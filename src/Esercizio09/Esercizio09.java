package Esercizio09;

import java.util.HashSet;
import java.util.Iterator;

/*Scrivere una funzione che restituisca un hashset riempito
Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
Svuotare l'hashset, verificarlo e stampare il risultato*/
public class Esercizio09 {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        HashSet<String> index = new HashSet<>();
        index.add("1");
        index.add("2");
        index.add("3");
        String newElement = "2";
        Iterator<String> iter = index.iterator();
        while (iter.hasNext()) {
            String element = iter.next();
            if (element.equals(newElement)) {
                iter.remove();
                System.out.println(index);
            }
        }
           index.clear();
            if(index.isEmpty()){
                System.out.println("The HashSet is Empty");
            }else{
                System.out.println("The HashSet contains obj");
            }


}

}
