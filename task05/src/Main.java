public class Main {
    public static void main(String[] args) {
    Library library = new Library(5);

        library.addBook(new Book("Misery", "Stephen King"));
        library.addBook(new Book("Love on the Brain", "Ali Hazelwood"));


        System.out.println("All books:");
        library.showBooks();
        System.out.println("\nTaking 'Love on the Brain':");
        library.checkOutBook("Love on the Brain");
        library.returnBook("Love on the Brain");
        library.showBooks();

    }
}