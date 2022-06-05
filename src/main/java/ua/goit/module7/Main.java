package ua.goit.module7;

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape quad = new Quad();
        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();
        Shape cube = new Cube();

        circle.printName();
        quad.printName();
        triangle.printName();
        rectangle.printName();
        cube.printName();
    }
}
