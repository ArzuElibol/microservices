package com.bookdetail;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    
 // @JsonIgnoreProperties(ignoreUnknown = true)
    @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    //,consumes = "MediaType.APPLICATION_JSON_VALUE", produces = "MediaType.APPLICATION_JSON_VALUE")
  //, consumes = "application/json", produces ="application/json"


//   public List<BookModel> getBooks() throws Exception {
//   List<BookModel> res = (List<BookModel>) bookService.getBooks().resultSet;

    public Object getBooks() throws Exception {
        
       Object res = bookService.getBooks();
       return res;
    }   


    // @RequestMapping(value = "/getBooks", method = RequestMethod.GET)
    // public ResponseEntity<ResultVm> getBooks() throws Exception {
 
    //     ResultVm res= new ResultVm();
 
    //     res.resultSet= bookService.getBooks();
    //     res.isSuccess=true;
    //     res.resultMessage.add("İşlem başarılı");
 
    //     return new ResponseEntity<ResultVm>(res , HttpStatus.OK) ;
    // }
 

  
}