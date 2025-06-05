public class Prestamo {
    private int id;
    private int idHerramienta;
    private int idUsuario;

    public Prestamo(int id, int idHerramienta, int idUsuario) {
        this.id = id;
        this.idHerramienta = idHerramienta;
        this.idUsuario = idUsuario;
    }

    // Getters y setters
    public int getId() { return id; }
    public int getIdHerramienta() { return idHerramienta; }
    public int getIdUsuario() { return idUsuario; }
}
