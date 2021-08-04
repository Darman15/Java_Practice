public class expressions {
    public static void main(String[] args) throws Exception {

        int friends = 10;

        friends += 1;

        System.out.println(friends);

        // or

        friends = friends - 1;

        System.out.println(friends);

        // or if single increment

        friends++;

        System.out.println(friends);

        // int data type will automatically convert modualas, to avoid convert the data
        // type

        double thisNum = 10;

        thisNum = (double) thisNum / 3;

        System.out.println(thisNum);
    }
}