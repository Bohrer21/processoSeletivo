import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        /*2) Escreva um programa que verifique, em uma string, a existência da letra ‘a’, seja maiúscula ou minúscula,
        além de informar a quantidade de vezes em que ela ocorre.*/


        Scanner sc = new Scanner(System.in);

        System.out.print("Escreva uma palavra e saiba quantas letras 'A' ela tem: ");
        String word = sc.next();

        int counter = counterA(word);

        System.out.println(counter);

        sc.close();
    }

    public static int counterA(String word){
        int counter = 0;

        for(int i = 0; i < word.length(); i++){
            char caractere = word.charAt(i);
            if(caractere == 'a' || caractere == 'A'){
                counter++;
            }
        }
        return counter;
    }
}
