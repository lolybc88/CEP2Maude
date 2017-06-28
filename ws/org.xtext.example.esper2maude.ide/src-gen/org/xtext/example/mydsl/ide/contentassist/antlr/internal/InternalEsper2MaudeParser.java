package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.Esper2MaudeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsper2MaudeParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PROP_TYPE", "RULE_STRING", "RULE_INT", "RULE_GROUP_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schema'", "'('", "')'", "','", "'@Name'", "'@Priority'", "'insert'", "'into'", "'select'", "'from'", "'pattern'", "'['", "']'", "'.'", "'milliseconds'", "'every'", "'='", "'->'", "'where'", "'as'", "'win:time'", "'win:time_batch'", "'timer:within'", "'-'", "'true'", "'false'", "'>'", "'>='", "'<>'", "'<'", "'<='", "'and'", "'or'", "'*'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int RULE_PROP_TYPE=5;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int RULE_GROUP_OP=8;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEsper2MaudeParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEsper2MaudeParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEsper2MaudeParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEsper2Maude.g"; }


    	private Esper2MaudeGrammarAccess grammarAccess;

    	public void setGrammarAccess(Esper2MaudeGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleModel"
    // InternalEsper2Maude.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:54:1: ( ruleModel EOF )
            // InternalEsper2Maude.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEsper2Maude.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalEsper2Maude.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalEsper2Maude.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalEsper2Maude.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalEsper2Maude.g:69:3: ( rule__Model__Group__0 )
            // InternalEsper2Maude.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSchema"
    // InternalEsper2Maude.g:78:1: entryRuleSchema : ruleSchema EOF ;
    public final void entryRuleSchema() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:79:1: ( ruleSchema EOF )
            // InternalEsper2Maude.g:80:1: ruleSchema EOF
            {
             before(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getSchemaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalEsper2Maude.g:87:1: ruleSchema : ( ( rule__Schema__Group__0 ) ) ;
    public final void ruleSchema() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:91:2: ( ( ( rule__Schema__Group__0 ) ) )
            // InternalEsper2Maude.g:92:2: ( ( rule__Schema__Group__0 ) )
            {
            // InternalEsper2Maude.g:92:2: ( ( rule__Schema__Group__0 ) )
            // InternalEsper2Maude.g:93:3: ( rule__Schema__Group__0 )
            {
             before(grammarAccess.getSchemaAccess().getGroup()); 
            // InternalEsper2Maude.g:94:3: ( rule__Schema__Group__0 )
            // InternalEsper2Maude.g:94:4: rule__Schema__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleEventProperty"
    // InternalEsper2Maude.g:103:1: entryRuleEventProperty : ruleEventProperty EOF ;
    public final void entryRuleEventProperty() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:104:1: ( ruleEventProperty EOF )
            // InternalEsper2Maude.g:105:1: ruleEventProperty EOF
            {
             before(grammarAccess.getEventPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleEventProperty();

            state._fsp--;

             after(grammarAccess.getEventPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEventProperty"


    // $ANTLR start "ruleEventProperty"
    // InternalEsper2Maude.g:112:1: ruleEventProperty : ( ( rule__EventProperty__Group__0 ) ) ;
    public final void ruleEventProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:116:2: ( ( ( rule__EventProperty__Group__0 ) ) )
            // InternalEsper2Maude.g:117:2: ( ( rule__EventProperty__Group__0 ) )
            {
            // InternalEsper2Maude.g:117:2: ( ( rule__EventProperty__Group__0 ) )
            // InternalEsper2Maude.g:118:3: ( rule__EventProperty__Group__0 )
            {
             before(grammarAccess.getEventPropertyAccess().getGroup()); 
            // InternalEsper2Maude.g:119:3: ( rule__EventProperty__Group__0 )
            // InternalEsper2Maude.g:119:4: rule__EventProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EventProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEventPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEventProperty"


    // $ANTLR start "entryRulePattern"
    // InternalEsper2Maude.g:128:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:129:1: ( rulePattern EOF )
            // InternalEsper2Maude.g:130:1: rulePattern EOF
            {
             before(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getPatternRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalEsper2Maude.g:137:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:141:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalEsper2Maude.g:142:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalEsper2Maude.g:142:2: ( ( rule__Pattern__Group__0 ) )
            // InternalEsper2Maude.g:143:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalEsper2Maude.g:144:3: ( rule__Pattern__Group__0 )
            // InternalEsper2Maude.g:144:4: rule__Pattern__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleWindow"
    // InternalEsper2Maude.g:153:1: entryRuleWindow : ruleWindow EOF ;
    public final void entryRuleWindow() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:154:1: ( ruleWindow EOF )
            // InternalEsper2Maude.g:155:1: ruleWindow EOF
            {
             before(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getWindowRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalEsper2Maude.g:162:1: ruleWindow : ( ( rule__Window__Alternatives ) ) ;
    public final void ruleWindow() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:166:2: ( ( ( rule__Window__Alternatives ) ) )
            // InternalEsper2Maude.g:167:2: ( ( rule__Window__Alternatives ) )
            {
            // InternalEsper2Maude.g:167:2: ( ( rule__Window__Alternatives ) )
            // InternalEsper2Maude.g:168:3: ( rule__Window__Alternatives )
            {
             before(grammarAccess.getWindowAccess().getAlternatives()); 
            // InternalEsper2Maude.g:169:3: ( rule__Window__Alternatives )
            // InternalEsper2Maude.g:169:4: rule__Window__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Window__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleWhereFilter"
    // InternalEsper2Maude.g:178:1: entryRuleWhereFilter : ruleWhereFilter EOF ;
    public final void entryRuleWhereFilter() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:179:1: ( ruleWhereFilter EOF )
            // InternalEsper2Maude.g:180:1: ruleWhereFilter EOF
            {
             before(grammarAccess.getWhereFilterRule()); 
            pushFollow(FOLLOW_1);
            ruleWhereFilter();

            state._fsp--;

             after(grammarAccess.getWhereFilterRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleWhereFilter"


    // $ANTLR start "ruleWhereFilter"
    // InternalEsper2Maude.g:187:1: ruleWhereFilter : ( ( rule__WhereFilter__Group__0 ) ) ;
    public final void ruleWhereFilter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:191:2: ( ( ( rule__WhereFilter__Group__0 ) ) )
            // InternalEsper2Maude.g:192:2: ( ( rule__WhereFilter__Group__0 ) )
            {
            // InternalEsper2Maude.g:192:2: ( ( rule__WhereFilter__Group__0 ) )
            // InternalEsper2Maude.g:193:3: ( rule__WhereFilter__Group__0 )
            {
             before(grammarAccess.getWhereFilterAccess().getGroup()); 
            // InternalEsper2Maude.g:194:3: ( rule__WhereFilter__Group__0 )
            // InternalEsper2Maude.g:194:4: rule__WhereFilter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleWhereFilter"


    // $ANTLR start "entryRuleFilterFrom"
    // InternalEsper2Maude.g:203:1: entryRuleFilterFrom : ruleFilterFrom EOF ;
    public final void entryRuleFilterFrom() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:204:1: ( ruleFilterFrom EOF )
            // InternalEsper2Maude.g:205:1: ruleFilterFrom EOF
            {
             before(grammarAccess.getFilterFromRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterFrom();

            state._fsp--;

             after(grammarAccess.getFilterFromRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterFrom"


    // $ANTLR start "ruleFilterFrom"
    // InternalEsper2Maude.g:212:1: ruleFilterFrom : ( ( rule__FilterFrom__Alternatives ) ) ;
    public final void ruleFilterFrom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:216:2: ( ( ( rule__FilterFrom__Alternatives ) ) )
            // InternalEsper2Maude.g:217:2: ( ( rule__FilterFrom__Alternatives ) )
            {
            // InternalEsper2Maude.g:217:2: ( ( rule__FilterFrom__Alternatives ) )
            // InternalEsper2Maude.g:218:3: ( rule__FilterFrom__Alternatives )
            {
             before(grammarAccess.getFilterFromAccess().getAlternatives()); 
            // InternalEsper2Maude.g:219:3: ( rule__FilterFrom__Alternatives )
            // InternalEsper2Maude.g:219:4: rule__FilterFrom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterFrom"


    // $ANTLR start "entryRuleFollowedBy"
    // InternalEsper2Maude.g:228:1: entryRuleFollowedBy : ruleFollowedBy EOF ;
    public final void entryRuleFollowedBy() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:229:1: ( ruleFollowedBy EOF )
            // InternalEsper2Maude.g:230:1: ruleFollowedBy EOF
            {
             before(grammarAccess.getFollowedByRule()); 
            pushFollow(FOLLOW_1);
            ruleFollowedBy();

            state._fsp--;

             after(grammarAccess.getFollowedByRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFollowedBy"


    // $ANTLR start "ruleFollowedBy"
    // InternalEsper2Maude.g:237:1: ruleFollowedBy : ( ( rule__FollowedBy__Group__0 ) ) ;
    public final void ruleFollowedBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:241:2: ( ( ( rule__FollowedBy__Group__0 ) ) )
            // InternalEsper2Maude.g:242:2: ( ( rule__FollowedBy__Group__0 ) )
            {
            // InternalEsper2Maude.g:242:2: ( ( rule__FollowedBy__Group__0 ) )
            // InternalEsper2Maude.g:243:3: ( rule__FollowedBy__Group__0 )
            {
             before(grammarAccess.getFollowedByAccess().getGroup()); 
            // InternalEsper2Maude.g:244:3: ( rule__FollowedBy__Group__0 )
            // InternalEsper2Maude.g:244:4: rule__FollowedBy__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFollowedByAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFollowedBy"


    // $ANTLR start "entryRuleSubFilterFollowedBy"
    // InternalEsper2Maude.g:253:1: entryRuleSubFilterFollowedBy : ruleSubFilterFollowedBy EOF ;
    public final void entryRuleSubFilterFollowedBy() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:254:1: ( ruleSubFilterFollowedBy EOF )
            // InternalEsper2Maude.g:255:1: ruleSubFilterFollowedBy EOF
            {
             before(grammarAccess.getSubFilterFollowedByRule()); 
            pushFollow(FOLLOW_1);
            ruleSubFilterFollowedBy();

            state._fsp--;

             after(grammarAccess.getSubFilterFollowedByRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSubFilterFollowedBy"


    // $ANTLR start "ruleSubFilterFollowedBy"
    // InternalEsper2Maude.g:262:1: ruleSubFilterFollowedBy : ( ( rule__SubFilterFollowedBy__Alternatives ) ) ;
    public final void ruleSubFilterFollowedBy() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:266:2: ( ( ( rule__SubFilterFollowedBy__Alternatives ) ) )
            // InternalEsper2Maude.g:267:2: ( ( rule__SubFilterFollowedBy__Alternatives ) )
            {
            // InternalEsper2Maude.g:267:2: ( ( rule__SubFilterFollowedBy__Alternatives ) )
            // InternalEsper2Maude.g:268:3: ( rule__SubFilterFollowedBy__Alternatives )
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getAlternatives()); 
            // InternalEsper2Maude.g:269:3: ( rule__SubFilterFollowedBy__Alternatives )
            // InternalEsper2Maude.g:269:4: rule__SubFilterFollowedBy__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSubFilterFollowedByAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSubFilterFollowedBy"


    // $ANTLR start "entryRuleEvery"
    // InternalEsper2Maude.g:278:1: entryRuleEvery : ruleEvery EOF ;
    public final void entryRuleEvery() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:279:1: ( ruleEvery EOF )
            // InternalEsper2Maude.g:280:1: ruleEvery EOF
            {
             before(grammarAccess.getEveryRule()); 
            pushFollow(FOLLOW_1);
            ruleEvery();

            state._fsp--;

             after(grammarAccess.getEveryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvery"


    // $ANTLR start "ruleEvery"
    // InternalEsper2Maude.g:287:1: ruleEvery : ( ( rule__Every__Alternatives ) ) ;
    public final void ruleEvery() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:291:2: ( ( ( rule__Every__Alternatives ) ) )
            // InternalEsper2Maude.g:292:2: ( ( rule__Every__Alternatives ) )
            {
            // InternalEsper2Maude.g:292:2: ( ( rule__Every__Alternatives ) )
            // InternalEsper2Maude.g:293:3: ( rule__Every__Alternatives )
            {
             before(grammarAccess.getEveryAccess().getAlternatives()); 
            // InternalEsper2Maude.g:294:3: ( rule__Every__Alternatives )
            // InternalEsper2Maude.g:294:4: rule__Every__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Every__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEveryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvery"


    // $ANTLR start "entryRuleFilterEvent"
    // InternalEsper2Maude.g:303:1: entryRuleFilterEvent : ruleFilterEvent EOF ;
    public final void entryRuleFilterEvent() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:304:1: ( ruleFilterEvent EOF )
            // InternalEsper2Maude.g:305:1: ruleFilterEvent EOF
            {
             before(grammarAccess.getFilterEventRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getFilterEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterEvent"


    // $ANTLR start "ruleFilterEvent"
    // InternalEsper2Maude.g:312:1: ruleFilterEvent : ( ( rule__FilterEvent__Group__0 ) ) ;
    public final void ruleFilterEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:316:2: ( ( ( rule__FilterEvent__Group__0 ) ) )
            // InternalEsper2Maude.g:317:2: ( ( rule__FilterEvent__Group__0 ) )
            {
            // InternalEsper2Maude.g:317:2: ( ( rule__FilterEvent__Group__0 ) )
            // InternalEsper2Maude.g:318:3: ( rule__FilterEvent__Group__0 )
            {
             before(grammarAccess.getFilterEventAccess().getGroup()); 
            // InternalEsper2Maude.g:319:3: ( rule__FilterEvent__Group__0 )
            // InternalEsper2Maude.g:319:4: rule__FilterEvent__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FilterEvent__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFilterEventAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterEvent"


    // $ANTLR start "entryRuleFilterPart"
    // InternalEsper2Maude.g:328:1: entryRuleFilterPart : ruleFilterPart EOF ;
    public final void entryRuleFilterPart() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:329:1: ( ruleFilterPart EOF )
            // InternalEsper2Maude.g:330:1: ruleFilterPart EOF
            {
             before(grammarAccess.getFilterPartRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterPart();

            state._fsp--;

             after(grammarAccess.getFilterPartRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterPart"


    // $ANTLR start "ruleFilterPart"
    // InternalEsper2Maude.g:337:1: ruleFilterPart : ( ( rule__FilterPart__Alternatives ) ) ;
    public final void ruleFilterPart() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:341:2: ( ( ( rule__FilterPart__Alternatives ) ) )
            // InternalEsper2Maude.g:342:2: ( ( rule__FilterPart__Alternatives ) )
            {
            // InternalEsper2Maude.g:342:2: ( ( rule__FilterPart__Alternatives ) )
            // InternalEsper2Maude.g:343:3: ( rule__FilterPart__Alternatives )
            {
             before(grammarAccess.getFilterPartAccess().getAlternatives()); 
            // InternalEsper2Maude.g:344:3: ( rule__FilterPart__Alternatives )
            // InternalEsper2Maude.g:344:4: rule__FilterPart__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterPartAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterPart"


    // $ANTLR start "entryRuleFilterOperator"
    // InternalEsper2Maude.g:353:1: entryRuleFilterOperator : ruleFilterOperator EOF ;
    public final void entryRuleFilterOperator() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:354:1: ( ruleFilterOperator EOF )
            // InternalEsper2Maude.g:355:1: ruleFilterOperator EOF
            {
             before(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleFilterOperator();

            state._fsp--;

             after(grammarAccess.getFilterOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleFilterOperator"


    // $ANTLR start "ruleFilterOperator"
    // InternalEsper2Maude.g:362:1: ruleFilterOperator : ( ( rule__FilterOperator__Alternatives ) ) ;
    public final void ruleFilterOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:366:2: ( ( ( rule__FilterOperator__Alternatives ) ) )
            // InternalEsper2Maude.g:367:2: ( ( rule__FilterOperator__Alternatives ) )
            {
            // InternalEsper2Maude.g:367:2: ( ( rule__FilterOperator__Alternatives ) )
            // InternalEsper2Maude.g:368:3: ( rule__FilterOperator__Alternatives )
            {
             before(grammarAccess.getFilterOperatorAccess().getAlternatives()); 
            // InternalEsper2Maude.g:369:3: ( rule__FilterOperator__Alternatives )
            // InternalEsper2Maude.g:369:4: rule__FilterOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__FilterOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFilterOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleFilterOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalEsper2Maude.g:378:1: entryRuleComparisonOperator : ruleComparisonOperator EOF ;
    public final void entryRuleComparisonOperator() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:379:1: ( ruleComparisonOperator EOF )
            // InternalEsper2Maude.g:380:1: ruleComparisonOperator EOF
            {
             before(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getComparisonOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalEsper2Maude.g:387:1: ruleComparisonOperator : ( ( rule__ComparisonOperator__Alternatives ) ) ;
    public final void ruleComparisonOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:391:2: ( ( ( rule__ComparisonOperator__Alternatives ) ) )
            // InternalEsper2Maude.g:392:2: ( ( rule__ComparisonOperator__Alternatives ) )
            {
            // InternalEsper2Maude.g:392:2: ( ( rule__ComparisonOperator__Alternatives ) )
            // InternalEsper2Maude.g:393:3: ( rule__ComparisonOperator__Alternatives )
            {
             before(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 
            // InternalEsper2Maude.g:394:3: ( rule__ComparisonOperator__Alternatives )
            // InternalEsper2Maude.g:394:4: rule__ComparisonOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__ComparisonOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getComparisonOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalEsper2Maude.g:403:1: entryRuleLogicalOperator : ruleLogicalOperator EOF ;
    public final void entryRuleLogicalOperator() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:404:1: ( ruleLogicalOperator EOF )
            // InternalEsper2Maude.g:405:1: ruleLogicalOperator EOF
            {
             before(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getLogicalOperatorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalEsper2Maude.g:412:1: ruleLogicalOperator : ( ( rule__LogicalOperator__Alternatives ) ) ;
    public final void ruleLogicalOperator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:416:2: ( ( ( rule__LogicalOperator__Alternatives ) ) )
            // InternalEsper2Maude.g:417:2: ( ( rule__LogicalOperator__Alternatives ) )
            {
            // InternalEsper2Maude.g:417:2: ( ( rule__LogicalOperator__Alternatives ) )
            // InternalEsper2Maude.g:418:3: ( rule__LogicalOperator__Alternatives )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 
            // InternalEsper2Maude.g:419:3: ( rule__LogicalOperator__Alternatives )
            // InternalEsper2Maude.g:419:4: rule__LogicalOperator__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__LogicalOperator__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLogicalOperatorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleEvent"
    // InternalEsper2Maude.g:428:1: entryRuleEvent : ruleEvent EOF ;
    public final void entryRuleEvent() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:429:1: ( ruleEvent EOF )
            // InternalEsper2Maude.g:430:1: ruleEvent EOF
            {
             before(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getEventRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEsper2Maude.g:437:1: ruleEvent : ( ( rule__Event__NameAssignment ) ) ;
    public final void ruleEvent() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:441:2: ( ( ( rule__Event__NameAssignment ) ) )
            // InternalEsper2Maude.g:442:2: ( ( rule__Event__NameAssignment ) )
            {
            // InternalEsper2Maude.g:442:2: ( ( rule__Event__NameAssignment ) )
            // InternalEsper2Maude.g:443:3: ( rule__Event__NameAssignment )
            {
             before(grammarAccess.getEventAccess().getNameAssignment()); 
            // InternalEsper2Maude.g:444:3: ( rule__Event__NameAssignment )
            // InternalEsper2Maude.g:444:4: rule__Event__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Event__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getEventAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleNonLastSelectEntry"
    // InternalEsper2Maude.g:453:1: entryRuleNonLastSelectEntry : ruleNonLastSelectEntry EOF ;
    public final void entryRuleNonLastSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:454:1: ( ruleNonLastSelectEntry EOF )
            // InternalEsper2Maude.g:455:1: ruleNonLastSelectEntry EOF
            {
             before(grammarAccess.getNonLastSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleNonLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getNonLastSelectEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNonLastSelectEntry"


    // $ANTLR start "ruleNonLastSelectEntry"
    // InternalEsper2Maude.g:462:1: ruleNonLastSelectEntry : ( ( rule__NonLastSelectEntry__Group__0 ) ) ;
    public final void ruleNonLastSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:466:2: ( ( ( rule__NonLastSelectEntry__Group__0 ) ) )
            // InternalEsper2Maude.g:467:2: ( ( rule__NonLastSelectEntry__Group__0 ) )
            {
            // InternalEsper2Maude.g:467:2: ( ( rule__NonLastSelectEntry__Group__0 ) )
            // InternalEsper2Maude.g:468:3: ( rule__NonLastSelectEntry__Group__0 )
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getGroup()); 
            // InternalEsper2Maude.g:469:3: ( rule__NonLastSelectEntry__Group__0 )
            // InternalEsper2Maude.g:469:4: rule__NonLastSelectEntry__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NonLastSelectEntry__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNonLastSelectEntryAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNonLastSelectEntry"


    // $ANTLR start "entryRuleLastSelectEntry"
    // InternalEsper2Maude.g:478:1: entryRuleLastSelectEntry : ruleLastSelectEntry EOF ;
    public final void entryRuleLastSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:479:1: ( ruleLastSelectEntry EOF )
            // InternalEsper2Maude.g:480:1: ruleLastSelectEntry EOF
            {
             before(grammarAccess.getLastSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getLastSelectEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLastSelectEntry"


    // $ANTLR start "ruleLastSelectEntry"
    // InternalEsper2Maude.g:487:1: ruleLastSelectEntry : ( ( rule__LastSelectEntry__EntryAssignment ) ) ;
    public final void ruleLastSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:491:2: ( ( ( rule__LastSelectEntry__EntryAssignment ) ) )
            // InternalEsper2Maude.g:492:2: ( ( rule__LastSelectEntry__EntryAssignment ) )
            {
            // InternalEsper2Maude.g:492:2: ( ( rule__LastSelectEntry__EntryAssignment ) )
            // InternalEsper2Maude.g:493:3: ( rule__LastSelectEntry__EntryAssignment )
            {
             before(grammarAccess.getLastSelectEntryAccess().getEntryAssignment()); 
            // InternalEsper2Maude.g:494:3: ( rule__LastSelectEntry__EntryAssignment )
            // InternalEsper2Maude.g:494:4: rule__LastSelectEntry__EntryAssignment
            {
            pushFollow(FOLLOW_2);
            rule__LastSelectEntry__EntryAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLastSelectEntryAccess().getEntryAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLastSelectEntry"


    // $ANTLR start "entryRuleSelectEntry"
    // InternalEsper2Maude.g:503:1: entryRuleSelectEntry : ruleSelectEntry EOF ;
    public final void entryRuleSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:504:1: ( ruleSelectEntry EOF )
            // InternalEsper2Maude.g:505:1: ruleSelectEntry EOF
            {
             before(grammarAccess.getSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            ruleSelectEntry();

            state._fsp--;

             after(grammarAccess.getSelectEntryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSelectEntry"


    // $ANTLR start "ruleSelectEntry"
    // InternalEsper2Maude.g:512:1: ruleSelectEntry : ( ( rule__SelectEntry__Alternatives ) ) ;
    public final void ruleSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:516:2: ( ( ( rule__SelectEntry__Alternatives ) ) )
            // InternalEsper2Maude.g:517:2: ( ( rule__SelectEntry__Alternatives ) )
            {
            // InternalEsper2Maude.g:517:2: ( ( rule__SelectEntry__Alternatives ) )
            // InternalEsper2Maude.g:518:3: ( rule__SelectEntry__Alternatives )
            {
             before(grammarAccess.getSelectEntryAccess().getAlternatives()); 
            // InternalEsper2Maude.g:519:3: ( rule__SelectEntry__Alternatives )
            // InternalEsper2Maude.g:519:4: rule__SelectEntry__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSelectEntry"


    // $ANTLR start "entryRuleField"
    // InternalEsper2Maude.g:528:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:529:1: ( ruleField EOF )
            // InternalEsper2Maude.g:530:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalEsper2Maude.g:537:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:541:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalEsper2Maude.g:542:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalEsper2Maude.g:542:2: ( ( rule__Field__Alternatives ) )
            // InternalEsper2Maude.g:543:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalEsper2Maude.g:544:3: ( rule__Field__Alternatives )
            // InternalEsper2Maude.g:544:4: rule__Field__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Field__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "rule__Window__Alternatives"
    // InternalEsper2Maude.g:552:1: rule__Window__Alternatives : ( ( ( rule__Window__Group_0__0 ) ) | ( ( rule__Window__Group_1__0 ) ) );
    public final void rule__Window__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:556:1: ( ( ( rule__Window__Group_0__0 ) ) | ( ( rule__Window__Group_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==34) ) {
                alt1=1;
            }
            else if ( (LA1_0==35) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEsper2Maude.g:557:2: ( ( rule__Window__Group_0__0 ) )
                    {
                    // InternalEsper2Maude.g:557:2: ( ( rule__Window__Group_0__0 ) )
                    // InternalEsper2Maude.g:558:3: ( rule__Window__Group_0__0 )
                    {
                     before(grammarAccess.getWindowAccess().getGroup_0()); 
                    // InternalEsper2Maude.g:559:3: ( rule__Window__Group_0__0 )
                    // InternalEsper2Maude.g:559:4: rule__Window__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWindowAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:563:2: ( ( rule__Window__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:563:2: ( ( rule__Window__Group_1__0 ) )
                    // InternalEsper2Maude.g:564:3: ( rule__Window__Group_1__0 )
                    {
                     before(grammarAccess.getWindowAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:565:3: ( rule__Window__Group_1__0 )
                    // InternalEsper2Maude.g:565:4: rule__Window__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Window__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getWindowAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Alternatives"


    // $ANTLR start "rule__FilterFrom__Alternatives"
    // InternalEsper2Maude.g:573:1: rule__FilterFrom__Alternatives : ( ( ( rule__FilterFrom__FollowedByAssignment_0 ) ) | ( ( rule__FilterFrom__Group_1__0 ) ) | ( ( rule__FilterFrom__Group_2__0 ) ) );
    public final void rule__FilterFrom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:577:1: ( ( ( rule__FilterFrom__FollowedByAssignment_0 ) ) | ( ( rule__FilterFrom__Group_1__0 ) ) | ( ( rule__FilterFrom__Group_2__0 ) ) )
            int alt2=3;
            alt2 = dfa2.predict(input);
            switch (alt2) {
                case 1 :
                    // InternalEsper2Maude.g:578:2: ( ( rule__FilterFrom__FollowedByAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:578:2: ( ( rule__FilterFrom__FollowedByAssignment_0 ) )
                    // InternalEsper2Maude.g:579:3: ( rule__FilterFrom__FollowedByAssignment_0 )
                    {
                     before(grammarAccess.getFilterFromAccess().getFollowedByAssignment_0()); 
                    // InternalEsper2Maude.g:580:3: ( rule__FilterFrom__FollowedByAssignment_0 )
                    // InternalEsper2Maude.g:580:4: rule__FilterFrom__FollowedByAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterFrom__FollowedByAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterFromAccess().getFollowedByAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:584:2: ( ( rule__FilterFrom__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:584:2: ( ( rule__FilterFrom__Group_1__0 ) )
                    // InternalEsper2Maude.g:585:3: ( rule__FilterFrom__Group_1__0 )
                    {
                     before(grammarAccess.getFilterFromAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:586:3: ( rule__FilterFrom__Group_1__0 )
                    // InternalEsper2Maude.g:586:4: rule__FilterFrom__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterFrom__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterFromAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:590:2: ( ( rule__FilterFrom__Group_2__0 ) )
                    {
                    // InternalEsper2Maude.g:590:2: ( ( rule__FilterFrom__Group_2__0 ) )
                    // InternalEsper2Maude.g:591:3: ( rule__FilterFrom__Group_2__0 )
                    {
                     before(grammarAccess.getFilterFromAccess().getGroup_2()); 
                    // InternalEsper2Maude.g:592:3: ( rule__FilterFrom__Group_2__0 )
                    // InternalEsper2Maude.g:592:4: rule__FilterFrom__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterFrom__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterFromAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Alternatives"


    // $ANTLR start "rule__SubFilterFollowedBy__Alternatives"
    // InternalEsper2Maude.g:600:1: rule__SubFilterFollowedBy__Alternatives : ( ( ( rule__SubFilterFollowedBy__Group_0__0 ) ) | ( ( rule__SubFilterFollowedBy__Group_1__0 ) ) | ( ( rule__SubFilterFollowedBy__EveryAssignment_2 ) ) );
    public final void rule__SubFilterFollowedBy__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:604:1: ( ( ( rule__SubFilterFollowedBy__Group_0__0 ) ) | ( ( rule__SubFilterFollowedBy__Group_1__0 ) ) | ( ( rule__SubFilterFollowedBy__EveryAssignment_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case 15:
                {
                alt3=2;
                }
                break;
            case 29:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalEsper2Maude.g:605:2: ( ( rule__SubFilterFollowedBy__Group_0__0 ) )
                    {
                    // InternalEsper2Maude.g:605:2: ( ( rule__SubFilterFollowedBy__Group_0__0 ) )
                    // InternalEsper2Maude.g:606:3: ( rule__SubFilterFollowedBy__Group_0__0 )
                    {
                     before(grammarAccess.getSubFilterFollowedByAccess().getGroup_0()); 
                    // InternalEsper2Maude.g:607:3: ( rule__SubFilterFollowedBy__Group_0__0 )
                    // InternalEsper2Maude.g:607:4: rule__SubFilterFollowedBy__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFilterFollowedBy__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFilterFollowedByAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:611:2: ( ( rule__SubFilterFollowedBy__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:611:2: ( ( rule__SubFilterFollowedBy__Group_1__0 ) )
                    // InternalEsper2Maude.g:612:3: ( rule__SubFilterFollowedBy__Group_1__0 )
                    {
                     before(grammarAccess.getSubFilterFollowedByAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:613:3: ( rule__SubFilterFollowedBy__Group_1__0 )
                    // InternalEsper2Maude.g:613:4: rule__SubFilterFollowedBy__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFilterFollowedBy__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFilterFollowedByAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:617:2: ( ( rule__SubFilterFollowedBy__EveryAssignment_2 ) )
                    {
                    // InternalEsper2Maude.g:617:2: ( ( rule__SubFilterFollowedBy__EveryAssignment_2 ) )
                    // InternalEsper2Maude.g:618:3: ( rule__SubFilterFollowedBy__EveryAssignment_2 )
                    {
                     before(grammarAccess.getSubFilterFollowedByAccess().getEveryAssignment_2()); 
                    // InternalEsper2Maude.g:619:3: ( rule__SubFilterFollowedBy__EveryAssignment_2 )
                    // InternalEsper2Maude.g:619:4: rule__SubFilterFollowedBy__EveryAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFilterFollowedBy__EveryAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getSubFilterFollowedByAccess().getEveryAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Alternatives"


    // $ANTLR start "rule__Every__Alternatives"
    // InternalEsper2Maude.g:627:1: rule__Every__Alternatives : ( ( ( rule__Every__Group_0__0 ) ) | ( ( rule__Every__Group_1__0 ) ) );
    public final void rule__Every__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:631:1: ( ( ( rule__Every__Group_0__0 ) ) | ( ( rule__Every__Group_1__0 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==15) ) {
                    alt4=2;
                }
                else if ( (LA4_1==RULE_ID) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalEsper2Maude.g:632:2: ( ( rule__Every__Group_0__0 ) )
                    {
                    // InternalEsper2Maude.g:632:2: ( ( rule__Every__Group_0__0 ) )
                    // InternalEsper2Maude.g:633:3: ( rule__Every__Group_0__0 )
                    {
                     before(grammarAccess.getEveryAccess().getGroup_0()); 
                    // InternalEsper2Maude.g:634:3: ( rule__Every__Group_0__0 )
                    // InternalEsper2Maude.g:634:4: rule__Every__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Every__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEveryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:638:2: ( ( rule__Every__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:638:2: ( ( rule__Every__Group_1__0 ) )
                    // InternalEsper2Maude.g:639:3: ( rule__Every__Group_1__0 )
                    {
                     before(grammarAccess.getEveryAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:640:3: ( rule__Every__Group_1__0 )
                    // InternalEsper2Maude.g:640:4: rule__Every__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Every__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getEveryAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Alternatives"


    // $ANTLR start "rule__FilterPart__Alternatives"
    // InternalEsper2Maude.g:648:1: rule__FilterPart__Alternatives : ( ( ( rule__FilterPart__EventPropNameAssignment_0 ) ) | ( ( rule__FilterPart__Group_1__0 ) ) | ( ( rule__FilterPart__Group_2__0 ) ) | ( ( rule__FilterPart__StrAssignment_3 ) ) | ( ( rule__FilterPart__TAssignment_4 ) ) | ( ( rule__FilterPart__FAssignment_5 ) ) );
    public final void rule__FilterPart__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:652:1: ( ( ( rule__FilterPart__EventPropNameAssignment_0 ) ) | ( ( rule__FilterPart__Group_1__0 ) ) | ( ( rule__FilterPart__Group_2__0 ) ) | ( ( rule__FilterPart__StrAssignment_3 ) ) | ( ( rule__FilterPart__TAssignment_4 ) ) | ( ( rule__FilterPart__FAssignment_5 ) ) )
            int alt5=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==27) ) {
                    alt5=2;
                }
                else if ( (LA5_1==EOF||LA5_1==16||LA5_1==26||LA5_1==30||(LA5_1>=40 && LA5_1<=46)) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 37:
                {
                alt5=3;
                }
                break;
            case RULE_STRING:
                {
                alt5=4;
                }
                break;
            case 38:
                {
                alt5=5;
                }
                break;
            case 39:
                {
                alt5=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalEsper2Maude.g:653:2: ( ( rule__FilterPart__EventPropNameAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:653:2: ( ( rule__FilterPart__EventPropNameAssignment_0 ) )
                    // InternalEsper2Maude.g:654:3: ( rule__FilterPart__EventPropNameAssignment_0 )
                    {
                     before(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_0()); 
                    // InternalEsper2Maude.g:655:3: ( rule__FilterPart__EventPropNameAssignment_0 )
                    // InternalEsper2Maude.g:655:4: rule__FilterPart__EventPropNameAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__EventPropNameAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:659:2: ( ( rule__FilterPart__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:659:2: ( ( rule__FilterPart__Group_1__0 ) )
                    // InternalEsper2Maude.g:660:3: ( rule__FilterPart__Group_1__0 )
                    {
                     before(grammarAccess.getFilterPartAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:661:3: ( rule__FilterPart__Group_1__0 )
                    // InternalEsper2Maude.g:661:4: rule__FilterPart__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:665:2: ( ( rule__FilterPart__Group_2__0 ) )
                    {
                    // InternalEsper2Maude.g:665:2: ( ( rule__FilterPart__Group_2__0 ) )
                    // InternalEsper2Maude.g:666:3: ( rule__FilterPart__Group_2__0 )
                    {
                     before(grammarAccess.getFilterPartAccess().getGroup_2()); 
                    // InternalEsper2Maude.g:667:3: ( rule__FilterPart__Group_2__0 )
                    // InternalEsper2Maude.g:667:4: rule__FilterPart__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getGroup_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper2Maude.g:671:2: ( ( rule__FilterPart__StrAssignment_3 ) )
                    {
                    // InternalEsper2Maude.g:671:2: ( ( rule__FilterPart__StrAssignment_3 ) )
                    // InternalEsper2Maude.g:672:3: ( rule__FilterPart__StrAssignment_3 )
                    {
                     before(grammarAccess.getFilterPartAccess().getStrAssignment_3()); 
                    // InternalEsper2Maude.g:673:3: ( rule__FilterPart__StrAssignment_3 )
                    // InternalEsper2Maude.g:673:4: rule__FilterPart__StrAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__StrAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getStrAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper2Maude.g:677:2: ( ( rule__FilterPart__TAssignment_4 ) )
                    {
                    // InternalEsper2Maude.g:677:2: ( ( rule__FilterPart__TAssignment_4 ) )
                    // InternalEsper2Maude.g:678:3: ( rule__FilterPart__TAssignment_4 )
                    {
                     before(grammarAccess.getFilterPartAccess().getTAssignment_4()); 
                    // InternalEsper2Maude.g:679:3: ( rule__FilterPart__TAssignment_4 )
                    // InternalEsper2Maude.g:679:4: rule__FilterPart__TAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__TAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getTAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper2Maude.g:683:2: ( ( rule__FilterPart__FAssignment_5 ) )
                    {
                    // InternalEsper2Maude.g:683:2: ( ( rule__FilterPart__FAssignment_5 ) )
                    // InternalEsper2Maude.g:684:3: ( rule__FilterPart__FAssignment_5 )
                    {
                     before(grammarAccess.getFilterPartAccess().getFAssignment_5()); 
                    // InternalEsper2Maude.g:685:3: ( rule__FilterPart__FAssignment_5 )
                    // InternalEsper2Maude.g:685:4: rule__FilterPart__FAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__FAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterPartAccess().getFAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Alternatives"


    // $ANTLR start "rule__FilterOperator__Alternatives"
    // InternalEsper2Maude.g:693:1: rule__FilterOperator__Alternatives : ( ( ( rule__FilterOperator__ComparisonAssignment_0 ) ) | ( ( rule__FilterOperator__LogicalAssignment_1 ) ) );
    public final void rule__FilterOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:697:1: ( ( ( rule__FilterOperator__ComparisonAssignment_0 ) ) | ( ( rule__FilterOperator__LogicalAssignment_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==30||(LA6_0>=40 && LA6_0<=44)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=45 && LA6_0<=46)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEsper2Maude.g:698:2: ( ( rule__FilterOperator__ComparisonAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:698:2: ( ( rule__FilterOperator__ComparisonAssignment_0 ) )
                    // InternalEsper2Maude.g:699:3: ( rule__FilterOperator__ComparisonAssignment_0 )
                    {
                     before(grammarAccess.getFilterOperatorAccess().getComparisonAssignment_0()); 
                    // InternalEsper2Maude.g:700:3: ( rule__FilterOperator__ComparisonAssignment_0 )
                    // InternalEsper2Maude.g:700:4: rule__FilterOperator__ComparisonAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterOperator__ComparisonAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterOperatorAccess().getComparisonAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:704:2: ( ( rule__FilterOperator__LogicalAssignment_1 ) )
                    {
                    // InternalEsper2Maude.g:704:2: ( ( rule__FilterOperator__LogicalAssignment_1 ) )
                    // InternalEsper2Maude.g:705:3: ( rule__FilterOperator__LogicalAssignment_1 )
                    {
                     before(grammarAccess.getFilterOperatorAccess().getLogicalAssignment_1()); 
                    // InternalEsper2Maude.g:706:3: ( rule__FilterOperator__LogicalAssignment_1 )
                    // InternalEsper2Maude.g:706:4: rule__FilterOperator__LogicalAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterOperator__LogicalAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getFilterOperatorAccess().getLogicalAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperator__Alternatives"


    // $ANTLR start "rule__ComparisonOperator__Alternatives"
    // InternalEsper2Maude.g:714:1: rule__ComparisonOperator__Alternatives : ( ( ( rule__ComparisonOperator__GtAssignment_0 ) ) | ( ( rule__ComparisonOperator__GeAssignment_1 ) ) | ( ( rule__ComparisonOperator__EqAssignment_2 ) ) | ( ( rule__ComparisonOperator__NeqAssignment_3 ) ) | ( ( rule__ComparisonOperator__LtAssignment_4 ) ) | ( ( rule__ComparisonOperator__LeAssignment_5 ) ) );
    public final void rule__ComparisonOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:718:1: ( ( ( rule__ComparisonOperator__GtAssignment_0 ) ) | ( ( rule__ComparisonOperator__GeAssignment_1 ) ) | ( ( rule__ComparisonOperator__EqAssignment_2 ) ) | ( ( rule__ComparisonOperator__NeqAssignment_3 ) ) | ( ( rule__ComparisonOperator__LtAssignment_4 ) ) | ( ( rule__ComparisonOperator__LeAssignment_5 ) ) )
            int alt7=6;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt7=1;
                }
                break;
            case 41:
                {
                alt7=2;
                }
                break;
            case 30:
                {
                alt7=3;
                }
                break;
            case 42:
                {
                alt7=4;
                }
                break;
            case 43:
                {
                alt7=5;
                }
                break;
            case 44:
                {
                alt7=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalEsper2Maude.g:719:2: ( ( rule__ComparisonOperator__GtAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:719:2: ( ( rule__ComparisonOperator__GtAssignment_0 ) )
                    // InternalEsper2Maude.g:720:3: ( rule__ComparisonOperator__GtAssignment_0 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGtAssignment_0()); 
                    // InternalEsper2Maude.g:721:3: ( rule__ComparisonOperator__GtAssignment_0 )
                    // InternalEsper2Maude.g:721:4: rule__ComparisonOperator__GtAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__GtAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGtAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:725:2: ( ( rule__ComparisonOperator__GeAssignment_1 ) )
                    {
                    // InternalEsper2Maude.g:725:2: ( ( rule__ComparisonOperator__GeAssignment_1 ) )
                    // InternalEsper2Maude.g:726:3: ( rule__ComparisonOperator__GeAssignment_1 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getGeAssignment_1()); 
                    // InternalEsper2Maude.g:727:3: ( rule__ComparisonOperator__GeAssignment_1 )
                    // InternalEsper2Maude.g:727:4: rule__ComparisonOperator__GeAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__GeAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getGeAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:731:2: ( ( rule__ComparisonOperator__EqAssignment_2 ) )
                    {
                    // InternalEsper2Maude.g:731:2: ( ( rule__ComparisonOperator__EqAssignment_2 ) )
                    // InternalEsper2Maude.g:732:3: ( rule__ComparisonOperator__EqAssignment_2 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getEqAssignment_2()); 
                    // InternalEsper2Maude.g:733:3: ( rule__ComparisonOperator__EqAssignment_2 )
                    // InternalEsper2Maude.g:733:4: rule__ComparisonOperator__EqAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__EqAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getEqAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalEsper2Maude.g:737:2: ( ( rule__ComparisonOperator__NeqAssignment_3 ) )
                    {
                    // InternalEsper2Maude.g:737:2: ( ( rule__ComparisonOperator__NeqAssignment_3 ) )
                    // InternalEsper2Maude.g:738:3: ( rule__ComparisonOperator__NeqAssignment_3 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getNeqAssignment_3()); 
                    // InternalEsper2Maude.g:739:3: ( rule__ComparisonOperator__NeqAssignment_3 )
                    // InternalEsper2Maude.g:739:4: rule__ComparisonOperator__NeqAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__NeqAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getNeqAssignment_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalEsper2Maude.g:743:2: ( ( rule__ComparisonOperator__LtAssignment_4 ) )
                    {
                    // InternalEsper2Maude.g:743:2: ( ( rule__ComparisonOperator__LtAssignment_4 ) )
                    // InternalEsper2Maude.g:744:3: ( rule__ComparisonOperator__LtAssignment_4 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLtAssignment_4()); 
                    // InternalEsper2Maude.g:745:3: ( rule__ComparisonOperator__LtAssignment_4 )
                    // InternalEsper2Maude.g:745:4: rule__ComparisonOperator__LtAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__LtAssignment_4();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLtAssignment_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalEsper2Maude.g:749:2: ( ( rule__ComparisonOperator__LeAssignment_5 ) )
                    {
                    // InternalEsper2Maude.g:749:2: ( ( rule__ComparisonOperator__LeAssignment_5 ) )
                    // InternalEsper2Maude.g:750:3: ( rule__ComparisonOperator__LeAssignment_5 )
                    {
                     before(grammarAccess.getComparisonOperatorAccess().getLeAssignment_5()); 
                    // InternalEsper2Maude.g:751:3: ( rule__ComparisonOperator__LeAssignment_5 )
                    // InternalEsper2Maude.g:751:4: rule__ComparisonOperator__LeAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComparisonOperator__LeAssignment_5();

                    state._fsp--;


                    }

                     after(grammarAccess.getComparisonOperatorAccess().getLeAssignment_5()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__Alternatives"


    // $ANTLR start "rule__LogicalOperator__Alternatives"
    // InternalEsper2Maude.g:759:1: rule__LogicalOperator__Alternatives : ( ( ( rule__LogicalOperator__AndAssignment_0 ) ) | ( ( rule__LogicalOperator__OrAssignment_1 ) ) );
    public final void rule__LogicalOperator__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:763:1: ( ( ( rule__LogicalOperator__AndAssignment_0 ) ) | ( ( rule__LogicalOperator__OrAssignment_1 ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==45) ) {
                alt8=1;
            }
            else if ( (LA8_0==46) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsper2Maude.g:764:2: ( ( rule__LogicalOperator__AndAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:764:2: ( ( rule__LogicalOperator__AndAssignment_0 ) )
                    // InternalEsper2Maude.g:765:3: ( rule__LogicalOperator__AndAssignment_0 )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getAndAssignment_0()); 
                    // InternalEsper2Maude.g:766:3: ( rule__LogicalOperator__AndAssignment_0 )
                    // InternalEsper2Maude.g:766:4: rule__LogicalOperator__AndAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalOperator__AndAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalOperatorAccess().getAndAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:770:2: ( ( rule__LogicalOperator__OrAssignment_1 ) )
                    {
                    // InternalEsper2Maude.g:770:2: ( ( rule__LogicalOperator__OrAssignment_1 ) )
                    // InternalEsper2Maude.g:771:3: ( rule__LogicalOperator__OrAssignment_1 )
                    {
                     before(grammarAccess.getLogicalOperatorAccess().getOrAssignment_1()); 
                    // InternalEsper2Maude.g:772:3: ( rule__LogicalOperator__OrAssignment_1 )
                    // InternalEsper2Maude.g:772:4: rule__LogicalOperator__OrAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__LogicalOperator__OrAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLogicalOperatorAccess().getOrAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOperator__Alternatives"


    // $ANTLR start "rule__SelectEntry__Alternatives"
    // InternalEsper2Maude.g:780:1: rule__SelectEntry__Alternatives : ( ( ( rule__SelectEntry__Group_0__0 ) ) | ( ( rule__SelectEntry__Group_1__0 ) ) );
    public final void rule__SelectEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:784:1: ( ( ( rule__SelectEntry__Group_0__0 ) ) | ( ( rule__SelectEntry__Group_1__0 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID||LA9_0==47) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_GROUP_OP) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEsper2Maude.g:785:2: ( ( rule__SelectEntry__Group_0__0 ) )
                    {
                    // InternalEsper2Maude.g:785:2: ( ( rule__SelectEntry__Group_0__0 ) )
                    // InternalEsper2Maude.g:786:3: ( rule__SelectEntry__Group_0__0 )
                    {
                     before(grammarAccess.getSelectEntryAccess().getGroup_0()); 
                    // InternalEsper2Maude.g:787:3: ( rule__SelectEntry__Group_0__0 )
                    // InternalEsper2Maude.g:787:4: rule__SelectEntry__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectEntry__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectEntryAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:791:2: ( ( rule__SelectEntry__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:791:2: ( ( rule__SelectEntry__Group_1__0 ) )
                    // InternalEsper2Maude.g:792:3: ( rule__SelectEntry__Group_1__0 )
                    {
                     before(grammarAccess.getSelectEntryAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:793:3: ( rule__SelectEntry__Group_1__0 )
                    // InternalEsper2Maude.g:793:4: rule__SelectEntry__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectEntry__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSelectEntryAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Alternatives"


    // $ANTLR start "rule__Field__Alternatives"
    // InternalEsper2Maude.g:801:1: rule__Field__Alternatives : ( ( ( rule__Field__StarAssignment_0 ) ) | ( ( rule__Field__Group_1__0 ) ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:805:1: ( ( ( rule__Field__StarAssignment_0 ) ) | ( ( rule__Field__Group_1__0 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==47) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEsper2Maude.g:806:2: ( ( rule__Field__StarAssignment_0 ) )
                    {
                    // InternalEsper2Maude.g:806:2: ( ( rule__Field__StarAssignment_0 ) )
                    // InternalEsper2Maude.g:807:3: ( rule__Field__StarAssignment_0 )
                    {
                     before(grammarAccess.getFieldAccess().getStarAssignment_0()); 
                    // InternalEsper2Maude.g:808:3: ( rule__Field__StarAssignment_0 )
                    // InternalEsper2Maude.g:808:4: rule__Field__StarAssignment_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__StarAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getStarAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:812:2: ( ( rule__Field__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:812:2: ( ( rule__Field__Group_1__0 ) )
                    // InternalEsper2Maude.g:813:3: ( rule__Field__Group_1__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:814:3: ( rule__Field__Group_1__0 )
                    // InternalEsper2Maude.g:814:4: rule__Field__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Field__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getFieldAccess().getGroup_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalEsper2Maude.g:822:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:826:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalEsper2Maude.g:827:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalEsper2Maude.g:834:1: rule__Model__Group__0__Impl : ( ( rule__Model__SchemasAssignment_0 )* ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:838:1: ( ( ( rule__Model__SchemasAssignment_0 )* ) )
            // InternalEsper2Maude.g:839:1: ( ( rule__Model__SchemasAssignment_0 )* )
            {
            // InternalEsper2Maude.g:839:1: ( ( rule__Model__SchemasAssignment_0 )* )
            // InternalEsper2Maude.g:840:2: ( rule__Model__SchemasAssignment_0 )*
            {
             before(grammarAccess.getModelAccess().getSchemasAssignment_0()); 
            // InternalEsper2Maude.g:841:2: ( rule__Model__SchemasAssignment_0 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==13) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalEsper2Maude.g:841:3: rule__Model__SchemasAssignment_0
            	    {
            	    pushFollow(FOLLOW_4);
            	    rule__Model__SchemasAssignment_0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getSchemasAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalEsper2Maude.g:849:1: rule__Model__Group__1 : rule__Model__Group__1__Impl ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:853:1: ( rule__Model__Group__1__Impl )
            // InternalEsper2Maude.g:854:2: rule__Model__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalEsper2Maude.g:860:1: rule__Model__Group__1__Impl : ( ( rule__Model__PatternsAssignment_1 )* ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:864:1: ( ( ( rule__Model__PatternsAssignment_1 )* ) )
            // InternalEsper2Maude.g:865:1: ( ( rule__Model__PatternsAssignment_1 )* )
            {
            // InternalEsper2Maude.g:865:1: ( ( rule__Model__PatternsAssignment_1 )* )
            // InternalEsper2Maude.g:866:2: ( rule__Model__PatternsAssignment_1 )*
            {
             before(grammarAccess.getModelAccess().getPatternsAssignment_1()); 
            // InternalEsper2Maude.g:867:2: ( rule__Model__PatternsAssignment_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEsper2Maude.g:867:3: rule__Model__PatternsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__PatternsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPatternsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__0"
    // InternalEsper2Maude.g:876:1: rule__Schema__Group__0 : rule__Schema__Group__0__Impl rule__Schema__Group__1 ;
    public final void rule__Schema__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:880:1: ( rule__Schema__Group__0__Impl rule__Schema__Group__1 )
            // InternalEsper2Maude.g:881:2: rule__Schema__Group__0__Impl rule__Schema__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Schema__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0"


    // $ANTLR start "rule__Schema__Group__0__Impl"
    // InternalEsper2Maude.g:888:1: rule__Schema__Group__0__Impl : ( 'create' ) ;
    public final void rule__Schema__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:892:1: ( ( 'create' ) )
            // InternalEsper2Maude.g:893:1: ( 'create' )
            {
            // InternalEsper2Maude.g:893:1: ( 'create' )
            // InternalEsper2Maude.g:894:2: 'create'
            {
             before(grammarAccess.getSchemaAccess().getCreateKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getCreateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__0__Impl"


    // $ANTLR start "rule__Schema__Group__1"
    // InternalEsper2Maude.g:903:1: rule__Schema__Group__1 : rule__Schema__Group__1__Impl rule__Schema__Group__2 ;
    public final void rule__Schema__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:907:1: ( rule__Schema__Group__1__Impl rule__Schema__Group__2 )
            // InternalEsper2Maude.g:908:2: rule__Schema__Group__1__Impl rule__Schema__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Schema__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1"


    // $ANTLR start "rule__Schema__Group__1__Impl"
    // InternalEsper2Maude.g:915:1: rule__Schema__Group__1__Impl : ( 'schema' ) ;
    public final void rule__Schema__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:919:1: ( ( 'schema' ) )
            // InternalEsper2Maude.g:920:1: ( 'schema' )
            {
            // InternalEsper2Maude.g:920:1: ( 'schema' )
            // InternalEsper2Maude.g:921:2: 'schema'
            {
             before(grammarAccess.getSchemaAccess().getSchemaKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getSchemaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__1__Impl"


    // $ANTLR start "rule__Schema__Group__2"
    // InternalEsper2Maude.g:930:1: rule__Schema__Group__2 : rule__Schema__Group__2__Impl rule__Schema__Group__3 ;
    public final void rule__Schema__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:934:1: ( rule__Schema__Group__2__Impl rule__Schema__Group__3 )
            // InternalEsper2Maude.g:935:2: rule__Schema__Group__2__Impl rule__Schema__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__Schema__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2"


    // $ANTLR start "rule__Schema__Group__2__Impl"
    // InternalEsper2Maude.g:942:1: rule__Schema__Group__2__Impl : ( ( rule__Schema__NameAssignment_2 ) ) ;
    public final void rule__Schema__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:946:1: ( ( ( rule__Schema__NameAssignment_2 ) ) )
            // InternalEsper2Maude.g:947:1: ( ( rule__Schema__NameAssignment_2 ) )
            {
            // InternalEsper2Maude.g:947:1: ( ( rule__Schema__NameAssignment_2 ) )
            // InternalEsper2Maude.g:948:2: ( rule__Schema__NameAssignment_2 )
            {
             before(grammarAccess.getSchemaAccess().getNameAssignment_2()); 
            // InternalEsper2Maude.g:949:2: ( rule__Schema__NameAssignment_2 )
            // InternalEsper2Maude.g:949:3: rule__Schema__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Schema__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__2__Impl"


    // $ANTLR start "rule__Schema__Group__3"
    // InternalEsper2Maude.g:957:1: rule__Schema__Group__3 : rule__Schema__Group__3__Impl rule__Schema__Group__4 ;
    public final void rule__Schema__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:961:1: ( rule__Schema__Group__3__Impl rule__Schema__Group__4 )
            // InternalEsper2Maude.g:962:2: rule__Schema__Group__3__Impl rule__Schema__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3"


    // $ANTLR start "rule__Schema__Group__3__Impl"
    // InternalEsper2Maude.g:969:1: rule__Schema__Group__3__Impl : ( '(' ) ;
    public final void rule__Schema__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:973:1: ( ( '(' ) )
            // InternalEsper2Maude.g:974:1: ( '(' )
            {
            // InternalEsper2Maude.g:974:1: ( '(' )
            // InternalEsper2Maude.g:975:2: '('
            {
             before(grammarAccess.getSchemaAccess().getLeftParenthesisKeyword_3()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getLeftParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__3__Impl"


    // $ANTLR start "rule__Schema__Group__4"
    // InternalEsper2Maude.g:984:1: rule__Schema__Group__4 : rule__Schema__Group__4__Impl rule__Schema__Group__5 ;
    public final void rule__Schema__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:988:1: ( rule__Schema__Group__4__Impl rule__Schema__Group__5 )
            // InternalEsper2Maude.g:989:2: rule__Schema__Group__4__Impl rule__Schema__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4"


    // $ANTLR start "rule__Schema__Group__4__Impl"
    // InternalEsper2Maude.g:996:1: rule__Schema__Group__4__Impl : ( ( rule__Schema__PropAssignment_4 )? ) ;
    public final void rule__Schema__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1000:1: ( ( ( rule__Schema__PropAssignment_4 )? ) )
            // InternalEsper2Maude.g:1001:1: ( ( rule__Schema__PropAssignment_4 )? )
            {
            // InternalEsper2Maude.g:1001:1: ( ( rule__Schema__PropAssignment_4 )? )
            // InternalEsper2Maude.g:1002:2: ( rule__Schema__PropAssignment_4 )?
            {
             before(grammarAccess.getSchemaAccess().getPropAssignment_4()); 
            // InternalEsper2Maude.g:1003:2: ( rule__Schema__PropAssignment_4 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalEsper2Maude.g:1003:3: rule__Schema__PropAssignment_4
                    {
                    pushFollow(FOLLOW_2);
                    rule__Schema__PropAssignment_4();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSchemaAccess().getPropAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__4__Impl"


    // $ANTLR start "rule__Schema__Group__5"
    // InternalEsper2Maude.g:1011:1: rule__Schema__Group__5 : rule__Schema__Group__5__Impl rule__Schema__Group__6 ;
    public final void rule__Schema__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1015:1: ( rule__Schema__Group__5__Impl rule__Schema__Group__6 )
            // InternalEsper2Maude.g:1016:2: rule__Schema__Group__5__Impl rule__Schema__Group__6
            {
            pushFollow(FOLLOW_9);
            rule__Schema__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5"


    // $ANTLR start "rule__Schema__Group__5__Impl"
    // InternalEsper2Maude.g:1023:1: rule__Schema__Group__5__Impl : ( ( rule__Schema__Group_5__0 )* ) ;
    public final void rule__Schema__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1027:1: ( ( ( rule__Schema__Group_5__0 )* ) )
            // InternalEsper2Maude.g:1028:1: ( ( rule__Schema__Group_5__0 )* )
            {
            // InternalEsper2Maude.g:1028:1: ( ( rule__Schema__Group_5__0 )* )
            // InternalEsper2Maude.g:1029:2: ( rule__Schema__Group_5__0 )*
            {
             before(grammarAccess.getSchemaAccess().getGroup_5()); 
            // InternalEsper2Maude.g:1030:2: ( rule__Schema__Group_5__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==17) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalEsper2Maude.g:1030:3: rule__Schema__Group_5__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Schema__Group_5__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getSchemaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__5__Impl"


    // $ANTLR start "rule__Schema__Group__6"
    // InternalEsper2Maude.g:1038:1: rule__Schema__Group__6 : rule__Schema__Group__6__Impl ;
    public final void rule__Schema__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1042:1: ( rule__Schema__Group__6__Impl )
            // InternalEsper2Maude.g:1043:2: rule__Schema__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__6"


    // $ANTLR start "rule__Schema__Group__6__Impl"
    // InternalEsper2Maude.g:1049:1: rule__Schema__Group__6__Impl : ( ')' ) ;
    public final void rule__Schema__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1053:1: ( ( ')' ) )
            // InternalEsper2Maude.g:1054:1: ( ')' )
            {
            // InternalEsper2Maude.g:1054:1: ( ')' )
            // InternalEsper2Maude.g:1055:2: ')'
            {
             before(grammarAccess.getSchemaAccess().getRightParenthesisKeyword_6()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getRightParenthesisKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group__6__Impl"


    // $ANTLR start "rule__Schema__Group_5__0"
    // InternalEsper2Maude.g:1065:1: rule__Schema__Group_5__0 : rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 ;
    public final void rule__Schema__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1069:1: ( rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1 )
            // InternalEsper2Maude.g:1070:2: rule__Schema__Group_5__0__Impl rule__Schema__Group_5__1
            {
            pushFollow(FOLLOW_7);
            rule__Schema__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5__0"


    // $ANTLR start "rule__Schema__Group_5__0__Impl"
    // InternalEsper2Maude.g:1077:1: rule__Schema__Group_5__0__Impl : ( ',' ) ;
    public final void rule__Schema__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1081:1: ( ( ',' ) )
            // InternalEsper2Maude.g:1082:1: ( ',' )
            {
            // InternalEsper2Maude.g:1082:1: ( ',' )
            // InternalEsper2Maude.g:1083:2: ','
            {
             before(grammarAccess.getSchemaAccess().getCommaKeyword_5_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getCommaKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5__0__Impl"


    // $ANTLR start "rule__Schema__Group_5__1"
    // InternalEsper2Maude.g:1092:1: rule__Schema__Group_5__1 : rule__Schema__Group_5__1__Impl ;
    public final void rule__Schema__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1096:1: ( rule__Schema__Group_5__1__Impl )
            // InternalEsper2Maude.g:1097:2: rule__Schema__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Schema__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5__1"


    // $ANTLR start "rule__Schema__Group_5__1__Impl"
    // InternalEsper2Maude.g:1103:1: rule__Schema__Group_5__1__Impl : ( ( rule__Schema__PropsAssignment_5_1 ) ) ;
    public final void rule__Schema__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1107:1: ( ( ( rule__Schema__PropsAssignment_5_1 ) ) )
            // InternalEsper2Maude.g:1108:1: ( ( rule__Schema__PropsAssignment_5_1 ) )
            {
            // InternalEsper2Maude.g:1108:1: ( ( rule__Schema__PropsAssignment_5_1 ) )
            // InternalEsper2Maude.g:1109:2: ( rule__Schema__PropsAssignment_5_1 )
            {
             before(grammarAccess.getSchemaAccess().getPropsAssignment_5_1()); 
            // InternalEsper2Maude.g:1110:2: ( rule__Schema__PropsAssignment_5_1 )
            // InternalEsper2Maude.g:1110:3: rule__Schema__PropsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__Schema__PropsAssignment_5_1();

            state._fsp--;


            }

             after(grammarAccess.getSchemaAccess().getPropsAssignment_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__Group_5__1__Impl"


    // $ANTLR start "rule__EventProperty__Group__0"
    // InternalEsper2Maude.g:1119:1: rule__EventProperty__Group__0 : rule__EventProperty__Group__0__Impl rule__EventProperty__Group__1 ;
    public final void rule__EventProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1123:1: ( rule__EventProperty__Group__0__Impl rule__EventProperty__Group__1 )
            // InternalEsper2Maude.g:1124:2: rule__EventProperty__Group__0__Impl rule__EventProperty__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__EventProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EventProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__Group__0"


    // $ANTLR start "rule__EventProperty__Group__0__Impl"
    // InternalEsper2Maude.g:1131:1: rule__EventProperty__Group__0__Impl : ( ( rule__EventProperty__NameAssignment_0 ) ) ;
    public final void rule__EventProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1135:1: ( ( ( rule__EventProperty__NameAssignment_0 ) ) )
            // InternalEsper2Maude.g:1136:1: ( ( rule__EventProperty__NameAssignment_0 ) )
            {
            // InternalEsper2Maude.g:1136:1: ( ( rule__EventProperty__NameAssignment_0 ) )
            // InternalEsper2Maude.g:1137:2: ( rule__EventProperty__NameAssignment_0 )
            {
             before(grammarAccess.getEventPropertyAccess().getNameAssignment_0()); 
            // InternalEsper2Maude.g:1138:2: ( rule__EventProperty__NameAssignment_0 )
            // InternalEsper2Maude.g:1138:3: rule__EventProperty__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__EventProperty__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getEventPropertyAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__Group__0__Impl"


    // $ANTLR start "rule__EventProperty__Group__1"
    // InternalEsper2Maude.g:1146:1: rule__EventProperty__Group__1 : rule__EventProperty__Group__1__Impl ;
    public final void rule__EventProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1150:1: ( rule__EventProperty__Group__1__Impl )
            // InternalEsper2Maude.g:1151:2: rule__EventProperty__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EventProperty__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__Group__1"


    // $ANTLR start "rule__EventProperty__Group__1__Impl"
    // InternalEsper2Maude.g:1157:1: rule__EventProperty__Group__1__Impl : ( ( rule__EventProperty__TypeAssignment_1 ) ) ;
    public final void rule__EventProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1161:1: ( ( ( rule__EventProperty__TypeAssignment_1 ) ) )
            // InternalEsper2Maude.g:1162:1: ( ( rule__EventProperty__TypeAssignment_1 ) )
            {
            // InternalEsper2Maude.g:1162:1: ( ( rule__EventProperty__TypeAssignment_1 ) )
            // InternalEsper2Maude.g:1163:2: ( rule__EventProperty__TypeAssignment_1 )
            {
             before(grammarAccess.getEventPropertyAccess().getTypeAssignment_1()); 
            // InternalEsper2Maude.g:1164:2: ( rule__EventProperty__TypeAssignment_1 )
            // InternalEsper2Maude.g:1164:3: rule__EventProperty__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__EventProperty__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getEventPropertyAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalEsper2Maude.g:1173:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1177:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalEsper2Maude.g:1178:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0"


    // $ANTLR start "rule__Pattern__Group__0__Impl"
    // InternalEsper2Maude.g:1185:1: rule__Pattern__Group__0__Impl : ( '@Name' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1189:1: ( ( '@Name' ) )
            // InternalEsper2Maude.g:1190:1: ( '@Name' )
            {
            // InternalEsper2Maude.g:1190:1: ( '@Name' )
            // InternalEsper2Maude.g:1191:2: '@Name'
            {
             before(grammarAccess.getPatternAccess().getNameKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNameKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__0__Impl"


    // $ANTLR start "rule__Pattern__Group__1"
    // InternalEsper2Maude.g:1200:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1204:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalEsper2Maude.g:1205:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Pattern__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1"


    // $ANTLR start "rule__Pattern__Group__1__Impl"
    // InternalEsper2Maude.g:1212:1: rule__Pattern__Group__1__Impl : ( '(' ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1216:1: ( ( '(' ) )
            // InternalEsper2Maude.g:1217:1: ( '(' )
            {
            // InternalEsper2Maude.g:1217:1: ( '(' )
            // InternalEsper2Maude.g:1218:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__1__Impl"


    // $ANTLR start "rule__Pattern__Group__2"
    // InternalEsper2Maude.g:1227:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1231:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalEsper2Maude.g:1232:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Pattern__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2"


    // $ANTLR start "rule__Pattern__Group__2__Impl"
    // InternalEsper2Maude.g:1239:1: rule__Pattern__Group__2__Impl : ( ( rule__Pattern__NameAssignment_2 ) ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1243:1: ( ( ( rule__Pattern__NameAssignment_2 ) ) )
            // InternalEsper2Maude.g:1244:1: ( ( rule__Pattern__NameAssignment_2 ) )
            {
            // InternalEsper2Maude.g:1244:1: ( ( rule__Pattern__NameAssignment_2 ) )
            // InternalEsper2Maude.g:1245:2: ( rule__Pattern__NameAssignment_2 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_2()); 
            // InternalEsper2Maude.g:1246:2: ( rule__Pattern__NameAssignment_2 )
            // InternalEsper2Maude.g:1246:3: rule__Pattern__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__2__Impl"


    // $ANTLR start "rule__Pattern__Group__3"
    // InternalEsper2Maude.g:1254:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1258:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalEsper2Maude.g:1259:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__Pattern__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3"


    // $ANTLR start "rule__Pattern__Group__3__Impl"
    // InternalEsper2Maude.g:1266:1: rule__Pattern__Group__3__Impl : ( ')' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1270:1: ( ( ')' ) )
            // InternalEsper2Maude.g:1271:1: ( ')' )
            {
            // InternalEsper2Maude.g:1271:1: ( ')' )
            // InternalEsper2Maude.g:1272:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__3__Impl"


    // $ANTLR start "rule__Pattern__Group__4"
    // InternalEsper2Maude.g:1281:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1285:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalEsper2Maude.g:1286:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Pattern__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4"


    // $ANTLR start "rule__Pattern__Group__4__Impl"
    // InternalEsper2Maude.g:1293:1: rule__Pattern__Group__4__Impl : ( '@Priority' ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1297:1: ( ( '@Priority' ) )
            // InternalEsper2Maude.g:1298:1: ( '@Priority' )
            {
            // InternalEsper2Maude.g:1298:1: ( '@Priority' )
            // InternalEsper2Maude.g:1299:2: '@Priority'
            {
             before(grammarAccess.getPatternAccess().getPriorityKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPriorityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__4__Impl"


    // $ANTLR start "rule__Pattern__Group__5"
    // InternalEsper2Maude.g:1308:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1312:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalEsper2Maude.g:1313:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_15);
            rule__Pattern__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5"


    // $ANTLR start "rule__Pattern__Group__5__Impl"
    // InternalEsper2Maude.g:1320:1: rule__Pattern__Group__5__Impl : ( '(' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1324:1: ( ( '(' ) )
            // InternalEsper2Maude.g:1325:1: ( '(' )
            {
            // InternalEsper2Maude.g:1325:1: ( '(' )
            // InternalEsper2Maude.g:1326:2: '('
            {
             before(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_5()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__5__Impl"


    // $ANTLR start "rule__Pattern__Group__6"
    // InternalEsper2Maude.g:1335:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1339:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalEsper2Maude.g:1340:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_13);
            rule__Pattern__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6"


    // $ANTLR start "rule__Pattern__Group__6__Impl"
    // InternalEsper2Maude.g:1347:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__NumAssignment_6 ) ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1351:1: ( ( ( rule__Pattern__NumAssignment_6 ) ) )
            // InternalEsper2Maude.g:1352:1: ( ( rule__Pattern__NumAssignment_6 ) )
            {
            // InternalEsper2Maude.g:1352:1: ( ( rule__Pattern__NumAssignment_6 ) )
            // InternalEsper2Maude.g:1353:2: ( rule__Pattern__NumAssignment_6 )
            {
             before(grammarAccess.getPatternAccess().getNumAssignment_6()); 
            // InternalEsper2Maude.g:1354:2: ( rule__Pattern__NumAssignment_6 )
            // InternalEsper2Maude.g:1354:3: rule__Pattern__NumAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NumAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNumAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__6__Impl"


    // $ANTLR start "rule__Pattern__Group__7"
    // InternalEsper2Maude.g:1362:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1366:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalEsper2Maude.g:1367:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_16);
            rule__Pattern__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7"


    // $ANTLR start "rule__Pattern__Group__7__Impl"
    // InternalEsper2Maude.g:1374:1: rule__Pattern__Group__7__Impl : ( ')' ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1378:1: ( ( ')' ) )
            // InternalEsper2Maude.g:1379:1: ( ')' )
            {
            // InternalEsper2Maude.g:1379:1: ( ')' )
            // InternalEsper2Maude.g:1380:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_7()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__7__Impl"


    // $ANTLR start "rule__Pattern__Group__8"
    // InternalEsper2Maude.g:1389:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl rule__Pattern__Group__9 ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1393:1: ( rule__Pattern__Group__8__Impl rule__Pattern__Group__9 )
            // InternalEsper2Maude.g:1394:2: rule__Pattern__Group__8__Impl rule__Pattern__Group__9
            {
            pushFollow(FOLLOW_17);
            rule__Pattern__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8"


    // $ANTLR start "rule__Pattern__Group__8__Impl"
    // InternalEsper2Maude.g:1401:1: rule__Pattern__Group__8__Impl : ( 'insert' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1405:1: ( ( 'insert' ) )
            // InternalEsper2Maude.g:1406:1: ( 'insert' )
            {
            // InternalEsper2Maude.g:1406:1: ( 'insert' )
            // InternalEsper2Maude.g:1407:2: 'insert'
            {
             before(grammarAccess.getPatternAccess().getInsertKeyword_8()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getInsertKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__8__Impl"


    // $ANTLR start "rule__Pattern__Group__9"
    // InternalEsper2Maude.g:1416:1: rule__Pattern__Group__9 : rule__Pattern__Group__9__Impl rule__Pattern__Group__10 ;
    public final void rule__Pattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1420:1: ( rule__Pattern__Group__9__Impl rule__Pattern__Group__10 )
            // InternalEsper2Maude.g:1421:2: rule__Pattern__Group__9__Impl rule__Pattern__Group__10
            {
            pushFollow(FOLLOW_7);
            rule__Pattern__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__9"


    // $ANTLR start "rule__Pattern__Group__9__Impl"
    // InternalEsper2Maude.g:1428:1: rule__Pattern__Group__9__Impl : ( 'into' ) ;
    public final void rule__Pattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1432:1: ( ( 'into' ) )
            // InternalEsper2Maude.g:1433:1: ( 'into' )
            {
            // InternalEsper2Maude.g:1433:1: ( 'into' )
            // InternalEsper2Maude.g:1434:2: 'into'
            {
             before(grammarAccess.getPatternAccess().getIntoKeyword_9()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getIntoKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__9__Impl"


    // $ANTLR start "rule__Pattern__Group__10"
    // InternalEsper2Maude.g:1443:1: rule__Pattern__Group__10 : rule__Pattern__Group__10__Impl rule__Pattern__Group__11 ;
    public final void rule__Pattern__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1447:1: ( rule__Pattern__Group__10__Impl rule__Pattern__Group__11 )
            // InternalEsper2Maude.g:1448:2: rule__Pattern__Group__10__Impl rule__Pattern__Group__11
            {
            pushFollow(FOLLOW_18);
            rule__Pattern__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__10"


    // $ANTLR start "rule__Pattern__Group__10__Impl"
    // InternalEsper2Maude.g:1455:1: rule__Pattern__Group__10__Impl : ( ( rule__Pattern__EventAssignment_10 ) ) ;
    public final void rule__Pattern__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1459:1: ( ( ( rule__Pattern__EventAssignment_10 ) ) )
            // InternalEsper2Maude.g:1460:1: ( ( rule__Pattern__EventAssignment_10 ) )
            {
            // InternalEsper2Maude.g:1460:1: ( ( rule__Pattern__EventAssignment_10 ) )
            // InternalEsper2Maude.g:1461:2: ( rule__Pattern__EventAssignment_10 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_10()); 
            // InternalEsper2Maude.g:1462:2: ( rule__Pattern__EventAssignment_10 )
            // InternalEsper2Maude.g:1462:3: rule__Pattern__EventAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__10__Impl"


    // $ANTLR start "rule__Pattern__Group__11"
    // InternalEsper2Maude.g:1470:1: rule__Pattern__Group__11 : rule__Pattern__Group__11__Impl rule__Pattern__Group__12 ;
    public final void rule__Pattern__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1474:1: ( rule__Pattern__Group__11__Impl rule__Pattern__Group__12 )
            // InternalEsper2Maude.g:1475:2: rule__Pattern__Group__11__Impl rule__Pattern__Group__12
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__11"


    // $ANTLR start "rule__Pattern__Group__11__Impl"
    // InternalEsper2Maude.g:1482:1: rule__Pattern__Group__11__Impl : ( 'select' ) ;
    public final void rule__Pattern__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1486:1: ( ( 'select' ) )
            // InternalEsper2Maude.g:1487:1: ( 'select' )
            {
            // InternalEsper2Maude.g:1487:1: ( 'select' )
            // InternalEsper2Maude.g:1488:2: 'select'
            {
             before(grammarAccess.getPatternAccess().getSelectKeyword_11()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getSelectKeyword_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__11__Impl"


    // $ANTLR start "rule__Pattern__Group__12"
    // InternalEsper2Maude.g:1497:1: rule__Pattern__Group__12 : rule__Pattern__Group__12__Impl rule__Pattern__Group__13 ;
    public final void rule__Pattern__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1501:1: ( rule__Pattern__Group__12__Impl rule__Pattern__Group__13 )
            // InternalEsper2Maude.g:1502:2: rule__Pattern__Group__12__Impl rule__Pattern__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Pattern__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__12"


    // $ANTLR start "rule__Pattern__Group__12__Impl"
    // InternalEsper2Maude.g:1509:1: rule__Pattern__Group__12__Impl : ( ( rule__Pattern__SelectEntriesAssignment_12 )* ) ;
    public final void rule__Pattern__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1513:1: ( ( ( rule__Pattern__SelectEntriesAssignment_12 )* ) )
            // InternalEsper2Maude.g:1514:1: ( ( rule__Pattern__SelectEntriesAssignment_12 )* )
            {
            // InternalEsper2Maude.g:1514:1: ( ( rule__Pattern__SelectEntriesAssignment_12 )* )
            // InternalEsper2Maude.g:1515:2: ( rule__Pattern__SelectEntriesAssignment_12 )*
            {
             before(grammarAccess.getPatternAccess().getSelectEntriesAssignment_12()); 
            // InternalEsper2Maude.g:1516:2: ( rule__Pattern__SelectEntriesAssignment_12 )*
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // InternalEsper2Maude.g:1516:3: rule__Pattern__SelectEntriesAssignment_12
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__Pattern__SelectEntriesAssignment_12();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getSelectEntriesAssignment_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__12__Impl"


    // $ANTLR start "rule__Pattern__Group__13"
    // InternalEsper2Maude.g:1524:1: rule__Pattern__Group__13 : rule__Pattern__Group__13__Impl rule__Pattern__Group__14 ;
    public final void rule__Pattern__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1528:1: ( rule__Pattern__Group__13__Impl rule__Pattern__Group__14 )
            // InternalEsper2Maude.g:1529:2: rule__Pattern__Group__13__Impl rule__Pattern__Group__14
            {
            pushFollow(FOLLOW_21);
            rule__Pattern__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__13"


    // $ANTLR start "rule__Pattern__Group__13__Impl"
    // InternalEsper2Maude.g:1536:1: rule__Pattern__Group__13__Impl : ( ( rule__Pattern__SelectEntryAssignment_13 ) ) ;
    public final void rule__Pattern__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1540:1: ( ( ( rule__Pattern__SelectEntryAssignment_13 ) ) )
            // InternalEsper2Maude.g:1541:1: ( ( rule__Pattern__SelectEntryAssignment_13 ) )
            {
            // InternalEsper2Maude.g:1541:1: ( ( rule__Pattern__SelectEntryAssignment_13 ) )
            // InternalEsper2Maude.g:1542:2: ( rule__Pattern__SelectEntryAssignment_13 )
            {
             before(grammarAccess.getPatternAccess().getSelectEntryAssignment_13()); 
            // InternalEsper2Maude.g:1543:2: ( rule__Pattern__SelectEntryAssignment_13 )
            // InternalEsper2Maude.g:1543:3: rule__Pattern__SelectEntryAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__SelectEntryAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getSelectEntryAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__13__Impl"


    // $ANTLR start "rule__Pattern__Group__14"
    // InternalEsper2Maude.g:1551:1: rule__Pattern__Group__14 : rule__Pattern__Group__14__Impl rule__Pattern__Group__15 ;
    public final void rule__Pattern__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1555:1: ( rule__Pattern__Group__14__Impl rule__Pattern__Group__15 )
            // InternalEsper2Maude.g:1556:2: rule__Pattern__Group__14__Impl rule__Pattern__Group__15
            {
            pushFollow(FOLLOW_22);
            rule__Pattern__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__14"


    // $ANTLR start "rule__Pattern__Group__14__Impl"
    // InternalEsper2Maude.g:1563:1: rule__Pattern__Group__14__Impl : ( 'from' ) ;
    public final void rule__Pattern__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1567:1: ( ( 'from' ) )
            // InternalEsper2Maude.g:1568:1: ( 'from' )
            {
            // InternalEsper2Maude.g:1568:1: ( 'from' )
            // InternalEsper2Maude.g:1569:2: 'from'
            {
             before(grammarAccess.getPatternAccess().getFromKeyword_14()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getFromKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__14__Impl"


    // $ANTLR start "rule__Pattern__Group__15"
    // InternalEsper2Maude.g:1578:1: rule__Pattern__Group__15 : rule__Pattern__Group__15__Impl rule__Pattern__Group__16 ;
    public final void rule__Pattern__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1582:1: ( rule__Pattern__Group__15__Impl rule__Pattern__Group__16 )
            // InternalEsper2Maude.g:1583:2: rule__Pattern__Group__15__Impl rule__Pattern__Group__16
            {
            pushFollow(FOLLOW_23);
            rule__Pattern__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__15"


    // $ANTLR start "rule__Pattern__Group__15__Impl"
    // InternalEsper2Maude.g:1590:1: rule__Pattern__Group__15__Impl : ( 'pattern' ) ;
    public final void rule__Pattern__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1594:1: ( ( 'pattern' ) )
            // InternalEsper2Maude.g:1595:1: ( 'pattern' )
            {
            // InternalEsper2Maude.g:1595:1: ( 'pattern' )
            // InternalEsper2Maude.g:1596:2: 'pattern'
            {
             before(grammarAccess.getPatternAccess().getPatternKeyword_15()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getPatternKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__15__Impl"


    // $ANTLR start "rule__Pattern__Group__16"
    // InternalEsper2Maude.g:1605:1: rule__Pattern__Group__16 : rule__Pattern__Group__16__Impl rule__Pattern__Group__17 ;
    public final void rule__Pattern__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1609:1: ( rule__Pattern__Group__16__Impl rule__Pattern__Group__17 )
            // InternalEsper2Maude.g:1610:2: rule__Pattern__Group__16__Impl rule__Pattern__Group__17
            {
            pushFollow(FOLLOW_24);
            rule__Pattern__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__16"


    // $ANTLR start "rule__Pattern__Group__16__Impl"
    // InternalEsper2Maude.g:1617:1: rule__Pattern__Group__16__Impl : ( '[' ) ;
    public final void rule__Pattern__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1621:1: ( ( '[' ) )
            // InternalEsper2Maude.g:1622:1: ( '[' )
            {
            // InternalEsper2Maude.g:1622:1: ( '[' )
            // InternalEsper2Maude.g:1623:2: '['
            {
             before(grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_16()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__16__Impl"


    // $ANTLR start "rule__Pattern__Group__17"
    // InternalEsper2Maude.g:1632:1: rule__Pattern__Group__17 : rule__Pattern__Group__17__Impl rule__Pattern__Group__18 ;
    public final void rule__Pattern__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1636:1: ( rule__Pattern__Group__17__Impl rule__Pattern__Group__18 )
            // InternalEsper2Maude.g:1637:2: rule__Pattern__Group__17__Impl rule__Pattern__Group__18
            {
            pushFollow(FOLLOW_25);
            rule__Pattern__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__17"


    // $ANTLR start "rule__Pattern__Group__17__Impl"
    // InternalEsper2Maude.g:1644:1: rule__Pattern__Group__17__Impl : ( ( rule__Pattern__FromFilterAssignment_17 ) ) ;
    public final void rule__Pattern__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1648:1: ( ( ( rule__Pattern__FromFilterAssignment_17 ) ) )
            // InternalEsper2Maude.g:1649:1: ( ( rule__Pattern__FromFilterAssignment_17 ) )
            {
            // InternalEsper2Maude.g:1649:1: ( ( rule__Pattern__FromFilterAssignment_17 ) )
            // InternalEsper2Maude.g:1650:2: ( rule__Pattern__FromFilterAssignment_17 )
            {
             before(grammarAccess.getPatternAccess().getFromFilterAssignment_17()); 
            // InternalEsper2Maude.g:1651:2: ( rule__Pattern__FromFilterAssignment_17 )
            // InternalEsper2Maude.g:1651:3: rule__Pattern__FromFilterAssignment_17
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__FromFilterAssignment_17();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getFromFilterAssignment_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__17__Impl"


    // $ANTLR start "rule__Pattern__Group__18"
    // InternalEsper2Maude.g:1659:1: rule__Pattern__Group__18 : rule__Pattern__Group__18__Impl rule__Pattern__Group__19 ;
    public final void rule__Pattern__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1663:1: ( rule__Pattern__Group__18__Impl rule__Pattern__Group__19 )
            // InternalEsper2Maude.g:1664:2: rule__Pattern__Group__18__Impl rule__Pattern__Group__19
            {
            pushFollow(FOLLOW_26);
            rule__Pattern__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__18"


    // $ANTLR start "rule__Pattern__Group__18__Impl"
    // InternalEsper2Maude.g:1671:1: rule__Pattern__Group__18__Impl : ( ']' ) ;
    public final void rule__Pattern__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1675:1: ( ( ']' ) )
            // InternalEsper2Maude.g:1676:1: ( ']' )
            {
            // InternalEsper2Maude.g:1676:1: ( ']' )
            // InternalEsper2Maude.g:1677:2: ']'
            {
             before(grammarAccess.getPatternAccess().getRightSquareBracketKeyword_18()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightSquareBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__18__Impl"


    // $ANTLR start "rule__Pattern__Group__19"
    // InternalEsper2Maude.g:1686:1: rule__Pattern__Group__19 : rule__Pattern__Group__19__Impl ;
    public final void rule__Pattern__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1690:1: ( rule__Pattern__Group__19__Impl )
            // InternalEsper2Maude.g:1691:2: rule__Pattern__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__19"


    // $ANTLR start "rule__Pattern__Group__19__Impl"
    // InternalEsper2Maude.g:1697:1: rule__Pattern__Group__19__Impl : ( ( rule__Pattern__Group_19__0 )? ) ;
    public final void rule__Pattern__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1701:1: ( ( ( rule__Pattern__Group_19__0 )? ) )
            // InternalEsper2Maude.g:1702:1: ( ( rule__Pattern__Group_19__0 )? )
            {
            // InternalEsper2Maude.g:1702:1: ( ( rule__Pattern__Group_19__0 )? )
            // InternalEsper2Maude.g:1703:2: ( rule__Pattern__Group_19__0 )?
            {
             before(grammarAccess.getPatternAccess().getGroup_19()); 
            // InternalEsper2Maude.g:1704:2: ( rule__Pattern__Group_19__0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==27) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEsper2Maude.g:1704:3: rule__Pattern__Group_19__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Pattern__Group_19__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroup_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group__19__Impl"


    // $ANTLR start "rule__Pattern__Group_19__0"
    // InternalEsper2Maude.g:1713:1: rule__Pattern__Group_19__0 : rule__Pattern__Group_19__0__Impl rule__Pattern__Group_19__1 ;
    public final void rule__Pattern__Group_19__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1717:1: ( rule__Pattern__Group_19__0__Impl rule__Pattern__Group_19__1 )
            // InternalEsper2Maude.g:1718:2: rule__Pattern__Group_19__0__Impl rule__Pattern__Group_19__1
            {
            pushFollow(FOLLOW_27);
            rule__Pattern__Group_19__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Pattern__Group_19__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_19__0"


    // $ANTLR start "rule__Pattern__Group_19__0__Impl"
    // InternalEsper2Maude.g:1725:1: rule__Pattern__Group_19__0__Impl : ( '.' ) ;
    public final void rule__Pattern__Group_19__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1729:1: ( ( '.' ) )
            // InternalEsper2Maude.g:1730:1: ( '.' )
            {
            // InternalEsper2Maude.g:1730:1: ( '.' )
            // InternalEsper2Maude.g:1731:2: '.'
            {
             before(grammarAccess.getPatternAccess().getFullStopKeyword_19_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getFullStopKeyword_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_19__0__Impl"


    // $ANTLR start "rule__Pattern__Group_19__1"
    // InternalEsper2Maude.g:1740:1: rule__Pattern__Group_19__1 : rule__Pattern__Group_19__1__Impl ;
    public final void rule__Pattern__Group_19__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1744:1: ( rule__Pattern__Group_19__1__Impl )
            // InternalEsper2Maude.g:1745:2: rule__Pattern__Group_19__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group_19__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_19__1"


    // $ANTLR start "rule__Pattern__Group_19__1__Impl"
    // InternalEsper2Maude.g:1751:1: rule__Pattern__Group_19__1__Impl : ( ( rule__Pattern__WinAssignment_19_1 ) ) ;
    public final void rule__Pattern__Group_19__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1755:1: ( ( ( rule__Pattern__WinAssignment_19_1 ) ) )
            // InternalEsper2Maude.g:1756:1: ( ( rule__Pattern__WinAssignment_19_1 ) )
            {
            // InternalEsper2Maude.g:1756:1: ( ( rule__Pattern__WinAssignment_19_1 ) )
            // InternalEsper2Maude.g:1757:2: ( rule__Pattern__WinAssignment_19_1 )
            {
             before(grammarAccess.getPatternAccess().getWinAssignment_19_1()); 
            // InternalEsper2Maude.g:1758:2: ( rule__Pattern__WinAssignment_19_1 )
            // InternalEsper2Maude.g:1758:3: rule__Pattern__WinAssignment_19_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__WinAssignment_19_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getWinAssignment_19_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__Group_19__1__Impl"


    // $ANTLR start "rule__Window__Group_0__0"
    // InternalEsper2Maude.g:1767:1: rule__Window__Group_0__0 : rule__Window__Group_0__0__Impl rule__Window__Group_0__1 ;
    public final void rule__Window__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1771:1: ( rule__Window__Group_0__0__Impl rule__Window__Group_0__1 )
            // InternalEsper2Maude.g:1772:2: rule__Window__Group_0__0__Impl rule__Window__Group_0__1
            {
            pushFollow(FOLLOW_8);
            rule__Window__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__0"


    // $ANTLR start "rule__Window__Group_0__0__Impl"
    // InternalEsper2Maude.g:1779:1: rule__Window__Group_0__0__Impl : ( ( rule__Window__TypeTimeAssignment_0_0 ) ) ;
    public final void rule__Window__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1783:1: ( ( ( rule__Window__TypeTimeAssignment_0_0 ) ) )
            // InternalEsper2Maude.g:1784:1: ( ( rule__Window__TypeTimeAssignment_0_0 ) )
            {
            // InternalEsper2Maude.g:1784:1: ( ( rule__Window__TypeTimeAssignment_0_0 ) )
            // InternalEsper2Maude.g:1785:2: ( rule__Window__TypeTimeAssignment_0_0 )
            {
             before(grammarAccess.getWindowAccess().getTypeTimeAssignment_0_0()); 
            // InternalEsper2Maude.g:1786:2: ( rule__Window__TypeTimeAssignment_0_0 )
            // InternalEsper2Maude.g:1786:3: rule__Window__TypeTimeAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Window__TypeTimeAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getTypeTimeAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__0__Impl"


    // $ANTLR start "rule__Window__Group_0__1"
    // InternalEsper2Maude.g:1794:1: rule__Window__Group_0__1 : rule__Window__Group_0__1__Impl rule__Window__Group_0__2 ;
    public final void rule__Window__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1798:1: ( rule__Window__Group_0__1__Impl rule__Window__Group_0__2 )
            // InternalEsper2Maude.g:1799:2: rule__Window__Group_0__1__Impl rule__Window__Group_0__2
            {
            pushFollow(FOLLOW_15);
            rule__Window__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__1"


    // $ANTLR start "rule__Window__Group_0__1__Impl"
    // InternalEsper2Maude.g:1806:1: rule__Window__Group_0__1__Impl : ( '(' ) ;
    public final void rule__Window__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1810:1: ( ( '(' ) )
            // InternalEsper2Maude.g:1811:1: ( '(' )
            {
            // InternalEsper2Maude.g:1811:1: ( '(' )
            // InternalEsper2Maude.g:1812:2: '('
            {
             before(grammarAccess.getWindowAccess().getLeftParenthesisKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftParenthesisKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__1__Impl"


    // $ANTLR start "rule__Window__Group_0__2"
    // InternalEsper2Maude.g:1821:1: rule__Window__Group_0__2 : rule__Window__Group_0__2__Impl rule__Window__Group_0__3 ;
    public final void rule__Window__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1825:1: ( rule__Window__Group_0__2__Impl rule__Window__Group_0__3 )
            // InternalEsper2Maude.g:1826:2: rule__Window__Group_0__2__Impl rule__Window__Group_0__3
            {
            pushFollow(FOLLOW_28);
            rule__Window__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__2"


    // $ANTLR start "rule__Window__Group_0__2__Impl"
    // InternalEsper2Maude.g:1833:1: rule__Window__Group_0__2__Impl : ( ( rule__Window__NumAssignment_0_2 ) ) ;
    public final void rule__Window__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1837:1: ( ( ( rule__Window__NumAssignment_0_2 ) ) )
            // InternalEsper2Maude.g:1838:1: ( ( rule__Window__NumAssignment_0_2 ) )
            {
            // InternalEsper2Maude.g:1838:1: ( ( rule__Window__NumAssignment_0_2 ) )
            // InternalEsper2Maude.g:1839:2: ( rule__Window__NumAssignment_0_2 )
            {
             before(grammarAccess.getWindowAccess().getNumAssignment_0_2()); 
            // InternalEsper2Maude.g:1840:2: ( rule__Window__NumAssignment_0_2 )
            // InternalEsper2Maude.g:1840:3: rule__Window__NumAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Window__NumAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNumAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__2__Impl"


    // $ANTLR start "rule__Window__Group_0__3"
    // InternalEsper2Maude.g:1848:1: rule__Window__Group_0__3 : rule__Window__Group_0__3__Impl rule__Window__Group_0__4 ;
    public final void rule__Window__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1852:1: ( rule__Window__Group_0__3__Impl rule__Window__Group_0__4 )
            // InternalEsper2Maude.g:1853:2: rule__Window__Group_0__3__Impl rule__Window__Group_0__4
            {
            pushFollow(FOLLOW_13);
            rule__Window__Group_0__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_0__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__3"


    // $ANTLR start "rule__Window__Group_0__3__Impl"
    // InternalEsper2Maude.g:1860:1: rule__Window__Group_0__3__Impl : ( 'milliseconds' ) ;
    public final void rule__Window__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1864:1: ( ( 'milliseconds' ) )
            // InternalEsper2Maude.g:1865:1: ( 'milliseconds' )
            {
            // InternalEsper2Maude.g:1865:1: ( 'milliseconds' )
            // InternalEsper2Maude.g:1866:2: 'milliseconds'
            {
             before(grammarAccess.getWindowAccess().getMillisecondsKeyword_0_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getMillisecondsKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__3__Impl"


    // $ANTLR start "rule__Window__Group_0__4"
    // InternalEsper2Maude.g:1875:1: rule__Window__Group_0__4 : rule__Window__Group_0__4__Impl ;
    public final void rule__Window__Group_0__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1879:1: ( rule__Window__Group_0__4__Impl )
            // InternalEsper2Maude.g:1880:2: rule__Window__Group_0__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_0__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__4"


    // $ANTLR start "rule__Window__Group_0__4__Impl"
    // InternalEsper2Maude.g:1886:1: rule__Window__Group_0__4__Impl : ( ')' ) ;
    public final void rule__Window__Group_0__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1890:1: ( ( ')' ) )
            // InternalEsper2Maude.g:1891:1: ( ')' )
            {
            // InternalEsper2Maude.g:1891:1: ( ')' )
            // InternalEsper2Maude.g:1892:2: ')'
            {
             before(grammarAccess.getWindowAccess().getRightParenthesisKeyword_0_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightParenthesisKeyword_0_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_0__4__Impl"


    // $ANTLR start "rule__Window__Group_1__0"
    // InternalEsper2Maude.g:1902:1: rule__Window__Group_1__0 : rule__Window__Group_1__0__Impl rule__Window__Group_1__1 ;
    public final void rule__Window__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1906:1: ( rule__Window__Group_1__0__Impl rule__Window__Group_1__1 )
            // InternalEsper2Maude.g:1907:2: rule__Window__Group_1__0__Impl rule__Window__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Window__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__0"


    // $ANTLR start "rule__Window__Group_1__0__Impl"
    // InternalEsper2Maude.g:1914:1: rule__Window__Group_1__0__Impl : ( ( rule__Window__TypeBatchAssignment_1_0 ) ) ;
    public final void rule__Window__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1918:1: ( ( ( rule__Window__TypeBatchAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:1919:1: ( ( rule__Window__TypeBatchAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:1919:1: ( ( rule__Window__TypeBatchAssignment_1_0 ) )
            // InternalEsper2Maude.g:1920:2: ( rule__Window__TypeBatchAssignment_1_0 )
            {
             before(grammarAccess.getWindowAccess().getTypeBatchAssignment_1_0()); 
            // InternalEsper2Maude.g:1921:2: ( rule__Window__TypeBatchAssignment_1_0 )
            // InternalEsper2Maude.g:1921:3: rule__Window__TypeBatchAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Window__TypeBatchAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getTypeBatchAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__0__Impl"


    // $ANTLR start "rule__Window__Group_1__1"
    // InternalEsper2Maude.g:1929:1: rule__Window__Group_1__1 : rule__Window__Group_1__1__Impl rule__Window__Group_1__2 ;
    public final void rule__Window__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1933:1: ( rule__Window__Group_1__1__Impl rule__Window__Group_1__2 )
            // InternalEsper2Maude.g:1934:2: rule__Window__Group_1__1__Impl rule__Window__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__Window__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__1"


    // $ANTLR start "rule__Window__Group_1__1__Impl"
    // InternalEsper2Maude.g:1941:1: rule__Window__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Window__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1945:1: ( ( '(' ) )
            // InternalEsper2Maude.g:1946:1: ( '(' )
            {
            // InternalEsper2Maude.g:1946:1: ( '(' )
            // InternalEsper2Maude.g:1947:2: '('
            {
             before(grammarAccess.getWindowAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__1__Impl"


    // $ANTLR start "rule__Window__Group_1__2"
    // InternalEsper2Maude.g:1956:1: rule__Window__Group_1__2 : rule__Window__Group_1__2__Impl rule__Window__Group_1__3 ;
    public final void rule__Window__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1960:1: ( rule__Window__Group_1__2__Impl rule__Window__Group_1__3 )
            // InternalEsper2Maude.g:1961:2: rule__Window__Group_1__2__Impl rule__Window__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__Window__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__2"


    // $ANTLR start "rule__Window__Group_1__2__Impl"
    // InternalEsper2Maude.g:1968:1: rule__Window__Group_1__2__Impl : ( ( rule__Window__NumAssignment_1_2 ) ) ;
    public final void rule__Window__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1972:1: ( ( ( rule__Window__NumAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:1973:1: ( ( rule__Window__NumAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:1973:1: ( ( rule__Window__NumAssignment_1_2 ) )
            // InternalEsper2Maude.g:1974:2: ( rule__Window__NumAssignment_1_2 )
            {
             before(grammarAccess.getWindowAccess().getNumAssignment_1_2()); 
            // InternalEsper2Maude.g:1975:2: ( rule__Window__NumAssignment_1_2 )
            // InternalEsper2Maude.g:1975:3: rule__Window__NumAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Window__NumAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWindowAccess().getNumAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__2__Impl"


    // $ANTLR start "rule__Window__Group_1__3"
    // InternalEsper2Maude.g:1983:1: rule__Window__Group_1__3 : rule__Window__Group_1__3__Impl rule__Window__Group_1__4 ;
    public final void rule__Window__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1987:1: ( rule__Window__Group_1__3__Impl rule__Window__Group_1__4 )
            // InternalEsper2Maude.g:1988:2: rule__Window__Group_1__3__Impl rule__Window__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__Window__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Window__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__3"


    // $ANTLR start "rule__Window__Group_1__3__Impl"
    // InternalEsper2Maude.g:1995:1: rule__Window__Group_1__3__Impl : ( 'milliseconds' ) ;
    public final void rule__Window__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1999:1: ( ( 'milliseconds' ) )
            // InternalEsper2Maude.g:2000:1: ( 'milliseconds' )
            {
            // InternalEsper2Maude.g:2000:1: ( 'milliseconds' )
            // InternalEsper2Maude.g:2001:2: 'milliseconds'
            {
             before(grammarAccess.getWindowAccess().getMillisecondsKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getMillisecondsKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__3__Impl"


    // $ANTLR start "rule__Window__Group_1__4"
    // InternalEsper2Maude.g:2010:1: rule__Window__Group_1__4 : rule__Window__Group_1__4__Impl ;
    public final void rule__Window__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2014:1: ( rule__Window__Group_1__4__Impl )
            // InternalEsper2Maude.g:2015:2: rule__Window__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Window__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__4"


    // $ANTLR start "rule__Window__Group_1__4__Impl"
    // InternalEsper2Maude.g:2021:1: rule__Window__Group_1__4__Impl : ( ')' ) ;
    public final void rule__Window__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2025:1: ( ( ')' ) )
            // InternalEsper2Maude.g:2026:1: ( ')' )
            {
            // InternalEsper2Maude.g:2026:1: ( ')' )
            // InternalEsper2Maude.g:2027:2: ')'
            {
             before(grammarAccess.getWindowAccess().getRightParenthesisKeyword_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__Group_1__4__Impl"


    // $ANTLR start "rule__WhereFilter__Group__0"
    // InternalEsper2Maude.g:2037:1: rule__WhereFilter__Group__0 : rule__WhereFilter__Group__0__Impl rule__WhereFilter__Group__1 ;
    public final void rule__WhereFilter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2041:1: ( rule__WhereFilter__Group__0__Impl rule__WhereFilter__Group__1 )
            // InternalEsper2Maude.g:2042:2: rule__WhereFilter__Group__0__Impl rule__WhereFilter__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__WhereFilter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__0"


    // $ANTLR start "rule__WhereFilter__Group__0__Impl"
    // InternalEsper2Maude.g:2049:1: rule__WhereFilter__Group__0__Impl : ( ( rule__WhereFilter__Group_0__0 )? ) ;
    public final void rule__WhereFilter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2053:1: ( ( ( rule__WhereFilter__Group_0__0 )? ) )
            // InternalEsper2Maude.g:2054:1: ( ( rule__WhereFilter__Group_0__0 )? )
            {
            // InternalEsper2Maude.g:2054:1: ( ( rule__WhereFilter__Group_0__0 )? )
            // InternalEsper2Maude.g:2055:2: ( rule__WhereFilter__Group_0__0 )?
            {
             before(grammarAccess.getWhereFilterAccess().getGroup_0()); 
            // InternalEsper2Maude.g:2056:2: ( rule__WhereFilter__Group_0__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID||(LA17_0>=RULE_STRING && LA17_0<=RULE_INT)||(LA17_0>=37 && LA17_0<=39)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEsper2Maude.g:2056:3: rule__WhereFilter__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereFilter__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereFilterAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__0__Impl"


    // $ANTLR start "rule__WhereFilter__Group__1"
    // InternalEsper2Maude.g:2064:1: rule__WhereFilter__Group__1 : rule__WhereFilter__Group__1__Impl rule__WhereFilter__Group__2 ;
    public final void rule__WhereFilter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2068:1: ( rule__WhereFilter__Group__1__Impl rule__WhereFilter__Group__2 )
            // InternalEsper2Maude.g:2069:2: rule__WhereFilter__Group__1__Impl rule__WhereFilter__Group__2
            {
            pushFollow(FOLLOW_29);
            rule__WhereFilter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__1"


    // $ANTLR start "rule__WhereFilter__Group__1__Impl"
    // InternalEsper2Maude.g:2076:1: rule__WhereFilter__Group__1__Impl : ( ( rule__WhereFilter__Group_1__0 )? ) ;
    public final void rule__WhereFilter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2080:1: ( ( ( rule__WhereFilter__Group_1__0 )? ) )
            // InternalEsper2Maude.g:2081:1: ( ( rule__WhereFilter__Group_1__0 )? )
            {
            // InternalEsper2Maude.g:2081:1: ( ( rule__WhereFilter__Group_1__0 )? )
            // InternalEsper2Maude.g:2082:2: ( rule__WhereFilter__Group_1__0 )?
            {
             before(grammarAccess.getWhereFilterAccess().getGroup_1()); 
            // InternalEsper2Maude.g:2083:2: ( rule__WhereFilter__Group_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==36) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalEsper2Maude.g:2083:3: rule__WhereFilter__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereFilter__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereFilterAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__1__Impl"


    // $ANTLR start "rule__WhereFilter__Group__2"
    // InternalEsper2Maude.g:2091:1: rule__WhereFilter__Group__2 : rule__WhereFilter__Group__2__Impl ;
    public final void rule__WhereFilter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2095:1: ( rule__WhereFilter__Group__2__Impl )
            // InternalEsper2Maude.g:2096:2: rule__WhereFilter__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__2"


    // $ANTLR start "rule__WhereFilter__Group__2__Impl"
    // InternalEsper2Maude.g:2102:1: rule__WhereFilter__Group__2__Impl : ( ( rule__WhereFilter__Group_2__0 )? ) ;
    public final void rule__WhereFilter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2106:1: ( ( ( rule__WhereFilter__Group_2__0 )? ) )
            // InternalEsper2Maude.g:2107:1: ( ( rule__WhereFilter__Group_2__0 )? )
            {
            // InternalEsper2Maude.g:2107:1: ( ( rule__WhereFilter__Group_2__0 )? )
            // InternalEsper2Maude.g:2108:2: ( rule__WhereFilter__Group_2__0 )?
            {
             before(grammarAccess.getWhereFilterAccess().getGroup_2()); 
            // InternalEsper2Maude.g:2109:2: ( rule__WhereFilter__Group_2__0 )?
            int alt19=2;
            switch ( input.LA(1) ) {
                case 30:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                    {
                    alt19=1;
                    }
                    break;
                case 45:
                    {
                    int LA19_2 = input.LA(2);

                    if ( (LA19_2==RULE_ID) ) {
                        int LA19_5 = input.LA(3);

                        if ( (LA19_5==27||(LA19_5>=40 && LA19_5<=46)) ) {
                            alt19=1;
                        }
                        else if ( (LA19_5==30) ) {
                            int LA19_6 = input.LA(4);

                            if ( (LA19_6==RULE_ID) ) {
                                int LA19_7 = input.LA(5);

                                if ( (LA19_7==EOF||LA19_7==16||(LA19_7>=26 && LA19_7<=27)||(LA19_7>=45 && LA19_7<=46)) ) {
                                    alt19=1;
                                }
                            }
                            else if ( ((LA19_6>=RULE_STRING && LA19_6<=RULE_INT)||(LA19_6>=37 && LA19_6<=39)) ) {
                                alt19=1;
                            }
                        }
                    }
                    else if ( ((LA19_2>=RULE_STRING && LA19_2<=RULE_INT)||(LA19_2>=37 && LA19_2<=39)) ) {
                        alt19=1;
                    }
                    }
                    break;
                case 46:
                    {
                    int LA19_3 = input.LA(2);

                    if ( (LA19_3==RULE_ID) ) {
                        int LA19_5 = input.LA(3);

                        if ( (LA19_5==27||(LA19_5>=40 && LA19_5<=46)) ) {
                            alt19=1;
                        }
                        else if ( (LA19_5==30) ) {
                            int LA19_6 = input.LA(4);

                            if ( (LA19_6==RULE_ID) ) {
                                int LA19_7 = input.LA(5);

                                if ( (LA19_7==EOF||LA19_7==16||(LA19_7>=26 && LA19_7<=27)||(LA19_7>=45 && LA19_7<=46)) ) {
                                    alt19=1;
                                }
                            }
                            else if ( ((LA19_6>=RULE_STRING && LA19_6<=RULE_INT)||(LA19_6>=37 && LA19_6<=39)) ) {
                                alt19=1;
                            }
                        }
                    }
                    else if ( ((LA19_3>=RULE_STRING && LA19_3<=RULE_INT)||(LA19_3>=37 && LA19_3<=39)) ) {
                        alt19=1;
                    }
                    }
                    break;
            }

            switch (alt19) {
                case 1 :
                    // InternalEsper2Maude.g:2109:3: rule__WhereFilter__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__WhereFilter__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getWhereFilterAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group__2__Impl"


    // $ANTLR start "rule__WhereFilter__Group_0__0"
    // InternalEsper2Maude.g:2118:1: rule__WhereFilter__Group_0__0 : rule__WhereFilter__Group_0__0__Impl rule__WhereFilter__Group_0__1 ;
    public final void rule__WhereFilter__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2122:1: ( rule__WhereFilter__Group_0__0__Impl rule__WhereFilter__Group_0__1 )
            // InternalEsper2Maude.g:2123:2: rule__WhereFilter__Group_0__0__Impl rule__WhereFilter__Group_0__1
            {
            pushFollow(FOLLOW_30);
            rule__WhereFilter__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_0__0"


    // $ANTLR start "rule__WhereFilter__Group_0__0__Impl"
    // InternalEsper2Maude.g:2130:1: rule__WhereFilter__Group_0__0__Impl : ( ( rule__WhereFilter__FilterEventLAssignment_0_0 ) ) ;
    public final void rule__WhereFilter__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2134:1: ( ( ( rule__WhereFilter__FilterEventLAssignment_0_0 ) ) )
            // InternalEsper2Maude.g:2135:1: ( ( rule__WhereFilter__FilterEventLAssignment_0_0 ) )
            {
            // InternalEsper2Maude.g:2135:1: ( ( rule__WhereFilter__FilterEventLAssignment_0_0 ) )
            // InternalEsper2Maude.g:2136:2: ( rule__WhereFilter__FilterEventLAssignment_0_0 )
            {
             before(grammarAccess.getWhereFilterAccess().getFilterEventLAssignment_0_0()); 
            // InternalEsper2Maude.g:2137:2: ( rule__WhereFilter__FilterEventLAssignment_0_0 )
            // InternalEsper2Maude.g:2137:3: rule__WhereFilter__FilterEventLAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__FilterEventLAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getFilterEventLAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_0__0__Impl"


    // $ANTLR start "rule__WhereFilter__Group_0__1"
    // InternalEsper2Maude.g:2145:1: rule__WhereFilter__Group_0__1 : rule__WhereFilter__Group_0__1__Impl ;
    public final void rule__WhereFilter__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2149:1: ( rule__WhereFilter__Group_0__1__Impl )
            // InternalEsper2Maude.g:2150:2: rule__WhereFilter__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_0__1"


    // $ANTLR start "rule__WhereFilter__Group_0__1__Impl"
    // InternalEsper2Maude.g:2156:1: rule__WhereFilter__Group_0__1__Impl : ( ( rule__WhereFilter__FilterOpLAssignment_0_1 ) ) ;
    public final void rule__WhereFilter__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2160:1: ( ( ( rule__WhereFilter__FilterOpLAssignment_0_1 ) ) )
            // InternalEsper2Maude.g:2161:1: ( ( rule__WhereFilter__FilterOpLAssignment_0_1 ) )
            {
            // InternalEsper2Maude.g:2161:1: ( ( rule__WhereFilter__FilterOpLAssignment_0_1 ) )
            // InternalEsper2Maude.g:2162:2: ( rule__WhereFilter__FilterOpLAssignment_0_1 )
            {
             before(grammarAccess.getWhereFilterAccess().getFilterOpLAssignment_0_1()); 
            // InternalEsper2Maude.g:2163:2: ( rule__WhereFilter__FilterOpLAssignment_0_1 )
            // InternalEsper2Maude.g:2163:3: rule__WhereFilter__FilterOpLAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__FilterOpLAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getFilterOpLAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_0__1__Impl"


    // $ANTLR start "rule__WhereFilter__Group_1__0"
    // InternalEsper2Maude.g:2172:1: rule__WhereFilter__Group_1__0 : rule__WhereFilter__Group_1__0__Impl rule__WhereFilter__Group_1__1 ;
    public final void rule__WhereFilter__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2176:1: ( rule__WhereFilter__Group_1__0__Impl rule__WhereFilter__Group_1__1 )
            // InternalEsper2Maude.g:2177:2: rule__WhereFilter__Group_1__0__Impl rule__WhereFilter__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__WhereFilter__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__0"


    // $ANTLR start "rule__WhereFilter__Group_1__0__Impl"
    // InternalEsper2Maude.g:2184:1: rule__WhereFilter__Group_1__0__Impl : ( ( rule__WhereFilter__TimerAssignment_1_0 ) ) ;
    public final void rule__WhereFilter__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2188:1: ( ( ( rule__WhereFilter__TimerAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:2189:1: ( ( rule__WhereFilter__TimerAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:2189:1: ( ( rule__WhereFilter__TimerAssignment_1_0 ) )
            // InternalEsper2Maude.g:2190:2: ( rule__WhereFilter__TimerAssignment_1_0 )
            {
             before(grammarAccess.getWhereFilterAccess().getTimerAssignment_1_0()); 
            // InternalEsper2Maude.g:2191:2: ( rule__WhereFilter__TimerAssignment_1_0 )
            // InternalEsper2Maude.g:2191:3: rule__WhereFilter__TimerAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__TimerAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getTimerAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__0__Impl"


    // $ANTLR start "rule__WhereFilter__Group_1__1"
    // InternalEsper2Maude.g:2199:1: rule__WhereFilter__Group_1__1 : rule__WhereFilter__Group_1__1__Impl rule__WhereFilter__Group_1__2 ;
    public final void rule__WhereFilter__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2203:1: ( rule__WhereFilter__Group_1__1__Impl rule__WhereFilter__Group_1__2 )
            // InternalEsper2Maude.g:2204:2: rule__WhereFilter__Group_1__1__Impl rule__WhereFilter__Group_1__2
            {
            pushFollow(FOLLOW_15);
            rule__WhereFilter__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__1"


    // $ANTLR start "rule__WhereFilter__Group_1__1__Impl"
    // InternalEsper2Maude.g:2211:1: rule__WhereFilter__Group_1__1__Impl : ( '(' ) ;
    public final void rule__WhereFilter__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2215:1: ( ( '(' ) )
            // InternalEsper2Maude.g:2216:1: ( '(' )
            {
            // InternalEsper2Maude.g:2216:1: ( '(' )
            // InternalEsper2Maude.g:2217:2: '('
            {
             before(grammarAccess.getWhereFilterAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getWhereFilterAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__1__Impl"


    // $ANTLR start "rule__WhereFilter__Group_1__2"
    // InternalEsper2Maude.g:2226:1: rule__WhereFilter__Group_1__2 : rule__WhereFilter__Group_1__2__Impl rule__WhereFilter__Group_1__3 ;
    public final void rule__WhereFilter__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2230:1: ( rule__WhereFilter__Group_1__2__Impl rule__WhereFilter__Group_1__3 )
            // InternalEsper2Maude.g:2231:2: rule__WhereFilter__Group_1__2__Impl rule__WhereFilter__Group_1__3
            {
            pushFollow(FOLLOW_28);
            rule__WhereFilter__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__2"


    // $ANTLR start "rule__WhereFilter__Group_1__2__Impl"
    // InternalEsper2Maude.g:2238:1: rule__WhereFilter__Group_1__2__Impl : ( ( rule__WhereFilter__NumAssignment_1_2 ) ) ;
    public final void rule__WhereFilter__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2242:1: ( ( ( rule__WhereFilter__NumAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:2243:1: ( ( rule__WhereFilter__NumAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:2243:1: ( ( rule__WhereFilter__NumAssignment_1_2 ) )
            // InternalEsper2Maude.g:2244:2: ( rule__WhereFilter__NumAssignment_1_2 )
            {
             before(grammarAccess.getWhereFilterAccess().getNumAssignment_1_2()); 
            // InternalEsper2Maude.g:2245:2: ( rule__WhereFilter__NumAssignment_1_2 )
            // InternalEsper2Maude.g:2245:3: rule__WhereFilter__NumAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__NumAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getNumAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__2__Impl"


    // $ANTLR start "rule__WhereFilter__Group_1__3"
    // InternalEsper2Maude.g:2253:1: rule__WhereFilter__Group_1__3 : rule__WhereFilter__Group_1__3__Impl rule__WhereFilter__Group_1__4 ;
    public final void rule__WhereFilter__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2257:1: ( rule__WhereFilter__Group_1__3__Impl rule__WhereFilter__Group_1__4 )
            // InternalEsper2Maude.g:2258:2: rule__WhereFilter__Group_1__3__Impl rule__WhereFilter__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__WhereFilter__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__3"


    // $ANTLR start "rule__WhereFilter__Group_1__3__Impl"
    // InternalEsper2Maude.g:2265:1: rule__WhereFilter__Group_1__3__Impl : ( 'milliseconds' ) ;
    public final void rule__WhereFilter__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2269:1: ( ( 'milliseconds' ) )
            // InternalEsper2Maude.g:2270:1: ( 'milliseconds' )
            {
            // InternalEsper2Maude.g:2270:1: ( 'milliseconds' )
            // InternalEsper2Maude.g:2271:2: 'milliseconds'
            {
             before(grammarAccess.getWhereFilterAccess().getMillisecondsKeyword_1_3()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getWhereFilterAccess().getMillisecondsKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__3__Impl"


    // $ANTLR start "rule__WhereFilter__Group_1__4"
    // InternalEsper2Maude.g:2280:1: rule__WhereFilter__Group_1__4 : rule__WhereFilter__Group_1__4__Impl ;
    public final void rule__WhereFilter__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2284:1: ( rule__WhereFilter__Group_1__4__Impl )
            // InternalEsper2Maude.g:2285:2: rule__WhereFilter__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__4"


    // $ANTLR start "rule__WhereFilter__Group_1__4__Impl"
    // InternalEsper2Maude.g:2291:1: rule__WhereFilter__Group_1__4__Impl : ( ')' ) ;
    public final void rule__WhereFilter__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2295:1: ( ( ')' ) )
            // InternalEsper2Maude.g:2296:1: ( ')' )
            {
            // InternalEsper2Maude.g:2296:1: ( ')' )
            // InternalEsper2Maude.g:2297:2: ')'
            {
             before(grammarAccess.getWhereFilterAccess().getRightParenthesisKeyword_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getWhereFilterAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_1__4__Impl"


    // $ANTLR start "rule__WhereFilter__Group_2__0"
    // InternalEsper2Maude.g:2307:1: rule__WhereFilter__Group_2__0 : rule__WhereFilter__Group_2__0__Impl rule__WhereFilter__Group_2__1 ;
    public final void rule__WhereFilter__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2311:1: ( rule__WhereFilter__Group_2__0__Impl rule__WhereFilter__Group_2__1 )
            // InternalEsper2Maude.g:2312:2: rule__WhereFilter__Group_2__0__Impl rule__WhereFilter__Group_2__1
            {
            pushFollow(FOLLOW_31);
            rule__WhereFilter__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_2__0"


    // $ANTLR start "rule__WhereFilter__Group_2__0__Impl"
    // InternalEsper2Maude.g:2319:1: rule__WhereFilter__Group_2__0__Impl : ( ( rule__WhereFilter__FilterOpRAssignment_2_0 ) ) ;
    public final void rule__WhereFilter__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2323:1: ( ( ( rule__WhereFilter__FilterOpRAssignment_2_0 ) ) )
            // InternalEsper2Maude.g:2324:1: ( ( rule__WhereFilter__FilterOpRAssignment_2_0 ) )
            {
            // InternalEsper2Maude.g:2324:1: ( ( rule__WhereFilter__FilterOpRAssignment_2_0 ) )
            // InternalEsper2Maude.g:2325:2: ( rule__WhereFilter__FilterOpRAssignment_2_0 )
            {
             before(grammarAccess.getWhereFilterAccess().getFilterOpRAssignment_2_0()); 
            // InternalEsper2Maude.g:2326:2: ( rule__WhereFilter__FilterOpRAssignment_2_0 )
            // InternalEsper2Maude.g:2326:3: rule__WhereFilter__FilterOpRAssignment_2_0
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__FilterOpRAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getFilterOpRAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_2__0__Impl"


    // $ANTLR start "rule__WhereFilter__Group_2__1"
    // InternalEsper2Maude.g:2334:1: rule__WhereFilter__Group_2__1 : rule__WhereFilter__Group_2__1__Impl ;
    public final void rule__WhereFilter__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2338:1: ( rule__WhereFilter__Group_2__1__Impl )
            // InternalEsper2Maude.g:2339:2: rule__WhereFilter__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_2__1"


    // $ANTLR start "rule__WhereFilter__Group_2__1__Impl"
    // InternalEsper2Maude.g:2345:1: rule__WhereFilter__Group_2__1__Impl : ( ( rule__WhereFilter__FilterEventRAssignment_2_1 ) ) ;
    public final void rule__WhereFilter__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2349:1: ( ( ( rule__WhereFilter__FilterEventRAssignment_2_1 ) ) )
            // InternalEsper2Maude.g:2350:1: ( ( rule__WhereFilter__FilterEventRAssignment_2_1 ) )
            {
            // InternalEsper2Maude.g:2350:1: ( ( rule__WhereFilter__FilterEventRAssignment_2_1 ) )
            // InternalEsper2Maude.g:2351:2: ( rule__WhereFilter__FilterEventRAssignment_2_1 )
            {
             before(grammarAccess.getWhereFilterAccess().getFilterEventRAssignment_2_1()); 
            // InternalEsper2Maude.g:2352:2: ( rule__WhereFilter__FilterEventRAssignment_2_1 )
            // InternalEsper2Maude.g:2352:3: rule__WhereFilter__FilterEventRAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__WhereFilter__FilterEventRAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getWhereFilterAccess().getFilterEventRAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__Group_2__1__Impl"


    // $ANTLR start "rule__FilterFrom__Group_1__0"
    // InternalEsper2Maude.g:2361:1: rule__FilterFrom__Group_1__0 : rule__FilterFrom__Group_1__0__Impl rule__FilterFrom__Group_1__1 ;
    public final void rule__FilterFrom__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2365:1: ( rule__FilterFrom__Group_1__0__Impl rule__FilterFrom__Group_1__1 )
            // InternalEsper2Maude.g:2366:2: rule__FilterFrom__Group_1__0__Impl rule__FilterFrom__Group_1__1
            {
            pushFollow(FOLLOW_24);
            rule__FilterFrom__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__0"


    // $ANTLR start "rule__FilterFrom__Group_1__0__Impl"
    // InternalEsper2Maude.g:2373:1: rule__FilterFrom__Group_1__0__Impl : ( '(' ) ;
    public final void rule__FilterFrom__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2377:1: ( ( '(' ) )
            // InternalEsper2Maude.g:2378:1: ( '(' )
            {
            // InternalEsper2Maude.g:2378:1: ( '(' )
            // InternalEsper2Maude.g:2379:2: '('
            {
             before(grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__0__Impl"


    // $ANTLR start "rule__FilterFrom__Group_1__1"
    // InternalEsper2Maude.g:2388:1: rule__FilterFrom__Group_1__1 : rule__FilterFrom__Group_1__1__Impl rule__FilterFrom__Group_1__2 ;
    public final void rule__FilterFrom__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2392:1: ( rule__FilterFrom__Group_1__1__Impl rule__FilterFrom__Group_1__2 )
            // InternalEsper2Maude.g:2393:2: rule__FilterFrom__Group_1__1__Impl rule__FilterFrom__Group_1__2
            {
            pushFollow(FOLLOW_30);
            rule__FilterFrom__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__1"


    // $ANTLR start "rule__FilterFrom__Group_1__1__Impl"
    // InternalEsper2Maude.g:2400:1: rule__FilterFrom__Group_1__1__Impl : ( ( rule__FilterFrom__LeftAssignment_1_1 ) ) ;
    public final void rule__FilterFrom__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2404:1: ( ( ( rule__FilterFrom__LeftAssignment_1_1 ) ) )
            // InternalEsper2Maude.g:2405:1: ( ( rule__FilterFrom__LeftAssignment_1_1 ) )
            {
            // InternalEsper2Maude.g:2405:1: ( ( rule__FilterFrom__LeftAssignment_1_1 ) )
            // InternalEsper2Maude.g:2406:2: ( rule__FilterFrom__LeftAssignment_1_1 )
            {
             before(grammarAccess.getFilterFromAccess().getLeftAssignment_1_1()); 
            // InternalEsper2Maude.g:2407:2: ( rule__FilterFrom__LeftAssignment_1_1 )
            // InternalEsper2Maude.g:2407:3: rule__FilterFrom__LeftAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__LeftAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getLeftAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__1__Impl"


    // $ANTLR start "rule__FilterFrom__Group_1__2"
    // InternalEsper2Maude.g:2415:1: rule__FilterFrom__Group_1__2 : rule__FilterFrom__Group_1__2__Impl rule__FilterFrom__Group_1__3 ;
    public final void rule__FilterFrom__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2419:1: ( rule__FilterFrom__Group_1__2__Impl rule__FilterFrom__Group_1__3 )
            // InternalEsper2Maude.g:2420:2: rule__FilterFrom__Group_1__2__Impl rule__FilterFrom__Group_1__3
            {
            pushFollow(FOLLOW_24);
            rule__FilterFrom__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__2"


    // $ANTLR start "rule__FilterFrom__Group_1__2__Impl"
    // InternalEsper2Maude.g:2427:1: rule__FilterFrom__Group_1__2__Impl : ( ( rule__FilterFrom__OpAssignment_1_2 ) ) ;
    public final void rule__FilterFrom__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2431:1: ( ( ( rule__FilterFrom__OpAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:2432:1: ( ( rule__FilterFrom__OpAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:2432:1: ( ( rule__FilterFrom__OpAssignment_1_2 ) )
            // InternalEsper2Maude.g:2433:2: ( rule__FilterFrom__OpAssignment_1_2 )
            {
             before(grammarAccess.getFilterFromAccess().getOpAssignment_1_2()); 
            // InternalEsper2Maude.g:2434:2: ( rule__FilterFrom__OpAssignment_1_2 )
            // InternalEsper2Maude.g:2434:3: rule__FilterFrom__OpAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__OpAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getOpAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__2__Impl"


    // $ANTLR start "rule__FilterFrom__Group_1__3"
    // InternalEsper2Maude.g:2442:1: rule__FilterFrom__Group_1__3 : rule__FilterFrom__Group_1__3__Impl rule__FilterFrom__Group_1__4 ;
    public final void rule__FilterFrom__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2446:1: ( rule__FilterFrom__Group_1__3__Impl rule__FilterFrom__Group_1__4 )
            // InternalEsper2Maude.g:2447:2: rule__FilterFrom__Group_1__3__Impl rule__FilterFrom__Group_1__4
            {
            pushFollow(FOLLOW_13);
            rule__FilterFrom__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__3"


    // $ANTLR start "rule__FilterFrom__Group_1__3__Impl"
    // InternalEsper2Maude.g:2454:1: rule__FilterFrom__Group_1__3__Impl : ( ( rule__FilterFrom__RightAssignment_1_3 ) ) ;
    public final void rule__FilterFrom__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2458:1: ( ( ( rule__FilterFrom__RightAssignment_1_3 ) ) )
            // InternalEsper2Maude.g:2459:1: ( ( rule__FilterFrom__RightAssignment_1_3 ) )
            {
            // InternalEsper2Maude.g:2459:1: ( ( rule__FilterFrom__RightAssignment_1_3 ) )
            // InternalEsper2Maude.g:2460:2: ( rule__FilterFrom__RightAssignment_1_3 )
            {
             before(grammarAccess.getFilterFromAccess().getRightAssignment_1_3()); 
            // InternalEsper2Maude.g:2461:2: ( rule__FilterFrom__RightAssignment_1_3 )
            // InternalEsper2Maude.g:2461:3: rule__FilterFrom__RightAssignment_1_3
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__RightAssignment_1_3();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getRightAssignment_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__3__Impl"


    // $ANTLR start "rule__FilterFrom__Group_1__4"
    // InternalEsper2Maude.g:2469:1: rule__FilterFrom__Group_1__4 : rule__FilterFrom__Group_1__4__Impl ;
    public final void rule__FilterFrom__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2473:1: ( rule__FilterFrom__Group_1__4__Impl )
            // InternalEsper2Maude.g:2474:2: rule__FilterFrom__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__4"


    // $ANTLR start "rule__FilterFrom__Group_1__4__Impl"
    // InternalEsper2Maude.g:2480:1: rule__FilterFrom__Group_1__4__Impl : ( ')' ) ;
    public final void rule__FilterFrom__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2484:1: ( ( ')' ) )
            // InternalEsper2Maude.g:2485:1: ( ')' )
            {
            // InternalEsper2Maude.g:2485:1: ( ')' )
            // InternalEsper2Maude.g:2486:2: ')'
            {
             before(grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_1_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_1__4__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2__0"
    // InternalEsper2Maude.g:2496:1: rule__FilterFrom__Group_2__0 : rule__FilterFrom__Group_2__0__Impl rule__FilterFrom__Group_2__1 ;
    public final void rule__FilterFrom__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2500:1: ( rule__FilterFrom__Group_2__0__Impl rule__FilterFrom__Group_2__1 )
            // InternalEsper2Maude.g:2501:2: rule__FilterFrom__Group_2__0__Impl rule__FilterFrom__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__FilterFrom__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__0"


    // $ANTLR start "rule__FilterFrom__Group_2__0__Impl"
    // InternalEsper2Maude.g:2508:1: rule__FilterFrom__Group_2__0__Impl : ( 'every' ) ;
    public final void rule__FilterFrom__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2512:1: ( ( 'every' ) )
            // InternalEsper2Maude.g:2513:1: ( 'every' )
            {
            // InternalEsper2Maude.g:2513:1: ( 'every' )
            // InternalEsper2Maude.g:2514:2: 'every'
            {
             before(grammarAccess.getFilterFromAccess().getEveryKeyword_2_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getEveryKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__0__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2__1"
    // InternalEsper2Maude.g:2523:1: rule__FilterFrom__Group_2__1 : rule__FilterFrom__Group_2__1__Impl rule__FilterFrom__Group_2__2 ;
    public final void rule__FilterFrom__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2527:1: ( rule__FilterFrom__Group_2__1__Impl rule__FilterFrom__Group_2__2 )
            // InternalEsper2Maude.g:2528:2: rule__FilterFrom__Group_2__1__Impl rule__FilterFrom__Group_2__2
            {
            pushFollow(FOLLOW_7);
            rule__FilterFrom__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__1"


    // $ANTLR start "rule__FilterFrom__Group_2__1__Impl"
    // InternalEsper2Maude.g:2535:1: rule__FilterFrom__Group_2__1__Impl : ( ( rule__FilterFrom__Group_2_1__0 )? ) ;
    public final void rule__FilterFrom__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2539:1: ( ( ( rule__FilterFrom__Group_2_1__0 )? ) )
            // InternalEsper2Maude.g:2540:1: ( ( rule__FilterFrom__Group_2_1__0 )? )
            {
            // InternalEsper2Maude.g:2540:1: ( ( rule__FilterFrom__Group_2_1__0 )? )
            // InternalEsper2Maude.g:2541:2: ( rule__FilterFrom__Group_2_1__0 )?
            {
             before(grammarAccess.getFilterFromAccess().getGroup_2_1()); 
            // InternalEsper2Maude.g:2542:2: ( rule__FilterFrom__Group_2_1__0 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==30) ) {
                    alt20=1;
                }
            }
            switch (alt20) {
                case 1 :
                    // InternalEsper2Maude.g:2542:3: rule__FilterFrom__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterFrom__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterFromAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__1__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2__2"
    // InternalEsper2Maude.g:2550:1: rule__FilterFrom__Group_2__2 : rule__FilterFrom__Group_2__2__Impl rule__FilterFrom__Group_2__3 ;
    public final void rule__FilterFrom__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2554:1: ( rule__FilterFrom__Group_2__2__Impl rule__FilterFrom__Group_2__3 )
            // InternalEsper2Maude.g:2555:2: rule__FilterFrom__Group_2__2__Impl rule__FilterFrom__Group_2__3
            {
            pushFollow(FOLLOW_8);
            rule__FilterFrom__Group_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__2"


    // $ANTLR start "rule__FilterFrom__Group_2__2__Impl"
    // InternalEsper2Maude.g:2562:1: rule__FilterFrom__Group_2__2__Impl : ( ( rule__FilterFrom__EventNameAssignment_2_2 ) ) ;
    public final void rule__FilterFrom__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2566:1: ( ( ( rule__FilterFrom__EventNameAssignment_2_2 ) ) )
            // InternalEsper2Maude.g:2567:1: ( ( rule__FilterFrom__EventNameAssignment_2_2 ) )
            {
            // InternalEsper2Maude.g:2567:1: ( ( rule__FilterFrom__EventNameAssignment_2_2 ) )
            // InternalEsper2Maude.g:2568:2: ( rule__FilterFrom__EventNameAssignment_2_2 )
            {
             before(grammarAccess.getFilterFromAccess().getEventNameAssignment_2_2()); 
            // InternalEsper2Maude.g:2569:2: ( rule__FilterFrom__EventNameAssignment_2_2 )
            // InternalEsper2Maude.g:2569:3: rule__FilterFrom__EventNameAssignment_2_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__EventNameAssignment_2_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getEventNameAssignment_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__2__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2__3"
    // InternalEsper2Maude.g:2577:1: rule__FilterFrom__Group_2__3 : rule__FilterFrom__Group_2__3__Impl ;
    public final void rule__FilterFrom__Group_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2581:1: ( rule__FilterFrom__Group_2__3__Impl )
            // InternalEsper2Maude.g:2582:2: rule__FilterFrom__Group_2__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__3"


    // $ANTLR start "rule__FilterFrom__Group_2__3__Impl"
    // InternalEsper2Maude.g:2588:1: rule__FilterFrom__Group_2__3__Impl : ( ( rule__FilterFrom__Group_2_3__0 )? ) ;
    public final void rule__FilterFrom__Group_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2592:1: ( ( ( rule__FilterFrom__Group_2_3__0 )? ) )
            // InternalEsper2Maude.g:2593:1: ( ( rule__FilterFrom__Group_2_3__0 )? )
            {
            // InternalEsper2Maude.g:2593:1: ( ( rule__FilterFrom__Group_2_3__0 )? )
            // InternalEsper2Maude.g:2594:2: ( rule__FilterFrom__Group_2_3__0 )?
            {
             before(grammarAccess.getFilterFromAccess().getGroup_2_3()); 
            // InternalEsper2Maude.g:2595:2: ( rule__FilterFrom__Group_2_3__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==15) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalEsper2Maude.g:2595:3: rule__FilterFrom__Group_2_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterFrom__Group_2_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterFromAccess().getGroup_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2__3__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2_1__0"
    // InternalEsper2Maude.g:2604:1: rule__FilterFrom__Group_2_1__0 : rule__FilterFrom__Group_2_1__0__Impl rule__FilterFrom__Group_2_1__1 ;
    public final void rule__FilterFrom__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2608:1: ( rule__FilterFrom__Group_2_1__0__Impl rule__FilterFrom__Group_2_1__1 )
            // InternalEsper2Maude.g:2609:2: rule__FilterFrom__Group_2_1__0__Impl rule__FilterFrom__Group_2_1__1
            {
            pushFollow(FOLLOW_32);
            rule__FilterFrom__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_1__0"


    // $ANTLR start "rule__FilterFrom__Group_2_1__0__Impl"
    // InternalEsper2Maude.g:2616:1: rule__FilterFrom__Group_2_1__0__Impl : ( ( rule__FilterFrom__EventVariableAssignment_2_1_0 ) ) ;
    public final void rule__FilterFrom__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2620:1: ( ( ( rule__FilterFrom__EventVariableAssignment_2_1_0 ) ) )
            // InternalEsper2Maude.g:2621:1: ( ( rule__FilterFrom__EventVariableAssignment_2_1_0 ) )
            {
            // InternalEsper2Maude.g:2621:1: ( ( rule__FilterFrom__EventVariableAssignment_2_1_0 ) )
            // InternalEsper2Maude.g:2622:2: ( rule__FilterFrom__EventVariableAssignment_2_1_0 )
            {
             before(grammarAccess.getFilterFromAccess().getEventVariableAssignment_2_1_0()); 
            // InternalEsper2Maude.g:2623:2: ( rule__FilterFrom__EventVariableAssignment_2_1_0 )
            // InternalEsper2Maude.g:2623:3: rule__FilterFrom__EventVariableAssignment_2_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__EventVariableAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getEventVariableAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_1__0__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2_1__1"
    // InternalEsper2Maude.g:2631:1: rule__FilterFrom__Group_2_1__1 : rule__FilterFrom__Group_2_1__1__Impl ;
    public final void rule__FilterFrom__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2635:1: ( rule__FilterFrom__Group_2_1__1__Impl )
            // InternalEsper2Maude.g:2636:2: rule__FilterFrom__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_1__1"


    // $ANTLR start "rule__FilterFrom__Group_2_1__1__Impl"
    // InternalEsper2Maude.g:2642:1: rule__FilterFrom__Group_2_1__1__Impl : ( '=' ) ;
    public final void rule__FilterFrom__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2646:1: ( ( '=' ) )
            // InternalEsper2Maude.g:2647:1: ( '=' )
            {
            // InternalEsper2Maude.g:2647:1: ( '=' )
            // InternalEsper2Maude.g:2648:2: '='
            {
             before(grammarAccess.getFilterFromAccess().getEqualsSignKeyword_2_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getEqualsSignKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_1__1__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2_3__0"
    // InternalEsper2Maude.g:2658:1: rule__FilterFrom__Group_2_3__0 : rule__FilterFrom__Group_2_3__0__Impl rule__FilterFrom__Group_2_3__1 ;
    public final void rule__FilterFrom__Group_2_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2662:1: ( rule__FilterFrom__Group_2_3__0__Impl rule__FilterFrom__Group_2_3__1 )
            // InternalEsper2Maude.g:2663:2: rule__FilterFrom__Group_2_3__0__Impl rule__FilterFrom__Group_2_3__1
            {
            pushFollow(FOLLOW_31);
            rule__FilterFrom__Group_2_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__0"


    // $ANTLR start "rule__FilterFrom__Group_2_3__0__Impl"
    // InternalEsper2Maude.g:2670:1: rule__FilterFrom__Group_2_3__0__Impl : ( '(' ) ;
    public final void rule__FilterFrom__Group_2_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2674:1: ( ( '(' ) )
            // InternalEsper2Maude.g:2675:1: ( '(' )
            {
            // InternalEsper2Maude.g:2675:1: ( '(' )
            // InternalEsper2Maude.g:2676:2: '('
            {
             before(grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_2_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__0__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2_3__1"
    // InternalEsper2Maude.g:2685:1: rule__FilterFrom__Group_2_3__1 : rule__FilterFrom__Group_2_3__1__Impl rule__FilterFrom__Group_2_3__2 ;
    public final void rule__FilterFrom__Group_2_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2689:1: ( rule__FilterFrom__Group_2_3__1__Impl rule__FilterFrom__Group_2_3__2 )
            // InternalEsper2Maude.g:2690:2: rule__FilterFrom__Group_2_3__1__Impl rule__FilterFrom__Group_2_3__2
            {
            pushFollow(FOLLOW_13);
            rule__FilterFrom__Group_2_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__1"


    // $ANTLR start "rule__FilterFrom__Group_2_3__1__Impl"
    // InternalEsper2Maude.g:2697:1: rule__FilterFrom__Group_2_3__1__Impl : ( ( rule__FilterFrom__FilterAssignment_2_3_1 ) ) ;
    public final void rule__FilterFrom__Group_2_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2701:1: ( ( ( rule__FilterFrom__FilterAssignment_2_3_1 ) ) )
            // InternalEsper2Maude.g:2702:1: ( ( rule__FilterFrom__FilterAssignment_2_3_1 ) )
            {
            // InternalEsper2Maude.g:2702:1: ( ( rule__FilterFrom__FilterAssignment_2_3_1 ) )
            // InternalEsper2Maude.g:2703:2: ( rule__FilterFrom__FilterAssignment_2_3_1 )
            {
             before(grammarAccess.getFilterFromAccess().getFilterAssignment_2_3_1()); 
            // InternalEsper2Maude.g:2704:2: ( rule__FilterFrom__FilterAssignment_2_3_1 )
            // InternalEsper2Maude.g:2704:3: rule__FilterFrom__FilterAssignment_2_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__FilterAssignment_2_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterFromAccess().getFilterAssignment_2_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__1__Impl"


    // $ANTLR start "rule__FilterFrom__Group_2_3__2"
    // InternalEsper2Maude.g:2712:1: rule__FilterFrom__Group_2_3__2 : rule__FilterFrom__Group_2_3__2__Impl ;
    public final void rule__FilterFrom__Group_2_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2716:1: ( rule__FilterFrom__Group_2_3__2__Impl )
            // InternalEsper2Maude.g:2717:2: rule__FilterFrom__Group_2_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterFrom__Group_2_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__2"


    // $ANTLR start "rule__FilterFrom__Group_2_3__2__Impl"
    // InternalEsper2Maude.g:2723:1: rule__FilterFrom__Group_2_3__2__Impl : ( ')' ) ;
    public final void rule__FilterFrom__Group_2_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2727:1: ( ( ')' ) )
            // InternalEsper2Maude.g:2728:1: ( ')' )
            {
            // InternalEsper2Maude.g:2728:1: ( ')' )
            // InternalEsper2Maude.g:2729:2: ')'
            {
             before(grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_2_3_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_2_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__Group_2_3__2__Impl"


    // $ANTLR start "rule__FollowedBy__Group__0"
    // InternalEsper2Maude.g:2739:1: rule__FollowedBy__Group__0 : rule__FollowedBy__Group__0__Impl rule__FollowedBy__Group__1 ;
    public final void rule__FollowedBy__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2743:1: ( rule__FollowedBy__Group__0__Impl rule__FollowedBy__Group__1 )
            // InternalEsper2Maude.g:2744:2: rule__FollowedBy__Group__0__Impl rule__FollowedBy__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__FollowedBy__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__0"


    // $ANTLR start "rule__FollowedBy__Group__0__Impl"
    // InternalEsper2Maude.g:2751:1: rule__FollowedBy__Group__0__Impl : ( ( rule__FollowedBy__LeftAssignment_0 ) ) ;
    public final void rule__FollowedBy__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2755:1: ( ( ( rule__FollowedBy__LeftAssignment_0 ) ) )
            // InternalEsper2Maude.g:2756:1: ( ( rule__FollowedBy__LeftAssignment_0 ) )
            {
            // InternalEsper2Maude.g:2756:1: ( ( rule__FollowedBy__LeftAssignment_0 ) )
            // InternalEsper2Maude.g:2757:2: ( rule__FollowedBy__LeftAssignment_0 )
            {
             before(grammarAccess.getFollowedByAccess().getLeftAssignment_0()); 
            // InternalEsper2Maude.g:2758:2: ( rule__FollowedBy__LeftAssignment_0 )
            // InternalEsper2Maude.g:2758:3: rule__FollowedBy__LeftAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__LeftAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFollowedByAccess().getLeftAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__0__Impl"


    // $ANTLR start "rule__FollowedBy__Group__1"
    // InternalEsper2Maude.g:2766:1: rule__FollowedBy__Group__1 : rule__FollowedBy__Group__1__Impl rule__FollowedBy__Group__2 ;
    public final void rule__FollowedBy__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2770:1: ( rule__FollowedBy__Group__1__Impl rule__FollowedBy__Group__2 )
            // InternalEsper2Maude.g:2771:2: rule__FollowedBy__Group__1__Impl rule__FollowedBy__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__FollowedBy__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__1"


    // $ANTLR start "rule__FollowedBy__Group__1__Impl"
    // InternalEsper2Maude.g:2778:1: rule__FollowedBy__Group__1__Impl : ( '->' ) ;
    public final void rule__FollowedBy__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2782:1: ( ( '->' ) )
            // InternalEsper2Maude.g:2783:1: ( '->' )
            {
            // InternalEsper2Maude.g:2783:1: ( '->' )
            // InternalEsper2Maude.g:2784:2: '->'
            {
             before(grammarAccess.getFollowedByAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getFollowedByAccess().getHyphenMinusGreaterThanSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__1__Impl"


    // $ANTLR start "rule__FollowedBy__Group__2"
    // InternalEsper2Maude.g:2793:1: rule__FollowedBy__Group__2 : rule__FollowedBy__Group__2__Impl rule__FollowedBy__Group__3 ;
    public final void rule__FollowedBy__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2797:1: ( rule__FollowedBy__Group__2__Impl rule__FollowedBy__Group__3 )
            // InternalEsper2Maude.g:2798:2: rule__FollowedBy__Group__2__Impl rule__FollowedBy__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__FollowedBy__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__2"


    // $ANTLR start "rule__FollowedBy__Group__2__Impl"
    // InternalEsper2Maude.g:2805:1: rule__FollowedBy__Group__2__Impl : ( ( rule__FollowedBy__RightAssignment_2 ) ) ;
    public final void rule__FollowedBy__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2809:1: ( ( ( rule__FollowedBy__RightAssignment_2 ) ) )
            // InternalEsper2Maude.g:2810:1: ( ( rule__FollowedBy__RightAssignment_2 ) )
            {
            // InternalEsper2Maude.g:2810:1: ( ( rule__FollowedBy__RightAssignment_2 ) )
            // InternalEsper2Maude.g:2811:2: ( rule__FollowedBy__RightAssignment_2 )
            {
             before(grammarAccess.getFollowedByAccess().getRightAssignment_2()); 
            // InternalEsper2Maude.g:2812:2: ( rule__FollowedBy__RightAssignment_2 )
            // InternalEsper2Maude.g:2812:3: rule__FollowedBy__RightAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__RightAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFollowedByAccess().getRightAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__2__Impl"


    // $ANTLR start "rule__FollowedBy__Group__3"
    // InternalEsper2Maude.g:2820:1: rule__FollowedBy__Group__3 : rule__FollowedBy__Group__3__Impl ;
    public final void rule__FollowedBy__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2824:1: ( rule__FollowedBy__Group__3__Impl )
            // InternalEsper2Maude.g:2825:2: rule__FollowedBy__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__3"


    // $ANTLR start "rule__FollowedBy__Group__3__Impl"
    // InternalEsper2Maude.g:2831:1: rule__FollowedBy__Group__3__Impl : ( ( rule__FollowedBy__Group_3__0 )? ) ;
    public final void rule__FollowedBy__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2835:1: ( ( ( rule__FollowedBy__Group_3__0 )? ) )
            // InternalEsper2Maude.g:2836:1: ( ( rule__FollowedBy__Group_3__0 )? )
            {
            // InternalEsper2Maude.g:2836:1: ( ( rule__FollowedBy__Group_3__0 )? )
            // InternalEsper2Maude.g:2837:2: ( rule__FollowedBy__Group_3__0 )?
            {
             before(grammarAccess.getFollowedByAccess().getGroup_3()); 
            // InternalEsper2Maude.g:2838:2: ( rule__FollowedBy__Group_3__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==32) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalEsper2Maude.g:2838:3: rule__FollowedBy__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FollowedBy__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFollowedByAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group__3__Impl"


    // $ANTLR start "rule__FollowedBy__Group_3__0"
    // InternalEsper2Maude.g:2847:1: rule__FollowedBy__Group_3__0 : rule__FollowedBy__Group_3__0__Impl rule__FollowedBy__Group_3__1 ;
    public final void rule__FollowedBy__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2851:1: ( rule__FollowedBy__Group_3__0__Impl rule__FollowedBy__Group_3__1 )
            // InternalEsper2Maude.g:2852:2: rule__FollowedBy__Group_3__0__Impl rule__FollowedBy__Group_3__1
            {
            pushFollow(FOLLOW_35);
            rule__FollowedBy__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group_3__0"


    // $ANTLR start "rule__FollowedBy__Group_3__0__Impl"
    // InternalEsper2Maude.g:2859:1: rule__FollowedBy__Group_3__0__Impl : ( 'where' ) ;
    public final void rule__FollowedBy__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2863:1: ( ( 'where' ) )
            // InternalEsper2Maude.g:2864:1: ( 'where' )
            {
            // InternalEsper2Maude.g:2864:1: ( 'where' )
            // InternalEsper2Maude.g:2865:2: 'where'
            {
             before(grammarAccess.getFollowedByAccess().getWhereKeyword_3_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getFollowedByAccess().getWhereKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group_3__0__Impl"


    // $ANTLR start "rule__FollowedBy__Group_3__1"
    // InternalEsper2Maude.g:2874:1: rule__FollowedBy__Group_3__1 : rule__FollowedBy__Group_3__1__Impl ;
    public final void rule__FollowedBy__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2878:1: ( rule__FollowedBy__Group_3__1__Impl )
            // InternalEsper2Maude.g:2879:2: rule__FollowedBy__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__Group_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group_3__1"


    // $ANTLR start "rule__FollowedBy__Group_3__1__Impl"
    // InternalEsper2Maude.g:2885:1: rule__FollowedBy__Group_3__1__Impl : ( ( rule__FollowedBy__WhereFilterAssignment_3_1 ) ) ;
    public final void rule__FollowedBy__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2889:1: ( ( ( rule__FollowedBy__WhereFilterAssignment_3_1 ) ) )
            // InternalEsper2Maude.g:2890:1: ( ( rule__FollowedBy__WhereFilterAssignment_3_1 ) )
            {
            // InternalEsper2Maude.g:2890:1: ( ( rule__FollowedBy__WhereFilterAssignment_3_1 ) )
            // InternalEsper2Maude.g:2891:2: ( rule__FollowedBy__WhereFilterAssignment_3_1 )
            {
             before(grammarAccess.getFollowedByAccess().getWhereFilterAssignment_3_1()); 
            // InternalEsper2Maude.g:2892:2: ( rule__FollowedBy__WhereFilterAssignment_3_1 )
            // InternalEsper2Maude.g:2892:3: rule__FollowedBy__WhereFilterAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__FollowedBy__WhereFilterAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getFollowedByAccess().getWhereFilterAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__Group_3__1__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__0"
    // InternalEsper2Maude.g:2901:1: rule__SubFilterFollowedBy__Group_0__0 : rule__SubFilterFollowedBy__Group_0__0__Impl rule__SubFilterFollowedBy__Group_0__1 ;
    public final void rule__SubFilterFollowedBy__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2905:1: ( rule__SubFilterFollowedBy__Group_0__0__Impl rule__SubFilterFollowedBy__Group_0__1 )
            // InternalEsper2Maude.g:2906:2: rule__SubFilterFollowedBy__Group_0__0__Impl rule__SubFilterFollowedBy__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__SubFilterFollowedBy__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__0"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__0__Impl"
    // InternalEsper2Maude.g:2913:1: rule__SubFilterFollowedBy__Group_0__0__Impl : ( ( rule__SubFilterFollowedBy__Group_0_0__0 )? ) ;
    public final void rule__SubFilterFollowedBy__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2917:1: ( ( ( rule__SubFilterFollowedBy__Group_0_0__0 )? ) )
            // InternalEsper2Maude.g:2918:1: ( ( rule__SubFilterFollowedBy__Group_0_0__0 )? )
            {
            // InternalEsper2Maude.g:2918:1: ( ( rule__SubFilterFollowedBy__Group_0_0__0 )? )
            // InternalEsper2Maude.g:2919:2: ( rule__SubFilterFollowedBy__Group_0_0__0 )?
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_0()); 
            // InternalEsper2Maude.g:2920:2: ( rule__SubFilterFollowedBy__Group_0_0__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_ID) ) {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==30) ) {
                    alt23=1;
                }
            }
            switch (alt23) {
                case 1 :
                    // InternalEsper2Maude.g:2920:3: rule__SubFilterFollowedBy__Group_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFilterFollowedBy__Group_0_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__0__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__1"
    // InternalEsper2Maude.g:2928:1: rule__SubFilterFollowedBy__Group_0__1 : rule__SubFilterFollowedBy__Group_0__1__Impl rule__SubFilterFollowedBy__Group_0__2 ;
    public final void rule__SubFilterFollowedBy__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2932:1: ( rule__SubFilterFollowedBy__Group_0__1__Impl rule__SubFilterFollowedBy__Group_0__2 )
            // InternalEsper2Maude.g:2933:2: rule__SubFilterFollowedBy__Group_0__1__Impl rule__SubFilterFollowedBy__Group_0__2
            {
            pushFollow(FOLLOW_8);
            rule__SubFilterFollowedBy__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__1"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__1__Impl"
    // InternalEsper2Maude.g:2940:1: rule__SubFilterFollowedBy__Group_0__1__Impl : ( ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 ) ) ;
    public final void rule__SubFilterFollowedBy__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2944:1: ( ( ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 ) ) )
            // InternalEsper2Maude.g:2945:1: ( ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 ) )
            {
            // InternalEsper2Maude.g:2945:1: ( ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 ) )
            // InternalEsper2Maude.g:2946:2: ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 )
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEventNameAssignment_0_1()); 
            // InternalEsper2Maude.g:2947:2: ( rule__SubFilterFollowedBy__EventNameAssignment_0_1 )
            // InternalEsper2Maude.g:2947:3: rule__SubFilterFollowedBy__EventNameAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__EventNameAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFilterFollowedByAccess().getEventNameAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__1__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__2"
    // InternalEsper2Maude.g:2955:1: rule__SubFilterFollowedBy__Group_0__2 : rule__SubFilterFollowedBy__Group_0__2__Impl ;
    public final void rule__SubFilterFollowedBy__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2959:1: ( rule__SubFilterFollowedBy__Group_0__2__Impl )
            // InternalEsper2Maude.g:2960:2: rule__SubFilterFollowedBy__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__2"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0__2__Impl"
    // InternalEsper2Maude.g:2966:1: rule__SubFilterFollowedBy__Group_0__2__Impl : ( ( rule__SubFilterFollowedBy__Group_0_2__0 )? ) ;
    public final void rule__SubFilterFollowedBy__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2970:1: ( ( ( rule__SubFilterFollowedBy__Group_0_2__0 )? ) )
            // InternalEsper2Maude.g:2971:1: ( ( rule__SubFilterFollowedBy__Group_0_2__0 )? )
            {
            // InternalEsper2Maude.g:2971:1: ( ( rule__SubFilterFollowedBy__Group_0_2__0 )? )
            // InternalEsper2Maude.g:2972:2: ( rule__SubFilterFollowedBy__Group_0_2__0 )?
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_2()); 
            // InternalEsper2Maude.g:2973:2: ( rule__SubFilterFollowedBy__Group_0_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==15) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsper2Maude.g:2973:3: rule__SubFilterFollowedBy__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SubFilterFollowedBy__Group_0_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0__2__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_0__0"
    // InternalEsper2Maude.g:2982:1: rule__SubFilterFollowedBy__Group_0_0__0 : rule__SubFilterFollowedBy__Group_0_0__0__Impl rule__SubFilterFollowedBy__Group_0_0__1 ;
    public final void rule__SubFilterFollowedBy__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2986:1: ( rule__SubFilterFollowedBy__Group_0_0__0__Impl rule__SubFilterFollowedBy__Group_0_0__1 )
            // InternalEsper2Maude.g:2987:2: rule__SubFilterFollowedBy__Group_0_0__0__Impl rule__SubFilterFollowedBy__Group_0_0__1
            {
            pushFollow(FOLLOW_32);
            rule__SubFilterFollowedBy__Group_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_0__0"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_0__0__Impl"
    // InternalEsper2Maude.g:2994:1: rule__SubFilterFollowedBy__Group_0_0__0__Impl : ( ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 ) ) ;
    public final void rule__SubFilterFollowedBy__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:2998:1: ( ( ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 ) ) )
            // InternalEsper2Maude.g:2999:1: ( ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 ) )
            {
            // InternalEsper2Maude.g:2999:1: ( ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 ) )
            // InternalEsper2Maude.g:3000:2: ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 )
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEventVariableAssignment_0_0_0()); 
            // InternalEsper2Maude.g:3001:2: ( rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 )
            // InternalEsper2Maude.g:3001:3: rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSubFilterFollowedByAccess().getEventVariableAssignment_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_0__0__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_0__1"
    // InternalEsper2Maude.g:3009:1: rule__SubFilterFollowedBy__Group_0_0__1 : rule__SubFilterFollowedBy__Group_0_0__1__Impl ;
    public final void rule__SubFilterFollowedBy__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3013:1: ( rule__SubFilterFollowedBy__Group_0_0__1__Impl )
            // InternalEsper2Maude.g:3014:2: rule__SubFilterFollowedBy__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_0__1"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_0__1__Impl"
    // InternalEsper2Maude.g:3020:1: rule__SubFilterFollowedBy__Group_0_0__1__Impl : ( '=' ) ;
    public final void rule__SubFilterFollowedBy__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3024:1: ( ( '=' ) )
            // InternalEsper2Maude.g:3025:1: ( '=' )
            {
            // InternalEsper2Maude.g:3025:1: ( '=' )
            // InternalEsper2Maude.g:3026:2: '='
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEqualsSignKeyword_0_0_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getEqualsSignKeyword_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_0__1__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__0"
    // InternalEsper2Maude.g:3036:1: rule__SubFilterFollowedBy__Group_0_2__0 : rule__SubFilterFollowedBy__Group_0_2__0__Impl rule__SubFilterFollowedBy__Group_0_2__1 ;
    public final void rule__SubFilterFollowedBy__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3040:1: ( rule__SubFilterFollowedBy__Group_0_2__0__Impl rule__SubFilterFollowedBy__Group_0_2__1 )
            // InternalEsper2Maude.g:3041:2: rule__SubFilterFollowedBy__Group_0_2__0__Impl rule__SubFilterFollowedBy__Group_0_2__1
            {
            pushFollow(FOLLOW_31);
            rule__SubFilterFollowedBy__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__0"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__0__Impl"
    // InternalEsper2Maude.g:3048:1: rule__SubFilterFollowedBy__Group_0_2__0__Impl : ( '(' ) ;
    public final void rule__SubFilterFollowedBy__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3052:1: ( ( '(' ) )
            // InternalEsper2Maude.g:3053:1: ( '(' )
            {
            // InternalEsper2Maude.g:3053:1: ( '(' )
            // InternalEsper2Maude.g:3054:2: '('
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_0_2_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__0__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__1"
    // InternalEsper2Maude.g:3063:1: rule__SubFilterFollowedBy__Group_0_2__1 : rule__SubFilterFollowedBy__Group_0_2__1__Impl rule__SubFilterFollowedBy__Group_0_2__2 ;
    public final void rule__SubFilterFollowedBy__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3067:1: ( rule__SubFilterFollowedBy__Group_0_2__1__Impl rule__SubFilterFollowedBy__Group_0_2__2 )
            // InternalEsper2Maude.g:3068:2: rule__SubFilterFollowedBy__Group_0_2__1__Impl rule__SubFilterFollowedBy__Group_0_2__2
            {
            pushFollow(FOLLOW_13);
            rule__SubFilterFollowedBy__Group_0_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__1"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__1__Impl"
    // InternalEsper2Maude.g:3075:1: rule__SubFilterFollowedBy__Group_0_2__1__Impl : ( ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 ) ) ;
    public final void rule__SubFilterFollowedBy__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3079:1: ( ( ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 ) ) )
            // InternalEsper2Maude.g:3080:1: ( ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 ) )
            {
            // InternalEsper2Maude.g:3080:1: ( ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 ) )
            // InternalEsper2Maude.g:3081:2: ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 )
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_0_2_1()); 
            // InternalEsper2Maude.g:3082:2: ( rule__SubFilterFollowedBy__FilterAssignment_0_2_1 )
            // InternalEsper2Maude.g:3082:3: rule__SubFilterFollowedBy__FilterAssignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__FilterAssignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__1__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__2"
    // InternalEsper2Maude.g:3090:1: rule__SubFilterFollowedBy__Group_0_2__2 : rule__SubFilterFollowedBy__Group_0_2__2__Impl ;
    public final void rule__SubFilterFollowedBy__Group_0_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3094:1: ( rule__SubFilterFollowedBy__Group_0_2__2__Impl )
            // InternalEsper2Maude.g:3095:2: rule__SubFilterFollowedBy__Group_0_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_0_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__2"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_0_2__2__Impl"
    // InternalEsper2Maude.g:3101:1: rule__SubFilterFollowedBy__Group_0_2__2__Impl : ( ')' ) ;
    public final void rule__SubFilterFollowedBy__Group_0_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3105:1: ( ( ')' ) )
            // InternalEsper2Maude.g:3106:1: ( ')' )
            {
            // InternalEsper2Maude.g:3106:1: ( ')' )
            // InternalEsper2Maude.g:3107:2: ')'
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_0_2_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_0_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_0_2__2__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__0"
    // InternalEsper2Maude.g:3117:1: rule__SubFilterFollowedBy__Group_1__0 : rule__SubFilterFollowedBy__Group_1__0__Impl rule__SubFilterFollowedBy__Group_1__1 ;
    public final void rule__SubFilterFollowedBy__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3121:1: ( rule__SubFilterFollowedBy__Group_1__0__Impl rule__SubFilterFollowedBy__Group_1__1 )
            // InternalEsper2Maude.g:3122:2: rule__SubFilterFollowedBy__Group_1__0__Impl rule__SubFilterFollowedBy__Group_1__1
            {
            pushFollow(FOLLOW_31);
            rule__SubFilterFollowedBy__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__0"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__0__Impl"
    // InternalEsper2Maude.g:3129:1: rule__SubFilterFollowedBy__Group_1__0__Impl : ( '(' ) ;
    public final void rule__SubFilterFollowedBy__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3133:1: ( ( '(' ) )
            // InternalEsper2Maude.g:3134:1: ( '(' )
            {
            // InternalEsper2Maude.g:3134:1: ( '(' )
            // InternalEsper2Maude.g:3135:2: '('
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__0__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__1"
    // InternalEsper2Maude.g:3144:1: rule__SubFilterFollowedBy__Group_1__1 : rule__SubFilterFollowedBy__Group_1__1__Impl rule__SubFilterFollowedBy__Group_1__2 ;
    public final void rule__SubFilterFollowedBy__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3148:1: ( rule__SubFilterFollowedBy__Group_1__1__Impl rule__SubFilterFollowedBy__Group_1__2 )
            // InternalEsper2Maude.g:3149:2: rule__SubFilterFollowedBy__Group_1__1__Impl rule__SubFilterFollowedBy__Group_1__2
            {
            pushFollow(FOLLOW_13);
            rule__SubFilterFollowedBy__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__1"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__1__Impl"
    // InternalEsper2Maude.g:3156:1: rule__SubFilterFollowedBy__Group_1__1__Impl : ( ( rule__SubFilterFollowedBy__FilterAssignment_1_1 ) ) ;
    public final void rule__SubFilterFollowedBy__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3160:1: ( ( ( rule__SubFilterFollowedBy__FilterAssignment_1_1 ) ) )
            // InternalEsper2Maude.g:3161:1: ( ( rule__SubFilterFollowedBy__FilterAssignment_1_1 ) )
            {
            // InternalEsper2Maude.g:3161:1: ( ( rule__SubFilterFollowedBy__FilterAssignment_1_1 ) )
            // InternalEsper2Maude.g:3162:2: ( rule__SubFilterFollowedBy__FilterAssignment_1_1 )
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_1_1()); 
            // InternalEsper2Maude.g:3163:2: ( rule__SubFilterFollowedBy__FilterAssignment_1_1 )
            // InternalEsper2Maude.g:3163:3: rule__SubFilterFollowedBy__FilterAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__FilterAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__1__Impl"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__2"
    // InternalEsper2Maude.g:3171:1: rule__SubFilterFollowedBy__Group_1__2 : rule__SubFilterFollowedBy__Group_1__2__Impl ;
    public final void rule__SubFilterFollowedBy__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3175:1: ( rule__SubFilterFollowedBy__Group_1__2__Impl )
            // InternalEsper2Maude.g:3176:2: rule__SubFilterFollowedBy__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SubFilterFollowedBy__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__2"


    // $ANTLR start "rule__SubFilterFollowedBy__Group_1__2__Impl"
    // InternalEsper2Maude.g:3182:1: rule__SubFilterFollowedBy__Group_1__2__Impl : ( ')' ) ;
    public final void rule__SubFilterFollowedBy__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3186:1: ( ( ')' ) )
            // InternalEsper2Maude.g:3187:1: ( ')' )
            {
            // InternalEsper2Maude.g:3187:1: ( ')' )
            // InternalEsper2Maude.g:3188:2: ')'
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_1_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__Group_1__2__Impl"


    // $ANTLR start "rule__Every__Group_0__0"
    // InternalEsper2Maude.g:3198:1: rule__Every__Group_0__0 : rule__Every__Group_0__0__Impl rule__Every__Group_0__1 ;
    public final void rule__Every__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3202:1: ( rule__Every__Group_0__0__Impl rule__Every__Group_0__1 )
            // InternalEsper2Maude.g:3203:2: rule__Every__Group_0__0__Impl rule__Every__Group_0__1
            {
            pushFollow(FOLLOW_7);
            rule__Every__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__0"


    // $ANTLR start "rule__Every__Group_0__0__Impl"
    // InternalEsper2Maude.g:3210:1: rule__Every__Group_0__0__Impl : ( 'every' ) ;
    public final void rule__Every__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3214:1: ( ( 'every' ) )
            // InternalEsper2Maude.g:3215:1: ( 'every' )
            {
            // InternalEsper2Maude.g:3215:1: ( 'every' )
            // InternalEsper2Maude.g:3216:2: 'every'
            {
             before(grammarAccess.getEveryAccess().getEveryKeyword_0_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getEveryKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__0__Impl"


    // $ANTLR start "rule__Every__Group_0__1"
    // InternalEsper2Maude.g:3225:1: rule__Every__Group_0__1 : rule__Every__Group_0__1__Impl rule__Every__Group_0__2 ;
    public final void rule__Every__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3229:1: ( rule__Every__Group_0__1__Impl rule__Every__Group_0__2 )
            // InternalEsper2Maude.g:3230:2: rule__Every__Group_0__1__Impl rule__Every__Group_0__2
            {
            pushFollow(FOLLOW_7);
            rule__Every__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__1"


    // $ANTLR start "rule__Every__Group_0__1__Impl"
    // InternalEsper2Maude.g:3237:1: rule__Every__Group_0__1__Impl : ( ( rule__Every__Group_0_1__0 )? ) ;
    public final void rule__Every__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3241:1: ( ( ( rule__Every__Group_0_1__0 )? ) )
            // InternalEsper2Maude.g:3242:1: ( ( rule__Every__Group_0_1__0 )? )
            {
            // InternalEsper2Maude.g:3242:1: ( ( rule__Every__Group_0_1__0 )? )
            // InternalEsper2Maude.g:3243:2: ( rule__Every__Group_0_1__0 )?
            {
             before(grammarAccess.getEveryAccess().getGroup_0_1()); 
            // InternalEsper2Maude.g:3244:2: ( rule__Every__Group_0_1__0 )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                int LA25_1 = input.LA(2);

                if ( (LA25_1==30) ) {
                    alt25=1;
                }
            }
            switch (alt25) {
                case 1 :
                    // InternalEsper2Maude.g:3244:3: rule__Every__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Every__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEveryAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__1__Impl"


    // $ANTLR start "rule__Every__Group_0__2"
    // InternalEsper2Maude.g:3252:1: rule__Every__Group_0__2 : rule__Every__Group_0__2__Impl rule__Every__Group_0__3 ;
    public final void rule__Every__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3256:1: ( rule__Every__Group_0__2__Impl rule__Every__Group_0__3 )
            // InternalEsper2Maude.g:3257:2: rule__Every__Group_0__2__Impl rule__Every__Group_0__3
            {
            pushFollow(FOLLOW_8);
            rule__Every__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__2"


    // $ANTLR start "rule__Every__Group_0__2__Impl"
    // InternalEsper2Maude.g:3264:1: rule__Every__Group_0__2__Impl : ( ( rule__Every__EventNameAssignment_0_2 ) ) ;
    public final void rule__Every__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3268:1: ( ( ( rule__Every__EventNameAssignment_0_2 ) ) )
            // InternalEsper2Maude.g:3269:1: ( ( rule__Every__EventNameAssignment_0_2 ) )
            {
            // InternalEsper2Maude.g:3269:1: ( ( rule__Every__EventNameAssignment_0_2 ) )
            // InternalEsper2Maude.g:3270:2: ( rule__Every__EventNameAssignment_0_2 )
            {
             before(grammarAccess.getEveryAccess().getEventNameAssignment_0_2()); 
            // InternalEsper2Maude.g:3271:2: ( rule__Every__EventNameAssignment_0_2 )
            // InternalEsper2Maude.g:3271:3: rule__Every__EventNameAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Every__EventNameAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getEveryAccess().getEventNameAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__2__Impl"


    // $ANTLR start "rule__Every__Group_0__3"
    // InternalEsper2Maude.g:3279:1: rule__Every__Group_0__3 : rule__Every__Group_0__3__Impl ;
    public final void rule__Every__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3283:1: ( rule__Every__Group_0__3__Impl )
            // InternalEsper2Maude.g:3284:2: rule__Every__Group_0__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Every__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__3"


    // $ANTLR start "rule__Every__Group_0__3__Impl"
    // InternalEsper2Maude.g:3290:1: rule__Every__Group_0__3__Impl : ( ( rule__Every__Group_0_3__0 )? ) ;
    public final void rule__Every__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3294:1: ( ( ( rule__Every__Group_0_3__0 )? ) )
            // InternalEsper2Maude.g:3295:1: ( ( rule__Every__Group_0_3__0 )? )
            {
            // InternalEsper2Maude.g:3295:1: ( ( rule__Every__Group_0_3__0 )? )
            // InternalEsper2Maude.g:3296:2: ( rule__Every__Group_0_3__0 )?
            {
             before(grammarAccess.getEveryAccess().getGroup_0_3()); 
            // InternalEsper2Maude.g:3297:2: ( rule__Every__Group_0_3__0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==15) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalEsper2Maude.g:3297:3: rule__Every__Group_0_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Every__Group_0_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEveryAccess().getGroup_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0__3__Impl"


    // $ANTLR start "rule__Every__Group_0_1__0"
    // InternalEsper2Maude.g:3306:1: rule__Every__Group_0_1__0 : rule__Every__Group_0_1__0__Impl rule__Every__Group_0_1__1 ;
    public final void rule__Every__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3310:1: ( rule__Every__Group_0_1__0__Impl rule__Every__Group_0_1__1 )
            // InternalEsper2Maude.g:3311:2: rule__Every__Group_0_1__0__Impl rule__Every__Group_0_1__1
            {
            pushFollow(FOLLOW_32);
            rule__Every__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_1__0"


    // $ANTLR start "rule__Every__Group_0_1__0__Impl"
    // InternalEsper2Maude.g:3318:1: rule__Every__Group_0_1__0__Impl : ( ( rule__Every__EventVariableAssignment_0_1_0 ) ) ;
    public final void rule__Every__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3322:1: ( ( ( rule__Every__EventVariableAssignment_0_1_0 ) ) )
            // InternalEsper2Maude.g:3323:1: ( ( rule__Every__EventVariableAssignment_0_1_0 ) )
            {
            // InternalEsper2Maude.g:3323:1: ( ( rule__Every__EventVariableAssignment_0_1_0 ) )
            // InternalEsper2Maude.g:3324:2: ( rule__Every__EventVariableAssignment_0_1_0 )
            {
             before(grammarAccess.getEveryAccess().getEventVariableAssignment_0_1_0()); 
            // InternalEsper2Maude.g:3325:2: ( rule__Every__EventVariableAssignment_0_1_0 )
            // InternalEsper2Maude.g:3325:3: rule__Every__EventVariableAssignment_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Every__EventVariableAssignment_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getEveryAccess().getEventVariableAssignment_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_1__0__Impl"


    // $ANTLR start "rule__Every__Group_0_1__1"
    // InternalEsper2Maude.g:3333:1: rule__Every__Group_0_1__1 : rule__Every__Group_0_1__1__Impl ;
    public final void rule__Every__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3337:1: ( rule__Every__Group_0_1__1__Impl )
            // InternalEsper2Maude.g:3338:2: rule__Every__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Every__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_1__1"


    // $ANTLR start "rule__Every__Group_0_1__1__Impl"
    // InternalEsper2Maude.g:3344:1: rule__Every__Group_0_1__1__Impl : ( '=' ) ;
    public final void rule__Every__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3348:1: ( ( '=' ) )
            // InternalEsper2Maude.g:3349:1: ( '=' )
            {
            // InternalEsper2Maude.g:3349:1: ( '=' )
            // InternalEsper2Maude.g:3350:2: '='
            {
             before(grammarAccess.getEveryAccess().getEqualsSignKeyword_0_1_1()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getEqualsSignKeyword_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_1__1__Impl"


    // $ANTLR start "rule__Every__Group_0_3__0"
    // InternalEsper2Maude.g:3360:1: rule__Every__Group_0_3__0 : rule__Every__Group_0_3__0__Impl rule__Every__Group_0_3__1 ;
    public final void rule__Every__Group_0_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3364:1: ( rule__Every__Group_0_3__0__Impl rule__Every__Group_0_3__1 )
            // InternalEsper2Maude.g:3365:2: rule__Every__Group_0_3__0__Impl rule__Every__Group_0_3__1
            {
            pushFollow(FOLLOW_31);
            rule__Every__Group_0_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__0"


    // $ANTLR start "rule__Every__Group_0_3__0__Impl"
    // InternalEsper2Maude.g:3372:1: rule__Every__Group_0_3__0__Impl : ( '(' ) ;
    public final void rule__Every__Group_0_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3376:1: ( ( '(' ) )
            // InternalEsper2Maude.g:3377:1: ( '(' )
            {
            // InternalEsper2Maude.g:3377:1: ( '(' )
            // InternalEsper2Maude.g:3378:2: '('
            {
             before(grammarAccess.getEveryAccess().getLeftParenthesisKeyword_0_3_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getLeftParenthesisKeyword_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__0__Impl"


    // $ANTLR start "rule__Every__Group_0_3__1"
    // InternalEsper2Maude.g:3387:1: rule__Every__Group_0_3__1 : rule__Every__Group_0_3__1__Impl rule__Every__Group_0_3__2 ;
    public final void rule__Every__Group_0_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3391:1: ( rule__Every__Group_0_3__1__Impl rule__Every__Group_0_3__2 )
            // InternalEsper2Maude.g:3392:2: rule__Every__Group_0_3__1__Impl rule__Every__Group_0_3__2
            {
            pushFollow(FOLLOW_13);
            rule__Every__Group_0_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_0_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__1"


    // $ANTLR start "rule__Every__Group_0_3__1__Impl"
    // InternalEsper2Maude.g:3399:1: rule__Every__Group_0_3__1__Impl : ( ( rule__Every__FilterAssignment_0_3_1 ) ) ;
    public final void rule__Every__Group_0_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3403:1: ( ( ( rule__Every__FilterAssignment_0_3_1 ) ) )
            // InternalEsper2Maude.g:3404:1: ( ( rule__Every__FilterAssignment_0_3_1 ) )
            {
            // InternalEsper2Maude.g:3404:1: ( ( rule__Every__FilterAssignment_0_3_1 ) )
            // InternalEsper2Maude.g:3405:2: ( rule__Every__FilterAssignment_0_3_1 )
            {
             before(grammarAccess.getEveryAccess().getFilterAssignment_0_3_1()); 
            // InternalEsper2Maude.g:3406:2: ( rule__Every__FilterAssignment_0_3_1 )
            // InternalEsper2Maude.g:3406:3: rule__Every__FilterAssignment_0_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Every__FilterAssignment_0_3_1();

            state._fsp--;


            }

             after(grammarAccess.getEveryAccess().getFilterAssignment_0_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__1__Impl"


    // $ANTLR start "rule__Every__Group_0_3__2"
    // InternalEsper2Maude.g:3414:1: rule__Every__Group_0_3__2 : rule__Every__Group_0_3__2__Impl ;
    public final void rule__Every__Group_0_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3418:1: ( rule__Every__Group_0_3__2__Impl )
            // InternalEsper2Maude.g:3419:2: rule__Every__Group_0_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Every__Group_0_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__2"


    // $ANTLR start "rule__Every__Group_0_3__2__Impl"
    // InternalEsper2Maude.g:3425:1: rule__Every__Group_0_3__2__Impl : ( ')' ) ;
    public final void rule__Every__Group_0_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3429:1: ( ( ')' ) )
            // InternalEsper2Maude.g:3430:1: ( ')' )
            {
            // InternalEsper2Maude.g:3430:1: ( ')' )
            // InternalEsper2Maude.g:3431:2: ')'
            {
             before(grammarAccess.getEveryAccess().getRightParenthesisKeyword_0_3_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getRightParenthesisKeyword_0_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_0_3__2__Impl"


    // $ANTLR start "rule__Every__Group_1__0"
    // InternalEsper2Maude.g:3441:1: rule__Every__Group_1__0 : rule__Every__Group_1__0__Impl rule__Every__Group_1__1 ;
    public final void rule__Every__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3445:1: ( rule__Every__Group_1__0__Impl rule__Every__Group_1__1 )
            // InternalEsper2Maude.g:3446:2: rule__Every__Group_1__0__Impl rule__Every__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Every__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__0"


    // $ANTLR start "rule__Every__Group_1__0__Impl"
    // InternalEsper2Maude.g:3453:1: rule__Every__Group_1__0__Impl : ( 'every' ) ;
    public final void rule__Every__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3457:1: ( ( 'every' ) )
            // InternalEsper2Maude.g:3458:1: ( 'every' )
            {
            // InternalEsper2Maude.g:3458:1: ( 'every' )
            // InternalEsper2Maude.g:3459:2: 'every'
            {
             before(grammarAccess.getEveryAccess().getEveryKeyword_1_0()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getEveryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__0__Impl"


    // $ANTLR start "rule__Every__Group_1__1"
    // InternalEsper2Maude.g:3468:1: rule__Every__Group_1__1 : rule__Every__Group_1__1__Impl rule__Every__Group_1__2 ;
    public final void rule__Every__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3472:1: ( rule__Every__Group_1__1__Impl rule__Every__Group_1__2 )
            // InternalEsper2Maude.g:3473:2: rule__Every__Group_1__1__Impl rule__Every__Group_1__2
            {
            pushFollow(FOLLOW_24);
            rule__Every__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__1"


    // $ANTLR start "rule__Every__Group_1__1__Impl"
    // InternalEsper2Maude.g:3480:1: rule__Every__Group_1__1__Impl : ( '(' ) ;
    public final void rule__Every__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3484:1: ( ( '(' ) )
            // InternalEsper2Maude.g:3485:1: ( '(' )
            {
            // InternalEsper2Maude.g:3485:1: ( '(' )
            // InternalEsper2Maude.g:3486:2: '('
            {
             before(grammarAccess.getEveryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__1__Impl"


    // $ANTLR start "rule__Every__Group_1__2"
    // InternalEsper2Maude.g:3495:1: rule__Every__Group_1__2 : rule__Every__Group_1__2__Impl rule__Every__Group_1__3 ;
    public final void rule__Every__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3499:1: ( rule__Every__Group_1__2__Impl rule__Every__Group_1__3 )
            // InternalEsper2Maude.g:3500:2: rule__Every__Group_1__2__Impl rule__Every__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__Every__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Every__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__2"


    // $ANTLR start "rule__Every__Group_1__2__Impl"
    // InternalEsper2Maude.g:3507:1: rule__Every__Group_1__2__Impl : ( ( rule__Every__FilterFromAssignment_1_2 ) ) ;
    public final void rule__Every__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3511:1: ( ( ( rule__Every__FilterFromAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:3512:1: ( ( rule__Every__FilterFromAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:3512:1: ( ( rule__Every__FilterFromAssignment_1_2 ) )
            // InternalEsper2Maude.g:3513:2: ( rule__Every__FilterFromAssignment_1_2 )
            {
             before(grammarAccess.getEveryAccess().getFilterFromAssignment_1_2()); 
            // InternalEsper2Maude.g:3514:2: ( rule__Every__FilterFromAssignment_1_2 )
            // InternalEsper2Maude.g:3514:3: rule__Every__FilterFromAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Every__FilterFromAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getEveryAccess().getFilterFromAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__2__Impl"


    // $ANTLR start "rule__Every__Group_1__3"
    // InternalEsper2Maude.g:3522:1: rule__Every__Group_1__3 : rule__Every__Group_1__3__Impl ;
    public final void rule__Every__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3526:1: ( rule__Every__Group_1__3__Impl )
            // InternalEsper2Maude.g:3527:2: rule__Every__Group_1__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Every__Group_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__3"


    // $ANTLR start "rule__Every__Group_1__3__Impl"
    // InternalEsper2Maude.g:3533:1: rule__Every__Group_1__3__Impl : ( ')' ) ;
    public final void rule__Every__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3537:1: ( ( ')' ) )
            // InternalEsper2Maude.g:3538:1: ( ')' )
            {
            // InternalEsper2Maude.g:3538:1: ( ')' )
            // InternalEsper2Maude.g:3539:2: ')'
            {
             before(grammarAccess.getEveryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__Group_1__3__Impl"


    // $ANTLR start "rule__FilterEvent__Group__0"
    // InternalEsper2Maude.g:3549:1: rule__FilterEvent__Group__0 : rule__FilterEvent__Group__0__Impl rule__FilterEvent__Group__1 ;
    public final void rule__FilterEvent__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3553:1: ( rule__FilterEvent__Group__0__Impl rule__FilterEvent__Group__1 )
            // InternalEsper2Maude.g:3554:2: rule__FilterEvent__Group__0__Impl rule__FilterEvent__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__FilterEvent__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterEvent__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__0"


    // $ANTLR start "rule__FilterEvent__Group__0__Impl"
    // InternalEsper2Maude.g:3561:1: rule__FilterEvent__Group__0__Impl : ( ( rule__FilterEvent__FilterLeftHandSideAssignment_0 ) ) ;
    public final void rule__FilterEvent__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3565:1: ( ( ( rule__FilterEvent__FilterLeftHandSideAssignment_0 ) ) )
            // InternalEsper2Maude.g:3566:1: ( ( rule__FilterEvent__FilterLeftHandSideAssignment_0 ) )
            {
            // InternalEsper2Maude.g:3566:1: ( ( rule__FilterEvent__FilterLeftHandSideAssignment_0 ) )
            // InternalEsper2Maude.g:3567:2: ( rule__FilterEvent__FilterLeftHandSideAssignment_0 )
            {
             before(grammarAccess.getFilterEventAccess().getFilterLeftHandSideAssignment_0()); 
            // InternalEsper2Maude.g:3568:2: ( rule__FilterEvent__FilterLeftHandSideAssignment_0 )
            // InternalEsper2Maude.g:3568:3: rule__FilterEvent__FilterLeftHandSideAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterEvent__FilterLeftHandSideAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterEventAccess().getFilterLeftHandSideAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__0__Impl"


    // $ANTLR start "rule__FilterEvent__Group__1"
    // InternalEsper2Maude.g:3576:1: rule__FilterEvent__Group__1 : rule__FilterEvent__Group__1__Impl rule__FilterEvent__Group__2 ;
    public final void rule__FilterEvent__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3580:1: ( rule__FilterEvent__Group__1__Impl rule__FilterEvent__Group__2 )
            // InternalEsper2Maude.g:3581:2: rule__FilterEvent__Group__1__Impl rule__FilterEvent__Group__2
            {
            pushFollow(FOLLOW_31);
            rule__FilterEvent__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterEvent__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__1"


    // $ANTLR start "rule__FilterEvent__Group__1__Impl"
    // InternalEsper2Maude.g:3588:1: rule__FilterEvent__Group__1__Impl : ( ( rule__FilterEvent__FilterOpAssignment_1 ) ) ;
    public final void rule__FilterEvent__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3592:1: ( ( ( rule__FilterEvent__FilterOpAssignment_1 ) ) )
            // InternalEsper2Maude.g:3593:1: ( ( rule__FilterEvent__FilterOpAssignment_1 ) )
            {
            // InternalEsper2Maude.g:3593:1: ( ( rule__FilterEvent__FilterOpAssignment_1 ) )
            // InternalEsper2Maude.g:3594:2: ( rule__FilterEvent__FilterOpAssignment_1 )
            {
             before(grammarAccess.getFilterEventAccess().getFilterOpAssignment_1()); 
            // InternalEsper2Maude.g:3595:2: ( rule__FilterEvent__FilterOpAssignment_1 )
            // InternalEsper2Maude.g:3595:3: rule__FilterEvent__FilterOpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterEvent__FilterOpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterEventAccess().getFilterOpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__1__Impl"


    // $ANTLR start "rule__FilterEvent__Group__2"
    // InternalEsper2Maude.g:3603:1: rule__FilterEvent__Group__2 : rule__FilterEvent__Group__2__Impl ;
    public final void rule__FilterEvent__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3607:1: ( rule__FilterEvent__Group__2__Impl )
            // InternalEsper2Maude.g:3608:2: rule__FilterEvent__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterEvent__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__2"


    // $ANTLR start "rule__FilterEvent__Group__2__Impl"
    // InternalEsper2Maude.g:3614:1: rule__FilterEvent__Group__2__Impl : ( ( rule__FilterEvent__FilterRightHandSideAssignment_2 ) ) ;
    public final void rule__FilterEvent__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3618:1: ( ( ( rule__FilterEvent__FilterRightHandSideAssignment_2 ) ) )
            // InternalEsper2Maude.g:3619:1: ( ( rule__FilterEvent__FilterRightHandSideAssignment_2 ) )
            {
            // InternalEsper2Maude.g:3619:1: ( ( rule__FilterEvent__FilterRightHandSideAssignment_2 ) )
            // InternalEsper2Maude.g:3620:2: ( rule__FilterEvent__FilterRightHandSideAssignment_2 )
            {
             before(grammarAccess.getFilterEventAccess().getFilterRightHandSideAssignment_2()); 
            // InternalEsper2Maude.g:3621:2: ( rule__FilterEvent__FilterRightHandSideAssignment_2 )
            // InternalEsper2Maude.g:3621:3: rule__FilterEvent__FilterRightHandSideAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterEvent__FilterRightHandSideAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterEventAccess().getFilterRightHandSideAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__Group__2__Impl"


    // $ANTLR start "rule__FilterPart__Group_1__0"
    // InternalEsper2Maude.g:3630:1: rule__FilterPart__Group_1__0 : rule__FilterPart__Group_1__0__Impl rule__FilterPart__Group_1__1 ;
    public final void rule__FilterPart__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3634:1: ( rule__FilterPart__Group_1__0__Impl rule__FilterPart__Group_1__1 )
            // InternalEsper2Maude.g:3635:2: rule__FilterPart__Group_1__0__Impl rule__FilterPart__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__FilterPart__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__0"


    // $ANTLR start "rule__FilterPart__Group_1__0__Impl"
    // InternalEsper2Maude.g:3642:1: rule__FilterPart__Group_1__0__Impl : ( ( rule__FilterPart__EventVariableAssignment_1_0 ) ) ;
    public final void rule__FilterPart__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3646:1: ( ( ( rule__FilterPart__EventVariableAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:3647:1: ( ( rule__FilterPart__EventVariableAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:3647:1: ( ( rule__FilterPart__EventVariableAssignment_1_0 ) )
            // InternalEsper2Maude.g:3648:2: ( rule__FilterPart__EventVariableAssignment_1_0 )
            {
             before(grammarAccess.getFilterPartAccess().getEventVariableAssignment_1_0()); 
            // InternalEsper2Maude.g:3649:2: ( rule__FilterPart__EventVariableAssignment_1_0 )
            // InternalEsper2Maude.g:3649:3: rule__FilterPart__EventVariableAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__EventVariableAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFilterPartAccess().getEventVariableAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__0__Impl"


    // $ANTLR start "rule__FilterPart__Group_1__1"
    // InternalEsper2Maude.g:3657:1: rule__FilterPart__Group_1__1 : rule__FilterPart__Group_1__1__Impl rule__FilterPart__Group_1__2 ;
    public final void rule__FilterPart__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3661:1: ( rule__FilterPart__Group_1__1__Impl rule__FilterPart__Group_1__2 )
            // InternalEsper2Maude.g:3662:2: rule__FilterPart__Group_1__1__Impl rule__FilterPart__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__FilterPart__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__1"


    // $ANTLR start "rule__FilterPart__Group_1__1__Impl"
    // InternalEsper2Maude.g:3669:1: rule__FilterPart__Group_1__1__Impl : ( '.' ) ;
    public final void rule__FilterPart__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3673:1: ( ( '.' ) )
            // InternalEsper2Maude.g:3674:1: ( '.' )
            {
            // InternalEsper2Maude.g:3674:1: ( '.' )
            // InternalEsper2Maude.g:3675:2: '.'
            {
             before(grammarAccess.getFilterPartAccess().getFullStopKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__1__Impl"


    // $ANTLR start "rule__FilterPart__Group_1__2"
    // InternalEsper2Maude.g:3684:1: rule__FilterPart__Group_1__2 : rule__FilterPart__Group_1__2__Impl ;
    public final void rule__FilterPart__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3688:1: ( rule__FilterPart__Group_1__2__Impl )
            // InternalEsper2Maude.g:3689:2: rule__FilterPart__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__2"


    // $ANTLR start "rule__FilterPart__Group_1__2__Impl"
    // InternalEsper2Maude.g:3695:1: rule__FilterPart__Group_1__2__Impl : ( ( rule__FilterPart__EventPropNameAssignment_1_2 ) ) ;
    public final void rule__FilterPart__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3699:1: ( ( ( rule__FilterPart__EventPropNameAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:3700:1: ( ( rule__FilterPart__EventPropNameAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:3700:1: ( ( rule__FilterPart__EventPropNameAssignment_1_2 ) )
            // InternalEsper2Maude.g:3701:2: ( rule__FilterPart__EventPropNameAssignment_1_2 )
            {
             before(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_1_2()); 
            // InternalEsper2Maude.g:3702:2: ( rule__FilterPart__EventPropNameAssignment_1_2 )
            // InternalEsper2Maude.g:3702:3: rule__FilterPart__EventPropNameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__EventPropNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_1__2__Impl"


    // $ANTLR start "rule__FilterPart__Group_2__0"
    // InternalEsper2Maude.g:3711:1: rule__FilterPart__Group_2__0 : rule__FilterPart__Group_2__0__Impl rule__FilterPart__Group_2__1 ;
    public final void rule__FilterPart__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3715:1: ( rule__FilterPart__Group_2__0__Impl rule__FilterPart__Group_2__1 )
            // InternalEsper2Maude.g:3716:2: rule__FilterPart__Group_2__0__Impl rule__FilterPart__Group_2__1
            {
            pushFollow(FOLLOW_36);
            rule__FilterPart__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__0"


    // $ANTLR start "rule__FilterPart__Group_2__0__Impl"
    // InternalEsper2Maude.g:3723:1: rule__FilterPart__Group_2__0__Impl : ( ( rule__FilterPart__NegAssignment_2_0 )? ) ;
    public final void rule__FilterPart__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3727:1: ( ( ( rule__FilterPart__NegAssignment_2_0 )? ) )
            // InternalEsper2Maude.g:3728:1: ( ( rule__FilterPart__NegAssignment_2_0 )? )
            {
            // InternalEsper2Maude.g:3728:1: ( ( rule__FilterPart__NegAssignment_2_0 )? )
            // InternalEsper2Maude.g:3729:2: ( rule__FilterPart__NegAssignment_2_0 )?
            {
             before(grammarAccess.getFilterPartAccess().getNegAssignment_2_0()); 
            // InternalEsper2Maude.g:3730:2: ( rule__FilterPart__NegAssignment_2_0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==37) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalEsper2Maude.g:3730:3: rule__FilterPart__NegAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__NegAssignment_2_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterPartAccess().getNegAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__0__Impl"


    // $ANTLR start "rule__FilterPart__Group_2__1"
    // InternalEsper2Maude.g:3738:1: rule__FilterPart__Group_2__1 : rule__FilterPart__Group_2__1__Impl rule__FilterPart__Group_2__2 ;
    public final void rule__FilterPart__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3742:1: ( rule__FilterPart__Group_2__1__Impl rule__FilterPart__Group_2__2 )
            // InternalEsper2Maude.g:3743:2: rule__FilterPart__Group_2__1__Impl rule__FilterPart__Group_2__2
            {
            pushFollow(FOLLOW_26);
            rule__FilterPart__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__1"


    // $ANTLR start "rule__FilterPart__Group_2__1__Impl"
    // InternalEsper2Maude.g:3750:1: rule__FilterPart__Group_2__1__Impl : ( ( rule__FilterPart__NumAssignment_2_1 ) ) ;
    public final void rule__FilterPart__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3754:1: ( ( ( rule__FilterPart__NumAssignment_2_1 ) ) )
            // InternalEsper2Maude.g:3755:1: ( ( rule__FilterPart__NumAssignment_2_1 ) )
            {
            // InternalEsper2Maude.g:3755:1: ( ( rule__FilterPart__NumAssignment_2_1 ) )
            // InternalEsper2Maude.g:3756:2: ( rule__FilterPart__NumAssignment_2_1 )
            {
             before(grammarAccess.getFilterPartAccess().getNumAssignment_2_1()); 
            // InternalEsper2Maude.g:3757:2: ( rule__FilterPart__NumAssignment_2_1 )
            // InternalEsper2Maude.g:3757:3: rule__FilterPart__NumAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__NumAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterPartAccess().getNumAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__1__Impl"


    // $ANTLR start "rule__FilterPart__Group_2__2"
    // InternalEsper2Maude.g:3765:1: rule__FilterPart__Group_2__2 : rule__FilterPart__Group_2__2__Impl ;
    public final void rule__FilterPart__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3769:1: ( rule__FilterPart__Group_2__2__Impl )
            // InternalEsper2Maude.g:3770:2: rule__FilterPart__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__2"


    // $ANTLR start "rule__FilterPart__Group_2__2__Impl"
    // InternalEsper2Maude.g:3776:1: rule__FilterPart__Group_2__2__Impl : ( ( rule__FilterPart__Group_2_2__0 )? ) ;
    public final void rule__FilterPart__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3780:1: ( ( ( rule__FilterPart__Group_2_2__0 )? ) )
            // InternalEsper2Maude.g:3781:1: ( ( rule__FilterPart__Group_2_2__0 )? )
            {
            // InternalEsper2Maude.g:3781:1: ( ( rule__FilterPart__Group_2_2__0 )? )
            // InternalEsper2Maude.g:3782:2: ( rule__FilterPart__Group_2_2__0 )?
            {
             before(grammarAccess.getFilterPartAccess().getGroup_2_2()); 
            // InternalEsper2Maude.g:3783:2: ( rule__FilterPart__Group_2_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==27) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalEsper2Maude.g:3783:3: rule__FilterPart__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__FilterPart__Group_2_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFilterPartAccess().getGroup_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2__2__Impl"


    // $ANTLR start "rule__FilterPart__Group_2_2__0"
    // InternalEsper2Maude.g:3792:1: rule__FilterPart__Group_2_2__0 : rule__FilterPart__Group_2_2__0__Impl rule__FilterPart__Group_2_2__1 ;
    public final void rule__FilterPart__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3796:1: ( rule__FilterPart__Group_2_2__0__Impl rule__FilterPart__Group_2_2__1 )
            // InternalEsper2Maude.g:3797:2: rule__FilterPart__Group_2_2__0__Impl rule__FilterPart__Group_2_2__1
            {
            pushFollow(FOLLOW_15);
            rule__FilterPart__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2_2__0"


    // $ANTLR start "rule__FilterPart__Group_2_2__0__Impl"
    // InternalEsper2Maude.g:3804:1: rule__FilterPart__Group_2_2__0__Impl : ( '.' ) ;
    public final void rule__FilterPart__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3808:1: ( ( '.' ) )
            // InternalEsper2Maude.g:3809:1: ( '.' )
            {
            // InternalEsper2Maude.g:3809:1: ( '.' )
            // InternalEsper2Maude.g:3810:2: '.'
            {
             before(grammarAccess.getFilterPartAccess().getFullStopKeyword_2_2_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getFullStopKeyword_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2_2__0__Impl"


    // $ANTLR start "rule__FilterPart__Group_2_2__1"
    // InternalEsper2Maude.g:3819:1: rule__FilterPart__Group_2_2__1 : rule__FilterPart__Group_2_2__1__Impl ;
    public final void rule__FilterPart__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3823:1: ( rule__FilterPart__Group_2_2__1__Impl )
            // InternalEsper2Maude.g:3824:2: rule__FilterPart__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2_2__1"


    // $ANTLR start "rule__FilterPart__Group_2_2__1__Impl"
    // InternalEsper2Maude.g:3830:1: rule__FilterPart__Group_2_2__1__Impl : ( ( rule__FilterPart__DecAssignment_2_2_1 ) ) ;
    public final void rule__FilterPart__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3834:1: ( ( ( rule__FilterPart__DecAssignment_2_2_1 ) ) )
            // InternalEsper2Maude.g:3835:1: ( ( rule__FilterPart__DecAssignment_2_2_1 ) )
            {
            // InternalEsper2Maude.g:3835:1: ( ( rule__FilterPart__DecAssignment_2_2_1 ) )
            // InternalEsper2Maude.g:3836:2: ( rule__FilterPart__DecAssignment_2_2_1 )
            {
             before(grammarAccess.getFilterPartAccess().getDecAssignment_2_2_1()); 
            // InternalEsper2Maude.g:3837:2: ( rule__FilterPart__DecAssignment_2_2_1 )
            // InternalEsper2Maude.g:3837:3: rule__FilterPart__DecAssignment_2_2_1
            {
            pushFollow(FOLLOW_2);
            rule__FilterPart__DecAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getFilterPartAccess().getDecAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__Group_2_2__1__Impl"


    // $ANTLR start "rule__NonLastSelectEntry__Group__0"
    // InternalEsper2Maude.g:3846:1: rule__NonLastSelectEntry__Group__0 : rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1 ;
    public final void rule__NonLastSelectEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3850:1: ( rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1 )
            // InternalEsper2Maude.g:3851:2: rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1
            {
            pushFollow(FOLLOW_37);
            rule__NonLastSelectEntry__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NonLastSelectEntry__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLastSelectEntry__Group__0"


    // $ANTLR start "rule__NonLastSelectEntry__Group__0__Impl"
    // InternalEsper2Maude.g:3858:1: rule__NonLastSelectEntry__Group__0__Impl : ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) ) ;
    public final void rule__NonLastSelectEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3862:1: ( ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) ) )
            // InternalEsper2Maude.g:3863:1: ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) )
            {
            // InternalEsper2Maude.g:3863:1: ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) )
            // InternalEsper2Maude.g:3864:2: ( rule__NonLastSelectEntry__EntryAssignment_0 )
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getEntryAssignment_0()); 
            // InternalEsper2Maude.g:3865:2: ( rule__NonLastSelectEntry__EntryAssignment_0 )
            // InternalEsper2Maude.g:3865:3: rule__NonLastSelectEntry__EntryAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__NonLastSelectEntry__EntryAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getNonLastSelectEntryAccess().getEntryAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLastSelectEntry__Group__0__Impl"


    // $ANTLR start "rule__NonLastSelectEntry__Group__1"
    // InternalEsper2Maude.g:3873:1: rule__NonLastSelectEntry__Group__1 : rule__NonLastSelectEntry__Group__1__Impl ;
    public final void rule__NonLastSelectEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3877:1: ( rule__NonLastSelectEntry__Group__1__Impl )
            // InternalEsper2Maude.g:3878:2: rule__NonLastSelectEntry__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NonLastSelectEntry__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLastSelectEntry__Group__1"


    // $ANTLR start "rule__NonLastSelectEntry__Group__1__Impl"
    // InternalEsper2Maude.g:3884:1: rule__NonLastSelectEntry__Group__1__Impl : ( ',' ) ;
    public final void rule__NonLastSelectEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3888:1: ( ( ',' ) )
            // InternalEsper2Maude.g:3889:1: ( ',' )
            {
            // InternalEsper2Maude.g:3889:1: ( ',' )
            // InternalEsper2Maude.g:3890:2: ','
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getCommaKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getNonLastSelectEntryAccess().getCommaKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLastSelectEntry__Group__1__Impl"


    // $ANTLR start "rule__SelectEntry__Group_0__0"
    // InternalEsper2Maude.g:3900:1: rule__SelectEntry__Group_0__0 : rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1 ;
    public final void rule__SelectEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3904:1: ( rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1 )
            // InternalEsper2Maude.g:3905:2: rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1
            {
            pushFollow(FOLLOW_38);
            rule__SelectEntry__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0__0"


    // $ANTLR start "rule__SelectEntry__Group_0__0__Impl"
    // InternalEsper2Maude.g:3912:1: rule__SelectEntry__Group_0__0__Impl : ( ( rule__SelectEntry__FieldAssignment_0_0 ) ) ;
    public final void rule__SelectEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3916:1: ( ( ( rule__SelectEntry__FieldAssignment_0_0 ) ) )
            // InternalEsper2Maude.g:3917:1: ( ( rule__SelectEntry__FieldAssignment_0_0 ) )
            {
            // InternalEsper2Maude.g:3917:1: ( ( rule__SelectEntry__FieldAssignment_0_0 ) )
            // InternalEsper2Maude.g:3918:2: ( rule__SelectEntry__FieldAssignment_0_0 )
            {
             before(grammarAccess.getSelectEntryAccess().getFieldAssignment_0_0()); 
            // InternalEsper2Maude.g:3919:2: ( rule__SelectEntry__FieldAssignment_0_0 )
            // InternalEsper2Maude.g:3919:3: rule__SelectEntry__FieldAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__FieldAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getFieldAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0__0__Impl"


    // $ANTLR start "rule__SelectEntry__Group_0__1"
    // InternalEsper2Maude.g:3927:1: rule__SelectEntry__Group_0__1 : rule__SelectEntry__Group_0__1__Impl ;
    public final void rule__SelectEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3931:1: ( rule__SelectEntry__Group_0__1__Impl )
            // InternalEsper2Maude.g:3932:2: rule__SelectEntry__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0__1"


    // $ANTLR start "rule__SelectEntry__Group_0__1__Impl"
    // InternalEsper2Maude.g:3938:1: rule__SelectEntry__Group_0__1__Impl : ( ( rule__SelectEntry__Group_0_1__0 )? ) ;
    public final void rule__SelectEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3942:1: ( ( ( rule__SelectEntry__Group_0_1__0 )? ) )
            // InternalEsper2Maude.g:3943:1: ( ( rule__SelectEntry__Group_0_1__0 )? )
            {
            // InternalEsper2Maude.g:3943:1: ( ( rule__SelectEntry__Group_0_1__0 )? )
            // InternalEsper2Maude.g:3944:2: ( rule__SelectEntry__Group_0_1__0 )?
            {
             before(grammarAccess.getSelectEntryAccess().getGroup_0_1()); 
            // InternalEsper2Maude.g:3945:2: ( rule__SelectEntry__Group_0_1__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalEsper2Maude.g:3945:3: rule__SelectEntry__Group_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectEntry__Group_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectEntryAccess().getGroup_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0__1__Impl"


    // $ANTLR start "rule__SelectEntry__Group_0_1__0"
    // InternalEsper2Maude.g:3954:1: rule__SelectEntry__Group_0_1__0 : rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1 ;
    public final void rule__SelectEntry__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3958:1: ( rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1 )
            // InternalEsper2Maude.g:3959:2: rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectEntry__Group_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0_1__0"


    // $ANTLR start "rule__SelectEntry__Group_0_1__0__Impl"
    // InternalEsper2Maude.g:3966:1: rule__SelectEntry__Group_0_1__0__Impl : ( 'as' ) ;
    public final void rule__SelectEntry__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3970:1: ( ( 'as' ) )
            // InternalEsper2Maude.g:3971:1: ( 'as' )
            {
            // InternalEsper2Maude.g:3971:1: ( 'as' )
            // InternalEsper2Maude.g:3972:2: 'as'
            {
             before(grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0_1__0__Impl"


    // $ANTLR start "rule__SelectEntry__Group_0_1__1"
    // InternalEsper2Maude.g:3981:1: rule__SelectEntry__Group_0_1__1 : rule__SelectEntry__Group_0_1__1__Impl ;
    public final void rule__SelectEntry__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3985:1: ( rule__SelectEntry__Group_0_1__1__Impl )
            // InternalEsper2Maude.g:3986:2: rule__SelectEntry__Group_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0_1__1"


    // $ANTLR start "rule__SelectEntry__Group_0_1__1__Impl"
    // InternalEsper2Maude.g:3992:1: rule__SelectEntry__Group_0_1__1__Impl : ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) ) ;
    public final void rule__SelectEntry__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:3996:1: ( ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) ) )
            // InternalEsper2Maude.g:3997:1: ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) )
            {
            // InternalEsper2Maude.g:3997:1: ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) )
            // InternalEsper2Maude.g:3998:2: ( rule__SelectEntry__AliasAssignment_0_1_1 )
            {
             before(grammarAccess.getSelectEntryAccess().getAliasAssignment_0_1_1()); 
            // InternalEsper2Maude.g:3999:2: ( rule__SelectEntry__AliasAssignment_0_1_1 )
            // InternalEsper2Maude.g:3999:3: rule__SelectEntry__AliasAssignment_0_1_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__AliasAssignment_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getAliasAssignment_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_0_1__1__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1__0"
    // InternalEsper2Maude.g:4008:1: rule__SelectEntry__Group_1__0 : rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1 ;
    public final void rule__SelectEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4012:1: ( rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1 )
            // InternalEsper2Maude.g:4013:2: rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1
            {
            pushFollow(FOLLOW_8);
            rule__SelectEntry__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__0"


    // $ANTLR start "rule__SelectEntry__Group_1__0__Impl"
    // InternalEsper2Maude.g:4020:1: rule__SelectEntry__Group_1__0__Impl : ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) ) ;
    public final void rule__SelectEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4024:1: ( ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:4025:1: ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:4025:1: ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) )
            // InternalEsper2Maude.g:4026:2: ( rule__SelectEntry__GroupOpAssignment_1_0 )
            {
             before(grammarAccess.getSelectEntryAccess().getGroupOpAssignment_1_0()); 
            // InternalEsper2Maude.g:4027:2: ( rule__SelectEntry__GroupOpAssignment_1_0 )
            // InternalEsper2Maude.g:4027:3: rule__SelectEntry__GroupOpAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__GroupOpAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getGroupOpAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__0__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1__1"
    // InternalEsper2Maude.g:4035:1: rule__SelectEntry__Group_1__1 : rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2 ;
    public final void rule__SelectEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4039:1: ( rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2 )
            // InternalEsper2Maude.g:4040:2: rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2
            {
            pushFollow(FOLLOW_39);
            rule__SelectEntry__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__1"


    // $ANTLR start "rule__SelectEntry__Group_1__1__Impl"
    // InternalEsper2Maude.g:4047:1: rule__SelectEntry__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SelectEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4051:1: ( ( '(' ) )
            // InternalEsper2Maude.g:4052:1: ( '(' )
            {
            // InternalEsper2Maude.g:4052:1: ( '(' )
            // InternalEsper2Maude.g:4053:2: '('
            {
             before(grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__1__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1__2"
    // InternalEsper2Maude.g:4062:1: rule__SelectEntry__Group_1__2 : rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3 ;
    public final void rule__SelectEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4066:1: ( rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3 )
            // InternalEsper2Maude.g:4067:2: rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3
            {
            pushFollow(FOLLOW_13);
            rule__SelectEntry__Group_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__2"


    // $ANTLR start "rule__SelectEntry__Group_1__2__Impl"
    // InternalEsper2Maude.g:4074:1: rule__SelectEntry__Group_1__2__Impl : ( ( rule__SelectEntry__FieldAssignment_1_2 ) ) ;
    public final void rule__SelectEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4078:1: ( ( ( rule__SelectEntry__FieldAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:4079:1: ( ( rule__SelectEntry__FieldAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:4079:1: ( ( rule__SelectEntry__FieldAssignment_1_2 ) )
            // InternalEsper2Maude.g:4080:2: ( rule__SelectEntry__FieldAssignment_1_2 )
            {
             before(grammarAccess.getSelectEntryAccess().getFieldAssignment_1_2()); 
            // InternalEsper2Maude.g:4081:2: ( rule__SelectEntry__FieldAssignment_1_2 )
            // InternalEsper2Maude.g:4081:3: rule__SelectEntry__FieldAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__FieldAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getFieldAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__2__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1__3"
    // InternalEsper2Maude.g:4089:1: rule__SelectEntry__Group_1__3 : rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4 ;
    public final void rule__SelectEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4093:1: ( rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4 )
            // InternalEsper2Maude.g:4094:2: rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4
            {
            pushFollow(FOLLOW_38);
            rule__SelectEntry__Group_1__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__3"


    // $ANTLR start "rule__SelectEntry__Group_1__3__Impl"
    // InternalEsper2Maude.g:4101:1: rule__SelectEntry__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SelectEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4105:1: ( ( ')' ) )
            // InternalEsper2Maude.g:4106:1: ( ')' )
            {
            // InternalEsper2Maude.g:4106:1: ( ')' )
            // InternalEsper2Maude.g:4107:2: ')'
            {
             before(grammarAccess.getSelectEntryAccess().getRightParenthesisKeyword_1_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getRightParenthesisKeyword_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__3__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1__4"
    // InternalEsper2Maude.g:4116:1: rule__SelectEntry__Group_1__4 : rule__SelectEntry__Group_1__4__Impl ;
    public final void rule__SelectEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4120:1: ( rule__SelectEntry__Group_1__4__Impl )
            // InternalEsper2Maude.g:4121:2: rule__SelectEntry__Group_1__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__4"


    // $ANTLR start "rule__SelectEntry__Group_1__4__Impl"
    // InternalEsper2Maude.g:4127:1: rule__SelectEntry__Group_1__4__Impl : ( ( rule__SelectEntry__Group_1_4__0 )? ) ;
    public final void rule__SelectEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4131:1: ( ( ( rule__SelectEntry__Group_1_4__0 )? ) )
            // InternalEsper2Maude.g:4132:1: ( ( rule__SelectEntry__Group_1_4__0 )? )
            {
            // InternalEsper2Maude.g:4132:1: ( ( rule__SelectEntry__Group_1_4__0 )? )
            // InternalEsper2Maude.g:4133:2: ( rule__SelectEntry__Group_1_4__0 )?
            {
             before(grammarAccess.getSelectEntryAccess().getGroup_1_4()); 
            // InternalEsper2Maude.g:4134:2: ( rule__SelectEntry__Group_1_4__0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==33) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalEsper2Maude.g:4134:3: rule__SelectEntry__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__SelectEntry__Group_1_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSelectEntryAccess().getGroup_1_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1__4__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1_4__0"
    // InternalEsper2Maude.g:4143:1: rule__SelectEntry__Group_1_4__0 : rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1 ;
    public final void rule__SelectEntry__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4147:1: ( rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1 )
            // InternalEsper2Maude.g:4148:2: rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1
            {
            pushFollow(FOLLOW_7);
            rule__SelectEntry__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1_4__0"


    // $ANTLR start "rule__SelectEntry__Group_1_4__0__Impl"
    // InternalEsper2Maude.g:4155:1: rule__SelectEntry__Group_1_4__0__Impl : ( 'as' ) ;
    public final void rule__SelectEntry__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4159:1: ( ( 'as' ) )
            // InternalEsper2Maude.g:4160:1: ( 'as' )
            {
            // InternalEsper2Maude.g:4160:1: ( 'as' )
            // InternalEsper2Maude.g:4161:2: 'as'
            {
             before(grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1_4__0__Impl"


    // $ANTLR start "rule__SelectEntry__Group_1_4__1"
    // InternalEsper2Maude.g:4170:1: rule__SelectEntry__Group_1_4__1 : rule__SelectEntry__Group_1_4__1__Impl ;
    public final void rule__SelectEntry__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4174:1: ( rule__SelectEntry__Group_1_4__1__Impl )
            // InternalEsper2Maude.g:4175:2: rule__SelectEntry__Group_1_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__Group_1_4__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1_4__1"


    // $ANTLR start "rule__SelectEntry__Group_1_4__1__Impl"
    // InternalEsper2Maude.g:4181:1: rule__SelectEntry__Group_1_4__1__Impl : ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) ) ;
    public final void rule__SelectEntry__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4185:1: ( ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) ) )
            // InternalEsper2Maude.g:4186:1: ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) )
            {
            // InternalEsper2Maude.g:4186:1: ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) )
            // InternalEsper2Maude.g:4187:2: ( rule__SelectEntry__AliasAssignment_1_4_1 )
            {
             before(grammarAccess.getSelectEntryAccess().getAliasAssignment_1_4_1()); 
            // InternalEsper2Maude.g:4188:2: ( rule__SelectEntry__AliasAssignment_1_4_1 )
            // InternalEsper2Maude.g:4188:3: rule__SelectEntry__AliasAssignment_1_4_1
            {
            pushFollow(FOLLOW_2);
            rule__SelectEntry__AliasAssignment_1_4_1();

            state._fsp--;


            }

             after(grammarAccess.getSelectEntryAccess().getAliasAssignment_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__Group_1_4__1__Impl"


    // $ANTLR start "rule__Field__Group_1__0"
    // InternalEsper2Maude.g:4197:1: rule__Field__Group_1__0 : rule__Field__Group_1__0__Impl rule__Field__Group_1__1 ;
    public final void rule__Field__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4201:1: ( rule__Field__Group_1__0__Impl rule__Field__Group_1__1 )
            // InternalEsper2Maude.g:4202:2: rule__Field__Group_1__0__Impl rule__Field__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Field__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__0"


    // $ANTLR start "rule__Field__Group_1__0__Impl"
    // InternalEsper2Maude.g:4209:1: rule__Field__Group_1__0__Impl : ( ( rule__Field__EventVariableAssignment_1_0 ) ) ;
    public final void rule__Field__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4213:1: ( ( ( rule__Field__EventVariableAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:4214:1: ( ( rule__Field__EventVariableAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:4214:1: ( ( rule__Field__EventVariableAssignment_1_0 ) )
            // InternalEsper2Maude.g:4215:2: ( rule__Field__EventVariableAssignment_1_0 )
            {
             before(grammarAccess.getFieldAccess().getEventVariableAssignment_1_0()); 
            // InternalEsper2Maude.g:4216:2: ( rule__Field__EventVariableAssignment_1_0 )
            // InternalEsper2Maude.g:4216:3: rule__Field__EventVariableAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__EventVariableAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getEventVariableAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__0__Impl"


    // $ANTLR start "rule__Field__Group_1__1"
    // InternalEsper2Maude.g:4224:1: rule__Field__Group_1__1 : rule__Field__Group_1__1__Impl rule__Field__Group_1__2 ;
    public final void rule__Field__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4228:1: ( rule__Field__Group_1__1__Impl rule__Field__Group_1__2 )
            // InternalEsper2Maude.g:4229:2: rule__Field__Group_1__1__Impl rule__Field__Group_1__2
            {
            pushFollow(FOLLOW_7);
            rule__Field__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__1"


    // $ANTLR start "rule__Field__Group_1__1__Impl"
    // InternalEsper2Maude.g:4236:1: rule__Field__Group_1__1__Impl : ( '.' ) ;
    public final void rule__Field__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4240:1: ( ( '.' ) )
            // InternalEsper2Maude.g:4241:1: ( '.' )
            {
            // InternalEsper2Maude.g:4241:1: ( '.' )
            // InternalEsper2Maude.g:4242:2: '.'
            {
             before(grammarAccess.getFieldAccess().getFullStopKeyword_1_1()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getFullStopKeyword_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__1__Impl"


    // $ANTLR start "rule__Field__Group_1__2"
    // InternalEsper2Maude.g:4251:1: rule__Field__Group_1__2 : rule__Field__Group_1__2__Impl ;
    public final void rule__Field__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4255:1: ( rule__Field__Group_1__2__Impl )
            // InternalEsper2Maude.g:4256:2: rule__Field__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__2"


    // $ANTLR start "rule__Field__Group_1__2__Impl"
    // InternalEsper2Maude.g:4262:1: rule__Field__Group_1__2__Impl : ( ( rule__Field__EventPropNameAssignment_1_2 ) ) ;
    public final void rule__Field__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4266:1: ( ( ( rule__Field__EventPropNameAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:4267:1: ( ( rule__Field__EventPropNameAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:4267:1: ( ( rule__Field__EventPropNameAssignment_1_2 ) )
            // InternalEsper2Maude.g:4268:2: ( rule__Field__EventPropNameAssignment_1_2 )
            {
             before(grammarAccess.getFieldAccess().getEventPropNameAssignment_1_2()); 
            // InternalEsper2Maude.g:4269:2: ( rule__Field__EventPropNameAssignment_1_2 )
            // InternalEsper2Maude.g:4269:3: rule__Field__EventPropNameAssignment_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__EventPropNameAssignment_1_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getEventPropNameAssignment_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__Group_1__2__Impl"


    // $ANTLR start "rule__Model__SchemasAssignment_0"
    // InternalEsper2Maude.g:4278:1: rule__Model__SchemasAssignment_0 : ( ruleSchema ) ;
    public final void rule__Model__SchemasAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4282:1: ( ( ruleSchema ) )
            // InternalEsper2Maude.g:4283:2: ( ruleSchema )
            {
            // InternalEsper2Maude.g:4283:2: ( ruleSchema )
            // InternalEsper2Maude.g:4284:3: ruleSchema
            {
             before(grammarAccess.getModelAccess().getSchemasSchemaParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSchema();

            state._fsp--;

             after(grammarAccess.getModelAccess().getSchemasSchemaParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__SchemasAssignment_0"


    // $ANTLR start "rule__Model__PatternsAssignment_1"
    // InternalEsper2Maude.g:4293:1: rule__Model__PatternsAssignment_1 : ( rulePattern ) ;
    public final void rule__Model__PatternsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4297:1: ( ( rulePattern ) )
            // InternalEsper2Maude.g:4298:2: ( rulePattern )
            {
            // InternalEsper2Maude.g:4298:2: ( rulePattern )
            // InternalEsper2Maude.g:4299:3: rulePattern
            {
             before(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Model__PatternsAssignment_1"


    // $ANTLR start "rule__Schema__NameAssignment_2"
    // InternalEsper2Maude.g:4308:1: rule__Schema__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Schema__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4312:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4313:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4313:2: ( RULE_ID )
            // InternalEsper2Maude.g:4314:3: RULE_ID
            {
             before(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__NameAssignment_2"


    // $ANTLR start "rule__Schema__PropAssignment_4"
    // InternalEsper2Maude.g:4323:1: rule__Schema__PropAssignment_4 : ( ruleEventProperty ) ;
    public final void rule__Schema__PropAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4327:1: ( ( ruleEventProperty ) )
            // InternalEsper2Maude.g:4328:2: ( ruleEventProperty )
            {
            // InternalEsper2Maude.g:4328:2: ( ruleEventProperty )
            // InternalEsper2Maude.g:4329:3: ruleEventProperty
            {
             before(grammarAccess.getSchemaAccess().getPropEventPropertyParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEventProperty();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getPropEventPropertyParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__PropAssignment_4"


    // $ANTLR start "rule__Schema__PropsAssignment_5_1"
    // InternalEsper2Maude.g:4338:1: rule__Schema__PropsAssignment_5_1 : ( ruleEventProperty ) ;
    public final void rule__Schema__PropsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4342:1: ( ( ruleEventProperty ) )
            // InternalEsper2Maude.g:4343:2: ( ruleEventProperty )
            {
            // InternalEsper2Maude.g:4343:2: ( ruleEventProperty )
            // InternalEsper2Maude.g:4344:3: ruleEventProperty
            {
             before(grammarAccess.getSchemaAccess().getPropsEventPropertyParserRuleCall_5_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEventProperty();

            state._fsp--;

             after(grammarAccess.getSchemaAccess().getPropsEventPropertyParserRuleCall_5_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Schema__PropsAssignment_5_1"


    // $ANTLR start "rule__EventProperty__NameAssignment_0"
    // InternalEsper2Maude.g:4353:1: rule__EventProperty__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__EventProperty__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4357:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4358:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4358:2: ( RULE_ID )
            // InternalEsper2Maude.g:4359:3: RULE_ID
            {
             before(grammarAccess.getEventPropertyAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventPropertyAccess().getNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__NameAssignment_0"


    // $ANTLR start "rule__EventProperty__TypeAssignment_1"
    // InternalEsper2Maude.g:4368:1: rule__EventProperty__TypeAssignment_1 : ( RULE_PROP_TYPE ) ;
    public final void rule__EventProperty__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4372:1: ( ( RULE_PROP_TYPE ) )
            // InternalEsper2Maude.g:4373:2: ( RULE_PROP_TYPE )
            {
            // InternalEsper2Maude.g:4373:2: ( RULE_PROP_TYPE )
            // InternalEsper2Maude.g:4374:3: RULE_PROP_TYPE
            {
             before(grammarAccess.getEventPropertyAccess().getTypePROP_TYPETerminalRuleCall_1_0()); 
            match(input,RULE_PROP_TYPE,FOLLOW_2); 
             after(grammarAccess.getEventPropertyAccess().getTypePROP_TYPETerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EventProperty__TypeAssignment_1"


    // $ANTLR start "rule__Pattern__NameAssignment_2"
    // InternalEsper2Maude.g:4383:1: rule__Pattern__NameAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Pattern__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4387:1: ( ( RULE_STRING ) )
            // InternalEsper2Maude.g:4388:2: ( RULE_STRING )
            {
            // InternalEsper2Maude.g:4388:2: ( RULE_STRING )
            // InternalEsper2Maude.g:4389:3: RULE_STRING
            {
             before(grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NameAssignment_2"


    // $ANTLR start "rule__Pattern__NumAssignment_6"
    // InternalEsper2Maude.g:4398:1: rule__Pattern__NumAssignment_6 : ( RULE_INT ) ;
    public final void rule__Pattern__NumAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4402:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:4403:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:4403:2: ( RULE_INT )
            // InternalEsper2Maude.g:4404:3: RULE_INT
            {
             before(grammarAccess.getPatternAccess().getNumINTTerminalRuleCall_6_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNumINTTerminalRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__NumAssignment_6"


    // $ANTLR start "rule__Pattern__EventAssignment_10"
    // InternalEsper2Maude.g:4413:1: rule__Pattern__EventAssignment_10 : ( ruleEvent ) ;
    public final void rule__Pattern__EventAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4417:1: ( ( ruleEvent ) )
            // InternalEsper2Maude.g:4418:2: ( ruleEvent )
            {
            // InternalEsper2Maude.g:4418:2: ( ruleEvent )
            // InternalEsper2Maude.g:4419:3: ruleEvent
            {
             before(grammarAccess.getPatternAccess().getEventEventParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEvent();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getEventEventParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__EventAssignment_10"


    // $ANTLR start "rule__Pattern__SelectEntriesAssignment_12"
    // InternalEsper2Maude.g:4428:1: rule__Pattern__SelectEntriesAssignment_12 : ( ruleNonLastSelectEntry ) ;
    public final void rule__Pattern__SelectEntriesAssignment_12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4432:1: ( ( ruleNonLastSelectEntry ) )
            // InternalEsper2Maude.g:4433:2: ( ruleNonLastSelectEntry )
            {
            // InternalEsper2Maude.g:4433:2: ( ruleNonLastSelectEntry )
            // InternalEsper2Maude.g:4434:3: ruleNonLastSelectEntry
            {
             before(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_12_0()); 
            pushFollow(FOLLOW_2);
            ruleNonLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__SelectEntriesAssignment_12"


    // $ANTLR start "rule__Pattern__SelectEntryAssignment_13"
    // InternalEsper2Maude.g:4443:1: rule__Pattern__SelectEntryAssignment_13 : ( ruleLastSelectEntry ) ;
    public final void rule__Pattern__SelectEntryAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4447:1: ( ( ruleLastSelectEntry ) )
            // InternalEsper2Maude.g:4448:2: ( ruleLastSelectEntry )
            {
            // InternalEsper2Maude.g:4448:2: ( ruleLastSelectEntry )
            // InternalEsper2Maude.g:4449:3: ruleLastSelectEntry
            {
             before(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_13_0()); 
            pushFollow(FOLLOW_2);
            ruleLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__SelectEntryAssignment_13"


    // $ANTLR start "rule__Pattern__FromFilterAssignment_17"
    // InternalEsper2Maude.g:4458:1: rule__Pattern__FromFilterAssignment_17 : ( ruleFilterFrom ) ;
    public final void rule__Pattern__FromFilterAssignment_17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4462:1: ( ( ruleFilterFrom ) )
            // InternalEsper2Maude.g:4463:2: ( ruleFilterFrom )
            {
            // InternalEsper2Maude.g:4463:2: ( ruleFilterFrom )
            // InternalEsper2Maude.g:4464:3: ruleFilterFrom
            {
             before(grammarAccess.getPatternAccess().getFromFilterFilterFromParserRuleCall_17_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterFrom();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getFromFilterFilterFromParserRuleCall_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__FromFilterAssignment_17"


    // $ANTLR start "rule__Pattern__WinAssignment_19_1"
    // InternalEsper2Maude.g:4473:1: rule__Pattern__WinAssignment_19_1 : ( ruleWindow ) ;
    public final void rule__Pattern__WinAssignment_19_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4477:1: ( ( ruleWindow ) )
            // InternalEsper2Maude.g:4478:2: ( ruleWindow )
            {
            // InternalEsper2Maude.g:4478:2: ( ruleWindow )
            // InternalEsper2Maude.g:4479:3: ruleWindow
            {
             before(grammarAccess.getPatternAccess().getWinWindowParserRuleCall_19_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWindow();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getWinWindowParserRuleCall_19_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pattern__WinAssignment_19_1"


    // $ANTLR start "rule__Window__TypeTimeAssignment_0_0"
    // InternalEsper2Maude.g:4488:1: rule__Window__TypeTimeAssignment_0_0 : ( ( 'win:time' ) ) ;
    public final void rule__Window__TypeTimeAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4492:1: ( ( ( 'win:time' ) ) )
            // InternalEsper2Maude.g:4493:2: ( ( 'win:time' ) )
            {
            // InternalEsper2Maude.g:4493:2: ( ( 'win:time' ) )
            // InternalEsper2Maude.g:4494:3: ( 'win:time' )
            {
             before(grammarAccess.getWindowAccess().getTypeTimeWinTimeKeyword_0_0_0()); 
            // InternalEsper2Maude.g:4495:3: ( 'win:time' )
            // InternalEsper2Maude.g:4496:4: 'win:time'
            {
             before(grammarAccess.getWindowAccess().getTypeTimeWinTimeKeyword_0_0_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getTypeTimeWinTimeKeyword_0_0_0()); 

            }

             after(grammarAccess.getWindowAccess().getTypeTimeWinTimeKeyword_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__TypeTimeAssignment_0_0"


    // $ANTLR start "rule__Window__NumAssignment_0_2"
    // InternalEsper2Maude.g:4507:1: rule__Window__NumAssignment_0_2 : ( RULE_INT ) ;
    public final void rule__Window__NumAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4511:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:4512:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:4512:2: ( RULE_INT )
            // InternalEsper2Maude.g:4513:3: RULE_INT
            {
             before(grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_0_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NumAssignment_0_2"


    // $ANTLR start "rule__Window__TypeBatchAssignment_1_0"
    // InternalEsper2Maude.g:4522:1: rule__Window__TypeBatchAssignment_1_0 : ( ( 'win:time_batch' ) ) ;
    public final void rule__Window__TypeBatchAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4526:1: ( ( ( 'win:time_batch' ) ) )
            // InternalEsper2Maude.g:4527:2: ( ( 'win:time_batch' ) )
            {
            // InternalEsper2Maude.g:4527:2: ( ( 'win:time_batch' ) )
            // InternalEsper2Maude.g:4528:3: ( 'win:time_batch' )
            {
             before(grammarAccess.getWindowAccess().getTypeBatchWinTime_batchKeyword_1_0_0()); 
            // InternalEsper2Maude.g:4529:3: ( 'win:time_batch' )
            // InternalEsper2Maude.g:4530:4: 'win:time_batch'
            {
             before(grammarAccess.getWindowAccess().getTypeBatchWinTime_batchKeyword_1_0_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getTypeBatchWinTime_batchKeyword_1_0_0()); 

            }

             after(grammarAccess.getWindowAccess().getTypeBatchWinTime_batchKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__TypeBatchAssignment_1_0"


    // $ANTLR start "rule__Window__NumAssignment_1_2"
    // InternalEsper2Maude.g:4541:1: rule__Window__NumAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__Window__NumAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4545:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:4546:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:4546:2: ( RULE_INT )
            // InternalEsper2Maude.g:4547:3: RULE_INT
            {
             before(grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Window__NumAssignment_1_2"


    // $ANTLR start "rule__WhereFilter__FilterEventLAssignment_0_0"
    // InternalEsper2Maude.g:4556:1: rule__WhereFilter__FilterEventLAssignment_0_0 : ( ruleFilterEvent ) ;
    public final void rule__WhereFilter__FilterEventLAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4560:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4561:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4561:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4562:3: ruleFilterEvent
            {
             before(grammarAccess.getWhereFilterAccess().getFilterEventLFilterEventParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getWhereFilterAccess().getFilterEventLFilterEventParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__FilterEventLAssignment_0_0"


    // $ANTLR start "rule__WhereFilter__FilterOpLAssignment_0_1"
    // InternalEsper2Maude.g:4571:1: rule__WhereFilter__FilterOpLAssignment_0_1 : ( ruleFilterOperator ) ;
    public final void rule__WhereFilter__FilterOpLAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4575:1: ( ( ruleFilterOperator ) )
            // InternalEsper2Maude.g:4576:2: ( ruleFilterOperator )
            {
            // InternalEsper2Maude.g:4576:2: ( ruleFilterOperator )
            // InternalEsper2Maude.g:4577:3: ruleFilterOperator
            {
             before(grammarAccess.getWhereFilterAccess().getFilterOpLFilterOperatorParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterOperator();

            state._fsp--;

             after(grammarAccess.getWhereFilterAccess().getFilterOpLFilterOperatorParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__FilterOpLAssignment_0_1"


    // $ANTLR start "rule__WhereFilter__TimerAssignment_1_0"
    // InternalEsper2Maude.g:4586:1: rule__WhereFilter__TimerAssignment_1_0 : ( ( 'timer:within' ) ) ;
    public final void rule__WhereFilter__TimerAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4590:1: ( ( ( 'timer:within' ) ) )
            // InternalEsper2Maude.g:4591:2: ( ( 'timer:within' ) )
            {
            // InternalEsper2Maude.g:4591:2: ( ( 'timer:within' ) )
            // InternalEsper2Maude.g:4592:3: ( 'timer:within' )
            {
             before(grammarAccess.getWhereFilterAccess().getTimerTimerWithinKeyword_1_0_0()); 
            // InternalEsper2Maude.g:4593:3: ( 'timer:within' )
            // InternalEsper2Maude.g:4594:4: 'timer:within'
            {
             before(grammarAccess.getWhereFilterAccess().getTimerTimerWithinKeyword_1_0_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getWhereFilterAccess().getTimerTimerWithinKeyword_1_0_0()); 

            }

             after(grammarAccess.getWhereFilterAccess().getTimerTimerWithinKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__TimerAssignment_1_0"


    // $ANTLR start "rule__WhereFilter__NumAssignment_1_2"
    // InternalEsper2Maude.g:4605:1: rule__WhereFilter__NumAssignment_1_2 : ( RULE_INT ) ;
    public final void rule__WhereFilter__NumAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4609:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:4610:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:4610:2: ( RULE_INT )
            // InternalEsper2Maude.g:4611:3: RULE_INT
            {
             before(grammarAccess.getWhereFilterAccess().getNumINTTerminalRuleCall_1_2_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getWhereFilterAccess().getNumINTTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__NumAssignment_1_2"


    // $ANTLR start "rule__WhereFilter__FilterOpRAssignment_2_0"
    // InternalEsper2Maude.g:4620:1: rule__WhereFilter__FilterOpRAssignment_2_0 : ( ruleFilterOperator ) ;
    public final void rule__WhereFilter__FilterOpRAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4624:1: ( ( ruleFilterOperator ) )
            // InternalEsper2Maude.g:4625:2: ( ruleFilterOperator )
            {
            // InternalEsper2Maude.g:4625:2: ( ruleFilterOperator )
            // InternalEsper2Maude.g:4626:3: ruleFilterOperator
            {
             before(grammarAccess.getWhereFilterAccess().getFilterOpRFilterOperatorParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterOperator();

            state._fsp--;

             after(grammarAccess.getWhereFilterAccess().getFilterOpRFilterOperatorParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__FilterOpRAssignment_2_0"


    // $ANTLR start "rule__WhereFilter__FilterEventRAssignment_2_1"
    // InternalEsper2Maude.g:4635:1: rule__WhereFilter__FilterEventRAssignment_2_1 : ( ruleFilterEvent ) ;
    public final void rule__WhereFilter__FilterEventRAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4639:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4640:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4640:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4641:3: ruleFilterEvent
            {
             before(grammarAccess.getWhereFilterAccess().getFilterEventRFilterEventParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getWhereFilterAccess().getFilterEventRFilterEventParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__WhereFilter__FilterEventRAssignment_2_1"


    // $ANTLR start "rule__FilterFrom__FollowedByAssignment_0"
    // InternalEsper2Maude.g:4650:1: rule__FilterFrom__FollowedByAssignment_0 : ( ruleFollowedBy ) ;
    public final void rule__FilterFrom__FollowedByAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4654:1: ( ( ruleFollowedBy ) )
            // InternalEsper2Maude.g:4655:2: ( ruleFollowedBy )
            {
            // InternalEsper2Maude.g:4655:2: ( ruleFollowedBy )
            // InternalEsper2Maude.g:4656:3: ruleFollowedBy
            {
             before(grammarAccess.getFilterFromAccess().getFollowedByFollowedByParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFollowedBy();

            state._fsp--;

             after(grammarAccess.getFilterFromAccess().getFollowedByFollowedByParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__FollowedByAssignment_0"


    // $ANTLR start "rule__FilterFrom__LeftAssignment_1_1"
    // InternalEsper2Maude.g:4665:1: rule__FilterFrom__LeftAssignment_1_1 : ( ruleFilterFrom ) ;
    public final void rule__FilterFrom__LeftAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4669:1: ( ( ruleFilterFrom ) )
            // InternalEsper2Maude.g:4670:2: ( ruleFilterFrom )
            {
            // InternalEsper2Maude.g:4670:2: ( ruleFilterFrom )
            // InternalEsper2Maude.g:4671:3: ruleFilterFrom
            {
             before(grammarAccess.getFilterFromAccess().getLeftFilterFromParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterFrom();

            state._fsp--;

             after(grammarAccess.getFilterFromAccess().getLeftFilterFromParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__LeftAssignment_1_1"


    // $ANTLR start "rule__FilterFrom__OpAssignment_1_2"
    // InternalEsper2Maude.g:4680:1: rule__FilterFrom__OpAssignment_1_2 : ( ruleLogicalOperator ) ;
    public final void rule__FilterFrom__OpAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4684:1: ( ( ruleLogicalOperator ) )
            // InternalEsper2Maude.g:4685:2: ( ruleLogicalOperator )
            {
            // InternalEsper2Maude.g:4685:2: ( ruleLogicalOperator )
            // InternalEsper2Maude.g:4686:3: ruleLogicalOperator
            {
             before(grammarAccess.getFilterFromAccess().getOpLogicalOperatorParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getFilterFromAccess().getOpLogicalOperatorParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__OpAssignment_1_2"


    // $ANTLR start "rule__FilterFrom__RightAssignment_1_3"
    // InternalEsper2Maude.g:4695:1: rule__FilterFrom__RightAssignment_1_3 : ( ruleFilterFrom ) ;
    public final void rule__FilterFrom__RightAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4699:1: ( ( ruleFilterFrom ) )
            // InternalEsper2Maude.g:4700:2: ( ruleFilterFrom )
            {
            // InternalEsper2Maude.g:4700:2: ( ruleFilterFrom )
            // InternalEsper2Maude.g:4701:3: ruleFilterFrom
            {
             before(grammarAccess.getFilterFromAccess().getRightFilterFromParserRuleCall_1_3_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterFrom();

            state._fsp--;

             after(grammarAccess.getFilterFromAccess().getRightFilterFromParserRuleCall_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__RightAssignment_1_3"


    // $ANTLR start "rule__FilterFrom__EventVariableAssignment_2_1_0"
    // InternalEsper2Maude.g:4710:1: rule__FilterFrom__EventVariableAssignment_2_1_0 : ( RULE_ID ) ;
    public final void rule__FilterFrom__EventVariableAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4714:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4715:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4715:2: ( RULE_ID )
            // InternalEsper2Maude.g:4716:3: RULE_ID
            {
             before(grammarAccess.getFilterFromAccess().getEventVariableIDTerminalRuleCall_2_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getEventVariableIDTerminalRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__EventVariableAssignment_2_1_0"


    // $ANTLR start "rule__FilterFrom__EventNameAssignment_2_2"
    // InternalEsper2Maude.g:4725:1: rule__FilterFrom__EventNameAssignment_2_2 : ( RULE_ID ) ;
    public final void rule__FilterFrom__EventNameAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4729:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4730:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4730:2: ( RULE_ID )
            // InternalEsper2Maude.g:4731:3: RULE_ID
            {
             before(grammarAccess.getFilterFromAccess().getEventNameIDTerminalRuleCall_2_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterFromAccess().getEventNameIDTerminalRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__EventNameAssignment_2_2"


    // $ANTLR start "rule__FilterFrom__FilterAssignment_2_3_1"
    // InternalEsper2Maude.g:4740:1: rule__FilterFrom__FilterAssignment_2_3_1 : ( ruleFilterEvent ) ;
    public final void rule__FilterFrom__FilterAssignment_2_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4744:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4745:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4745:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4746:3: ruleFilterEvent
            {
             before(grammarAccess.getFilterFromAccess().getFilterFilterEventParserRuleCall_2_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getFilterFromAccess().getFilterFilterEventParserRuleCall_2_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterFrom__FilterAssignment_2_3_1"


    // $ANTLR start "rule__FollowedBy__LeftAssignment_0"
    // InternalEsper2Maude.g:4755:1: rule__FollowedBy__LeftAssignment_0 : ( ruleSubFilterFollowedBy ) ;
    public final void rule__FollowedBy__LeftAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4759:1: ( ( ruleSubFilterFollowedBy ) )
            // InternalEsper2Maude.g:4760:2: ( ruleSubFilterFollowedBy )
            {
            // InternalEsper2Maude.g:4760:2: ( ruleSubFilterFollowedBy )
            // InternalEsper2Maude.g:4761:3: ruleSubFilterFollowedBy
            {
             before(grammarAccess.getFollowedByAccess().getLeftSubFilterFollowedByParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSubFilterFollowedBy();

            state._fsp--;

             after(grammarAccess.getFollowedByAccess().getLeftSubFilterFollowedByParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__LeftAssignment_0"


    // $ANTLR start "rule__FollowedBy__RightAssignment_2"
    // InternalEsper2Maude.g:4770:1: rule__FollowedBy__RightAssignment_2 : ( ruleSubFilterFollowedBy ) ;
    public final void rule__FollowedBy__RightAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4774:1: ( ( ruleSubFilterFollowedBy ) )
            // InternalEsper2Maude.g:4775:2: ( ruleSubFilterFollowedBy )
            {
            // InternalEsper2Maude.g:4775:2: ( ruleSubFilterFollowedBy )
            // InternalEsper2Maude.g:4776:3: ruleSubFilterFollowedBy
            {
             before(grammarAccess.getFollowedByAccess().getRightSubFilterFollowedByParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleSubFilterFollowedBy();

            state._fsp--;

             after(grammarAccess.getFollowedByAccess().getRightSubFilterFollowedByParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__RightAssignment_2"


    // $ANTLR start "rule__FollowedBy__WhereFilterAssignment_3_1"
    // InternalEsper2Maude.g:4785:1: rule__FollowedBy__WhereFilterAssignment_3_1 : ( ruleWhereFilter ) ;
    public final void rule__FollowedBy__WhereFilterAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4789:1: ( ( ruleWhereFilter ) )
            // InternalEsper2Maude.g:4790:2: ( ruleWhereFilter )
            {
            // InternalEsper2Maude.g:4790:2: ( ruleWhereFilter )
            // InternalEsper2Maude.g:4791:3: ruleWhereFilter
            {
             before(grammarAccess.getFollowedByAccess().getWhereFilterWhereFilterParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleWhereFilter();

            state._fsp--;

             after(grammarAccess.getFollowedByAccess().getWhereFilterWhereFilterParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FollowedBy__WhereFilterAssignment_3_1"


    // $ANTLR start "rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0"
    // InternalEsper2Maude.g:4800:1: rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0 : ( RULE_ID ) ;
    public final void rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4804:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4805:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4805:2: ( RULE_ID )
            // InternalEsper2Maude.g:4806:3: RULE_ID
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEventVariableIDTerminalRuleCall_0_0_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getEventVariableIDTerminalRuleCall_0_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0"


    // $ANTLR start "rule__SubFilterFollowedBy__EventNameAssignment_0_1"
    // InternalEsper2Maude.g:4815:1: rule__SubFilterFollowedBy__EventNameAssignment_0_1 : ( RULE_ID ) ;
    public final void rule__SubFilterFollowedBy__EventNameAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4819:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4820:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4820:2: ( RULE_ID )
            // InternalEsper2Maude.g:4821:3: RULE_ID
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEventNameIDTerminalRuleCall_0_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSubFilterFollowedByAccess().getEventNameIDTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__EventNameAssignment_0_1"


    // $ANTLR start "rule__SubFilterFollowedBy__FilterAssignment_0_2_1"
    // InternalEsper2Maude.g:4830:1: rule__SubFilterFollowedBy__FilterAssignment_0_2_1 : ( ruleFilterEvent ) ;
    public final void rule__SubFilterFollowedBy__FilterAssignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4834:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4835:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4835:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4836:3: ruleFilterEvent
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__FilterAssignment_0_2_1"


    // $ANTLR start "rule__SubFilterFollowedBy__FilterAssignment_1_1"
    // InternalEsper2Maude.g:4845:1: rule__SubFilterFollowedBy__FilterAssignment_1_1 : ( ruleFilterEvent ) ;
    public final void rule__SubFilterFollowedBy__FilterAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4849:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4850:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4850:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4851:3: ruleFilterEvent
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__FilterAssignment_1_1"


    // $ANTLR start "rule__SubFilterFollowedBy__EveryAssignment_2"
    // InternalEsper2Maude.g:4860:1: rule__SubFilterFollowedBy__EveryAssignment_2 : ( ruleEvery ) ;
    public final void rule__SubFilterFollowedBy__EveryAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4864:1: ( ( ruleEvery ) )
            // InternalEsper2Maude.g:4865:2: ( ruleEvery )
            {
            // InternalEsper2Maude.g:4865:2: ( ruleEvery )
            // InternalEsper2Maude.g:4866:3: ruleEvery
            {
             before(grammarAccess.getSubFilterFollowedByAccess().getEveryEveryParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEvery();

            state._fsp--;

             after(grammarAccess.getSubFilterFollowedByAccess().getEveryEveryParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SubFilterFollowedBy__EveryAssignment_2"


    // $ANTLR start "rule__Every__EventVariableAssignment_0_1_0"
    // InternalEsper2Maude.g:4875:1: rule__Every__EventVariableAssignment_0_1_0 : ( RULE_ID ) ;
    public final void rule__Every__EventVariableAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4879:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4880:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4880:2: ( RULE_ID )
            // InternalEsper2Maude.g:4881:3: RULE_ID
            {
             before(grammarAccess.getEveryAccess().getEventVariableIDTerminalRuleCall_0_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getEventVariableIDTerminalRuleCall_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__EventVariableAssignment_0_1_0"


    // $ANTLR start "rule__Every__EventNameAssignment_0_2"
    // InternalEsper2Maude.g:4890:1: rule__Every__EventNameAssignment_0_2 : ( RULE_ID ) ;
    public final void rule__Every__EventNameAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4894:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4895:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4895:2: ( RULE_ID )
            // InternalEsper2Maude.g:4896:3: RULE_ID
            {
             before(grammarAccess.getEveryAccess().getEventNameIDTerminalRuleCall_0_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEveryAccess().getEventNameIDTerminalRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__EventNameAssignment_0_2"


    // $ANTLR start "rule__Every__FilterAssignment_0_3_1"
    // InternalEsper2Maude.g:4905:1: rule__Every__FilterAssignment_0_3_1 : ( ruleFilterEvent ) ;
    public final void rule__Every__FilterAssignment_0_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4909:1: ( ( ruleFilterEvent ) )
            // InternalEsper2Maude.g:4910:2: ( ruleFilterEvent )
            {
            // InternalEsper2Maude.g:4910:2: ( ruleFilterEvent )
            // InternalEsper2Maude.g:4911:3: ruleFilterEvent
            {
             before(grammarAccess.getEveryAccess().getFilterFilterEventParserRuleCall_0_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterEvent();

            state._fsp--;

             after(grammarAccess.getEveryAccess().getFilterFilterEventParserRuleCall_0_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__FilterAssignment_0_3_1"


    // $ANTLR start "rule__Every__FilterFromAssignment_1_2"
    // InternalEsper2Maude.g:4920:1: rule__Every__FilterFromAssignment_1_2 : ( ruleFilterFrom ) ;
    public final void rule__Every__FilterFromAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4924:1: ( ( ruleFilterFrom ) )
            // InternalEsper2Maude.g:4925:2: ( ruleFilterFrom )
            {
            // InternalEsper2Maude.g:4925:2: ( ruleFilterFrom )
            // InternalEsper2Maude.g:4926:3: ruleFilterFrom
            {
             before(grammarAccess.getEveryAccess().getFilterFromFilterFromParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterFrom();

            state._fsp--;

             after(grammarAccess.getEveryAccess().getFilterFromFilterFromParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Every__FilterFromAssignment_1_2"


    // $ANTLR start "rule__FilterEvent__FilterLeftHandSideAssignment_0"
    // InternalEsper2Maude.g:4935:1: rule__FilterEvent__FilterLeftHandSideAssignment_0 : ( ruleFilterPart ) ;
    public final void rule__FilterEvent__FilterLeftHandSideAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4939:1: ( ( ruleFilterPart ) )
            // InternalEsper2Maude.g:4940:2: ( ruleFilterPart )
            {
            // InternalEsper2Maude.g:4940:2: ( ruleFilterPart )
            // InternalEsper2Maude.g:4941:3: ruleFilterPart
            {
             before(grammarAccess.getFilterEventAccess().getFilterLeftHandSideFilterPartParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterPart();

            state._fsp--;

             after(grammarAccess.getFilterEventAccess().getFilterLeftHandSideFilterPartParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__FilterLeftHandSideAssignment_0"


    // $ANTLR start "rule__FilterEvent__FilterOpAssignment_1"
    // InternalEsper2Maude.g:4950:1: rule__FilterEvent__FilterOpAssignment_1 : ( ruleFilterOperator ) ;
    public final void rule__FilterEvent__FilterOpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4954:1: ( ( ruleFilterOperator ) )
            // InternalEsper2Maude.g:4955:2: ( ruleFilterOperator )
            {
            // InternalEsper2Maude.g:4955:2: ( ruleFilterOperator )
            // InternalEsper2Maude.g:4956:3: ruleFilterOperator
            {
             before(grammarAccess.getFilterEventAccess().getFilterOpFilterOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterOperator();

            state._fsp--;

             after(grammarAccess.getFilterEventAccess().getFilterOpFilterOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__FilterOpAssignment_1"


    // $ANTLR start "rule__FilterEvent__FilterRightHandSideAssignment_2"
    // InternalEsper2Maude.g:4965:1: rule__FilterEvent__FilterRightHandSideAssignment_2 : ( ruleFilterPart ) ;
    public final void rule__FilterEvent__FilterRightHandSideAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4969:1: ( ( ruleFilterPart ) )
            // InternalEsper2Maude.g:4970:2: ( ruleFilterPart )
            {
            // InternalEsper2Maude.g:4970:2: ( ruleFilterPart )
            // InternalEsper2Maude.g:4971:3: ruleFilterPart
            {
             before(grammarAccess.getFilterEventAccess().getFilterRightHandSideFilterPartParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFilterPart();

            state._fsp--;

             after(grammarAccess.getFilterEventAccess().getFilterRightHandSideFilterPartParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterEvent__FilterRightHandSideAssignment_2"


    // $ANTLR start "rule__FilterPart__EventPropNameAssignment_0"
    // InternalEsper2Maude.g:4980:1: rule__FilterPart__EventPropNameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FilterPart__EventPropNameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4984:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:4985:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:4985:2: ( RULE_ID )
            // InternalEsper2Maude.g:4986:3: RULE_ID
            {
             before(grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__EventPropNameAssignment_0"


    // $ANTLR start "rule__FilterPart__EventVariableAssignment_1_0"
    // InternalEsper2Maude.g:4995:1: rule__FilterPart__EventVariableAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__FilterPart__EventVariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:4999:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5000:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5000:2: ( RULE_ID )
            // InternalEsper2Maude.g:5001:3: RULE_ID
            {
             before(grammarAccess.getFilterPartAccess().getEventVariableIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getEventVariableIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__EventVariableAssignment_1_0"


    // $ANTLR start "rule__FilterPart__EventPropNameAssignment_1_2"
    // InternalEsper2Maude.g:5010:1: rule__FilterPart__EventPropNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__FilterPart__EventPropNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5014:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5015:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5015:2: ( RULE_ID )
            // InternalEsper2Maude.g:5016:3: RULE_ID
            {
             before(grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__EventPropNameAssignment_1_2"


    // $ANTLR start "rule__FilterPart__NegAssignment_2_0"
    // InternalEsper2Maude.g:5025:1: rule__FilterPart__NegAssignment_2_0 : ( ( '-' ) ) ;
    public final void rule__FilterPart__NegAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5029:1: ( ( ( '-' ) ) )
            // InternalEsper2Maude.g:5030:2: ( ( '-' ) )
            {
            // InternalEsper2Maude.g:5030:2: ( ( '-' ) )
            // InternalEsper2Maude.g:5031:3: ( '-' )
            {
             before(grammarAccess.getFilterPartAccess().getNegHyphenMinusKeyword_2_0_0()); 
            // InternalEsper2Maude.g:5032:3: ( '-' )
            // InternalEsper2Maude.g:5033:4: '-'
            {
             before(grammarAccess.getFilterPartAccess().getNegHyphenMinusKeyword_2_0_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getNegHyphenMinusKeyword_2_0_0()); 

            }

             after(grammarAccess.getFilterPartAccess().getNegHyphenMinusKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__NegAssignment_2_0"


    // $ANTLR start "rule__FilterPart__NumAssignment_2_1"
    // InternalEsper2Maude.g:5044:1: rule__FilterPart__NumAssignment_2_1 : ( RULE_INT ) ;
    public final void rule__FilterPart__NumAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5048:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:5049:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:5049:2: ( RULE_INT )
            // InternalEsper2Maude.g:5050:3: RULE_INT
            {
             before(grammarAccess.getFilterPartAccess().getNumINTTerminalRuleCall_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getNumINTTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__NumAssignment_2_1"


    // $ANTLR start "rule__FilterPart__DecAssignment_2_2_1"
    // InternalEsper2Maude.g:5059:1: rule__FilterPart__DecAssignment_2_2_1 : ( RULE_INT ) ;
    public final void rule__FilterPart__DecAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5063:1: ( ( RULE_INT ) )
            // InternalEsper2Maude.g:5064:2: ( RULE_INT )
            {
            // InternalEsper2Maude.g:5064:2: ( RULE_INT )
            // InternalEsper2Maude.g:5065:3: RULE_INT
            {
             before(grammarAccess.getFilterPartAccess().getDecINTTerminalRuleCall_2_2_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getDecINTTerminalRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__DecAssignment_2_2_1"


    // $ANTLR start "rule__FilterPart__StrAssignment_3"
    // InternalEsper2Maude.g:5074:1: rule__FilterPart__StrAssignment_3 : ( RULE_STRING ) ;
    public final void rule__FilterPart__StrAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5078:1: ( ( RULE_STRING ) )
            // InternalEsper2Maude.g:5079:2: ( RULE_STRING )
            {
            // InternalEsper2Maude.g:5079:2: ( RULE_STRING )
            // InternalEsper2Maude.g:5080:3: RULE_STRING
            {
             before(grammarAccess.getFilterPartAccess().getStrSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getStrSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__StrAssignment_3"


    // $ANTLR start "rule__FilterPart__TAssignment_4"
    // InternalEsper2Maude.g:5089:1: rule__FilterPart__TAssignment_4 : ( ( 'true' ) ) ;
    public final void rule__FilterPart__TAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5093:1: ( ( ( 'true' ) ) )
            // InternalEsper2Maude.g:5094:2: ( ( 'true' ) )
            {
            // InternalEsper2Maude.g:5094:2: ( ( 'true' ) )
            // InternalEsper2Maude.g:5095:3: ( 'true' )
            {
             before(grammarAccess.getFilterPartAccess().getTTrueKeyword_4_0()); 
            // InternalEsper2Maude.g:5096:3: ( 'true' )
            // InternalEsper2Maude.g:5097:4: 'true'
            {
             before(grammarAccess.getFilterPartAccess().getTTrueKeyword_4_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getTTrueKeyword_4_0()); 

            }

             after(grammarAccess.getFilterPartAccess().getTTrueKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__TAssignment_4"


    // $ANTLR start "rule__FilterPart__FAssignment_5"
    // InternalEsper2Maude.g:5108:1: rule__FilterPart__FAssignment_5 : ( ( 'false' ) ) ;
    public final void rule__FilterPart__FAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5112:1: ( ( ( 'false' ) ) )
            // InternalEsper2Maude.g:5113:2: ( ( 'false' ) )
            {
            // InternalEsper2Maude.g:5113:2: ( ( 'false' ) )
            // InternalEsper2Maude.g:5114:3: ( 'false' )
            {
             before(grammarAccess.getFilterPartAccess().getFFalseKeyword_5_0()); 
            // InternalEsper2Maude.g:5115:3: ( 'false' )
            // InternalEsper2Maude.g:5116:4: 'false'
            {
             before(grammarAccess.getFilterPartAccess().getFFalseKeyword_5_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getFilterPartAccess().getFFalseKeyword_5_0()); 

            }

             after(grammarAccess.getFilterPartAccess().getFFalseKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterPart__FAssignment_5"


    // $ANTLR start "rule__FilterOperator__ComparisonAssignment_0"
    // InternalEsper2Maude.g:5127:1: rule__FilterOperator__ComparisonAssignment_0 : ( ruleComparisonOperator ) ;
    public final void rule__FilterOperator__ComparisonAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5131:1: ( ( ruleComparisonOperator ) )
            // InternalEsper2Maude.g:5132:2: ( ruleComparisonOperator )
            {
            // InternalEsper2Maude.g:5132:2: ( ruleComparisonOperator )
            // InternalEsper2Maude.g:5133:3: ruleComparisonOperator
            {
             before(grammarAccess.getFilterOperatorAccess().getComparisonComparisonOperatorParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleComparisonOperator();

            state._fsp--;

             after(grammarAccess.getFilterOperatorAccess().getComparisonComparisonOperatorParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperator__ComparisonAssignment_0"


    // $ANTLR start "rule__FilterOperator__LogicalAssignment_1"
    // InternalEsper2Maude.g:5142:1: rule__FilterOperator__LogicalAssignment_1 : ( ruleLogicalOperator ) ;
    public final void rule__FilterOperator__LogicalAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5146:1: ( ( ruleLogicalOperator ) )
            // InternalEsper2Maude.g:5147:2: ( ruleLogicalOperator )
            {
            // InternalEsper2Maude.g:5147:2: ( ruleLogicalOperator )
            // InternalEsper2Maude.g:5148:3: ruleLogicalOperator
            {
             before(grammarAccess.getFilterOperatorAccess().getLogicalLogicalOperatorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLogicalOperator();

            state._fsp--;

             after(grammarAccess.getFilterOperatorAccess().getLogicalLogicalOperatorParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__FilterOperator__LogicalAssignment_1"


    // $ANTLR start "rule__ComparisonOperator__GtAssignment_0"
    // InternalEsper2Maude.g:5157:1: rule__ComparisonOperator__GtAssignment_0 : ( ( '>' ) ) ;
    public final void rule__ComparisonOperator__GtAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5161:1: ( ( ( '>' ) ) )
            // InternalEsper2Maude.g:5162:2: ( ( '>' ) )
            {
            // InternalEsper2Maude.g:5162:2: ( ( '>' ) )
            // InternalEsper2Maude.g:5163:3: ( '>' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getGtGreaterThanSignKeyword_0_0()); 
            // InternalEsper2Maude.g:5164:3: ( '>' )
            // InternalEsper2Maude.g:5165:4: '>'
            {
             before(grammarAccess.getComparisonOperatorAccess().getGtGreaterThanSignKeyword_0_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGtGreaterThanSignKeyword_0_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getGtGreaterThanSignKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__GtAssignment_0"


    // $ANTLR start "rule__ComparisonOperator__GeAssignment_1"
    // InternalEsper2Maude.g:5176:1: rule__ComparisonOperator__GeAssignment_1 : ( ( '>=' ) ) ;
    public final void rule__ComparisonOperator__GeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5180:1: ( ( ( '>=' ) ) )
            // InternalEsper2Maude.g:5181:2: ( ( '>=' ) )
            {
            // InternalEsper2Maude.g:5181:2: ( ( '>=' ) )
            // InternalEsper2Maude.g:5182:3: ( '>=' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getGeGreaterThanSignEqualsSignKeyword_1_0()); 
            // InternalEsper2Maude.g:5183:3: ( '>=' )
            // InternalEsper2Maude.g:5184:4: '>='
            {
             before(grammarAccess.getComparisonOperatorAccess().getGeGreaterThanSignEqualsSignKeyword_1_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getGeGreaterThanSignEqualsSignKeyword_1_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getGeGreaterThanSignEqualsSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__GeAssignment_1"


    // $ANTLR start "rule__ComparisonOperator__EqAssignment_2"
    // InternalEsper2Maude.g:5195:1: rule__ComparisonOperator__EqAssignment_2 : ( ( '=' ) ) ;
    public final void rule__ComparisonOperator__EqAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5199:1: ( ( ( '=' ) ) )
            // InternalEsper2Maude.g:5200:2: ( ( '=' ) )
            {
            // InternalEsper2Maude.g:5200:2: ( ( '=' ) )
            // InternalEsper2Maude.g:5201:3: ( '=' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqEqualsSignKeyword_2_0()); 
            // InternalEsper2Maude.g:5202:3: ( '=' )
            // InternalEsper2Maude.g:5203:4: '='
            {
             before(grammarAccess.getComparisonOperatorAccess().getEqEqualsSignKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getEqEqualsSignKeyword_2_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getEqEqualsSignKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__EqAssignment_2"


    // $ANTLR start "rule__ComparisonOperator__NeqAssignment_3"
    // InternalEsper2Maude.g:5214:1: rule__ComparisonOperator__NeqAssignment_3 : ( ( '<>' ) ) ;
    public final void rule__ComparisonOperator__NeqAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5218:1: ( ( ( '<>' ) ) )
            // InternalEsper2Maude.g:5219:2: ( ( '<>' ) )
            {
            // InternalEsper2Maude.g:5219:2: ( ( '<>' ) )
            // InternalEsper2Maude.g:5220:3: ( '<>' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getNeqLessThanSignGreaterThanSignKeyword_3_0()); 
            // InternalEsper2Maude.g:5221:3: ( '<>' )
            // InternalEsper2Maude.g:5222:4: '<>'
            {
             before(grammarAccess.getComparisonOperatorAccess().getNeqLessThanSignGreaterThanSignKeyword_3_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getNeqLessThanSignGreaterThanSignKeyword_3_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getNeqLessThanSignGreaterThanSignKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__NeqAssignment_3"


    // $ANTLR start "rule__ComparisonOperator__LtAssignment_4"
    // InternalEsper2Maude.g:5233:1: rule__ComparisonOperator__LtAssignment_4 : ( ( '<' ) ) ;
    public final void rule__ComparisonOperator__LtAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5237:1: ( ( ( '<' ) ) )
            // InternalEsper2Maude.g:5238:2: ( ( '<' ) )
            {
            // InternalEsper2Maude.g:5238:2: ( ( '<' ) )
            // InternalEsper2Maude.g:5239:3: ( '<' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getLtLessThanSignKeyword_4_0()); 
            // InternalEsper2Maude.g:5240:3: ( '<' )
            // InternalEsper2Maude.g:5241:4: '<'
            {
             before(grammarAccess.getComparisonOperatorAccess().getLtLessThanSignKeyword_4_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLtLessThanSignKeyword_4_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getLtLessThanSignKeyword_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__LtAssignment_4"


    // $ANTLR start "rule__ComparisonOperator__LeAssignment_5"
    // InternalEsper2Maude.g:5252:1: rule__ComparisonOperator__LeAssignment_5 : ( ( '<=' ) ) ;
    public final void rule__ComparisonOperator__LeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5256:1: ( ( ( '<=' ) ) )
            // InternalEsper2Maude.g:5257:2: ( ( '<=' ) )
            {
            // InternalEsper2Maude.g:5257:2: ( ( '<=' ) )
            // InternalEsper2Maude.g:5258:3: ( '<=' )
            {
             before(grammarAccess.getComparisonOperatorAccess().getLeLessThanSignEqualsSignKeyword_5_0()); 
            // InternalEsper2Maude.g:5259:3: ( '<=' )
            // InternalEsper2Maude.g:5260:4: '<='
            {
             before(grammarAccess.getComparisonOperatorAccess().getLeLessThanSignEqualsSignKeyword_5_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getComparisonOperatorAccess().getLeLessThanSignEqualsSignKeyword_5_0()); 

            }

             after(grammarAccess.getComparisonOperatorAccess().getLeLessThanSignEqualsSignKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComparisonOperator__LeAssignment_5"


    // $ANTLR start "rule__LogicalOperator__AndAssignment_0"
    // InternalEsper2Maude.g:5271:1: rule__LogicalOperator__AndAssignment_0 : ( ( 'and' ) ) ;
    public final void rule__LogicalOperator__AndAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5275:1: ( ( ( 'and' ) ) )
            // InternalEsper2Maude.g:5276:2: ( ( 'and' ) )
            {
            // InternalEsper2Maude.g:5276:2: ( ( 'and' ) )
            // InternalEsper2Maude.g:5277:3: ( 'and' )
            {
             before(grammarAccess.getLogicalOperatorAccess().getAndAndKeyword_0_0()); 
            // InternalEsper2Maude.g:5278:3: ( 'and' )
            // InternalEsper2Maude.g:5279:4: 'and'
            {
             before(grammarAccess.getLogicalOperatorAccess().getAndAndKeyword_0_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getLogicalOperatorAccess().getAndAndKeyword_0_0()); 

            }

             after(grammarAccess.getLogicalOperatorAccess().getAndAndKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOperator__AndAssignment_0"


    // $ANTLR start "rule__LogicalOperator__OrAssignment_1"
    // InternalEsper2Maude.g:5290:1: rule__LogicalOperator__OrAssignment_1 : ( ( 'or' ) ) ;
    public final void rule__LogicalOperator__OrAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5294:1: ( ( ( 'or' ) ) )
            // InternalEsper2Maude.g:5295:2: ( ( 'or' ) )
            {
            // InternalEsper2Maude.g:5295:2: ( ( 'or' ) )
            // InternalEsper2Maude.g:5296:3: ( 'or' )
            {
             before(grammarAccess.getLogicalOperatorAccess().getOrOrKeyword_1_0()); 
            // InternalEsper2Maude.g:5297:3: ( 'or' )
            // InternalEsper2Maude.g:5298:4: 'or'
            {
             before(grammarAccess.getLogicalOperatorAccess().getOrOrKeyword_1_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getLogicalOperatorAccess().getOrOrKeyword_1_0()); 

            }

             after(grammarAccess.getLogicalOperatorAccess().getOrOrKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LogicalOperator__OrAssignment_1"


    // $ANTLR start "rule__Event__NameAssignment"
    // InternalEsper2Maude.g:5309:1: rule__Event__NameAssignment : ( RULE_ID ) ;
    public final void rule__Event__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5313:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5314:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5314:2: ( RULE_ID )
            // InternalEsper2Maude.g:5315:3: RULE_ID
            {
             before(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Event__NameAssignment"


    // $ANTLR start "rule__NonLastSelectEntry__EntryAssignment_0"
    // InternalEsper2Maude.g:5324:1: rule__NonLastSelectEntry__EntryAssignment_0 : ( ruleSelectEntry ) ;
    public final void rule__NonLastSelectEntry__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5328:1: ( ( ruleSelectEntry ) )
            // InternalEsper2Maude.g:5329:2: ( ruleSelectEntry )
            {
            // InternalEsper2Maude.g:5329:2: ( ruleSelectEntry )
            // InternalEsper2Maude.g:5330:3: ruleSelectEntry
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectEntry();

            state._fsp--;

             after(grammarAccess.getNonLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NonLastSelectEntry__EntryAssignment_0"


    // $ANTLR start "rule__LastSelectEntry__EntryAssignment"
    // InternalEsper2Maude.g:5339:1: rule__LastSelectEntry__EntryAssignment : ( ruleSelectEntry ) ;
    public final void rule__LastSelectEntry__EntryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5343:1: ( ( ruleSelectEntry ) )
            // InternalEsper2Maude.g:5344:2: ( ruleSelectEntry )
            {
            // InternalEsper2Maude.g:5344:2: ( ruleSelectEntry )
            // InternalEsper2Maude.g:5345:3: ruleSelectEntry
            {
             before(grammarAccess.getLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleSelectEntry();

            state._fsp--;

             after(grammarAccess.getLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LastSelectEntry__EntryAssignment"


    // $ANTLR start "rule__SelectEntry__FieldAssignment_0_0"
    // InternalEsper2Maude.g:5354:1: rule__SelectEntry__FieldAssignment_0_0 : ( ruleField ) ;
    public final void rule__SelectEntry__FieldAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5358:1: ( ( ruleField ) )
            // InternalEsper2Maude.g:5359:2: ( ruleField )
            {
            // InternalEsper2Maude.g:5359:2: ( ruleField )
            // InternalEsper2Maude.g:5360:3: ruleField
            {
             before(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__FieldAssignment_0_0"


    // $ANTLR start "rule__SelectEntry__AliasAssignment_0_1_1"
    // InternalEsper2Maude.g:5369:1: rule__SelectEntry__AliasAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SelectEntry__AliasAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5373:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5374:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5374:2: ( RULE_ID )
            // InternalEsper2Maude.g:5375:3: RULE_ID
            {
             before(grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_0_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__AliasAssignment_0_1_1"


    // $ANTLR start "rule__SelectEntry__GroupOpAssignment_1_0"
    // InternalEsper2Maude.g:5384:1: rule__SelectEntry__GroupOpAssignment_1_0 : ( RULE_GROUP_OP ) ;
    public final void rule__SelectEntry__GroupOpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5388:1: ( ( RULE_GROUP_OP ) )
            // InternalEsper2Maude.g:5389:2: ( RULE_GROUP_OP )
            {
            // InternalEsper2Maude.g:5389:2: ( RULE_GROUP_OP )
            // InternalEsper2Maude.g:5390:3: RULE_GROUP_OP
            {
             before(grammarAccess.getSelectEntryAccess().getGroupOpGROUP_OPTerminalRuleCall_1_0_0()); 
            match(input,RULE_GROUP_OP,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getGroupOpGROUP_OPTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__GroupOpAssignment_1_0"


    // $ANTLR start "rule__SelectEntry__FieldAssignment_1_2"
    // InternalEsper2Maude.g:5399:1: rule__SelectEntry__FieldAssignment_1_2 : ( ruleField ) ;
    public final void rule__SelectEntry__FieldAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5403:1: ( ( ruleField ) )
            // InternalEsper2Maude.g:5404:2: ( ruleField )
            {
            // InternalEsper2Maude.g:5404:2: ( ruleField )
            // InternalEsper2Maude.g:5405:3: ruleField
            {
             before(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__FieldAssignment_1_2"


    // $ANTLR start "rule__SelectEntry__AliasAssignment_1_4_1"
    // InternalEsper2Maude.g:5414:1: rule__SelectEntry__AliasAssignment_1_4_1 : ( RULE_ID ) ;
    public final void rule__SelectEntry__AliasAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5418:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5419:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5419:2: ( RULE_ID )
            // InternalEsper2Maude.g:5420:3: RULE_ID
            {
             before(grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_1_4_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_1_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SelectEntry__AliasAssignment_1_4_1"


    // $ANTLR start "rule__Field__StarAssignment_0"
    // InternalEsper2Maude.g:5429:1: rule__Field__StarAssignment_0 : ( ( '*' ) ) ;
    public final void rule__Field__StarAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5433:1: ( ( ( '*' ) ) )
            // InternalEsper2Maude.g:5434:2: ( ( '*' ) )
            {
            // InternalEsper2Maude.g:5434:2: ( ( '*' ) )
            // InternalEsper2Maude.g:5435:3: ( '*' )
            {
             before(grammarAccess.getFieldAccess().getStarAsteriskKeyword_0_0()); 
            // InternalEsper2Maude.g:5436:3: ( '*' )
            // InternalEsper2Maude.g:5437:4: '*'
            {
             before(grammarAccess.getFieldAccess().getStarAsteriskKeyword_0_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getStarAsteriskKeyword_0_0()); 

            }

             after(grammarAccess.getFieldAccess().getStarAsteriskKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__StarAssignment_0"


    // $ANTLR start "rule__Field__EventVariableAssignment_1_0"
    // InternalEsper2Maude.g:5448:1: rule__Field__EventVariableAssignment_1_0 : ( RULE_ID ) ;
    public final void rule__Field__EventVariableAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5452:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5453:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5453:2: ( RULE_ID )
            // InternalEsper2Maude.g:5454:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getEventVariableIDTerminalRuleCall_1_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getEventVariableIDTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__EventVariableAssignment_1_0"


    // $ANTLR start "rule__Field__EventPropNameAssignment_1_2"
    // InternalEsper2Maude.g:5463:1: rule__Field__EventPropNameAssignment_1_2 : ( RULE_ID ) ;
    public final void rule__Field__EventPropNameAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:5467:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:5468:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:5468:2: ( RULE_ID )
            // InternalEsper2Maude.g:5469:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getEventPropNameIDTerminalRuleCall_1_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getEventPropNameIDTerminalRuleCall_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Field__EventPropNameAssignment_1_2"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    protected DFA15 dfa15 = new DFA15(this);
    static final String dfa_1s = "\52\uffff";
    static final String dfa_2s = "\6\uffff\1\11\13\uffff\1\11\23\uffff\1\11\3\uffff";
    static final String dfa_3s = "\1\4\1\uffff\2\4\1\17\1\uffff\1\17\2\4\1\uffff\1\4\1\17\1\33\1\7\1\33\3\36\1\17\11\4\1\7\1\36\1\20\1\7\4\20\1\36\1\4\1\20\1\7\2\20";
    static final String dfa_4s = "\1\35\1\uffff\1\47\1\17\1\56\1\uffff\1\56\2\47\1\uffff\1\4\1\37\1\56\1\7\5\56\1\4\10\47\1\7\1\56\1\33\1\7\1\33\3\20\1\56\1\4\1\56\1\7\2\20";
    static final String dfa_5s = "\1\uffff\1\1\3\uffff\1\2\3\uffff\1\3\40\uffff";
    static final String dfa_6s = "\52\uffff}>";
    static final String[] dfa_7s = {
            "\1\1\12\uffff\1\2\15\uffff\1\3",
            "",
            "\1\4\1\uffff\2\1\7\uffff\1\5\15\uffff\1\5\7\uffff\3\1",
            "\1\6\12\uffff\1\1",
            "\1\5\13\uffff\1\1\2\uffff\1\7\1\5\10\uffff\7\1",
            "",
            "\1\10\1\11\11\uffff\1\11\3\uffff\1\12\1\1\15\uffff\2\11",
            "\1\13\1\uffff\2\1\35\uffff\3\1",
            "\1\14\1\uffff\1\17\1\16\35\uffff\1\15\1\20\1\21",
            "",
            "\1\22",
            "\1\5\1\1\12\uffff\1\1\3\uffff\1\5",
            "\1\23\2\uffff\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\16",
            "\1\34\2\uffff\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\10\1\11\11\uffff\1\11\4\uffff\1\1\15\uffff\2\11",
            "\1\35",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\36\1\uffff\1\41\1\40\35\uffff\1\37\1\42\1\43",
            "\1\44",
            "\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\46\12\uffff\1\45",
            "\1\40",
            "\1\46\12\uffff\1\47",
            "\1\46",
            "\1\46",
            "\1\46",
            "\1\26\11\uffff\1\24\1\25\1\27\1\30\1\31\1\32\1\33",
            "\1\50",
            "\1\11\11\uffff\1\11\4\uffff\1\1\15\uffff\2\11",
            "\1\51",
            "\1\46",
            "\1\46"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "573:1: rule__FilterFrom__Alternatives : ( ( ( rule__FilterFrom__FollowedByAssignment_0 ) ) | ( ( rule__FilterFrom__Group_1__0 ) ) | ( ( rule__FilterFrom__Group_2__0 ) ) );";
        }
    }
    static final String dfa_8s = "\22\uffff";
    static final String dfa_9s = "\1\4\1\21\1\33\1\17\1\4\2\uffff\2\4\2\21\1\20\1\33\1\21\2\4\1\20\1\21";
    static final String dfa_10s = "\1\57\1\41\1\33\1\17\1\4\2\uffff\1\4\1\57\1\27\1\41\1\20\1\33\1\41\2\4\1\20\1\27";
    static final String dfa_11s = "\5\uffff\1\1\1\2\13\uffff";
    static final String dfa_12s = "\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\3\uffff\1\3\46\uffff\1\1",
            "\1\5\5\uffff\1\6\11\uffff\1\4",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\14\52\uffff\1\13",
            "\1\5\5\uffff\1\6",
            "\1\5\5\uffff\1\6\11\uffff\1\4",
            "\1\15",
            "\1\16",
            "\1\5\5\uffff\1\6\11\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\15",
            "\1\5\5\uffff\1\6"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "()* loopback of 1516:2: ( rule__Pattern__SelectEntriesAssignment_12 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000800000000110L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000800000000112L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000020008010L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00007F1040000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00007F0040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x000000E0000000D0L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00007FF0400000D0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000002000000080L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000010L});

}