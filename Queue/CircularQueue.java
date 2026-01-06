package PRAC3;

public class CircularQueue {
	static int[] queue;
	static int front, size, rear, capacity;
	
	public CircularQueue(int cap) {
		queue = new int[cap];
		capacity=cap;
		front=0;
		size=0;
		rear=-1;
	}
	
	public static void enqueue(int data) {
		if(size==capacity) {
			System.out.println("Queue is already full!");
			return;
		}
		rear = (rear+1)% capacity;
		queue[rear]=data;
		size++;
	}
	
	public static int dequeue() {
		if(size==0) {
			System.out.println("Queue is already empty");
			return -1;
		}
		int value = queue[front];
		front = (front+1)% capacity;
		size--;
		return value;
	}
	
	public static void display() {
		int count = size;
		int i = front;
		
		while(count>0) {
			System.out.println(queue[i]+" ");
			i = (i+1)% capacity;
			count--;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue c = new CircularQueue(4);
		
		enqueue(10);
        enqueue(20);
        enqueue(30);
        enqueue(40);

        System.out.print("Queue elements: ");
        display();

        System.out.println("Dequeued element: " + dequeue());

        System.out.print("Queue after dequeue: ");
        display();

        enqueue(50);
        enqueue(60); // tests circular behavior

        System.out.print("Final Queue: ");
        display();
	}

}
