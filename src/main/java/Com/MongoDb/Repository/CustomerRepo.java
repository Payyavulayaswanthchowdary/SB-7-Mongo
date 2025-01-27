package Com.MongoDb.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import Com.MongoDb.Entity.Customer;

@Repository
public interface CustomerRepo extends MongoRepository<Customer, Integer>{

}
