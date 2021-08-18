public class classAttributes {

    int x = 5;
    int y = 4;
    int z;
    final int u = 15;

    // use word final to ensure attribute can not be changed.
    public static void main(String[] args) throws Exception {

        // assess attributes in the above class using . syntax

        classAttributes myobj = new classAttributes();
        System.out.println(myobj.x);

        // setting class attributes in code

        classAttributes objTwo = new classAttributes();
        objTwo.z = 40;
        System.out.println(objTwo.z);

        // Override existing attributes

        classAttributes objThree = new classAttributes();
        objThree.y = 25;
        System.out.println(objThree.y);

    }
}
