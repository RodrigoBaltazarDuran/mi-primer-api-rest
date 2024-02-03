package com.std.ec.miprimerapirest.service;

import com.std.ec.miprimerapirest.model.dto.ClienteDto;
import com.std.ec.miprimerapirest.model.entity.Cliente;

import java.util.List;

public interface IClienteService {
    List listAll();
    Cliente save(ClienteDto clienteDto);

    Cliente findById(Integer id);

    void delete(Cliente cliente);

    boolean existById(Integer id);
}
