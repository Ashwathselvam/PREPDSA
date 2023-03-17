import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**
 * C_Kefa_and_park
 */
// class TreeNode{
//     int val;
//     int cat=0;
//     TreeNode(int ca){
//         this.cat = ca;
//     }
// }

public class C_Kefa_and_park{
    static int count=0;
    static int cat[];
    static int m=0;
    static boolean visited[];
    static class graph{
        int v;
        ArrayList<Integer> adj [];
       public graph(int v){
        this.v=v;
        adj = new ArrayList[v];
        for(int i=0;i<v;i++){
            adj[i]= new ArrayList<Integer>();
        }
        visited = new boolean[v];
       }
        void addEdge(int src,int dest){
        adj[src].add(dest);
       }
       void dfs(int v,int p,int curr_cat,int maxc){
        visited[v]=true;
            if(cat[v]==1) curr_cat++;
            else{
                curr_cat=0;
            }
            maxc=Math.max(maxc,curr_cat);
            int numchild=0;
          
            Iterator<Integer> itr = adj[v].listIterator();
            while(itr.hasNext()){
                int n=itr.next();
                if(!visited[n] && n!=p){
                dfs(n,v,curr_cat,maxc);
                numchild++;
                }
                
            }
            if(numchild==0 && maxc<=m){
                count++;
            }
       }
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
          m = sc.nextInt();
      graph g = new graph(n);
      cat = new int[n];
      for(int i=0;i<n;i++){
        cat[i] = sc.nextInt();
      }
      for(int i=0;i<n-1;i++){
        int x = sc.nextInt();
        int y = sc.nextInt();
        g.addEdge(x-1,y-1);
      }
      g.dfs(0,-1,0,0);
      System.out.println(count);
    }
    }
