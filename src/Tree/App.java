package Tree;

public class App {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(12);
        intTree.insert(10);

        System.out.println(intTree.min());
    }
}
