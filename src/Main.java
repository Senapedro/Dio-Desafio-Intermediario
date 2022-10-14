import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String contrario = "";

        System.out.println("");
        String nome = ent.nextLine();


        for (int i = (nome.length() -1); i >= 0; i--) {
            contrario = contrario + nome.charAt(i);
        }


        if (contrario.toLowerCase().equals(nome.toLowerCase())) {
            System.out.println("\n\n\t\tTRUE");
        } else {
            System.out.println("\n\n\t\tFALSE");
        }
    }
}