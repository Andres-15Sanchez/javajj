
import javax.swing.JOptionPane;

public class ks {

    public static void main(String[] args) {
        // Presupuesto total
        int presupuestoTotal = 189000;

        // Asignación de fondos
        java.util.Map<String, Integer> asignacionFondos = new java.util.HashMap<>();
        asignacionFondos.put("Basquetbol", 9000);
        asignacionFondos.put("Voleibol", 15000);
        asignacionFondos.put("Artes", 50000);
        asignacionFondos.put("Futbol", 15000);
        asignacionFondos.put("Taekwondo", 50000);
        asignacionFondos.put("Ajedrez", 25000);
        asignacionFondos.put("Musica", 12000);
        asignacionFondos.put("Atletismo", 13000);

        // Pedir al usuario el taller y mostrar el monto asignado
        String taller = JOptionPane.showInputDialog("Ingrese el nombre del taller:");
        Integer montoAsignado = asignacionFondos.get(taller);

        if (montoAsignado != null) {
            JOptionPane.showMessageDialog(null, "El monto asignado al taller de " + taller + " es: $" + montoAsignado);
        } else {
            JOptionPane.showMessageDialog(null, "El taller ingresado no se encuentra en la lista.");
        }
    }
}
