public class LargeElement {
    public static void main(String[] args) {
        
    int arr[]={22,33,5,66,77,89,90};
    int large=arr[0];

    for (int i=1; i<arr.length; i++){
        if(arr[i]>large){
            large=arr[i];
        }
    }
    System.out.println("Large element " +large);
    
}
}
