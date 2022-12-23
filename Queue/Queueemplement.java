import java.util.Scanner;
public class Queueemplement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue qe = new Queue();
		while(true){
			System.out.println("1:enqueue\n2:dequeue\n3:display");
			int n= sc.nextInt();
			if (n==1) {
				System.out.println("Enter Element");
				int num =sc.nextInt();
				qe.enqueue(num);				
			}
			else if (n==2) {
				System.out.println("Dequequed element is :" + qe.dequeue());
				
			}
			else if(n==3){
				qe.display();
			}
			else{
				System.out.println("Invalid Input");
			}

		}
	}
}



class Queue{
	int [] arr = new int[5];
	int rear=-1,front=-1;
	public void enqueue(int num){
		
		if (rear>=5) {
			System.out.println("Queue is Over Flow");
		}
		else{
			rear++;
			if (front==-1) {
				front=0;
			}
			arr[rear]=num;
		}
	}
	public int dequeue(){
		if (front==-1) {
			System.out.println("Queue is Under Flow");
			return -1;
		}
		else{

			return arr[front++];
		}
			// return arr[front];
	}
	public void display(){
		System.out.print("Content of Queue is : ");
		if(front ==-1){
			System.out.println("Queue Underflow");
			return;
		}
		for (int i=front;i<=rear ;i++ ) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}