// Clase que representa una herramienta del pañol
public class Herramienta implements Registrable {
    private int id;                 // Identificador único de la herramienta
    private String nombre;          // Nombre de la herramienta
    private String categoria;       // Categoría de la herramienta
    private String estado;          // Estado actual ('Disponible', 'En reparación', etc.)

    // Constructor: inicializa la herramienta con los datos recibidos
    public Herramienta(int id, String nombre, String categoria) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.estado = "Disponible"; // Por defecto, nueva herramienta disponible
    }

    // Métodos getter y setter para acceder y modificar atributos
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Implementación de la interfaz Registrable
    @Override
    public void registrar() {
        // Aquí iría la lógica para registrar la herramienta en la base de datos
        System.out.println("Registrando herramienta: " + nombre);
        // Por ejemplo, podrías invocar un método de conexión a la BD y ejecutar un INSERT.
    }

    @Override
    public void modificar() {
        // Lógica para modificar la herramienta en la base de datos
        System.out.println("Modificando herramienta: " + nombre);
    }

    @Override
    public void eliminar() {
        // Lógica para eliminar la herramienta en la base de datos
        System.out.println("Eliminando herramienta: " + nombre);
    }
}

