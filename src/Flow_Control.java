import java.util.Scanner;

public class Flow_Control {
    public static void main(String[] args) {
        //Flow control i if else
        //Evalueaza conditii si bifurca codul in funtie de rezultat

//        System.out.println("Pornim radioul");
//        boolean piesa_faina = true;// invat calculatorul daca piesa e faina sau nu
//        // daca imi place piesa, dau m-ai tare
//        if (piesa_faina == true) {
//            System.out.println("Dau m-ai tare radioul");
//            System.out.println("Fredonez piesa");
//        }
//        System.out.println("Oprim radioul");
//        //if else
//        int nr = 4;
//        if ((nr & 2) == 0) {
//            System.out.println("Par");
//        } else {
//            System.out.println("impar");
//        }
        //if, else if, else
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Introdu Ora");
//        int ora = sc.nextInt();
//        if (ora < 0) {
//            System.out.println("Ora invalida");
//        } else if (ora <= 11) {
//            System.out.println("Neata");
//        }else if (ora <= 18) {
//            System.out.println("Ziua Buna");
//        }else if (ora <= 21) {
//            System.out.println("Buna Seara");
//        }else if (ora <= 24) {
//            System.out.println("Noapte buna");
//        } else {
//            System.out.println("Ora invalida");
//        }
        // <0 viteza invalida, 0 stationeaza, <==50 localitate, <==90 drum judetean, <==130 autostrada
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu Viteza");
        int viteza = sc.nextInt();
        
        if (viteza < 0) {
            System.out.println("Viteza invalida");
        } else if (viteza == 0) {
            System.out.println("Stationeaza");
        } else if (viteza <= 50) {
            System.out.println("Localitate");
        } else if (viteza <= 90) {
            System.out.println("Drum judetean");
        } else if (viteza <= 130) {
            System.out.println("Autostrada");
        }else {
            System.out.println("M-ai incet ca iti iei zborul");
        }


        //flow control
        //switch - se foloseste cand stim valorile posibile
//        System.out.println("Alege optiunea");
//        int optiunea = sc.nextInt();
//        switch (optiunea) {
//            case 0:
//                System.out.println("Meniu anterior");
//                break;
//            case 1:
//                System.out.println("Ati ales limba romana");
//                break;
//            case 2:
//                System.out.println("Ati ales limba engleza");
//                break;
//            default:
//                System.out.println("Optiune invalida");
//
//        }


    }// inchide funtia main
}// inchide clasa
