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
    static double [] quickSort (double a[]){
	
		 //todo: implement the sort

    }//end quicksort

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
    		printArray(insertionSort(list10));
        //todo: do experiments as per assignment instructions
    }
    
    public static void printArray(double a[]) {
    		for(int i=0; i<a.length; i++) {
    			System.out.print(a[i] + ", ");
    		}
    		System.out.println();
    }

 }//end class
