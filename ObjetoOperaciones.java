/**
 * Clase de operaciones.
 * @author yofeliz
 */
public class ObjetoOperaciones {
    private String nombre   = "";
    private String apellido = "";
    private int    edad     = 0;
    private int dni      = 0;
    
    public void setNombre(String argNombre) {
        if(argNombre != "") {
            nombre = argNombre;
        } else {
            nombre = "";
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setApellido(String argApellido) {
        if(argApellido != "") {
            apellido = argApellido;
        } else {
            apellido = "";
        }
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setEdad(int argEdad) {
        if(argEdad>0 && argEdad<150) {
            edad = argEdad;
        } else {
            edad = 0;
        }
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setDNI(int argDNI) {
        if(argDNI>0) {
            dni = argDNI;
        } else {
            dni = 0;
        }
    }
    
    public int getDNI() {
        return dni;
    }
    
    public char getLetraDNI(int dni) {
        char[] arrayLetras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
        return arrayLetras[dni % 23];
    }
}
