package cofrinho;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        //criação de uma instância de um objeto Cofrinho
        Cofrinho cofrinho = new Cofrinho();
        //Inicia dando boas vindas e mostra as opções dentro de um while loop.
        while (true) {
            System.out.println("\nBem vindo ao Cofrinho, o que Desejas ?");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Reais");
            System.out.println("5. Sair");
            System.out.print("Escolha: ");

            //lê o input que o usuario digitou e depois entra no switch case para cada opção selecionada com suas ações.
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o tipo da moeda (1 - Real, 2 - Dólar, 3 - Euro): ");
                    int tipoMoeda = scanner.nextInt();
                    System.out.print("Digite o valor da moeda: ");
                    double valor = scanner.nextDouble();
                    if (valor <= 0) {
                        System.out.println("Valor invalido");
                        continue;
                    }
                    
                    Moeda moeda;
                    //Aninhamento de Switch para adicionar moeda selecionada
                    switch (tipoMoeda) {
                        case 1:
                            moeda = new Real(valor);
                            break;
                        case 2:
                            moeda = new Dolar(valor);
                            break;
                        case 3:
                            moeda = new Euro(valor);
                            break;
                        default:
                            System.out.println("Tipo de moeda inválido.");
                            continue;
                    }
                    cofrinho.adicionarMoeda(moeda);
                    System.out.println("Moeda adicionada com sucesso.");
                    break;
                case 2:
                //Utilizar o indice do array foi a maneira que encontrei para remover uma moeda, então a primeira moeda é a 0, meio contra intuitivo, acho que um hashmap cairia bem de alguma forma.
                    System.out.print("Digite o índice da moeda a ser removida: ");
                    int indice = scanner.nextInt();
                    cofrinho.removerMoeda(indice);
                    System.out.println("Moeda removida com sucesso.");
                    break;
                case 3:
                //Listar as moedas adicionadas
                    cofrinho.listarMoedas();
                    break;
                case 4:
                //Converter Dollar e Euro para Real
                    System.out.println("Total em Reais: R$" + cofrinho.calcularTotalEmReais());
                    break;
                case 5:
                //Fechar programa
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

}


