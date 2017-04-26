// Generated from alpgc_jvsn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link alpgc_jvsnParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface alpgc_jvsnVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#formal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormal(@NotNull alpgc_jvsnParser.FormalContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(@NotNull alpgc_jvsnParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(@NotNull alpgc_jvsnParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(@NotNull alpgc_jvsnParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#method_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_declaration(@NotNull alpgc_jvsnParser.Method_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull alpgc_jvsnParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#var_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declaration(@NotNull alpgc_jvsnParser.Var_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#main_class}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_class(@NotNull alpgc_jvsnParser.Main_classContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_declaration(@NotNull alpgc_jvsnParser.Class_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alpgc_jvsnParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull alpgc_jvsnParser.TypeContext ctx);
}