class Queue{ 
    int Rear=-1;
    int size=100;
    int Front=-1;
    int arrayq[]=new int[size];

    void enqueue(int x)
    {
        if(Rear==size-1)
        {
            System.out.println("underflow");
        }
        else
        {
            if(Front==-1)

            Front=0;

            Rear+=1;
            arrayq[Rear]=x;
            System.out.println("element to be inserted to the queue:"+x);
            
        }
    }
    void dequeue()
    {
        if(Front==-1 || Front>Rear)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element deleted from the queue:"+arrayq[Front]);
            Front+=1;
    
        }
    }
    void show()
    {
        int i;
        if(Front==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element present in the queue:");
            for(i=Front;i<=Rear;i++)
                 System.out.println(arrayq[i]); 
       }
    }
    public static void main(String args[])
    {
        Queue ie=new Queue();
        ie.enqueue(12);
        ie.enqueue(98);
        ie.enqueue(18);
        ie.enqueue(10);
        ie.dequeue();
        ie.show();
    }
}
