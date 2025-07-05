import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int k=arr[i];
                    arr[i]=arr[j];
                    arr[j]=k;
                }
            }
        }
        int index_odd=0;
        int index_even=n-1;
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            if(i%2!=0){
                arr1[i]=arr[index_odd];
                index_odd++;
            }
            else{
                arr1[i]=arr[index_even];
                index_even--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}