package main.java.ar.edu.cresta.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import main.java.ar.edu.cresta.model.Log;


@Repository
public interface LogRepositoryInterface extends MongoRepository<Log, String>{

}
