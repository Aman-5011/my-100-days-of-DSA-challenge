public class merSort{
    public static void mergesort(int []arr){
        int n=arr.length;
        if(n==1) return;
        int[] a= new int[n/2];
        int[] b= new int[n-n/2];
        for (int i = 0; i < a.length; i++) a[i]=arr[i];
        for (int i = 0; i < b.length; i++) b[i]=arr[i+n/2];
        mergesort(a);
        mergesort(b);
        merge(a, b, arr);
        a=null;b=null;
    }

    public static void merge(int[]a , int []b , int[]c ){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++]=a[i++];
            else c[k++]=b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
    }
     
    public static void print(int []arr) {
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public static void main(String[] args) {
        int [] arr={4,5,3,9,11,78,92,9,23};
        print(arr);
        mergesort(arr);
        print(arr);
    }
}
