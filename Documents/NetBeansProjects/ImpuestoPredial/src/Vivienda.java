
public class Vivienda {

    String numeroMatricula;
    String direccion;
    String nombrePropietario;
    String apellidoPropietario;
    String barrio;

    //Constructor

    public Vivienda(String numeroMatricula, String direccion, String nombrePropietario, String apellidoPropietario, String barrio) {
        this.numeroMatricula = numeroMatricula;
        this.direccion = direccion;
        this.nombrePropietario = nombrePropietario;
        this.apellidoPropietario = apellidoPropietario;
        this.barrio = barrio;
    }

    // Getters y Setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidoPropietario() {
        return apellidoPropietario;
    }

    public void setApellidoPropietario(String apellidoPropietario) {
        this.apellidoPropietario = apellidoPropietario;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Vivienda{"
                + "numeroMatricula='" + numeroMatricula + '\''
                + ", direccion='" + direccion + '\''
                + ", nombrePropietario='" + nombrePropietario + '\''
                + ", apellidoPropietario='" + apellidoPropietario + '\''
                + ", barrio='" + barrio + '\''
                + '}';
    }
}
