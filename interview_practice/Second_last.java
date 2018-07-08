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
public class Second_last {
    public static void main(String[] args)
    {
        String second_last="";
        String input="Hello, How are you doing?";
        second_last=last_word_return(input);
        System.out.println("The second last word is: " +second_last);
        
    }
    static String last_word_return(String in){
        String arr[]= in.split(" ");
        return arr[arr.length-2];
        
        
    
    
    }
}
