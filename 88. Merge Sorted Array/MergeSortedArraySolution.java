import java.util.Scanner;

public class MergeSortedArraySolution {
    private int m,n;
    private int[] nums1;
    private int[] nums2;
    private int[] mergedArray;


    public MergeSortedArraySolution(){
        arrayInput();
        mergedArray = mergeSortedArray(nums1, nums2);
        arrayPrint(mergedArray);
    }

    /**
     * Takes input for two arrays nums1 and nums2 from the user.
     */
    private void arrayInput(){
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter m: ");
            m = scanner.nextInt();

            System.out.println("Enter n: ");
            n = scanner.nextInt();

            nums1 = new int[m];
            nums2 = new int[n];

            System.out.println("Enter nums1 : ");
            for(int i=0; i<m; i++){
                nums1[i] =  scanner.nextInt();
            }

            System.out.println("Enter nums2: ");
            for(int i=0; i<n; i++){
                nums2[i] = scanner.nextInt();
            }
        } finally {
            scanner.close();
        }
    }

    /**
     * Sort array in ascending order
     * 
     * @param arr Array to be sorted
     * @return A soted array
     */
    private int[] arraySort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int temp = arr[i];
                if(arr[i] <= arr[j]){
                    continue;
                }else{
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    /**
     * Merge two arrays into single sorted array
     * 
     * @param nums1 First array
     * @param nums2 Second array
     * @return A merged and sorted array
     */
    private int[] mergeSortedArray(int[] nums1, int[] nums2){
        int[] arr = new int[nums1.length + nums2.length];
        int index = 0;
        for(int i=0; i<nums1.length; i++){
            arr[index++] = nums1[i];
            }
        for(int j=0; j<nums2.length; j++){
            arr[index++] = nums2[j];    
            }
        
        return arraySort(arr);
    }

    /**
     * Prints the elements of the given array.
     * 
     * @param arr The array to print
     */
    private void  arrayPrint(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
