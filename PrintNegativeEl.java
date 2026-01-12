import java.util.Scanner;
public class PrintNegativeEl {
    public static void main(String[] args) {
        Scanner st=new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n=st.nextInt();
        int arr[]= new int[n];

        for(int i=0; i<n;i++){
            arr[i]=st.nextInt();

        }

        for (int i : arr) {
            if (i<0) {
                System.out.print(i +" ");

                
            }
            if (i>0) {
                System.out.print(i +" ");
                
            } 
                
            
                
            
            
        }



        st.close();
    }

    
}