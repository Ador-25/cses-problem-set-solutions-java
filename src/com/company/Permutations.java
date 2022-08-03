package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutations {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        long n= Integer.parseInt(br.readLine());
        new Permutations().beautifulPermutaion(n);

    }
    public void beautifulPermutaion(long number){
        if(number==1)
            System.out.print(number);
        else if(number<=3) {
            System.out.print("NO SOLUTION");

        }
        else{
            StringBuilder solutionBuilder= new StringBuilder();
            long odd=1,even=2;
            while (even<=number){
                solutionBuilder.append(even+" ");
                even+=2;
            }
            while (odd<=number){
                solutionBuilder.append(odd+" ");
                odd+=2;
            }

            System.out.println(solutionBuilder);
        }

    }
}
