package org.example.EjemploBD2.modelo;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.openxava.annotations.Hidden;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
@Getter @Setter
public class Producto {
    @Id
    @GeneratedValue(generator = "system-uuid") // Identificador Universal Único
    @GenericGenerator(name = "system-uuid", strategy = "uuid2") // Estrategia de generación de UUID
    @Hidden // Oculta el campo en la interfaz de usuario
    private String uuid;

    private String nombre;
}
