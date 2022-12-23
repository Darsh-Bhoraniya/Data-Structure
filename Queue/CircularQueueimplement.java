import java.util.Scanner;
public class CircularQueueimplement{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circularqueue cq = new Circularqueue();
		while(true){
			System.out.println("1:cqinser\n2:cqdelete\n3:displsy\n4:exitfromqueue");
			int n= sc.nextInt();
			if (n==1) {
				cq.cqinsert();
			}
			else if (n==2) {
				cq.cqdelete();
			}
			else if (n==3) {
				cq.dispaly();				
			}
			else {
				System.out.println("Invalid Input");
			}
		}
	}
}


class Circularqueue{
	int [] queue=new int[5];
	int front=-1,rear=-1;
	Scanner sc = new Scanner(System.in);
	int y;
	int deleteelment;
	public void cqinsert(){
		if (rear==4) {
			rear=0;
		}
		else{
			rear++;
		}
		if (front==rear) {
			System.out.println("OverFlow");
			if(rear == 0){
				rear = 4;
			}else{
				rear = rear - 1;
			}
			return;
		}
		
			System.out.println("Enter elemet of cq");
			queue[rear]=sc.nextInt();		
		if (front==-1) {
			front=0;
			return;
		}

	}
	public void cqdelete(){
		if (front==-1) {
			System.out.println("Underflow");
		}
		else{
			deleteelment=queue[front];
			System.out.println("Your Delete Element Is "+deleteelment);
		}
		if (front==rear) {
			front=-1;rear=-1;
			return;
		}
		if (front==4) {
			front=0;
		}
		else{
			front=front+1;
			return;
		}
	}
	public void	dispaly(){
		if (rear<front) {
			for (int i = front;i<5 ;i++ ) {
				System.out.println(queue[i]);
			}
			for (int j= 0;j<=rear ;j++ ) {
				System.out.println(queue[j]);
			}
		}
		else{
				for (int i = front;i<=rear ;i++ ) {
					System.out.println(queue[i]);
				}
		}
	}
}