
package com.mycompany.reto2;

import java.util.Scanner;


public class Reto2 {

    public static void main(String[] args) {
        
        String opcion;
        Scanner entrada = new Scanner(System.in);
        
        ciclo: while (true){
            System.out.println("¿Qué desea realizar?: \n1.Calcular cuadrados. \n2.Suma de números primos. \n3.Desarrollo posibles de bicicleta. \n4.Salir. ");
            opcion = entrada.nextLine();
            
            switch (opcion) {
                case "1" :
                    System.out.println("Calcular cuadrados.");
                    int cantidadNumeros;
                    Scanner scanner = new Scanner(System.in);
                    
                    System.out.print("Ingrese los N numeros a obtener su cuadrado: ");
                    cantidadNumeros = scanner.nextInt();
                    
                    for(int i = 1; i <= cantidadNumeros; i++){
                        int cuadrado = 0;
                        int sumador = 1;
                        for( int j = 1; j <= i; j++){
                            cuadrado += sumador;
                            sumador +=2;
                        }
                        System.out.println(cuadrado);
                    }
                    break;
                case "2":
                    System.out.println("Suma de números primos");
                    int cantidad;
                    Scanner leer = new Scanner(System.in);
                    
                    System.out.println("Ingrese el valor deseado: ");
                    cantidad = leer.nextInt();
                    
                    break;
                case "3":
                    System.out.println("Ejercicio #3");
                    break;
                case "4" :
                    break ciclo;
                default :
                    break;
            }
        }
        
    }
}
