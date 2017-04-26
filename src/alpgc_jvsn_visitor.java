import java.util.List;

import ast.And;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclList;
import ast.Exp;
import ast.ExpList;
import ast.False;
import ast.Identifier;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.This;
import ast.Times;
import ast.True;

public class alpgc_jvsn_visitor extends alpgc_jvsnBaseVisitor<Object> {
	@Override
	public Object visitGoal(alpgc_jvsnParser.GoalContext ctx){
		MainClass main=(MainClass) this.visit(ctx.getChild(0));
		ClassDeclList lista=new ClassDeclList();
		for(alpgc_jvsnParser.Class_declarationContext k:ctx.class_declaration()){
			lista.addElement((ClassDecl)this.visit(k));
		}
		return ctx;
	}
	public Object visitIdentifier(alpgc_jvsnParser.IdentifierContext ctx){
		return new Identifier(ctx.getText());
	}
	public Object visitType(alpgc_jvsnParser.TypeContext ctx){
		if(ctx.getChild(0).getText()=="boolean")return new BooleanType();
		else if(ctx.getChild(0).getText()=="int"){
			if(ctx.getChildCount()==1)return new IntegerType();
			else return new IntArrayType();
		}else return (Identifier)this.visit(ctx.identifier());
	}
	public Object visitStatement(alpgc_jvsnParser.StatementContext ctx){
		return null;
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
