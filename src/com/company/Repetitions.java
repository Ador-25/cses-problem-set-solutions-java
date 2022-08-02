package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Repetitions {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        System.out.print(longestRepitition(st.nextToken()));
    }
    public static int longestRepitition(String str){
        int max=1;
        int sum=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==str.charAt(i-1)){
                sum++;
            }
            else
                sum=1;
            if(sum>max)
                max=sum;
        }
        return max;
    }
}
