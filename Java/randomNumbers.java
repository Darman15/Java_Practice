import java.util.Random;
// above gives access to random class

public class randomNumbers {

    public static void main(String[] args) {
        // generate random values in java

        Random random = new Random();

        int x = random.nextInt(6) + 1;

        double y = random.nextDouble();

        System.out.println(x);
        System.out.println(y);

    }

}
