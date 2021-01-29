import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

   

public static void main(String[] args) { 

    Scanner scn=new Scanner(System.in);
    int testCases=scn.nextInt();
    for(int i=0;i<testCases;i++)
    {
    int policeStations=0;   
     int d=scn.nextInt();
     int k=scn.nextInt();
     int r=(int)Math.sqrt(d);

     for(int a=0;a<=r;a++){
    int b=(int)Math.sqrt(d-a*a);
         if(a*a+b*b==d)
         {
            if(a==0||b==0)
             policeStations=policeStations+2;
            else
                policeStations=policeStations+4;

         }
                           }
      if(k<policeStations)
        System.out.println("impossible");

        if(k>=policeStations)
            System.out.println("possible");

    }
}
}
    