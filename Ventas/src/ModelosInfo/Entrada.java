package ModelosInfo;

public class Entrada {
    private int id;
    private String partido;
    private String fecha;
    private double precio;
    private boolean disponibilidad;

    // Se ingresa el constructor
    public Entrada(int id, String partido, String fecha, double precio, boolean disponibilidad) {
        this.id = id;
        this.partido = partido;
        this.fecha = fecha;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }

    // Se generan los getters y setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getPartido() { return partido; }
    public void setPartido(String partido) { this.partido = partido; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public boolean isDisponibilidad() { return disponibilidad; }
    public void setDisponibilidad(boolean disponibilidad) { this.disponibilidad = disponibilidad; }
}

