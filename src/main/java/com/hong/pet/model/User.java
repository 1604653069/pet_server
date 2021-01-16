package com.hong.pet.model;

import lombok.*;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer uid;
    private String username;
    private String password;
    private Integer sex;
    private Integer age;
    private String tel;
    private String address;
}
