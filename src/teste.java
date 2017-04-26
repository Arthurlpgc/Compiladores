import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import ast.Program;
import visitor.PrettyPrintVisitor;

public class teste {
	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("src/Teste.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		alpgc_jvsnLexer lexer = new alpgc_jvsnLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		alpgc_jvsnParser parser = new alpgc_jvsnParser(token);
		ParseTree tree=parser.goal();
		System.out.println(tree.toStringTree(parser));
		/*alpgc_jvsn_visitor visitor=new alpgc_jvsn_visitor();
		Program program = (Program) visitor.visit(tree);
		program.accept(new PrettyPrintVisitor());*/
	}

}
