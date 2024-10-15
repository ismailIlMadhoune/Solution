import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        long num = src.nextLong();
        System.out.println("output: " + estimate(num));
    }
    public static long estimate(long n){
        String num = String.valueOf(n);//150
        String s = "";
        s += num.charAt(0);//1
        int length = num.length();//3
        long zero = (long) Math.pow(10, length - 1);
        long first = Integer.parseInt(s);//1
        long a = first * zero; // 100
        long b = (first + 1) * zero; // 200
        
        if(Math.abs(n - a) == Math.abs(n - b)) return b;
        if(Math.abs(n - a) > Math.abs(n - b)) return b;
        if(Math.abs(n - a) < Math.abs(n - b)) return a;
        
        return  -1;
    }
}

/*
 * 150
 * 
 */
