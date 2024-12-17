package org.jabha.exam.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BookDTO {
    private String titre;
    private String publisher;
    private String datePublication;
    private String price;
    private String resume;
}
