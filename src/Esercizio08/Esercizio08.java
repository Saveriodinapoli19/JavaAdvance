package Esercizio08;

import java.util.HashSet;

/*Scrivere una funzione che restituisca un HashSet riempito
Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
Verificare che l' elemento sia parte del Set e stampare il risultato*/
public class Esercizio08 {
    public static void main(String[] args) {
        function();
    }
    public static void function(){
        HashSet<String> index = new HashSet<>();
        index.add("1");
        index.add("2");
        index.add("3");
        String newElement = "1";
        System.out.println("Index = " + index);
        if(index.contains(newElement)){
            System.out.println(newElement + " is contained");
        }else{
            System.out.println(newElement + " is not contained ");
        }

    }
}
