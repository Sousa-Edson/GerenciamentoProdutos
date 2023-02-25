 
package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.ProdutoService;
import com.edson.gerenciamentoprodutos.service.UsuarioService;
 
public class App {

    public static void main(String[] args) throws Exception {
//        ProdutoService service = new ProdutoService();
//        service.consultaTodos();
        UsuarioService service = new UsuarioService();
          service.consultaTodosTeste();
    }
}
