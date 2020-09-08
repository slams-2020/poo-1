package poo1.models;

import poo1.exceptions.BadPasswordException;

public class User extends Object{
	private String login;
	private String password;
	private Group group;
	
	public User(String login,Group group) {
		this.login=login;
		this.group=group;
	}
	
	public User(Group group) {
		this("no login",group);
	}

	public String getLogin() {
		return this.login;
	}
	public void setLogin(String login) {
		this.login=login;
	}
	
	public void setPassword(String password,String conf) throws Exception {
		if(password.equals(this.password)||!password.equals(conf)) {
			throw new BadPasswordException("bad new password");
		}
		this.password=password;
	}
	
	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
		group.getUsers().add(this);
	}
	
	public Organization getOrganization() {
		return group.getOrganization();
	}

	@Override
	public String toString() {
		if(group!=null){
			return login+"("+group.getName()+")";
		}
		return login;
	}
	
}
