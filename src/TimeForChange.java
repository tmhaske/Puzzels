import java.math.BigDecimal;
public class TimeForChange {

    public static void main(String[] args) {
        System.out.println(2.00 - 1.10); // 0.8999999999999999
        System.out.println("Approch 1 but slower");
        System.out.println(new BigDecimal("2.00").subtract(new BigDecimal("1.10")));
        System.out.println("Approch 2 better");
        System.out.println((200-110) + " cents");
    }
}
