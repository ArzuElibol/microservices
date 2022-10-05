package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.book.model.ResultVm;
import com.book.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
   
    // @Autowired
    // BookService bookService;

    //Autowired yerine constructer injection kullanılması önerilir.
    private final BookService bookService;
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    public ResponseEntity<ResultVm> getBooks() throws Exception {
 
        ResultVm res= new ResultVm();
 
        res.resultSet= bookService.getBooks();
        res.isSuccess=true;
        res.resultMessage.add("İşlem başarılı");
 
        return new ResponseEntity<ResultVm>(res , HttpStatus.OK) ;
    }
 


}
