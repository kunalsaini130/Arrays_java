import java.util.Scanner;
public class SumArrayByInp {
    public static void main(String[] args) {
        Scanner st =new Scanner(System.in);
        System.out.print("Enter the Size :");
        int n=st.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0; i<n;i++){
            arr[i]=st.nextInt();


        }
        for(int j=0;j<n;j++){

            sum+=arr[j];
            System.out.print(sum +" ");
            
        }

        st.close();
    }
    
}
