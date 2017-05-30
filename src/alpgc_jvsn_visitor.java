import java.util.List;

import ast.*;

public class alpgc_jvsn_visitor extends alpgc_jvsnBaseVisitor<Object> {
	
	public Object visitGoal(alpgc_jvsnParser.GoalContext ctx){
		MainClass main = (MainClass) this.visit(ctx.getChild(0));
		ClassDeclList lista=new ClassDeclList();
		for(alpgc_jvsnParser.Class_declarationContext k:ctx.class_declaration()){
			lista.addElement((ClassDecl)this.visit(k));
		}
		Program program = new Program(main, lista);
		return program;
	}
	public Object visitIdentifier(alpgc_jvsnParser.IdentifierContext ctx){
		return new Identifier(ctx.getText());
	}
	public Object visitMain_class(alpgc_jvsnParser.Main_classContext ctx){
		Identifier i1 = new Identifier(ctx.identifier(0).getText());
		Identifier i2 = new Identifier(ctx.identifier(1).getText());
		Statement st = (Statement) this.visit(ctx.statement());
		return new MainClass(i1, i2, st);
	}
	public Object visitClass_declaration(alpgc_jvsnParser.Class_declarationContext ctx){
		VarDeclList varlist=new VarDeclList();
		for(alpgc_jvsnParser.Var_declarationContext vctx:ctx.var_declaration()){
			varlist.addElement((VarDecl)this.visit(vctx));
		}
		MethodDeclList mdl=new MethodDeclList();
		for(alpgc_jvsnParser.Method_declarationContext mctx:ctx.method_declaration()){
			mdl.addElement((MethodDecl)this.visit(mctx));
		}
		if(ctx.identifier(1)==null)return new ClassDeclSimple((Identifier)this.visit(ctx.identifier(0)), varlist, mdl);
		else return new ClassDeclExtends((Identifier)this.visit(ctx.identifier(0)),(Identifier)this.visit(ctx.identifier(1)), varlist, mdl);
	}
	public Object visitType(alpgc_jvsnParser.TypeContext ctx){
		if(ctx.getChild(0).getText().equals("boolean"))return new BooleanType();
		else if(ctx.getChild(0).getText().equals("int")){
			if(ctx.getChildCount()==1)return new IntegerType();
			else return new IntArrayType();
		}else return new IdentifierType(ctx.getText());
	}
	public Object visitFormal(alpgc_jvsnParser.FormalContext ctx){
		return new Formal((Type) this.visit(ctx.type()), (Identifier) this.visit(ctx.identifier()));
	}
	public Object visitVar_declaration(alpgc_jvsnParser.Var_declarationContext ctx){
		Formal f=(Formal)this.visit(ctx.formal());
		return new VarDecl(f.t,f.i);
	}
	public Object visitMethod_declaration(alpgc_jvsnParser.Method_declarationContext ctx){
		Formal idType = (Formal)this.visit(ctx.formal(0));
		FormalList formalList = new FormalList();
		VarDeclList varList = new VarDeclList();
		StatementList stList = new StatementList();
		Exp exp = (Exp) this.visit(ctx.expression()); 
		
		for(alpgc_jvsnParser.FormalContext formal : ctx.formal()) {
			formalList.addElement((Formal) this.visit(formal));
		}
		
		for(alpgc_jvsnParser.Var_declarationContext var: ctx.var_declaration()) {
			varList.addElement((VarDecl) this.visit(var));
		}
		
		for(alpgc_jvsnParser.StatementContext stmt: ctx.statement()) {
			stList.addElement((Statement) this.visit(stmt));
		}
		
		return new MethodDecl(idType.t, idType.i, formalList, varList, stList, exp);
	}
	public Object visitStatement(alpgc_jvsnParser.StatementContext ctx){
		if(ctx.getChild(0).getText().equals("{")){
			StatementList sl= new StatementList();
			for(alpgc_jvsnParser.StatementContext s:ctx.statement()){
				sl.addElement((Statement)this.visit(s));
			}
			return new Block(sl);
			
		}else if(ctx.getChild(0).getText().equals("if")){
			Exp exp = (Exp) this.visit(ctx.expression(0));
			Statement s1 = (Statement) this.visit(ctx.statement(0));
			Statement s2 = (Statement) this.visit(ctx.statement(1));
			return new If(exp, s1, s2);
			
		}
		else if(ctx.getChild(0).getText().equals("while")){
			Exp exp = (Exp) this.visit(ctx.expression(0));
			Statement s = (Statement) this.visit(ctx.statement(0));
			return new While(exp, s);
		}
		
		else if(ctx.getChild(0).getText().equals("System.out.println")){
			Exp exp = (Exp) this.visit(ctx.expression(0));
			return new Print(exp);
		}
		
		else if(ctx.getChild(1).getText().equals("=")){
			Identifier id = (Identifier) this.visit(ctx.identifier());
			Exp exp = (Exp) this.visit(ctx.expression(0));
			return new Assign(id, exp);
		}
		
		else {
			Identifier id = (Identifier) this.visit(ctx.identifier());
			Exp exp1 = (Exp) this.visit(ctx.expression(0)),
				exp2 = (Exp) this.visit(ctx.expression(1));
			
			return new ArrayAssign(id, exp1, exp2);
		}
	}
	public Object visitExpression(alpgc_jvsnParser.ExpressionContext ctx){
		if(ctx.getChildCount()==1&&ctx.getChild(0).getText().equals("true"))return new True();
		else if(ctx.getChildCount()==1&&ctx.getChild(0).getText().equals("false"))return new False();
		else if(ctx.getChildCount()==1&&ctx.getChild(0).getText().equals("this"))return new This();
		else if(ctx.getChild(0).getText().equals("!"))return new Not((Exp) this.visit(ctx.expression(0)));
		else if(ctx.getChild(0).getText().equals("("))return ((Exp) this.visit(ctx.expression(0)));
		else if(ctx.INTEGERLITERAL()!=null)return new IntegerLiteral(Integer.parseInt((ctx.INTEGERLITERAL().getText())));
		else if(ctx.getChildCount()==1)return new IdentifierExp(ctx.getText());
		else if(ctx.getChild(1).getText().equals("[")) {
			Exp arrayExpr = (Exp) this.visit(ctx.expression(0));
			Exp indexExpr = (Exp) this.visit(ctx.expression(1));
			return new ArrayLookup(arrayExpr,indexExpr);
		}
		else if(ctx.getChild(0).getText().equals("new")){
			if(ctx.getChild(1).getText().equals("int")){
				return new NewArray((Exp) this.visit(ctx.expression(0)));
			}else{
				return new NewObject((Identifier) this.visit(ctx.identifier()));
			}
		}else if(ctx.getChild(1).getText().equals("&&")){
			return new And((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText().equals("+")){
			return new Plus((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText().equals("<")){
			return new LessThan((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText().equals("-")){
			return new Minus((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText().equals("*")){
			return new Times((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(2).getText().equals("length"))return new ArrayLength((Exp) this.visit(ctx.expression(0)));
		else if(ctx.getChild(1).getText().equals(".")){
			Identifier id = (Identifier) this.visit(ctx.identifier());
			List<alpgc_jvsnParser.ExpressionContext> listaexp = ctx.expression();
			Exp base = (Exp) this.visit(listaexp.get(0));
			listaexp.remove(0);
			ExpList listaExpRet = new ExpList();
			for(alpgc_jvsnParser.ExpressionContext item:listaexp){
				listaExpRet.addElement((Exp)this.visit(item));
			}
			return new Call(base, id, listaExpRet);
		}
		else return null;
	}
	
}
