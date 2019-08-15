package com.leetcode.code1;

public class Code1 {

    public static void main(String[] args) {

        String str3= "4193 with words";
        String str1= "42";
        String str2= "   -42";
        String str4= "words and 987";
        String str5= "-91283472";
        int result1= myAtoi(str1);
        int result2= myAtoi(str2);
        int result3= myAtoi(str3);
       int result4= myAtoi(str4);
        int result5= myAtoi(str5);
      System.out.println("Result1 is " +result1);
      System.out.println("Result2 is " +result2);
        System.out.println("Result3 is " +result3);
        System.out.println("Result4 is " +result4);
        System.out.println("Result5 is " +result5);



    }

    public static int myAtoi(String str) {
        double result =0;
        if(str==null || str.length()<1){
            result =0;
        }
        str = str.trim();
        char flag='+';

        int i=0;
        if(str.charAt(0)=='-'){
            flag='-';
            i++;
        }
        else if(str.charAt(0)=='+'){
            i++;
        }

        while(str.length()>i && str.charAt(i)>='0' && str.charAt(i)<='9'){
            result = result*10 +(str.charAt(i)-'0');
            i++;
        }

        if(flag=='-'){
            result= -result;
        }


        if(result>Integer.MAX_VALUE){
            result= Integer.MAX_VALUE;
        }
        if(result<Integer.MIN_VALUE){
            result= Integer.MIN_VALUE;
        }



        return (int) result;

    }
}
