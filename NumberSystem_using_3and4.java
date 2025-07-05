import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		arr[0]="3";
		arr[1]="4";
	    int next=2;
		for(int i=0;i<n;i++){
		    arr[next++]=arr[i]+"3";
		    if(next<n){
		    arr[next++]=arr[i]+"4";}
		    else{
		        break;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.println(arr[i]);
		}
	}
}