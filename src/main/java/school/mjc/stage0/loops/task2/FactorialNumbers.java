package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1, num = 1;

        if (printToInclusive == 0) {
            System.out.println(1);
        }

        while (num <= printToInclusive) {
            if (num == 1) {
                System.out.println(1);
            }
            factorial *= num;
            System.out.println(factorial);
            num++;
        }
    }
}
