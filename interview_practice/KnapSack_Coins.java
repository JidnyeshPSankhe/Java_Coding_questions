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
public class KnapSack_Coins {
    static int count( int S[], int m, int n )
    {
        // If n is 0 then there is 1 solution 
        // (do not include any coin)
        if (n == 0)
            return 1;
         
        // If n is less than 0 then no 
        // solution exists
        if (n < 0)
            return 0;
     
        // If there are no coins and n 
        // is greater than 0, then no
        // solution exist
        if (m <=0 && n >= 1)
            return 0;
     
        // count is sum of solutions (i) 
        // including S[m-1] (ii) excluding S[m-1]
        return count( S, m - 1, n ) +
               count( S, m, n-S[m-1] );
    }
     
    // Driver program to test above function
    public static void main(String[] args)
    {
        int i, j;
        int arr[] = {1, 2, 3};
        int m = arr.length;
        System.out.println( count(arr, m, 3));
         
         
    }
 
}  

