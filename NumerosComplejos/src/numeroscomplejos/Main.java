/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroscomplejos;

import java.util.Scanner;

/**
 *
 * @author Usuario Dennis
 */
public class Main {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Complejos numero1 = new Complejos();
        Complejos numero2 = new Complejos();
        int menu = 0;

        System.out.println("....................................");
        System.out.println("Ingrese el primer numero Complejo");
        System.out.println("Ingrese la parte real");
        numero1.setReal(teclado.nextInt());
        System.out.println("Ingrese la parte imaginaria");
        numero1.setImagnaria(teclado.nextInt());
        System.out.println("....................................");
        System.out.println("Ingrese el Segundo numero Complejo");
        System.out.println("Ingrese la parte real");
        numero2.setReal(teclado.nextInt());
        System.out.println("Ingrese la parte imaginaria");
        numero2.setImagnaria(teclado.nextInt());
        System.out.println("....................................");

        while (menu != 3) {
            System.out.println("Menu");
            System.out.println("<<<<<<>>>>>>");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.println("<<<<<<>>>>>>");
            System.out.println("Ingrese su opción");
            menu = teclado.nextInt();

            switch (menu) {

                case 1:
                    Operaciones opera = new Operaciones(numero1, numero2);
                    opera.Sumar();
                    opera.Imprimir();
                    break;
                case 2:
                    Operaciones opera1 = new Operaciones(numero1, numero2);
                    opera1.Restar();
                    opera1.Imprimir();
                    break;
                case 3:
                    System.out.println("<<Gracias>>");
                    break;

                default:
            }
        }
    }
}
