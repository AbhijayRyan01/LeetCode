import java.util.*;

class Solution {

    public boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] vis) {
        vis[node] = 1;

        for (int next : adj.get(node)) {
            if (vis[next] == 0) {
                if (dfs(next, adj, vis))
                    return true;
            } else if (vis[next] == 1) {
                return true;
            }
        }

        vis[node] = 2;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : prerequisites) {
            adj.get(edge[1]).add(edge[0]);
        }

        int[] vis = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis))
                    return false; 
            }
        }

        return true;
    }
}