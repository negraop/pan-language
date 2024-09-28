package br.com.negraop.panlanguage.abstractsyntaxtree;

import br.com.negraop.panlanguage.datastructures.PanVariable;

public class CommandLeitura extends AbstractCommand {

    private String id;
    private PanVariable var;

    public CommandLeitura(String id, PanVariable var) {
        this.id = id;
        this.var = var;
    }
    
    @Override
    public String generateJavaCode() {
        return id + " = _key." + (var.getType() == PanVariable.NUMBER ? "nextDouble();" : "nextLine();");
    }

    @Override
    public String toString() {
        return "CommandLeitura [id=" + id + "]";
    }

}
