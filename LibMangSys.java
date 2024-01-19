class Library{
    String [] books;
    int no_of_books;
    Library(){
        this.books = new String[100];
        this.no_of_books= 0;

    }

    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book+" has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books:");
        for(String book: this.books){
            if(book == null){
                continue;
            }
            System.out.println("*"+book);
        }
    }

    void issueBook(String book){
        for(int i=0;i<this.books.length; i++){
            if(this.books[i].equals(book)){
                System.out.println("The books has been issued");
                this.books[i]=null;
                return;
            }
        }
        System.out.println("The book does not exist");
    }

    void returnBook(String book){
        addBook(book);

    }


}

public class LibMangSys {
    public static void main(String[] args) {
        Library centralLib = new Library();
        
        centralLib.addBook("Atomic Habits");
        centralLib.addBook("Rich Dad, Poor Dad");
        centralLib.addBook("Java : A-Z");
        centralLib.showAvailableBooks();
        centralLib.issueBook("Atomic Habits");
        centralLib.showAvailableBooks();
        centralLib.returnBook("Atomic Habits");
        centralLib.showAvailableBooks();
        
        }

    }
