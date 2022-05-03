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
                    for (int y = i; y < copy.length-1; y++){
                        copy[y]=copy[y+1];
                    }
                    copy=Arrays.copyOf(copy, copy.length-1);
                }
            } else if (i==copy.length-1){
                if (copy[i]>copy[i-1]){
                    for (int y = i; y < copy.length-1; y++){
                        copy[y]=copy[y+1];
                    }
                    copy=Arrays.copyOf(copy, copy.length-1);
                }
            } else{
                if (copy[i]>copy[i+1]){
                    for (int y = i; y < copy.length-1; y++){
                        copy[y]=copy[y+1];
                    }
                    copy=Arrays.copyOf(copy, copy.length-1);
                }
            }
        }
        return copy;
        //put your code here

        //throw new UnsupportedOperationException();
    }
}
