package principal;

import DAO.LivroDao;
import conexao.Conexao;
import dominio.Livro;

public class Testador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Livro l = new Livro("Getting Real", "37 Signals", "37 Signals", 4, 25.87);
		Conexao c = new Conexao();
		LivroDao ldao = new LivroDao(c.abrirConexao());
		//ldao.save(l);
		
		System.out.println(ldao.getOne(3));
		
		Livro atualizar = new Livro("Livro Atualizado", "Autor Atualizado", "Editora Atualizada", 12, 66.60);
		atualizar.setId(3);
		ldao.update(atualizar);
		
		System.out.println("----------------");
		
		System.out.println(ldao.getOne(3));
		System.out.println(ldao.list());
		ldao.delete(5);
		
		System.out.println("----------------");
		
		System.out.println(ldao.list());		
		c.fechaConexao();

	}

}
