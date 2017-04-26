import java.util.List;
import ast.*;

public class alpgc_jvsn_visitor extends alpgc_jvsnBaseVisitor<Object> {
	public Object visitGoal(alpgc_jvsnParser.GoalContext ctx){
		MainClass main=(MainClass) this.visit(ctx.getChild(0));
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
		return new MainClass((Identifier)this.visit(ctx.identifier(0)),(Identifier)this.visit(ctx.identifier(1)),(Statement)this.visit(ctx.statement()));
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
		if(ctx.getChild(0).getText()=="boolean")return new BooleanType();
		else if(ctx.getChild(0).getText()=="int"){
			if(ctx.getChildCount()==1)return new IntegerType();
			else return new IntArrayType();
		}else return (IdentifierType)this.visit(ctx.identifier());
	}
	public Object visitFormal(alpgc_jvsnParser.FormalContext ctx){
		return new Formal((Type) this.visit(ctx.type()), (Identifier) this.visit(ctx.identifier()));
	}
	public Object visitVar_declaration(alpgc_jvsnParser.Var_declarationContext ctx){
		Formal f=(Formal)this.visit(ctx.formal());
		return new VarDecl(f.t,f.i);
	}
	public Object visitMethod_declaration(alpgc_jvsnParser.Method_declarationContext ctx){
		Formal auxf=(Formal)this.visit(ctx.formal(0));
		List<alpgc_jvsnParser.FormalContext> frms=ctx.formal();
		frms.remove(0);
		FormalList frmlist=new FormalList();
		for(alpgc_jvsnParser.FormalContext frm:frms){
			frmlist.addElement((Formal)this.visit(frm));
		}
		List<alpgc_jvsnParser.Var_declarationContext> vrbs=ctx.var_declaration();
		VarDeclList vrblist=new VarDeclList();
		for(alpgc_jvsnParser.Var_declarationContext vrb:vrbs){
			vrblist.addElement((VarDecl)this.visit(vrb));
		}
		List<alpgc_jvsnParser.StatementContext> stts=ctx.statement();
		StatementList sttlist=new StatementList();
		for(alpgc_jvsnParser.StatementContext stt:stts){
			sttlist.addElement((Statement)this.visit(stt));
		}
		return new MethodDecl(auxf.t, auxf.i, frmlist, vrblist, sttlist, (Exp)this.visit(ctx.expression()));
	}
	public Object visitStatement(alpgc_jvsnParser.StatementContext ctx){
		if(ctx.getChild(0).getText()=="{"){
			StatementList sl= new StatementList();
			for(alpgc_jvsnParser.StatementContext s:ctx.statement()){
				sl.addElement((Statement)this.visit(s));
			}
			return new Block(sl);
		}else if(ctx.getChild(0).getText()=="if"){
			return new If((Exp)this.visit(ctx.expression(0)),(Statement)this.visit(ctx.statement(0)),(Statement)this.visit(ctx.statement(1)));
		}else if(ctx.getChild(0).getText()=="while"){
			return new While((Exp)this.visit(ctx.expression(0)),(Statement)this.visit(ctx.statement(0)));
		}else if(ctx.getChild(0).getText()=="System.out.println"){
			return new Print((Exp)this.visit(ctx.expression(0)));
		}else if(ctx.getChild(1).getText()=="="){
			return new Assign((Identifier)this.visit(ctx.identifier()),(Exp)this.visit(ctx.expression(0)));
		}else return new ArrayAssign((Identifier)this.visit(ctx.identifier()),(Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
	}
	public Object visitExpression(alpgc_jvsnParser.ExpressionContext ctx){
		if(ctx.getChild(0).getText()=="true")return new True();
		else if(ctx.getChild(0).getText()=="false")return new False();
		else if(ctx.getChild(0).getText()=="this")return new This();
		else if(ctx.getChild(0).getText()=="!")return new Not((Exp) this.visit(ctx.expression(0)));
		else if(ctx.getChild(0).getText()=="(")return ((Exp) this.visit(ctx.expression(0)));
		else if(ctx.getChild(1).getText()=="[")return new ArrayLookup((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		else if(ctx.getChild(0).getText()=="new"){
			if(ctx.getChild(1).getText()=="int"){
				return new NewArray((Exp) this.visit(ctx.expression(0)));
			}else{
				return new NewObject((Identifier) this.visit(ctx.identifier()));
			}
		}else if(ctx.getChild(1).getText()=="&&"){
			return new And((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText()=="+"){
			return new Plus((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText()=="<"){
			return new LessThan((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText()=="-"){
			return new Minus((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(1).getText()=="*"){
			return new Times((Exp)this.visit(ctx.expression(0)),(Exp)this.visit(ctx.expression(1)));
		}else if(ctx.getChild(2).getText()=="length")return new ArrayLength((Exp) this.visit(ctx.expression(0)));
		else if(ctx.getChild(1).getText()=="."){
			Exp base=(Exp) this.visit(ctx.expression(0));
			List<alpgc_jvsnParser.ExpressionContext> listaexp = ctx.expression();
			listaexp.remove(0);
			ExpList listaExpRet=new ExpList();
			for(alpgc_jvsnParser.ExpressionContext item:listaexp){
				listaExpRet.addElement((Exp)this.visit(item));
			}
			return new Call(base, (Identifier)this.visit(ctx.identifier()), listaExpRet);
		}else if(ctx.INTEGERLITERAL()!=null)return new IntegerLiteral(Integer.parseInt((ctx.INTEGERLITERAL().getText())));
		else return (Identifier)this.visit(ctx.identifier());
	}
	
}
