package model;

@Entity
@Table(name = "servicio")

public class servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productoId;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "precio")
    private double precio;

    @Column(name = "existencia")
    private int existencia;

    @Column(name = "tipoId")
    private int tipoId;

    public Producto() {
    }

    public int getTipoId() {
        return tipoId;
    }

    public void setTipoId(int tipoId) {
        this.tipoId = tipoId;
    }

    public Producto(int productoId, String nombre, double precio, int existencia) {
        this.productoId = productoId;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public int getProductoId() {
        return productoId;
    }

    public void setProductoId(int productoId) {
        this.productoId = productoId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }


}
