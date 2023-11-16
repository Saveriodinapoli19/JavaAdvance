package Esercizio06;
/*Scrivere una funzione che accetti in input 2 int e ne stampi la somma
Scrivere una funzione che accetti in input 1 char lo stampi
Scrivere una funzione che accetti in input 2 Integer e ne stampi la somma
Scrivere una funzione che accetti in input 1 Character lo stampi
Scrivere un un valore primitivo per int, double e char e fare autoboxing
Scrivere un oggetto per Integer, Double e Character e fare Unboxing*/

public class Esercizio06 {
    public static void main(String[] args) {
        sumOfInt();
        chacharInput();
        integerInput();
        characterInput();
        valuePrimitive();
        valueObj();

    }

    public static void sumOfInt(){
        int number1 = 5;
        int number2 = 5;
        int sum = number1 + number2;
        System.out.println("The sum int is = " + sum);
    }
    public static void chacharInput() {
        char ch = 'S';
        System.out.println("The char is = " + ch);
    }
    public static void integerInput(){
        Integer number1 = 10;
        Integer number2 = 10;
        Integer sum = number1 + number2;
        System.out.println("The sum Integer is = " + sum);
    }
    public static void characterInput(){
      Character ch = 'M';
        System.out.println("The Character is = " + ch);
    }
    public static void valuePrimitive(){
        Integer number1= Integer.valueOf(40);
        Double numberDouble = Double.valueOf(3.556);
        Character ch1 = Character.valueOf('S') ;
        System.out.println("The value of primitive to object in Integer is = " + number1);
        System.out.println("The value of primitive to object in Double is = " + numberDouble);
        System.out.println("The value of primitive to object in Character is = " + ch1);
    }
    public static void valueObj(){
        Integer number = 10;
        int numInt = number;
        Double number1 = 3.4;
        double numDouble = number1;
        Character ch = 'M';
        char character = ch;
        System.out.println("The value of object to primitive in Integer is = " + numInt);
        System.out.println("The value of object to primitive in Double is = " + numDouble );
        System.out.println("The value of object to primitive in Character is = " + character );



    }




}
