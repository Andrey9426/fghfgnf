import java.util.Arrays;

public class Application {

    public static void main(String[] args) {
        int[] a = {3,2,6,7,9,4};
        bubbleSort(a);
        System.out.println("max element: "+getMax(a));
    }



    public static void bubbleSort(int[]arr){
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }

        }
        System.out.println("sorted array"+Arrays.toString(arr));
    }

    public static int getMax(int[]arr){
        int indexOfMax=0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]>arr[indexOfMax]){
                indexOfMax=i;
            }
        }
        return arr[indexOfMax];
    }
}
