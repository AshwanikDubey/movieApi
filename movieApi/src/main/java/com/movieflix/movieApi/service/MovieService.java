package com.movieflix.movieApi.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.movieflix.movieApi.dto.MovieDto;

public interface MovieService {
	
	MovieDto addMovie(MovieDto movieDto,MultipartFile file);
	
	MovieDto getMovie(Integer movieId);
	
	List<MovieDto> getAllMovies();
	
}
