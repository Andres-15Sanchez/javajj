import javax.swing.JOptionPane;
public class mm {
    public static void main(String[] ANDRES) {
        //declaracion de variables
        byte opcion;
        double h;
        double base;
        double radio;
        double AREA;
        AREA = 0.0 ;
        opcion = Byte.parseByte(JOptionPane.showInputDialog("MENU DE OPCIONES \n 1° TRIANGULO"
                + "\n 2° RECTANGULO \n 3° CIRCULO \n"
                + "ESCRIBE EL NUMERO DE TU ELECCION" )); 
        switch(opcion){
            case 1:
                h = Short.parseShort(JOptionPane.showInputDialog("Ingrese la altura"));
                base = Short.parseShort(JOptionPane.showInputDialog("Ingrese la base")); 
                AREA=( base * h ) / 2;
                break;
            case 2:
                h = Short.parseShort(JOptionPane.showInputDialog("Ingrese la altura"));
                base = Short.parseShort(JOptionPane.showInputDialog("Ingrese la base"));
                AREA = base * h ;
                break;
            case 3:
                h = Short.parseShort(JOptionPane.showInputDialog("Ingrese la altura"));
                radio = Short.parseShort(JOptionPane.showInputDialog("Ingrese radio")); 
                AREA = (2 * Math.PI * radio * h);
                break;
            default:JOptionPane.showMessageDialog(null,"Solo puedes seleccionar 1,2 0 3 \n Intente denuevo");
        }
        JOptionPane.showMessageDialog(null,"El area dela figura es:  " + AREA);
    }//Cierra el metodo MAIN
// Cierrra la CLASE
}