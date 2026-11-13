public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;

    //construtor
    public Carro(String marca, String modelo, int ano, int velocidadeAtual) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        if (velocidadeAtual >= 0) {
            this.velocidadeAtual = velocidadeAtual;
        } else {
            this.velocidadeAtual = 0;
            System.out.println("Velocidade inválida! Definida como 0.");
        }
    }

    //metodo aceleracao
    public void acelerar(int km) {
        if (km > 0) {
            this.velocidadeAtual += km;
        } else {
            System.out.println("Aceleração indisponível!");
        }
    }

    //metodo frenagem
    public void frear(int km) {
        if (this.velocidadeAtual - km >= 0) {
            this.velocidadeAtual -= km;
        } else {
            System.out.println("Frenagem indisponível!");
        }
    }

    //getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    //setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

}
