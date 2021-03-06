package org.cedam.application.randonnees.entity;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "TREK")
//public class Trek {
//
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	@Column(name = "ID")
//	private long id;
//
//	@Column(name = "NAME", nullable = false, unique = false)
//	private String name;
//
//	@Column(name = "YEAR", nullable = false, unique = false)
//	private int year;
//
//	@Column(name = "LOCATION", nullable = false, unique = false)
//	private String location;
//
//	// @OneToMany(cascade = CascadeType.ALL, mappedBy = "trek")
//	// private List<Day> days = new ArrayList<Day>();
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getYear() {
//		return year;
//	}
//
//	public void setYear(int year) {
//		this.year = year;
//	}
//
//	public String getLocation() {
//		return location;
//	}
//
//	public void setLocation(String location) {
//		this.location = location;
//	}
//
//	/*
//	 * public List<Day> getDays() { return days; }
//	 * 
//	 * public void setDays(List<Day> days) { this.days = days; }
//	 */
//
//}

public class Trek {

	private long id;

	private String name;

	private int year;

	private String location;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
