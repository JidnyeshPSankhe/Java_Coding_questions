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
public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 2;
        System.out.println("Binary format of " + decimal + " is: ");
        String binary = "";
        while(decimal!=0){
            binary = Integer.toString(decimal%2) + binary; //Important since the Binary Digits are added to the front of String.
            decimal /= 2;
        }
        System.out.println(binary);
        System.out.println(Integer.valueOf(binary));


    }
}
