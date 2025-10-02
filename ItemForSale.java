public class ItemForSale implements Author
{
    protected Author author;
    protected String name;

    public ItemForSale(Author aut, String nam){
        author = aut;
        name = nam;
    }

    public ItemForSale(){
        author = null;
        name = null;
    }

    public String getAuthor(){
        return author.getName();
    }

    public String getName(){
        return name;
    }

    public void setAuthor(Author a){
        author = a;
    }

    public void setName(String n){
        name = n;
    }

}
