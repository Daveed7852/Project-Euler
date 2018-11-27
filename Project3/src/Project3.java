public class Project3 {
    public static void main(String[] args) {
        Long num = 600851475143L;
        Long num1;

        for (int i = 1; i < 1000000; i++) {

            boolean isPrime = true;

            for (int j = 2; j < i; j++) {

                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime && num%i==0){
                num1= num/i;
                System.out.print(i + " ");
                num=num1;
            }
            if (num==1){
                break;
            }
        }
    }
}
