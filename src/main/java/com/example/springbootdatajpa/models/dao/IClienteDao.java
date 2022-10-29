package com.example.springbootdatajpa.models.dao;

import java.util.List;

import com.example.springbootdatajpa.models.entity.Cliente;

public interface IClienteDao {
	
	public List<Cliente> findAll();
	
	public void save (Cliente cliente);
}
