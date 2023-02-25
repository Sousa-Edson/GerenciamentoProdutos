package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.ProdutoDAO;
import com.edson.gerenciamentoprodutos.model.Ncm;
import com.edson.gerenciamentoprodutos.model.Produto;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class ProdutoService {

    Produto p = new Produto();
    ProdutoDAO dao = new ProdutoDAO();
    DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public void salvar() throws Exception {
        Date d = new Date();
        
        Usuario user = new Usuario();
        user.setId(1L);
        
        Unidade uni = new Unidade();
        uni.setId(2L);
        
        Ncm ncm = new Ncm();
        ncm.setId(1L);
        
        p.setNome("Banana");
        p.setObservação("Banana prata");
        p.setAtivo(true);
        p.setUsuario(user);
        p.setUnidade(uni);
        p.setNcm(ncm);
        p.setDataHora(d);
        p.setValor(0.89);
        p = dao.Salvar(p);
        System.out.println(p.toString() + "  data hora :  " + d);
    }

    public void deletar(Long id) {
        p.setId(id);
        p = dao.remover(p.getId());
        System.out.println(p.toString());
    }

    public void consultaPorId(Long id) {
        Produto u = dao.consultaPorId(id);
        System.out.println(p.toString());
        System.out.println(p.getUsuario().getNome());
        System.out.println(p.getUnidade().getNome());
    }

    public void consultaTodos() {
        List<Produto> produtos = dao.consultarTodos();
        for (Produto p : produtos) {
            System.out.println(p.toString());
            System.out.println(p.getUsuario().getNome());
        System.out.println(p.getUnidade().getNome());
        }
    }
}
