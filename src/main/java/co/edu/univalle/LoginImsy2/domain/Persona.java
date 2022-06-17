package co.edu.univalle.LoginImsy2.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;
    @NotEmpty
    private String identificacion;
    @NotEmpty
    private String nombre;
    @NotEmpty
    @Email //Validacion para Email
    private String email;
    @NotEmpty
    private String login;
    @NotEmpty
    private String contrasena;
    @NotEmpty
    private String rol;
}
