package org.example.EjemploBD2.modelo;

import lombok.Getter;
import lombok.Setter;
import org.openxava.annotations.Required;
import org.openxava.annotations.Tab;

import javax.persistence.*;

@Entity
@Table(name = "students")
@Getter @Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "cif", length = 9, nullable = false, unique = true)
    @Required(message = "CIF is required")


    private String cif;
    @Column(name = "name_student", length = 60, nullable = false)
    private String name;


}
