public class methodPractice {

    // functions/methods defined below
    // write outside of main method
    static void hello(String name, int age) {
        System.out.println("Hello " + name);
        System.out.println("You are " + age);
    }

    // for return value replace void with return type. In this case int

    static int addNum(int x, int y) {
        int z = x + y;
        return z;
    }

    static void exampleFunc() {
        System.out.println("This is a test");
    }

    static void flName(String fName, String lName) {
        System.out.println("Your name is " + fName + lName);
    }

    static void nameAge(String fName, int age) {
        System.out.println(fName + "is " + age + " years old");
    }

    static int numMethod(int u) {
        return 5 + u;
    };

    public static void main(String[] args) throws Exception {

        // a method is a function that stores pre-defined code to run
        // executed when called upon
        // take method written outside main method and call it within program
        // the argument and paramater do not have to be the same. name is used for
        // all for convincince.

        System.out.println(numMethod(3));

        String name = "Tam";

        int age = 27;
        hello(name, age);

        nameAge("Oliver ", age);

        // return types return value of method back to area it was called

        int x = 3;
        int y = 4;

        int z = addNum(x, y);
        System.out.println(z);
        // you could also
        System.out.println(addNum(x, y));

        exampleFunc();

        flName("Ben ", "Parks");

    }

}
