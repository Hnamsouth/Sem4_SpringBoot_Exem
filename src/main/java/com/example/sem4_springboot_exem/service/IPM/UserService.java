package com.example.sem4_springboot_exem.service.IPM;

import com.example.sem4_springboot_exem.entities.User;
import com.example.sem4_springboot_exem.repository.UserRepo;
import com.example.sem4_springboot_exem.service.IBaseCRUD;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IBaseCRUD<User> {

    private final UserRepo userRepo;

    @Override
    public List<User> getAll() {
        return userRepo.findAll();
    }

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public User update(User user) {
        return userRepo.save(user);
    }

    @Override
    public User update(User user, Long e) {
        return null;
    }

    @Override
    public boolean delete(Long e) {
        return userRepo.existsById(e);
    }

    @Override
    public <K> User find(K id) {
        return null;
    }

    @Override
    public List<User> search(String e) {
        return userRepo.findAllByIdOrAgeOrNameOrSalary(Long.parseLong(e),Integer.parseInt(e),e,Double.parseDouble(e));
    }
    public List<User> searchMultiple(Long id,Integer age,String name,Double salary) {
        return userRepo.findAllByIdOrAgeOrNameOrSalary(id,age,name,salary);
    }

}
