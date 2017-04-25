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
		RULE_main_class = 7, RULE_formal = 8, RULE_goal = 9;
	public static final String[] ruleNames = {
		"identifier", "type", "expression", "statement", "method_declaration", 
		"var_declaration", "class_declaration", "main_class", "formal", "goal"
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20); match(IDENTIFIER);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(28);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(22); match(T__19);
				setState(23); match(T__10);
				setState(24); match(T__6);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); match(T__12);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(26); match(T__19);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(27); identifier();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitExpression(this);
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
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				setState(31); match(T__5);
				setState(32); expression(2);
				}
				break;
			case 2:
				{
				setState(33); match(INTEGERLITERAL);
				}
				break;
			case 3:
				{
				setState(34); match(T__30);
				}
				break;
			case 4:
				{
				setState(35); match(T__14);
				}
				break;
			case 5:
				{
				setState(36); identifier();
				}
				break;
			case 6:
				{
				setState(37); match(T__16);
				}
				break;
			case 7:
				{
				setState(38); match(T__31);
				setState(39); match(T__19);
				setState(40); match(T__10);
				setState(41); expression(0);
				setState(42); match(T__6);
				}
				break;
			case 8:
				{
				setState(44); match(T__31);
				setState(45); identifier();
				setState(46); match(T__18);
				setState(47); match(T__2);
				}
				break;
			case 9:
				{
				setState(49); match(T__18);
				setState(50); expression(0);
				setState(51); match(T__2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(84);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(82);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(55);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(56);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__17) | (1L << T__8) | (1L << T__1) | (1L << T__0))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(57); expression(14);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(58);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(59); match(T__10);
						setState(60); expression(0);
						setState(61); match(T__6);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(63);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(64); match(T__13);
						setState(65); match(T__33);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(66);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(67); match(T__13);
						setState(68); identifier();
						setState(69); match(T__18);
						setState(78);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__31) | (1L << T__30) | (1L << T__18) | (1L << T__16) | (1L << T__14) | (1L << T__5) | (1L << IDENTIFIER) | (1L << INTEGERLITERAL))) != 0)) {
							{
							setState(70); expression(0);
							setState(75);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__15) {
								{
								{
								setState(71); match(T__15);
								setState(72); expression(0);
								}
								}
								setState(77);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(80); match(T__2);
						}
						break;
					}
					} 
				}
				setState(86);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_statement);
		int _la;
		try {
			setState(128);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(87); match(T__25);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
					{
					{
					setState(88); statement();
					}
					}
					setState(93);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(94); match(T__21);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95); match(T__20);
				setState(96); match(T__18);
				setState(97); expression(0);
				setState(98); match(T__2);
				setState(99); statement();
				setState(100); match(T__3);
				setState(101); statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(103); match(T__26);
				setState(104); match(T__18);
				setState(105); expression(0);
				setState(106); match(T__2);
				setState(107); statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109); match(T__11);
				setState(110); match(T__18);
				setState(111); expression(0);
				setState(112); match(T__2);
				setState(113); match(T__27);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115); identifier();
				setState(116); match(T__22);
				setState(117); expression(0);
				setState(118); match(T__27);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(120); identifier();
				setState(121); match(T__10);
				setState(122); expression(0);
				setState(123); match(T__6);
				setState(124); match(T__22);
				setState(125); expression(0);
				setState(126); match(T__27);
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
		public List<Var_declarationContext> var_declaration() {
			return getRuleContexts(Var_declarationContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<FormalContext> formal() {
			return getRuleContexts(FormalContext.class);
		}
		public FormalContext formal(int i) {
			return getRuleContext(FormalContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitMethod_declaration(this);
			else return visitor.visitChildren(this);
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
			setState(130); match(T__7);
			setState(131); formal();
			setState(132); match(T__18);
			setState(141);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				setState(133); formal();
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__15) {
					{
					{
					setState(134); match(T__15);
					setState(135); formal();
					}
					}
					setState(140);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(143); match(T__2);
			setState(144); match(T__25);
			setState(148);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(145); var_declaration();
					}
					} 
				}
				setState(150);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			}
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__26) | (1L << T__25) | (1L << T__20) | (1L << T__11) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(151); statement();
				}
				}
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(157); match(T__32);
			setState(158); expression(0);
			setState(159); match(T__27);
			setState(160); match(T__21);
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
		public FormalContext formal() {
			return getRuleContext(FormalContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitVar_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declarationContext var_declaration() throws RecognitionException {
		Var_declarationContext _localctx = new Var_declarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_var_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); formal();
			setState(163); match(T__27);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitClass_declaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Class_declarationContext class_declaration() throws RecognitionException {
		Class_declarationContext _localctx = new Class_declarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_class_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165); match(T__29);
			setState(166); identifier();
			setState(169);
			_la = _input.LA(1);
			if (_la==T__23) {
				{
				setState(167); match(T__23);
				setState(168); identifier();
				}
			}

			setState(171); match(T__25);
			setState(175);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__19) | (1L << T__12) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(172); var_declaration();
				}
				}
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(178); method_declaration();
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184); match(T__21);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitMain_class(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_classContext main_class() throws RecognitionException {
		Main_classContext _localctx = new Main_classContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_main_class);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186); match(T__29);
			setState(187); identifier();
			setState(188); match(T__25);
			setState(189); match(T__7);
			setState(190); match(T__4);
			setState(191); match(T__28);
			setState(192); match(T__34);
			setState(193); match(T__18);
			setState(194); match(T__9);
			setState(195); match(T__10);
			setState(196); match(T__6);
			setState(197); identifier();
			setState(198); match(T__2);
			setState(199); match(T__25);
			setState(200); statement();
			setState(201); match(T__21);
			setState(202); match(T__21);
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

	public static class FormalContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public FormalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).enterFormal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof alpgc_jvsnListener ) ((alpgc_jvsnListener)listener).exitFormal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitFormal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FormalContext formal() throws RecognitionException {
		FormalContext _localctx = new FormalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_formal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204); type();
			setState(205); identifier();
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof alpgc_jvsnVisitor ) return ((alpgc_jvsnVisitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_goal);
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
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\48\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\7\4L\n\4\f\4\16\4O\13\4\5\4Q\n\4\3\4\3\4\7\4U\n\4\f\4\16\4"+
		"X\13\4\3\5\3\5\7\5\\\n\5\f\5\16\5_\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0083\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\7\6\u008b\n\6\f\6\16\6\u008e\13\6\5\6\u0090\n\6\3\6\3\6\3\6\7\6\u0095"+
		"\n\6\f\6\16\6\u0098\13\6\3\6\7\6\u009b\n\6\f\6\16\6\u009e\13\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\5\b\u00ac\n\b\3\b\3\b\7\b\u00b0"+
		"\n\b\f\b\16\b\u00b3\13\b\3\b\7\b\u00b6\n\b\f\b\16\b\u00b9\13\b\3\b\3\b"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\n\3\n\3\n\3\13\3\13\7\13\u00d4\n\13\f\13\16\13\u00d7\13\13\3\13\3"+
		"\13\3\13\2\3\6\f\2\4\6\b\n\f\16\20\22\24\2\3\6\2\r\r\24\24\35\35$%\u00ef"+
		"\2\26\3\2\2\2\4\36\3\2\2\2\6\67\3\2\2\2\b\u0082\3\2\2\2\n\u0084\3\2\2"+
		"\2\f\u00a4\3\2\2\2\16\u00a7\3\2\2\2\20\u00bc\3\2\2\2\22\u00ce\3\2\2\2"+
		"\24\u00d1\3\2\2\2\26\27\7&\2\2\27\3\3\2\2\2\30\31\7\22\2\2\31\32\7\33"+
		"\2\2\32\37\7\37\2\2\33\37\7\31\2\2\34\37\7\22\2\2\35\37\5\2\2\2\36\30"+
		"\3\2\2\2\36\33\3\2\2\2\36\34\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2 !\b\4"+
		"\1\2!\"\7 \2\2\"8\5\6\4\4#8\7\'\2\2$8\7\7\2\2%8\7\27\2\2&8\5\2\2\2\'8"+
		"\7\25\2\2()\7\6\2\2)*\7\22\2\2*+\7\33\2\2+,\5\6\4\2,-\7\37\2\2-8\3\2\2"+
		"\2./\7\6\2\2/\60\5\2\2\2\60\61\7\23\2\2\61\62\7#\2\2\628\3\2\2\2\63\64"+
		"\7\23\2\2\64\65\5\6\4\2\65\66\7#\2\2\668\3\2\2\2\67 \3\2\2\2\67#\3\2\2"+
		"\2\67$\3\2\2\2\67%\3\2\2\2\67&\3\2\2\2\67\'\3\2\2\2\67(\3\2\2\2\67.\3"+
		"\2\2\2\67\63\3\2\2\28V\3\2\2\29:\f\17\2\2:;\t\2\2\2;U\5\6\4\20<=\f\16"+
		"\2\2=>\7\33\2\2>?\5\6\4\2?@\7\37\2\2@U\3\2\2\2AB\f\r\2\2BC\7\30\2\2CU"+
		"\7\4\2\2DE\f\f\2\2EF\7\30\2\2FG\5\2\2\2GP\7\23\2\2HM\5\6\4\2IJ\7\26\2"+
		"\2JL\5\6\4\2KI\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2"+
		"\2PH\3\2\2\2PQ\3\2\2\2QR\3\2\2\2RS\7#\2\2SU\3\2\2\2T9\3\2\2\2T<\3\2\2"+
		"\2TA\3\2\2\2TD\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XV\3\2"+
		"\2\2Y]\7\f\2\2Z\\\5\b\5\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3"+
		"\2\2\2_]\3\2\2\2`\u0083\7\20\2\2ab\7\21\2\2bc\7\23\2\2cd\5\6\4\2de\7#"+
		"\2\2ef\5\b\5\2fg\7\"\2\2gh\5\b\5\2h\u0083\3\2\2\2ij\7\13\2\2jk\7\23\2"+
		"\2kl\5\6\4\2lm\7#\2\2mn\5\b\5\2n\u0083\3\2\2\2op\7\32\2\2pq\7\23\2\2q"+
		"r\5\6\4\2rs\7#\2\2st\7\n\2\2t\u0083\3\2\2\2uv\5\2\2\2vw\7\17\2\2wx\5\6"+
		"\4\2xy\7\n\2\2y\u0083\3\2\2\2z{\5\2\2\2{|\7\33\2\2|}\5\6\4\2}~\7\37\2"+
		"\2~\177\7\17\2\2\177\u0080\5\6\4\2\u0080\u0081\7\n\2\2\u0081\u0083\3\2"+
		"\2\2\u0082Y\3\2\2\2\u0082a\3\2\2\2\u0082i\3\2\2\2\u0082o\3\2\2\2\u0082"+
		"u\3\2\2\2\u0082z\3\2\2\2\u0083\t\3\2\2\2\u0084\u0085\7\36\2\2\u0085\u0086"+
		"\5\22\n\2\u0086\u008f\7\23\2\2\u0087\u008c\5\22\n\2\u0088\u0089\7\26\2"+
		"\2\u0089\u008b\5\22\n\2\u008a\u0088\3\2\2\2\u008b\u008e\3\2\2\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2"+
		"\2\2\u008f\u0087\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0092\7#\2\2\u0092\u0096\7\f\2\2\u0093\u0095\5\f\7\2\u0094\u0093\3\2"+
		"\2\2\u0095\u0098\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097"+
		"\u009c\3\2\2\2\u0098\u0096\3\2\2\2\u0099\u009b\5\b\5\2\u009a\u0099\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\7\5\2\2\u00a0\u00a1\5\6"+
		"\4\2\u00a1\u00a2\7\n\2\2\u00a2\u00a3\7\20\2\2\u00a3\13\3\2\2\2\u00a4\u00a5"+
		"\5\22\n\2\u00a5\u00a6\7\n\2\2\u00a6\r\3\2\2\2\u00a7\u00a8\7\b\2\2\u00a8"+
		"\u00ab\5\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ac\5\2\2\2\u00ab\u00a9\3"+
		"\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b1\7\f\2\2\u00ae"+
		"\u00b0\5\f\7\2\u00af\u00ae\3\2\2\2\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2"+
		"\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b7\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b4"+
		"\u00b6\5\n\6\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2"+
		"\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba"+
		"\u00bb\7\20\2\2\u00bb\17\3\2\2\2\u00bc\u00bd\7\b\2\2\u00bd\u00be\5\2\2"+
		"\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\36\2\2\u00c0\u00c1\7!\2\2\u00c1\u00c2"+
		"\7\t\2\2\u00c2\u00c3\7\3\2\2\u00c3\u00c4\7\23\2\2\u00c4\u00c5\7\34\2\2"+
		"\u00c5\u00c6\7\33\2\2\u00c6\u00c7\7\37\2\2\u00c7\u00c8\5\2\2\2\u00c8\u00c9"+
		"\7#\2\2\u00c9\u00ca\7\f\2\2\u00ca\u00cb\5\b\5\2\u00cb\u00cc\7\20\2\2\u00cc"+
		"\u00cd\7\20\2\2\u00cd\21\3\2\2\2\u00ce\u00cf\5\4\3\2\u00cf\u00d0\5\2\2"+
		"\2\u00d0\23\3\2\2\2\u00d1\u00d5\5\20\t\2\u00d2\u00d4\5\16\b\2\u00d3\u00d2"+
		"\3\2\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\7\2\2\3\u00d9\25\3\2\2"+
		"\2\22\36\67MPTV]\u0082\u008c\u008f\u0096\u009c\u00ab\u00b1\u00b7\u00d5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}