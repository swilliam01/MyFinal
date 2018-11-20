package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface ReposRepository extends CrudRepository<Repos,Long> {

//    Repos findByOwner(String owner);
    Repos findByName(String name);

}
