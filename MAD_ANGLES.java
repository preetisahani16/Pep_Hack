import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int swos = n ;
        int sws = 2*n -1;
        int col1=0;
        int star=1;
        for(int i=0;  i<n; i++)
        {
            
            for(int j=0; j<swos; j++)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            for(int j=0; j<=col1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<sws; j++)
            {
                System.out.print("*");
            }
            System.out.print("  ");
            
            for(int j=0; j<star; j++)
            {
                System.out.print("*");
            }
            System.out.print("  ");
            for(int j=0; j<sws; j++)
            {
                System.out.print("*");
            }
            for(int j=0; j<=col1; j++)
            {
                System.out.print(" ");
            }
            System.out.print(" ");
             for(int j=0; j<swos; j++)
            {
                System.out.print("*");
            }
            col1+=1;
            sws-=2;
            star+=2;
            System.out.println();
            
        }
    }
}