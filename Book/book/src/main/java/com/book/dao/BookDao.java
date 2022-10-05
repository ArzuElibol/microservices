package com.book.dao;

import java.util.List;

import com.book.model.BookModel;

public interface BookDao {
    
    List<BookModel> getBooks() throws Exception;

}
