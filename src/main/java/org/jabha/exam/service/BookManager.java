package org.jabha.exam.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.jabha.exam.dto.BookDTO;
import org.jabha.exam.entity.Book;
import org.jabha.exam.mappers.BookMapper;
import org.jabha.exam.repositories.BookRepository;


@Service
@AllArgsConstructor
public class BookManager implements BookService {
    BookRepository bookRepository;
    BookMapper mapper;

    @Override
    public BookDTO saveBook(BookDTO bookDTO) {
        Book book = mapper.fromBookDTOtoBook(bookDTO);
        book = bookRepository.save(book);
        return mapper.fromBooktoBookDTO(book);
    }

    @Override
    public BookDTO getBookByTitre(String titre) {
        return mapper.fromBooktoBookDTO(bookRepository.getBookByTitre(titre));
    }
}

