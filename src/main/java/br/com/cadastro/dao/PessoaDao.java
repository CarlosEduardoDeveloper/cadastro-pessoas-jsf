package br.com.cadastro.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.cadastro.entidade.Pessoa;
import br.com.cadastro.util.JPAUtil;

public class PessoaDao {
	
	public static void salvar(Pessoa pessoa) {
		EntityManager em = JPAUtil.criarEntityManager();
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		em.close();
	}
	
	public static List<Pessoa> listar() {
		EntityManager em = JPAUtil.criarEntityManager();
		Query q = em.createQuery("select p from Pessoa p");
		List<Pessoa> resultado = q.getResultList();
		em.close();
		return resultado;
	}

}
