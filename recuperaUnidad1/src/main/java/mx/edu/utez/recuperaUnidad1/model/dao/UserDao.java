package mx.edu.utez.recuperaUnidad1.model.dao;

import mx.edu.utez.recuperaUnidad1.model.entity.UserBean;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<UserBean, Integer> {

}
