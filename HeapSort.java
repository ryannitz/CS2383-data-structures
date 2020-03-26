class HeapSort{


    public static void main(String[] args){
        int[] A = {3,6,10,18,8,7,25,40};
        sort(A);
        //show(A);
    }

    public static void sort(int[] A){
        int n = A.length;
        for(int i = (n/2)-1; i >= 0; i--){
            siftdown(A, n, i);
        }

        System.out.println("Done Heapify");
        show(A);
        System.out.println("Starting Sort");

        for(int i = n-1; i >= 0; i--){
            //always root and i
            swap(A,0, i);
            siftdown(A, i, 0);
            show(A);
        }
    }

    public static void siftdown(int A[], int n, int i){
       // int n = arr.length;//might need to check this for the -1 on the length
        int largest = i; // Initialize largest as root

        int left = (2*i)+1;
        if (left < n && A[left] > A[i]){
            largest = left;
        }

        int right = (2*i)+2;
        if (right < n && A[right] > A[largest]){
            largest = right;
        }

        // If largest is not root
        if(largest != i){
            //System.out.println("Swapping largest");
            swap(A, i, largest);
            //show(arr);
            siftdown(A,n, largest);
        }
    }

    public static void swap(int[] A, int index1, int index2){
        int temp = A[index1];
        A[index1] = A[index2];
        A[index2] = temp;
    }

    static void show(int A[]){
        String arrayOut = "{" + A[0];
        for(int i = 1; i < A.length; i++){
            arrayOut += "," + A[i];
        }
        System.out.println(arrayOut + "}");
    }
}