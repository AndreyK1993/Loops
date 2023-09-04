package loops;

public class Main {

    static int sum;
    static int count;

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6};

        for (int num : numbers) {

            count++;

            System.out.println(count + ") Num is " + num +

            ", sum is " );

            sum += num;
        }

        System.out.println("Sum of numbers is " + sum);
    }
}