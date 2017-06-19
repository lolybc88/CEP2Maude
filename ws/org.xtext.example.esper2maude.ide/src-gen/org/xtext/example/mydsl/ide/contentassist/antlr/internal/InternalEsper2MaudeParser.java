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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'count'", "'max'", "'min'", "'@Name('", "')'", "'insert into'", "'select'", "'from'", "'group by'", "','", "'as'", "'('", "'e.'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

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
    // InternalEsper2Maude.g:62:1: ruleModel : ( ( rule__Model__PatternsAssignment )* ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:66:2: ( ( ( rule__Model__PatternsAssignment )* ) )
            // InternalEsper2Maude.g:67:2: ( ( rule__Model__PatternsAssignment )* )
            {
            // InternalEsper2Maude.g:67:2: ( ( rule__Model__PatternsAssignment )* )
            // InternalEsper2Maude.g:68:3: ( rule__Model__PatternsAssignment )*
            {
             before(grammarAccess.getModelAccess().getPatternsAssignment()); 
            // InternalEsper2Maude.g:69:3: ( rule__Model__PatternsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsper2Maude.g:69:4: rule__Model__PatternsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Model__PatternsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getPatternsAssignment()); 

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


    // $ANTLR start "entryRulePattern"
    // InternalEsper2Maude.g:78:1: entryRulePattern : rulePattern EOF ;
    public final void entryRulePattern() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:79:1: ( rulePattern EOF )
            // InternalEsper2Maude.g:80:1: rulePattern EOF
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
    // InternalEsper2Maude.g:87:1: rulePattern : ( ( rule__Pattern__Group__0 ) ) ;
    public final void rulePattern() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:91:2: ( ( ( rule__Pattern__Group__0 ) ) )
            // InternalEsper2Maude.g:92:2: ( ( rule__Pattern__Group__0 ) )
            {
            // InternalEsper2Maude.g:92:2: ( ( rule__Pattern__Group__0 ) )
            // InternalEsper2Maude.g:93:3: ( rule__Pattern__Group__0 )
            {
             before(grammarAccess.getPatternAccess().getGroup()); 
            // InternalEsper2Maude.g:94:3: ( rule__Pattern__Group__0 )
            // InternalEsper2Maude.g:94:4: rule__Pattern__Group__0
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


    // $ANTLR start "entryRuleNonLastSelectEntry"
    // InternalEsper2Maude.g:103:1: entryRuleNonLastSelectEntry : ruleNonLastSelectEntry EOF ;
    public final void entryRuleNonLastSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:104:1: ( ruleNonLastSelectEntry EOF )
            // InternalEsper2Maude.g:105:1: ruleNonLastSelectEntry EOF
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
    // InternalEsper2Maude.g:112:1: ruleNonLastSelectEntry : ( ( rule__NonLastSelectEntry__Group__0 ) ) ;
    public final void ruleNonLastSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:116:2: ( ( ( rule__NonLastSelectEntry__Group__0 ) ) )
            // InternalEsper2Maude.g:117:2: ( ( rule__NonLastSelectEntry__Group__0 ) )
            {
            // InternalEsper2Maude.g:117:2: ( ( rule__NonLastSelectEntry__Group__0 ) )
            // InternalEsper2Maude.g:118:3: ( rule__NonLastSelectEntry__Group__0 )
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getGroup()); 
            // InternalEsper2Maude.g:119:3: ( rule__NonLastSelectEntry__Group__0 )
            // InternalEsper2Maude.g:119:4: rule__NonLastSelectEntry__Group__0
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
    // InternalEsper2Maude.g:128:1: entryRuleLastSelectEntry : ruleLastSelectEntry EOF ;
    public final void entryRuleLastSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:129:1: ( ruleLastSelectEntry EOF )
            // InternalEsper2Maude.g:130:1: ruleLastSelectEntry EOF
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
    // InternalEsper2Maude.g:137:1: ruleLastSelectEntry : ( ( rule__LastSelectEntry__EntryAssignment ) ) ;
    public final void ruleLastSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:141:2: ( ( ( rule__LastSelectEntry__EntryAssignment ) ) )
            // InternalEsper2Maude.g:142:2: ( ( rule__LastSelectEntry__EntryAssignment ) )
            {
            // InternalEsper2Maude.g:142:2: ( ( rule__LastSelectEntry__EntryAssignment ) )
            // InternalEsper2Maude.g:143:3: ( rule__LastSelectEntry__EntryAssignment )
            {
             before(grammarAccess.getLastSelectEntryAccess().getEntryAssignment()); 
            // InternalEsper2Maude.g:144:3: ( rule__LastSelectEntry__EntryAssignment )
            // InternalEsper2Maude.g:144:4: rule__LastSelectEntry__EntryAssignment
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
    // InternalEsper2Maude.g:153:1: entryRuleSelectEntry : ruleSelectEntry EOF ;
    public final void entryRuleSelectEntry() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:154:1: ( ruleSelectEntry EOF )
            // InternalEsper2Maude.g:155:1: ruleSelectEntry EOF
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
    // InternalEsper2Maude.g:162:1: ruleSelectEntry : ( ( rule__SelectEntry__Alternatives ) ) ;
    public final void ruleSelectEntry() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:166:2: ( ( ( rule__SelectEntry__Alternatives ) ) )
            // InternalEsper2Maude.g:167:2: ( ( rule__SelectEntry__Alternatives ) )
            {
            // InternalEsper2Maude.g:167:2: ( ( rule__SelectEntry__Alternatives ) )
            // InternalEsper2Maude.g:168:3: ( rule__SelectEntry__Alternatives )
            {
             before(grammarAccess.getSelectEntryAccess().getAlternatives()); 
            // InternalEsper2Maude.g:169:3: ( rule__SelectEntry__Alternatives )
            // InternalEsper2Maude.g:169:4: rule__SelectEntry__Alternatives
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
    // InternalEsper2Maude.g:178:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:179:1: ( ruleField EOF )
            // InternalEsper2Maude.g:180:1: ruleField EOF
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
    // InternalEsper2Maude.g:187:1: ruleField : ( ( rule__Field__Alternatives ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:191:2: ( ( ( rule__Field__Alternatives ) ) )
            // InternalEsper2Maude.g:192:2: ( ( rule__Field__Alternatives ) )
            {
            // InternalEsper2Maude.g:192:2: ( ( rule__Field__Alternatives ) )
            // InternalEsper2Maude.g:193:3: ( rule__Field__Alternatives )
            {
             before(grammarAccess.getFieldAccess().getAlternatives()); 
            // InternalEsper2Maude.g:194:3: ( rule__Field__Alternatives )
            // InternalEsper2Maude.g:194:4: rule__Field__Alternatives
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


    // $ANTLR start "entryRuleGroupOp"
    // InternalEsper2Maude.g:203:1: entryRuleGroupOp : ruleGroupOp EOF ;
    public final void entryRuleGroupOp() throws RecognitionException {
        try {
            // InternalEsper2Maude.g:204:1: ( ruleGroupOp EOF )
            // InternalEsper2Maude.g:205:1: ruleGroupOp EOF
            {
             before(grammarAccess.getGroupOpRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupOp();

            state._fsp--;

             after(grammarAccess.getGroupOpRule()); 
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
    // $ANTLR end "entryRuleGroupOp"


    // $ANTLR start "ruleGroupOp"
    // InternalEsper2Maude.g:212:1: ruleGroupOp : ( ( rule__GroupOp__Alternatives ) ) ;
    public final void ruleGroupOp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:216:2: ( ( ( rule__GroupOp__Alternatives ) ) )
            // InternalEsper2Maude.g:217:2: ( ( rule__GroupOp__Alternatives ) )
            {
            // InternalEsper2Maude.g:217:2: ( ( rule__GroupOp__Alternatives ) )
            // InternalEsper2Maude.g:218:3: ( rule__GroupOp__Alternatives )
            {
             before(grammarAccess.getGroupOpAccess().getAlternatives()); 
            // InternalEsper2Maude.g:219:3: ( rule__GroupOp__Alternatives )
            // InternalEsper2Maude.g:219:4: rule__GroupOp__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__GroupOp__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getGroupOpAccess().getAlternatives()); 

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
    // $ANTLR end "ruleGroupOp"


    // $ANTLR start "rule__SelectEntry__Alternatives"
    // InternalEsper2Maude.g:227:1: rule__SelectEntry__Alternatives : ( ( ( rule__SelectEntry__Group_0__0 ) ) | ( ( rule__SelectEntry__Group_1__0 ) ) );
    public final void rule__SelectEntry__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:231:1: ( ( ( rule__SelectEntry__Group_0__0 ) ) | ( ( rule__SelectEntry__Group_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11||LA2_0==24) ) {
                alt2=1;
            }
            else if ( ((LA2_0>=12 && LA2_0<=14)) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalEsper2Maude.g:232:2: ( ( rule__SelectEntry__Group_0__0 ) )
                    {
                    // InternalEsper2Maude.g:232:2: ( ( rule__SelectEntry__Group_0__0 ) )
                    // InternalEsper2Maude.g:233:3: ( rule__SelectEntry__Group_0__0 )
                    {
                     before(grammarAccess.getSelectEntryAccess().getGroup_0()); 
                    // InternalEsper2Maude.g:234:3: ( rule__SelectEntry__Group_0__0 )
                    // InternalEsper2Maude.g:234:4: rule__SelectEntry__Group_0__0
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
                    // InternalEsper2Maude.g:238:2: ( ( rule__SelectEntry__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:238:2: ( ( rule__SelectEntry__Group_1__0 ) )
                    // InternalEsper2Maude.g:239:3: ( rule__SelectEntry__Group_1__0 )
                    {
                     before(grammarAccess.getSelectEntryAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:240:3: ( rule__SelectEntry__Group_1__0 )
                    // InternalEsper2Maude.g:240:4: rule__SelectEntry__Group_1__0
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
    // InternalEsper2Maude.g:248:1: rule__Field__Alternatives : ( ( '*' ) | ( ( rule__Field__Group_1__0 ) ) );
    public final void rule__Field__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:252:1: ( ( '*' ) | ( ( rule__Field__Group_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==24) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsper2Maude.g:253:2: ( '*' )
                    {
                    // InternalEsper2Maude.g:253:2: ( '*' )
                    // InternalEsper2Maude.g:254:3: '*'
                    {
                     before(grammarAccess.getFieldAccess().getAsteriskKeyword_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getFieldAccess().getAsteriskKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:259:2: ( ( rule__Field__Group_1__0 ) )
                    {
                    // InternalEsper2Maude.g:259:2: ( ( rule__Field__Group_1__0 ) )
                    // InternalEsper2Maude.g:260:3: ( rule__Field__Group_1__0 )
                    {
                     before(grammarAccess.getFieldAccess().getGroup_1()); 
                    // InternalEsper2Maude.g:261:3: ( rule__Field__Group_1__0 )
                    // InternalEsper2Maude.g:261:4: rule__Field__Group_1__0
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


    // $ANTLR start "rule__GroupOp__Alternatives"
    // InternalEsper2Maude.g:269:1: rule__GroupOp__Alternatives : ( ( 'count' ) | ( 'max' ) | ( 'min' ) );
    public final void rule__GroupOp__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:273:1: ( ( 'count' ) | ( 'max' ) | ( 'min' ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 12:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                alt4=2;
                }
                break;
            case 14:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalEsper2Maude.g:274:2: ( 'count' )
                    {
                    // InternalEsper2Maude.g:274:2: ( 'count' )
                    // InternalEsper2Maude.g:275:3: 'count'
                    {
                     before(grammarAccess.getGroupOpAccess().getCountKeyword_0()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getGroupOpAccess().getCountKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:280:2: ( 'max' )
                    {
                    // InternalEsper2Maude.g:280:2: ( 'max' )
                    // InternalEsper2Maude.g:281:3: 'max'
                    {
                     before(grammarAccess.getGroupOpAccess().getMaxKeyword_1()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getGroupOpAccess().getMaxKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:286:2: ( 'min' )
                    {
                    // InternalEsper2Maude.g:286:2: ( 'min' )
                    // InternalEsper2Maude.g:287:3: 'min'
                    {
                     before(grammarAccess.getGroupOpAccess().getMinKeyword_2()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getGroupOpAccess().getMinKeyword_2()); 

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
    // $ANTLR end "rule__GroupOp__Alternatives"


    // $ANTLR start "rule__Pattern__Group__0"
    // InternalEsper2Maude.g:296:1: rule__Pattern__Group__0 : rule__Pattern__Group__0__Impl rule__Pattern__Group__1 ;
    public final void rule__Pattern__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:300:1: ( rule__Pattern__Group__0__Impl rule__Pattern__Group__1 )
            // InternalEsper2Maude.g:301:2: rule__Pattern__Group__0__Impl rule__Pattern__Group__1
            {
            pushFollow(FOLLOW_4);
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
    // InternalEsper2Maude.g:308:1: rule__Pattern__Group__0__Impl : ( '@Name(' ) ;
    public final void rule__Pattern__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:312:1: ( ( '@Name(' ) )
            // InternalEsper2Maude.g:313:1: ( '@Name(' )
            {
            // InternalEsper2Maude.g:313:1: ( '@Name(' )
            // InternalEsper2Maude.g:314:2: '@Name('
            {
             before(grammarAccess.getPatternAccess().getNameKeyword_0()); 
            match(input,15,FOLLOW_2); 
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
    // InternalEsper2Maude.g:323:1: rule__Pattern__Group__1 : rule__Pattern__Group__1__Impl rule__Pattern__Group__2 ;
    public final void rule__Pattern__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:327:1: ( rule__Pattern__Group__1__Impl rule__Pattern__Group__2 )
            // InternalEsper2Maude.g:328:2: rule__Pattern__Group__1__Impl rule__Pattern__Group__2
            {
            pushFollow(FOLLOW_5);
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
    // InternalEsper2Maude.g:335:1: rule__Pattern__Group__1__Impl : ( ( rule__Pattern__NameAssignment_1 ) ) ;
    public final void rule__Pattern__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:339:1: ( ( ( rule__Pattern__NameAssignment_1 ) ) )
            // InternalEsper2Maude.g:340:1: ( ( rule__Pattern__NameAssignment_1 ) )
            {
            // InternalEsper2Maude.g:340:1: ( ( rule__Pattern__NameAssignment_1 ) )
            // InternalEsper2Maude.g:341:2: ( rule__Pattern__NameAssignment_1 )
            {
             before(grammarAccess.getPatternAccess().getNameAssignment_1()); 
            // InternalEsper2Maude.g:342:2: ( rule__Pattern__NameAssignment_1 )
            // InternalEsper2Maude.g:342:3: rule__Pattern__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getNameAssignment_1()); 

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
    // InternalEsper2Maude.g:350:1: rule__Pattern__Group__2 : rule__Pattern__Group__2__Impl rule__Pattern__Group__3 ;
    public final void rule__Pattern__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:354:1: ( rule__Pattern__Group__2__Impl rule__Pattern__Group__3 )
            // InternalEsper2Maude.g:355:2: rule__Pattern__Group__2__Impl rule__Pattern__Group__3
            {
            pushFollow(FOLLOW_6);
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
    // InternalEsper2Maude.g:362:1: rule__Pattern__Group__2__Impl : ( ')' ) ;
    public final void rule__Pattern__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:366:1: ( ( ')' ) )
            // InternalEsper2Maude.g:367:1: ( ')' )
            {
            // InternalEsper2Maude.g:367:1: ( ')' )
            // InternalEsper2Maude.g:368:2: ')'
            {
             before(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getRightParenthesisKeyword_2()); 

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
    // InternalEsper2Maude.g:377:1: rule__Pattern__Group__3 : rule__Pattern__Group__3__Impl rule__Pattern__Group__4 ;
    public final void rule__Pattern__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:381:1: ( rule__Pattern__Group__3__Impl rule__Pattern__Group__4 )
            // InternalEsper2Maude.g:382:2: rule__Pattern__Group__3__Impl rule__Pattern__Group__4
            {
            pushFollow(FOLLOW_7);
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
    // InternalEsper2Maude.g:389:1: rule__Pattern__Group__3__Impl : ( 'insert into' ) ;
    public final void rule__Pattern__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:393:1: ( ( 'insert into' ) )
            // InternalEsper2Maude.g:394:1: ( 'insert into' )
            {
            // InternalEsper2Maude.g:394:1: ( 'insert into' )
            // InternalEsper2Maude.g:395:2: 'insert into'
            {
             before(grammarAccess.getPatternAccess().getInsertIntoKeyword_3()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getInsertIntoKeyword_3()); 

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
    // InternalEsper2Maude.g:404:1: rule__Pattern__Group__4 : rule__Pattern__Group__4__Impl rule__Pattern__Group__5 ;
    public final void rule__Pattern__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:408:1: ( rule__Pattern__Group__4__Impl rule__Pattern__Group__5 )
            // InternalEsper2Maude.g:409:2: rule__Pattern__Group__4__Impl rule__Pattern__Group__5
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
    // InternalEsper2Maude.g:416:1: rule__Pattern__Group__4__Impl : ( ( rule__Pattern__EventAssignment_4 ) ) ;
    public final void rule__Pattern__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:420:1: ( ( ( rule__Pattern__EventAssignment_4 ) ) )
            // InternalEsper2Maude.g:421:1: ( ( rule__Pattern__EventAssignment_4 ) )
            {
            // InternalEsper2Maude.g:421:1: ( ( rule__Pattern__EventAssignment_4 ) )
            // InternalEsper2Maude.g:422:2: ( rule__Pattern__EventAssignment_4 )
            {
             before(grammarAccess.getPatternAccess().getEventAssignment_4()); 
            // InternalEsper2Maude.g:423:2: ( rule__Pattern__EventAssignment_4 )
            // InternalEsper2Maude.g:423:3: rule__Pattern__EventAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__EventAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getEventAssignment_4()); 

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
    // InternalEsper2Maude.g:431:1: rule__Pattern__Group__5 : rule__Pattern__Group__5__Impl rule__Pattern__Group__6 ;
    public final void rule__Pattern__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:435:1: ( rule__Pattern__Group__5__Impl rule__Pattern__Group__6 )
            // InternalEsper2Maude.g:436:2: rule__Pattern__Group__5__Impl rule__Pattern__Group__6
            {
            pushFollow(FOLLOW_9);
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
    // InternalEsper2Maude.g:443:1: rule__Pattern__Group__5__Impl : ( 'select' ) ;
    public final void rule__Pattern__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:447:1: ( ( 'select' ) )
            // InternalEsper2Maude.g:448:1: ( 'select' )
            {
            // InternalEsper2Maude.g:448:1: ( 'select' )
            // InternalEsper2Maude.g:449:2: 'select'
            {
             before(grammarAccess.getPatternAccess().getSelectKeyword_5()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getSelectKeyword_5()); 

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
    // InternalEsper2Maude.g:458:1: rule__Pattern__Group__6 : rule__Pattern__Group__6__Impl rule__Pattern__Group__7 ;
    public final void rule__Pattern__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:462:1: ( rule__Pattern__Group__6__Impl rule__Pattern__Group__7 )
            // InternalEsper2Maude.g:463:2: rule__Pattern__Group__6__Impl rule__Pattern__Group__7
            {
            pushFollow(FOLLOW_9);
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
    // InternalEsper2Maude.g:470:1: rule__Pattern__Group__6__Impl : ( ( rule__Pattern__SelectEntriesAssignment_6 )* ) ;
    public final void rule__Pattern__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:474:1: ( ( ( rule__Pattern__SelectEntriesAssignment_6 )* ) )
            // InternalEsper2Maude.g:475:1: ( ( rule__Pattern__SelectEntriesAssignment_6 )* )
            {
            // InternalEsper2Maude.g:475:1: ( ( rule__Pattern__SelectEntriesAssignment_6 )* )
            // InternalEsper2Maude.g:476:2: ( rule__Pattern__SelectEntriesAssignment_6 )*
            {
             before(grammarAccess.getPatternAccess().getSelectEntriesAssignment_6()); 
            // InternalEsper2Maude.g:477:2: ( rule__Pattern__SelectEntriesAssignment_6 )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalEsper2Maude.g:477:3: rule__Pattern__SelectEntriesAssignment_6
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Pattern__SelectEntriesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getPatternAccess().getSelectEntriesAssignment_6()); 

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
    // InternalEsper2Maude.g:485:1: rule__Pattern__Group__7 : rule__Pattern__Group__7__Impl rule__Pattern__Group__8 ;
    public final void rule__Pattern__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:489:1: ( rule__Pattern__Group__7__Impl rule__Pattern__Group__8 )
            // InternalEsper2Maude.g:490:2: rule__Pattern__Group__7__Impl rule__Pattern__Group__8
            {
            pushFollow(FOLLOW_11);
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
    // InternalEsper2Maude.g:497:1: rule__Pattern__Group__7__Impl : ( ( rule__Pattern__SelectEntryAssignment_7 ) ) ;
    public final void rule__Pattern__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:501:1: ( ( ( rule__Pattern__SelectEntryAssignment_7 ) ) )
            // InternalEsper2Maude.g:502:1: ( ( rule__Pattern__SelectEntryAssignment_7 ) )
            {
            // InternalEsper2Maude.g:502:1: ( ( rule__Pattern__SelectEntryAssignment_7 ) )
            // InternalEsper2Maude.g:503:2: ( rule__Pattern__SelectEntryAssignment_7 )
            {
             before(grammarAccess.getPatternAccess().getSelectEntryAssignment_7()); 
            // InternalEsper2Maude.g:504:2: ( rule__Pattern__SelectEntryAssignment_7 )
            // InternalEsper2Maude.g:504:3: rule__Pattern__SelectEntryAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__SelectEntryAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatternAccess().getSelectEntryAssignment_7()); 

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
    // InternalEsper2Maude.g:512:1: rule__Pattern__Group__8 : rule__Pattern__Group__8__Impl rule__Pattern__Group__9 ;
    public final void rule__Pattern__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:516:1: ( rule__Pattern__Group__8__Impl rule__Pattern__Group__9 )
            // InternalEsper2Maude.g:517:2: rule__Pattern__Group__8__Impl rule__Pattern__Group__9
            {
            pushFollow(FOLLOW_12);
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
    // InternalEsper2Maude.g:524:1: rule__Pattern__Group__8__Impl : ( 'from' ) ;
    public final void rule__Pattern__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:528:1: ( ( 'from' ) )
            // InternalEsper2Maude.g:529:1: ( 'from' )
            {
            // InternalEsper2Maude.g:529:1: ( 'from' )
            // InternalEsper2Maude.g:530:2: 'from'
            {
             before(grammarAccess.getPatternAccess().getFromKeyword_8()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getFromKeyword_8()); 

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
    // InternalEsper2Maude.g:539:1: rule__Pattern__Group__9 : rule__Pattern__Group__9__Impl ;
    public final void rule__Pattern__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:543:1: ( rule__Pattern__Group__9__Impl )
            // InternalEsper2Maude.g:544:2: rule__Pattern__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Pattern__Group__9__Impl();

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
    // InternalEsper2Maude.g:550:1: rule__Pattern__Group__9__Impl : ( ( 'group by' )? ) ;
    public final void rule__Pattern__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:554:1: ( ( ( 'group by' )? ) )
            // InternalEsper2Maude.g:555:1: ( ( 'group by' )? )
            {
            // InternalEsper2Maude.g:555:1: ( ( 'group by' )? )
            // InternalEsper2Maude.g:556:2: ( 'group by' )?
            {
             before(grammarAccess.getPatternAccess().getGroupByKeyword_9()); 
            // InternalEsper2Maude.g:557:2: ( 'group by' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEsper2Maude.g:557:3: 'group by'
                    {
                    match(input,20,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getPatternAccess().getGroupByKeyword_9()); 

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


    // $ANTLR start "rule__NonLastSelectEntry__Group__0"
    // InternalEsper2Maude.g:566:1: rule__NonLastSelectEntry__Group__0 : rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1 ;
    public final void rule__NonLastSelectEntry__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:570:1: ( rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1 )
            // InternalEsper2Maude.g:571:2: rule__NonLastSelectEntry__Group__0__Impl rule__NonLastSelectEntry__Group__1
            {
            pushFollow(FOLLOW_13);
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
    // InternalEsper2Maude.g:578:1: rule__NonLastSelectEntry__Group__0__Impl : ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) ) ;
    public final void rule__NonLastSelectEntry__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:582:1: ( ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) ) )
            // InternalEsper2Maude.g:583:1: ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) )
            {
            // InternalEsper2Maude.g:583:1: ( ( rule__NonLastSelectEntry__EntryAssignment_0 ) )
            // InternalEsper2Maude.g:584:2: ( rule__NonLastSelectEntry__EntryAssignment_0 )
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getEntryAssignment_0()); 
            // InternalEsper2Maude.g:585:2: ( rule__NonLastSelectEntry__EntryAssignment_0 )
            // InternalEsper2Maude.g:585:3: rule__NonLastSelectEntry__EntryAssignment_0
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
    // InternalEsper2Maude.g:593:1: rule__NonLastSelectEntry__Group__1 : rule__NonLastSelectEntry__Group__1__Impl ;
    public final void rule__NonLastSelectEntry__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:597:1: ( rule__NonLastSelectEntry__Group__1__Impl )
            // InternalEsper2Maude.g:598:2: rule__NonLastSelectEntry__Group__1__Impl
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
    // InternalEsper2Maude.g:604:1: rule__NonLastSelectEntry__Group__1__Impl : ( ',' ) ;
    public final void rule__NonLastSelectEntry__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:608:1: ( ( ',' ) )
            // InternalEsper2Maude.g:609:1: ( ',' )
            {
            // InternalEsper2Maude.g:609:1: ( ',' )
            // InternalEsper2Maude.g:610:2: ','
            {
             before(grammarAccess.getNonLastSelectEntryAccess().getCommaKeyword_1()); 
            match(input,21,FOLLOW_2); 
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
    // InternalEsper2Maude.g:620:1: rule__SelectEntry__Group_0__0 : rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1 ;
    public final void rule__SelectEntry__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:624:1: ( rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1 )
            // InternalEsper2Maude.g:625:2: rule__SelectEntry__Group_0__0__Impl rule__SelectEntry__Group_0__1
            {
            pushFollow(FOLLOW_14);
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
    // InternalEsper2Maude.g:632:1: rule__SelectEntry__Group_0__0__Impl : ( ( rule__SelectEntry__FieldAssignment_0_0 ) ) ;
    public final void rule__SelectEntry__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:636:1: ( ( ( rule__SelectEntry__FieldAssignment_0_0 ) ) )
            // InternalEsper2Maude.g:637:1: ( ( rule__SelectEntry__FieldAssignment_0_0 ) )
            {
            // InternalEsper2Maude.g:637:1: ( ( rule__SelectEntry__FieldAssignment_0_0 ) )
            // InternalEsper2Maude.g:638:2: ( rule__SelectEntry__FieldAssignment_0_0 )
            {
             before(grammarAccess.getSelectEntryAccess().getFieldAssignment_0_0()); 
            // InternalEsper2Maude.g:639:2: ( rule__SelectEntry__FieldAssignment_0_0 )
            // InternalEsper2Maude.g:639:3: rule__SelectEntry__FieldAssignment_0_0
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
    // InternalEsper2Maude.g:647:1: rule__SelectEntry__Group_0__1 : rule__SelectEntry__Group_0__1__Impl ;
    public final void rule__SelectEntry__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:651:1: ( rule__SelectEntry__Group_0__1__Impl )
            // InternalEsper2Maude.g:652:2: rule__SelectEntry__Group_0__1__Impl
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
    // InternalEsper2Maude.g:658:1: rule__SelectEntry__Group_0__1__Impl : ( ( rule__SelectEntry__Group_0_1__0 )? ) ;
    public final void rule__SelectEntry__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:662:1: ( ( ( rule__SelectEntry__Group_0_1__0 )? ) )
            // InternalEsper2Maude.g:663:1: ( ( rule__SelectEntry__Group_0_1__0 )? )
            {
            // InternalEsper2Maude.g:663:1: ( ( rule__SelectEntry__Group_0_1__0 )? )
            // InternalEsper2Maude.g:664:2: ( rule__SelectEntry__Group_0_1__0 )?
            {
             before(grammarAccess.getSelectEntryAccess().getGroup_0_1()); 
            // InternalEsper2Maude.g:665:2: ( rule__SelectEntry__Group_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalEsper2Maude.g:665:3: rule__SelectEntry__Group_0_1__0
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
    // InternalEsper2Maude.g:674:1: rule__SelectEntry__Group_0_1__0 : rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1 ;
    public final void rule__SelectEntry__Group_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:678:1: ( rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1 )
            // InternalEsper2Maude.g:679:2: rule__SelectEntry__Group_0_1__0__Impl rule__SelectEntry__Group_0_1__1
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
    // InternalEsper2Maude.g:686:1: rule__SelectEntry__Group_0_1__0__Impl : ( 'as' ) ;
    public final void rule__SelectEntry__Group_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:690:1: ( ( 'as' ) )
            // InternalEsper2Maude.g:691:1: ( 'as' )
            {
            // InternalEsper2Maude.g:691:1: ( 'as' )
            // InternalEsper2Maude.g:692:2: 'as'
            {
             before(grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEsper2Maude.g:701:1: rule__SelectEntry__Group_0_1__1 : rule__SelectEntry__Group_0_1__1__Impl ;
    public final void rule__SelectEntry__Group_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:705:1: ( rule__SelectEntry__Group_0_1__1__Impl )
            // InternalEsper2Maude.g:706:2: rule__SelectEntry__Group_0_1__1__Impl
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
    // InternalEsper2Maude.g:712:1: rule__SelectEntry__Group_0_1__1__Impl : ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) ) ;
    public final void rule__SelectEntry__Group_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:716:1: ( ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) ) )
            // InternalEsper2Maude.g:717:1: ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) )
            {
            // InternalEsper2Maude.g:717:1: ( ( rule__SelectEntry__AliasAssignment_0_1_1 ) )
            // InternalEsper2Maude.g:718:2: ( rule__SelectEntry__AliasAssignment_0_1_1 )
            {
             before(grammarAccess.getSelectEntryAccess().getAliasAssignment_0_1_1()); 
            // InternalEsper2Maude.g:719:2: ( rule__SelectEntry__AliasAssignment_0_1_1 )
            // InternalEsper2Maude.g:719:3: rule__SelectEntry__AliasAssignment_0_1_1
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
    // InternalEsper2Maude.g:728:1: rule__SelectEntry__Group_1__0 : rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1 ;
    public final void rule__SelectEntry__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:732:1: ( rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1 )
            // InternalEsper2Maude.g:733:2: rule__SelectEntry__Group_1__0__Impl rule__SelectEntry__Group_1__1
            {
            pushFollow(FOLLOW_15);
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
    // InternalEsper2Maude.g:740:1: rule__SelectEntry__Group_1__0__Impl : ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) ) ;
    public final void rule__SelectEntry__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:744:1: ( ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) ) )
            // InternalEsper2Maude.g:745:1: ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) )
            {
            // InternalEsper2Maude.g:745:1: ( ( rule__SelectEntry__GroupOpAssignment_1_0 ) )
            // InternalEsper2Maude.g:746:2: ( rule__SelectEntry__GroupOpAssignment_1_0 )
            {
             before(grammarAccess.getSelectEntryAccess().getGroupOpAssignment_1_0()); 
            // InternalEsper2Maude.g:747:2: ( rule__SelectEntry__GroupOpAssignment_1_0 )
            // InternalEsper2Maude.g:747:3: rule__SelectEntry__GroupOpAssignment_1_0
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
    // InternalEsper2Maude.g:755:1: rule__SelectEntry__Group_1__1 : rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2 ;
    public final void rule__SelectEntry__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:759:1: ( rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2 )
            // InternalEsper2Maude.g:760:2: rule__SelectEntry__Group_1__1__Impl rule__SelectEntry__Group_1__2
            {
            pushFollow(FOLLOW_16);
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
    // InternalEsper2Maude.g:767:1: rule__SelectEntry__Group_1__1__Impl : ( '(' ) ;
    public final void rule__SelectEntry__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:771:1: ( ( '(' ) )
            // InternalEsper2Maude.g:772:1: ( '(' )
            {
            // InternalEsper2Maude.g:772:1: ( '(' )
            // InternalEsper2Maude.g:773:2: '('
            {
             before(grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1()); 
            match(input,23,FOLLOW_2); 
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
    // InternalEsper2Maude.g:782:1: rule__SelectEntry__Group_1__2 : rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3 ;
    public final void rule__SelectEntry__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:786:1: ( rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3 )
            // InternalEsper2Maude.g:787:2: rule__SelectEntry__Group_1__2__Impl rule__SelectEntry__Group_1__3
            {
            pushFollow(FOLLOW_5);
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
    // InternalEsper2Maude.g:794:1: rule__SelectEntry__Group_1__2__Impl : ( ( rule__SelectEntry__FieldAssignment_1_2 ) ) ;
    public final void rule__SelectEntry__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:798:1: ( ( ( rule__SelectEntry__FieldAssignment_1_2 ) ) )
            // InternalEsper2Maude.g:799:1: ( ( rule__SelectEntry__FieldAssignment_1_2 ) )
            {
            // InternalEsper2Maude.g:799:1: ( ( rule__SelectEntry__FieldAssignment_1_2 ) )
            // InternalEsper2Maude.g:800:2: ( rule__SelectEntry__FieldAssignment_1_2 )
            {
             before(grammarAccess.getSelectEntryAccess().getFieldAssignment_1_2()); 
            // InternalEsper2Maude.g:801:2: ( rule__SelectEntry__FieldAssignment_1_2 )
            // InternalEsper2Maude.g:801:3: rule__SelectEntry__FieldAssignment_1_2
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
    // InternalEsper2Maude.g:809:1: rule__SelectEntry__Group_1__3 : rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4 ;
    public final void rule__SelectEntry__Group_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:813:1: ( rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4 )
            // InternalEsper2Maude.g:814:2: rule__SelectEntry__Group_1__3__Impl rule__SelectEntry__Group_1__4
            {
            pushFollow(FOLLOW_14);
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
    // InternalEsper2Maude.g:821:1: rule__SelectEntry__Group_1__3__Impl : ( ')' ) ;
    public final void rule__SelectEntry__Group_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:825:1: ( ( ')' ) )
            // InternalEsper2Maude.g:826:1: ( ')' )
            {
            // InternalEsper2Maude.g:826:1: ( ')' )
            // InternalEsper2Maude.g:827:2: ')'
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
    // InternalEsper2Maude.g:836:1: rule__SelectEntry__Group_1__4 : rule__SelectEntry__Group_1__4__Impl ;
    public final void rule__SelectEntry__Group_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:840:1: ( rule__SelectEntry__Group_1__4__Impl )
            // InternalEsper2Maude.g:841:2: rule__SelectEntry__Group_1__4__Impl
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
    // InternalEsper2Maude.g:847:1: rule__SelectEntry__Group_1__4__Impl : ( ( rule__SelectEntry__Group_1_4__0 )? ) ;
    public final void rule__SelectEntry__Group_1__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:851:1: ( ( ( rule__SelectEntry__Group_1_4__0 )? ) )
            // InternalEsper2Maude.g:852:1: ( ( rule__SelectEntry__Group_1_4__0 )? )
            {
            // InternalEsper2Maude.g:852:1: ( ( rule__SelectEntry__Group_1_4__0 )? )
            // InternalEsper2Maude.g:853:2: ( rule__SelectEntry__Group_1_4__0 )?
            {
             before(grammarAccess.getSelectEntryAccess().getGroup_1_4()); 
            // InternalEsper2Maude.g:854:2: ( rule__SelectEntry__Group_1_4__0 )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsper2Maude.g:854:3: rule__SelectEntry__Group_1_4__0
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
    // InternalEsper2Maude.g:863:1: rule__SelectEntry__Group_1_4__0 : rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1 ;
    public final void rule__SelectEntry__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:867:1: ( rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1 )
            // InternalEsper2Maude.g:868:2: rule__SelectEntry__Group_1_4__0__Impl rule__SelectEntry__Group_1_4__1
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
    // InternalEsper2Maude.g:875:1: rule__SelectEntry__Group_1_4__0__Impl : ( 'as' ) ;
    public final void rule__SelectEntry__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:879:1: ( ( 'as' ) )
            // InternalEsper2Maude.g:880:1: ( 'as' )
            {
            // InternalEsper2Maude.g:880:1: ( 'as' )
            // InternalEsper2Maude.g:881:2: 'as'
            {
             before(grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalEsper2Maude.g:890:1: rule__SelectEntry__Group_1_4__1 : rule__SelectEntry__Group_1_4__1__Impl ;
    public final void rule__SelectEntry__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:894:1: ( rule__SelectEntry__Group_1_4__1__Impl )
            // InternalEsper2Maude.g:895:2: rule__SelectEntry__Group_1_4__1__Impl
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
    // InternalEsper2Maude.g:901:1: rule__SelectEntry__Group_1_4__1__Impl : ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) ) ;
    public final void rule__SelectEntry__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:905:1: ( ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) ) )
            // InternalEsper2Maude.g:906:1: ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) )
            {
            // InternalEsper2Maude.g:906:1: ( ( rule__SelectEntry__AliasAssignment_1_4_1 ) )
            // InternalEsper2Maude.g:907:2: ( rule__SelectEntry__AliasAssignment_1_4_1 )
            {
             before(grammarAccess.getSelectEntryAccess().getAliasAssignment_1_4_1()); 
            // InternalEsper2Maude.g:908:2: ( rule__SelectEntry__AliasAssignment_1_4_1 )
            // InternalEsper2Maude.g:908:3: rule__SelectEntry__AliasAssignment_1_4_1
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
    // InternalEsper2Maude.g:917:1: rule__Field__Group_1__0 : rule__Field__Group_1__0__Impl rule__Field__Group_1__1 ;
    public final void rule__Field__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:921:1: ( rule__Field__Group_1__0__Impl rule__Field__Group_1__1 )
            // InternalEsper2Maude.g:922:2: rule__Field__Group_1__0__Impl rule__Field__Group_1__1
            {
            pushFollow(FOLLOW_7);
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
    // InternalEsper2Maude.g:929:1: rule__Field__Group_1__0__Impl : ( 'e.' ) ;
    public final void rule__Field__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:933:1: ( ( 'e.' ) )
            // InternalEsper2Maude.g:934:1: ( 'e.' )
            {
            // InternalEsper2Maude.g:934:1: ( 'e.' )
            // InternalEsper2Maude.g:935:2: 'e.'
            {
             before(grammarAccess.getFieldAccess().getEKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getEKeyword_1_0()); 

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
    // InternalEsper2Maude.g:944:1: rule__Field__Group_1__1 : rule__Field__Group_1__1__Impl ;
    public final void rule__Field__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:948:1: ( rule__Field__Group_1__1__Impl )
            // InternalEsper2Maude.g:949:2: rule__Field__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group_1__1__Impl();

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
    // InternalEsper2Maude.g:955:1: rule__Field__Group_1__1__Impl : ( ( rule__Field__NameAssignment_1_1 ) ) ;
    public final void rule__Field__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:959:1: ( ( ( rule__Field__NameAssignment_1_1 ) ) )
            // InternalEsper2Maude.g:960:1: ( ( rule__Field__NameAssignment_1_1 ) )
            {
            // InternalEsper2Maude.g:960:1: ( ( rule__Field__NameAssignment_1_1 ) )
            // InternalEsper2Maude.g:961:2: ( rule__Field__NameAssignment_1_1 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_1_1()); 
            // InternalEsper2Maude.g:962:2: ( rule__Field__NameAssignment_1_1 )
            // InternalEsper2Maude.g:962:3: rule__Field__NameAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_1_1()); 

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


    // $ANTLR start "rule__Model__PatternsAssignment"
    // InternalEsper2Maude.g:971:1: rule__Model__PatternsAssignment : ( rulePattern ) ;
    public final void rule__Model__PatternsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:975:1: ( ( rulePattern ) )
            // InternalEsper2Maude.g:976:2: ( rulePattern )
            {
            // InternalEsper2Maude.g:976:2: ( rulePattern )
            // InternalEsper2Maude.g:977:3: rulePattern
            {
             before(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePattern();

            state._fsp--;

             after(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_0()); 

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
    // $ANTLR end "rule__Model__PatternsAssignment"


    // $ANTLR start "rule__Pattern__NameAssignment_1"
    // InternalEsper2Maude.g:986:1: rule__Pattern__NameAssignment_1 : ( RULE_STRING ) ;
    public final void rule__Pattern__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:990:1: ( ( RULE_STRING ) )
            // InternalEsper2Maude.g:991:2: ( RULE_STRING )
            {
            // InternalEsper2Maude.g:991:2: ( RULE_STRING )
            // InternalEsper2Maude.g:992:3: RULE_STRING
            {
             before(grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Pattern__NameAssignment_1"


    // $ANTLR start "rule__Pattern__EventAssignment_4"
    // InternalEsper2Maude.g:1001:1: rule__Pattern__EventAssignment_4 : ( RULE_ID ) ;
    public final void rule__Pattern__EventAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1005:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:1006:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:1006:2: ( RULE_ID )
            // InternalEsper2Maude.g:1007:3: RULE_ID
            {
             before(grammarAccess.getPatternAccess().getEventIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatternAccess().getEventIDTerminalRuleCall_4_0()); 

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
    // $ANTLR end "rule__Pattern__EventAssignment_4"


    // $ANTLR start "rule__Pattern__SelectEntriesAssignment_6"
    // InternalEsper2Maude.g:1016:1: rule__Pattern__SelectEntriesAssignment_6 : ( ruleNonLastSelectEntry ) ;
    public final void rule__Pattern__SelectEntriesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1020:1: ( ( ruleNonLastSelectEntry ) )
            // InternalEsper2Maude.g:1021:2: ( ruleNonLastSelectEntry )
            {
            // InternalEsper2Maude.g:1021:2: ( ruleNonLastSelectEntry )
            // InternalEsper2Maude.g:1022:3: ruleNonLastSelectEntry
            {
             before(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleNonLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_6_0()); 

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
    // $ANTLR end "rule__Pattern__SelectEntriesAssignment_6"


    // $ANTLR start "rule__Pattern__SelectEntryAssignment_7"
    // InternalEsper2Maude.g:1031:1: rule__Pattern__SelectEntryAssignment_7 : ( ruleLastSelectEntry ) ;
    public final void rule__Pattern__SelectEntryAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1035:1: ( ( ruleLastSelectEntry ) )
            // InternalEsper2Maude.g:1036:2: ( ruleLastSelectEntry )
            {
            // InternalEsper2Maude.g:1036:2: ( ruleLastSelectEntry )
            // InternalEsper2Maude.g:1037:3: ruleLastSelectEntry
            {
             before(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleLastSelectEntry();

            state._fsp--;

             after(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_7_0()); 

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
    // $ANTLR end "rule__Pattern__SelectEntryAssignment_7"


    // $ANTLR start "rule__NonLastSelectEntry__EntryAssignment_0"
    // InternalEsper2Maude.g:1046:1: rule__NonLastSelectEntry__EntryAssignment_0 : ( ruleSelectEntry ) ;
    public final void rule__NonLastSelectEntry__EntryAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1050:1: ( ( ruleSelectEntry ) )
            // InternalEsper2Maude.g:1051:2: ( ruleSelectEntry )
            {
            // InternalEsper2Maude.g:1051:2: ( ruleSelectEntry )
            // InternalEsper2Maude.g:1052:3: ruleSelectEntry
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
    // InternalEsper2Maude.g:1061:1: rule__LastSelectEntry__EntryAssignment : ( ruleSelectEntry ) ;
    public final void rule__LastSelectEntry__EntryAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1065:1: ( ( ruleSelectEntry ) )
            // InternalEsper2Maude.g:1066:2: ( ruleSelectEntry )
            {
            // InternalEsper2Maude.g:1066:2: ( ruleSelectEntry )
            // InternalEsper2Maude.g:1067:3: ruleSelectEntry
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
    // InternalEsper2Maude.g:1076:1: rule__SelectEntry__FieldAssignment_0_0 : ( ruleField ) ;
    public final void rule__SelectEntry__FieldAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1080:1: ( ( ruleField ) )
            // InternalEsper2Maude.g:1081:2: ( ruleField )
            {
            // InternalEsper2Maude.g:1081:2: ( ruleField )
            // InternalEsper2Maude.g:1082:3: ruleField
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
    // InternalEsper2Maude.g:1091:1: rule__SelectEntry__AliasAssignment_0_1_1 : ( RULE_ID ) ;
    public final void rule__SelectEntry__AliasAssignment_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1095:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:1096:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:1096:2: ( RULE_ID )
            // InternalEsper2Maude.g:1097:3: RULE_ID
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
    // InternalEsper2Maude.g:1106:1: rule__SelectEntry__GroupOpAssignment_1_0 : ( ruleGroupOp ) ;
    public final void rule__SelectEntry__GroupOpAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1110:1: ( ( ruleGroupOp ) )
            // InternalEsper2Maude.g:1111:2: ( ruleGroupOp )
            {
            // InternalEsper2Maude.g:1111:2: ( ruleGroupOp )
            // InternalEsper2Maude.g:1112:3: ruleGroupOp
            {
             before(grammarAccess.getSelectEntryAccess().getGroupOpGroupOpParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupOp();

            state._fsp--;

             after(grammarAccess.getSelectEntryAccess().getGroupOpGroupOpParserRuleCall_1_0_0()); 

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
    // InternalEsper2Maude.g:1121:1: rule__SelectEntry__FieldAssignment_1_2 : ( ruleField ) ;
    public final void rule__SelectEntry__FieldAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1125:1: ( ( ruleField ) )
            // InternalEsper2Maude.g:1126:2: ( ruleField )
            {
            // InternalEsper2Maude.g:1126:2: ( ruleField )
            // InternalEsper2Maude.g:1127:3: ruleField
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
    // InternalEsper2Maude.g:1136:1: rule__SelectEntry__AliasAssignment_1_4_1 : ( RULE_ID ) ;
    public final void rule__SelectEntry__AliasAssignment_1_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1140:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:1141:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:1141:2: ( RULE_ID )
            // InternalEsper2Maude.g:1142:3: RULE_ID
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


    // $ANTLR start "rule__Field__NameAssignment_1_1"
    // InternalEsper2Maude.g:1151:1: rule__Field__NameAssignment_1_1 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalEsper2Maude.g:1155:1: ( ( RULE_ID ) )
            // InternalEsper2Maude.g:1156:2: ( RULE_ID )
            {
            // InternalEsper2Maude.g:1156:2: ( RULE_ID )
            // InternalEsper2Maude.g:1157:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_1_1"

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\13\1\23\1\5\3\27\1\5\2\uffff\1\23\1\13\1\23\1\20\1\5\1\23\1\20\1\5\1\23";
    static final String dfa_3s = "\1\30\1\26\1\5\3\27\1\5\2\uffff\1\26\1\30\1\25\1\20\1\5\1\26\1\20\1\5\1\25";
    static final String dfa_4s = "\7\uffff\1\2\1\1\11\uffff";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\3\1\4\1\5\11\uffff\1\2",
            "\1\7\1\uffff\1\10\1\6",
            "\1\11",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\7\1\uffff\1\10\1\6",
            "\1\14\14\uffff\1\15",
            "\1\7\1\uffff\1\10",
            "\1\16",
            "\1\17",
            "\1\7\1\uffff\1\10\1\20",
            "\1\16",
            "\1\21",
            "\1\7\1\uffff\1\10"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 477:2: ( rule__Pattern__SelectEntriesAssignment_6 )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001007800L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001007802L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000800L});

}