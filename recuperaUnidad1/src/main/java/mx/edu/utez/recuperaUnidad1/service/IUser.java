package mx.edu.utez.recuperaUnidad1.service;

import mx.edu.utez.recuperaUnidad1.model.dto.UserDto;
import mx.edu.utez.recuperaUnidad1.model.entity.UserBean;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IUser {
    UserBean save(UserDto userDto);
    @Transactional
    UserBean update(Integer id, UserDto userDto);

    UserBean findById(Integer id);

    void delete(UserBean user);

    List<UserBean> findAll();
}
