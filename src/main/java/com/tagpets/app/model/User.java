package com.tagpets.app.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@AllArgsConstructor
public class User implements Serializable {
    @Getter
    @Setter
    private long id;
    @Getter
    @Setter
    private String name;
    @Getter
    @Setter
    private String lastName;
    @Getter
    @Setter
    private String phone;
    @Getter
    @Setter
    private String email;

}
