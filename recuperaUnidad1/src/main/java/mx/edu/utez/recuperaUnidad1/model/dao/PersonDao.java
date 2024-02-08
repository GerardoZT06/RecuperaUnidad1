package mx.edu.utez.recuperaUnidad1.model.dao;

import mx.edu.utez.recuperaUnidad1.model.entity.PersonaBean;
import org.springframework.data.repository.CrudRepository;

public interface PersonDao extends CrudRepository<PersonaBean, Integer > {
}
