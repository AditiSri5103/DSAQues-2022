package Stack.Queue;

public class MyCircularQueue 
{
    int f=-1,r=-1,cq[],k;

    public MyCircularQueue(int size) {
     cq=new int[size]; 
     k=size;  
    }
    
    public boolean enQueue(int value) {
        if(isFull())
        {
            return false;
        }
        if(f==-1)
        {
            f+=1;
        }
        r=(r+1)%k;
        cq[r]=value;
        return true;
   }
    
    public boolean deQueue() {
        if(isEmpty())
        return false;
        if(f==r&&f!=-1){
            f=-1;
            r=-1;
            return true;
        }
        f=(f+1)%k;
        return true;
        
    }
    
    public int Front() {
        if(!isEmpty())
        return cq[f];
        return -1;
    }
    
    public int Rear() {
        if(!isEmpty())
        return cq[r];
        return -1;
    }
    
    public boolean isEmpty() {
        if(f==-1 && r==-1)
        return true;
        return false;
    }
    
    public boolean isFull() {
        if((r+1)%k==f)
        return true;
         return false;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */ 
