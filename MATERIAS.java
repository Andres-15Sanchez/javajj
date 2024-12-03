
public class MATERIAS {
    public static void main(String[] args) {

         int [] unidad = {
                    1,
                    2,
                    3,
                    4,
                    5
                };
         
         System.out.printf("Materias   %4d    %4d    %4d    %4d    %4d" , unidad [0],unidad [1],unidad [2],unidad [3],unidad[4]);
         
         String [] materias = {
                  "FUNINVE",
                  "CALCDIF",
                  "QUIMICA",
                  "FUNDPRO",
                  "MATEDIS",
                  "TUTORIA",
                  "DESUSTA",
                };
         
        System.out.println("\n"+ materias[0] + "\n" + materias [1] + "\n" + materias [2] + "\n" + materias [3] + "\n"
                + materias [4] + "\n" + materias [5]); 
        
         int [][] calificaciones = {
            { 85,95,100,70,75},
            { 100,85,89,96,83},
            {}
    };
         
    System.out.printf("%2d" + calificaciones [0][1]+  calificaciones [0][2]);     
    
    }
}
