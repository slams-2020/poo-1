package poo1;

import poo1.exceptions.BadPasswordException;
import poo1.models.Group;
import poo1.models.User;

public class Tests {

	public static void main(String[] args) {
		User u=new User("Sam");
		
		System.out.println(u);
		try {
			u.setPassword("azerty", "azerty");
			System.out.println(u);
		}catch(Exception e) {
			if(e instanceof BadPasswordException) {
				System.out.println("Mauvais mot de passe");
			}else {
				e.printStackTrace();
			}
		}
		Group g=new Group("sio");
		u.setGroup(g);
		System.out.println(u);
		g.addUser(new User("Thomas"));
		System.out.println(g);
	}

}
