public class break_Continue {

    public static void main(String[] args) throws Exception {

        // break used to jump out of switch and loops

        // for (int i = 0; i < 10; i++) {
        // if (i == 4) {
        // break;
        // }
        // System.out.println(i);
        // }

        // a continue statement breaks one iteration of the condition when the
        // specified condition occurs

        // for (int i = 0; i < 10; i++) {
        // if (i == 4) {
        // continue;
        // }
        // System.out.println(i);
        // }

        // Note how the 4 is skipped when run

        int a = 0;

        // while (a < 10) {
        // System.out.println(a);
        // a++;
        // if (a == 3) {
        // break;
        // }
        // }

        while (a < 10) {
            if (a == 6) {
                a++;
                continue;
            }
            System.out.println(a);
            a++;
        }

    }
}
