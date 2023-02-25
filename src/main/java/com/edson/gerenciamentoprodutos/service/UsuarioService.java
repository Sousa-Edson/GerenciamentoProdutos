package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.UsuarioDAO;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UsuarioService {

    Usuario u = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();
    DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public void salvar() throws Exception {
        Date d = new Date();
        u.setNome("Ian Teste");
        u.setLogin("i09");
        u.setSenha("1234");
        u.setDataHora(d);
        u.setId(4L);
        u = dao.Salvar(u);
        System.out.println(u.toString() + "  data hora: " + d);
    }

    public void deletar(Long id) {
        u.setId(id);
        u = dao.remover(u.getId());
        System.out.println(u.toString());
    }

    public void consultaPorId(Long id) {
        Usuario u = dao.consultaPorId(id);
        System.out.println(u.toString());
    }

    public void consultaTodos() {
        List<Usuario> usuarios = dao.consultarTodos();
        for (Usuario u : usuarios) {
            System.out.println(u.toString());
        }
    }

    public void consultaTodosTeste() {
        List<Usuario> usuarios = dao.consultarTodos();
        for (Usuario u : usuarios) {
            System.out.println(u.getNome()+" {");
            for (Unidade uni : u.getUnidades()) {
                System.out.println(uni.toString());
            }
            System.out.println("}");
        }
    }
}
