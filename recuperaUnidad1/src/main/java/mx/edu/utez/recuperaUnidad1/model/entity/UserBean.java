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
@Table(name="user")
public class UserBean {
    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Column(name = "nombre")
    private String nombreUser;
    @Column(nullable = false, length = 150)
    private String password;
    @Column(columnDefinition = "BOOL DEFAULT true")
    private Boolean status;
}
