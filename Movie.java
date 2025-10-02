public class Movie extends ItemForSale
{
    private int movieDuration;

    public Movie(Author a, String n, int m){
        super(a, n);
        movieDuration = m;
    }

    public Movie(){
        movieDuration = 0;
        // how do i throw errors here
    }

    public int getMovieDuration(){
        return movieDuration;
    }

    public void setMovieDuration(int length){
        movieDuration = length;
    }
}
