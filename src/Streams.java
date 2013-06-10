import java.util.stream.*;
public class Streams {

    public static void main(String[] args) {
        LongStream inteiros = LongStream.range(0, Long.MAX_VALUE);
        LongStream primos = inteiros.filter(n -> {
            return ehPrimo(n);
        });
        primos.limit(100l).forEach(i -> {
            System.out.println(i);
        });
    }

    public static boolean ehPrimo(long n) {
        for (int i = 2; i < n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
