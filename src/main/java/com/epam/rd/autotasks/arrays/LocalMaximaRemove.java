package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        int[] copy = Arrays.copyOf(array, array.length);
        for (int i = 0; i<copy.length; i++){
            if (i==0){
                if (copy[i]>copy[i+1]){
                    copy = LocalMaximaRemove.removeItem(copy, i);
                }
            } else if (i==copy.length-1){
                if (copy[i]>copy[i-1]){
                    copy = LocalMaximaRemove.removeItem(copy, i);
                }
            } else{
                if (copy[i]>copy[i+1]){
                    copy = LocalMaximaRemove.removeItem(copy, i);
                }
            }
        }
        return copy;
        //put your code here

        //throw new UnsupportedOperationException();
    }
    public static int[] removeItem(int[] values, int index){
    for (int i = index; i < values.length -1; i++) {
        values[i] = values[i + 1];
    }
    return Arrays.copyOf(values, values.length - 1);
    }
}
