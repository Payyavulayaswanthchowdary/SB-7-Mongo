package Com.MongoDb.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import Com.MongoDb.Entity.Customer;
import Com.MongoDb.Service.CustomerService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	@PostMapping(value="/insert")
	public String saveRecord(@RequestBody Customer cust) {
		service.insertRecord(cust);
		return "Record inserted"+cust.getcNo();
	}
	
	@PutMapping(value="/update")
	public String updateRecord(@RequestBody Customer cust) {
		service.updateRecord(cust);
		return "Record Updated "+cust.getcNo();
	}
	
	@GetMapping(value="/retriveSingleRecord")
	public Optional<Customer> retriveRecord(@RequestParam Integer cNo){
		return service.retriveRecord(cNo);
	}
	
	@GetMapping(value="/retriveAllRecords")
	public Iterable<Customer> retriveAllRecords(){
		return service.retriveAllRecords();
	}
	
	@DeleteMapping(value="/deleteRecord")
	public String deleteRecord(@RequestParam Integer cNo) {
		service.deleteRecord(cNo);
		return "record deleted-->"+cNo;
	}

}
