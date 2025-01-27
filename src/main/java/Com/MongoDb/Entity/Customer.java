package Com.MongoDb.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Customer")
public class Customer {
	@Id
	Integer cNo;
	String cName;
	String Loc;
	
	
	
	public Customer() {
		super();
	}



	public Customer(Integer cNo, String cName, String loc) {
		super();
		this.cNo = cNo;
		this.cName = cName;
		Loc = loc;
	}



	public Integer getcNo() {
		return cNo;
	}



	public void setcNo(Integer cNo) {
		this.cNo = cNo;
	}



	public String getcName() {
		return cName;
	}



	public void setcName(String cName) {
		this.cName = cName;
	}



	public String getLoc() {
		return Loc;
	}



	public void setLoc(String loc) {
		Loc = loc;
	}
	
	
	
	

}
