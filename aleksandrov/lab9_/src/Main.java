public class Main {

    public static void main(String[] args) {
        LibrarianAdmin librarianAdmin = new LibrarianAdmin("OLEG", 1928);
        Reader studentReader = new cReader("READER", 2005);
        Supplier supplier = new cSupplier ("Supplier", 2009);


        librarianAdmin.orderBooks(supplier);
        librarianAdmin.findBooks();
        studentReader.pickUpBooks(6);
        studentReader.pickUpBooks(4);
        librarianAdmin.delayNotice(studentReader);
        studentReader.dropOffBooks(5);
        supplier.bringBooks();
    }
}