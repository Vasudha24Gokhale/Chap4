public class kth_RE {
    public static void main(String args[]){
        int[] a={1,2,3,4,5};
        int b=a.length;
        int k=2;
        int j=0;
        int br[]=new int[a.length];
        for(int i= b-k;i<b;i++){
            br[j++]=a[i];
        }
        for(int i=0;i<b-k;i++){
            br[j++]=a[i];
        }
        for(int i=0;i<a.length;i++){
            System.out.print(br[i]+" ");
        }
    }
}
