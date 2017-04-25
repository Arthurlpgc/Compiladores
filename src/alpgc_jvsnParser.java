// Generated from alpgc_jvsn.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class alpgc_jvsnParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__34=1, T__33=2, T__32=3, T__31=4, T__30=5, T__29=6, T__28=7, T__27=8, 
		T__26=9, T__25=10, T__24=11, T__23=12, T__22=13, T__21=14, T__20=15, T__19=16, 
		T__18=17, T__17=18, T__16=19, T__15=20, T__14=21, T__13=22, T__12=23, 
		T__11=24, T__10=25, T__9=26, T__8=27, T__7=28, T__6=29, T__5=30, T__4=31, 
		T__3=32, T__2=33, T__1=34, T__0=35, IDENTIFIER=36, INTEGERLITERAL=37, 
		SPACES=38;
	public static final String[] tokenNames = {
		"<INVALID>", "'main'", "'length'", "'return'", "'new'", "'true'", "'class'", 
		"'void'", "';'", "'while'", "'{'", "'&&'", "'extends'", "'='", "'}'", 
		"'if'", "'int'", "'('", "'*'", "'this'", "','", "'false'", "'.'", "'boolean'", 
		"'System.out.println'", "'['", "'String'", "'<'", "'public'", "']'", "'!'", 
		"'static'", "'else'", "')'", "'+'", "'-'", "IDENTIFIER", "INTEGERLITERAL", 
		"SPACES"
	};
	public static final int
		RULE_identifier = 0, RULE_type = 1, RULE_expression = 2, RULE_statement = 3, 
		RULE_method_declaration = 4, RULE_var_declaration = 5, RULE_class_declaration = 6, 
		RULE_main_class = 7, RULE_goal = 8;
	public static final String[] ruleNames = {
		"identifier", "type", "expression", "statement", "method_declaration", 
		"var_declaration", "class_declaration", "main_class", "goal"
	};

	@Override
	public String getGrammarFileName() { return "alpgc_jvsn.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public alpgc_jvsnParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(alpgc_jvsnParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18); match(IDENTIFIER);
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

	public static class TypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(26);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(20); match(T__19);
				setState(21); match(T__10);
				setState(22); match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(23); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(24); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(25); identifier();
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

	public static class ExpressionContext extends ParserRuleContext {
		public TerminalNode INTEGERLITERAL() { return getToken(alpgc_jvsnParser.INTEGERLITERAL, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(29); match(T__5);
				setState(30); expression(2);
				}
				break;
			case 2:
				{
				setState(31); match(INTEGERLITERAL);
				}
				break;
			case 3:
				{
				setState(32); match(T__30);
				}
				break;
			case 4:
				{
				setState(33); match(T__14);
				}
				break;
			case 5:
				{
				setState(34); identifier();
				}
				break;
			case 6:
				{
				setState(35); match(T__16);
				}
				break;
			case 7:
				{
				setState(36); match(T__31);
				setState(37); match(T__19);
				setState(38); match(T__10);
				setState(39); expression(0);
				setState(40); match(T__6);
				}
				break;
			case 8:
				{
				setState(42); match(T__31);
				setState(43); identifier();
				setState(44); match(T__18);
				setState(45); match(T__2);
				}
				break;
			case 9:
				{
				setState(47); match(T__18);
				setState(48); expression(0);
				setState(49); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(53);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(54);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__8) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(55); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(56);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(57); match(T__10);
						setState(58); expression(0);
						setState(59); match(T__6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(61);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(62); match(T__13);
						setState(63); match(T__33);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(64);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(65); match(T__13);
						setState(66); identifier();
						setState(67); match(T__18);
						setState(76);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__30) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__5) | (1L << IDENTIFIER) | (1L << INTEGERLITERAL))) != 0)) {
							{
							setState(68); expression(0);
							setState(73);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(69); match(T__15);
								setState(70); expression(0);
								}
								}
								setState(75);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(78); match(T__2);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
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

	public static class StatementContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(126);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85); match(T__25);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(86); statement();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92); match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); match(T__20);
				setState(94); match(T__18);
				setState(95); expression(0);
				setState(96); match(T__2);
				setState(97); statement();
				setState(98); match(T__3);
				setState(99); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); match(T__26);
				setState(102); match(T__18);
				setState(103); expression(0);
				setState(104); match(T__2);
				setState(105); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107); match(T__11);
				setState(108); match(T__18);
				setState(109); expression(0);
				setState(110); match(T__2);
				setState(111); match(T__27);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(113); identifier();
				setState(114); match(T__22);
				setState(115); expression(0);
				setState(116); match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(118); identifier();
				setState(119); match(T__10);
				setState(120); expression(0);
				setState(121); match(T__6);
				setState(122); match(T__22);
				setState(123); expression(0);
				setState(124); match(T__27);
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

	public static class Method_declarationContext extends ParserRuleContext {
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Method_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterMethod_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitMethod_declaration(this);
		}
	}

	public final Method_declarationContext method_declaration() throws RecognitionException {
		Method_declarationContext _localctx = new Method_declarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_method_declaration);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128); match(T__7);
			setState(129); type();
			setState(130); identifier();
			setState(131); match(T__18);
			setState(143);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(132); type();
				setState(133); identifier();
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(134); match(T__15);
					setState(135); type();
					setState(136); identifier();
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(145); match(T__2);
			setState(146); match(T__25);
			setState(150);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(147); var_declaration();
					}
					} 
				}
				setState(152);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(153); statement();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159); match(T__32);
			setState(160); expression(0);
			setState(161); match(T__27);
			setState(162); match(T__21);
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

	public static class Var_declarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Var_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterVar_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitVar_declaration(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); type();
			setState(165); identifier();
			setState(166); match(T__27);
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

	public static class Class_declarationContext extends ParserRuleContext {
		public Var_declarationContext var_declaration(int i) {
			return getRuleContext(Var_declarationContext.class,i);
		}
		public List<Method_declarationContext> method_declaration() {
			return getRuleContexts(Method_declarationContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public Method_declarationContext method_declaration(int i) {
			return getRuleContext(Method_declarationContext.class,i);
		}
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public Class_declarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterClass_declaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitClass_declaration(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168); match(T__29);
			setState(169); identifier();
			setState(172);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(170); match(T__23);
				setState(171); identifier();
				}
			}

			setState(174); match(T__25);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(175); var_declaration();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(181); method_declaration();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(187); match(T__21);
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

	public static class Main_classContext extends ParserRuleContext {
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Main_classContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_class; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterMain_class(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitMain_class(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189); match(T__29);
			setState(190); identifier();
			setState(191); match(T__25);
			setState(192); match(T__7);
			setState(193); match(T__4);
			setState(194); match(T__28);
			setState(195); match(T__34);
			setState(196); match(T__18);
			setState(197); match(T__9);
			setState(198); match(T__10);
			setState(199); match(T__6);
			setState(200); identifier();
			setState(201); match(T__2);
			setState(202); match(T__25);
			setState(203); statement();
			setState(204); match(T__21);
			setState(205); match(T__21);
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

	public static class GoalContext extends ParserRuleContext {
		public Main_classContext main_class() {
			return getRuleContext(Main_classContext.class,0);
		}
		public TerminalNode EOF() { return getToken(alpgc_jvsnParser.EOF, 0); }
		public List<Class_declarationContext> class_declaration() {
			return getRuleContexts(Class_declarationContext.class);
		}
		public Class_declarationContext class_declaration(int i) {
			return getRuleContext(Class_declarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitGoal(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); main_class();
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__29) {
				{
				{
				setState(208); class_declaration();
				}
				}
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(214); match(EOF);
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
		case 2: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 13);
		case 1: return precpred(_ctx, 12);
		case 2: return precpred(_ctx, 11);
		case 3: return precpred(_ctx, 10);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3(\u00db\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\5\3\35\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\66\n\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4J\n\4\f\4\16\4M\13\4\5\4O\n\4\3\4\3\4\7\4S\n\4\f\4\16\4V\13\4\3"+
		"\5\3\5\7\5Z\n\5\f\5\16\5]\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0081\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\7\6\u008d\n\6\f\6\16\6\u0090\13\6\5\6\u0092\n\6\3\6\3\6\3\6"+
		"\7\6\u0097\n\6\f\6\16\6\u009a\13\6\3\6\7\6\u009d\n\6\f\6\16\6\u00a0\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00af\n\b\3"+
		"\b\3\b\7\b\u00b3\n\b\f\b\16\b\u00b6\13\b\3\b\7\b\u00b9\n\b\f\b\16\b\u00bc"+
		"\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\n\3\n\7\n\u00d4\n\n\f\n\16\n\u00d7\13\n\3\n\3\n\3\n"+
		"\2\3\6\13\2\4\6\b\n\f\16\20\22\2\3\6\2\r\r\24\24\35\35$%\u00f0\2\24\3"+
		"\2\2\2\4\34\3\2\2\2\6\65\3\2\2\2\b\u0080\3\2\2\2\n\u0082\3\2\2\2\f\u00a6"+
		"\3\2\2\2\16\u00aa\3\2\2\2\20\u00bf\3\2\2\2\22\u00d1\3\2\2\2\24\25\7&\2"+
		"\2\25\3\3\2\2\2\26\27\7\22\2\2\27\30\7\33\2\2\30\35\7\37\2\2\31\35\7\31"+
		"\2\2\32\35\7\22\2\2\33\35\5\2\2\2\34\26\3\2\2\2\34\31\3\2\2\2\34\32\3"+
		"\2\2\2\34\33\3\2\2\2\35\5\3\2\2\2\36\37\b\4\1\2\37 \7 \2\2 \66\5\6\4\4"+
		"!\66\7\'\2\2\"\66\7\7\2\2#\66\7\27\2\2$\66\5\2\2\2%\66\7\25\2\2&\'\7\6"+
		"\2\2\'(\7\22\2\2()\7\33\2\2)*\5\6\4\2*+\7\37\2\2+\66\3\2\2\2,-\7\6\2\2"+
		"-.\5\2\2\2./\7\23\2\2/\60\7#\2\2\60\66\3\2\2\2\61\62\7\23\2\2\62\63\5"+
		"\6\4\2\63\64\7#\2\2\64\66\3\2\2\2\65\36\3\2\2\2\65!\3\2\2\2\65\"\3\2\2"+
		"\2\65#\3\2\2\2\65$\3\2\2\2\65%\3\2\2\2\65&\3\2\2\2\65,\3\2\2\2\65\61\3"+
		"\2\2\2\66T\3\2\2\2\678\f\17\2\289\t\2\2\29S\5\6\4\20:;\f\16\2\2;<\7\33"+
		"\2\2<=\5\6\4\2=>\7\37\2\2>S\3\2\2\2?@\f\r\2\2@A\7\30\2\2AS\7\4\2\2BC\f"+
		"\f\2\2CD\7\30\2\2DE\5\2\2\2EN\7\23\2\2FK\5\6\4\2GH\7\26\2\2HJ\5\6\4\2"+
		"IG\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2\2LO\3\2\2\2MK\3\2\2\2NF\3\2\2\2"+
		"NO\3\2\2\2OP\3\2\2\2PQ\7#\2\2QS\3\2\2\2R\67\3\2\2\2R:\3\2\2\2R?\3\2\2"+
		"\2RB\3\2\2\2SV\3\2\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VT\3\2\2\2W[\7\f"+
		"\2\2XZ\5\b\5\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3"+
		"\2\2\2^\u0081\7\20\2\2_`\7\21\2\2`a\7\23\2\2ab\5\6\4\2bc\7#\2\2cd\5\b"+
		"\5\2de\7\"\2\2ef\5\b\5\2f\u0081\3\2\2\2gh\7\13\2\2hi\7\23\2\2ij\5\6\4"+
		"\2jk\7#\2\2kl\5\b\5\2l\u0081\3\2\2\2mn\7\32\2\2no\7\23\2\2op\5\6\4\2p"+
		"q\7#\2\2qr\7\n\2\2r\u0081\3\2\2\2st\5\2\2\2tu\7\17\2\2uv\5\6\4\2vw\7\n"+
		"\2\2w\u0081\3\2\2\2xy\5\2\2\2yz\7\33\2\2z{\5\6\4\2{|\7\37\2\2|}\7\17\2"+
		"\2}~\5\6\4\2~\177\7\n\2\2\177\u0081\3\2\2\2\u0080W\3\2\2\2\u0080_\3\2"+
		"\2\2\u0080g\3\2\2\2\u0080m\3\2\2\2\u0080s\3\2\2\2\u0080x\3\2\2\2\u0081"+
		"\t\3\2\2\2\u0082\u0083\7\36\2\2\u0083\u0084\5\4\3\2\u0084\u0085\5\2\2"+
		"\2\u0085\u0091\7\23\2\2\u0086\u0087\5\4\3\2\u0087\u008e\5\2\2\2\u0088"+
		"\u0089\7\26\2\2\u0089\u008a\5\4\3\2\u008a\u008b\5\2\2\2\u008b\u008d\3"+
		"\2\2\2\u008c\u0088\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0086\3\2"+
		"\2\2\u0091\u0092\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7#\2\2\u0094"+
		"\u0098\7\f\2\2\u0095\u0097\5\f\7\2\u0096\u0095\3\2\2\2\u0097\u009a\3\2"+
		"\2\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u009e\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009b\u009d\5\b\5\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2"+
		"\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0"+
		"\u009e\3\2\2\2\u00a1\u00a2\7\5\2\2\u00a2\u00a3\5\6\4\2\u00a3\u00a4\7\n"+
		"\2\2\u00a4\u00a5\7\20\2\2\u00a5\13\3\2\2\2\u00a6\u00a7\5\4\3\2\u00a7\u00a8"+
		"\5\2\2\2\u00a8\u00a9\7\n\2\2\u00a9\r\3\2\2\2\u00aa\u00ab\7\b\2\2\u00ab"+
		"\u00ae\5\2\2\2\u00ac\u00ad\7\16\2\2\u00ad\u00af\5\2\2\2\u00ae\u00ac\3"+
		"\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b4\7\f\2\2\u00b1"+
		"\u00b3\5\f\7\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7"+
		"\u00b9\5\n\6\2\u00b8\u00b7\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2"+
		"\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd"+
		"\u00be\7\20\2\2\u00be\17\3\2\2\2\u00bf\u00c0\7\b\2\2\u00c0\u00c1\5\2\2"+
		"\2\u00c1\u00c2\7\f\2\2\u00c2\u00c3\7\36\2\2\u00c3\u00c4\7!\2\2\u00c4\u00c5"+
		"\7\t\2\2\u00c5\u00c6\7\3\2\2\u00c6\u00c7\7\23\2\2\u00c7\u00c8\7\34\2\2"+
		"\u00c8\u00c9\7\33\2\2\u00c9\u00ca\7\37\2\2\u00ca\u00cb\5\2\2\2\u00cb\u00cc"+
		"\7#\2\2\u00cc\u00cd\7\f\2\2\u00cd\u00ce\5\b\5\2\u00ce\u00cf\7\20\2\2\u00cf"+
		"\u00d0\7\20\2\2\u00d0\21\3\2\2\2\u00d1\u00d5\5\20\t\2\u00d2\u00d4\5\16"+
		"\b\2\u00d3\u00d2\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\2"+
		"\2\3\u00d9\23\3\2\2\2\22\34\65KNRT[\u0080\u008e\u0091\u0098\u009e\u00ae"+
		"\u00b4\u00ba\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}