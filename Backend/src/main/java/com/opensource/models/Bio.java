package com.opensource.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="bio")
public class Bio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="bio_id")
	private int id;
	
	private Date birthday;
	
	@NotBlank
	private String text;
	private String school;
	private String work;
	private String interests;
	
	
	public Bio(String text) {
		this.text = text;
	}
}
