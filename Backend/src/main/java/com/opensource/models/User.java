package com.opensource.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="users_id")
	private int id;
	
	private String firstname;
	
	private String lastname;
	
	@NotBlank
	@Length(min=3)
	@Pattern(regexp="[a-zA-Z][a-zA-Z0-9]*")
	@Column(unique=true)
	private String username;
	
	@NotBlank
	@Length(min=9)
	private String password;
	
	@NotBlank
	@Email
	@Column(unique=true)
	private String email;
	private String profilePic;
	
	@OneToOne
	@JoinTable(
			name="users_bio",
			joinColumns= @JoinColumn(name="users_id"),
			inverseJoinColumns = @JoinColumn(name="bio_id"))
	private Bio bio;
	
	@ManyToMany
	@JoinTable
			(name="user_friends",
			joinColumns= @JoinColumn(name="users_id"),
			inverseJoinColumns = @JoinColumn(name="friend_id"))
	private List<User> friends;
	
	private String dms;
	
	@OneToMany
	@JoinTable(
			name="users_post",
			joinColumns= @JoinColumn(name="users_id"),
			inverseJoinColumns = @JoinColumn(name="post_id"))
	private List<Post> posts;
	
	
	
	
	public User(String firstname, String lastname, String username, String password, String email, String profilePic,
			Bio bio) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
		this.profilePic = profilePic;
		this.bio = bio;
	}


	public User(String firstname, String lastname, String username, String password, String email) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.password = password;
		this.email = email;
	}

}
