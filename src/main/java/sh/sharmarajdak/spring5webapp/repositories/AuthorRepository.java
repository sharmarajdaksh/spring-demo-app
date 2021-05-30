package sh.sharmarajdak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sh.sharmarajdak.spring5webapp.models.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
