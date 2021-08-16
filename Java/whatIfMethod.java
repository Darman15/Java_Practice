public class whatIfMethod {

    // running if... else statements within methods is common
    // example below checks a age limit
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("You are not old enough to enter");
        } else {
            System.out.println("You may enter");
        }
    }

    public static void main(String[] args) throws Exception {

        checkAge(22);

    }

}
