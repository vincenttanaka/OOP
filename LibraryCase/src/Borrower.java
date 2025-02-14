import java.util.ArrayList;

public class Borrower {
    ArrayList<Book> books = new ArrayList<>();
    String bname;
    public Borrower(String bname){
        this.bname=bname;      
    }
    public void displayBorrowedBooks(){
        System.out.println("Alice's Borrowed Books:");
        for (Book book : books) {
            System.out.println("Title      : " + book.title );
            System.out.println("ISBN       : "+book.id);
            System.out.println("Author     : "+book.author.name);
            System.out.println("Biography  : "+book.author.bio);
            System.out.println("--------------------------------");
        }
    }
}
