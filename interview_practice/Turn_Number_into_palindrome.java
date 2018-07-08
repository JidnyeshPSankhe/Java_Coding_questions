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
// Check if a number is palindrome, if not then reverse the number and add to input and check if palindrome.
//Return the iterations required to make the number plaindrome.
public class Turn_Number_into_palindrome {
  public static void main(String [] args){
    int input= 1331;
    
    checkpalindrome(input);
    
}

public static void checkpalindrome(int num){
    String str=Integer.toString(num);
    String reverse_arr="";
    Palindrome pi=new Palindrome();
    if(pi.check_Palindrome(str))
        System.out.println("The given input is already a palidrome!");
    else
        for(int i=0;i<str.length();i++)
        {
            reverse_arr+=str.charAt(i);
        }
        make_palindrome(str,reverse_arr);
}
static void make_palindrome(String str, String rstr) 
{
    str+=rstr;
    Palindrome pi=new Palindrome();
    if(pi.check_Palindrome(str))
        System.out.println("The given input is a palidrome!");
    else
        
}
}
