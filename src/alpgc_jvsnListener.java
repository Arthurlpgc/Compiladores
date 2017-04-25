// Generated from alpgc_jvsn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link alpgc_jvsnParser}.
 */
public interface alpgc_jvsnListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(@NotNull alpgc_jvsnParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(@NotNull alpgc_jvsnParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull alpgc_jvsnParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull alpgc_jvsnParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(@NotNull alpgc_jvsnParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(@NotNull alpgc_jvsnParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void enterMethod_declaration(@NotNull alpgc_jvsnParser.Method_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#method_declaration}.
	 * @param ctx the parse tree
	 */
	void exitMethod_declaration(@NotNull alpgc_jvsnParser.Method_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull alpgc_jvsnParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull alpgc_jvsnParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void enterVar_declaration(@NotNull alpgc_jvsnParser.Var_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#var_declaration}.
	 * @param ctx the parse tree
	 */
	void exitVar_declaration(@NotNull alpgc_jvsnParser.Var_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull alpgc_jvsnParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull alpgc_jvsnParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void enterClass_declaration(@NotNull alpgc_jvsnParser.Class_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#class_declaration}.
	 * @param ctx the parse tree
	 */
	void exitClass_declaration(@NotNull alpgc_jvsnParser.Class_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alpgc_jvsnParser#main_class}.
	 * @param ctx the parse tree
	 */
	void enterMain_class(@NotNull alpgc_jvsnParser.Main_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link alpgc_jvsnParser#main_class}.
	 * @param ctx the parse tree
	 */
	void exitMain_class(@NotNull alpgc_jvsnParser.Main_classContext ctx);
}