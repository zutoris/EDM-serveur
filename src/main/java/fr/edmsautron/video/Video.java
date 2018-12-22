package fr.edmsautron.video;

import java.util.Date;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Video {

	@Id
	private Integer id;
	private int nombreVues;
	private Date dateDerniereVue;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNombreVues() {
		return nombreVues;
	}
	public void setNombreVues(int nombreVues) {
		this.nombreVues = nombreVues;
	}
	public Date getDateDerniereVue() {
		return dateDerniereVue;
	}
	public void setDateDerniereVue(Date dateDerniereVue) {
		this.dateDerniereVue = dateDerniereVue;
	}
	
}
