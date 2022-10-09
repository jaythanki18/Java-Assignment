//THIS PROGRAM PREPARED BY Jay Thanki 21CE143
package PracticalAssignment;
interface Colorable {
    static void howToColor() {
    }
}

class GeometricObject1 implements Colorable {
    static void howToColor() {
        System.out.println("Color of the each side is Green");
    }
}

class Square extends GeometricObject1 {
    private double side1 = 0;

    Square() {
        System.out.println("The Default Squre is :");
        System.out.println("The area of square is : " + side1 * side1);
        System.out.println();
    }

    public double getside1() {
        return side1;
    }

    public void setside1(double side1) {
        this.side1 = side1;
    }

    public void area() {
        System.out.println("The Squre Successfully Created!!!!");
        System.out.println("The area of square is : " + this.side1 * this.side1);
    }
}

class P9 extends GeometricObject1 {
    public static void main(String[] args) {
        Square s = new Square();
        // pr9 p = new pr9();
        // p.howToColor();
        s.setside1(10);
        s.getside1();
        s.area();
    }
}