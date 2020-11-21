package com.healthify.womenhealthify.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length= 20)
    private String firstname;
    @Column(nullable = false, length= 20)
    private String lastname;
    @Column(nullable = false, unique = true, length= 45)
    private String email;
    @Column(nullable = false, length= 64)
    private String password;

    
    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName( String firstname){
        this.firstname = firstname;
    }
    public String getLastName(){
        return lastname;
    }
    public void setLastName( String lastname){
        this.lastname = lastname;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail( String email){
        this.email = email;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword( String password){
        this.password = password;
    }
  

}
