/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.example.mydsl.parser.antlr.internal.InternalEsper2MaudeParser;
import org.xtext.example.mydsl.services.Esper2MaudeGrammarAccess;

public class Esper2MaudeParser extends AbstractAntlrParser {

	@Inject
	private Esper2MaudeGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalEsper2MaudeParser createParser(XtextTokenStream stream) {
		return new InternalEsper2MaudeParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public Esper2MaudeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Esper2MaudeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}