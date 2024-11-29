
import javax.swing.JOptionPane;

public class newclass{
    public static void main(String[] args) {
        int resultado;
        short ask;
        byte k = 0;
        do{
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero que desa saber si es par o inpar"));
            resultado=(int) (numero%2);
            if (resultado==0){
                System.out.println("\n Es numero par");
                ask = (short)(numero/2);
                for (int x=1;x<=ask;x++){
                    System.out.printf("*");
                }
                System.out.printf(" ");
            }
            else{
                System.out.println("\n El numero es impar");
            }
            k++;
        }while(k<=10);
    }
}