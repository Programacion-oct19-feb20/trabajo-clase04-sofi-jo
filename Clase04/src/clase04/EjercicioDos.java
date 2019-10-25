/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase04;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class EjercicioDos {
    /*
    Generar un programa que permita pedir datos por teclado para:
    ingreso de nombre
    ingreso de ciudad de nacimiento
    ingreso de edad
    ingreso de costo de matricula
    
    Luego presentar en pantalla los datos de la siguiente forma:
    Datos Personales:
    Nombres:
    Ciudad de Nacimiento:
    Edad:
    Matrícula:
    
    */

  public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      String nombres;
      String ciudadNacimiento;
      int edad;
      double costoMatricula;
      
      System.out.println("Ingrese sus nombres");
      nombres = entrada.nextLine();
      System.out.println("Ingrese su Ciudad de Nacimiento");
      ciudadNacimiento = entrada.nextLine();
      System.out.println("Ingrese su Edad");
      edad = entrada.nextInt();// Ingreso de enteros
      System.out.println("Ingrese su valor de matrícula");
      costoMatricula = entrada.nextDouble(); // Ingreso de decimales
      
      System.out.printf("Datos personales: \nNombres:%s\nCiudad de nacimiento:"
              + " %s\nEdad: %d\nCosto de Matricula: %.2f\n",
              nombres, ciudadNacimiento, edad, costoMatricula); 
// %s es para  cadena, %d para entero, %f decimal 

            
      }
}


