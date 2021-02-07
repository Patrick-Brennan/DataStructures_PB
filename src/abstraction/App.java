package abstraction;

public class App {
    public static void main(String[] args) {
        Shape c = new Circle(); //polymorphism
        printName(c);

        Square s = new Square();
        printName(s);

        s.doSomething();

    }

    public static void printName(Shape shape){
        System.out.println(shape.getName());
    }

}
