public class pinociclos {
    public static void main(String[] args) {
        int altura=5;
        for (int x = 0; x <= altura; x ++){
            
        
            for (int j = 0; j < altura - x; j ++){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * x + 1) ; k++){
                System.out.print("*");
            }
            System.out.println();
            }
        
        
            for (int x = 1; x <= 3; x ++){
                for (int i = 0; i <= 3; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 3; i++) {
                    System.out.print("*");
                    
                }
                System.out.println();
            }
    }
}