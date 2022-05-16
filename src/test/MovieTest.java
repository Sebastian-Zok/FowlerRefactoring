package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Movie;



class MovieTest {


	private Movie movie;


	@Test
	public void testGetTitle() {
		movie = new Movie("Back to the Future", 0);
		assertEquals(movie.getTitle(), "Back to the Future");
	}

	@Test
	public void testGetPriceCode() {
		movie = new Movie("Back to the Future", 0);
		assertEquals(movie.getPriceCode(), 0);
	}

	@Test
	public void testSetPriceCode() {
		Movie m = new Movie("Star Wars: a new hope", 1);
		m.setPriceCode(0);
		assertEquals(m.getPriceCode(), 0);
	}

}