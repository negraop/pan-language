package br.com.negraop.panlanguage.abstractsyntaxtree;

public class CommandEscrita extends AbstractCommand {

    private String id;

    public CommandEscrita(String id) {
        this.id = id;
    }
    
    @Override
    public String generateJavaCode() {
        return "System.out.println(" + id + ");";
    }

    @Override
    public String toString() {
        return "CommandEscrita [id=" + id + "]";
    }

}
