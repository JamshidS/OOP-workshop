
public class BookService {
    private Book[] books;
    private int bookCount;
    public BookService(){
        this.books = new Book[100];
        this.bookCount = 0;
    }

    public void addBook(Book book){
        books[bookCount] = book;
        bookCount++;
    }

    public void updateBook(Book book,int id){
        boolean isBookFound = false;
        for(int i=0;i<bookCount;i++){
            if(books[i].getId()==id){
                book.setId(books[i].getId());
                book.setPage(books[i].getPage());
                books[i] = book;
                isBookFound = true;
                break;
            }
        }

        if(isBookFound){
            System.out.println("Kitap gucellenmistir...");
        }else {
            System.out.println("Kitap bulunamadi...");
        }

    }
    public Book[] getBooks(){
        return books;
    }

    // delete
    // getBookById
    // getBooksByAuthorName
}
