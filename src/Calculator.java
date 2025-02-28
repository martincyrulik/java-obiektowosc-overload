/**
 * W tym przykładzie zapoznaję się z ideą przeciążenia
 * Przeciążenie (overload) - to mechanizm, w którym możemy w
 * ramach jednej klasy zdefiniować kilka konstruktorów lub metod
 * o tych samych nazwach, ale z różnymi parametrami.
 * Np. chcemy wykonać tę samą operację (np. sumowanie), ale
 * z różną liczba lub typami parametrów.
 */

public class Calculator {

    int add(int ... values){      //metoda sumowania 2 liczb typu int
        int sum = 0;
        for (int v : values){
            sum+=v;
        }
        return sum;
    }

    int sub(int ... values){      //metoda odejmowania 2 liczb typu int
        int sub = values[0];
        for (int i = 1; i < values.length; i++){
            sub-=values[i];
        }
        return sub;
    }

    double div(int ... values){      //metoda dzielenia 2 liczb typu int
        double div = values[0];
        for (int i = 1; i < values.length; i++){
            div/=values[i];
        }
        return div;
    }

    int multi(int ... values){      //metoda mnożenia 2 liczb typu int
        int multi = 1;
        for (int v : values){
            multi*=v;
        }
        return multi;
    }
}
