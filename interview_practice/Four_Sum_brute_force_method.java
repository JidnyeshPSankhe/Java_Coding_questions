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
public class Four_Sum_brute_force_method {
    public static void main(String args[]) throws Exception {
            String arr= "10,2,-3,0,-5,6,-2";
            int sum=0;
            four_value(arr,sum);      
        }    
    public static void four_value(String arr,int sum){
            String arr1[]= arr.split(",");
            int arr2[]=new int[arr1.length];
            
            for(int i=0;i<arr1.length;i++){
                arr2[i]= Integer.parseInt(arr1[i]);
            }
            
            for(int i=0;i<arr2.length-3;i++){
            for(int j=i+1;j<arr2.length-2;j++){
            for(int k=j+1;k<arr2.length-1;k++)
            {
                for(int l=k+1;l<arr2.length;l++){
                    if((arr2[i]+arr2[j]+arr2[k]+arr2[l])==sum)
                    {
                        System.out.println("The sum of "+arr2[i]+" "+arr2[j]+" "+arr2[k]+" "+" and "+arr2[l]+" gives the required sum of "+sum);
                    }
                
                }
            
            }
            }
    }
            
            
            
}
}
    
