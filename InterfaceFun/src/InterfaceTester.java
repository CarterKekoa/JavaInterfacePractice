import java.util.Arrays;
import java.util.Random;

public class InterfaceTester {
    public static void main(String[] args) {
        System.out.println("Output 1: " + "zags".compareTo("apple"));
        System.out.println("Output 2: " + "zags".compareTo("Zags"));
        System.out.println("Output 3: " + "zags".compareTo("zigs"));
        System.out.println("Output 4: " + "zags".compareTo("zags"));
        System.out.println("Output 5: " + "zags".equals("zags"));
        System.out.println("Output 6: " + "zags".equals("Zags"));

        Circle myCircle = new Circle();

        System.out.println("Output 7: " + myCircle.equals(myCircle));
        System.out.println("Output 8: " + new Circle().equals(new Circle()));

        System.out.println("Output 9: " + myCircle.compareTo(myCircle));
        //inheritance: a set of methods that a class promises to implement
        //Java provides a Comparable interface

        //an interface provides a reference type
        Comparable myComparable = myCircle; //another example of polymorphism

        //we can define our own interfaces!!
        Shape myShape = myCircle;

        //with Comparable, we can now sort our circles
        Circle[] myCircles = new Circle[5];
        Random rand = new Random();
        for(int i = 0; i < myCircles.length; i++){
            myCircles[i] = new Circle(i, i, rand.nextDouble());
        }
        System.out.println(Arrays.toString(myCircles));
        Arrays.sort(myCircles);
        System.out.println(Arrays.toString(myCircles));

        //task: define a Rectangle that is also a Shape
        //declare and initialize and array of Shape references
        //include a few Circles and Rectangles
        Rectangle rectangle = new Rectangle();

        Shape[] myShapes = new Shape[3];
        myShapes[0] = myCircle;
        myShapes[1] = rectangle;
        //myShapes[2] = new Rectangle(4,7);
        myShapes[2] = new Shape() {
            //5x5 square
            @Override
            public double computePerimeter() {
                return 20;
            }

            @Override
            public double computeArea() {
                return 25;
            }
        };


        for(Shape shape : myShapes){
            System.out.println(shape);
            System.out.println(shape.computePerimeter());
            System.out.println(shape.computeArea());
            System.out.println("**********************");
        }
    }
}
