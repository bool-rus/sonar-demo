package ru.demo.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.demo.jpa.Book;

import java.util.Map;

/**
 * Created by bool on 07.09.17.
 */
@Controller
public class BookController {
    @Autowired
    private SessionFactory sessionFactory;

    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public String listBooks(Map<String,Object> model) {
        model.put("text","test");
        model.put("list",sessionFactory.openSession().createCriteria(Book.class).list());
        return "list";
    }

    @RequestMapping(value = "/books", method = RequestMethod.POST)
    public String addBook(Map<String,Object> model, @RequestParam("name") String name, @RequestParam("price") Double price) {
        Book book = new Book(name,price);
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(book);
        model.put("list",session.createCriteria(Book.class).list());
        transaction.commit();
        return "list";
    }


}
