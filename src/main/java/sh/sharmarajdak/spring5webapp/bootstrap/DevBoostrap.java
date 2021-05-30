package sh.sharmarajdak.spring5webapp.bootstrap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import sh.sharmarajdak.spring5webapp.models.Author;
import sh.sharmarajdak.spring5webapp.models.Book;
import sh.sharmarajdak.spring5webapp.models.Publisher;
import sh.sharmarajdak.spring5webapp.repositories.AuthorRepository;
import sh.sharmarajdak.spring5webapp.repositories.BookRepository;
import sh.sharmarajdak.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBoostrap implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private PublisherRepository publisherRepository;

	private void initData() {

		Author eric = new Author("Eric", "Evans");
		Publisher hc = new Publisher("Harper Collins", "London");
		Book ddd = new Book("Domain Driven Design", "1234", hc);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);

		authorRepository.save(eric);
		publisherRepository.save(hc);
		bookRepository.save(ddd);

		Author rod = new Author("Rod", "Johnson");
		Publisher wx = new Publisher("Worx", "New York");
		Book noEJB = new Book("J2EE Development without EJB", "2344", wx);
		rod.getBooks().add(noEJB);
		noEJB.getAuthors().add(rod);

		authorRepository.save(rod);
		publisherRepository.save(wx);
		bookRepository.save(noEJB);
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		initData();
	}
}
