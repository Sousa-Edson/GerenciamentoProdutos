package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.UnidadeDAO;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class UnidadeService {

    Unidade u = new Unidade();
    UnidadeDAO dao = new UnidadeDAO();
    DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public void salvar() throws Exception {
        Date d = new Date();
        Usuario user = new Usuario();
        user.setId(2L);
        u.setNome("exs");
        u.setAtivo(true);
        u.setUsuario(user);
        u.setDataHora(d);
        u = dao.Salvar(u);
        System.out.println(u.toString() + "  data hora :  " + d);
    }

    public void deletar(Long id) {
        u.setId(id);
        u = dao.remover(u.getId());
        System.out.println(u.toString());
    }

    public void consultaPorId(Long id) {
        Unidade u = dao.consultaPorId(id);
        System.out.println(u.toString());
        System.out.println(u.getUsuario().getNome());
    }

    public void consultaTodos() {
        List<Unidade> unidades = dao.consultarTodos();
        for (Unidade u : unidades) {
            System.out.println(u.toString());
        }
    }
}
