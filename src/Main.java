import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Scrivi una frase:");
        String frase = sc.nextLine();

        String frase2 = frase.toUpperCase();
        String cifrato = Encript.encrypt(frase2);
        String decrifrato = Encript.Decrypt(cifrato);

        System.out.println("Testo originale: Frase:" + frase);
        System.out.println("Cifrato: " + cifrato);
        System.out.println("Decrifrato: " + decrifrato);
    }
}
