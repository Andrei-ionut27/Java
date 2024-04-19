public class Operatorii {
    public static void main(String[] args) {
        /*
        recap:
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
         */
        int a = 3; // o declarare && initializare
        int b = 5;
        a = b; // suprascriere
        System.out.println(a != b); // a este diferit de b? raspunsul va fi false

        System.out.println(7>b && 8>b); // 7 > 5 si 8 > 5? daca sunt adevarate amandoua este TRUE

        System.out.println(7>b && 3>b); // 7 >5 si 3 > 5? daca nu sunt amandoua adevarate este FALS
        System.out.println(7>b || 3>b);// Ajunge daca doar una e adevarata
        System.out.println(7 > b && (8 > b || 3 > b)); // Este adevarata 7>5 si 8>5 chiar daca 3>5 este falsa, ||(sau)
        System.out.println(7 > b && (2 > b || 3 > b));
        /*
        True si fals dar pentru ca este &&(end care inseamna ca toate conditile sa fie indeplinite
        raspunsul va fi fals
         */
        System.out.println(7 > b || (2 > b || 3 > b));
        /*
        raspunsul va fi true pentru ca ||( inseamna doar o conditie daca e indeplinita ajunge ca raspunsul fa fie true
         */
        System.out.println(!(7>b)); // raspunsul e true 7 > 5 dar din cauza !( care inverseaza) raspunsul e fals



    }

}