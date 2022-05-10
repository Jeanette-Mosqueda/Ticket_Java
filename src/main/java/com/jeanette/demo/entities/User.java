package com.jeanette.demo.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter
@ToString
@EqualsAndHashCode
public class User {
    private String name;
    private String email;
    private String area;
    private  String rol;
}
