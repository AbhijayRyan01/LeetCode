class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<ArrayList<Integer>> adj = new ArrayList<>();
        int V = graph.length;
        for(int i=0; i<V; i++){
            adj.add(new ArrayList<Integer>());
        }

        int[] inDegree = new int[V];

        for(int u = 0; u < V; u++){
            inDegree[u] = graph[u].length;   

            for(int v : graph[u]){
                adj.get(v).add(u);           
            }
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> safeNodes = new ArrayList<>();

        for(int i=0; i<V; i++){
            if(inDegree[i]==0){
                q.add(i);
            }
        }

        while(!q.isEmpty()){
            int node = q.peek();
            q.remove();
            safeNodes.add(node);
            for(int it: adj.get(node)){
                inDegree[it]--;
                if(inDegree[it] == 0){
                    q.add(it);
                }
            }
        }

        Collections.sort(safeNodes);
        
        return safeNodes;
    }
}