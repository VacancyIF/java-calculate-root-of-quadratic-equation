package com.bytelegend;

import java.util.Arrays;

public class Challenge {
    public static void main(String[] args) {
        System.out.println("Roots of x^2-2x+1=0 are:" + Arrays.toString(calculate(1, -2, 1)));
        System.out.println("Roots of x^2-4=0 are:" + Arrays.toString(calculate(1, 0, -4)));
        System.out.println("Roots of x^2+1=0 are:" + Arrays.toString(calculate(1, 0, 1)));
    }

    /**
     * `calculate(int a, int b, int c)` calculates the root of the quadratic equation `ax^2+bx+c=0`.
     *
     * <p>If there are two roots, return an array containing the two roots, i.e. `new double[] {
     * root1, root2 }`.
     *
     * <p>If there is one root, return an array containing the root, i.e. `new double[] { root }`.
     *
     * <p>If there is no root, return an empty array.
     */
    public static double[] calculate(int a, int b, int c) {
        double v = Math.pow(b, 2) - (4 * a * c);//开平方公式
        if (v > 0) {//v>0存在两个实根
            double[] array = new double[2];
            //带入方程
            double v1 = (-b + Math.sqrt(v)) / 2 * a;
            double v2 = (-b - Math.sqrt(v)) / 2 * a;
            array[0] = v1;
            array[1] = v1;
            return array;
        }else if (Math.abs(v) < 0.000001) {//v==0 存在一个根
            double[] array = new double[1];
            double v1 = (-b + Math.sqrt(v)) / 2 * a;
            array[0] = v1;
            return array;
        }else {
            return new double[]{};
        }
    }
}
