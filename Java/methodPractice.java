public class methodPractice {
    public static void main(String[] args) throws Exception {

        // a method is a function that stores pre-defined code to run
        // executed when called upon
        // take method written outside main method and call it within program
        // the argument and paramater do not have to be the same. name is used for
        // all for convincince.

        String name = "Tam";

        int age = 27;
        hello(name, age);

        // return types return value of method back to area it was called

        int x = 3;
        int y = 4;

        int z = addNum(x, y);
        System.out.println(z);
        // you could also
        System.out.println(addNum(x, y));

        exampleFunc();

    }

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

}
