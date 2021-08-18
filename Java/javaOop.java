public class javaOop {
    int x = 5;
    int y = 6;

    public static void main(String[] args) throws Exception {

        // an object is created from a class, we created the class named Main
        // To create object of Main, specify class name and follow it with object name
        // use keword new

        javaOop practiceObject = new javaOop();
        System.out.println(practiceObject.x);

        javaOop objectOne = new javaOop();

        javaOop objectTwo = new javaOop();

        System.out.println(objectOne.x);
        System.out.println(objectTwo.y);

    }
}