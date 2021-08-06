public class switchPractice {
    public static void main(String[] args) throws Exception {

        System.out.println("Test");

        // the switch statement selects one of many blocks to be executed

        String Skywalker = "Jania";

        switch (Skywalker) {
            case "Shmi":
                System.out.println("This is Shmi Skywalker");
                break;
            case "Anaikin":
                System.out.println("This is Anakin Skywalker");
                break;
            case "Luke":
                System.out.println("This is Luke Skywalker");
                break;
            case "Ben":
                System.out.println("This is Ben Skywalker");
                break;
            // use the default keyword to specify code that runs if no match is found
            default:
                System.out.println("This may not be a Skywalker");
        }

    }
}