public class Variabile {
    public static void main(String[] args) {
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
    }
}
