package mx.edu.utez.recuperaUnidad1.model.dto;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PersonDto {
    private Long id;
    private String name;
    private String surname;
    private String lastname;
    private String direccion;
    private Long contacto;
}
