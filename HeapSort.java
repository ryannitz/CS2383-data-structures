class HeapSort{

    public static void main(String[] args){
        int[] A = {3,6,10,18,8,7,25,40};
        sort(A);
        show(A);
    }
    
    public static void sort(int[] A){
        buildHeap(A, A.length);

        //do the sort here. If I even need to do it after heapifying it.
    }

    // Function to build a Max-Heap from the Array
    static void buildHeap(int arr[], int n)
    {
        //last non-leaf node
        int startIdx = (n/2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    static void heapify(int arr[], int n, int i){
        int largest = i; // Initialize largest as root
        int left = 2 * (i+1); // left = 2*i + 1
        int right = 2 * (i+2); // right = 2*i + 2

        if (left < n && arr[left] > arr[largest]){
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]){
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            //heapify the subtree
            heapify(arr, n, largest);
        }
    }

    public static void show(int[] A){
        String arrayOut = "{" + A[0];
        for(int i = 1; i < A.length; i++){
            arrayOut += "," + A[i];
        }
        System.out.println(arrayOut + "}");
    }
}