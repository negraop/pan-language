package br.com.negraop.panlanguage.datastructures;

public abstract class PanSymbol {

    protected String name;

    public abstract String generateJavaCode();

    public PanSymbol(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PanSymbol [name=" + name + "]";
    }
}
