package com.example.springbootrecape.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addcontact") 
public class AddContact {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    private String phone;
    private String message;
    private String status;
	public AddContact() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public AddContact(Integer id, String name, String email, String phone, String message, String status) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.message = message;
		this.status = status;
	}
	@Override
	public String toString() {
		return "AddContact [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", message="
				+ message + ", status=" + status + "]";
	}
    
    
}
