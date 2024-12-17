public class apoyo.java {
    public static void main(String[] args) {
        // Monto total del apoyo
        double total = 189000;

        // Identificadores de los talleres (números para evitar Strings)
        int[] talleres = {
            1, // Básquet
            2, // Voleibol
            3, // Artes
            4, // Fútbol
            5, // Taekwondo
            6, // Ajedrez
            7, // Música
            8  // Atletismo
        };

        // Montos asignados a cada taller
        double[] montos = {
            9000,   // Básquet
            15000,  // Voleibol
            50000,  // Artes
            15000,  // Fútbol
            50000,  // Taekwondo
            25000,  // Ajedrez
            12000,  // Música
            13000   // Atletismo
        };

        // Imprimir el identificador del taller, monto asignado y porcentaje
        System.out.printf("%-10s %-10s %-10s%n", "Taller", "Monto", "Porcentaje");
        System.out.println("------------------------------------");

        for (int i = 0; i < talleres.length; i++) {
            double porcentaje = (montos[i] / total) * 100;
            System.out.printf("%-10d %-10.2f %-10.2f%%%n", talleres[i], montos[i], porcentaje);
        }
    }