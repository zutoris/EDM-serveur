package fr.edmsautron.video;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatistiqueController {

	@Autowired
	private StatistiqueRepository statistiqueRepository;
	
	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping(value="/video/addStat/{idVideo}", method=RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void addStat(@PathVariable("idVideo") int idVideo) {
		Statistique stat = statistiqueRepository.findByVideo(idVideo);
		if (stat == null) {
			stat = new Statistique();
			stat.setNombreVues(0);
			stat.setVideoId(idVideo);
		}
		stat.setNombreVues(stat.getNombreVues() + 1);
		stat.setDateDerniereVue(new Date());
		statistiqueRepository.save(stat);
	}

}
