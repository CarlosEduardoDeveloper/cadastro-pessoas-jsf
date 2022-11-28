package br.com.cadastro.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.cadastro.dao.PessoaDao;
import br.com.cadastro.entidade.Pessoa;

@ManagedBean(name = "pessoaBean")
@SessionScoped
public class PessoaBean {
	
	private Pessoa pessoa = new Pessoa();
	private List<Pessoa> pessoas = new ArrayList<>();
	
	
	public void salvar() {
		PessoaDao.salvar(pessoa);
		pessoas.add(pessoa);
		listar();
		}

	public void listar() {
		PessoaDao dao = new PessoaDao();
		pessoas = (ArrayList<Pessoa>) PessoaDao.listar();
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public List<Pessoa> getPessoas() {
		return pessoas;
	}

	public void setPessoas(List<Pessoa> pessoas) {
		this.pessoas = pessoas;
	}


	
	

}
