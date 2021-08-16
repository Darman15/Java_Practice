public class overloadingMethods {
    // overloading a method allows you to have the same name on a method with
    // different paramators.
    // useful for flexible data type input

    static int overLoadMethod(int x, int y) {
        return x + y;
    }

    static double overLoadMethod(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) throws Exception {

        int answerOne = overLoadMethod(5, 6);

        double answerTwo = overLoadMethod(3.3, 5.3);

        System.out.println(answerOne);
        System.out.println(answerTwo);

    }

}
