/*

class MyQueue {
    int[] Queue =new int[2000];
    int f=0,r=0;
    public MyQueue() {
        
    }
    
    public void push(int x) {
        if(isfull()){
            return;
        }
        Queue[r]=x; 
        r++;  
    }
    
    public int pop() {
        if(empty()){
            return 0;
        }
        int temp=Queue[f];
        f++;
        return temp;
    }
    
    public int peek() {
        return Queue[f];
    }
    
    public boolean empty() {
        if(f==r){
            f=0;
            r=0;
            return true;
        }
        return false;
    }
    public boolean isfull(){
        if(f==2000){
            return true;
        }
        return false;
    }
}

*/