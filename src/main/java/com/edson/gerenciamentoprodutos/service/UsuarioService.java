package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.UsuarioDAO;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.util.Date;
import java.util.List;

public class UsuarioService {

    Usuario u = new Usuario();
    UsuarioDAO dao = new UsuarioDAO();
   

//    public void salvar() throws Exception {
//        Date d = new Date();
//        u.setNome("Edson");
//        u.setLogin("edson");
//        u.setSenha("123456");
//        u.setDataHora(d);
//        u.setAtivo(true);
//        u = dao.Salvar(u);
//        System.out.println(u.toString() + "  data hora: " + d);
//    }
    public void salvarUpdate(Usuario u) throws Exception {
        Date d = new Date();
        u = (Usuario) consultaPorId(u.getId());
        u.setNome("funciona aqui");
        u.setDataHora(d);
        
        u = dao.Salvar(u);
        System.out.println(u.toString() + "  data hora: " + d);
    }

    public void deletar(Usuario u, Long id) {
        u.setId(id);
        u = dao.remover(u.getId());
        System.out.println(u.toString());
    }

    public Usuario consultaPorId(Long id) {
        Usuario u = dao.consultaPorId(id);
        System.out.println(u.toString());
        return u;
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
            System.out.println(u.getNome() + " {");
            for (Unidade uni : u.getUnidades()) {
                System.out.println(uni.toString());
            }
            System.out.println("}");
        }
    }
}
