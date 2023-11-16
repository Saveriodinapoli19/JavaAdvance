package Esercizio05;
/*Scrivere una funzione che accetti in input un numeratore e un denominatore
Controlli che il numeratore e il denominatore non siano null
Usare la funzione appena scritta in due blocchi di codice
dove si cattura l'eventuale eccezione.*/
public class Esercizio05 {
    public static void main(String[] args) {
        Nullability(null,2);
    }
    public static boolean Nullability(Integer number, Integer denominator){
        try {
            if (number == null || denominator == null) {
                System.out.println("Number or denominator must be specified");
            } else{
                int result = number / denominator;
                System.out.println(result);

            }

        }catch(Exception e){
            throw new ArithmeticException("Error");
        }

//non so se è fatto bene e se ho seguito la traccia, ma vorrei sapere se il modo usato è corretto.

        return false;
    }

}
