public class Project5 {

    private static Boolean checkIsDivisible(int number, int divisor) {
        if (number % divisor == 0) {
            return divisor == 20 ? Boolean.TRUE : checkIsDivisible(number, divisor + 1);
        } else {
            return Boolean.FALSE;
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 1000000000; i++) {
            if (checkIsDivisible(i, 1)) {
                System.out.println(i);
                break;
            }
        }

    }

    // 232792560
}
