//Scrivi un programma che contiene un metodo che che confronti due numeri interi e determini se sono diversi.
//Il programma dovrà stampare a video i due valori e il risultato dell'eguaglianza.

public class MyClass {
    public static void main(String args[]) {
        int num1 = 10;
        int num2 = 20;
        System.out.println(num1 + " and "+ num2 + " are different? "+ compare(num1,num2));

    }
      static boolean compare(int a, int b){
        return (a != b);
      }
}