package mx.edu.utez.recuperaUnidad1.service.impl;

import mx.edu.utez.recuperaUnidad1.config.ApiResponse;
import mx.edu.utez.recuperaUnidad1.model.dao.UserDao;
import mx.edu.utez.recuperaUnidad1.model.dto.UserDto;
import mx.edu.utez.recuperaUnidad1.model.entity.UserBean;
import mx.edu.utez.recuperaUnidad1.service.IUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class UserImpl implements IUser {
    @Autowired
    private UserDao userDao;
    @Override
    @Transactional
    public UserBean save(UserDto userDto) {
        String contrasena = getContrasena();
        Boolean foundUser = userDto.getStatus();
        if (foundUser == true) {
            return new ResponseEntity<>(new ApiResponse(HttpStatus.BAD_REQUEST, true, "RecordAlreadyExist"), HttpStatus.BAD_REQUEST);
        }else {
            UserBean userCreate = UserBean.builder()
                    .userId(userDto.getUserId())
                    .nombreUser(userDto.getNombreUser())
                    .password(contrasena)
                    .status(userDto.getStatus())
                    .build();

            return userDao.save(userCreate);
        }
    }

    @Override
    public UserBean update(Integer id, UserDto libroDto) {
        return null;
    }

    @Override
    public UserBean findById(Integer id) {
        return null;
    }

    @Override
    public void delete(UserBean userBean) {

    }

    @Override
    public List<UserBean> findAll() {
        return null;
    }
    private String generateRandomString(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder randomString = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            randomString.append(characters.charAt(random.nextInt(characters.length())));
        }

        return randomString.toString();
    }

    private String getContrasena (){
        String random = generateRandomString(8).toUpperCase();
        return random;
    }
}
