package visitor;

import symboltable.SymbolTable;
import symboltable.Variable;
import ast.And;
import ast.ArrayAssign;
import ast.ArrayLength;
import ast.ArrayLookup;
import ast.Assign;
import ast.Block;
import ast.BooleanType;
import ast.Call;
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
import ast.Type;
import ast.VarDecl;
import ast.While;
import symboltable.Class;
import symboltable.Method;
public class TypeCheckVisitor implements TypeVisitor {

	private SymbolTable symbolTable;
	private Class currClass;
	private Method currMethod;
	
	public TypeCheckVisitor(SymbolTable st) {
		symbolTable = st;
	}

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		this.currClass = this.symbolTable.getClass(n.i.toString());
		
		n.i.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		n.i.accept(this);
		n.j.accept(this);
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		Variable var = this.currClass.getVar(n.i.toString());
		String id = var.id();
		Type type = var.type();
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		this.currMethod = this.symbolTable.getMethod(n.i.toString(), this.currClass.getId());
		n.t.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		n.e.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		Type type = n.e.accept(this);
		if(!(type instanceof BooleanType)) {
			System.out.println("Error: Not a boolean expression");
		}
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		Type type = n.e.accept(this);
		if(!(type instanceof BooleanType)) {
			System.out.println("Error: Not a boolean expression");
		}
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		Type identifier = n.i.accept(this);
		Type expression = n.e.accept(this);
		if(!(this.symbolTable.compareTypes(identifier, expression))) {
			System.out.println("Error: Not the same type");
		}
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		Type identifier = n.i.accept(this);
		Type index = n.e1.accept(this);
		Type expression = n.e2.accept(this);
		
		if(!(index instanceof IntegerType)) {
			System.out.println("Error: Invalid index");
		}
		else if(!(this.symbolTable.compareTypes(identifier, expression))) {
			System.out.println("Error: Array and expression haven't the same type");
		}
		else if(!(identifier instanceof IntegerType)) {
			System.out.println("Error: Invalid array type");
		}
		
		return null;
	}

	// Exp e1,e2;
	public Type visit(And n) {
		Type expr1 = n.e1.accept(this);
		Type expr2 = n.e2.accept(this);
		if(!(expr1 instanceof BooleanType) || !(expr2 instanceof BooleanType)) {
			System.out.println("Error: Not a boolean");
		}
		else if(!this.symbolTable.compareTypes(expr1, expr2)) {
			System.out.println("Error: Not the same type");
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		Type expr1 = n.e1.accept(this);
		Type expr2 = n.e2.accept(this);
		if(!(expr1 instanceof IntegerType) || !(expr2 instanceof IntegerType)) {
			System.out.println("Error: Not an integer");
		}
		else if(!this.symbolTable.compareTypes(expr1, expr2)) {
			System.out.println("Error: Not the same type");
		}
		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		Type expr1 = n.e1.accept(this);
		Type expr2 = n.e2.accept(this);
		if(!(expr1 instanceof IntegerType) || !(expr2 instanceof IntegerType)) {
			System.out.println("Error: Not an integer");
		}
		else if(!this.symbolTable.compareTypes(expr1, expr2)) {
			System.out.println("Error: Not the same type");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		Type expr1 = n.e1.accept(this);
		Type expr2 = n.e2.accept(this);
		if(!(expr1 instanceof IntegerType) || !(expr2 instanceof IntegerType)) {
			System.out.println("Error: Not an integer");
		}
		else if(!this.symbolTable.compareTypes(expr1, expr2)) {
			System.out.println("Error: Not the same type");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		Type expr1 = n.e1.accept(this);
		Type expr2 = n.e2.accept(this);
		if(!(expr1 instanceof IntegerType) || !(expr2 instanceof IntegerType)) {
			System.out.println("Error: Not an integer");
		}
		else if(!this.symbolTable.compareTypes(expr1, expr2)) {
			System.out.println("Error: Not the same type");
		}
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		Type arrayType = n.e1.accept(this);
		Type intType = n.e2.accept(this);
		if(!(arrayType instanceof IntArrayType)) {
			System.out.println("Error: Not an array");
		}
		else if(!(intType instanceof IntegerType)) {
			System.out.println("Error: Not a valid index");
		}
		return null;
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		Type type = n.e.accept(this);
		if(!(type instanceof IntArrayType)) {
			System.out.println("Error: Not an array");
		}
		return null;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) { //Function call (e.g.: a.call();
		Type class_ = n.e.accept(this);
		Type method_ = n.i.accept(this);
		
		
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
		return null;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);
	}

	public Type visit(This n) { //e.g. Return this. Isn't the same of 'this.identifier'
		return this.currClass.type();
	}

	// Exp e;
	public Type visit(NewArray n) {
		Type type = n.e.accept(this);
		if(!(type instanceof IntegerType)) {
			System.out.println("Error: Not an integer");
		}
		return new IntArrayType();
	}

	// Identifier i;
	public Type visit(NewObject n) {
		Type type = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.toString());
		return type;
	}

	// Exp e;
	public Type visit(Not n) {
		Type type = n.e.accept(this);
		if(!(type instanceof BooleanType)) {
			System.out.println("Error: Not a boolean");
		}
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return new IdentifierType(n.toString());
	}
}
