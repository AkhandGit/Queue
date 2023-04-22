/*

class MyCircularQueue {
    int queue[]=new int[1000];
    int f=0,r=0,c=0;
    public MyCircularQueue(int k) {
        c=k;
    }
    
    public boolean enQueue(int value) {
        if(r-f==c)
        {
            return false;
        }
        else
        {
            queue[r++]=value;
            return true;
        }
    }
    
    public boolean deQueue() {
        if(f==r)
        {
            return false;
        }
        else
        {
            f++;
            return true;
        }
    }
    
    public int Front() {
        if(f==r)
        {
            return -1;
        }
        else
        {
            return queue[f];
        }
    }
    
    public int Rear() {
        if(f==r)
        {
            return -1;
        }
        else
        {
            return queue[r-1];
        }
    }
    
    public boolean isEmpty() {
        if(f==r)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isFull() {
        if(r-f==c)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

*/

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