
package Main;

public class Main {

    public static void main(String[] args) {
        double result = 0;
        for (double i = 1; i <= 10000; i++) {
            if (i % 2 == 0) {
                result -= 1 / i;
            } else if (i % 2 != 0) {
                result += 1 / i;
            }
        }
        System.out.println(result);
    }

}
