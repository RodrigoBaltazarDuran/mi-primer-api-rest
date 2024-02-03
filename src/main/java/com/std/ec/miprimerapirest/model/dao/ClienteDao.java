package com.std.ec.miprimerapirest.model.dao;

import com.std.ec.miprimerapirest.model.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDao extends CrudRepository<Cliente, Integer> {}
