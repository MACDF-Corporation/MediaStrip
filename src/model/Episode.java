package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the episode database table.
 * 
 */
@Entity
@NamedQuery(name="Episode.findAll", query="SELECT e FROM Episode e")
public class Episode implements Serializable {
	private static final long serialVersionUID = 1L;

	private String filePath;

	private Timestamp createdAt;

	private String description;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	private Integer number;

	private Integer publisher;

	private Boolean published;

	private String serie;

	private Integer theme;

	private String title;

	public Episode() {
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

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
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

	public String getSerie() {
		return this.serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
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