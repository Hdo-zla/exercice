package org.jabha.exam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.jabha.exam.entity.Book;
@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    public Book getBookByTitre(String titre);
}
