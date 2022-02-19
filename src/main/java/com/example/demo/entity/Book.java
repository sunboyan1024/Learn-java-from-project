package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
//    private 权限修饰符，被修饰的变量只能在本类中生效，对外提供对应的set,get方法进行访问,提高对数据访问的安全性。
//    不能通过对象访问
    private  int id;
    private String name;
    private String price;
    private String isbn;

}
