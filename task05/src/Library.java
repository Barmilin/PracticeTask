class Library {
    Book[] books;
    int count = 0;

    public Library(int size) {
        books = new Book[size];
    }

    // Добавить книгу
    public void addBook(Book book) {
        if (count < books.length) {
            books[count] = book;
            count++;
        } else {
            System.out.println("Library is full!");
        }
    }

    // Взять книгу
    public void checkOutBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title) && books[i].isAvailable) {
                books[i].isAvailable = false;
                System.out.println("book \"" + title + "\" checked out.");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" is not available.");
    }

    // Вернуть книгу
    public void returnBook(String title) {
        for (int i = 0; i < count; i++) {
            if (books[i].title.equalsIgnoreCase(title) && !books[i].isAvailable) {
                books[i].isAvailable = true;
                System.out.println("Book \"" + title + "\" returned.");
                return;
            }
        }
        System.out.println("Book \"" + title + "\" not found.");
    }

    // Показать все книги
    public void showBooks() {
        for (int i = 0; i < count; i++) {
            System.out.println(books[i].title + " - " +
                    (books[i].isAvailable ? "Available" : "Checked out"));
        }
    }
}
