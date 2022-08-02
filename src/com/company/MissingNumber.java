package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        StringTokenizer st= new StringTokenizer(br.readLine());
        int size= Integer.parseInt(st.nextToken());
        String str = br.readLine();
        String[] input = str.split("\\s");
        int[]nums= new int[size+1];
        for(String item:input){
            nums[Integer.parseInt(item)]=1;
        }
        System.out.print(missingNumber(nums));

    }
    public static int missingNumber(int []arr){
            for(int i=1;i< arr.length;i++) {
                if (arr[i] == 0)
                    return i;
            }
                return 0;
    }
}
