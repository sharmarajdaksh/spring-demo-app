package sh.sharmarajdak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sh.sharmarajdak.spring5webapp.models.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
