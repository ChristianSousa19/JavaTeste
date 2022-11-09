import java.io.PrintStream;
import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        System.out.println("Digite um valor:");
        Scanner n=new Scanner(System.in);
        int n1=n.nextInt();
        System.out.println("Digite outro valor:");
        Scanner m=new Scanner(System.in);
        int n2=m.nextInt();
        int s=n1+n2;
        System.out.format("Você informou os valores %d e %d e sua soma e igual a %d", n1, n2, s);


    }
}
