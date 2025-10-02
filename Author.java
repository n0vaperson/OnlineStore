public class Author
{
    private String name;
    private String authorBDate;

    public Author(String n, String a){
        name = n;
        authorBDate = a;
    }

    public Author(){
        name = null;
        authorBDate = null;
    }

    public String getAuthorBDate(){
        return authorBDate;
    }

    public String getName(){
        return name;
    }

    public void setAuthorBDate(String date){
        authorBDate = date;
    }

    public void setName(String n){
        name = n;
    }
}
