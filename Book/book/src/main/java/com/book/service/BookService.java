package com.book.service;

import java.util.List;

import com.book.model.BookModel;

public interface BookService {
    List<BookModel> getBooks() throws Exception;
}
