//  adjacency List
// memory is O(2*edges+ nodes) for undirected and O(e+nodes) for directed graph
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
public class Ad_List {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        ArrayList<ArrayList<Integer>> ls=new ArrayList<>();
        //add n inner Lists
        for(int i=0;i<x;i++){
            ls.add(new ArrayList<Integer>());
        }
        for(int i=0;i<y;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            ls.get(u).add(v);
            ls.get(v).add(u);

        }
        //print 
        for(int i=0;i<x;i++){
            for(int j=0;j<ls.get(i).size();j++){
                System.out.println("edge present b/w "+i +"&"+ls.get(i).get(j));

            }

        }
         

    }
    
}
