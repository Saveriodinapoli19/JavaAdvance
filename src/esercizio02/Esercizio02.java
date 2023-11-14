package esercizio02;
/*Scrivere una funzione che controlli se
un carattere è un numero altrimenti lanciare una eccezione.
 */
public class Esercizio02 {
    public static void main(String[] args) throws Exception {

        Character('E');
    }
public static boolean Character(char finalCharacter) throws Exception {
        if(Character.isDigit(finalCharacter)){
            System.out.println("Is a number");
        }else{
            throw new Exception("Is char");
        }

    return true;
    }

}
