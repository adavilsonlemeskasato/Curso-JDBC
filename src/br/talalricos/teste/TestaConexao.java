package br.talalricos.teste;

import java.sql.Connection;

import br.talalricos.jdbc.FabricaDeConeccao;

public class TestaConexao {

	public static void main(String[] args) {

		Connection con = new FabricaDeConeccao().getConexao();
		

	}

}
