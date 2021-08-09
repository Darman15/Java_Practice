public class forLoops {
    public static void main(String[] args) throws Exception {
        // use for loops when you know how many times you want to loop through a code
        // Statement one is executed before code block
        // 2 defines conditions for executing another code block
        // 3 is executed after the code block has been executed

        // for (statement 1; statement 2; statement 3) {
        // // code block to be executed
        // }

        // print numbers 0 to 4

        // for (int i = 0; i <= 4; i++) {
        // System.out.println(i);
        // }

        // Print number 0 to 10 that are even

        for (int y = 0; y <= 10; y = y + 2) {
            System.out.println(y);
        }

        // use for each loops to loop exclusivlty through arrays
        // arrays will be covered later. Just focus on for loop

        String[] xMen = { "Cyclops", "Beast", "Marvel-Girl", "Iceman", "Angel" };

        for (String x : xMen) {
            System.out.println(x);
        }

    }

}
