package pe.com.nttdata.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import pe.com.nttdata.model.Customer;
import reactor.core.publisher.Mono;

@Repository
public interface CustomerRepository extends ReactiveMongoRepository<Customer, String>{
	//findByIdAndIdTypeProduct
	public Mono<Customer>findByNumberDocument(String numberDocument);
	
}
