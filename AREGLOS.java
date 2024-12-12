/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4_3101_fp_andres;
import javax.swing.JOptionPane;

public class AREGLOS {
    public static void main(String[] args) {
        // Declaración de materias y encabezados
        String materias[] = {"CALCDIF", "MATEDIS", "FUNDPRO", "FUNDINV", "QUIMICA", "DESSUST"};
        String encabezado[] = {"MATERIA", "U1", "U2", "U3", "U4", "U5", "PROMEDIO"};
        byte calificaciones[][] = new byte[6][5];
        byte x, y;
        double promedios[] = new double[6]; // Arreglo para almacenar promedios por materia
        double promedioGeneral = 0;

        // Ingresar las calificaciones para las materias
        for (x = 0; x < 6; x++) { // Filas
            for (y = 0; y < 5; y++) { // Columnas
                calificaciones[x][y] = Byte.parseByte(JOptionPane.showInputDialog("Ingresa las calificaciones de: " 
                        + materias[x] + " Unidad " + (y + 1)));
            }
        }

        // Calcular los promedios por materia y el promedio general
        for (x = 0; x < 6; x++) {
            int suma = 0;
            for (y = 0; y < 5; y++) {
                suma += calificaciones[x][y];
            }
            promedios[x] = (double) suma / 5; // Promedio de cada materia
            promedioGeneral += promedios[x];  // Acumular para calcular promedio general
        }
        promedioGeneral /= 6; // Dividir entre el número de materias

        // Impresión del encabezado
        for (String titulo : encabezado) {
            System.out.print(titulo + "\t");
        }
        System.out.println();

        // Impresión de calificaciones y promedios por materia
        for (x = 0; x < 6; x++) {
            System.out.print(materias[x] + "\t");
            for (y = 0; y < 5; y++) {
                System.out.print(calificaciones[x][y] + "\t");
            }
            System.out.printf("%.2f\t%n", promedios[x]); // Imprimir promedio de cada materia
        }

        // Imprimir el promedio general
        System.out.printf("Promedio general de todas las materias: %.2f%n", promedioGeneral);
    }
}