// Generated from Brolang.g4 by ANTLR 4.7.1
package com.tropicalbastos.brolang.ast;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrolangParser}.
 */
public interface BrolangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrolangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(BrolangParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(BrolangParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(BrolangParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(BrolangParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignStmt(BrolangParser.AssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#assignStmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignStmt(BrolangParser.AssignStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#ifcondition}.
	 * @param ctx the parse tree
	 */
	void enterIfcondition(BrolangParser.IfconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#ifcondition}.
	 * @param ctx the parse tree
	 */
	void exitIfcondition(BrolangParser.IfconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#elsecondition}.
	 * @param ctx the parse tree
	 */
	void enterElsecondition(BrolangParser.ElseconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#elsecondition}.
	 * @param ctx the parse tree
	 */
	void exitElsecondition(BrolangParser.ElseconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#elseifcondition}.
	 * @param ctx the parse tree
	 */
	void enterElseifcondition(BrolangParser.ElseifconditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#elseifcondition}.
	 * @param ctx the parse tree
	 */
	void exitElseifcondition(BrolangParser.ElseifconditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintstmt(BrolangParser.PrintstmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#printstmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintstmt(BrolangParser.PrintstmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BrolangParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BrolangParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#endscope}.
	 * @param ctx the parse tree
	 */
	void enterEndscope(BrolangParser.EndscopeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#endscope}.
	 * @param ctx the parse tree
	 */
	void exitEndscope(BrolangParser.EndscopeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrolangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(BrolangParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrolangParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(BrolangParser.TypeSpecifierContext ctx);
}