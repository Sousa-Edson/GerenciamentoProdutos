package com.edson.gerenciamentoprodutos.dao;

import com.edson.gerenciamentoprodutos.model.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UsuarioDAO {

    public EntityManager getEM() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev-up");
        return factory.createEntityManager();
    }

    public Usuario Salvar(Usuario usuario) throws Exception {
        EntityManager em = getEM();
        try {
            em.getTransaction().begin();
            if (usuario.getId() == null) {
                em.persist(usuario); // executa inserir
            } else {
                if (!em.contains(usuario)) {
                    if (em.find(Usuario.class, usuario.getId()) == null) {
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

}
