public class Usuario {
    private int id;
    private String nombre;
    private String tipo; // "Estudiante" o "Administrador"

    public Usuario(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y setters
    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
}
