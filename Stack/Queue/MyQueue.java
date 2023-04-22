package Stack.Queue;

class MyQueue {
    int f=-1,r=-1,n=1000;
        int q[]=new int[n];
    public MyQueue() {
    }
    
    public void push(int x) {
        if(r==n-1)
        return;
        q[++r]=x;
        if(f==-1)
        f++;
    }
    
    public int pop() {
        if(empty())
        return -1;
        int x=q[f];
        f+=1;
        return x;
    }
    
    public int peek() {
        
        return q[f];
    }
    
    public boolean empty() {
        if(f==-1 && r==-1)
        return true;
        if(f>r)
        return true;
        return false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
