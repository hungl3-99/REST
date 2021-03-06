package com.example.demo.Entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import antlr.Token;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "User")
public class User {
	
	@Id
	private Long id ;
	
	private String userName ;
	
	private String email;
	
	private String password;
	
	private String Token ;
	
	private String[] tags;
    @OneToOne(targetEntity = Profile.class)
    private Profile profile ;
}
