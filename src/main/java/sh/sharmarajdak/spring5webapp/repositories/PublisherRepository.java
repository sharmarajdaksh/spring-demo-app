package sh.sharmarajdak.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import sh.sharmarajdak.spring5webapp.models.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
