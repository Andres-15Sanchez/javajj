/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class MATERIAS{
    public static void main(String[] ANDRES) {
        //Declaracion de variables
        String materias[]={"FUNINVE", "CALCDIF","QUIMICA","FUNDPRO","MATEDIS", "TUTORIA"};
        String encabezado[]={"Materias","U1","U2","U3","U4","U5","Promedio"};
        byte calificaciones[][]= new byte[7][5]; 
        byte x,y;
        
        for(x=0;x<=5;x++){//FILAS1
                for(y=0;y<5;y++){//COLUMNAS
                   calificaciones[x][y]=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu calficacion de: " 
                           + materias[x] + " Unidad " + (y + 1)));
            }
        }
            //IMPRESION DE CALIFICACIONES
            for(x=0;x<=5;x++){
                System.out.print(encabezado[x] + "\t");
            }
                System.out.println();

                for(x=0;x<=5;x++){
                    System.out.print(materias[x] + "\t");
                    for(y=0;y<5;y++){
                        System.out.print("\t" + calificaciones[x][y]);
                    }
                   System.out.println();
               }
    }
}

