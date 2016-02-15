package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import play.data.validation.Constraints.Required;

import com.avaje.ebean.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Task extends Model {

	@Id
	public Long id;
	@Required
	public String name;

	@Required
	public String description;

	public Integer seconds;

	@JsonIgnore
	@ManyToOne
	public Recipe recipe;
	public String photo;
	public static final Find<Long, Task> find = new Find<Long, Task>() {
	};

	// PHOTO?

	public static Task findById(Long id) {
		return find.byId(id);
	}
}
