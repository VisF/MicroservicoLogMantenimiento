package ar.edu.cresta.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(value="Log")
public class Log {
	@Id
	private String id;
	private Integer idMonopatin;
	private String reporte;
	private LocalDate fecha;
	
}
