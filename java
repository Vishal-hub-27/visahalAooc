import java.util.*;

public  class Stack
{
	int size = 5;
	int stk[] = new int[size];
	int ele, top;

	Stack()
	{
		top =-1;
	}
	void push()
	{
		if(top == size -1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Element : ");
			ele = sc.nextInt();
			top++;
			stk[top] = ele;
		}
	}
	void pop()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			ele = stk[top];
			top--;
			System.out.println("Popped Element : " + ele);
		}
	}
	void display()
	{
		if(top == -1)
		{
			System.out.println("Stack is Empty");
		}
		else
		{
			System.out.println("Stack elements: ");
			for(int i = top ; i >= 0 ; i--)    //Important step
			{
				System.out.println(stk[i]);
			}
		}
	}

	public static void main(String args[])
	{
		Stack ob = new Stack();
		Scanner sc = new Scanner(System.in);
		int opt;
		while(true)
		{
			System.out.println("\n 1. Push\n 2. Pop\n 3. Display\n 4. Exit\n");
			System.out.println("Enter the Option:");
			opt=sc.nextInt();
			switch(opt)
			{
				case 1: ob.push();
					break;
				case 2: ob.pop();
					break;
				case 3: ob.display();
					break;
				case 4: System.exit(0);
			} 
		} 
		
	}
}
	
