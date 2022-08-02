package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeirdAlgorithm {
    public static void main(String[] args) throws IOException {
        InputStreamReader in= new InputStreamReader(System.in);
        BufferedReader bufferedReader =  new BufferedReader(in);
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        long start = Integer.parseInt(stringTokenizer.nextToken());
        while(start!=1){
            System.out.print(start+" ");
            start=start%2==0? start/2:(start*3)+1;
        }
        System.out.print(start);
    }
}
