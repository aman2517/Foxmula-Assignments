class Stack
{
   
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	Node head; //top of stack
    public int count = 0;

    
    //Insertion in stack
    public void push(int data)
    {
        //Insert new node
        Node node_new = new Node(data);
        node_new.next = head;
        head = node_new;
        count++;
    }

    public void pop()
    {
		if(count == 0) {
            System.out.println("There is no element in the stack.");
        }
		else{
        //Remove the node
        head = head.next;
        count--;
		}
    }
}