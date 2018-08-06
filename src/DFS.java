import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class DFS {
    HashMap<String,ArrayList<String>> adjList;
    public void DFS(){
        int size = adjList.size();
        boolean visited[] = new boolean[size];
        for (int i=0; i<size; ++i)
            if (!visited[i])
                DFSUtil(i, visited);
    }

    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true;
        System.out.print(v+">");
        String key = (char) v +"";
        Iterator<String> i = adjList.get(key).iterator();
        while(i.hasNext()){
            String s = i.next();
            char c = s.charAt(0);
            int pos = c-65;
            if(!visited[pos]){
                DFSUtil(pos,visited);
            }
        }
    }
}
