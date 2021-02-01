package com.example.demo.Entity;

import java.io.Serializable;
import java.util.*;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Profile")
public class Profile implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private String first_name;
	
	private String lastName;
	
	private Date created_at;
	
	private int age;
	
	private Date birthday_date;
	
	private Object[] historyObjects ;
	
}
