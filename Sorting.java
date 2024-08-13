import java.util.*;
public class Sorting{
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
    }
    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minInd=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minInd]>arr[j]){
                    minInd=j;
                }
            }
            swap(arr, i, minInd);
        }

    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int temp=arr[i];
            int j=i-1;
            
            while(j>=0 &&  temp<arr[j]){
                arr[j+1]=arr[j];//shift elements by one place forward
                j--;
            }
            arr[j+1]=temp;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        //Arrays.sort(arr);//inbuilt sort
        //Arrays.sort(arr,0,3 );
        //sort in descending order
        //method is applicable for arrays of class not of primitive datatype
        Arrays.sort(arr);
        Integer arr2[]={54,78,8,10};
        Arrays.sort(arr2,Collections.reverseOrder());
        
        printArr(arr);


    }
}