public class Aluno {
    //atributos
    private int matricula;
    private String nome;
    private double mediaFinal;

    //construtor
    public Aluno(int matricula, String nome, double mediaFinal) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
    }

    //metodo aprovacao
    public String verificarAprovacao() {
        if (this.mediaFinal >= 6) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }

    //getters
    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    //setters
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }
}
