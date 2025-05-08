package com.pedrosts.dev.course.services;

import com.pedrosts.dev.course.entities.User;
import com.pedrosts.dev.course.repositories.UserRepository;
import com.pedrosts.dev.course.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User postUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user) {
        User obj = userRepository.getReferenceById(id);
        updateData(obj, user);
        return userRepository.save(obj);
    }

    private void updateData(User obj, User user) {
        obj.setEmail(user.getEmail());
        obj.setName(user.getName());
        obj.setPhone(user.getPhone());
    }
}
