 
package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.UsuarioService;
 
public class GerenciamentoProdutos {

    public static void main(String[] args) throws Exception {
        UsuarioService service = new UsuarioService();
        service.salvar();
    }
}
