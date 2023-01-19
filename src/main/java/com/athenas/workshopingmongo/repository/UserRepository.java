package com.athenas.workshopingmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.athenas.workshopingmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
