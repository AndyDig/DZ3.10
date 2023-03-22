public class Main {
    public static void main(String[] args) {
        int a = 458745;
        int b = 66674;
        int c = 9587;
        if (a > b && a > c) {
            System.out.println("a max");
        }
        if (b > a && b > c) {
            System.out.println("b max");
        }
        if (c > a && c > b) {
            System.out.println("c max");
        }
        if (a < b && a < c) {
            System.out.println("a min");
        }
        if (b < a && b < c) {
            System.out.println("b min");
        }
        if (c < a && c < b) {
            System.out.println("c min");

        }
    }
}