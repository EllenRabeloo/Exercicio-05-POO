public class Elevador {
    //atributos
    private int andarAtual;
    private int totalAndares;
    private int capacidadeElevador;
    private int pessoasPresentes;

    //metodo para inicializar
    public void inicializar(int capacidadeElevador, int totalAndares) {
        this.andarAtual = 0;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.pessoasPresentes = 0;
    }

    //metodo para entrar
    public void entrar() {
        if (this.pessoasPresentes < capacidadeElevador) {
            this.pessoasPresentes++;
        } else {
            System.out.println("O elevador já se encontra com lotação máxima!");
        }
    }

    //metodo para sair
    public void sair() {
        if (this.pessoasPresentes > 0) {
            this.pessoasPresentes--;
        } else {
            System.out.println("O elevador já se encontra vazio!");
        }
    }

    //metodo para subir
    public void subir() {
        if (this.andarAtual < totalAndares) {
            andarAtual++;
        } else {
            System.out.println("O elevador já se encontra no último andar!");
        }
    }

    //metodo para descer
    public void descer() {
        if (this.andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("O elevador já se encontra no térreo!");
        }
    }

    //getters
    public int getAndarAtual() {
        return andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public int getCapacidadeElevador() {
        return capacidadeElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    //setters
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public void setCapacidadeElevador(int capacidadeElevador) {
        this.capacidadeElevador = capacidadeElevador;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
}
