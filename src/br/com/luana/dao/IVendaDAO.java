package br.com.luana.dao;

import br.com.luana.dao.generic.IGenericDAO;
import br.com.luana.domain.Venda;
import br.com.luana.exceptions.DAOException;
import br.com.luana.exceptions.TipoChaveNaoEncontradaException;


public interface IVendaDAO extends IGenericDAO<Venda, String> {

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}