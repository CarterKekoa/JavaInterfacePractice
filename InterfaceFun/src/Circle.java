public class Circle extends Object implements Comparable<Circle>, Shape{
    //<T> parameterized type AKA generic
    private Point center;
    private double radius;

    public Circle(){
        center = new Point();
        radius = 1.0;

    }

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public Circle(int x, int y, double radius){
        this.center = new Point(x, y);
        this.radius = radius;
    }

    @Override
    public String toString(){
        return "Circle(" + "center=" + center + ", radius=" + radius;
    }

    @Override
    public int compareTo(Circle o) {
        //what is the reference to the invoking circle object? this!!
        //compares circles by the size of radius
        //can write this much shorter
        if(this.radius < o.radius){
            return -1;
        }
        if(this.radius > o.radius) {
            return 1;
        }
        return 0;
    }

    @Override
    public double computePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * Math.pow(radius, 2.0);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //NESTED CLASSES
    //a class defined inside another class
    //outer class: these are not nested, "normal" classes we have been working with
    //outer classes can be public or package-private

    //4 types of nested classes
    //1. static class (we will make Point a static nested class of Circle)
    //2. non-static nested call (AKA inner class)
    //3. local inner class (non-static nested class defined inside a mehtod)
    //4. anonymous inner class (local inner class without a name)

    //1. static nested class //dont need a circle instance
    public static class Point {
        private int xPoint;
        private int yPoint;

        public Point(int x, int y){
            this.xPoint = x;
            this.yPoint = y;
        }

        public Point(){
            this.xPoint = 0;
            this.yPoint = 0;
        }

        @Override
        public String toString(){
            String pointStr = "";
            pointStr += "(" + xPoint + ", " + yPoint + ")";
            return pointStr;
        }

        public int getxPoint() {
            return xPoint;
        }

        public int getyPoint() {
            return yPoint;
        }

        public void setxPoint(int xPoint) {
            this.xPoint = xPoint;
        }

        public void setyPoint(int yPoint) {
            this.yPoint = yPoint;
        }
    }

}
