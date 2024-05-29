import java.io.FileWriter;


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
		String item_name;
		String quantity;
		float unit_price;
		float total_price;
	}

	private static class ReceiptEntryNode<T> {
		T value;
		ReceiptEntryNode next;
		public ReceiptEntryNode(T value) {
			this.value = value;
		}

		//TODO: 
		void compute_total_price(int quantity , float unit_price) {
			//item.add(quantity * unit_price);
		}
	}

	private static class ReceiptEntryList {
		ReceiptEntryNode head;		

		public ReceiptEntryList(ReceiptEntryNode head) {
			this.head = head;
		}

		void build_list_from_file() {
			try {
				FileWriter write_list = new FileWriter("Input.txt", true);
				//write_list.write(item_list);


			} catch(Exception e) {
			
				System.out.println(e);
			}

		}

		void swap (ReceiptEntryList node_2) {
			this.head = node_2.head;
			
		}
		

	}


}


