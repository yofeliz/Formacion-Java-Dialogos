import javax.swing.*;
import java.util.*;

/**
 * Programa de refresco con Swing y mensajes de diálogo.
 * @author yofeliz
 */
public class Operaciones {
    public static void main(String [] params) {
        ObjetoOperaciones objeto = new ObjetoOperaciones();
        
        objeto.setNombre(JOptionPane.showInputDialog(null, "Introduzca el nombre:"));
        objeto.setApellido(JOptionPane.showInputDialog(null, "Introduzca el apellido:"));
        objeto.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la edad:")));
        objeto.setDNI(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el DNI sin letra:")));
        
        JOptionPane.showMessageDialog(null, "Nombre: " + objeto.getNombre() + "\nApellido: " + objeto.getApellido() + "\nEdad: " + objeto.getEdad() + "\nDNI: " + objeto.getDNI() + "-" + objeto.getLetraDNI(objeto.getDNI()));
        
        Scanner scan = new Scanner(System.in);
        
        scan.next();
    }
}
