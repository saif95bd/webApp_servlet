package saif.project;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;




@Entity
public class reg {
	
	private long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private Date birth;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}
	
	public String getMiddleName() {
		return middleName;
	}

	public Date getBirth() {
		return birth;
	}

	public void setMiddleName(String middlename) {
		this.middleName = middlename;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}