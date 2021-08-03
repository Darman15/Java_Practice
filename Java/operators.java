public class operators {
    public static void main(String[] args) throws Exception {

        System.out.println("Test");

        // Operators
        // +

        int x = 2 + 2;

        System.out.println(x);

        // Can be used with Variables and Variable or variable and value

        int y = 5;
        int u = 7;

        System.out.println(y + u);
        System.out.println(y + 1);

        // Subtraction

        System.out.println(2 - 1);
        System.out.println(u - y);
        System.out.println(u - 2);

        // Multiply

        System.out.println(2 * 2);
        System.out.println(u * 3);

        // divide

        System.out.println(10 / 2);

        // Modulus

        System.out.println(11 % 2);
        System.out.println(7 % 3);

        // increment the variable by 1

        System.out.println(++y);

        // Decrement the variable by 1

        System.out.println(--u);

        // The = is the assignment operator

        int z = 10;
        System.out.println(z);

        // use += or other assignment operators to alter variables

        z += 3;
        System.out.println(z);

        z -= 3;
        System.out.println(z);

        z *= 3;
        System.out.println(z);

        z /= 3;
        System.out.println(z);

        z %= 3;
        System.out.println(z);

        z &= 3;
        System.out.println(z);

        int a = 5;
        int b = 10;

        // Comparison Operators == Equal too
        System.out.println(x == y);

        // != not equal too

        System.out.println(a != b);

        // < and >

        System.out.println(a > b);
        System.out.println(a < b);

        System.out.println(a <= b);

        // Comparison Operators
        // && returns true if both are true

        System.out.println(a < 11 && b > 9);

        // returns true if one of the statements are true

        System.out.println(a == 5 || b > 12);

        // ! returns false if the result is true
        // a does equal 5 but it returns false

        System.out.println(!(a == 5));

    }
}