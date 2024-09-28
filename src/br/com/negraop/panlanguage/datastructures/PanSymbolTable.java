package br.com.negraop.panlanguage.datastructures;

import java.util.ArrayList;
import java.util.HashMap;

public class PanSymbolTable {

    private HashMap<String, PanSymbol> map;

    public PanSymbolTable() {
        map = new HashMap<String, PanSymbol>();
    }

    public void add(PanSymbol symbol) {
        map.put(symbol.getName(), symbol);
    }

    public boolean exists(String symbolName) {
        return map.get(symbolName) != null;
    }

    public PanSymbol get(String symbolName) {
        return map.get(symbolName);
    }

    public ArrayList<PanSymbol> getAll() {
        ArrayList<PanSymbol> lista = new ArrayList<PanSymbol>();
        for (PanSymbol symbol : map.values()) {
            lista.add(symbol);
        }
        return lista;
    }
}
