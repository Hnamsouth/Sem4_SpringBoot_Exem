package com.example.sem4_springboot_exem.entities.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RequestParam;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    @NotNull
    @Size(min = 3)
    private String name;
    @NotNull
    @Size(min = 1)
    private int age;
    @NotNull
    @Size(min = 1)
    private double salary;
}
