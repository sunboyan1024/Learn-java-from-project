package com.example.demo.controller;

import com.example.demo.entity.Book;
import com.example.demo.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
//控制器
public class HelloController {


    @Autowired
    BookMapper bookMapper;
    @GetMapping("/")
    public String home(Model model){


////        model.addAttribute("name","JAVA编程思想");
//        List<Book> books = new ArrayList<Book>();
//        books.add(new Book(1,"JAVA编程思想","100",null));
//        books.add(new Book(2,"计算机原理","88",null));

        List<Book> books = bookMapper.findBooks();



        model.addAttribute("bookList",books);

        return  "home";
    }

    @GetMapping("/detail")
    public String detail(Model model, HttpServletRequest request){
        int id = Integer.parseInt(request.getParameter("id"));

        Book book = bookMapper.findBookById(id);

        model.addAttribute("book",book);


        return "detail";
    }
}
