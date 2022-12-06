
/*
Crie um algoritmo em Java, para receber como entrada do usuário um número inteiro e  utilizando a estrutura de condição Switch Case retorne ao usuário o dia da semana referente ao número inteiro digitado.
*/


/*
public class Semana01Exercicio04 {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite uma opção: ");
        int opcao = leitor.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você Escolheu Domingo.");
                break;
            case 2:
                System.out.println("ocê Escolheu Segunda.");
                break;
            case 3, 4, 5, 6:
                switch (opcao) {
                    case 4:
                }
                System.out.println("ocê Escolheu Terça.");
                break;
            default:
                System.out.println("Opção informada inválida. Informe um valor correto, conforme opções.");
        }
    }
}
*/

import java.util.Scanner;

public class AulaLoop {
    public static void main(String[] args) {
        // Declaração de variáveis
        int numero;

        // Instância do objeto Scanner, para receber dados do usuários
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Digite um número para saber o dia da semana referente: "); // Impressão/Mensagem de instrução no terminal
        numero = teclado.nextInt(); // Armazenando o número digitado pelo usuário na variável número

        switch (numero) { // Estrutura condicional Switch Case
            case 1: // Caso o valor da variável numero seja 1
                System.out.println("Você escolheu Domingo!");
                break;
            case 2: // Caso o valor da variável numero seja 2
                System.out.println("Você escolheu Segunda!");
                break;
            case 3: // Caso o valor da variável numero seja 3
                System.out.println("Você escolheu Terça!");
                break;
            case 4: // Caso o valor da variável numero seja 4
                System.out.println("Você escolheu Quarta!");
                break;
            case 5: // Caso o valor da variável numero seja 5
                System.out.println("Você escolheu Quinta!");
                break;
            case 6: // Caso o valor da variável numero seja 6
                System.out.println("Você escolheu Sexta!");
                break;
            case 7: // Caso o valor da variável numero seja 6
                System.out.println("Você escolheu Sexta!");
                break;
            default:
                System.out.println("Número inválido!");
        }
    }
}

