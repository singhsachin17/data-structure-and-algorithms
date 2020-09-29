import java.util.*;

public class binarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//Creating Scanner object for input
		int size = sc.nextInt();             	    //Taking size as input
		int arr[] = new int[size];
		for(int i =0;i<size;i++) {
			//taking array items in input
			arr[i]= sc.nextInt();
		}
		Arrays.sort(arr);        					//Sorted array is must for binary search
		int key=sc.nextInt();   					//Taking key to be searched
		
		sc.close();
		
		int index = search(arr,0,arr.length,key)+1; 				//calling the function
		if(index!=0) {
			System.out.println("The value "+key+" is present at position "+index+".");
		}
		else {
			System.out.println("The value "+key+" is not present in array.");
		}
	}
	private static int search(int arr[],int start,int end,int key) {
		if(start<=end) {
			//if start surpasses end it means array has been checked fully and key is absent
			
			int mid = start +(end-start)/2;				//calculating mid index
			if(arr[mid]==key) return mid;				//checking if it is equal to key
			//if value is not found in mid position 
			if(key>arr[mid]) {
				return search(arr,mid+1,end,key);   //recursively calling on last half array based on condition
			}
			else
			{
				return search(arr,start,mid-1,key);
			}
			
		}
		return -1; 										//if not present returning -1;
	}

}
