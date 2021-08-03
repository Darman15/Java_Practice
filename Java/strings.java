public class strings {
    public static void main(String[] args) throws Exception {

        System.out.println("Test");

        // Setting and pringing a string variable

        String greeting = "Hello";

        System.out.println(greeting);

        // Methods that can be added onto the String Object
        // length
        // add .length to end of variable name

        String test = "lengthtest";

        System.out.println("The length of the test variable is " + test.length());

        // .toUpperCase and .toLowerCase

        String upperExample = "ALL IN UPPER CASE NOW ALL IN LOWER";
        String lowerExample = "all in lower now all in upper";

        System.out.println(lowerExample.toUpperCase());
        System.out.println(upperExample.toLowerCase());

        // Find position of the first occurance of a charachter
        // remember, java starts with 0

        String indexofExample = "Over the river and through the woods";

        System.out.println(indexofExample.indexOf("the"));

        // Concatnate two strings

        String firstName = "Benjamin";
        String lastName = "Parks";

        System.out.println(firstName + " " + lastName);
        // or use concat method
        System.out.println(firstName.concat(lastName));

        // Using escape charachters

        String stopThat = "I said \"Stop\" Please";
        System.out.println(stopThat);
    }
}