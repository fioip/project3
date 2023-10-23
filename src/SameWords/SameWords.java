package SameWords;
import java.util.Arrays;

import java.lang.reflect.Array;

public class SameWords {
    public static void main(String[] args) {
     String[] a = new String[]{"java", "test", "university"};
     String[] b = new String[]{"car", "university", "plane"};

        for(int i=0;i< a.length;i++){
            for (int j=0; j< b.length;j++) {
                if (a[i] == b[j])
                    System.out.println("Array a: " + a[i] + " Array b: " + b[j]);
            }
        }
    }
}
