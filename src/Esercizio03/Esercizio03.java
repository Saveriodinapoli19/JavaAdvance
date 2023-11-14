package Esercizio03;
/*Scrivere una funzione che provi a dividere un numero
per 0 e catturi l'eccezione leggendone il messaggio.
 */
public class Esercizio03 {
    public static void main(String[] args) throws Exception {
        division(5, 0);
    }

    public static boolean division(int number, int divisor) throws Exception {

        if (divisor != 0) {
           int result = number / divisor;
            throw new ArithmeticException("result");

        } else {
            System.out.println("The number : " + number + " is not divisible by zero");
        }
        return false;
    }

}