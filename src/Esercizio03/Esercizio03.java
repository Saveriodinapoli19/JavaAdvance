package Esercizio03;
/*Scrivere una funzione che provi a dividere un numero
per 0 e catturi l'eccezione leggendone il messaggio.
 */
public class Esercizio03 {
    public static void main(String[] args) throws Exception {
        division(5, 0);
    }

    public static boolean division(int number, int divisor) throws Exception {
        try {
            int result = number / divisor;
            if (divisor != 0) {
                System.out.println(result);
            }
        }catch (ArithmeticException e){
            throw new ArithmeticException("The number : " + number + " is not divisible by zero");
        }
        return false;
    }
}