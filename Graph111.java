import java.util.*;
class Graph111
{
    private LinkedList<Integer> adj[];

    public Graph111(int v) 
    {
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int source, int destination)
    {
        adj[source].add(destination);
        adj[destination].add(source);
    }
    
    public int bfs(int source, int destination)
    {
        boolean vis[] = new boolean [adj.length];
        int parent[] = new int[adj.length];
        
        Queue<Integer> q=new LinkedList<Integer>();
        
        q.add(source);
        parent[source] = -1;
        
        while(!q.isEmpty()) 
        {
            int curr = q.poll();
            if(curr == destination)
            break;
            for(int neighbor: adj[curr])
            {
                if(!vis[neighbor])
                {
                    q.add(neighbor);
                    parent[neighbor]=curr;
                    
                }
            }
        }
        int cur=destination;
        int dist = 0;
        while(parent[cur]!=-1)
        {
            System.out.print(cur+"->");
            cur = parent[cur];
        }
        dist++;
        return dist;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter vertex and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph111 g=new Graph111(v);
        System.out.println("Enter"+e+"edges");
        for(int i=0;i<e;i++)
        {
            int source = sc.nextInt();
            int destination = sc.nextInt();
            
            g.addEdge(source , destination);
        }
    }
}