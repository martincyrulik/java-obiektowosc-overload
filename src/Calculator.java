/**
 * W tym przykładzie zapoznaję się z ideą przeciążenia
 * Przeciążenie (overload) - to mechanizm, w którym możemy w
 * ramach jednej klasy zdefiniować kilka konstruktorów lub metod
 * o tych samych nazwach, ale z różnymi parametrami.
 * Np. chcemy wykonać tę samą operację (np. sumowanie), ale
 * z różną liczba lub typami parametrów.
 */

public class Calculator {

    int add(int a, int b){      //metoda sumowania 2 liczb typu int
        return a + b;
    }
    int add(int a, int b, int c){
        return a + b + c;       //ta sama metoda, ale z sumowaniem 3 liczb - przeciążenie
    }
    int add(int a, int b, int c, int d){    //sumowanie 4 liczb - kolejne przeciążenie
        return a + b + c + d;
    }
    int add(int a, int b, int c, int d, int e){    //sumowanie 5 liczb - następne przeciążenie
        return a + b + c + d + e;
    }

    int sub(int a, int b){      //metoda odejmowania 2 liczb typu int
        return a - b;
    }
    int sub(int a, int b, int c){
        return a - b - c;       //ta sama metoda, ale z odejmowaniem 3 liczb - przeciążenie
    }
    int sub(int a, int b, int c, int d){    //odejmowanie 4 liczb - kolejne przeciążenie
        return a - b - c - d;
    }
    int sub(int a, int b, int c, int d, int e){    //odejmowanie 5 liczb - następne przeciążenie
        return a - b - c - d - e;
    }

    double div(int a, int b){      //metoda dzielenia 2 liczb typu int
        return (double) a / b;
    }
    double div(int a, int b, int c){
        return (double) a / b / c;       //ta sama metoda, ale z dzieleniem 3 liczb - przeciążenie
    }
    double div(int a, int b, int c, int d){    //dzielenie 4 liczb - kolejne przeciążenie
        return (double) a / b / c / d;
    }
    double div(int a, int b, int c, int d, int e){    //dzielenie 5 liczb - następne przeciążenie
        return (double) a / b / c / d / e;
    }

    int multi(int a, int b){      //metoda mnożenia 2 liczb typu int
        return a * b;
    }
    int multi(int a, int b, int c){
        return a * b * c;       //ta sama metoda, ale z mnożeniem 3 liczb - przeciążenie
    }
    int multi(int a, int b, int c, int d){    //mnożenie 4 liczb - kolejne przeciążenie
        return a * b * c * d;
    }
    int multi(int a, int b, int c, int d, int e){    //mnożenie 5 liczb - następne przeciążenie
        return a * b * c * d * e;
    }

}
