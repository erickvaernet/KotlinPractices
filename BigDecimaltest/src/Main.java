import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal bg = new BigDecimal(10);
        System.out.println(bg.divide(new BigDecimal(3),3 ,RoundingMode.CEILING));
    }
}