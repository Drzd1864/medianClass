package com.company;

import java.util.Arrays;

public final class Median {

    private Median() {
    }

    public static float getMedian(int[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0f;
        }
    }

    public static double getMedian(double[] arr) {
        Arrays.sort(arr);
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        } else {
            return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
        }
    }
}
