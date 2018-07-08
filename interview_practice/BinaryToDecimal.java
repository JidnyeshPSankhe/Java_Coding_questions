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
public class BinaryToDecimal {
     public static void main(String[] args) {
        String binary = "10";
        int j = 0; //j is used to raise the power of 2.
        int decimal = 0;
        for(int i=binary.length()-1; i>=0; i--){
            decimal = decimal + (int) (Math.pow(2,j) * Integer.valueOf(""+binary.charAt(i))); //Convert char to String.
            j += 1;
        }
        System.out.println("Corresponding Decimal number is: " + decimal);
    }
}

