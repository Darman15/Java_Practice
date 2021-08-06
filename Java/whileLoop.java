public class whileLoop {
    public static void main(String[] args) throws Exception {
        System.out.println("Test");
        // While loops execute code as long as a specified condition is true
        // print i as long as i is less than a number while incrementng by one

        int i = 1;

        while (i < 5) {
            System.out.println(i);
            i++;
        }

        // do.. while loop variant

        int y = 0;

        do {
            System.out.println(y);
            y++;
        } while (y < 5);
    }
}
