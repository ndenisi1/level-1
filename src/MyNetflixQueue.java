
public class MyNetflixQueue {
	public static void main(String[] args) {
		//1. Instantiate some Movie objects (at least 5).
		Movie something= new Movie("Lilo and Stitch", 5);
		Movie a= new Movie("The Giver", 3);
		Movie b= new Movie ("Pocahontas", 5);
		Movie c= new Movie ("Bring It On: All Or Nothing", 2);
		Movie d= new Movie ("The Little Mermaid", 4);
			//2. Use the Movie class to get the ticket price of one of your movies.
String	movie= something.getTicketPrice();
	System.out.println(movie);

			//3. Instantiate a NetflixQueue.
	NetflixQueue e= new NetflixQueue ();
			//4. Add your movies to the Netflix queue.
	e.addMovie(a);
	e.addMovie(b);
	e.addMovie(c);
	e.addMovie(d);
	e.addMovie(something);
			//5. Print all the movies in your queue.
			e.printMovies();
			
			//6. Use your NetflixQueue object to finish the sentence "the best movie is...."
			
			System.out.println("the best movie is "+e.getBestMovie());
			//7. Use your NetflixQueue to finish the sentence "the second best movie is...." 

System.out.println(" the second best movie is "+e.getMovie(1));


	}
	
}
