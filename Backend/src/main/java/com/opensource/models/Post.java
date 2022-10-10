package com.opensource.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="posts")
public class Post {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="post_id")
	private int id;
	
	
	private String picture;
	
	@NotBlank
	private String text;
	
	private int likes;
	
	private int dislikes;
	
	@OneToMany
	@JoinTable(
			name= "posts_comments",
			joinColumns= @JoinColumn(name="post_id"),
			inverseJoinColumns= @JoinColumn(name= "users_id"))
	private List<Comment> comments;

	public Post(String picture, String text, int likes, int dislikes, List<Comment> comments) {
		super();
		this.picture = picture;
		this.text = text;
		this.likes = likes;
		this.dislikes = dislikes;
		this.comments = comments;
	}
	
	
	
	
}
