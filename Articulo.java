package EjercicioBodega;

public class Articulo {
    private Integer id;
    private String nombre;
    private String codigoBarras;
    private Double precio;
    private Integer existencia;

    public Articulo() {
    }

    public Articulo(Integer id, String codigoBarras, String nombre, Integer existencia,   Double precio) {
        this.codigoBarras = codigoBarras;
        this.existencia = existencia;
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getExistencia() {
        return existencia;
    }

    public void setExistencia(Integer existencia) {
        this.existencia = existencia;
    }


}