import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(countMoveInBoard(n, "", m));
        System.out.println(arrayMoveInBoard(n, m));
        moveInBoard(n, "", m);
    }
    public static int countMoveInBoard(int n, String path, int m){
        if(n < 0){
            return 0;
        }
        
        if(n == 0){
            return 1;
        }
        int ans = 0;
        for(int i = 1; i <= m; i++){

            ans += countMoveInBoard(n - i, path + i, m);
        }
        return ans;
    }
    
    public static ArrayList<String> arrayMoveInBoard(int n, int m){
        if(n < 0){
            ArrayList<String> bans = new ArrayList<>();
            return bans;
        }
        
        if(n == 0){
            ArrayList<String> bans = new ArrayList<>();
            bans.add("");
            return bans;
        }
        
        ArrayList<String> mr = new ArrayList<>();
        for(int i = 1; i <= m; i++){
            ArrayList<String> rr1 = arrayMoveInBoard(n - i, m);
            for(int j = 0; j < rr1.size(); j++){
                mr.add(i + rr1.get(j));
            }
        }    
       
        
        return mr;
        

    }
    
    public static void moveInBoard(int n, String path, int m){
        if(n < 0){
            return;
        }
        
        if(n == 0){
        
        
            System.out.println(path);
            return;
        }
        
        for(int i = 1; i <= m; i++){

            moveInBoard(n - i, path + i, m);
        }
        

    }
}