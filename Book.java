
public class Book extends ItemForSale
{
    private String bookPublisher;

    public Book(Author a, String n, String bPublisher){
        super(a,n);
        bookPublisher = bPublisher;
    }

    public Book(){
        bookPublisher = null;
    }

    public String getBookPublisher(){
        return bookPublisher;
    }

    public void setBookPublisher(String bpub){
        bookPublisher = bpub;
    }
}