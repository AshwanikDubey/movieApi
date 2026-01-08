package com.movieflix.movieApi.entities;

import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer movieId;
	
	@Column(nullable=false,length=200,name="Title")
	@NotBlank(message="Movie Title Not Empty")
	private String title;
	
	@Column(nullable=false)
	@NotBlank(message="Director Not Empty")
	private String director;
	
	@Column(nullable=false)
	@NotBlank(message="Studio Not Blank")
	private String studio;
	
	@ElementCollection
	@CollectionTable(name="movie_cast")
	private Set<String> movieCast;
	
	@Column(nullable=false)   
	private Integer releaseYear;
	
	@Column(nullable=false)
	@NotBlank(message="Provide Poster Name")
	private String poster;
	
}
