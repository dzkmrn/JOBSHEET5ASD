public class TicketMain {
    
public static void main(String[] args) {
    // TODO code application logic here
    
    TicketService data = new TicketService();
    Ticket t1 = new Ticket("Singapore Airlines", 1830000, "Bali", "Singapore");
    Ticket t2 = new Ticket("Scoot", 411400, "Jakarta", "Singapore");
    Ticket t3 = new Ticket("Tiger", 170000, "Jakarta", "Semarang");
    Ticket t4 = new Ticket("Batik Air", 3811000, "Banyuwangi", "Jakarta");
    Ticket t5 = new Ticket("Lion", 522900, "Surabaya", "Bali");

    data.tambah(t1);
    data.tambah(t2);
    data.tambah(t3);
    data.tambah(t4);
    data.tambah(t5);

    System.out.println("Daftar Harga ticket sebelum di sorting = ");
    data.tampil();
    System.out.println("==================================");

    System.out.println("Data ticket setelah di sorting berdasarkan :");
    System.out.println("Sorting dengan metode Bubble sort :");
    data.bubbleSort();
    data.tampil();
    System.out.println();
    System.out.println("==================================");
    System.out.println("Sorting dengan metode Selection sort :");
    data.selectionSort();
    data.tampil();
    System.out.println("==================================");
}
}
