public class arrays {
    public static void main(String[] args) throws Exception {
        System.out.println("test");

        // arrays are used to store multiple values in a variable

        // an array that holds string variables

        String[] xMen = { "Cyclops", "Jean Grey", "Iceman", "Angel", "Beast" };

        // array of integers

        int[] myNums = { 10, 20, 30, 40, 50 };

        // access elements of an array by refering to index number. Remember it starts
        // with 0

        System.out.println(xMen[0]);

        // Changing the output of a specific element

        xMen[1] = "Phenoix";
        System.out.println(xMen[1]);

        // .length property can be used to find out how many elements are in an array.
        // This does not start with 0 and will show actual number

        System.out.println(xMen.length);

        // looping through an array

        for (int i = 0; i < xMen.length; i++) {
            System.out.println(xMen[i]);
        }

        for (int u = 0; u < myNums.length; u++) {
            System.out.println(myNums[u]);
        }

        // Another look at simpiler for each loop used on arrays

        for (String x : xMen) {
            System.out.println(x);
        }

        // MultiDemensional arrays have more than one set each within braces. note how
        // the string array variable has two [][]

        String[][] avengers = { { "Cap", "Ironman", "Hulk", "Giantman", "Wasp" },
                { "Hawkeye", "Vision", "Scarlet-Witch", "Quicksilver" } };

        // to find Quicksilver
        System.out.println(avengers[1][3]);

        // NEsted for loops

        for (int i = 0; i < avengers.length; i++) {
            for (int j = 0; j < avengers[i].length; j++) {
                System.out.println(avengers[i][j]);
            }
        }
    }
}
