import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    /* n-2 + n-1 = n 
     * n2 = 1
     * n1 = 1
     * n = 2
     * int sequencia [1,1]
     *  eu quero que o usuário escolha quantos números ele quer ver da sequencia de fibonacci
     * tamanho = 10
     * if tamanho == 1
     * if tamanho == 2
     * if tamanho > 2 
    */

        //declaração de variaveis
        int tamanho;
        int n1 = 1;
        int n2 = 1;
        int n;
        int sequencia[] = new int[25];


        Scanner sc = new Scanner(System.in);    

        System.out.println("Digite a quantidade de digitos da sequencia de fibonacci você deseja saber");
        tamanho = sc.nextInt();

        if(tamanho == 1){
            System.out.println("A sequencia e [1]");
        } else if (tamanho == 2) {
            System.out.println("A sequencia e [1,1]");
        } else{
            System.out.print("A sequencia e [1, 1");
            for(int i = 2; i < tamanho; i++){
            n = n1 + n2;
            System.out.print(", " + n);
            n2 = n1;
            n1 = n;           
            }
            System.out.println("]");
        }



    }
}
