package Esercizio05;
/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice
dove si cattura l'eventuale eccezione.*/
public class Esercizio05 {
    public static void main(String[] args) {
        try {
            Integer number = 5;
            Integer denominator= null;
            nullability(number,denominator);
        }catch(Exception e){
            throw new ArithmeticException("Error");
        }
    }
    public static boolean nullability(Integer number, Integer denominator){
        if (number == null || denominator == null) {
            System.out.println("Number or denominator must be specified");
        } else{
            int result = number / denominator;
            System.out.println(result);

        }


        return false;
    }

}
