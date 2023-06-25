package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        if (first > second) {
            if (first > third) {
                System.out.println(first);
            } else {
                System.out.println(third);
            }
        } else if (third > second) {
            System.out.println(third);
        } else {
            System.out.println(second);
        }
    }
}
