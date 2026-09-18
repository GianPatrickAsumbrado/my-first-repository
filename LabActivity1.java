public class LabActivity1 {
    public static void main(String[] args) {
 
        Movie movie1 = new Movie();
        movie1.title = "Spider-Man";
        movie1.genre = "Action";
        movie1.duration = 121;
 
        Movie movie2 = new Movie();
        movie2.title = "Star Wars";
        movie2.genre = "Sci-Fi";
        movie2.duration = 121;
 
        Movie movie3 = new Movie();
        movie3.title = "Jurassic Park";
        movie3.genre = "Adventure";
        movie3.duration = 127;
 
        movie1.displayInfo();
        movie2.displayInfo();
        movie3.displayInfo();
    }
}