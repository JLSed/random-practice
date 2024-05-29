import java.io.FileWriter;
import java.io.File;
import java.util.Scanner;


public class mp3 {

	public static void main(String[] args) {
		//ReceiptEntryNode node = new ReceiptEntryNode("Lugaw","2",24);
		//RReceiptEntryNode node1 = new ReceiptEntryNode("Lugaw","2",24);
		//RLinkedList<LinkedList> ll = new LinkedList<LinkedList>();
		//Rll.add(node);
		//Rll.add(node1);
		//RReceiptEntryList ss = new ReceiptEntryList(ll);
		//RSystem.out.println(ss.item_list.get(1));

		ReceiptEntryNode<String> node = new ReceiptEntryNode<String>("Pansit");
		ReceiptEntryNode<Integer> node2 = new ReceiptEntryNode<Integer>(21);

		ReceiptEntryList linkedlist = new ReceiptEntryList(node);
		linkedlist.head.next = node2;
		System.out.println(linkedlist.head.next.value);
		
		ReceiptEntryList new_linkedlist = new ReceiptEntryList(node2);
		new_linkedlist.head.next = node;
		linkedlist.swap(new_linkedlist);
		System.out.println(linkedlist.head.next.value);
	}

	private static class ReceiptEntry {
		static ReceiptEntryNode<String> item_name;
		static ReceiptEntryNode<String> quantity;
		static ReceiptEntryNode<Float> unit_price;
		static ReceiptEntryNode<Float> total_price;
	}

	private static class ReceiptEntryNode<T> {
		T value;
		ReceiptEntryNode next;
		public ReceiptEntryNode(T value) {
			this.value = value;
		}

		//TODO: 
		void compute_total_price(T quantity, T total_price) {
			float f = (float) value ;
		}
	}

	private static class ReceiptEntryList {
		ReceiptEntryNode head;		

		public ReceiptEntryList() {
			this.head = ReceiptEntry.item_name;
		}

		//TODO:
		void build_list_from_file() {
			try {
				Scanner scan = new Scanner(new File("Input.txt"));
				while (scan.hasNextLine()) {
				// assign values to each nodes and linking them
					ReceiptEntry.item_name.value = scan.nextLine();				
					ReceiptEntry.item_name.next = ReceiptEntry.quantity;
					ReceiptEntry.quantity.value = scan.nextLine();				
					ReceiptEntry.quantity.next = ReceiptEntry.unit_price;
					ReceiptEntry.unit_price.value = scan.nextLine();				
					ReceiptEntry.unit_price.next = ReceiptEntry.total_price;
				}
				//FileWriter write_list = new FileWriter("Input.txt", true);


			} catch(Exception e) {
			
				System.out.println(e);
			}

		}

		void swap (ReceiptEntryNode node) {
			this.head = node;
			
		}
		

	}


}
