import java.util.Scanner;
void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int opcao;

    do {
        System.out.println("\n===== SELECIONE A CLASSE DESEJADA =====");
        System.out.println("01 - Fatura");
        System.out.println("02 - Elevador");
        System.out.println("03 - Pessoa");
        System.out.println("04 - Produto");
        System.out.println("05 - Conta Bancária");
        System.out.println("06 - Carro");
        System.out.println("07 - Livro");
        System.out.println("08 - Funcionário");
        System.out.println("09 - Retângulo");
        System.out.println("10 - Aluno");
        System.out.println("11 - Filme");
        System.out.println("12 - Celular");
        System.out.println("0 - Sair");
        System.out.print("Digite a opção desejada: ");

        opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("===== FATURA =====");
                Fatura fatura01 = new Fatura();
                fatura01.inicializar("001", "Teclado HyperX", 1, 569.00);

                //exibindo os dados
                System.out.println("\n----- FATURA 01 -----");
                System.out.println("Item: " + fatura01.numero);
                System.out.println("Descrição: " + fatura01.descricao);
                System.out.println("Quantidade: " + fatura01.quantidade);
                System.out.println("Preço unitário: " + fatura01.preco);

                //valor total da fatura
                double total = fatura01.calcular_valor_fatura();
                System.out.println("Valor total: " + total);
                break;

            case 2:
                System.out.println("\n===== ELEVADOR ======");
                Elevador elevador01 = new Elevador();

                //metodo inicializar para preencher os dados
                elevador01.inicializar(8, 4);

                //exibindo os dados usando os gets
                System.out.println("\n----- STATUS ATUAL DO ELEVADOR -----");
                System.out.println("Andar atual: " + elevador01.getAndarAtual());
                System.out.println("Pessoas dentro: " + elevador01.getPessoasPresentes());
                System.out.println("Capacidade máxima: " + elevador01.getCapacidadeElevador());
                System.out.println("Total de andares do prédio: " + elevador01.getTotalAndares());
                break;

            case 3:
                System.out.println("\n===== PESSOA =====");
                Pessoa pessoa01 = new Pessoa("Ellen", 20, "111.652.738-10");

                //exibindo os dados usando os gets
                System.out.println("\n----- PESSOA 01 -----");
                System.out.println("Nome: " + pessoa01.getNome());
                System.out.println("Idade: " + pessoa01.getIdade());
                System.out.println("CPF: " + pessoa01.getCpf());
                break;

            case 4:
                System.out.println("\n===== PRODUTO =====");
                Produto produto01 = new Produto("Guitarra elétrica", 1429.00, 7);

                //exibindo os dados usando os gets
                System.out.println("\n----- PRODUTO 01 -----");
                System.out.println("Produto: " + produto01.getNome());
                System.out.println("Preço: " + produto01.getPreco());
                System.out.println("Quantidade disponível: " + produto01.getQuantidadeDisponivel());

                //metodo de calculo de estoque
                double totalEstoque = produto01.calcular_valor_estoque();
                System.out.println("Valor total do estoque: " + totalEstoque);
                break;

            case 5:
                System.out.println("\n===== CONTA BANCÁRIA =====");
                ContaBancaria conta01 = new ContaBancaria("012", "Vanessa");

                //exibindo os dados usando os gets
                System.out.println("\n----- CONTA BANCARIA 01 -----");
                System.out.println("Número: " + conta01.getNumero());
                System.out.println("Titular " + conta01.getTitular());
                System.out.println("Saldo: " + conta01.getSaldo());
                break;

            case 6:
                System.out.println("\n====== CARRO ======");
                Carro carro01 = new Carro("Toyota", "Corolla", 2024, 40);

                //exibindo os dados usando os gets
                System.out.println("\n----- CARRO 01 -----");
                System.out.println("Marca: " + carro01.getMarca());
                System.out.println("Modelo: " + carro01.getModelo());
                System.out.println("Ano: " + carro01.getAno());
                System.out.println("Velocidade atual: " + carro01.getVelocidadeAtual());
                break;

            case 7:
                System.out.println("\n===== LIVRO =====");
                Livro livro01 = new Livro("Harry Potter", "JK Rolling", 1997);

                //exibindo os dados usando os gets
                System.out.println("\n----- LIVRO 01 -----");
                System.out.println("Titulo: " + livro01.getTitulo());
                System.out.println("Autor: " + livro01.getAutor());
                System.out.println("Ano: " + livro01.getAnoPublicacao());
                if (livro01.isDisponivel())
                    System.out.println("Status: " + "Disponível");
                else {
                    System.out.println("Status: " + "Indisponível");
                }
                break;

            case 8:
                System.out.println("\n===== FUNCIONÁRIO =====");
                Funcionario funcionario01 = new Funcionario("Kauã", 5350, "Marceneiro");

                //exibindo os dados usando os gets
                System.out.println("\n----- FUNCIONÁRIO 01 -----");
                System.out.println("Nome: " + funcionario01.getNome());
                System.out.println("Salário: " + funcionario01.getSalario());
                System.out.println("Cargo: " + funcionario01.getCargo());
                System.out.println("Salário líquido: " + funcionario01.novoSalario());
                break;

            case 9:
                System.out.println("\n===== RETÂNGULO =====");
                Retangulo retangulo01 = new Retangulo(5, 7);

                //exibindo os dados usando os gets
                System.out.println("Largura: " + retangulo01.largura);
                System.out.println("Altura: " + retangulo01.altura);
                System.out.println("Área: " + retangulo01.calcularArea());
                System.out.println("Perímetro: " + retangulo01.calcularPerimetro());
                break;

            case 10:
                System.out.println("\n===== ALUNO =====");
                Aluno aluno01 = new Aluno(3456, "João", 5.9);

                //exibindo os dados usando os gets
                System.out.println("Matricula: " + aluno01.getMatricula());
                System.out.println("Nome: " + aluno01.getNome());
                System.out.println("Média Final: " + aluno01.getMediaFinal());
                System.out.println("Status: " + aluno01.verificarAprovacao());
                break;

            case 11:
                System.out.println("===== FILME =====");
                Filme filme01 = new Filme("A extinção", "Augusto Cury", 2026, 110);

                filme01.informacoes();
                break;

            case 12:
                System.out.println("===== CELULAR =====");
                Celular celular01 = new Celular("Xiaomi", "Redmi Note", 1200, 64);

                celular01.exibirResumo();
                break;

            default:
                break;
        }

    } while (opcao != 0);
}
