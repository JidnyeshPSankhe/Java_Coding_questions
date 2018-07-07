/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview_practice;

/**
 *
 * @author Jidnyesh P Sankhe
 */
public class Palindrome {
    public static void main(String args[]) throws Exception {
        int a=13331;
        String arr="";
        arr+=Integer.toString(a);
            checkPalindrome(arr);
        }   
    static void checkPalindrome(String arr){
        String reverse_arr="";
        for(int i=0;i<arr.length();i++)
        {
            reverse_arr+=arr.charAt(i);
        }
        System.out.println(reverse_arr);
        System.out.println(arr);
        if(arr.equalsIgnoreCase(reverse_arr))
            System.out.println("Yahoooo");
        else
            System.out.println("Naaaahoooo");
}
}

