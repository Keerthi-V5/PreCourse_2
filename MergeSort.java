package com.Exercise8;

public class MergeSort {

    void sort(int arr[], int l, int r){

        if(l<r){
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr, m+1, r);

            merge(arr, l, m, r);
        }
    }

    void merge(int arr[], int l, int m, int r){
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i=0; i<n1; i++){
            L[i] = arr[l+i];
        }

        for(int j=0; j<n2; j++){
            R[j] = arr[m+1+j];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){

            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
                k++;
            }
            else{
                arr[k] = R[j];
                j++;
                k++;
            }
        }

        while(i<n1){
            arr[k] = L[i];
            i++;
            ++k;
        }

        while(j<n2){
            arr[k] = R[j];
            j++;
            ++k;
        }


    }

    public static void main(String args[]){
        MergeSort  ms = new MergeSort();

        int arr[] = new int[]{10, 80, 30, 90, 40, 50, 70};

        System.out.println("Before sorting");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        ms.sort(arr,0, arr.length-1);

        System.out.println("After sorting");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
