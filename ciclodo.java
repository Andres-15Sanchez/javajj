/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.JOptionPane;
/**
 *
 * @author Andres
 */
public class ciclodo {
    public static void main(String[] args) {
        float estatura ;
        float imc;
        short peso;
        int resp;
        do{
            peso = Short.parseShort (JOptionPane.showInputDialog("Ingresa tu peso"));
            estatura = Float.parseFloat (JOptionPane.showInputDialog("Ingresa tu altura en formato de  metros"));
            imc = (Float) (peso /(estatura * estatura)) ;
            if(imc < 18.49){
                JOptionPane.showMessageDialog(null,"Peso bajo");
            }else if( imc >= 18.50 && imc <= 24.99) {
               JOptionPane.showMessageDialog(null,"Peso Normal"); 
            }else if (imc >=25 && imc <=29.99){
                JOptionPane.showMessageDialog(null,"Sobrepeso");
            }else if(imc>= 30 && imc <= 34.99){
                JOptionPane.showMessageDialog(null,"Sobrepeso Level");
            }else if (imc >= 35 && imc <= 39.99){
                JOptionPane.showMessageDialog(null,"Obesidad Mediana");
            }else if (imc >= 40){
                JOptionPane.showMessageDialog(null,"Obesidad Morbida");
            }
            resp= Byte.parseByte(JOptionPane.showInputDialog("Ingrese 1 si desea hacer otro calculo"));
        }while (resp==1);
    }
}
