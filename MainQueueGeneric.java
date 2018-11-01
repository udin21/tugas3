ublic class MainQueueGeneric {
	public static void main(String[] args) {
		QueueGeneric <Integer> sc = new QueueGeneric <Integer>();

			    sc.insert(3);
			    sc.insert(4);
			    sc.insert(5);
			    System.out.print("Hasil :");
			    System.out.println(sc.remove());
			}
}
