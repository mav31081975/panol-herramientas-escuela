// Clase que representa un préstamo de una herramienta en el sistema
public class Prestamo implements Registrable {
    private int id;               // Identificador único del préstamo
    private int idHerramienta;    // ID de la herramienta prestada
    private int idUsuario;        // ID del usuario que solicita el préstamo

    // Constructor: inicializa el préstamo con los datos recibidos
    public Prestamo(int id, int idHerramienta, int idUsuario) {
        this.id = id;
        this.idHerramienta = idHerramienta;
        this.idUsuario = idUsuario;
    }

    // Métodos getter y setter para acceder a los atributos
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getIdHerramienta() { return idHerramienta; }
    public void setIdHerramienta(int idHerramienta) { this.idHerramienta = idHerramienta; }
    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    // Implementación de la interfaz Registrable
    @Override
    public void registrar() {
        // Lógica para registrar el préstamo en la base de datos
        System.out.println("Registrando préstamo: herramienta " + idHerramienta + " para usuario " + idUsuario);
    }

    @Override
    public void modificar() {
        // Lógica para modificar los datos del préstamo
        System.out.println("Modificando préstamo: " + id);
    }

    @Override
    public void eliminar() {
        // Lógica para eliminar el préstamo
        System.out.println("Eliminando préstamo: " + id);
    }
}
