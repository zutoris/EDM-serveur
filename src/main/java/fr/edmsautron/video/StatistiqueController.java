package fr.edmsautron.video;

import java.util.Date;
import java.util.Optional;

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
	private VideoRepository statistiqueRepository;

	@RequestMapping("/")
	String home() {
		return "Hello World!";
	}

	@RequestMapping(value = "/video/stat/{idVideo}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void addStat(@PathVariable("idVideo") int idVideo) {
		Optional<Video> reponseBdd = statistiqueRepository.findById(Integer.valueOf(idVideo));
		Video video;
		if (reponseBdd.isPresent()) {
			video = reponseBdd.get();
		} else {
			video = new Video();
			video.setNombreVues(0);
			video.setId(idVideo);
		}
		video.setNombreVues(video.getNombreVues() + 1);
		video.setDateDerniereVue(new Date());
		statistiqueRepository.save(video);
	}

}
