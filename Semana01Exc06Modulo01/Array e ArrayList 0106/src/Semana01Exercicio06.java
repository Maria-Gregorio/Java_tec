/*
      crie um Array com o nome de “valores” com 10 elementos do tipo Double.

      Preencha com valores todas as posições do Array.

      Depois imprima no terminal todos os valores desse

      Array utilizando o laço de repetição For;

      Depois realize a soma de todos os valores desse

      Array usar um laço de reptição For e imprima o total no terminal;
       */

public class Semana01Exercicio06 {

        public static void main(String[] args) {

            Double[] valores = new Double[10];

            valores[0] = 1.0;

            valores[1] = 2.0;

            valores[2] = 3.0;

            valores[3] = 4.0;

            valores[4] = 5.0;

            valores[5] = 6.0;

            valores[6] = 7.0;

            valores[7] = 8.0;

            valores[8] = 9.0;

            valores[9] = 10.0;



            for (int i = 0 ; i < valores.length ; i++) {

                System.out.println(valores[i]);

            }

            Double soma = 0.0;

            for (Double d : valores) {

                soma += d;

            }

            System.out.println(soma);

        }

    }

