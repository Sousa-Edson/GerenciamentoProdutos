package com.edson.gerenciamentoprodutos.dao;

import com.edson.gerenciamentoprodutos.model.Unidade;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UnidadeDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev-up");
        return factory.createEntityManager();
    }

    public Unidade Salvar(Unidade usuario) throws Exception {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();
            if (usuario.getId() == null) {
                em.persist(usuario); // executa inserir
            } else {
                if (!em.contains(usuario)) {
                    if (em.find(Unidade.class, usuario.getId()) == null) {
                        throw new Exception("Erro ao atualizar!!");
                    }
                }
                usuario = em.merge(usuario); // executa update
            }
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Unidade remover(Long id) {
        EntityManager em = getEM();
        Unidade usuario = em.find(Unidade.class, id);
        try {
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
        return usuario;
    }

    public Unidade consultaPorId(Long id) {
        EntityManager em = getEM();
        Unidade usuario = null;
        try {
            usuario = em.find(Unidade.class, id);
        } finally {
            em.close();
        }
        return usuario;
    }

    public List<Unidade> consultarTodos() {
        EntityManager em = getEM();
        List<Unidade> unidades;
        try {
            Query q = em.createNamedQuery("Unidade.consultaTodos");
            unidades = q.getResultList();
        } catch (Exception e) {
            unidades = new ArrayList();
        } finally {
            em.close();
        }
        return unidades;
    }

}
