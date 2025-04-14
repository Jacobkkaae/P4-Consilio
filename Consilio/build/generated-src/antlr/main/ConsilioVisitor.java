// Generated from Consilio.g4 by ANTLR 4.13.1

    package antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ConsilioParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ConsilioVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ConsilioParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#domain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain(ConsilioParser.DomainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#problem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProblem(ConsilioParser.ProblemContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(ConsilioParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(ConsilioParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(ConsilioParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#valueType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueType(ConsilioParser.ValueTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(ConsilioParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(ConsilioParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ConsilioParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#objects}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjects(ConsilioParser.ObjectsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#objectBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectBody(ConsilioParser.ObjectBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(ConsilioParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#arrayBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBody(ConsilioParser.ArrayBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(ConsilioParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(ConsilioParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(ConsilioParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(ConsilioParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ConsilioParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#dotNotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotNotation(ConsilioParser.DotNotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#arrayBodyInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayBodyInt(ConsilioParser.ArrayBodyIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ConsilioParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(ConsilioParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#compOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompOp(ConsilioParser.CompOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#locOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocOp(ConsilioParser.LocOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ConsilioParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(ConsilioParser.ConstantContext ctx);
}