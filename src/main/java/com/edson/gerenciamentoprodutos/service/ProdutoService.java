package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.conversor.Conversor;
import com.edson.gerenciamentoprodutos.dao.ProdutoDAO;
import com.edson.gerenciamentoprodutos.model.Ncm;
import com.edson.gerenciamentoprodutos.model.Produto;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.util.Date;
import java.util.List;

public class ProdutoService {

    Produto p = new Produto();
    ProdutoDAO dao = new ProdutoDAO(); 
    Conversor conversor ;

    public void salvar() throws Exception {
        Date d = new Date();

        Usuario user = new Usuario();
        user.setId(1L);

        Unidade uni = new Unidade();
        uni.setId(1L);

        Ncm ncm = new Ncm();
        ncm.setId(1L);

        p.setNome("Abacate");
        p.setObservação("Abacate amarelo");
        p.setAtivo(true);
        p.setUsuario(user);
        p.setUnidade(uni);
        p.setNcm(ncm);
        p.setDataHora(d);
        p.setValor(conversor.formataMilhar.toStringForDouble("70,899"));
        p = dao.Salvar(p);
        System.out.println(p.toString() + "  data hora :  " + d);
        System.out.println("Valor formatado :" +conversor.formataDinheiro.toDoubleForStringMoney(p.getValor()));
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
