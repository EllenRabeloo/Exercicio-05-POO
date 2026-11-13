public class Retangulo {
    //atributos
    double largura;
    double altura;

    //construtor
    public Retangulo(double largura, double altura) {
        if (largura > 0 && altura > 0) {
            this.largura = largura;
            this.altura = altura;
        } else {
            System.out.println("Valores inválidos! Devem ser maiores que zero.");
            this.largura = 0.0;
            this.altura = 0.0;
        }
    }

    //metodo area
    public double calcularArea () {
        return this.largura * this.altura;
    }

    //metodo perimetro
    public double calcularPerimetro () {
        return (2 * this.altura) + (2 * this.largura);
    }
}
