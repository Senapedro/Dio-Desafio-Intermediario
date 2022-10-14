import java.util.*;

public class ValidarParenteses {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean caracter = endWith(scanner.nextLine());
        System.out.println(caracter);

    }

    private static boolean endWith(String nextLine) {
        String um = "()";
        String dois = "{}";
        String tres = "[]";

        if(um.equals(nextLine)){
            return true;
        } else if (dois.equals(nextLine)) {
            return true;
        }else return tres.equals(nextLine);
    }
}
