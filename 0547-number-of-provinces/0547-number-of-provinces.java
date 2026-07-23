class Solution {
    public void dfsOfGraph(boolean[] vis, int[][] isConnected, int node){
        vis[node] = true;
        for (int j = 0; j < isConnected.length; j++) {
            if (isConnected[node][j] == 1 && !vis[j]) {
                dfsOfGraph(vis, isConnected, j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        int V = isConnected.length;
        boolean[] vis = new boolean[V];

        int cnt = 0;
        for(int i=0; i<V; i++){
            if(!vis[i]){
                cnt++;
                dfsOfGraph(vis, isConnected, i);
            }
        }
        return cnt;
    }
}