/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package u4_3101_fp_andres;
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class multiplicaciondearreglos{
    public static void main(String[] ANDRES) {
        
        short multi[][] = new short [3][3];
        byte t1[][]= new byte [3][3];
        byte t2[][]= new byte [3][3]; 
        
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1.length ; j++) {
                t1[i][j] = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa los numeros de la tabla 1 del 1 al 9"));
            }
            for (int p = 0; p < t2.length; p++) {
                t2[i][p]=Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa los numeros de la tabla 2 del 1 al 9 "));
            }
        }
        
        
        for (int i = 0; i < t1.length; i++) {
            for (int j = 0; j < t1.length; j++) {
                System.out.print(t1[i][j] + "\t");
            }
            System.out.print("\t\t");
            for (int j = 0; j <t2.length; j++) {
                System.out.print(t2[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}
