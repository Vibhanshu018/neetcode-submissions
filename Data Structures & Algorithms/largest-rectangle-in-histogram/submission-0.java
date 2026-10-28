class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int maxA = 0;
        int n = heights.length;
        for(int i =0;i<=n;i++){
            int curr = (i==n) ? 0 : heights[i];
            while(!st.isEmpty() && curr < heights[st.peek()]){
                int height = heights[st.pop()];
                int width;
                if(st.isEmpty()){
                    width =i;
                }else{
                    width = i - st.peek()-1;
                }
                maxA = Math.max(maxA,height*width);
            }
            st.push(i);
        }
        return maxA;
    }
}
