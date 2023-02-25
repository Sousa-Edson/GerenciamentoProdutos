package com.edson.gerenciamentoprodutos.service;

import com.edson.gerenciamentoprodutos.dao.EmpresaDAO;
import com.edson.gerenciamentoprodutos.model.Empresa;
import com.edson.gerenciamentoprodutos.model.Endereco;
import com.edson.gerenciamentoprodutos.model.Usuario;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class EmpresaService {

    Empresa e = new Empresa();
    EmpresaDAO dao = new EmpresaDAO();
    DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm");

    public void salvar() throws Exception {
        Date d = new Date();
        Usuario user = new Usuario();
        user.setId(1L);

        e.setNomeFantasia("Empresa B");
        e.setRazaoSocial("Empresa B LTDA");
        e.setCnpj("04.616.931/0001-70");
        e.setIe("30303030");
        e.setAtivo(true);
        e.setUsuario(user);
        e.setDataHora(d);
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dois");
        endereco.setComplemento("Casa verde");
        endereco.setBairro("Isaura");
        endereco.setCidade("Pq Santana");
        endereco.setEstado("SP");
        endereco.setCep("06100-010");
        e.setEndereco(endereco);
        e = dao.Salvar(e);
        System.out.println(e.toString() + "  data hora :  " + d);
    }

    public void deletar(Long id) {
        e.setId(id);
        e = dao.remover(e.getId());
        System.out.println(e.toString());
    }

    public void consultaPorId(Long id) {
        Empresa u = dao.consultaPorId(id);
        System.out.println(u.toString());
        System.out.println(u.getUsuario().getNome());
        System.out.println(u.getEndereco().getRua());
    }

    public void consultaTodos() {
        List<Empresa> empresas = dao.consultarTodos();
        for (Empresa u : empresas) {
            System.out.println(u.toString());
        }
    }
}
