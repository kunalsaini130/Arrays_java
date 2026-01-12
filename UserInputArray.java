import java.util.Scanner;
public class UserInputArray {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the length of array :");
        int n=sc.nextInt();

        int arr []=new int[n];

        System.out.println("Enter the element : ");

        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        int large= arr[0];

        for(int j=1; j<arr.length; j++){
            if(arr[j]>large){
                large=arr[j];
            }
        }
        System.out.println("large Element : " +large);



        sc.close();
    }
    
}
