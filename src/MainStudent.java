/**
 * Zadanie 3 - Info o studentach #5
 * 
 * Napisz program przechowujący info o studentach.
 * Student ma imię, nazwisko, wiek, email, indeks.
 * Dodaj 3 studentów, których znasz imię i nazwisko.
 * Dodaj też 2 o których wiesz wszystko (komplet danych).
 * Program powinien umożliwiać wyświetlenie skróconego opisu osoby
 * (imię i nazwisko) oraz rozszerzonego (komplet danych).
 */

public class MainStudent {
    public static void main(String[] args) {

        char[] firtsName1 = {'J','a','n'};
        char[] secondName1 = {'K','o','w','a','l','s','k','i'};
        char[] firstName2 = {'P','i','o','t','r'};
        char[] secondName2 = {'Z','i','e','l','i','n','k','i'};
        char[] firstName3 = {'J','a','c','e','k'};
        char[] secondName3 = {'C','h','r','o','b','a','k'};
        char[] firstName4 = {'E','l','ż','b','i','e','t','a'};
        char[] secondName4 = {'K','a','m','i','ń','s','k','a'};
        char[] email4 = {'e','l','a','k','a','m','i','n','k','s','a','@','g','m','a','i','l','.','c','o','m'};
        char[] firstName5 = {'Z','o','f','i','a'};
        char[] secondName5 = {'B','e','m'};
        char[] email5 = {'z','o','f','i','a','.','b','e','m','@','w','p','.','p','l'};
        Student s1 = new Student(firtsName1, secondName1);
        Student s2 = new Student(firstName2, secondName2);
        Student s3 = new Student(firstName3, secondName3);
        Student s4 = new Student(firstName4, secondName4, 21, email4, 12345);
        Student s5 = new Student(firstName5, secondName5, 22, email5, 15244);

        Student[] students = new Student[5];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        students[3] = s4;
        students[4] = s5;

        //wyświetlenie skróconej listy studentów : tylko imiona i nazwiska
        System.out.println("Skrócona lista studentów: Imiona i Nazwiska");
        for (Student s: students){
            System.out.print("Imię: ");
            for (char c : s.firstName){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Nazwisko: ");
            for (char c : s.secondName){
                System.out.print(c);
            }
            System.out.println();
            System.out.println("------------------");
        }

        System.out.println();
        //wyświetlenie listy studentów - wersja rozszerzona
        System.out.println("Rozszerzona wersja listy studentów");
        for (Student s: students){
            System.out.print("Imię: ");
            for (char c : s.firstName){
                System.out.print(c);
            }
            System.out.println();
            System.out.print("Nazwisko: ");
            for (char c : s.secondName){
                System.out.print(c);
            }
            System.out.println();
            if (s.age != 0 && s.email != null && s.indexNumber != 0){
                System.out.println("Wiek: " + s.age);
                System.out.print("Adres email: ");
                for (char c : s.email){
                    System.out.print(c);
                }
                System.out.println();
                System.out.println("Nr indeksu: " + s.indexNumber);
            }
            System.out.println("--------------");
        }
    }
}
