// Generated from Consilio.g4 by ANTLR 4.13.1

    package antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ConsilioParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT_LITERAL=1, BOOLEAN_LITERAL=2, IF=3, INT=4, BOOLEAN=5, INITIALSTATE=6, 
		GOALSTATE=7, OBJECTS=8, TYPE=9, ACTION=10, IMPORT=11, DEFINE=12, DOMAIN=13, 
		PROBLEM=14, LPAREN=15, RPAREN=16, LBRACE=17, RBRACE=18, LSQUARE=19, RSQUARE=20, 
		SEMI=21, COMMA=22, DOT=23, ASSIGN=24, GT=25, LT=26, COLON=27, EQUAL=28, 
		LE=29, GE=30, NOTEQUAL=31, AND=32, OR=33, ADD=34, SUB=35, WS=36, IDENTIFIER=37;
	public static final int
		RULE_program = 0, RULE_domain = 1, RULE_problem = 2, RULE_type = 3, RULE_attribute = 4, 
		RULE_value = 5, RULE_valueType = 6, RULE_action = 7, RULE_parameterList = 8, 
		RULE_parameter = 9, RULE_objects = 10, RULE_objectBody = 11, RULE_arrayInitializer = 12, 
		RULE_arrayBody = 13, RULE_init = 14, RULE_goal = 15, RULE_ifBlock = 16, 
		RULE_statement = 17, RULE_assignment = 18, RULE_dotNotation = 19, RULE_arrayBodyInt = 20, 
		RULE_expression = 21, RULE_addOp = 22, RULE_compOp = 23, RULE_locOp = 24, 
		RULE_constant = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "domain", "problem", "type", "attribute", "value", "valueType", 
			"action", "parameterList", "parameter", "objects", "objectBody", "arrayInitializer", 
			"arrayBody", "init", "goal", "ifBlock", "statement", "assignment", "dotNotation", 
			"arrayBodyInt", "expression", "addOp", "compOp", "locOp", "constant"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, "'if'", "'int'", "'boolean'", "'initialState'", "'goalState'", 
			"'objects'", "'type'", "'action'", "'import'", "'define'", "'domain'", 
			"'problem'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", 
			"'.'", "'='", "'>'", "'<'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
			"'||'", "'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "INT_LITERAL", "BOOLEAN_LITERAL", "IF", "INT", "BOOLEAN", "INITIALSTATE", 
			"GOALSTATE", "OBJECTS", "TYPE", "ACTION", "IMPORT", "DEFINE", "DOMAIN", 
			"PROBLEM", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "LSQUARE", "RSQUARE", 
			"SEMI", "COMMA", "DOT", "ASSIGN", "GT", "LT", "COLON", "EQUAL", "LE", 
			"GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", "WS", "IDENTIFIER"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Consilio.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ConsilioParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public DomainContext domain() {
			return getRuleContext(DomainContext.class,0);
		}
		public ProblemContext problem() {
			return getRuleContext(ProblemContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ConsilioParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			domain();
			setState(53);
			problem();
			setState(54);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DomainContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(ConsilioParser.DEFINE, 0); }
		public TerminalNode DOMAIN() { return getToken(ConsilioParser.DOMAIN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<ActionContext> action() {
			return getRuleContexts(ActionContext.class);
		}
		public ActionContext action(int i) {
			return getRuleContext(ActionContext.class,i);
		}
		public DomainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_domain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitDomain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DomainContext domain() throws RecognitionException {
		DomainContext _localctx = new DomainContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_domain);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(DEFINE);
			setState(57);
			match(DOMAIN);
			setState(58);
			match(IDENTIFIER);
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(59);
				type();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ACTION) {
				{
				{
				setState(65);
				action();
				}
				}
				setState(70);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProblemContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(ConsilioParser.DEFINE, 0); }
		public TerminalNode PROBLEM() { return getToken(ConsilioParser.PROBLEM, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(ConsilioParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ConsilioParser.IDENTIFIER, i);
		}
		public TerminalNode IMPORT() { return getToken(ConsilioParser.IMPORT, 0); }
		public ObjectsContext objects() {
			return getRuleContext(ObjectsContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public GoalContext goal() {
			return getRuleContext(GoalContext.class,0);
		}
		public ProblemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_problem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitProblem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProblemContext problem() throws RecognitionException {
		ProblemContext _localctx = new ProblemContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_problem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(DEFINE);
			setState(72);
			match(PROBLEM);
			setState(73);
			match(IDENTIFIER);
			setState(74);
			match(IMPORT);
			setState(75);
			match(IDENTIFIER);
			setState(76);
			objects();
			setState(77);
			init();
			setState(78);
			goal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(ConsilioParser.TYPE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConsilioParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConsilioParser.SEMI, i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(TYPE);
			setState(81);
			match(IDENTIFIER);
			setState(82);
			match(LBRACE);
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(83);
				attribute();
				setState(84);
				match(SEMI);
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(91);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode COLON() { return getToken(ConsilioParser.COLON, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(IDENTIFIER);
			setState(94);
			match(COLON);
			setState(95);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public ValueTypeContext valueType() {
			return getRuleContext(ValueTypeContext.class,0);
		}
		public TerminalNode OR() { return getToken(ConsilioParser.OR, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode LSQUARE() { return getToken(ConsilioParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ConsilioParser.RSQUARE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_value);
		try {
			setState(105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				valueType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				valueType();
				setState(99);
				match(OR);
				setState(100);
				value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				match(IDENTIFIER);
				setState(103);
				match(LSQUARE);
				setState(104);
				match(RSQUARE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ConsilioParser.INT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ConsilioParser.BOOLEAN, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public ValueTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitValueType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueTypeContext valueType() throws RecognitionException {
		ValueTypeContext _localctx = new ValueTypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_valueType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438953520L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActionContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(ConsilioParser.ACTION, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ConsilioParser.LPAREN, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConsilioParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_action);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(ACTION);
			setState(110);
			match(IDENTIFIER);
			setState(111);
			match(LPAREN);
			setState(112);
			parameterList();
			setState(113);
			match(RPAREN);
			setState(114);
			match(LBRACE);
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENTIFIER) {
				{
				{
				setState(115);
				statement();
				}
				}
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(121);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ConsilioParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ConsilioParser.COMMA, i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			parameter();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(124);
				match(COMMA);
				setState(125);
				parameter();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ConsilioParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ConsilioParser.IDENTIFIER, i);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(IDENTIFIER);
			setState(132);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectsContext extends ParserRuleContext {
		public TerminalNode OBJECTS() { return getToken(ConsilioParser.OBJECTS, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public ObjectBodyContext objectBody() {
			return getRuleContext(ObjectBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public ObjectsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objects; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitObjects(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectsContext objects() throws RecognitionException {
		ObjectsContext _localctx = new ObjectsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_objects);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(OBJECTS);
			setState(135);
			match(LBRACE);
			setState(136);
			objectBody();
			setState(137);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectBodyContext extends ParserRuleContext {
		public List<ArrayInitializerContext> arrayInitializer() {
			return getRuleContexts(ArrayInitializerContext.class);
		}
		public ArrayInitializerContext arrayInitializer(int i) {
			return getRuleContext(ArrayInitializerContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConsilioParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConsilioParser.SEMI, i);
		}
		public ObjectBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitObjectBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectBodyContext objectBody() throws RecognitionException {
		ObjectBodyContext _localctx = new ObjectBodyContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(139);
				arrayInitializer();
				setState(140);
				match(SEMI);
				}
				}
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayInitializerContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ConsilioParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ConsilioParser.IDENTIFIER, i);
		}
		public TerminalNode LSQUARE() { return getToken(ConsilioParser.LSQUARE, 0); }
		public TerminalNode RSQUARE() { return getToken(ConsilioParser.RSQUARE, 0); }
		public TerminalNode ASSIGN() { return getToken(ConsilioParser.ASSIGN, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public ArrayBodyContext arrayBody() {
			return getRuleContext(ArrayBodyContext.class,0);
		}
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public ArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayInitializer; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayInitializerContext arrayInitializer() throws RecognitionException {
		ArrayInitializerContext _localctx = new ArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_arrayInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(LSQUARE);
			setState(150);
			match(RSQUARE);
			setState(151);
			match(ASSIGN);
			setState(152);
			match(LBRACE);
			setState(153);
			arrayBody();
			setState(154);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBodyContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode COMMA() { return getToken(ConsilioParser.COMMA, 0); }
		public ArrayBodyContext arrayBody() {
			return getRuleContext(ArrayBodyContext.class,0);
		}
		public ArrayBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitArrayBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBodyContext arrayBody() throws RecognitionException {
		ArrayBodyContext _localctx = new ArrayBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arrayBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(IDENTIFIER);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(157);
				match(COMMA);
				setState(158);
				arrayBody();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public TerminalNode INITIALSTATE() { return getToken(ConsilioParser.INITIALSTATE, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConsilioParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConsilioParser.SEMI, i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitInit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(INITIALSTATE);
			setState(162);
			match(LBRACE);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER) {
				{
				{
				setState(163);
				assignment();
				setState(164);
				match(SEMI);
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GoalContext extends ParserRuleContext {
		public TerminalNode GOALSTATE() { return getToken(ConsilioParser.GOALSTATE, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(ConsilioParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(ConsilioParser.SEMI, i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(GOALSTATE);
			setState(174);
			match(LBRACE);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 137438986246L) != 0)) {
				{
				{
				setState(175);
				expression(0);
				setState(176);
				match(SEMI);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(ConsilioParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(ConsilioParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(ConsilioParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(ConsilioParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ConsilioParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(IF);
			setState(186);
			match(LPAREN);
			setState(187);
			expression(0);
			setState(188);
			match(RPAREN);
			setState(189);
			match(LBRACE);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IF || _la==IDENTIFIER) {
				{
				{
				setState(190);
				statement();
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			match(RBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(ConsilioParser.SEMI, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_statement);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				ifBlock();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				assignment();
				setState(200);
				match(SEMI);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(ConsilioParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_assignment);
		try {
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(IDENTIFIER);
				setState(205);
				match(ASSIGN);
				setState(206);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(207);
				dotNotation();
				setState(208);
				match(ASSIGN);
				setState(209);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DotNotationContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(ConsilioParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(ConsilioParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(ConsilioParser.DOT, 0); }
		public TerminalNode LSQUARE() { return getToken(ConsilioParser.LSQUARE, 0); }
		public ArrayBodyIntContext arrayBodyInt() {
			return getRuleContext(ArrayBodyIntContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(ConsilioParser.RSQUARE, 0); }
		public DotNotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dotNotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitDotNotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DotNotationContext dotNotation() throws RecognitionException {
		DotNotationContext _localctx = new DotNotationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dotNotation);
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(IDENTIFIER);
				setState(214);
				match(DOT);
				setState(215);
				match(IDENTIFIER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(IDENTIFIER);
				setState(217);
				match(LSQUARE);
				setState(218);
				arrayBodyInt();
				setState(219);
				match(RSQUARE);
				setState(220);
				match(DOT);
				setState(221);
				match(IDENTIFIER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArrayBodyIntContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(ConsilioParser.COMMA, 0); }
		public ArrayBodyIntContext arrayBodyInt() {
			return getRuleContext(ArrayBodyIntContext.class,0);
		}
		public ArrayBodyIntContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayBodyInt; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitArrayBodyInt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayBodyIntContext arrayBodyInt() throws RecognitionException {
		ArrayBodyIntContext _localctx = new ArrayBodyIntContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arrayBodyInt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expression(0);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(226);
				match(COMMA);
				setState(227);
				arrayBodyInt();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(ConsilioParser.IDENTIFIER, 0); }
		public TerminalNode LPAREN() { return getToken(ConsilioParser.LPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(ConsilioParser.RPAREN, 0); }
		public DotNotationContext dotNotation() {
			return getRuleContext(DotNotationContext.class,0);
		}
		public TerminalNode LSQUARE() { return getToken(ConsilioParser.LSQUARE, 0); }
		public ArrayBodyIntContext arrayBodyInt() {
			return getRuleContext(ArrayBodyIntContext.class,0);
		}
		public TerminalNode RSQUARE() { return getToken(ConsilioParser.RSQUARE, 0); }
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public LocOpContext locOp() {
			return getRuleContext(LocOpContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(231);
				constant();
				}
				break;
			case 2:
				{
				setState(232);
				match(IDENTIFIER);
				}
				break;
			case 3:
				{
				setState(233);
				match(LPAREN);
				setState(234);
				expression(0);
				setState(235);
				match(RPAREN);
				}
				break;
			case 4:
				{
				setState(237);
				dotNotation();
				}
				break;
			case 5:
				{
				setState(238);
				match(IDENTIFIER);
				setState(239);
				match(LSQUARE);
				setState(240);
				arrayBodyInt();
				setState(241);
				match(RSQUARE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(259);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(257);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(246);
						addOp();
						setState(247);
						expression(4);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(250);
						compOp();
						setState(251);
						expression(3);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(253);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(254);
						locOp();
						setState(255);
						expression(2);
						}
						break;
					}
					} 
				}
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,17,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(ConsilioParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(ConsilioParser.SUB, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			_la = _input.LA(1);
			if ( !(_la==ADD || _la==SUB) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode GT() { return getToken(ConsilioParser.GT, 0); }
		public TerminalNode LT() { return getToken(ConsilioParser.LT, 0); }
		public TerminalNode GE() { return getToken(ConsilioParser.GE, 0); }
		public TerminalNode LE() { return getToken(ConsilioParser.LE, 0); }
		public TerminalNode EQUAL() { return getToken(ConsilioParser.EQUAL, 0); }
		public TerminalNode NOTEQUAL() { return getToken(ConsilioParser.NOTEQUAL, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4127195136L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LocOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(ConsilioParser.AND, 0); }
		public TerminalNode OR() { return getToken(ConsilioParser.OR, 0); }
		public LocOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locOp; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitLocOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocOpContext locOp() throws RecognitionException {
		LocOpContext _localctx = new LocOpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_locOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(ConsilioParser.INT_LITERAL, 0); }
		public TerminalNode BOOLEAN_LITERAL() { return getToken(ConsilioParser.BOOLEAN_LITERAL, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ConsilioVisitor ) return ((ConsilioVisitor<? extends T>)visitor).visitConstant(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_constant);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			_la = _input.LA(1);
			if ( !(_la==INT_LITERAL || _la==BOOLEAN_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 21:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001%\u010f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001=\b\u0001"+
		"\n\u0001\f\u0001@\t\u0001\u0001\u0001\u0005\u0001C\b\u0001\n\u0001\f\u0001"+
		"F\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003W\b\u0003"+
		"\n\u0003\f\u0003Z\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005j\b\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007u\b\u0007\n\u0007\f\u0007"+
		"x\t\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u007f"+
		"\b\b\n\b\f\b\u0082\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u008f"+
		"\b\u000b\n\u000b\f\u000b\u0092\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00a0\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u00a7\b\u000e\n\u000e\f\u000e\u00aa\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005"+
		"\u000f\u00b3\b\u000f\n\u000f\f\u000f\u00b6\t\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0005\u0010\u00c0\b\u0010\n\u0010\f\u0010\u00c3\t\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00cb"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0003\u0012\u00d4\b\u0012\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0003\u0013\u00e0\b\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u00e5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u00f4\b\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005"+
		"\u0015\u0102\b\u0015\n\u0015\f\u0015\u0105\t\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0000\u0001*\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02\u0000\u0005\u0002"+
		"\u0000\u0004\u0005%%\u0001\u0000\"#\u0002\u0000\u0019\u001a\u001c\u001f"+
		"\u0001\u0000 !\u0001\u0000\u0001\u0002\u010b\u00004\u0001\u0000\u0000"+
		"\u0000\u00028\u0001\u0000\u0000\u0000\u0004G\u0001\u0000\u0000\u0000\u0006"+
		"P\u0001\u0000\u0000\u0000\b]\u0001\u0000\u0000\u0000\ni\u0001\u0000\u0000"+
		"\u0000\fk\u0001\u0000\u0000\u0000\u000em\u0001\u0000\u0000\u0000\u0010"+
		"{\u0001\u0000\u0000\u0000\u0012\u0083\u0001\u0000\u0000\u0000\u0014\u0086"+
		"\u0001\u0000\u0000\u0000\u0016\u0090\u0001\u0000\u0000\u0000\u0018\u0093"+
		"\u0001\u0000\u0000\u0000\u001a\u009c\u0001\u0000\u0000\u0000\u001c\u00a1"+
		"\u0001\u0000\u0000\u0000\u001e\u00ad\u0001\u0000\u0000\u0000 \u00b9\u0001"+
		"\u0000\u0000\u0000\"\u00ca\u0001\u0000\u0000\u0000$\u00d3\u0001\u0000"+
		"\u0000\u0000&\u00df\u0001\u0000\u0000\u0000(\u00e1\u0001\u0000\u0000\u0000"+
		"*\u00f3\u0001\u0000\u0000\u0000,\u0106\u0001\u0000\u0000\u0000.\u0108"+
		"\u0001\u0000\u0000\u00000\u010a\u0001\u0000\u0000\u00002\u010c\u0001\u0000"+
		"\u0000\u000045\u0003\u0002\u0001\u000056\u0003\u0004\u0002\u000067\u0005"+
		"\u0000\u0000\u00017\u0001\u0001\u0000\u0000\u000089\u0005\f\u0000\u0000"+
		"9:\u0005\r\u0000\u0000:>\u0005%\u0000\u0000;=\u0003\u0006\u0003\u0000"+
		"<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?D\u0001\u0000\u0000\u0000@>\u0001\u0000"+
		"\u0000\u0000AC\u0003\u000e\u0007\u0000BA\u0001\u0000\u0000\u0000CF\u0001"+
		"\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000"+
		"E\u0003\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000GH\u0005\f\u0000"+
		"\u0000HI\u0005\u000e\u0000\u0000IJ\u0005%\u0000\u0000JK\u0005\u000b\u0000"+
		"\u0000KL\u0005%\u0000\u0000LM\u0003\u0014\n\u0000MN\u0003\u001c\u000e"+
		"\u0000NO\u0003\u001e\u000f\u0000O\u0005\u0001\u0000\u0000\u0000PQ\u0005"+
		"\t\u0000\u0000QR\u0005%\u0000\u0000RX\u0005\u0011\u0000\u0000ST\u0003"+
		"\b\u0004\u0000TU\u0005\u0015\u0000\u0000UW\u0001\u0000\u0000\u0000VS\u0001"+
		"\u0000\u0000\u0000WZ\u0001\u0000\u0000\u0000XV\u0001\u0000\u0000\u0000"+
		"XY\u0001\u0000\u0000\u0000Y[\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0012\u0000\u0000\\\u0007\u0001\u0000\u0000\u0000]^\u0005"+
		"%\u0000\u0000^_\u0005\u001b\u0000\u0000_`\u0003\n\u0005\u0000`\t\u0001"+
		"\u0000\u0000\u0000aj\u0003\f\u0006\u0000bc\u0003\f\u0006\u0000cd\u0005"+
		"!\u0000\u0000de\u0003\n\u0005\u0000ej\u0001\u0000\u0000\u0000fg\u0005"+
		"%\u0000\u0000gh\u0005\u0013\u0000\u0000hj\u0005\u0014\u0000\u0000ia\u0001"+
		"\u0000\u0000\u0000ib\u0001\u0000\u0000\u0000if\u0001\u0000\u0000\u0000"+
		"j\u000b\u0001\u0000\u0000\u0000kl\u0007\u0000\u0000\u0000l\r\u0001\u0000"+
		"\u0000\u0000mn\u0005\n\u0000\u0000no\u0005%\u0000\u0000op\u0005\u000f"+
		"\u0000\u0000pq\u0003\u0010\b\u0000qr\u0005\u0010\u0000\u0000rv\u0005\u0011"+
		"\u0000\u0000su\u0003\"\u0011\u0000ts\u0001\u0000\u0000\u0000ux\u0001\u0000"+
		"\u0000\u0000vt\u0001\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000wy\u0001"+
		"\u0000\u0000\u0000xv\u0001\u0000\u0000\u0000yz\u0005\u0012\u0000\u0000"+
		"z\u000f\u0001\u0000\u0000\u0000{\u0080\u0003\u0012\t\u0000|}\u0005\u0016"+
		"\u0000\u0000}\u007f\u0003\u0012\t\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0011\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0005%\u0000\u0000\u0084\u0085\u0005"+
		"%\u0000\u0000\u0085\u0013\u0001\u0000\u0000\u0000\u0086\u0087\u0005\b"+
		"\u0000\u0000\u0087\u0088\u0005\u0011\u0000\u0000\u0088\u0089\u0003\u0016"+
		"\u000b\u0000\u0089\u008a\u0005\u0012\u0000\u0000\u008a\u0015\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u0003\u0018\f\u0000\u008c\u008d\u0005\u0015\u0000"+
		"\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e\u008b\u0001\u0000\u0000"+
		"\u0000\u008f\u0092\u0001\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000"+
		"\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0017\u0001\u0000\u0000"+
		"\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0005%\u0000\u0000"+
		"\u0094\u0095\u0005%\u0000\u0000\u0095\u0096\u0005\u0013\u0000\u0000\u0096"+
		"\u0097\u0005\u0014\u0000\u0000\u0097\u0098\u0005\u0018\u0000\u0000\u0098"+
		"\u0099\u0005\u0011\u0000\u0000\u0099\u009a\u0003\u001a\r\u0000\u009a\u009b"+
		"\u0005\u0012\u0000\u0000\u009b\u0019\u0001\u0000\u0000\u0000\u009c\u009f"+
		"\u0005%\u0000\u0000\u009d\u009e\u0005\u0016\u0000\u0000\u009e\u00a0\u0003"+
		"\u001a\r\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000"+
		"\u0000\u0000\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005\u0006"+
		"\u0000\u0000\u00a2\u00a8\u0005\u0011\u0000\u0000\u00a3\u00a4\u0003$\u0012"+
		"\u0000\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a3\u0001\u0000\u0000\u0000\u00a7\u00aa\u0001\u0000\u0000"+
		"\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8\u00a9\u0001\u0000\u0000"+
		"\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ab\u00ac\u0005\u0012\u0000\u0000\u00ac\u001d\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ae\u0005\u0007\u0000\u0000\u00ae\u00b4\u0005\u0011\u0000"+
		"\u0000\u00af\u00b0\u0003*\u0015\u0000\u00b0\u00b1\u0005\u0015\u0000\u0000"+
		"\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00af\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000"+
		"\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000"+
		"\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b8\u0005\u0012\u0000\u0000"+
		"\u00b8\u001f\u0001\u0000\u0000\u0000\u00b9\u00ba\u0005\u0003\u0000\u0000"+
		"\u00ba\u00bb\u0005\u000f\u0000\u0000\u00bb\u00bc\u0003*\u0015\u0000\u00bc"+
		"\u00bd\u0005\u0010\u0000\u0000\u00bd\u00c1\u0005\u0011\u0000\u0000\u00be"+
		"\u00c0\u0003\"\u0011\u0000\u00bf\u00be\u0001\u0000\u0000\u0000\u00c0\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\u0012\u0000\u0000\u00c5!\u0001"+
		"\u0000\u0000\u0000\u00c6\u00cb\u0003 \u0010\u0000\u00c7\u00c8\u0003$\u0012"+
		"\u0000\u00c8\u00c9\u0005\u0015\u0000\u0000\u00c9\u00cb\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000"+
		"\u0000\u00cb#\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005%\u0000\u0000\u00cd"+
		"\u00ce\u0005\u0018\u0000\u0000\u00ce\u00d4\u0003*\u0015\u0000\u00cf\u00d0"+
		"\u0003&\u0013\u0000\u00d0\u00d1\u0005\u0018\u0000\u0000\u00d1\u00d2\u0003"+
		"*\u0015\u0000\u00d2\u00d4\u0001\u0000\u0000\u0000\u00d3\u00cc\u0001\u0000"+
		"\u0000\u0000\u00d3\u00cf\u0001\u0000\u0000\u0000\u00d4%\u0001\u0000\u0000"+
		"\u0000\u00d5\u00d6\u0005%\u0000\u0000\u00d6\u00d7\u0005\u0017\u0000\u0000"+
		"\u00d7\u00e0\u0005%\u0000\u0000\u00d8\u00d9\u0005%\u0000\u0000\u00d9\u00da"+
		"\u0005\u0013\u0000\u0000\u00da\u00db\u0003(\u0014\u0000\u00db\u00dc\u0005"+
		"\u0014\u0000\u0000\u00dc\u00dd\u0005\u0017\u0000\u0000\u00dd\u00de\u0005"+
		"%\u0000\u0000\u00de\u00e0\u0001\u0000\u0000\u0000\u00df\u00d5\u0001\u0000"+
		"\u0000\u0000\u00df\u00d8\u0001\u0000\u0000\u0000\u00e0\'\u0001\u0000\u0000"+
		"\u0000\u00e1\u00e4\u0003*\u0015\u0000\u00e2\u00e3\u0005\u0016\u0000\u0000"+
		"\u00e3\u00e5\u0003(\u0014\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0001\u0000\u0000\u0000\u00e5)\u0001\u0000\u0000\u0000\u00e6\u00e7"+
		"\u0006\u0015\uffff\uffff\u0000\u00e7\u00f4\u00032\u0019\u0000\u00e8\u00f4"+
		"\u0005%\u0000\u0000\u00e9\u00ea\u0005\u000f\u0000\u0000\u00ea\u00eb\u0003"+
		"*\u0015\u0000\u00eb\u00ec\u0005\u0010\u0000\u0000\u00ec\u00f4\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f4\u0003&\u0013\u0000\u00ee\u00ef\u0005%\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0013\u0000\u0000\u00f0\u00f1\u0003(\u0014\u0000\u00f1"+
		"\u00f2\u0005\u0014\u0000\u0000\u00f2\u00f4\u0001\u0000\u0000\u0000\u00f3"+
		"\u00e6\u0001\u0000\u0000\u0000\u00f3\u00e8\u0001\u0000\u0000\u0000\u00f3"+
		"\u00e9\u0001\u0000\u0000\u0000\u00f3\u00ed\u0001\u0000\u0000\u0000\u00f3"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f4\u0103\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\n\u0003\u0000\u0000\u00f6\u00f7\u0003,\u0016\u0000\u00f7\u00f8"+
		"\u0003*\u0015\u0004\u00f8\u0102\u0001\u0000\u0000\u0000\u00f9\u00fa\n"+
		"\u0002\u0000\u0000\u00fa\u00fb\u0003.\u0017\u0000\u00fb\u00fc\u0003*\u0015"+
		"\u0003\u00fc\u0102\u0001\u0000\u0000\u0000\u00fd\u00fe\n\u0001\u0000\u0000"+
		"\u00fe\u00ff\u00030\u0018\u0000\u00ff\u0100\u0003*\u0015\u0002\u0100\u0102"+
		"\u0001\u0000\u0000\u0000\u0101\u00f5\u0001\u0000\u0000\u0000\u0101\u00f9"+
		"\u0001\u0000\u0000\u0000\u0101\u00fd\u0001\u0000\u0000\u0000\u0102\u0105"+
		"\u0001\u0000\u0000\u0000\u0103\u0101\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u0001\u0000\u0000\u0000\u0104+\u0001\u0000\u0000\u0000\u0105\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0107\u0007\u0001\u0000\u0000\u0107-\u0001\u0000"+
		"\u0000\u0000\u0108\u0109\u0007\u0002\u0000\u0000\u0109/\u0001\u0000\u0000"+
		"\u0000\u010a\u010b\u0007\u0003\u0000\u0000\u010b1\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0007\u0004\u0000\u0000\u010d3\u0001\u0000\u0000\u0000\u0012"+
		">DXiv\u0080\u0090\u009f\u00a8\u00b4\u00c1\u00ca\u00d3\u00df\u00e4\u00f3"+
		"\u0101\u0103";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}