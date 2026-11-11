package sele.rz;

public class App {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        App app = new App();
        System.out.println("Addition: " + app.add(10, 20));
        System.out.println("Multiplication: " + app.multiply(5, 4));
    }
}
