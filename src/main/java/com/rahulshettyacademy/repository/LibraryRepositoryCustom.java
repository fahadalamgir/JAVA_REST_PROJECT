package com.rahulshettyacademy.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.rahulshettyacademy.controller.Library;

public interface LibraryRepositoryCustom {

	
	List<Library> findAllByAuthor(String authorName);
}
