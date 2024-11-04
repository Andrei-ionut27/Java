import java.util.Locale;

public class Datatypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date

        // String = sir de caractere delimitate de " "
        String marca = "Dacia";
        String model = "1310";

        /* aflam dimensiunea unui string  length, se scrie stringul definit
        si se pune . pentru sugentile de modurii
         */

        System.out.println(marca.length());

        //scriem cu litere mari

        System.out.println(marca.toUpperCase());

        //integer = numar intreg, int
        int an_fabricatie = 1987;

        // double = numar zecimal
        double pret = 2300.50;

        // boolean = adevarat sau fals
        boolean inmatriculata = false;

        // char = un singur caracter @, 2, b, r,
        char nota = 'A';
    }
}
