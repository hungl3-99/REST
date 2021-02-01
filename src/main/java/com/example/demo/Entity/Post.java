package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Post implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9068524237996654176L;

	@Id
	private Long post_id;
	
	private String title ;
	
	private String slug;
	
	private String content ;
	
	private Date created_at ;
}
