package com.np.elearning.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "author_seq")
    @TableGenerator(allocationSize = 1, name = "author_seq")
    private Integer id;
    @Column(name = "f_name", nullable = false, length = 55)
    private String firstName;
    @Column(name = "l_name", nullable = false, length = 55)
    private String lastName;
    @Column(unique = true, nullable = false)
    private String email;
    private int age;
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;
    @Column(insertable = false)
    private LocalDateTime lastModified;
}
