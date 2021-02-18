package quiz2_Q2;

public class App {
    static SuperFibs f = new SuperFibs();
    public static void main(String[] args) {
		System.out.printf("1 : %d, steps %d", f.getNthFib(0), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("2 : %d, steps %d", f.getNthFib(1), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("3 : %d, steps %d", f.getNthFib(2), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("4 : %d, steps %d", f.getNthFib(3), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("5 : %d, steps %d", f.getNthFib(4), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("6 : %d, steps %d", f.getNthFib(5), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("7 : %d, steps %d", f.getNthFib(6), SuperFibs.stepsCount);
		System.out.println();
		System.out.printf("8 : %d, steps %d", f.getNthFib(200), SuperFibs.stepsCount);
		System.out.println();
    }
}
