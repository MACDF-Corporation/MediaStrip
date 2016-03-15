package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the fichier database table.
 * 
 */
@Entity
@NamedQuery(name="File.findAll", query="SELECT f FROM File f")
public class File implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private static final long serialVersionUID = 1L;

	private String filePath;

	private Timestamp createdAt;

	private String description;

	private Integer publisher;

	private Boolean published;

	private Integer theme;

	private String title;

	public File() {
	}

	public String getFilePath() {
		return this.filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public Timestamp getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getPublisher() {
		return this.publisher;
	}

	public void setPublisher(Integer publisher) {
		this.publisher = publisher;
	}

	public Boolean getPublished() {
		return this.published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
	}

	public Integer getTheme() {
		return this.theme;
	}

	public void setTheme(Integer theme) {
		this.theme = theme;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}