import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
        /*1) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...),
        escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou
        não a sequência. */
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número que deseja saber se pertence a sequência de Fibonacci: ");
        int number = sc.nextInt();

        if(calcFibonacci(number)){
            System.out.println("O número " + number + " pertence a sequência de Fibonacci!");
        } else {
            System.out.println("O número " + number + " não pertence a sequência de Fibonacci!");
        }

        System.out.println();

        sc.close();
    }

    public static boolean calcFibonacci(int number){
        if(number == 0 || number == 1){
            return true;
        }

        int previous = 0;
        int actual = 1;

        while(actual < number){
            int next = previous + actual;
            previous = actual;
            actual = next;
        }

        return actual == number;
    }
}
