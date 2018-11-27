public class Project6 {
    public static void main(String [] args){
        int sumOfSquare=0,i=1,j=1,totalSumSquared=0,sum;
        while(i<=100){
            sumOfSquare=sumOfSquare + i*i;
            i++;
        }
        System.out.println(sumOfSquare);
        while(j<=100){
            totalSumSquared=totalSumSquared+j;
            j++;
        }
        totalSumSquared=totalSumSquared*totalSumSquared;
        System.out.println(totalSumSquared);
        sum=totalSumSquared-sumOfSquare;
        System.out.println(sum);
    }
}
