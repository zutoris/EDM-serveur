package fr.edmsautron.video;

import java.util.Date;

import org.springframework.data.annotation.Id;

public class Statistique {

	@Id
	private Long id;
	
	private int videoId;
	private int nombreVues;
	private Date dateDerniereVue;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
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
