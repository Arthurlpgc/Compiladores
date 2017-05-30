package visitor;

import symboltable.SymbolTable;
import symboltable.Class;
import symboltable.Method;
import symboltable.Variable;
import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
import ast.ClassDecl;
import ast.ClassDeclExtends;
import ast.ClassDeclSimple;
import ast.False;
import ast.Formal;
import ast.Identifier;
import ast.IdentifierExp;
import ast.IdentifierType;
import ast.If;
import ast.IntArrayType;
import ast.IntegerLiteral;
import ast.IntegerType;
import ast.LessThan;
import ast.MainClass;
import ast.MethodDecl;
import ast.Minus;
import ast.NewArray;
import ast.NewObject;
import ast.Not;
import ast.Plus;
import ast.Print;
import ast.Program;
import ast.This;
import ast.Times;
import ast.True;
import ast.VarDecl;
import ast.While;

public class BuildSymbolTableVisitor implements Visitor {

	SymbolTable symbolTable;

	public BuildSymbolTableVisitor() {
		symbolTable = new SymbolTable();
	}

	public SymbolTable getSymbolTable() {
		return symbolTable;
	}

	private Class currClass;
	private Method currMethod;

	// MainClass m;
	// ClassDeclList cl;
	public void visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
	}

	// Identifier i1,i2;
	// Statement s;
	public void visit(MainClass n) { //MainClass doesn't extends ClassDecl. So it isn't necessary to add it on the SymbolTable
		this.symbolTable.addClass(n.i1.toString(), null);
		this.currClass = this.symbolTable.getClass(n.i1.toString());
		this.currClass.addMethod("main", null);
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclSimple n) {
		boolean sucess = this.symbolTable.addClass(n.i.toString(), null);
		if(!sucess) {
			System.out.println("Error: Class "+ n.i.toString() +" already declared");
		}
		this.currClass = symbolTable.getClass(n.i.toString());
		n.i.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			VarDecl var = n.vl.elementAt(i);
			var.accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			MethodDecl method = n.ml.elementAt(i);
			method.accept(this);
		}
		this.currClass = null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public void visit(ClassDeclExtends n) {
		boolean sucess = this.symbolTable.addClass(n.i.toString(), n.j.toString());
		if(!sucess) {
			System.out.println("Error: Class " + n.i.toString() +  " already declared");
		}
		this.currClass = this.symbolTable.getClass(n.i.toString());
		n.i.accept(this);
		n.j.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			VarDecl var = n.vl.elementAt(i);
			var.accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			MethodDecl method = n.ml.elementAt(i);
			method.accept(this);
		}
		this.currClass = null;
	}

	// Type t;
	// Identifier i;
	public void visit(VarDecl n) {
		if(this.currMethod == null) {
			boolean sucess = this.currClass.addVar(n.i.toString(), n.t);
			if(!sucess) {
				System.out.println("Error: Variable already declared in this class");
			}
		}
		else {
			boolean sucess = this.currMethod.addVar(n.i.toString(), n.t);
			if(!sucess) {
				System.out.println("Error: Variable already declared in this method");
			}
		}
		n.t.accept(this);
		n.i.accept(this);
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public void visit(MethodDecl n) {
		boolean sucess = this.currClass.addMethod(n.i.toString(), n.t);
		if(!sucess) {
			System.out.println("Error: Method " + n.i.toString() + " already declared");
		}
		this.currMethod = this.currClass.getMethod(n.i.toString());
		n.t.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			Formal formal = n.fl.elementAt(i);
			formal.accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			VarDecl var = n.vl.elementAt(i);
			var.accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		n.e.accept(this);
		this.currMethod = null;
	}

	// Type t;
	// Identifier i;
	public void visit(Formal n) {
		boolean sucess = this.currMethod.addParam(n.i.toString(), n.t);
		if(!sucess) {
			System.out.println("Error: The parameter " + n.i.toString() + " of type " + n.t.toString() + "already present");
		}
		n.t.accept(this);
		n.i.accept(this);
	}

	public void visit(IntArrayType n) {
	}

	public void visit(BooleanType n) {
	}

	public void visit(IntegerType n) {
	}

	// String s;
	public void visit(IdentifierType n) {
	}

	// StatementList sl;
	public void visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
	}

	// Exp e;
	// Statement s1,s2;
	public void visit(If n) {
		n.e.accept(this);
		n.s1.accept(this);
		n.s2.accept(this);
	}

	// Exp e;
	// Statement s;
	public void visit(While n) {
		n.e.accept(this);
		n.s.accept(this);
	}

	// Exp e;
	public void visit(Print n) {
		n.e.accept(this);
	}

	// Identifier i;
	// Exp e;
	public void visit(Assign n) {
		n.i.accept(this);
		n.e.accept(this);
	}

	// Identifier i;
	// Exp e1,e2;
	public void visit(ArrayAssign n) {
		n.i.accept(this);
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(And n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(LessThan n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Plus n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Minus n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(Times n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e1,e2;
	public void visit(ArrayLookup n) {
		n.e1.accept(this);
		n.e2.accept(this);
	}

	// Exp e;
	public void visit(ArrayLength n) {
		n.e.accept(this);
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public void visit(Call n) {
		n.e.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
	}

	// int i;
	public void visit(IntegerLiteral n) {
	}

	public void visit(True n) {
	}

	public void visit(False n) {
	}

	// String s;
	public void visit(IdentifierExp n) {
	}

	public void visit(This n) {
	}

	// Exp e;
	public void visit(NewArray n) {
		n.e.accept(this);
	}

	// Identifier i;
	public void visit(NewObject n) {
	}

	// Exp e;
	public void visit(Not n) {
		n.e.accept(this);
	}

	// String s;
	public void visit(Identifier n) {
	}
}
