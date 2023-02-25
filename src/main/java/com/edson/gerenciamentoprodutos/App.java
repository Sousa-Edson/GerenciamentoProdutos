 
package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.UnidadeService;
 
public class App {

    public static void main(String[] args) throws Exception {
        UnidadeService service = new UnidadeService();
        service.salvar();
    }
}
