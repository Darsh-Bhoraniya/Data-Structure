import java.util.Scanner;	
class Node{
	int info;
	Node link;
}

class Cq_implement{
	 Node first=null;
	 Node last=null;

	public void insert(int x){
		Node newNode = new Node();

		newNode.info = x;

		if(first==null){
			newNode.link=newNode;
			first=last=newNode;
		}

		else{
			newNode.link=first;
			last.link=newNode;
			first=newNode;
		}
	}
	public void insertatlast(int x){
		Node newNode = new Node();
		newNode.info=x;
		if (first==null) {
			newNode.link=newNode;
			first=last=newNode;
		}
		else{
			newNode.link=first;
			last.link=newNode;
			last=newNode;
		}
	}

	public void display(){
		if (first==null || last==null) {
			System.out.println("linkdlist is empty");
			return;
		}
		Node SAVE = first;
		while(SAVE !=null && SAVE != last){
			// System.out.println("============Your Data Is ===================	");
			System.out.println(last.info+"\t"+last.link);
			SAVE=SAVE.link;
		}
		System.out.println(SAVE.info+"\t"+SAVE.link);
	}
}




public class Cq_LinkedList{
	public static void main(String[] args) {
		Cq_implement cq = new Cq_implement();
		Scanner sc = new Scanner (System.in);
		cq.insert(3);
		cq.insertatlast(8);
		cq.display();
	}
}






// while(true){
// 			System.out.println("Enter You choice 1.inset \n2.display");
// 			int ch = sc.nextInt();
// 			switch(ch){
// 		case 1 :
// 			System.out.println("Enter You Data Part ");
// 			cq.insert(sc.nextInt());
// 		case 2 :
// 			cq.display();
// 			}
// 		}