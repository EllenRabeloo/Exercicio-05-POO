public class Filme {
    String titulo;
    String diretor;
    int anoLancamento;
    int duracao;

    public Filme(String titulo, String diretor, int anoLancamento, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.anoLancamento = anoLancamento;
        this.duracao = duracao;
    }

    public void informacoes(){
        System.out.println("----- DETALHES DO FILME -----");
        System.out.println("Título: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);
        System.out.println("Duração: " + this.duracao + " minutos");
    }
}
