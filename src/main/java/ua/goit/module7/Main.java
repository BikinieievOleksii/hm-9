package ua.goit.module7;

class Main {
    public static void main(String[] args) {
        PrintShape printShape = new PrintShape();

        System.out.println(printShape.get(new Cube()));
    }
}
