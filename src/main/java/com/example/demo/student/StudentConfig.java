package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepo repository){
        return args-> {
                  Student fatma =  new Student(
                            "Fatma",
                            "fatmamed@gmail.com",
                            LocalDate.of(2000, Month.FEBRUARY,3)
                    );
            Student hamadi =  new Student(
                    "Fatma",
                    "hamadimed@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY,3)
            );
            Student med =  new Student(
                    "Fatma",
                    "medmed@gmail.com",
                    LocalDate.of(2000, Month.FEBRUARY,3)
            );

            repository.saveAll(
                List.of(med,fatma,hamadi)
            );


        };
    }
}
