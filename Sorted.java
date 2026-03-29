public class Main{
    public static void main(String[] args){
        int[] arr={5,4,3,2,1};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                issorted=false;
                break;
            }
        }if(issorted){
            System.out.println("sorted");
        }else{
            System.out.println("not sorted");
        }
    }
}
