public class classMethods {

    static void myStaticMethod() {
        System.out.println("A static method can be called without creating an object");
    }
    // static methods can be accessed without creating an object of the class

    public void myPublicMethod() {
        System.out.println("A public method must be called by creating objects first");
    }

    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }

    public void speed(int Maxspeed) {
        System.out.println("The car can go: " + Maxspeed + " Per hour.");
    }

    public static void main(String[] args) throws Exception {

        myStaticMethod();
        // no object was created prior to calling this method

        classMethods myObj = new classMethods();
        myObj.myPublicMethod();

        // the above utilizes a public method which must have a object created to use

        classMethods myCar = new classMethods();

        myCar.fullThrottle();
        myCar.speed(200);
        // . notation is used to access the attributes and methods

    }
}
