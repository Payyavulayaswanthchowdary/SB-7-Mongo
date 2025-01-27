package Com.MongoDb.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import Com.MongoDb.Entity.Customer;
import Com.MongoDb.Repository.CustomerRepo;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepo repo;
	
	public void insertRecord(Customer cust) {
		repo.save(cust);
	}
	
	public void updateRecord(Customer cust) {
		repo.save(cust);
	}
	
	public Optional<Customer> retriveRecord(Integer cNo){
		return repo.findById(cNo);
	}
	
	public Iterable<Customer> retriveAllRecords(){
		return repo.findAll();
	}
	
	public void deleteRecord(Integer cNo) {
		 repo.deleteById(cNo);
	}

}
