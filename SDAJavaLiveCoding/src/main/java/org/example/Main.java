package org.example;

import org.example.calculator.Calculator;
import org.example.person.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("INtroduceti primul numar:");
        int a= sc.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b= sc.nextInt();
        Calculator c= new Calculator();

        Integer sum= c.adunare(a,b);
        System.out.println("SUma="+sum);

        System.out.println("INtroduceti primul numar:");
        int a1= sc.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b1= sc.nextInt();
        Calculator c1= new Calculator();

        Integer scadere= c1.scadere(a1,b1);
        System.out.println("SUma="+scadere);

        System.out.println("INtroduceti primul numar:");
        int a2= sc.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b2= sc.nextInt();
        Calculator c2= new Calculator();

        Integer inmultire= c2.inmultire(a2,b2);
        System.out.println("SUma="+inmultire);

        System.out.println("INtroduceti primul numar:");
        int a3= sc.nextInt();
        System.out.println("Introduceti al doilea numar");
        int b3= sc.nextInt();
        Calculator c3= new Calculator();

        Integer impartire= c3.impartire(a3,b3);
        System.out.println("SUma="+impartire);

        Person person = new Person("Andrei, ", "andrei@yahoo.com", "2870418125899");
        System.out.println(person);
    }
}