import java.util.Scanner;

public class MergeSortedArraySolution {
    int m,n;
    int[] nums1 = new int[m];
    int[] nums2 = new int[n];
    int[] arr = new int[m+n];


    public MergeSortedArraySolution(){
        arrayInput();
        arr = mergeSortedArray(nums1, nums2);
        arrayPrint(arr);
    }

    public void arrayInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter m: ");
        m = scanner.nextInt();

        System.out.println("Enter n: ");
        n = scanner.nextInt();

        System.out.println("Enter nums1 : ");
        for(int i=0; i<m; i++){
            nums1[i] =  scanner.nextInt();
        }

        System.out.println("Enter nums2: ");
        for(int i=0; i<n; i++){
            nums2[i] = scanner.nextInt();
        }
    }

    public int[] arraySort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int n = arr[i];
                if(arr[i] <= arr[j]){
                    continue;
                }else{
                    arr[i] = arr[j];
                    arr[j] = n;
                }
            }
        }
        return arr;
    }

    public int[] mergeSortedArray(int[] nums1, int[] nums2){
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

    public void  arrayPrint(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

}
