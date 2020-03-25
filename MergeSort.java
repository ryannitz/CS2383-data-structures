class MergeSort{

    public static void main(String[] args){
        int[] A = {3,6,10,18,8,7,25,40};
        sort(A);
        show(A);
    }
    
    public static void sort(int[] A){
        mergesort(A, 0, A.length-1);
    }

    public static void mergesort(int[] A, int i, int j){
        if(i==j){
            return;
        }
        int m = (i+j)/2;
        mergesort(A, i, m);
        mergesort(A,m+1,j);
        merge(A,i,m,j);
    }

    public static void merge(int A[], int p, int q, int n){ 
        int a = q - p+1; 
        int b = n - q; 
  
        int L[] = new int[a]; //temp left
        int R[] = new int[b]; //temp right
  
        /*Copy data to temp arrays*/
        for(int i = 0; i < a; ++i) {
            L[i] = A[p+i];
        }
        for(int j = 0; j < b; ++j){
            R[j] = A[q+1+j]; 
        }
  
  
        /* Merge the temp arrays */
  
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = p; 
        while(i < a && j < b){ 
            if(L[i] <= R[j]) { 
                A[k] = L[i]; 
                i++; 
            }else{ 
                A[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < a){ 
            A[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while(j < b){ 
            A[k] = R[j]; 
            j++; 
            k++; 
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