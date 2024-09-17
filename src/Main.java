import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int valor = 0;
        int somaTotal = 0;

        Scanner sc = new Scanner(System.in);


        while (valor != 99){
            /*System.out.println(valor);
            valor= valor+ 1; // valor++ */

            System.out.println("Infome o valor");
            System.out.println("Infome 99 para sair");
            valor = sc.nextInt();

            somaTotal += valor;

        }

        System.out.println("Total é " + somaTotal);

    }

}