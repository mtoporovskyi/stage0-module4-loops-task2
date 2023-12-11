package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) { // 9
        int candidate = 2;

        while (candidate <= printToInclusive) {
            int divisor = 2;  //

            while (divisor <= candidate) {
                if (candidate == divisor) {
                    System.out.println(candidate);
                }
                if (candidate % divisor == 0) {
                    break;
                }
                divisor++;
            }
            candidate++;
        }
    }
}
