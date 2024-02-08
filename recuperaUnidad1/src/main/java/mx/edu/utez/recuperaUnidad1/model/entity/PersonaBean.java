package mx.edu.utez.recuperaUnidad1.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
@Builder
@Table(name="persona")
public class PersonaBean {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 40, nullable = false)
    private String name;
    @Column(length = 40, nullable = false)
    private String surname;
    @Column(length = 40)
    private String lastname;
    @Column(length = 40)
    private String direccion;
    @Column(length = 40)
    private Long contacto;
}
