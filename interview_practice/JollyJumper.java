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
public class JollyJumper {
    public static void main(String [] args){
        String input="11,7,4,2,1,6";
        if(check(input))
            System.out.println("The given number is jolly jumper");
        else    
            System.out.println("The given number is not a jolly jumper");
    }
    static boolean check(String in){
        int a;
        String arr[]=in.split(",");
        for(int i=0;i<arr.length-1;i++)
        {
          if(Math.abs(Integer.parseInt(arr[i])-Integer.parseInt(arr[i+1]))<=arr.length-1 )
               i++;
          else
              return false;
        }
        return true;
    }
}
