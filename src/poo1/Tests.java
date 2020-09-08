package poo1;

import poo1.models.Group;
import poo1.models.Organization;
import poo1.models.User;

public class Tests {

	public static void main(String[] args) {
		Organization o=new Organization("SupAvenir");
		Group sio=new Group("2 SIO SLAM",o);
		User u=new User("Sam",sio);
		
		System.out.println(u.getOrganization());
	}

}
