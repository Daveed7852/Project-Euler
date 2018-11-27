

public class Project7 {
    public static void main(String[] args) {
        int count = -1, max = 1000000000, prime = 0;
            for (int i = 1; i < max; i++) {
                boolean isPrime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }

                }
                if (isPrime) {
                    prime = i;
                    count++;

                }
                if(count==10001){
                    break;
                }
            }
        System.out.print(prime);
    }
}

