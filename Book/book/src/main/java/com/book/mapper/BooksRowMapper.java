package com.book.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.book.model.BookModel;

public class BooksRowMapper implements RowMapper<BookModel> {

    @Override
    public BookModel mapRow(ResultSet rs, int rowNum) throws SQLException {
        BookModel model=new BookModel();
        model.setKitapId(rs.getInt("ID"));
        model.setKitapAd(rs.getString("AD"));
        model.setBasimYili(rs.getInt("YAYIN_YILI"));
        model.setKategoriId(rs.getInt("KATEGORI_ID"));
        model.setYazarId(rs.getInt("YAZAR_ID"));
        return model;
    }

   
    
}
