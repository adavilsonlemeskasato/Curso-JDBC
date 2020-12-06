package br.talalricos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.talalricos.entity.Aluno;
import br.talalricos.jdbc.FabricaDeConeccao;

import javax.xml.transform.Result;

public class AlunoDAO {

	Connection con = new FabricaDeConeccao().getConexao();

	public void criaAluno(Aluno a1) {

		System.out.println("Eu recebi o aluno " + a1.getNome());

		String sql = "insert into aluno" + "(nome,endereco,telefone)" + "values(?,?,?)";

		try {

			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, a1.getNome());
			ps.setString(2, a1.getEndereco());
			ps.setString(3, a1.getTelefone());

			ps.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public Aluno getById(Long id) {
		Aluno aluno1 = new Aluno();
		
		String sql = "select * from aluno "
				+ " where id=?";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setLong(1, id);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				aluno1.setId(rs.getLong("id"));
				aluno1.setNome(rs.getString("nome"));
				aluno1.setEndereco(rs.getString("endereco"));
				aluno1.setTelefone(rs.getString("telefone"));
				
			}
			
		} catch (SQLException e) {
			
		}
		return aluno1;
	}

	public List<Aluno> getAlunos (){
		String sql = "select * from aluno ";
		List<Aluno> todosAlunos =new ArrayList<Aluno>();

		try {

			PreparedStatement ps =con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()){
				Aluno a1 = new Aluno();
				a1.setId(rs.getLong("id"));
				a1.setNome(rs.getString("nome"));
				a1.setEndereco(rs.getString("endereco"));
				a1.setTelefone(rs.getString("telefone"));

				todosAlunos.add(a1);

			}

		}catch (SQLException e){

		}
		return todosAlunos;

	}

}
