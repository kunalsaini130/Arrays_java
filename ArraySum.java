public class ArraySum {
    public static void main(String[] args) {
        int arr[]={22,43,12,-13 };
        int sum=0;

        System.out.println( "Lenght "+arr.length);
        for(int i=0;i<arr.length; i++){

            sum +=arr[i];
        
        }
        System.out.println(sum);
    }
    
}
