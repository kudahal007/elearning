package com.np.elearning;

import com.np.elearning.models.Author;
import com.np.elearning.models.Video;
import com.np.elearning.repository.AuthorRepository;
import com.np.elearning.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class ElearningApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElearningApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(AuthorRepository authorRepository,
                                               VideoRepository videoRepository) {
        return args -> {
            var author = Author.builder()
                    .age(34)
                    .email("John.doe@gmail.com")
                    .firstName("John")
                    .lastName("Doe")
                    .createdAt(LocalDateTime.now())
                    .build();
            authorRepository.save(author);
            var video = Video.builder()
                    .name("test video")
                    .length(5)
                    .build();
            videoRepository.save(video);
        };
    }
}
