package com.mycompany.reto2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reto2 {

    public static void main(String[] args) {

        String opcion;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Hola mundo");

        ciclo:
        while (true) {
            System.out.println("¿Qué desea realizar?: \n1.Calcular cuadrados. \n2.Suma de números primos. \n3.Desarrollo posibles de bicicleta. \n4.Salir. ");
            opcion = entrada.nextLine();

            switch (opcion) {
                case "1":
                    ejercicio1();
                    break;
                case "2":
                    ejercicio2();
                    break;
                case "3":
                    ejercicio3();
                    break;
                case "4":
                    break ciclo;
                default:
                    break;
            }
        }

    }

    public static void ejercicio1() {
        System.out.println("Calcular cuadrados.");
        int cantidadNumeros;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese los N numeros a obtener su cuadrado: ");
        cantidadNumeros = scanner.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++) {
            int cuadrado = 0;
            int sumador = 1;
            String stringSuma = i + " = 1";
            for (int j = 1; j <= i; j++) {
                cuadrado += sumador;
                stringSuma += sumador == 1 ? "" : " + " + sumador;
                sumador += 2;
            }
            stringSuma += " = " + cuadrado;
            System.out.println(stringSuma);
        }
    }

    public static void ejercicio2() {
        System.out.println("Ingrese el valor deseado: ");
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();

        int contador = 0;
        ArrayList<Integer> numerosPrimos = new ArrayList<Integer>();
        boolean esPrimo;

        for (int num = 2; contador < cantidad; num++) {

            esPrimo = true;

            for (int n = 2; n < num; n++) {
                if (num % n == 0) {
                    esPrimo = false;
                }
            }

            if (esPrimo == true) {
                numerosPrimos.add(num);
                contador++;
            }
        }

        System.out.println("Los " + cantidad + " primeros numeros primos son: ");
        for (int i = 0; i < numerosPrimos.size(); i++) {
            System.out.println("- " + numerosPrimos.get(i));
        }

        int suma = 0;
        for (int i = 0; i < numerosPrimos.size(); i++) {
            suma += numerosPrimos.get(i);
        }
        System.out.println("La suma de los " + cantidad + " primeros numeros primos es: " + suma);
    }
    
    public static void ejercicio3(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el numero de dientes del plato 1");
        int dientesPlato1 = scanner.nextInt();
        System.out.println("Ingrese el numero de dientes del plato 2");
        int dientesPlato2 = scanner.nextInt();
        
        int[] dientesPinones = new int[12];
        
        for (int i = 0; i < dientesPinones.length; i++) {
            while(true) {
                System.out.println("Ingrese el número de dientes del piñón " + (i + 1));
                dientesPinones[i] = scanner.nextInt();
                
                if(dientesPinones[i] != 0) break;
                System.out.println("Valor inválido, debe ser diferente de 0");
            }
        }
        
        System.out.println("Ingrese las dimensiones de la llanta");
        System.out.println("Digíte 1 para 29x2.1");
        System.out.println("Digíte 2 para 29x2.2");
        System.out.println("Digíte 3 para 29x2.3");
        int dimensionesLlanta = scanner.nextInt();
        double circunferenciaLlanta = 0;
        
        switch(dimensionesLlanta) {
            case 1:
                circunferenciaLlanta = 2.288;
                break;
            case 2:
                circunferenciaLlanta = 2.298;
                break;
            case 3:
                circunferenciaLlanta = 2.326;
                break;
        }
        
        double[] desarrollosPlato1 = new double[12];
        double[] desarrollosPlato2 = new double[12];
        
        for (int i = 0; i < dientesPinones.length; i++) {
            desarrollosPlato1[i] = (dientesPlato1/dientesPinones[i]) * circunferenciaLlanta;
            desarrollosPlato2[i] = (dientesPlato2/dientesPinones[i]) * circunferenciaLlanta;
        }
        
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < desarrollosPlato1.length; i++) {
            if(dientesPlato1 == 0) break;
            System.out.println("Los desarrollos en metros para el plato 1 con el piñón de " + dientesPinones[i] + " dientes es: " + desarrollosPlato1[i] + "mts");
        }
        
        System.out.println("--------------------------------------------------------");
        
        for (int i = 0; i < desarrollosPlato1.length; i++) {
            if(dientesPlato2 == 0) break;
            System.out.println("Los desarrollos en metros para el plato 2 con el piñón de " + dientesPinones[i] + " dientes es: " + desarrollosPlato2[i] + "mts");
        }
    }
}