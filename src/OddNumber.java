import java.util.Arrays;

public class OddNumber {

    public static void main(String[] args) {

        int[] numbers = {-1,-2,-3,4,-5,6,7};
        // Aproch 1
        System.out.println("Odd Logic Approch: 1");
        Arrays.stream(numbers).filter(num -> num % 2 != 0).forEach(System.out::println);
        // Aproch 2
        System.out.println("Odd Logic Approch: 2");
        Arrays.stream(numbers).filter(num -> (num & 1) != 0).forEach(System.out::println);
    }
}
