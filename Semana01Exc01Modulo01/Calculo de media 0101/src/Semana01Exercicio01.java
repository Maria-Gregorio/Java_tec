import java.util.Scanner;

/*[M1S01] Ex 1 - Cálculo de média
Solicite 3 notas de 0.0 a 10.0 , após a terceira nota apresente o resultado de aprovação , para aprovação o aluno deve possuir média superior a 7.0 ;
 */

public class Semana01Exercicio01 {
    public static void main(String[] args) {

        double nota1;
        double nota2;
        double nota3;

        /*
        Para que seja possível a leitura utilizamos o Scanner */
        Scanner entradaUsuario = new Scanner(System.in);


        /* Escrever no console o texto */
        System.out.println("Digite a nota 1");
        nota1 = entradaUsuario.nextDouble();

        System.out.println("Digite a nota 2");
        nota2 = entradaUsuario.nextDouble();

        System.out.println("Digite a nota 3");
        nota3 = entradaUsuario.nextDouble();

        double media = (nota1 + nota2 + nota3) /3;

        if (media >7.0){
            System.out.println("Aluno foi Aprovado com a media " + media);

        }else{
            System.out.println("Aluno foi Reprovado com a media " + media);
        }

         /*
        ESTRUTURAS DE DECISÃO ( operador ternário )
        */

        System.out.println((media > 7.0 ) ? "Aluno aprovado com media " + media:
                "Aluno Reprovado com media " + media);

    }
}