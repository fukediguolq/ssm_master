package com.oracle.web.bean;

public class Admin {

    private Integer id;
	
	private String name;
	
	private String username;
	
	private String password;
	
	private String touxiang;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(Integer id, String name, String username, String password, String touxiang) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
		this.touxiang = touxiang;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getTouxiang() {
		return touxiang;
	}


	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", touxiang=" + touxiang + "]";
	}


	
}
