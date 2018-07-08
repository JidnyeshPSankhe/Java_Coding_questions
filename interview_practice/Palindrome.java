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
        int a=13321;
        String arr="";
        arr+=Integer.toString(a);
        if(check_Palindrome(arr))
            System.out.println("The given input is a palindrome!");
        else
            System.out.println("The given input is not a palindrome!");
        
        }   
    public static boolean check_Palindrome(String arr){
        String reverse_arr="";
        for(int i=arr.length()-1;i>=0;i--)
        {
            reverse_arr+=arr.charAt(i);
        }
        if(arr.equalsIgnoreCase(reverse_arr))
            return true;
        else
            return false;
}
    boolean reverse_arr;
}

