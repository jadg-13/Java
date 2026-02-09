package org.example.EjemploBD2.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;
import org.openxava.annotations.Stereotype;

import javax.persistence.*;

@Entity
@Table(name = "cities")
@Getter @Setter
public class City {
    @Id
    @GeneratedValue(generator = "system-uuid") // Identificador Universal Único
    @GenericGenerator(name = "system-uuid", strategy = "uuid2") // Estrategia de generación de UUID
    @Hidden // Oculta el campo en la interfaz de usuario
    private String uuid;

    @Column(name = "name_city", nullable = false, length = 60) // Define el nombre de la columna y que no puede ser nula
    private String name;

    private int extension;
}
