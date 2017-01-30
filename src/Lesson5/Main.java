package Lesson5;


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     twoOrThree();
    }

    private static double g(double weight)
    {
        return weight * 0.17;
    }

    private static double arifmetic(int s)
    {
        double[] a = new double[s];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        double summ = 0;

        for (int i = 0; i < a.length; i++) {
            summ = summ + a[i];
        }
        return summ/a.length;
    }

    private static void  mass()
    {
        int[][] a = new int[7][6];


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = (int) (Math.random() * 9);
            }
        }

        faster(a);
        System.out.println();


        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }

        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = a[i].length - 1; j >= 0; j--) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void faster(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void two()
    {
        int a = 5;
        int b = 6;

        b = b + a;
        a = b - a;
        b = b - a;


    }
    private static void three()
    {
        int a = 5;
        int b = 6;

        int c = a;
        a = b;
        b = c;


    }

    private static void twoOrThree()
    {
        long twoStart = System.nanoTime();

        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 100000000; j++) {
                for (int k = 0; k < 1000000000; k++) {
                    two();
                }
            }
        }

        long twoEnd = System.nanoTime();

        double twoSpeed = (twoEnd - twoStart)/1f;
        System.out.println(twoSpeed);


        long threeStart = System.nanoTime();

        for (int i = 0; i < 1000000000; i++) {
            for (int j = 0; j < 100000000; j++) {
                for (int k = 0; k < 1000000000; k++) {
                    three();
                }
            }
        }

        long threeEnd = System.nanoTime();

        double threeSpeed = (threeEnd - threeStart)/ 1f;
        System.out.println(threeSpeed);
    }
}
