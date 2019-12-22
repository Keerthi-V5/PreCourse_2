package com.Exercise5;

public class BinarySearch {


    int binSear(int arr[],int l, int h, int x){

        int mid;
        if(h >= l){

            mid = (l+h)/2;

            if(arr[mid] == x){
                return mid;
            }

            if(arr[mid]> x){
                return binSear(arr,l,mid - 1,x);
            }

            return binSear(arr,mid + 1,h,x);

        }

        return -1;
    }

    public static void main(String args[]){
        System.out.println("Binary Search");
        int arr[] = new int[]{1,3,4,6,9,10};
        BinarySearch bs = new BinarySearch();
        int res = bs.binSear(arr,0,arr.length - 1,10)+1;
        if(res == 0){
            System.out.println("Element not found in the array");
        }
        else{
            System.out.println("Element is found in the array at position " + res);
        }
    }

}


