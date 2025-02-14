import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added to library:"+book.title);
    } 

    public void borrowBook(Borrower borrow, Book book){
        borrow.books.add(book);
        books.remove(book);
        System.out.println(borrow.bname+ " borrowed :"+book.title);
    }

    public void returnBook(Borrower borrow, Book book){
        books.add(book);
        borrow.books.remove(book);
        System.out.println(borrow.bname+ " returned :"+book.title);
    }

    public void displayLibraryBooks(){
        System.out.println("Books id Library:");
        for (Book book : books) {
            System.out.println("Title      : " + book.title );
            System.out.println("ISBN       : "+book.id);
            System.out.println("Author     : "+book.author.name);
            System.out.println("Biography  : "+book.author.bio);
            System.out.println("--------------------------------");
        }
    }
}
