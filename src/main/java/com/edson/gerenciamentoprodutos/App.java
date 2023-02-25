 
package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.ProdutoService;
 
public class App {

    public static void main(String[] args) throws Exception {
        ProdutoService service = new ProdutoService();
        service.consultaTodos();
    }
}
