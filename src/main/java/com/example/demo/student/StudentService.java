package com.example.demo.student;

import jakarta.websocket.server.ServerEndpoint;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudent(){
        return List.of(
                new Student(
                        1L,
                        "Fatma",
                        "fatmamed@gmail.com",
                        LocalDate.of(2000, Month.FEBRUARY,3),
                        21
                )
        );
    }
}
