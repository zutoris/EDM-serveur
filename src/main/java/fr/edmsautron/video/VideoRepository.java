package fr.edmsautron.video;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface VideoRepository extends CrudRepository<Video, Integer> {

	/*@Query("select id, first_name, date_of_birth from customer where upper(first_name) like '%' || upper(:name) || '%' ")
	List<Statistique> findByName(@Param("name") String name);*/
	
	/*@Query("select * from statistique where videoId = :identifiantVideo")
	Video findByVideo(@Param("identifiantVideo") int videoId);*/
}
