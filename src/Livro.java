public class Livro {
    //atributos
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = true;
    }

    //metodo emprestimo
    public void emprestar() {
        if (this.disponivel) {
            this.disponivel = false;
            System.out.println("Empréstimo do livro " + this.titulo + ", realizado com sucesso!");
        } else {
            System.out.println("O livro " + this.titulo + ", já se encontra emprestado!");
        }
    }

    //metodo devolucao
    public void devolver() {
        if (!this.disponivel) {
            this.disponivel = true;
            System.out.println("Devolução do livro " + this.titulo + ", realizada com sucesso!");
        } else {
            System.out.println("O livro " + this.titulo + ", já se encontra na biblioteca!");
        }
    }

    //getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    //setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}

