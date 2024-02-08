package mx.edu.utez.recuperaUnidad1.service;

import mx.edu.utez.recuperaUnidad1.model.dto.PersonDto;
import mx.edu.utez.recuperaUnidad1.model.entity.PersonaBean;

import java.util.List;

public interface IPerson {
    PersonaBean save(PersonDto personDto);

    PersonDto findById(Integer id);

    void delete(PersonaBean personaBean);

    List<PersonaBean> findAll();
}
