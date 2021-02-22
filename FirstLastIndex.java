import java.io.*;
import java.util.*;
public class FirstLastIndex {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }
        int d=s.nextInt();
        int fi = firstindex(a, d,0);
        int li = lastindex(a, d,0);
        System.out.println(fi);
        System.out.println(li);
    }

    public static int firstindex(int []a,int x,int i){
        if(i==a.length){
            return -1;
        }
        if(a[i]==x){
            return i;
        }else {
            int fisa = firstindex(a, x, i + 1);
            return fisa;
        }
    }
    public static int lastindex(int []a,int x,int i){
        if(i==a.length) {
            return -1;
        }
        int lisa=lastindex(a,x,i+1);
        if(lisa==-1){
            if(a[i]==x){
                return i;
            }
            else{
                return -1;
            }
        }else{
            return lisa;
        }
    }
}