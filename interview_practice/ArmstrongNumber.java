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
import java.lang.Math;
public class ArmstrongNumber {
    public static void main(String [] args){
        String input="371";
        checkArmstrong(input);
    }
    static void checkArmstrong(String in){
        int arm= Integer.parseInt(in);
        int a=0;
        double b=0;
        for(int i=0; i<in.length();i++)
        {   
            a=arm%10;
            b = b+Math.pow(a,3);
            arm=arm/10;
            b=(int)b;
        }
        int c=(int)b;
        if(c==Integer.parseInt(in))
            System.out.println("The value " +in+" is an Armstrong number");
        else
            System.out.println("It is not an armstrong number");

    }
}
