public class ifElse {

    public static void main(String[] args) throws Exception {
        // if statement
        // if conditions

        if (20 > 5) {
            System.out.println("Yes, 20 is bigger than 5");
        }

        int x = 10;
        int y = 5;

        if (x > y) {
            System.out.println("x is bigger than y");
        }

        // else will specify code to execute if condition is false

        int time = 1900;

        if (time < 1500) {
            System.out.println("It is still early in the day");
        } else {
            System.out.println("It is now late in the day");
        }

        // use else if if condition 1 is false and write more code

        String favNinja = "Leo";

        if (favNinja == "Raph") {
            System.out.println("Thats not the best one");
        } else if (favNinja == "Mikey") {
            System.out.println("He is only the second best");
        } else if (favNinja == "Donnie") {
            System.out.println("He is not the best one");
        } else {
            System.out.println("Yes Leo is the best ninja turtle");
        }

        // short way to replace simple if..else statments called a ternary Operator

        int gameTime = 2000;

        String yes = (gameTime < 2000) ? "not yet" : "Its Time!";
        System.out.println(yes);

    }

}
