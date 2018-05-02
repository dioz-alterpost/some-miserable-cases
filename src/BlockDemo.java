public class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 0;
        j = 0.1;

        if (i != 0) {
            System.out.println("i doesn't equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
        if (i == 0) {
            System.out.println("i equal zero");
        }
    }
}