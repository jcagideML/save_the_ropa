public class Prenda {
    private String marca;
    private String modelo;

    public Prenda(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
