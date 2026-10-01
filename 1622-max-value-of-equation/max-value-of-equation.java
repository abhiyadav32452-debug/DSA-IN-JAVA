class Solution {
    public int findMaxValueOfEquation(int[][] points, int k) {
        Deque<int[]>dq = new ArrayDeque<>();
        int ans = Integer.MIN_VALUE;
        for(int[]p: points){
            int x = p[0];
            int y = p[1];
            while(!dq.isEmpty()&& x-dq.peekFirst()[0]>k){
                dq.pollFirst();
            }
            if(!dq.isEmpty()){
                ans = Math.max(ans,y+x+dq.peekFirst()[1]);
            }
            int value = y-x;
            while(!dq.isEmpty() && dq.peekLast()[1]<=value){
                dq.pollLast();
            }
            dq.offerLast(new int[]{x,value});
        }
        return ans;
    }
}