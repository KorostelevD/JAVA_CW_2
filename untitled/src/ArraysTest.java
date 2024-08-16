import java.util.Arrays;

public class ArraysTest {
    public static void main (String[] args){
        int[] a;
        a = null;
        int b[]; //використовється рідко
        int [] c,d,e;
        int f[], g[];

        int[] h = new int[12];
        h = new int[23];

        int[] i = new int[]{1,2,3};
        int[] j = {10,20,30};
        System.out.println(Arrays.toString(j));

        //
        int[] ar1 = {11,22,33};
        int[] ar2 = new int[ar1.length];
        //
        System.arraycopy(ar1,0,ar2,0, ar1.length);
        System.out.println(Arrays.toString(ar2));

        //2
        int[] ar3 = Arrays.copyOf(ar1, ar1.length);
        int[] ar4 = Arrays.copyOfRange(ar1, 0, 1);
        //
        int[] ar5 = ar1.clone();
        System.out.println(Arrays.toString(ar5));
        //   
    }
}
