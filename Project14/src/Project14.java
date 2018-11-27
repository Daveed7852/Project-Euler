import java.util.Date;
public class Project14 {
    private static int count(int n){
        int count=0;
        long m=n;
        while(true){
            if(m==1){
            count++;
            break;
            }
            if(m%2==0){
                m=m/2;
                count ++;
            }
            else{
                m=(m*3)+1;
                count++;
            }
        }
        return count;
    }
    public static void main(String [] args){
        Date Start = new Date();
        int max=0,testMax,maxCount=0,testCount;
        for(int i=1;i<1000000;i++){
            testMax=i;
            testCount=count(i);
            if(testCount>maxCount){
                max=testMax;
                maxCount=testCount;
            }
        }
        System.out.println(max);
        System.out.println(maxCount);
        System.out.println((new Date().getTime()-Start.getTime())/100);
    }
}