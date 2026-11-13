public class ContaBancaria {
    //atributos
    private String numero;
    private String titular;
    private double saldo;

    //construtor
    public ContaBancaria(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0.0;
    }

    //metodo deposito
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito concluído!");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    //metodo sacar
    public void sacar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque concluído!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    //getters
    public String getNumero() {
        return this.numero;
    }

    public String getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //setters
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
