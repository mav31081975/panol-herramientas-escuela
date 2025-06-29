// Clase que representa un usuario del sistema (estudiante o administrador)
public class Usuario implements Registrable {
    private int id;              // Identificador único del usuario
    private String nombre;       // Nombre del usuario
    private String tipo;         // "Estudiante" o "Administrador"

    // Constructor: inicializa el usuario con los datos recibidos
    public Usuario(int id, String nombre, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Métodos getter y setter para acceder y modificar atributos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    // Implementación de la interfaz Registrable
    @Override
    public void registrar() {
        // Lógica para registrar el usuario en la base de datos
        System.out.println("Registrando usuario: " + nombre);
    }

    @Override
    public void modificar() {
        // Lógica para modificar los datos del usuario
        System.out.println("Modificando usuario: " + nombre);
    }

    @Override
    public void eliminar() {
        // Lógica para eliminar el usuario
        System.out.println("Eliminando usuario: " + nombre);
    }
}
