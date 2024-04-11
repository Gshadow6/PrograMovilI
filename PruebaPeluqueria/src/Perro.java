public class Perro {
    private String nombre;
    private boolean pelo;

    public Perro(){
        nombre = "Snoopy";
        pelo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getPelo() {
        return pelo;
    }

    public void setPelo(boolean pelo) {
        this.pelo = pelo;
    }

    @Override
    public String toString() {
        return "Perro [nombre=" + nombre + ", Tiene pelo= " + pelo + "]";
    }
    
}
