public class Operatori_Date_variabile {
    public static void main(String[] args) { // psvm = de unde incepe codul

        /*
    variabile
        tipuri de date: char(un singur caracter), string(sir de caractere din tastatura
        delimitat cu " "),
         int(numer intreg), float/double(recomandat double
        intra mai multe zecimale), boolean(adevarat sau fals)
        Operatori:
        aritmetici: -(minus), +(plus), *(inmultire), /(inpartire), %(module, restul inpartiri)
        de comparare: <(mai mic) >(mai mare), ==(egal), !=(diferit), >=(mai mare sau egal), <=(mai mic sau egal)
        logici: &&(vrei doua conditi), ||( vrei macar una din conditii), !(pui o intrebare si inverseaza rezultatul)

        Flow control = if else
        evalueaza conditii si bifurca codul in functie de rezultat

     */ // comentarii de mai multe linii(comment of 1 or more lines)
        // comentarie de o line(comment of one line)

        // cele mai folosite 5 tipuri de date

        // String = sir de caractere delimitate de " "

        String marca = "Dacia";
        String model = "1310";

        System.out.println(marca.toUpperCase());
        //scriem cu litere mari

        System.out.println(marca.length());
        // scrie dimensiunie stringului

        //integer = numar intreg, int

        int an_fabricatie = 1987;

        // double = numar zecimal

        double pret = 2300.50;

        // boolean = adevarat sau fals

        boolean inmatriculata = false;

        // char = un singur caracter @, 2, b, r

        char nota = 'A';


        // declarare si initializare
        String marcaMasina = "Passat";
        String modelMasina = "B6 berlina";

        // strongly typed - trebuie sa specificam tipul de date

        System.out.println("am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);
        // suprascrierea
        modelMasina = "Passat b7";

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String nume;
        String prenume;
        // iniializare
        prenume = "Andrei";
        nume = "Florea";
        int varsta = 32;
        // concatenare de stringuri
        System.out.println(prenume + " " + nume + " cu varsta de " + varsta + " de ani");

    } // funcia main se termina aici

} // clasa se termina aici
