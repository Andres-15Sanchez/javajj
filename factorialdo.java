public class DOWHILEfactorial{
    public static void main(String[] args) {
        short num;
        double fact = 1;
        int x = 2;
        byte resp =1;
        do{
            num = (Short)Short.parseShort(JOptionPane.showInputDialog("Ingresa un numero"));
            for( x = num; x>=1 ; x--){
                fact = fact * x ;
            }
            System.out.print("El factorial del numero" + num + " es "+ fact);
            resp = (Byte)Byte.parseByte(JOptionPane.showInputDialog("Ingresa el numero 1 si deseas otro calculo"));
        }while(resp==1);
    }
}