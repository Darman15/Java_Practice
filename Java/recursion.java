public class recursion {

    // The below uses recursion to add up all numbers up to 10 in order

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }

    }

    public static void main(String[] args) throws Exception {

        int sumTest = sum(10);

        System.out.println(sumTest);

    }

}
