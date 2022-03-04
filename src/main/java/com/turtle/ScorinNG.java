package com.turtle;

public class ScorinNG {
    public static void main(String[] args) {
            String[] names = {"Mike","Lisa","Jennie","Karen","Benny"};
            int[] englishs = {70,75,80,85,90};
            int[] maths = {60,65,70,75,80};
            for (int i=0;i<5;i++){
                System.out.println(names[i] + "\t" + englishs[i] + "\t" + maths[i] +"\t" +(englishs[i]+maths[i])/2);
            }
            }
    }
