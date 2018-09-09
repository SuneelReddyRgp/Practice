package Internal;

//A Java program to demonstrate Comparator interface
import java.io.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

//A class 'Movie' that implements Comparable
class Movie implements Comparable<Movie>
{
  private double rating;
  private String name;
  private int year;

  // Used to sort movies by year
  public int compareTo(Movie m)
  {
      return this.year - m.year;
  }

  // Constructor
  public Movie(String nm, double rt, int yr)
  {
      this.name = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name; }
  public int getYear()      {  return year;  }
}


class theatre implements Comparable<theatre>
{
  private double rating;
  private String name1;
  private int year;

  // Used to sort movies by year
  public int compareTo(theatre t)
  {
      return this.year - t.year;
  }

  // Constructor
  public theatre(String nm, double rt, int yr)
  {
      this.name1 = nm;
      this.rating = rt;
      this.year = yr;
  }

  // Getter methods for accessing private data
  public double getRating() { return rating; }
  public String getName()   {  return name1; }
  public int getYear()      {  return year;  }



}
//Class to compare Movies by ratings
class RatingCompare implements Comparator<Movie>
{
  public int compare(Movie m1, Movie m2)
  {
//	  Integer.valueOf(m1.getRating())
	  
	  return Double.compare(m1.getRating(), m2.getRating());
	  
//      if (m1.getRating() < m2.getRating()) return -1;
//      if (m1.getRating() > m2.getRating()) return 1;
//      else return 0;
  }
}

//Class to compare Movies by name
class NameCompare implements Comparator<Movie>
{
  public int compare(Movie m1, Movie m2)
  {
      return m1.getName().compareTo(m2.getName());
  }
}


/**
 * This is a chained comparator that is used to sort a list by multiple
 * attributes by chaining a sequence of comparators of individual fields
 * together.
 * @author www.codejava.net
 *
 */
class EmployeeChainedComparator implements Comparator<Movie> {

private List<Comparator<Movie>> listComparators;


		@SafeVarargs
		EmployeeChainedComparator(Comparator<Movie>... comparators) {
		this.listComparators = Arrays.asList(comparators);
		}

		@Override
		public int compare(Movie o1, Movie o2) {
			// TODO Auto-generated method stub
					for (Comparator<Movie> comparator : listComparators) {
						int result = comparator.compare(o1, o2);
						if (result != 0) {
						return result;
				}
			}
					return 0;
			
		}
}

//Driver class
class Main
{
	
	private AtomicInteger i = new AtomicInteger(0);
	
	
  public static void main(String[] args)
  {
      ArrayList<Object> list = new ArrayList<>();
      list.add(new Movie("Force Awakens", 8.3, 2015));
      list.add(new Movie("Star Wars", 8.7, 1977));
      list.add(new Movie("Empire Strikes Back", 8.8, 1980));
      list.add(new Movie("Return of the Jedi", 8.4, 1983));
      list.add(new theatre("Theatre of the 1", 8.4, 1983));
      list.add(new theatre("Theatre of the 2", 9.4, 1983));
      list.add("Suneel");
      list.add(1);
      
      Main m = new Main();
      

      // Sort by rating : (1) Create an object of ratingCompare
      //                  (2) Call Collections.sort
      //                  (3) Print Sorted list
      System.out.println("Sorted by rating");
      RatingCompare ratingCompare = new RatingCompare();
//      Collections.sort(list, new EmployeeChainedComparator(new RatingCompare(), new NameCompare()));
      String className; 
      for (Object movie: list) {
    	  className = movie.getClass().getSimpleName().trim();
    	  if(className.equals("Movie")) {
    		  System.out.println(((Movie) movie).getRating() + " " +
                      ((Movie) movie).getName() + " " +
                      ((Movie) movie).getYear());
    	  }else {
    		  System.out.println(((theatre) movie).getRating() + " " +
                      ((theatre) movie).getName() + " " +
                      ((theatre) movie).getYear());
    	  }
    	  
      }
          


      // Call overloaded sort method with RatingCompare
      // (Same three steps as above)
     /* System.out.println("\nSorted by name");
      NameCompare nameCompare = new NameCompare();
      Collections.sort(list, nameCompare);
      for (Movie movie: list)
          System.out.println(movie.getName() + " " +
                             movie.getRating() + " " +
                             movie.getYear());

      // Uses Comparable to sort by year
      System.out.println("\nSorted by year");
      Collections.sort(list);
      for (Movie movie: list)
          System.out.println(movie.getYear() + " " +
 }
 }                            movie.getRating() + " " +
                             movie.getName()+" ");*/
  }
}