package com.hong.pet.response;

import lombok.*;

@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class Response<T> {
    private int code;
    private String msg;
    private T data;
}
