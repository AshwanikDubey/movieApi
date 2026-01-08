package com.movieflix.movieApi.dto;

import java.util.Set;

 
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieDto {
	 
	private Integer movieId;	
	 
	@NotBlank(message="Movie Title Not Empty")
	private String title;	
	 
	@NotBlank(message="Director Not Empty")
	private String director;
	 
	@NotBlank(message="Studio Not Blank")
	private String studio;
	 
	private Set<String> movieCast;
	 
	private Integer releaseYear;
	 
	@NotBlank(message="Provide Poster Name")
	private String poster;
	
	@NotBlank(message="Provide Poster URL")
	private String posterUrl;
	
}
