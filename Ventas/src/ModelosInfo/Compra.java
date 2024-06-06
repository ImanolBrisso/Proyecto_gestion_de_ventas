package ModelosInfo;

public class Compra {
    private int id;
    private int usuarioId;
    private int entradaId;
    private String fechaCompra;

    // Constructor
    public Compra(int id, int usuarioId, int entradaId, String fechaCompra) {
        this.id = id;
        this.usuarioId = usuarioId;
        this.entradaId = entradaId;
        this.fechaCompra = fechaCompra;
    }

    // Se generan los Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getUsuarioId() { return usuarioId; }
    public void setUsuarioId(int usuarioId) { this.usuarioId = usuarioId; }
    public int getEntradaId() { return entradaId; }
    public void setEntradaId(int entradaId) { this.entradaId = entradaId; }
    public String getFechaCompra() { return fechaCompra; }
    public void setFechaCompra(String fechaCompra) { this.fechaCompra = fechaCompra; }
}
