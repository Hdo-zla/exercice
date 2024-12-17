package org.jabha.exam.service;

import org.jabha.exam.dto.BookDTO;



public interface BookService {
  public BookDTO saveBook(BookDTO bookDTO);
  public BookDTO getBookByTitre(String titre);



}
