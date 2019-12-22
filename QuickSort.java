package com.Exercise6;

public class QuickSort {

    void sort(int arr[], int low, int high){
        if(low < high){
            int par = partition(arr,low,high);
            sort(arr, low, par-1);
            sort(arr, par+1, high);
        }
    }

    void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    int partition(int arr[], int low, int high){
        int pivot = high;
        int s = low;

        for(int i=low; i<=high; i++){
            if(arr[i] < arr[pivot]){
                swap(arr, s, i);
                s++;
            }
        }
        swap(arr, s, pivot);
        return s;
    }

    public static void main(String args[]){
        QuickSort qs = new QuickSort();

        int arr[] = new int[]{10, 80, 30, 90, 40, 50, 70};

        System.out.println("Before sorting");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        qs.sort(arr,0, arr.length-1);

        System.out.println("After sorting");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
