public class Questao3 {
    public static void main(String[] args) {
        /*3) Observe o trecho de código abaixo: int INDICE = 12, SOMA = 0, K = 1; enquanto K < INDICE faça { K = K + 1; SOMA = SOMA + K; } imprimir(SOMA);*/

        int indice = 12;
        int soma = 0;
        int k = 1;

        while(k < indice){
            k++;
            soma = soma + k;
        }

        System.out.println(soma);
    }
}
