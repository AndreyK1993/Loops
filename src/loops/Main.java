package loops;

public class Main {

    static int sum;
    static int count;

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6}; //масив
        int T =0;

        for (int a = 0; a < numbers.length; a++) {

            count++; //лічільник
            T += numbers[a]; //сумма наростаюча

            System.out.println(count + ") Num is " + (a+1) +
            ", sum is " + T);

            sum += numbers[a]; //сумма масиву

        }

        System.out.println("\n" + "Sum of numbers is " + sum);
    }
}