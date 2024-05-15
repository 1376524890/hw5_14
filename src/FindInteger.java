import java.math.BigInteger;

public class FindInteger {
    public static void main(String[] args) {
        BigInteger longMaxValue = BigInteger.valueOf(Long.MAX_VALUE);
        BigInteger start = BigInteger.valueOf((long) Math.ceil(Math.sqrt(Long.MAX_VALUE)));

        int count = 0;
        while (count < 10) {
            BigInteger square = start.multiply(start);
            if (square.compareTo(longMaxValue) > 0) {
                System.out.println(square);
                count++;
            }
            start = start.add(BigInteger.ONE);
        }
    }
}
