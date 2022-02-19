package com.example.demo.mapper;

import com.example.demo.entity.Book;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {

    @Select("select * from book")
    List<Book> findBooks();

    @Select("select * from book where id = #{id}")
    Book findBookById(@Param("id") int id);
}
