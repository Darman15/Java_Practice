public class math {
    public static void main(String[] args) throws Exception {
        System.out.println("Test");

        // Java contains a Math class that allows you to use methods that facilitate
        // math
        // .max can be used to find highest value of numbers.

        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(5, 10));

        // .sqrt finds square root of numbers
        System.out.println((int) Math.sqrt(64));

        // Math.abs can return an absolute value

        System.out.println(Math.abs(-4.6));

        // Math.random returns a random value between 0.0 and 1.0, 1.0 is excluded

        System.out.println(Math.random());

        // Below shows how to get a desired range of numbers using math.random
        // The last number is excluded and using int truncates any remainders so use
        // number one
        // larger than what you want the max to be. This will give a number between 1
        // and 100

        int randomNumber = (int) (Math.random() * 101);

        System.out.println(randomNumber);

        // Many other methods can be used with the math class

    }
}
