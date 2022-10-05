package com.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.dao.BookDao;
import com.book.model.BookModel;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    BookDao bookDao;
    
    @Override
    public List<BookModel> getBooks() throws Exception {
                return bookDao.getBooks();

    }
    
}
