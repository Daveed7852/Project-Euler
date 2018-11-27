public class Project10 {

    static boolean isPrime(int n)
{
    // Corner case
    if (n <= 1)
        return false;

    // Check from 2 to n-1
    for (int i = 2; i < n; i++)
        if (n % i == 0)
            return false;

    return true;
}
    public static void main(String []args){
    /*    float prime = 0;
        int max=10;
        for(int i=2;i<=max;i++){
            if(isPrime(i))
            {
                prime=+ i;
            }
        }
        System.out.printf("%.0f",prime);*/
    int max = 2000000;
    float prime = -1;
            for (int i = 1; i < max; i++) {
        boolean isPrime = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }

        }
        if (isPrime) {
            prime = prime + i;


        }

    }
        System.out.printf("sum: %.0f\n", prime);


    }
}

