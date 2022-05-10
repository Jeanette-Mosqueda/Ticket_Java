package com.jeanette.demo.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Ticket {
    private String id;
    private String descripcion;
    private String area;
    private String empleado;

}
