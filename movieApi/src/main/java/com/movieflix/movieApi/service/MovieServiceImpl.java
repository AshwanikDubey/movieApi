package com.movieflix.movieApi.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.movieflix.movieApi.dto.MovieDto;
import com.movieflix.movieApi.repositories.MovieRepository;

public class MovieServiceImpl implements MovieService{
	
	private final MovieRepository movieRepository;
	
	public MovieServiceImpl(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}

	@Override
	public MovieDto addMovie(MovieDto movieDto, MultipartFile file) {
		 // upload File
		
		// Set Value of the field 'poster' as filename
		
		// map dto to Movie Object
		
		//Save the movie then return saved movie object
		
		//Generate the Poster URL 
		
		//Map Movie Object to DTO Object and return it.
		
		return null;
	}

	@Override
	public MovieDto getMovie(Integer movieId) {
		 
		return null;
	}

	@Override
	public List<MovieDto> getAllMovies() {
		 
		return null;
	}

}
