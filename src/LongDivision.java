import java.math.BigDecimal;

public class LongDivision {

    public static void main(String[] args) {

        final long MICRO_SEC = 24 * 60 * 60 * 1000 * 1000;
        final long MILI_SEC = 24 * 60 * 60 * 1000;
        System.out.println(MICRO_SEC / MILI_SEC); // 5

        final long MICRO_SEC1 = 24L * 60 * 60 * 1000 * 1000;
        final long MILI_SEC1 = 24L * 60 * 60 * 1000;
        System.out.println(MICRO_SEC1 / MILI_SEC1); // 1000 >> Correct Ans
    }
}
