/**
 * Zadanie 1 - Kalkulator #1
 * Napisz kalkulator, w którym umożliwisz dodawanie, odejmowanie, mnożenie
 * i dzielenie 2,3,4 i 5 liczb.
 * Stosowanie w praktyce ideii przeciążenia - overloading
 */

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int a, b, c, d, e;
        a = 44;
        b = 2;
        c = 5;
        d = 6;
        e = 1;

        System.out.println("Suma " +a +" + " +b + " = " + calculator.add(a, b));
        System.out.println("Suma " + a + " + " + b + " + " + c +" = " + calculator.add(a,b,c));
        System.out.println("Suma "+a+" + "+b+" + "+c+ " + "+d+ " = "+calculator.add(a,b,c,d));
        System.out.println("Suma "+a+ " + "+b+ " + "+c+ " + "+d+ " + "+e+ " = "+calculator.add(a,b,c,d,e));

        System.out.println("Różnica " +a +" - " +b + " = " + calculator.sub(a, b));
        System.out.println("Różnica " + a + " - " + b + " - " + c +" = " + calculator.sub(a,b,c));
        System.out.println("Różnica "+a+" - "+b+" - "+c+ " - "+d+ " = "+calculator.sub(a,b,c,d));
        System.out.println("Różnica "+a+ " - "+b+ " - "+c+ " - "+d+ " - "+e+ " = "+calculator.sub(a,b,c,d,e));

        System.out.println("Dzielenie " +a +" / " +b + " = " + calculator.div(a, b));
        System.out.println("Dzielenie " + a + " / " + b + " / " + c +" = " + calculator.div(a,b,c));
        System.out.println("Dzielenie "+a+" / "+b+" / "+c+ " / "+d+ " = "+calculator.div(a,b,c,d));
        System.out.println("Dzielenie "+a+ " / "+b+ " / "+c+ " / "+d+ " / "+e+ " = "+calculator.div(a,b,c,d,e));

        System.out.println("Mnożenie " +a +" * " +b + " = " + calculator.multi(a, b));
        System.out.println("Mnożenie " + a + " * " + b + " * " + c +" = " + calculator.multi(a,b,c));
        System.out.println("Mnożenie "+a+" * "+b+" * "+c+ " * "+d+ " = "+calculator.multi(a,b,c,d));
        System.out.println("Mnożenie "+a+ " * "+b+ " * "+c+ " * "+d+ " * "+e+ " = "+calculator.multi(a,b,c,d,e));
    }
}
