package com.jpa.bookmanager.repository;

import com.jpa.bookmanager.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.util.List;

@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void crud(){
        Page<User> users = userRepository.findAll(PageRequest.of(1,3));

        System.out.println(users);

    }

    @Test
    void select(){
        System.out.println(userRepository.findByName("martin"));
    }

    @Test
    void pagingAndSortingTest(){
        System.out.println("finByNameWithPaging : "+ userRepository.findByName("martin",
                PageRequest.of(1,1, Sort.by(Sort.Order.desc("id")))).getContent());
    }

}