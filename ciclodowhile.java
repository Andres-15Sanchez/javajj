/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class ciclowhile {
    public static void main(String[] args) {
        float altura, imc;
        short peso;
        int resp=1;
        while(resp == 1 ){
           peso= Short.parseShort(JOptionPane.showInputDialog("Ingresa tu peso"));
           altura = Float.parseFloat (JOptionPane.showInputDialog("Ingresa tu altura en formato de  metros"));
            imc = (Float) (peso /(altura * altura)) ;
            if(imc < 18.49){
                vjgghdfhdf
                JOptionPane.showMessageDialog(null,"Peso bajo");
            }else if( imc >= 18.50 && imc <= 24.99) {
               JOptionPane.showMessageDialog(null,"Peso Normal"); 
            }else if (imc >=25 && imc <=29.99){
                hjhkhk
                JOptionPane.showMessageDialog(null,"Sobrepeso");
            }else if(imc>= 30 && imc <= 34.99){
                JOptionPane.showMessageDialog(null,"Sobrepeso Level");
            }else if (imc >= 35 && imc <= 39.99){
                JOptionPane.showMessageDialog(null,"Obesidad Mediana");
            }else if (imc >= 40){
                JOptionPane.showMessageDialog(null,"Obesidad Morbida");
            }
            resp= Byte.parseByte(JOptionPane.showInputDialog("Ingrese 1 si desea hacer otro calculo"));
        }
    }
}
