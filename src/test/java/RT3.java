import io.cucumber.java.sl.In;

import java.util.*;

public class RT3 {

    public RT3() {
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 6, 5, 4, 18, 9, 9, 3, 3, 3, 3,};


        System.out.println("Sum is : " + sumArray(a));
        System.out.println("Multiplication of 5*10 is : " + multiply(5, 10));
        //     System.out.println( "Arrays.stream(a).sum() : "+Arrays.stream(a).sum());
        System.out.println("Maximum difference in adjacent :" + diffAdj(a));
        //     pyramid();
        // fibonacci(10);
        //    palliandrome("ARRAYyYARRA");
        counting(a);

    }

    public static void counting(int[] a){

        Map<Integer,Integer> data= new HashMap<Integer,Integer>();
        ArrayList<Integer> al =new ArrayList<Integer>();

        for(int i=0;i<a.length;i++){
            if(data.containsKey(a[i])){
                data.put(a[i],data.get(a[i])+1);
            }else
                data.put(a[i],1);
        }
        System.out.println(data);
        for(int i=0;i<a.length;i++){
            if(!al.contains(a[i]))
                al.add(a[i]);
        }
        System.out.println("Array LIST");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }
    public static void palliandrome(String str) {
        int l = str.length() - 1;
        boolean flag = true;
        System.out.println("length is " + l);
        int i = 0;
        while (i < l) {

            if (str.charAt(i) != str.charAt(l)) {
                flag = false;
                break;
            }

            i++;
            l--;
        }
        if (flag)
            System.out.println("is Palliandrome");
        else
            System.out.println("NOT Palliandrome");
    }

    public static void fibonacci(int a) {
        int temp = 0;
        int i = 0;
        int j = 1;
        while (a > 0) {
            System.out.print(i + j + "\t");
            temp = j;
            j = i + j;
            i = temp;

            a--;
        }
        System.out.println("");

    }

    public static void pyramid() {

        for (int i = 0; i <= 5; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*" + "\t");
            }
            System.out.println();

        }

    }

    public static int diffAdj(int[] a) {
        int max = 0;
        for (int t = 0; t < a.length - 1; t++) {

            if (max < a[t] - a[t + 1]) {
                max = a[t] - a[t + 1];
            }

        }

        return max;
    }

    public static int multiply(int a, int b) {
        int mul = 0;
        while (b > 0) {
            mul = mul + a;
            b--;
        }

        return mul;
    }

    public static int sumArray(int[] a) {

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum;
    }
}
