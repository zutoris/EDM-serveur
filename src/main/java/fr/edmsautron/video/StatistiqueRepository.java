package fr.edmsautron.video;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface StatistiqueRepository extends CrudRepository<Statistique, Integer> {

	/*@Query("select id, first_name, date_of_birth from customer where upper(first_name) like '%' || upper(:name) || '%' ")
	List<Statistique> findByName(@Param("name") String name);*/
	
	@Query("select * from statistique where videoId = :identifiantVideo")
	Statistique findByVideo(@Param("identifiantVideo") int videoId);
}
