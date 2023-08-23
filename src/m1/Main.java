/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package m1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante[] est = new Estudiante[5];
        Estudiante es = new Estudiante();
        Scanner scr = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.print("Ingrese el nombre completo del estudiante " + (i + 1) + ": ");
            String nombre = scr.nextLine();

            System.out.print("Ingrese la edad del estudiante " + (i + 1) + ": ");
            int edad = Integer.parseInt(scr.nextLine());

            System.out.print("Ingrese el numero de identificacion del estudiante " + (i + 1) + ": ");
            String id = scr.nextLine();

            est[i] = new Estudiante(nombre, id, edad, 0);
            est[i].ingresarCalificaciones();
            double promedio = est[i].promedio();
            est[i].setPromedio(promedio);
            es.arrayEstudiantes(est[i], i);
            System.out.println("");
        }
        
        es.ordenEdades();
        es.ordenPromedio();
    }
}
