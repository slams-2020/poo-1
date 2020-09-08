package poo1.models;

import java.util.ArrayList;
import java.util.List;

public class Group {
	private String name;
	private List<User> users;
	private Organization organization;
	
	public Group(Organization orga) {
		this("",orga);
	}
	
	public Group(String name,Organization organization) {
		this.name=name;
		users=new ArrayList<User>();//Création liste vide
		this.organization=organization;
	}	
	public void addUser(User user) {
		user.setGroup(this);
	}
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<User> getUsers() {
		return users;
	}

	@Override
	public String toString() {
		return "Groupe [name=" + name + ",users"+users+"]";
	}

	public Organization getOrganization() {
		return organization;
	}

}
