package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.Esper2MaudeGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalEsper2MaudeParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'@Name('", "')'", "'insert into'", "'select'", "'from'", "'group by'", "','", "'as'", "'('", "'*'", "'e.'", "'count'", "'max'", "'min'"
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

        public InternalEsper2MaudeParser(TokenStream input, Esper2MaudeGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected Esper2MaudeGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalEsper2Maude.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalEsper2Maude.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalEsper2Maude.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalEsper2Maude.g:71:1: ruleModel returns [EObject current=null] : ( (lv_patterns_0_0= rulePattern ) )* ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_patterns_0_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:77:2: ( ( (lv_patterns_0_0= rulePattern ) )* )
            // InternalEsper2Maude.g:78:2: ( (lv_patterns_0_0= rulePattern ) )*
            {
            // InternalEsper2Maude.g:78:2: ( (lv_patterns_0_0= rulePattern ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsper2Maude.g:79:3: (lv_patterns_0_0= rulePattern )
            	    {
            	    // InternalEsper2Maude.g:79:3: (lv_patterns_0_0= rulePattern )
            	    // InternalEsper2Maude.g:80:4: lv_patterns_0_0= rulePattern
            	    {

            	    				newCompositeNode(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_0());
            	    			
            	    pushFollow(FOLLOW_3);
            	    lv_patterns_0_0=rulePattern();

            	    state._fsp--;


            	    				if (current==null) {
            	    					current = createModelElementForParent(grammarAccess.getModelRule());
            	    				}
            	    				add(
            	    					current,
            	    					"patterns",
            	    					lv_patterns_0_0,
            	    					"org.xtext.example.mydsl.Esper2Maude.Pattern");
            	    				afterParserOrEnumRuleCall();
            	    			

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRulePattern"
    // InternalEsper2Maude.g:100:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalEsper2Maude.g:100:48: (iv_rulePattern= rulePattern EOF )
            // InternalEsper2Maude.g:101:2: iv_rulePattern= rulePattern EOF
            {
             newCompositeNode(grammarAccess.getPatternRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePattern=rulePattern();

            state._fsp--;

             current =iv_rulePattern; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePattern"


    // $ANTLR start "rulePattern"
    // InternalEsper2Maude.g:107:1: rulePattern returns [EObject current=null] : (otherlv_0= '@Name(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= 'insert into' ( (lv_event_4_0= RULE_ID ) ) otherlv_5= 'select' ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_7_0= ruleLastSelectEntry ) ) otherlv_8= 'from' (otherlv_9= 'group by' )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_event_4_0=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_selectEntries_6_0 = null;

        EObject lv_selectEntry_7_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:113:2: ( (otherlv_0= '@Name(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= 'insert into' ( (lv_event_4_0= RULE_ID ) ) otherlv_5= 'select' ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_7_0= ruleLastSelectEntry ) ) otherlv_8= 'from' (otherlv_9= 'group by' )? ) )
            // InternalEsper2Maude.g:114:2: (otherlv_0= '@Name(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= 'insert into' ( (lv_event_4_0= RULE_ID ) ) otherlv_5= 'select' ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_7_0= ruleLastSelectEntry ) ) otherlv_8= 'from' (otherlv_9= 'group by' )? )
            {
            // InternalEsper2Maude.g:114:2: (otherlv_0= '@Name(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= 'insert into' ( (lv_event_4_0= RULE_ID ) ) otherlv_5= 'select' ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_7_0= ruleLastSelectEntry ) ) otherlv_8= 'from' (otherlv_9= 'group by' )? )
            // InternalEsper2Maude.g:115:3: otherlv_0= '@Name(' ( (lv_name_1_0= RULE_STRING ) ) otherlv_2= ')' otherlv_3= 'insert into' ( (lv_event_4_0= RULE_ID ) ) otherlv_5= 'select' ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_7_0= ruleLastSelectEntry ) ) otherlv_8= 'from' (otherlv_9= 'group by' )?
            {
            otherlv_0=(Token)match(input,11,FOLLOW_4); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getNameKeyword_0());
            		
            // InternalEsper2Maude.g:119:3: ( (lv_name_1_0= RULE_STRING ) )
            // InternalEsper2Maude.g:120:4: (lv_name_1_0= RULE_STRING )
            {
            // InternalEsper2Maude.g:120:4: (lv_name_1_0= RULE_STRING )
            // InternalEsper2Maude.g:121:5: lv_name_1_0= RULE_STRING
            {
            lv_name_1_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2());
            		
            otherlv_3=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getInsertIntoKeyword_3());
            		
            // InternalEsper2Maude.g:145:3: ( (lv_event_4_0= RULE_ID ) )
            // InternalEsper2Maude.g:146:4: (lv_event_4_0= RULE_ID )
            {
            // InternalEsper2Maude.g:146:4: (lv_event_4_0= RULE_ID )
            // InternalEsper2Maude.g:147:5: lv_event_4_0= RULE_ID
            {
            lv_event_4_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_event_4_0, grammarAccess.getPatternAccess().getEventIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"event",
            						lv_event_4_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_5=(Token)match(input,14,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getSelectKeyword_5());
            		
            // InternalEsper2Maude.g:167:3: ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )*
            loop2:
            do {
                int alt2=2;
                alt2 = dfa2.predict(input);
                switch (alt2) {
            	case 1 :
            	    // InternalEsper2Maude.g:168:4: (lv_selectEntries_6_0= ruleNonLastSelectEntry )
            	    {
            	    // InternalEsper2Maude.g:168:4: (lv_selectEntries_6_0= ruleNonLastSelectEntry )
            	    // InternalEsper2Maude.g:169:5: lv_selectEntries_6_0= ruleNonLastSelectEntry
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_9);
            	    lv_selectEntries_6_0=ruleNonLastSelectEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selectEntries",
            	    						lv_selectEntries_6_0,
            	    						"org.xtext.example.mydsl.Esper2Maude.NonLastSelectEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalEsper2Maude.g:186:3: ( (lv_selectEntry_7_0= ruleLastSelectEntry ) )
            // InternalEsper2Maude.g:187:4: (lv_selectEntry_7_0= ruleLastSelectEntry )
            {
            // InternalEsper2Maude.g:187:4: (lv_selectEntry_7_0= ruleLastSelectEntry )
            // InternalEsper2Maude.g:188:5: lv_selectEntry_7_0= ruleLastSelectEntry
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_10);
            lv_selectEntry_7_0=ruleLastSelectEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"selectEntry",
            						lv_selectEntry_7_0,
            						"org.xtext.example.mydsl.Esper2Maude.LastSelectEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_8=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getFromKeyword_8());
            		
            // InternalEsper2Maude.g:209:3: (otherlv_9= 'group by' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsper2Maude.g:210:4: otherlv_9= 'group by'
                    {
                    otherlv_9=(Token)match(input,16,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getGroupByKeyword_9());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePattern"


    // $ANTLR start "entryRuleNonLastSelectEntry"
    // InternalEsper2Maude.g:219:1: entryRuleNonLastSelectEntry returns [EObject current=null] : iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF ;
    public final EObject entryRuleNonLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonLastSelectEntry = null;


        try {
            // InternalEsper2Maude.g:219:59: (iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF )
            // InternalEsper2Maude.g:220:2: iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF
            {
             newCompositeNode(grammarAccess.getNonLastSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNonLastSelectEntry=ruleNonLastSelectEntry();

            state._fsp--;

             current =iv_ruleNonLastSelectEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNonLastSelectEntry"


    // $ANTLR start "ruleNonLastSelectEntry"
    // InternalEsper2Maude.g:226:1: ruleNonLastSelectEntry returns [EObject current=null] : ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' ) ;
    public final EObject ruleNonLastSelectEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entry_0_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:232:2: ( ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' ) )
            // InternalEsper2Maude.g:233:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' )
            {
            // InternalEsper2Maude.g:233:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' )
            // InternalEsper2Maude.g:234:3: ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ','
            {
            // InternalEsper2Maude.g:234:3: ( (lv_entry_0_0= ruleSelectEntry ) )
            // InternalEsper2Maude.g:235:4: (lv_entry_0_0= ruleSelectEntry )
            {
            // InternalEsper2Maude.g:235:4: (lv_entry_0_0= ruleSelectEntry )
            // InternalEsper2Maude.g:236:5: lv_entry_0_0= ruleSelectEntry
            {

            					newCompositeNode(grammarAccess.getNonLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_entry_0_0=ruleSelectEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNonLastSelectEntryRule());
            					}
            					set(
            						current,
            						"entry",
            						lv_entry_0_0,
            						"org.xtext.example.mydsl.Esper2Maude.SelectEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getNonLastSelectEntryAccess().getCommaKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNonLastSelectEntry"


    // $ANTLR start "entryRuleLastSelectEntry"
    // InternalEsper2Maude.g:261:1: entryRuleLastSelectEntry returns [EObject current=null] : iv_ruleLastSelectEntry= ruleLastSelectEntry EOF ;
    public final EObject entryRuleLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastSelectEntry = null;


        try {
            // InternalEsper2Maude.g:261:56: (iv_ruleLastSelectEntry= ruleLastSelectEntry EOF )
            // InternalEsper2Maude.g:262:2: iv_ruleLastSelectEntry= ruleLastSelectEntry EOF
            {
             newCompositeNode(grammarAccess.getLastSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLastSelectEntry=ruleLastSelectEntry();

            state._fsp--;

             current =iv_ruleLastSelectEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLastSelectEntry"


    // $ANTLR start "ruleLastSelectEntry"
    // InternalEsper2Maude.g:268:1: ruleLastSelectEntry returns [EObject current=null] : ( (lv_entry_0_0= ruleSelectEntry ) ) ;
    public final EObject ruleLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_entry_0_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:274:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) )
            // InternalEsper2Maude.g:275:2: ( (lv_entry_0_0= ruleSelectEntry ) )
            {
            // InternalEsper2Maude.g:275:2: ( (lv_entry_0_0= ruleSelectEntry ) )
            // InternalEsper2Maude.g:276:3: (lv_entry_0_0= ruleSelectEntry )
            {
            // InternalEsper2Maude.g:276:3: (lv_entry_0_0= ruleSelectEntry )
            // InternalEsper2Maude.g:277:4: lv_entry_0_0= ruleSelectEntry
            {

            				newCompositeNode(grammarAccess.getLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_entry_0_0=ruleSelectEntry();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getLastSelectEntryRule());
            				}
            				set(
            					current,
            					"entry",
            					lv_entry_0_0,
            					"org.xtext.example.mydsl.Esper2Maude.SelectEntry");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLastSelectEntry"


    // $ANTLR start "entryRuleSelectEntry"
    // InternalEsper2Maude.g:297:1: entryRuleSelectEntry returns [EObject current=null] : iv_ruleSelectEntry= ruleSelectEntry EOF ;
    public final EObject entryRuleSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectEntry = null;


        try {
            // InternalEsper2Maude.g:297:52: (iv_ruleSelectEntry= ruleSelectEntry EOF )
            // InternalEsper2Maude.g:298:2: iv_ruleSelectEntry= ruleSelectEntry EOF
            {
             newCompositeNode(grammarAccess.getSelectEntryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelectEntry=ruleSelectEntry();

            state._fsp--;

             current =iv_ruleSelectEntry; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSelectEntry"


    // $ANTLR start "ruleSelectEntry"
    // InternalEsper2Maude.g:304:1: ruleSelectEntry returns [EObject current=null] : ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleSelectEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        EObject lv_field_0_0 = null;

        AntlrDatatypeRuleToken lv_groupOp_3_0 = null;

        EObject lv_field_5_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:310:2: ( ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) ) )
            // InternalEsper2Maude.g:311:2: ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) )
            {
            // InternalEsper2Maude.g:311:2: ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=22 && LA6_0<=24)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEsper2Maude.g:312:3: ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEsper2Maude.g:312:3: ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
                    // InternalEsper2Maude.g:313:4: ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
                    {
                    // InternalEsper2Maude.g:313:4: ( (lv_field_0_0= ruleField ) )
                    // InternalEsper2Maude.g:314:5: (lv_field_0_0= ruleField )
                    {
                    // InternalEsper2Maude.g:314:5: (lv_field_0_0= ruleField )
                    // InternalEsper2Maude.g:315:6: lv_field_0_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_13);
                    lv_field_0_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectEntryRule());
                    						}
                    						set(
                    							current,
                    							"field",
                    							lv_field_0_0,
                    							"org.xtext.example.mydsl.Esper2Maude.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsper2Maude.g:332:4: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==18) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // InternalEsper2Maude.g:333:5: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,18,FOLLOW_7); 

                            					newLeafNode(otherlv_1, grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0());
                            				
                            // InternalEsper2Maude.g:337:5: ( (lv_alias_2_0= RULE_ID ) )
                            // InternalEsper2Maude.g:338:6: (lv_alias_2_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:338:6: (lv_alias_2_0= RULE_ID )
                            // InternalEsper2Maude.g:339:7: lv_alias_2_0= RULE_ID
                            {
                            lv_alias_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_alias_2_0, grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_0_1_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSelectEntryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"alias",
                            								lv_alias_2_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:358:3: ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? )
                    {
                    // InternalEsper2Maude.g:358:3: ( ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? )
                    // InternalEsper2Maude.g:359:4: ( (lv_groupOp_3_0= ruleGroupOp ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
                    {
                    // InternalEsper2Maude.g:359:4: ( (lv_groupOp_3_0= ruleGroupOp ) )
                    // InternalEsper2Maude.g:360:5: (lv_groupOp_3_0= ruleGroupOp )
                    {
                    // InternalEsper2Maude.g:360:5: (lv_groupOp_3_0= ruleGroupOp )
                    // InternalEsper2Maude.g:361:6: lv_groupOp_3_0= ruleGroupOp
                    {

                    						newCompositeNode(grammarAccess.getSelectEntryAccess().getGroupOpGroupOpParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_groupOp_3_0=ruleGroupOp();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectEntryRule());
                    						}
                    						set(
                    							current,
                    							"groupOp",
                    							lv_groupOp_3_0,
                    							"org.xtext.example.mydsl.Esper2Maude.GroupOp");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,19,FOLLOW_15); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:382:4: ( (lv_field_5_0= ruleField ) )
                    // InternalEsper2Maude.g:383:5: (lv_field_5_0= ruleField )
                    {
                    // InternalEsper2Maude.g:383:5: (lv_field_5_0= ruleField )
                    // InternalEsper2Maude.g:384:6: lv_field_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_5);
                    lv_field_5_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSelectEntryRule());
                    						}
                    						set(
                    							current,
                    							"field",
                    							lv_field_5_0,
                    							"org.xtext.example.mydsl.Esper2Maude.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectEntryAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalEsper2Maude.g:405:4: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==18) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // InternalEsper2Maude.g:406:5: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                            {
                            otherlv_7=(Token)match(input,18,FOLLOW_7); 

                            					newLeafNode(otherlv_7, grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0());
                            				
                            // InternalEsper2Maude.g:410:5: ( (lv_alias_8_0= RULE_ID ) )
                            // InternalEsper2Maude.g:411:6: (lv_alias_8_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:411:6: (lv_alias_8_0= RULE_ID )
                            // InternalEsper2Maude.g:412:7: lv_alias_8_0= RULE_ID
                            {
                            lv_alias_8_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                            							newLeafNode(lv_alias_8_0, grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_1_4_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSelectEntryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"alias",
                            								lv_alias_8_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSelectEntry"


    // $ANTLR start "entryRuleField"
    // InternalEsper2Maude.g:434:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalEsper2Maude.g:434:46: (iv_ruleField= ruleField EOF )
            // InternalEsper2Maude.g:435:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalEsper2Maude.g:441:1: ruleField returns [EObject current=null] : (otherlv_0= '*' | (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:447:2: ( (otherlv_0= '*' | (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) ) ) )
            // InternalEsper2Maude.g:448:2: (otherlv_0= '*' | (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) ) )
            {
            // InternalEsper2Maude.g:448:2: (otherlv_0= '*' | (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEsper2Maude.g:449:3: otherlv_0= '*'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_2); 

                    			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getAsteriskKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:454:3: (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) )
                    {
                    // InternalEsper2Maude.g:454:3: (otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) ) )
                    // InternalEsper2Maude.g:455:4: otherlv_1= 'e.' ( (lv_name_2_0= RULE_ID ) )
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEKeyword_1_0());
                    			
                    // InternalEsper2Maude.g:459:4: ( (lv_name_2_0= RULE_ID ) )
                    // InternalEsper2Maude.g:460:5: (lv_name_2_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:460:5: (lv_name_2_0= RULE_ID )
                    // InternalEsper2Maude.g:461:6: lv_name_2_0= RULE_ID
                    {
                    lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"name",
                    							lv_name_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleGroupOp"
    // InternalEsper2Maude.g:482:1: entryRuleGroupOp returns [String current=null] : iv_ruleGroupOp= ruleGroupOp EOF ;
    public final String entryRuleGroupOp() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleGroupOp = null;


        try {
            // InternalEsper2Maude.g:482:47: (iv_ruleGroupOp= ruleGroupOp EOF )
            // InternalEsper2Maude.g:483:2: iv_ruleGroupOp= ruleGroupOp EOF
            {
             newCompositeNode(grammarAccess.getGroupOpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupOp=ruleGroupOp();

            state._fsp--;

             current =iv_ruleGroupOp.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGroupOp"


    // $ANTLR start "ruleGroupOp"
    // InternalEsper2Maude.g:489:1: ruleGroupOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'count' | kw= 'max' | kw= 'min' ) ;
    public final AntlrDatatypeRuleToken ruleGroupOp() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:495:2: ( (kw= 'count' | kw= 'max' | kw= 'min' ) )
            // InternalEsper2Maude.g:496:2: (kw= 'count' | kw= 'max' | kw= 'min' )
            {
            // InternalEsper2Maude.g:496:2: (kw= 'count' | kw= 'max' | kw= 'min' )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt8=1;
                }
                break;
            case 23:
                {
                alt8=2;
                }
                break;
            case 24:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalEsper2Maude.g:497:3: kw= 'count'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGroupOpAccess().getCountKeyword_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:503:3: kw= 'max'
                    {
                    kw=(Token)match(input,23,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGroupOpAccess().getMaxKeyword_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:509:3: kw= 'min'
                    {
                    kw=(Token)match(input,24,FOLLOW_2); 

                    			current.merge(kw);
                    			newLeafNode(kw, grammarAccess.getGroupOpAccess().getMinKeyword_2());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGroupOp"

    // Delegated rules


    protected DFA2 dfa2 = new DFA2(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\24\1\17\1\5\3\23\1\5\2\uffff\1\17\1\24\1\17\1\14\1\5\1\17\1\14\1\5\1\17";
    static final String dfa_3s = "\1\30\1\22\1\5\3\23\1\5\2\uffff\1\22\1\25\1\21\1\14\1\5\1\22\1\14\1\5\1\21";
    static final String dfa_4s = "\7\uffff\1\1\1\2\11\uffff";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2\1\3\1\4\1\5",
            "\1\10\1\uffff\1\7\1\6",
            "\1\11",
            "\1\12",
            "\1\12",
            "\1\12",
            "\1\13",
            "",
            "",
            "\1\10\1\uffff\1\7\1\6",
            "\1\14\1\15",
            "\1\10\1\uffff\1\7",
            "\1\16",
            "\1\17",
            "\1\10\1\uffff\1\7\1\20",
            "\1\16",
            "\1\21",
            "\1\10\1\uffff\1\7"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA2 extends DFA {

        public DFA2(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 2;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "()* loopback of 167:3: ( (lv_selectEntries_6_0= ruleNonLastSelectEntry ) )*";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001F00000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000300000L});

}