import java.util.List;

public class UserService {

    private final BookService bookService;

    private User[] users;
    private int userCount;
    public UserService(BookService bookService){
        this.bookService = bookService;
        this.users = new User[100];
        this.userCount = 0;
    }

    public void addUser(User user){
        users[userCount] = user;
        userCount++;
    }



    // Delete, Update, getUserBYTC, assignBookToUser methodlariniz yaziniz.
}
