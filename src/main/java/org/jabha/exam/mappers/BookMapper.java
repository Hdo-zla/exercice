package org.jabha.exam.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.jabha.exam.dto.BookDTO;

import org.jabha.exam.entity.Book;


@Component
public class BookMapper {
    ModelMapper mapper = new ModelMapper();
    public Book fromBookDTOtoBook(BookDTO bookDTO){
 return mapper.map(bookDTO, Book.class);
    }
    public BookDTO fromBooktoBookDTO(Book book){
        return mapper.map(book,BookDTO.class);
    }
}
