package main.java.ar.edu.cresta.model;

import java.time.LocalDateTime;

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
	private LocalDateTime fecha;
	
	public Log() {
		super();
	}
	
	public Log(String id, Integer idMonopatin, String reporte, LocalDateTime fecha) {
		super();
		this.id = id;
		this.idMonopatin = idMonopatin;
		this.reporte = reporte;
		this.fecha = fecha;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getIdMonopatin() {
		return idMonopatin;
	}
	public void setIdMonopatin(Integer idMonopatin) {
		this.idMonopatin = idMonopatin;
	}
	public String getReporte() {
		return reporte;
	}
	public void setReporte(String reporte) {
		this.reporte = reporte;
	}
	public LocalDateTime getFecha() {
		return fecha;
	}
	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Log [id=" + id + ", idMonopatin=" + idMonopatin + ", reporte=" + reporte + ", fecha=" + fecha + "]";
	}
	
	
}
