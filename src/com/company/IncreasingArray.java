package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IncreasingArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        String []str= br.readLine().split(" ");
        System.out.print(new IncreasingArray().minimumNumberOfMoves(str));
    }
    public long minimumNumberOfMoves(String[]nums){
        long sum=0;
        for(int i=1;i<nums.length;i++){
            long curr=Long.parseLong(nums[i]);
            long prev=Long.parseLong(nums[i-1]);
            if(prev>curr){
                long temp=prev-curr;
                sum+=temp;
                nums[i]=nums[i-1];
            }
        }
        return sum;
    }
}
