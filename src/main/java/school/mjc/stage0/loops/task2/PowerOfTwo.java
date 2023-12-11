package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int num = 1;

        if (power < 0) {
            System.out.println("too much power");
        } else {
            System.out.println(1);
            while (num <= power) {
                System.out.println(1 << num);
                num++;
            }
        }
    }
}
