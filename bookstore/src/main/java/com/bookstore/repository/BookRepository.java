package com.bookstore.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.Books;
@Repository
public interface BookRepository extends JpaRepository<Books,Integer> {

	

}
