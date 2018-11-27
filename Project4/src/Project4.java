public class Project4 {
    public static void main(String [] args){
        String rev;
        Integer sum;
        String temp;
        for (int i=999;i>=0;i--){
            for(int j=999;j>=i;j--){
                sum = i*j;
                rev="";
                temp = Integer.toString(sum);
                for(int k=sum.toString().length()-1;k>=0;k--){
                    rev = rev + sum.toString().charAt(k);
                }
                if(temp.equals(rev)){
                    System.out.println(sum);
                    //System.exit(0);
                }
            }
        }



    }

}
