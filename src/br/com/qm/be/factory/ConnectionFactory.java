package br.com.qm.be.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection() {
		try {
			
			return DriverManager.getConnection(					
					"jdbc:postgresql://localhost:5432/qeepmoving","postgres","Coelho@1979");
			
		} catch (SQLException e) {
			
			throw new RuntimeException(e);
		}
	}	

}
