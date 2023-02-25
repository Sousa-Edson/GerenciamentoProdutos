package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.CfopService;
import com.edson.gerenciamentoprodutos.service.ItemService;
import com.edson.gerenciamentoprodutos.service.NotaService;

public class App {

    public static void main(String[] args) throws Exception {
//        UnidadeService service = new UnidadeService();
//         ProdutoService service = new ProdutoService();
//         NcmService service = new NcmService();
//        EmpresaService service = new EmpresaService();
//        CfopService service = new CfopService();
        NotaService service = new NotaService();
//        ItemService service = new ItemService();
        service.salvar();

    }
}
