/*Operatori :
aritmetici : +, -, *, /, %
de comparare : <, >, ==, !=, >=, <=
logici : &&. ||, !

Flow control - if else
 */



public class Operatori {
    public static void main(String[] args) {
        int a = 3; // initializare && declarare
        int b = 5;
        a = b; // suprascriere

        System.out.print(a + b); // 10
        System.out.print(a - b); // 0
        System.out.print(a / b); // 1
        System.out.print(a % b); // 0
        System.out.print(a != b); // fals
        System.out.print(12 > b); // true, 12 ma-i mare ca 5
        System.out.print(a == b); // 5 egal cu 5
        System.out.println(7 >b && 8>b); // 7>5 si 8>5
        System.out.println(7 >b || 3>b); // 7>5 sau 3>5
        System.out.println(7 >b && (8>b || 3>b)); // true && true
        System.out.println(7 >b && (2>b || 3>b)); // true && fals
        System.out.println(7 >b || (2>b || 3>b)); // true || fals
        System.out.println(!(7>b)); // 7 este ma-i mare decat b? > !true devine fals


    }
}
