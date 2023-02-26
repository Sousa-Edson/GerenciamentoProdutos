package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.UnidadeDAO;
import com.edson.gerenciamentoprodutos.model.Unidade;
import com.edson.gerenciamentoprodutos.model.Usuario;
import com.edson.gerenciamentoprodutos.view.UnidadeForm;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UnidadeService {
    
    Unidade u = new Unidade();
    UnidadeDAO dao = new UnidadeDAO();
    
    public Unidade create(UnidadeForm view)   {
        Date d = new Date();
        Usuario user = new Usuario();
        user.setId(1L);
        u.setNome(view.getTxtSigla().getText());
        u.setDescricao(view.getTxtDescricao().getText());
        u.setAtivo(true);
        u.setFragmentado(view.getCkFragmentado().isSelected());
        u.setUsuario(user);
        u.setDataHora(d);
        return u = dao.Salvar(u);
        
    }
    
    public void salvar()   {
        Date d = new Date();
        Usuario user = new Usuario();
        user.setId(1L);
        u.setNome("un");
        u.setDescricao("unidades");
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
    
    public List<Unidade> consultaTodos() {
        List<Unidade> unidades = dao.consultarTodos();
        ArrayList dados = new ArrayList();
        for (Unidade u : unidades) {
          dados.add((new Object[]{u.getId(),u.getNome(),u.getDescricao(),u.getFragmentado()}));
        }//"Id", "Sigla", "Descrição", "Fragmentado"
        return dados;
    }
}
