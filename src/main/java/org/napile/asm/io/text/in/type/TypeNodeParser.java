// $ANTLR ANTLRVersion> TypeNodeParser.java generatedTimestamp>

package org.napile.asm.io.text.in.type;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TypeNodeParser extends Parser {
	public static final int
		T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, Identifier=10, 
		WS=11, COMMENT=12, LINE_COMMENT=13;
	public static final String[] tokenNames = {
		"<INVALID>", "<INVALID>", "<INVALID>",
		"'this'", "'>'", "'.'", "','", "':'", "'<'", "'?'", "Identifier", "WS", 
		"COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_typeNode = 0, RULE_arguments = 1, RULE_typePart = 2, RULE_classType = 3, 
		RULE_thisType = 4, RULE_typeParameterValue = 5, RULE_nulled = 6, RULE_qualifiedName = 7;
	public static final String[] ruleNames = {
		"typeNode", "arguments", "typePart", "classType", "thisType", "typeParameterValue", 
		"nulled", "qualifiedName"
	};

	@Override
	public String getGrammarFileName() { return "TypeNode.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public TypeNodeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator<Token>(this,_ATN);
	}
	public static class TypeNodeContext extends ParserRuleContext<Token> {
		public TypePartContext typePart() {
		    return getRuleContext(TypePartContext.class,0);
		}
		public ArgumentsContext arguments() {
		    return getRuleContext(ArgumentsContext.class,0);
		}
		public NulledContext nulled() {
		    return getRuleContext(NulledContext.class,0);
		}
		public TypeNodeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeNode; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterTypeNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitTypeNode(this);
		}
	}

	public final TypeNodeContext typeNode() throws RecognitionException {
		TypeNodeContext _localctx = new TypeNodeContext(_ctx, 0);
		enterRule(_localctx, RULE_typeNode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); typePart();
			setState(20);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==8 ) {
				{
				setState(18); arguments();
				}
			}

			setState(24);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==9 ) {
				{
				setState(22); nulled();
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

	public static class ArgumentsContext extends ParserRuleContext<Token> {
		public List<? extends TypeNodeContext> typeNode() {
		    return getRuleContexts(TypeNodeContext.class);
		}
		public TypeNodeContext typeNode(int i) {
		    return getRuleContext(TypeNodeContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitArguments(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, 2);
		enterRule(_localctx, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(8);
			setState(28); typeNode();
			setState(34);
			//_errHandler.sync(this);
			_la = _input.LA(1);
			if ( _la==6 ) {
				{
				setState(30); match(6);
				setState(32); typeNode();
				}
			}

			setState(36); match(4);
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

	public static class TypePartContext extends ParserRuleContext<Token> {
		public ThisTypeContext thisType() {
		    return getRuleContext(ThisTypeContext.class,0);
		}
		public TypeParameterValueContext typeParameterValue() {
		    return getRuleContext(TypeParameterValueContext.class,0);
		}
		public ClassTypeContext classType() {
		    return getRuleContext(ClassTypeContext.class,0);
		}
		public TypePartContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typePart; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterTypePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitTypePart(this);
		}
	}

	public final TypePartContext typePart() throws RecognitionException {
		TypePartContext _localctx = new TypePartContext(_ctx, 4);
		enterRule(_localctx, RULE_typePart);
		try {
			setState(44);
			//_errHandler.sync(this);
			switch ( _input.LA(1) ) {
				case Identifier:
					enterOuterAlt(_localctx, 1);
					{
					setState(38); classType();
					}
					break;
				case 7:
					enterOuterAlt(_localctx, 2);
					{
					setState(40); typeParameterValue();
					}
					break;
				case 3:
					enterOuterAlt(_localctx, 3);
					{
					setState(42); thisType();
					}
					break;
				default :
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

	public static class ClassTypeContext extends ParserRuleContext<Token> {
		public QualifiedNameContext qualifiedName() {
		    return getRuleContext(QualifiedNameContext.class,0);
		}
		public ClassTypeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_classType; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterClassType(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitClassType(this);
		}
	}

	public final ClassTypeContext classType() throws RecognitionException {
		ClassTypeContext _localctx = new ClassTypeContext(_ctx, 6);
		enterRule(_localctx, RULE_classType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46); qualifiedName();
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

	public static class ThisTypeContext extends ParserRuleContext<Token> {
		public ThisTypeContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_thisType; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterThisType(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitThisType(this);
		}
	}

	public final ThisTypeContext thisType() throws RecognitionException {
		ThisTypeContext _localctx = new ThisTypeContext(_ctx, 8);
		enterRule(_localctx, RULE_thisType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); match(3);
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

	public static class TypeParameterValueContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Identifier() { return getToken(TypeNodeParser.Identifier, 0); }
		public TypeParameterValueContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_typeParameterValue; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterTypeParameterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitTypeParameterValue(this);
		}
	}

	public final TypeParameterValueContext typeParameterValue() throws RecognitionException {
		TypeParameterValueContext _localctx = new TypeParameterValueContext(_ctx, 10);
		enterRule(_localctx, RULE_typeParameterValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50); match(7);
			setState(52); match(Identifier);
			setState(54); match(7);
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

	public static class NulledContext extends ParserRuleContext<Token> {
		public NulledContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_nulled; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterNulled(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitNulled(this);
		}
	}

	public final NulledContext nulled() throws RecognitionException {
		NulledContext _localctx = new NulledContext(_ctx, 12);
		enterRule(_localctx, RULE_nulled);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56); match(9);
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

	public static class QualifiedNameContext extends ParserRuleContext<Token> {
		public TerminalNode<Token> Identifier(int i) {
		    return getToken(TypeNodeParser.Identifier, i);
		}
		public List<TerminalNode<Token>> Identifier() { return getTokens(TypeNodeParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext<Token> parent, int state) {
			super(parent, state);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener<Token> listener) {
			if ( listener instanceof TypeNodeListener ) ((TypeNodeListener)listener).exitQualifiedName(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, 14);
		enterRule(_localctx, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(Identifier);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ( _la==5 ) {
				{
				{
				setState(60); match(5);
				setState(62); match(Identifier);
				}
				}
				setState(68);
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

	public static final String _serializedATN =
		"\3\rF\2\0\7\0\2\1\7\1\2\2\7\2\2\3\7\3\2\4\7\4\2\5\7\5\2\6\7\6\2\7\7\7"+
		"\1\0\0\1\0\0\3\0\b\0\1\0\0\3\0\b\0\1\1\0\1\1\0\1\1\0\1\1\0\3\1\b\1\1\1"+
		"\1\1\1\2\0\1\2\0\1\2\0\3\2\b\2\1\3\1\3\1\4\1\4\1\5\0\1\5\0\1\5\1\5\1\6"+
		"\1\6\1\7\0\1\7\0\1\7\0\5\7\b\7\n\7\f\7D\t\7\1\7\b\0\2\4\6\b\n\f\16\0\0"+
		"=\0\20\1\0\0\0\1\"\1\0\0\0\1#\1\0\0\0\2\32\1\0\0\0\3\25\1\0\0\0\4,\1\0"+
		"\0\0\5\24\1\0\0\0\6.\1\0\0\0\7-\1\0\0\0\b\60\1\0\0\0\t-\1\0\0\0\n\62\1"+
		"\0\0\0\13-\1\0\0\0\f8\1\0\0\0\r\31\1\0\0\0\16:\1\0\0\0\17/\1\0\0\0\20"+
		"\24\3\4\2\0\22\25\3\2\1\0\24\22\1\0\0\0\24\25\1\0\0\0\25\30\1\0\0\0\26"+
		"\31\3\f\6\0\30\26\1\0\0\0\30\31\1\0\0\0\31\1\1\0\0\0\32\34\5\b\0\0\34"+
		"\"\3\0\0\0\36 \5\6\0\0 #\3\0\0\0\"\36\1\0\0\0\"#\1\0\0\0#$\1\0\0\0$%\5"+
		"\4\0\0%\3\1\0\0\0&-\3\6\3\0(-\3\n\5\0*-\3\b\4\0,&\1\0\0\0,(\1\0\0\0,*"+
		"\1\0\0\0-\5\1\0\0\0./\3\16\7\0/\7\1\0\0\0\60\61\5\3\0\0\61\t\1\0\0\0\62"+
		"\64\5\7\0\0\64\66\5\n\0\0\66\67\5\7\0\0\67\13\1\0\0\089\5\t\0\09\r\1\0"+
		"\0\0:B\5\n\0\0<>\5\5\0\0>A\5\n\0\0@<\1\0\0\0AD\1\0\0\0B@\1\0\0\0BC\1\0"+
		"\0\0C\17\1\0\0\0DB\1\0\0\0\5\24\1\30\1\"\1,\1B\1";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		//org.antlr.v4.tool.DOTGenerator dot = new org.antlr.v4.tool.DOTGenerator(null);
		//System.out.println(dot.getDOT(_ATN.decisionToState.get(0), ruleNames, false));
		//System.out.println(dot.getDOT(_ATN.ruleToStartState[2], ruleNames, false));
	}
}