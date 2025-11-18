import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int n, numero, soma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want to sum?");
        n = sc.nextInt();
        for (int times = 0; times < n; times++){
            System.out.println("Say your number");
            numero = sc.nextInt();
            System.out.printf("number: %d added\n", numero);
            soma += numero;
        }
        System.out.printf("some is %d\n", soma);
    }
}