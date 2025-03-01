public class Student{

    char[] firstName;
    char[]  secondName;
    int age;
    char[] email;
    int indexNumber;

    Student(char[] firstName, char[] secondName){
        this.firstName = firstName;
        this.secondName = secondName;
    }

    //przeciążenie - definiuję konstruktor o tej samej nazwie, ale z większą ilością parametrów
    Student(char[] firstNameName, char[] secondNameName, int age, char[] email, int indexNumber){
        this.firstName = firstNameName;
        this.secondName = secondNameName;
        this.age = age;
        this.email = email;
        this.indexNumber = indexNumber;
    }

}


