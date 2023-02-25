 
package com.edson.gerenciamentoprodutos;

import com.edson.gerenciamentoprodutos.service.NcmService;
 
public class App {

    public static void main(String[] args) throws Exception {
       NcmService service = new NcmService();
        service.consultaPorId(1L);
        
    }
}
