package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.UsuarioDAO;
import com.edson.gerenciamentoprodutos.model.Usuario;

public class UsuarioService {

    Usuario u = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();

    public void salvar() throws Exception {
        u.setNome("Edson");
        u.setLogin("e01");
        u.setSenha("1234");
        u = dao.Salvar(u);
        System.out.println(u.toString());
    }

}
