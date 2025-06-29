class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int [][] kclosest;
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> b[0]-a[0]);
        for(int i=0;i<points.length;i++){
            int[] point = points[i];
            int dist = Dist(point);
            int[] entry = {dist, i};
            q.add(entry);
            if(q.size()>k){
                q.remove();
            }
        }
        int[][] ans = new int[k][2];
        for(int i = 0; i<k; i++){
            int index = q.poll()[1];
            ans[i] = points[index];
        }
        return ans;
        
    }
    int Dist(int[] point){
            return point[0]*point[0] + point[1]*point[1];
        }
}