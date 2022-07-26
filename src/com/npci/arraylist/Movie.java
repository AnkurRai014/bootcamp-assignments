package com.npci.arraylist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Movie {

	private String name;
	private String directorName;
	private int duration;
	private int releasedYear;
	
	public Movie() {
		
	}

	public Movie(String name, String directorName, int duration, int releasedYear) {
		this.name = name;
		this.directorName = directorName;
		this.duration = duration;
		this.releasedYear = releasedYear;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getDirectorName() {
		return directorName;
	}

	protected void setDirectorName(String directorName) {
		this.directorName = directorName;
	}

	protected int getDuration() {
		return duration;
	}

	protected void setDuration(int duration) {
		this.duration = duration;
	}

	protected int getReleasedYear() {
		return releasedYear;
	}

	protected void setReleasedYear(int releasedYear) {
		this.releasedYear = releasedYear;
	}
	
	
	public static void main(String[] args) {
		
		List<Movie> movies = new ArrayList<>();
		movies.add(new Movie("Inception","Christopher Nolan", 148, 2010));
		movies.add(new Movie("Avengers: Endgame","Anthony & Joe Russo", 181, 2019));
		movies.add(new Movie("F9","Justin Lin", 148, 2021));
		movies.add(new Movie("The Matrix","Lana & Lilly Wachowski", 136, 1999));
		movies.add(new Movie("The Fate of the Furious","F. Gary Gary", 136, 2017));
		movies.add(new Movie("Batman Begins","Christopher Nolan", 140, 2005));
		movies.add(new Movie("Thor: Love and Thunder","Taika Waititi", 119, 2022));
		movies.add(new Movie("The Matrix Reloaded","Lana & Lilly Wachowski", 138, 2003));
		movies.add(new Movie("Avengers: Infinity War","Anthony & Joe Russo", 149, 2018));
		movies.add(new Movie("The Matrix Revolutions","Lana & Lilly Wachowski", 129, 2003));
		movies.add(new Movie("Interstellar","Christopher Nolan", 169, 2014));
		
		
		Map<String, List<String>> directorMovieMap = new HashMap<>();
		
		for(Movie movie : movies) {
			if(directorMovieMap.get(movie.getDirectorName()) == null) {
				List<String> l1 = new ArrayList<>();
				l1.add(movie.getName());
				directorMovieMap.put(movie.directorName, l1);
			}
			else {
				List<String> l1 = new ArrayList<>(directorMovieMap.get(movie.getDirectorName()));
				l1.add(movie.getName());
				directorMovieMap.put(movie.getDirectorName(), l1);
			}
		}
		
		Iterator<Map.Entry<String, List<String>>> iterator = directorMovieMap.entrySet().iterator();
	    while (iterator.hasNext()) {
	        Entry<String, List<String>> entry = iterator.next();
	        System.out.println(entry.getKey() + " : " + entry.getValue());
	    }
	}
}
