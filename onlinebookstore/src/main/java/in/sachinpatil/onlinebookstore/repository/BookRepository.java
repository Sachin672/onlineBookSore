package in.sachinpatil.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.sachinpatil.onlinebookstore.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
