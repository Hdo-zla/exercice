package org.jabha.exam;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.jabha.exam.entity.Book;
import org.jabha.exam.repositories.BookRepository;

import java.util.List;


@SpringBootApplication
public class ExamAceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExamAceApplication.class, args);

    }

    @Bean
    CommandLineRunner start(BookRepository bookRepository) {
        return args -> {
            List<Book> students = List.of(
                    Book.builder().price("10").resume("test").titre("teestt").datePublication("123").build(),
                    Book.builder().price("10").resume("test").titre("teestt").datePublication("123").build(),
                    Book.builder().price("10").resume("test").titre("teestt").datePublication("123").build(),
                    Book.builder().price("10").resume("test").titre("teestt").datePublication("123").build()

            );
            bookRepository.saveAll(students);
        };
    }
}

