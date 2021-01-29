import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=scn.nextInt();
        }
        for(int i=0; i<n-1; i++)
        {
            if(i%2==0)
            {
                if(arr[i+1]<arr[i])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                
            }
            else{
                if(arr[i]<arr[i+1])
                {
                    int temp;
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp; 
                }
            }
            
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
} 