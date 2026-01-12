import java.util.Arrays;
import java.util.Scanner;
public class SortArray {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);

        System.out.print("Enter the length :");
        int n= st.nextInt();
        int arr[]=new int[n];

        for(int i=0; i<n; i++){
            arr[i]=st.nextInt();
            
        }
        Arrays.sort(arr);

        System.out.println("Shorted array");

        for(int num : arr){
            System.out.print(num + " ") ;
        }
        st.close();
    }
    
}
