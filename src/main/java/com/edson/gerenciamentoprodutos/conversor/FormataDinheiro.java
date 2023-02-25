package com.edson.gerenciamentoprodutos.conversor;

import java.text.NumberFormat;
import java.util.Locale;

public class FormataDinheiro {

    public String formataDinheiro(Double d) {
        try {
            Locale ptBr = new Locale("pt", "BR");
            return NumberFormat.getInstance(ptBr).format(d);
        } catch (Exception e) {
            return "";
        }
    }
}
