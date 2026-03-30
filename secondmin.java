public class Main{
    public static void main(String[] args){
        int[] arr = {10, 5, 20, 8};
        int min=arr[0];
        int secondmin=Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                secondmin=min;
                min=arr[i];
            }
        if(arr[i]<secondmin && arr[i]!=min){
            secondmin=arr[i];
        }
        }
        System.out.println(secondmin);
    }
}
