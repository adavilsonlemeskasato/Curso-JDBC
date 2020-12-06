package br.talalricos.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaDeConeccao {

	public Connection getConexao() {
		Connection con = null;
		
		
		String url= "jdbc:postgresql://localhost/curso";
		String user= "postgres";
		String senha= "3636";

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, user, senha);
			System.out.println("Conectado com Sucesso!!!");
			

		} catch (Exception e) {
			e.printStackTrace();

		}
		return con;
	}

}
