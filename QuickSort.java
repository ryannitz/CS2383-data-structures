class QuickSort{

    public static void main(String[] args){
        int[] A = {3,6,10,18,8,7,25,40};
        sort(A);
        show(A);
    }
    
    public static void sort(int[] A){
        quickSort(A, 0, A.length-1);
    }

    public static void show(int[] A){
        String arrayOut = "{" + A[0];
        for(int i = 1; i < A.length; i++){
            arrayOut += "," + A[i];
        }
        System.out.println(arrayOut + "}");
    }

    public static int partition(int arr[], int low, int high) { 
        int pivot = arr[high];  
        int i = (low-1);
        for (int j = low; j < high; j++) { 
            if (arr[j] < pivot) { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 

        //swap arr[i+1] and arr[high] (the pivot) 
        i++;
        int temp = arr[i]; 
        arr[i] = arr[high]; 
        arr[high] = temp; 
        return i; 
    } 
  
    public static void quickSort(int arr[], int low, int high) { 
        if (low < high) {
            int partitionIndex = partition(arr, low, high); 
            quickSort(arr, low, partitionIndex-1); //low partition
            quickSort(arr, partitionIndex+1, high); //high partition
        } 
    } 
}