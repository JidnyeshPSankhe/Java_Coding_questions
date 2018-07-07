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
public class Sort_brute {
    public static void main(String args[]) throws Exception {
            String arr= "10,2,-3,-5,0,6,-2";
            int a[]=four_value(arr);
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+", ");
            
            }
            
        }    
        public static int[] four_value(String arr){
            String [] myArray= arr.split(",");
            int myArray1[]= new int [myArray.length];
            
            for(int i =0;i<myArray.length;i++)
            {
                myArray1[i]= Integer.parseInt(myArray[i]);  
            }
            int temp=0;
            for(int i=0;i<myArray1.length;i++)
            {
                for(int j=0;j<myArray1.length-1;j++)
                {
                    if(myArray1[j] > myArray1[j+1]){
                    
                    temp=myArray1[j];
                    myArray1[j]=myArray1[j+1];
                    myArray1[j+1]=temp;
                    }
                }
            }
            return myArray1;
}
 }

