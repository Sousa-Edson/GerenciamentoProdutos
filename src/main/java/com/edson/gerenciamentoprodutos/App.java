package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.model.Usuario;
import com.edson.gerenciamentoprodutos.service.CfopService;
import com.edson.gerenciamentoprodutos.service.EmpresaService;
import com.edson.gerenciamentoprodutos.service.ItemService;
import com.edson.gerenciamentoprodutos.service.NotaService;
import com.edson.gerenciamentoprodutos.service.UsuarioService;

public class App {

    public static void main(String[] args) throws Exception {
//        UnidadeService service = new UnidadeService();
//         ProdutoService service = new ProdutoService();
//         NcmService service = new NcmService();
//        EmpresaService service = new EmpresaService();
//        CfopService service = new CfopService();
//        NotaService service = new NotaService();
//        ItemService service = new ItemService();
        UsuarioService service = new UsuarioService();
        Usuario u = new Usuario();
        u.setId(Long.valueOf(1));
        service.salvarUpdate(u);

    }
}
