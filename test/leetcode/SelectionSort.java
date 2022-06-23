package leetcode;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        //每次比较记录一下更小的下标
        int minIndex;
        //交换时使用的变量
        int tmp;
        for(int i=0;i<arr.length-1;i++){
            minIndex=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            tmp=arr[minIndex];
            arr[minIndex]=arr[i];
            arr[i]=tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,3,5,8,6,4,21,10,23,24,25,26,27};
        selectionSort(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
