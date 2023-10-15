package com.example.springbootupdate;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends CrudRepository<Book, String> {

    @Query("select * from Book where isbn = :isbn")
    Book findByIsbn(@Param("isbn") String isbn);
}
