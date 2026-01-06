package PRAC3;

public class QueueArray {
	int[] queue;
	int front, rear, size;
	
	public QueueArray(int capacity) {
		queue = new int[capacity];
		front=0;
		rear=-1;
		size=0;
	}
	
	public void enqueue(int data) {
		if (size==queue.length) {
			System.out.println("Queue is already full!");
			return;
		}
		rear++;
		queue[rear]=data;
		size++;
	}
	
	public int dequeue() {
		if (size==0) {
			System.out.println("Queue is already empty!");
			return-1;
		}
		int removed = queue[front];
		front++;
		size--;
		return removed;
	}
	
	public void display() {
		for (int i=front;i<=rear;i++) {
			System.out.println(queue[i]);
		}
		System.out.println();
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArray q = new QueueArray(4);
		
		q.enqueue(4);
		q.enqueue(8);
		q.enqueue(12);
		q.enqueue(16);
		q.enqueue(20);
		q.display();
		
		q.dequeue();
		q.display();

	}

}
