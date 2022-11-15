package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PublicCapis {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String title;
	private String description;
	private String auth;
	private boolean https;
	private String cors;
	private String category;
}
