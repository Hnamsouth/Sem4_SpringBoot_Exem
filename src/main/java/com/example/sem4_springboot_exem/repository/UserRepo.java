package com.example.sem4_springboot_exem.repository;

import com.example.sem4_springboot_exem.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User,Long> {
    @Override
    Optional<User> findById(Long id);
    boolean existsById(Long id);
    List<User> findAllByIdOrAgeOrNameOrSalary(Long id,Integer age,String name,Double salary);

}
