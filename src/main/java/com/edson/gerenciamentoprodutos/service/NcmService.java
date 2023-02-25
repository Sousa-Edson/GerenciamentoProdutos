package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.NcmDAO;
import com.edson.gerenciamentoprodutos.model.Ncm;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NcmService {

    Ncm n = new Ncm();
    NcmDAO dao = new NcmDAO();
    DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public void salvar() throws Exception {
        Date d = new Date();
        Usuario user = new Usuario();
        user.setId(1L);
        n.setNome("47111091");
        n.setDescricao("pacotes de papel e plastico");
        n.setAtivo(true);
        n.setUsuario(user);
        n.setDataHora(d);
        n = dao.Salvar(n);
        System.out.println(n.toString() + "  data hora :  " + d);
    }

    public void deletar(Long id) {
        n.setId(id);
        n = dao.remover(n.getId());
        System.out.println(n.toString());
    }

    public void consultaPorId(Long id) {
        Ncm u = dao.consultaPorId(id);
        System.out.println(u.toString());
        System.out.println(u.getUsuario().getNome());
    }

    public void consultaTodos() {
        List<Ncm> ncms = dao.consultarTodos();
        for (Ncm u : ncms) {
            System.out.println(u.toString());
        }
    }
}
