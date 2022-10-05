package com.bookdetail;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(value = "book-service")
// , url = "http://localhost:8081/api/books" eureka servis kullandığımız için buna gerek yok
public interface BookService {

  
    @GetMapping(value = "/api/books/getBooks")
    Object getBooks() throws Exception;
    
}
