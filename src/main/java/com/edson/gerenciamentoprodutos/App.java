package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.CfopService;

public class App {

    public static void main(String[] args) throws Exception {
//        UnidadeService service = new UnidadeService();
//         ProdutoService service = new ProdutoService();
//         NcmService service = new NcmService();
//        EmpresaService service = new EmpresaService();
        CfopService service = new CfopService();
        service.consultaTodos();

    }
}
