import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

public class teste {
	public static void main(String[] args) throws IOException {
		InputStream stream = new FileInputStream("src/Teste.txt");
		ANTLRInputStream input = new ANTLRInputStream(stream);
		alpgc_jvsnLexer lexer = new alpgc_jvsnLexer(input);
		CommonTokenStream token = new CommonTokenStream(lexer);
		alpgc_jvsnParser parser = new alpgc_jvsnParser(token);
		ParseTree tree=parser.goal();
		System.out.println(tree.toStringTree(parser));
	}

}
