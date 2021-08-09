import java.util.Scanner;

public class ninjaTurtle {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        String bestTurtle = "Leonardo";
        String guess;

        System.out.println("type Leonardo, Raph, Mikey, Jennika, or Donnetello");
        guess = scanner.nextLine();

        System.out.println(guess);
        System.out.println(bestTurtle);
        System.out.println(guess == bestTurtle);

        while (guess != bestTurtle) {
            if (guess.equals(bestTurtle)) {
                System.out.println("Yes! Leo is the best");
                break;
            } else {
                System.out.println("This is not the best ninja turtle");
                System.out.println("Try again");
                guess = scanner.nextLine();
            }

        }

    }

}
