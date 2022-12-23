import java.util.Scanner;
public class LinkedList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedListMethod ll= new LinkedListMethod();
		while(true){
		System.out.println("Enter Your Choise\n1.insertatFist\n2.insertend \n3.deleteatfirst\n4.display");
		int ch=sc.nextInt();
			switch (ch) {
					case 1 :
					ll.insertatFist();
					break;
					case 2:
						ll.insertatend();
						break;
				case 3:
					ll.deleteatfirst();
					break;
				case 4:
					ll.display();
					break;
			}
		}
	}
}
class Node {
		Node info;
		int data;
	}
class LinkedListMethod{
	Scanner sc = new Scanner(System.in);
	Node head=null;
	
	public void insertatFist(){
			Node node = new Node();
			int d;
			System.out.println("Enter Your number (data)");
			d=sc.nextInt();
				node.data = d;
				node.info=head;
				head=node;
		}
	
	public void insertatend(){
		Node save;
		Node FIRST;
		Node node = new Node();
		if (head==null) {
				System.out.println("link underflow");
				return;
			}
		System.out.println("data part");
			int d = sc.nextInt();
			node.data=d;
			node.info=head;
			head= node;
			save= head;
			while(save.info!=null){
				save =save.info;
		}
	}
	public void deleteatfirst(){
		if (head==null) {
			System.out.println("Linked List Is Empty ");			
		}
		else{
			head=head.info;
		}
	}
	// public void deleteatlast(){
		
	// }

	public void display(){
		Node last=head;
		if (head==null) {
			System.out.println("linkdlist is empty");
		}
		while(last!=null){
			System.out.println("============Your Data Is ===================	");
			System.out.println(last.data+"\t"+last.info);
			last=last.info;
		}
	}
}
