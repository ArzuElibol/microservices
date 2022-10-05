package com.book.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.book.mapper.BooksRowMapper;
import com.book.model.BookModel;

@Repository
public class BookDaoImpl implements BookDao{

@Autowired
JdbcTemplate jdbcTemplate;

@Autowired
NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public List<BookModel> getBooks() throws Exception {
        List<BookModel> item=new ArrayList<>();
        String selectQuery="SELECT * FROM KITAP";
        item=jdbcTemplate.query(selectQuery,new BooksRowMapper());

        

        return item;
    }
    
}
