import java.util.Scanner;
public class SmallestElement {

    public static void main(String[] args) {
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n= st.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the Element :");
        for(int i=0; i<n; i++){
            arr[i]=st.nextInt();
        }
        int small=arr[0];

        for(int j=1; j<arr.length; j++){
            if(arr[j]< small){
                small=arr[j];

            }
        }
        st.close();



        System.out.println("SmallestElement "+ small);
        
    }
}