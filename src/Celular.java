public class Celular {
    private String marca;
    private String modelo;
    private double preco;
    private int armazenamento;

    //construtor
    public Celular(String marca, String modelo, double preco, int armazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.armazenamento = armazenamento;
    }

    //metodo resumo
    public void exibirResumo() {
        System.out.println("----- RESUMO DO CELULAR -----");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço: R$ " + this.preco);
        System.out.println("Armazenamento: " + this.armazenamento + " GB");
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    // setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setArmazenamento(int armazenamento) {
        this.armazenamento = armazenamento;
    }
}
