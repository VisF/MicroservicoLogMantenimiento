package main.java.ar.edu.cresta.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.java.ar.edu.cresta.model.Log;
import main.java.ar.edu.cresta.repository.LogRepositoryInterface;


@Service
public class LogService {
	
	@Autowired
	private LogRepositoryInterface log_repository;
	
	public void guardar_log(Log log) {
		this.getLog_repository().save(log);	
	}
	
	private LogRepositoryInterface getLog_repository() {
		return log_repository;
	}
}
