package com.example.demo.Entity;

import java.util.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cateory_id;
	
	private String title;

	private String slug;
	
	private Date created_at ;

}
