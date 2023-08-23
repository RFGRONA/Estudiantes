/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Estudiante {

    private String nombreComp;
    private String id = "0";
    private double promedio = 0;
    private int edad = 0;
    private double[] calificaciones = new double[3];
    private Estudiante[] arrayEstudiante = new Estudiante[5];
    Scanner scr = new Scanner(System.in);

    public Estudiante(String nombreComp, String id, int edad, double promedio) {
        this.nombreComp = nombreComp;
        this.id = id;
        this.edad = edad;
        this.promedio = promedio;
    }

    Estudiante() {
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public void setNombreComp(String nombreComp) {
        this.nombreComp = nombreComp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(double[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void ingresarCalificaciones() {
        System.out.print("""
                         Materia 1: Matematicas
                         Materia 2: Ciencias
                         Materia 3: Ingles
                         """);

        for (int i = 0; i < 3; i++) {
            System.out.print("Ingrese la calificacion " + (i + 1) + ": ");
            calificaciones[i] = scr.nextDouble();
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < 3; i++) {
            suma += calificaciones[i];
        }
        return suma / 3;
    }

    public double promedio() {
        double promedio = calcularPromedio();
        return promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void arrayEstudiantes(Estudiante temp, int pos) {
        arrayEstudiante[pos] = temp;
    }

    public void ordenEdades() {
        System.out.println("===== ORDENAR POR EDADES =====");
        Estudiante[] ordenEdades = new Estudiante[5];
        ordenEdades = arrayEstudiante.clone();
        Arrays.sort(ordenEdades, Comparator.comparingInt(Estudiante::getEdad));
        mostrarDatosArray(ordenEdades);
    }

    public void ordenPromedio() {
    System.out.println("===== ORDENAR POR PROMEDIO =====");
    Estudiante[] ordenPromedio = arrayEstudiante.clone();
    Arrays.sort(ordenPromedio, Comparator.comparingDouble(Estudiante::getPromedio));
    
    // Algoritmo de ordenamiento burbuja (Bubble Sort)
    int n = ordenPromedio.length;
    boolean swapped;

    for (int i = 0; i < n - 1; i++) {
        swapped = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (ordenPromedio[j].getPromedio() < ordenPromedio[j + 1].getPromedio()) {
                Estudiante temp = ordenPromedio[j];
                ordenPromedio[j] = ordenPromedio[j + 1];
                ordenPromedio[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) {
            break;
        }
    }
    mostrarDatosArray(ordenPromedio);
}

    
    public static void mostrarDatosArray(Estudiante[] estudiantes) {
    for (Estudiante estudiante : estudiantes) {
        System.out.println("Nombre: " + estudiante.nombreComp);
        System.out.println("Edad: " + estudiante.edad);
        System.out.println("Numero de Identificacion: " + estudiante.id);

        for (int i = 0; i < 3; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + estudiante.calificaciones[i]);
        }
        double promedio = estudiante.calcularPromedio();
        System.out.println("Promedio: " + promedio);

        System.out.println(); 
    }
}

}
