package onetoone_bi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class AdharCard {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@OneToOne(mappedBy = "ac")
	private Person person;
	@Override
	public String toString() {
		return "AdharCard [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	

}
