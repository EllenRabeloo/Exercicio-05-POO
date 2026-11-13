public class Fatura {
    //atributos
    String numero;
    String descricao;
    int quantidade;
    double preco;

    //metodo para inicializar
    public void inicializar(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;

        //validacao quantidade
        if (quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }

        //validaçao preço
        if (preco > 0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }


    }

    //metodo para calcular o total
    public double calcular_valor_fatura() {
        return this.quantidade * this.preco;
    }
}
