package br.com.negraop.panlanguage.main;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.com.negraop.panlanguage.exceptions.PanSemanticException;
import br.com.negraop.panlanguage.parser.PanLangLexer;
import br.com.negraop.panlanguage.parser.PanLangParser;

/* Esta é a classe que é responsável por criar a interação com o usuário
 * instanciando nosso parser e apontando para o arquivo fonte
 * 
 * Arquivo fonte: extensão .pan
 */
public class Main {
    public static void main(String[] args) {
        try {
            PanLangLexer lexer;
            PanLangParser parser;

            // leio o arquivo "input.pan" e isso é entrada para o Analisador Léxico
            lexer = new PanLangLexer(CharStreams.fromFileName("input.pan"));

            // crio um "fluxo de tokens" para passar para o Parser
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // crio meu parser a partir do tokenStream
            parser = new PanLangParser(tokenStream);

            parser.prog();

            System.out.println("Compilation Successful");

            parser.exibeComandos();

            parser.generateCode();

        } catch (PanSemanticException ex) {
            System.err.println("Semantic Error: " + ex.getMessage());
        } catch (Exception ex) {
            System.err.println("ERROR " + ex.getMessage());
        }
    }
}
