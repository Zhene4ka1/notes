package com.example.notes.Service;

import com.example.notes.Model.User;
import com.example.notes.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class  UserService {
    private final UserRepository userRepository;


    //SAVE
    public User save(User user){
        return userRepository.save(user);
    }


    //DEL
    public void delete(Long id){
        this.userRepository.deleteById(id);
    }


    //Search by ID
    public Optional<User> getById(Long id){
        return userRepository.findById(id);
    }


    //Get all users
    public List<User> getAllUser(){
        return userRepository.findAll();
    }
}
