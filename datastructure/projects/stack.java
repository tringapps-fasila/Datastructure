import java.io.*;
import java.util.*;
import java.lang.*;
class stack{
    int top=-1;
    int size=100;
    int array[]=new int[size];

    void push(int x)
    {

        if(top==size-1)
        {
            System.out.println("underflow");
        }
        else
        {
            top+=1;
            array[top]=x;
            System.out.println("element to be inserted to the stack:"+x);
            
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("poped element:"+array[top]);
            top-=1;
    
        }
    }
    void show()
    {
        int i;
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            System.out.println("element present in the stack:");
            for(i=0;i<=top;i++)
                 System.out.println(array[i]); 
       }
    }
    public static void main(String args[])
    {
        stack ix=new stack();
        ix.push(12);
        ix.push(21);
        ix.push(22);
        ix.push(92);
        ix.pop();
        ix.show();
    }
}