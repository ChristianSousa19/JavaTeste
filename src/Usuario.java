import java.util.Scanner;

public class Usuario {
    public static void main(String[] args) {
        System.out.println("Qual e o seu nome");
        Scanner nome=new Scanner(System.in);
        String n=nome.next();
        System.out.format("Ola e um prazer te conhecer %s",n);
    }
}

