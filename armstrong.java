public class Main{
    public static void main(String[] args){
        int n=370;
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }if(sum==temp){
            System.out.println("armstrong");
        }else{
            System.out.println("not armstrong");
        }
    }
}
