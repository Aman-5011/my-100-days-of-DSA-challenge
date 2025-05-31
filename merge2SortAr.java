public class merge2SortAr{
    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");

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
    public static void main(String[] args) {
        int [] a= {10,30,50,70,90,110,130};
        int [] b= {20,40,60,80,100,120,140};
        int [] c= new int[a.length+b.length];
        merge(a,b,c);
        print(c);
    }
}
