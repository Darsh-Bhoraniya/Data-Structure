import java.util.Scanner;
public class DoublyLinkedList{
	public static void main(String[] args) {
		LinkedList dl = new LinkedList();
		Scanner	sc = new Scanner(System.in);
		System.out.println("1:insert\n 2:Display \n3:exit");
		int ch = sc.nextInt();
		while(true){
		switch (ch) {
			case 1 :
				dl.insert(sc.nextInt());
				break;
			case 2 :
				dl.Display();
				break;
			case 3 :
				System.exit(0);
				break;
			}
			System.out.println("1:insert\n 2:Display \n3:exit");
		 	ch = sc.nextInt();
		}
	}
} 




class Node{
	Node LPTR;
	Node RPTR;
	int x;
}
class LinkedList{
	Node L=null ,R=null ,M = null;
	public void insert(int x){
		Node newnode = new Node();
		newnode.x = x;
		if (R==null) {
			newnode.LPTR=null;
			newnode.RPTR=null;
			L=R=M=newnode;
			return;
		}
		else if (M==L) {
			newnode.LPTR=null;
			newnode.RPTR=M;
			M.LPTR=newnode;
			L=newnode;
			return;
		}
		else{
			newnode.LPTR=M.LPTR;
			newnode.RPTR=M;
			M.LPTR=newnode;
			(newnode.LPTR).RPTR=newnode;
			return;
		}
	}
	public void Display(){
		if (L==null) {
			System.out.println("Liked List Is Empty");
		}
			else{
			System.out.println("DoublyLinkedList Element is");
			Node temp=L;
			while(temp!=null){
				System.out.println(temp.LPTR+" "+temp.x+ " " +temp.RPTR);
				temp=temp.RPTR;
			}
				
		}
	}
}