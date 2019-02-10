import java.io.*;
import java.util.Scanner;

// -------------------------------------------------------------------------

/**
 *  This class contains static methods that implementing sorting of an array of numbers
 *  using different sort algorithms.
 *
 *  @author
 *  @version HT 2019
 */

 class SortComparison {
    /**
     * Sorts an array of doubles using InsertionSort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order.
     *
     */
    static double[] insertionSort (double[] a){
    		double tmp;
    		for(int i=1; i<a.length; i++) {
    			for(int j=i; j>0; j--) {
    				if((a[j-1]) > a[j]) {
    					tmp = a[j];
    					a[j] = a[j-1];
    					a[j-1] = tmp;
    				}
    			}
    		}
    		return a;
    }//end insertionsort

    /**
     * Sorts an array of doubles using Quick Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    
    /** 
     * 
     * Quicksort needs to partition array and recursively quicksort both halves of 
     * the partition.
     * 
     * The partition function is a separate function that orders the array
     * such that one number, namely the pivot, is in the correct position
     * and all elements with lower index have value less than pivot
     * (although not necessarily in order) and all higher index values
     * are great than pivot.
     * 
     * */
    
    // Non-recursive method initiates recursive method with suitable initial values.
    // The same array, a, is edited throughout and then returned after sorting.
    static double [] quickSort (double a[]){
    		quickSortRecursive(a, 0, a.length-1);
    		return a;
    }
    
    static void quickSortRecursive(double a[], int lo, int hi) {
    		if(lo < hi) {
    			int pivotIndex = partition(a, lo, hi);
    			quickSortRecursive(a, lo, pivotIndex-1);
    			quickSortRecursive(a, pivotIndex+1, hi);
    		}
    }
    
    static int partition(double a[], int lo, int hi) {
    		double pivot = a[hi]; // pivot is last element in array
    		int i = lo-1; // i pointer is 1 index less than first element
    		
    		for(int j=lo; j<hi; j++) { // iterate through list
    			if(a[j] <= pivot) { // when jth element is <= pivot, iterate i & swap
    				i++;
    				swap(a, i, j);
    			}
    		}
    		
    		swap(a, i+1, hi);
    	
    		return i+1;
    }
    
    static void swap(double a[], int i, int j) {
    		double temp = a[i];
    		a[i] = a[j];
    		a[j] = temp;
    }

    /**
     * Sorts an array of doubles using Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    /**
     * Sorts an array of doubles using iterative implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */

    static double[] mergeSortIterative (double a[]) {

		 //todo: implement the sort
	
    }//end mergesortIterative
    
    
    
    /**
     * Sorts an array of doubles using recursive implementation of Merge Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     *
     * @param a: An unsorted array of doubles.
     * @return after the method returns, the array must be in ascending sorted order.
     */
    static double[] mergeSortRecursive (double a[]) {
    	

    	//todo: implement the sort
	
   }//end mergeSortRecursive
    	
    
    /**
     * Sorts an array of doubles using Selection Sort.
     * This method is static, thus it can be called as SortComparison.sort(a)
     * @param a: An unsorted array of doubles.
     * @return array sorted in ascending order
     *
     */
    static double [] selectionSort (double a[]){

         //todo: implement the sort

    }//end selectionsort

   


    public static void main(String[] args) throws FileNotFoundException {
    		// Input numbers from file and store them in an array
    		File file = new File("numbers10.txt");
    		BufferedReader br = new BufferedReader(new FileReader(file));
    		Scanner input = new Scanner(br);
    		double[] list10 = new double[10];
    		for(int i=0; input.hasNextDouble(); i++) {
    			list10[i] = input.nextDouble();
    		}
    		input.close();
    		printArray(list10);
    		printArray(quickSort(list10));
        //todo: do experiments as per assignment instructions
    }
    
    public static void printArray(double a[]) {
    		for(int i=0; i<a.length; i++) {
    			System.out.print(a[i] + ", ");
    		}
    		System.out.println();
    }

 }//end class
