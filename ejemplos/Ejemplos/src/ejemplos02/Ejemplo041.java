/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos02;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    public static void main(String[] args) {
        // Declaración  de variables y arreglos
        int[][] primeraMatriz = {{1, 2, 3}, {3, 2, 4}, {2, 6, 2}};
        int[][] segundaMatriz = {{1, 2, 3}, {2, 2, 2}, {3, 1, 2}};
        int[][] matrizResultado = new int[3][3];

        int valorPrimero = 0;
        int valorSegundo = 0;

        // for para recorrer cada arreglo y asignar un valor a cada posision 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                valorPrimero = primeraMatriz[i][j];
                valorSegundo = segundaMatriz[i][j];
                matrizResultado[i][j] = multiplicarValores(valorPrimero, valorSegundo);
            }
        }

        // Presentación de los arreglos 
        System.out.println("Primera");
        presentarMatriz(primeraMatriz);

        System.out.println("Segunda");
        presentarMatriz(segundaMatriz);

        System.out.println("RESULTADO");
        presentarMatriz(matrizResultado);
    }

// Función para multiplicar valores
    public static int multiplicarValores(int a, int b) {
        int resultadoM;
        resultadoM = a * b;
        return resultadoM;
    }

// Función para presentar matrices
    public static void presentarMatriz(int matriz[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf(matriz[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.println("\n");
    }
}
