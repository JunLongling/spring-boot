package com.spring;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/software-engineers")
public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineer() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "James",
                        "js, node, react, tailwindcss"
                ), new SoftwareEngineer(
                        2,
                        "Jamilas",
                        "java, Spring, react,  tailwindcss"
                )
        );
    }
}
