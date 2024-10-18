import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] arr=new int[x];
        int max=arr[0];
        for(int i=0;i<x;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
        
        System.out.println();
        for(int i=0;i<x;i++){
            if(arr[i]>max ){
                max=arr[i];
            }
        }
        max=0;
        int Smax=arr[1];
        
        for(int i=1;i<x;i++){
            if(arr[i]>Smax ){
                Smax=arr[i];
            }
        }
        System.out.println("S"+Smax);

    }
}
