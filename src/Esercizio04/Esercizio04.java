package Esercizio04;
/*Scrivere una funzione che accetti un array in input e provi a
dividere un numero dell'array per 0 e gestista sia l'eccezione
della divisione che quella di indice non presente nell'array, leggendone il messaggio.
Eseguire sempre un blocco di codice scrivendo un messaggio in console.*/
public class Esercizio04 {
    public static void main(String[] args) {
        int[] arrayNumber = {1,2,3,4};
        divideArray(arrayNumber);
    }
    public static void divideArray(int[] arrayNumber){
        try{
            int index = 5;
            int number = arrayNumber[index];
            int result = number / 0;
            System.out.println("The result of division is = " + result);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        } catch (Exception e){
            System.out.println("The number is not divide by zero");
        }
    }

}
