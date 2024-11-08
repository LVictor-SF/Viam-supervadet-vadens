import java.util.Scanner;

public class checkPlsCounter {
    public static void main(String[] args) {
        Counter even = new Counter("EvenCounter");
        Counter odd = new Counter("OddCounter");

        for (int i = 1; i <=100 ; i++) {
            if (i % 2 == 0) {
                even.counterUp();
            }
            if (i % 2 != 0) {
                odd.counterUp();
            }
        }
        System.out.printf("Нечетные числа: %d\nЧетные числа: %d", odd.counter, even.counter);
    }
}
class Counter{
    String counterName;
    int counter;

    public Counter(String counterName) {
        this(counterName, 0);
    }
    public Counter(String counterName, int counter) {
        this.counterName = counterName;
        this.counter = counter;
    }

    public int counterUp() {
        this.counter += 1;
        return counter;
    }
    public int counterDown() {
        this.counter -= 1;
        return counter;
    }
    public int counterUserDown(int num) {
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();

        scanner.close();

        this.counter -= num;
        return counter;
    }
}