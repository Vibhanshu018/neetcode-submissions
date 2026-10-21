class MinStack {
Stack<Integer>st;
Stack<Integer>minS;
    public MinStack() {
        st = new Stack<>();
        minS = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minS.isEmpty() || val <= minS.peek()){
            minS.push(val);
        }
    }
    
    public void pop() {
        if(st.peek().equals(minS.peek())){
            minS.pop();
        }
        st.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minS.peek();
    }
}
