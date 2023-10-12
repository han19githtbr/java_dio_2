import java.util.Scanner;

public class OperadorTernario {
    public static void main(String [] args) {
        int a, b;

        //a = 5;
        //b = 6;
        
        System.out.println("Digite um numero:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        System.out.println("Digite outro numero:");
        Scanner sc2 = new Scanner(System.in);

        b = sc2.nextInt();

        String resultado = a == b ? "verdadeiro" : "falso";
                
        System.out.println(resultado);
    }
}