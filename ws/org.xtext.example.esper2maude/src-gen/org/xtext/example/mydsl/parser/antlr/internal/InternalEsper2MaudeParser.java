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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_PROP_TYPE", "RULE_STRING", "RULE_INT", "RULE_GROUP_OP", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'create'", "'schema'", "'('", "','", "')'", "'@Name'", "'@Priority'", "'insert'", "'into'", "'select'", "'from'", "'pattern'", "'['", "']'", "'.'", "'win:time'", "'milliseconds'", "'win:time_batch'", "'timer:within'", "'every'", "'='", "'->'", "'where'", "'-'", "'true'", "'false'", "'>'", "'>='", "'<>'", "'<'", "'<='", "'and'", "'or'", "'as'", "'*'"
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
    // InternalEsper2Maude.g:71:1: ruleModel returns [EObject current=null] : ( ( (lv_schemas_0_0= ruleSchema ) )* ( (lv_patterns_1_0= rulePattern ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        EObject lv_schemas_0_0 = null;

        EObject lv_patterns_1_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:77:2: ( ( ( (lv_schemas_0_0= ruleSchema ) )* ( (lv_patterns_1_0= rulePattern ) )* ) )
            // InternalEsper2Maude.g:78:2: ( ( (lv_schemas_0_0= ruleSchema ) )* ( (lv_patterns_1_0= rulePattern ) )* )
            {
            // InternalEsper2Maude.g:78:2: ( ( (lv_schemas_0_0= ruleSchema ) )* ( (lv_patterns_1_0= rulePattern ) )* )
            // InternalEsper2Maude.g:79:3: ( (lv_schemas_0_0= ruleSchema ) )* ( (lv_patterns_1_0= rulePattern ) )*
            {
            // InternalEsper2Maude.g:79:3: ( (lv_schemas_0_0= ruleSchema ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalEsper2Maude.g:80:4: (lv_schemas_0_0= ruleSchema )
            	    {
            	    // InternalEsper2Maude.g:80:4: (lv_schemas_0_0= ruleSchema )
            	    // InternalEsper2Maude.g:81:5: lv_schemas_0_0= ruleSchema
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getSchemasSchemaParserRuleCall_0_0());
            	    				
            	    pushFollow(FOLLOW_3);
            	    lv_schemas_0_0=ruleSchema();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"schemas",
            	    						lv_schemas_0_0,
            	    						"org.xtext.example.mydsl.Esper2Maude.Schema");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalEsper2Maude.g:98:3: ( (lv_patterns_1_0= rulePattern ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==18) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalEsper2Maude.g:99:4: (lv_patterns_1_0= rulePattern )
            	    {
            	    // InternalEsper2Maude.g:99:4: (lv_patterns_1_0= rulePattern )
            	    // InternalEsper2Maude.g:100:5: lv_patterns_1_0= rulePattern
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_patterns_1_0=rulePattern();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"patterns",
            	    						lv_patterns_1_0,
            	    						"org.xtext.example.mydsl.Esper2Maude.Pattern");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleSchema"
    // InternalEsper2Maude.g:121:1: entryRuleSchema returns [EObject current=null] : iv_ruleSchema= ruleSchema EOF ;
    public final EObject entryRuleSchema() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSchema = null;


        try {
            // InternalEsper2Maude.g:121:47: (iv_ruleSchema= ruleSchema EOF )
            // InternalEsper2Maude.g:122:2: iv_ruleSchema= ruleSchema EOF
            {
             newCompositeNode(grammarAccess.getSchemaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSchema=ruleSchema();

            state._fsp--;

             current =iv_ruleSchema; 
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
    // $ANTLR end "entryRuleSchema"


    // $ANTLR start "ruleSchema"
    // InternalEsper2Maude.g:128:1: ruleSchema returns [EObject current=null] : (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_prop_4_0= ruleEventProperty ) )? (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleSchema() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_prop_4_0 = null;

        EObject lv_props_6_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:134:2: ( (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_prop_4_0= ruleEventProperty ) )? (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )* otherlv_7= ')' ) )
            // InternalEsper2Maude.g:135:2: (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_prop_4_0= ruleEventProperty ) )? (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )* otherlv_7= ')' )
            {
            // InternalEsper2Maude.g:135:2: (otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_prop_4_0= ruleEventProperty ) )? (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )* otherlv_7= ')' )
            // InternalEsper2Maude.g:136:3: otherlv_0= 'create' otherlv_1= 'schema' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (lv_prop_4_0= ruleEventProperty ) )? (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )* otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getSchemaAccess().getCreateKeyword_0());
            		
            otherlv_1=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getSchemaAccess().getSchemaKeyword_1());
            		
            // InternalEsper2Maude.g:144:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalEsper2Maude.g:145:4: (lv_name_2_0= RULE_ID )
            {
            // InternalEsper2Maude.g:145:4: (lv_name_2_0= RULE_ID )
            // InternalEsper2Maude.g:146:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSchemaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSchemaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getSchemaAccess().getLeftParenthesisKeyword_3());
            		
            // InternalEsper2Maude.g:166:3: ( (lv_prop_4_0= ruleEventProperty ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalEsper2Maude.g:167:4: (lv_prop_4_0= ruleEventProperty )
                    {
                    // InternalEsper2Maude.g:167:4: (lv_prop_4_0= ruleEventProperty )
                    // InternalEsper2Maude.g:168:5: lv_prop_4_0= ruleEventProperty
                    {

                    					newCompositeNode(grammarAccess.getSchemaAccess().getPropEventPropertyParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_prop_4_0=ruleEventProperty();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSchemaRule());
                    					}
                    					set(
                    						current,
                    						"prop",
                    						lv_prop_4_0,
                    						"org.xtext.example.mydsl.Esper2Maude.EventProperty");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalEsper2Maude.g:185:3: (otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==16) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEsper2Maude.g:186:4: otherlv_5= ',' ( (lv_props_6_0= ruleEventProperty ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_6); 

            	    				newLeafNode(otherlv_5, grammarAccess.getSchemaAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalEsper2Maude.g:190:4: ( (lv_props_6_0= ruleEventProperty ) )
            	    // InternalEsper2Maude.g:191:5: (lv_props_6_0= ruleEventProperty )
            	    {
            	    // InternalEsper2Maude.g:191:5: (lv_props_6_0= ruleEventProperty )
            	    // InternalEsper2Maude.g:192:6: lv_props_6_0= ruleEventProperty
            	    {

            	    						newCompositeNode(grammarAccess.getSchemaAccess().getPropsEventPropertyParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_props_6_0=ruleEventProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getSchemaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"props",
            	    							lv_props_6_0,
            	    							"org.xtext.example.mydsl.Esper2Maude.EventProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getSchemaAccess().getRightParenthesisKeyword_6());
            		

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
    // $ANTLR end "ruleSchema"


    // $ANTLR start "entryRuleEventProperty"
    // InternalEsper2Maude.g:218:1: entryRuleEventProperty returns [EObject current=null] : iv_ruleEventProperty= ruleEventProperty EOF ;
    public final EObject entryRuleEventProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEventProperty = null;


        try {
            // InternalEsper2Maude.g:218:54: (iv_ruleEventProperty= ruleEventProperty EOF )
            // InternalEsper2Maude.g:219:2: iv_ruleEventProperty= ruleEventProperty EOF
            {
             newCompositeNode(grammarAccess.getEventPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEventProperty=ruleEventProperty();

            state._fsp--;

             current =iv_ruleEventProperty; 
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
    // $ANTLR end "entryRuleEventProperty"


    // $ANTLR start "ruleEventProperty"
    // InternalEsper2Maude.g:225:1: ruleEventProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_PROP_TYPE ) ) ) ;
    public final EObject ruleEventProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token lv_type_1_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:231:2: ( ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_PROP_TYPE ) ) ) )
            // InternalEsper2Maude.g:232:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_PROP_TYPE ) ) )
            {
            // InternalEsper2Maude.g:232:2: ( ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_PROP_TYPE ) ) )
            // InternalEsper2Maude.g:233:3: ( (lv_name_0_0= RULE_ID ) ) ( (lv_type_1_0= RULE_PROP_TYPE ) )
            {
            // InternalEsper2Maude.g:233:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsper2Maude.g:234:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEsper2Maude.g:234:4: (lv_name_0_0= RULE_ID )
            // InternalEsper2Maude.g:235:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getEventPropertyAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalEsper2Maude.g:251:3: ( (lv_type_1_0= RULE_PROP_TYPE ) )
            // InternalEsper2Maude.g:252:4: (lv_type_1_0= RULE_PROP_TYPE )
            {
            // InternalEsper2Maude.g:252:4: (lv_type_1_0= RULE_PROP_TYPE )
            // InternalEsper2Maude.g:253:5: lv_type_1_0= RULE_PROP_TYPE
            {
            lv_type_1_0=(Token)match(input,RULE_PROP_TYPE,FOLLOW_2); 

            					newLeafNode(lv_type_1_0, grammarAccess.getEventPropertyAccess().getTypePROP_TYPETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getEventPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"type",
            						lv_type_1_0,
            						"org.xtext.example.mydsl.Esper2Maude.PROP_TYPE");
            				

            }


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
    // $ANTLR end "ruleEventProperty"


    // $ANTLR start "entryRulePattern"
    // InternalEsper2Maude.g:273:1: entryRulePattern returns [EObject current=null] : iv_rulePattern= rulePattern EOF ;
    public final EObject entryRulePattern() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePattern = null;


        try {
            // InternalEsper2Maude.g:273:48: (iv_rulePattern= rulePattern EOF )
            // InternalEsper2Maude.g:274:2: iv_rulePattern= rulePattern EOF
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
    // InternalEsper2Maude.g:280:1: rulePattern returns [EObject current=null] : (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '@Priority' otherlv_5= '(' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= 'insert' otherlv_9= 'into' ( (lv_event_10_0= ruleEvent ) ) otherlv_11= 'select' ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_13_0= ruleLastSelectEntry ) ) otherlv_14= 'from' otherlv_15= 'pattern' otherlv_16= '[' ( (lv_fromFilter_17_0= ruleFilterFrom ) ) otherlv_18= ']' (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )? ) ;
    public final EObject rulePattern() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_num_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_event_10_0 = null;

        EObject lv_selectEntries_12_0 = null;

        EObject lv_selectEntry_13_0 = null;

        EObject lv_fromFilter_17_0 = null;

        EObject lv_win_20_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:286:2: ( (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '@Priority' otherlv_5= '(' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= 'insert' otherlv_9= 'into' ( (lv_event_10_0= ruleEvent ) ) otherlv_11= 'select' ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_13_0= ruleLastSelectEntry ) ) otherlv_14= 'from' otherlv_15= 'pattern' otherlv_16= '[' ( (lv_fromFilter_17_0= ruleFilterFrom ) ) otherlv_18= ']' (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )? ) )
            // InternalEsper2Maude.g:287:2: (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '@Priority' otherlv_5= '(' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= 'insert' otherlv_9= 'into' ( (lv_event_10_0= ruleEvent ) ) otherlv_11= 'select' ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_13_0= ruleLastSelectEntry ) ) otherlv_14= 'from' otherlv_15= 'pattern' otherlv_16= '[' ( (lv_fromFilter_17_0= ruleFilterFrom ) ) otherlv_18= ']' (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )? )
            {
            // InternalEsper2Maude.g:287:2: (otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '@Priority' otherlv_5= '(' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= 'insert' otherlv_9= 'into' ( (lv_event_10_0= ruleEvent ) ) otherlv_11= 'select' ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_13_0= ruleLastSelectEntry ) ) otherlv_14= 'from' otherlv_15= 'pattern' otherlv_16= '[' ( (lv_fromFilter_17_0= ruleFilterFrom ) ) otherlv_18= ']' (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )? )
            // InternalEsper2Maude.g:288:3: otherlv_0= '@Name' otherlv_1= '(' ( (lv_name_2_0= RULE_STRING ) ) otherlv_3= ')' otherlv_4= '@Priority' otherlv_5= '(' ( (lv_num_6_0= RULE_INT ) ) otherlv_7= ')' otherlv_8= 'insert' otherlv_9= 'into' ( (lv_event_10_0= ruleEvent ) ) otherlv_11= 'select' ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )* ( (lv_selectEntry_13_0= ruleLastSelectEntry ) ) otherlv_14= 'from' otherlv_15= 'pattern' otherlv_16= '[' ( (lv_fromFilter_17_0= ruleFilterFrom ) ) otherlv_18= ']' (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getNameKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_1());
            		
            // InternalEsper2Maude.g:296:3: ( (lv_name_2_0= RULE_STRING ) )
            // InternalEsper2Maude.g:297:4: (lv_name_2_0= RULE_STRING )
            {
            // InternalEsper2Maude.g:297:4: (lv_name_2_0= RULE_STRING )
            // InternalEsper2Maude.g:298:5: lv_name_2_0= RULE_STRING
            {
            lv_name_2_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getRightParenthesisKeyword_3());
            		
            otherlv_4=(Token)match(input,19,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getPatternAccess().getPriorityKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_14); 

            			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getLeftParenthesisKeyword_5());
            		
            // InternalEsper2Maude.g:326:3: ( (lv_num_6_0= RULE_INT ) )
            // InternalEsper2Maude.g:327:4: (lv_num_6_0= RULE_INT )
            {
            // InternalEsper2Maude.g:327:4: (lv_num_6_0= RULE_INT )
            // InternalEsper2Maude.g:328:5: lv_num_6_0= RULE_INT
            {
            lv_num_6_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_num_6_0, grammarAccess.getPatternAccess().getNumINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatternRule());
            					}
            					setWithLastConsumed(
            						current,
            						"num",
            						lv_num_6_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,17,FOLLOW_15); 

            			newLeafNode(otherlv_7, grammarAccess.getPatternAccess().getRightParenthesisKeyword_7());
            		
            otherlv_8=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getInsertKeyword_8());
            		
            otherlv_9=(Token)match(input,21,FOLLOW_6); 

            			newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getIntoKeyword_9());
            		
            // InternalEsper2Maude.g:356:3: ( (lv_event_10_0= ruleEvent ) )
            // InternalEsper2Maude.g:357:4: (lv_event_10_0= ruleEvent )
            {
            // InternalEsper2Maude.g:357:4: (lv_event_10_0= ruleEvent )
            // InternalEsper2Maude.g:358:5: lv_event_10_0= ruleEvent
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getEventEventParserRuleCall_10_0());
            				
            pushFollow(FOLLOW_17);
            lv_event_10_0=ruleEvent();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"event",
            						lv_event_10_0,
            						"org.xtext.example.mydsl.Esper2Maude.Event");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_11, grammarAccess.getPatternAccess().getSelectKeyword_11());
            		
            // InternalEsper2Maude.g:379:3: ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )*
            loop5:
            do {
                int alt5=2;
                alt5 = dfa5.predict(input);
                switch (alt5) {
            	case 1 :
            	    // InternalEsper2Maude.g:380:4: (lv_selectEntries_12_0= ruleNonLastSelectEntry )
            	    {
            	    // InternalEsper2Maude.g:380:4: (lv_selectEntries_12_0= ruleNonLastSelectEntry )
            	    // InternalEsper2Maude.g:381:5: lv_selectEntries_12_0= ruleNonLastSelectEntry
            	    {

            	    					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_12_0());
            	    				
            	    pushFollow(FOLLOW_18);
            	    lv_selectEntries_12_0=ruleNonLastSelectEntry();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatternRule());
            	    					}
            	    					add(
            	    						current,
            	    						"selectEntries",
            	    						lv_selectEntries_12_0,
            	    						"org.xtext.example.mydsl.Esper2Maude.NonLastSelectEntry");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            // InternalEsper2Maude.g:398:3: ( (lv_selectEntry_13_0= ruleLastSelectEntry ) )
            // InternalEsper2Maude.g:399:4: (lv_selectEntry_13_0= ruleLastSelectEntry )
            {
            // InternalEsper2Maude.g:399:4: (lv_selectEntry_13_0= ruleLastSelectEntry )
            // InternalEsper2Maude.g:400:5: lv_selectEntry_13_0= ruleLastSelectEntry
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_19);
            lv_selectEntry_13_0=ruleLastSelectEntry();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"selectEntry",
            						lv_selectEntry_13_0,
            						"org.xtext.example.mydsl.Esper2Maude.LastSelectEntry");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_14=(Token)match(input,23,FOLLOW_20); 

            			newLeafNode(otherlv_14, grammarAccess.getPatternAccess().getFromKeyword_14());
            		
            otherlv_15=(Token)match(input,24,FOLLOW_21); 

            			newLeafNode(otherlv_15, grammarAccess.getPatternAccess().getPatternKeyword_15());
            		
            otherlv_16=(Token)match(input,25,FOLLOW_22); 

            			newLeafNode(otherlv_16, grammarAccess.getPatternAccess().getLeftSquareBracketKeyword_16());
            		
            // InternalEsper2Maude.g:429:3: ( (lv_fromFilter_17_0= ruleFilterFrom ) )
            // InternalEsper2Maude.g:430:4: (lv_fromFilter_17_0= ruleFilterFrom )
            {
            // InternalEsper2Maude.g:430:4: (lv_fromFilter_17_0= ruleFilterFrom )
            // InternalEsper2Maude.g:431:5: lv_fromFilter_17_0= ruleFilterFrom
            {

            					newCompositeNode(grammarAccess.getPatternAccess().getFromFilterFilterFromParserRuleCall_17_0());
            				
            pushFollow(FOLLOW_23);
            lv_fromFilter_17_0=ruleFilterFrom();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPatternRule());
            					}
            					set(
            						current,
            						"fromFilter",
            						lv_fromFilter_17_0,
            						"org.xtext.example.mydsl.Esper2Maude.FilterFrom");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_18=(Token)match(input,26,FOLLOW_24); 

            			newLeafNode(otherlv_18, grammarAccess.getPatternAccess().getRightSquareBracketKeyword_18());
            		
            // InternalEsper2Maude.g:452:3: (otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==27) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalEsper2Maude.g:453:4: otherlv_19= '.' ( (lv_win_20_0= ruleWindow ) )
                    {
                    otherlv_19=(Token)match(input,27,FOLLOW_25); 

                    				newLeafNode(otherlv_19, grammarAccess.getPatternAccess().getFullStopKeyword_19_0());
                    			
                    // InternalEsper2Maude.g:457:4: ( (lv_win_20_0= ruleWindow ) )
                    // InternalEsper2Maude.g:458:5: (lv_win_20_0= ruleWindow )
                    {
                    // InternalEsper2Maude.g:458:5: (lv_win_20_0= ruleWindow )
                    // InternalEsper2Maude.g:459:6: lv_win_20_0= ruleWindow
                    {

                    						newCompositeNode(grammarAccess.getPatternAccess().getWinWindowParserRuleCall_19_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_win_20_0=ruleWindow();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPatternRule());
                    						}
                    						set(
                    							current,
                    							"win",
                    							lv_win_20_0,
                    							"org.xtext.example.mydsl.Esper2Maude.Window");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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


    // $ANTLR start "entryRuleWindow"
    // InternalEsper2Maude.g:481:1: entryRuleWindow returns [EObject current=null] : iv_ruleWindow= ruleWindow EOF ;
    public final EObject entryRuleWindow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWindow = null;


        try {
            // InternalEsper2Maude.g:481:47: (iv_ruleWindow= ruleWindow EOF )
            // InternalEsper2Maude.g:482:2: iv_ruleWindow= ruleWindow EOF
            {
             newCompositeNode(grammarAccess.getWindowRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWindow=ruleWindow();

            state._fsp--;

             current =iv_ruleWindow; 
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
    // $ANTLR end "entryRuleWindow"


    // $ANTLR start "ruleWindow"
    // InternalEsper2Maude.g:488:1: ruleWindow returns [EObject current=null] : ( ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' ) | ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' ) ) ;
    public final EObject ruleWindow() throws RecognitionException {
        EObject current = null;

        Token lv_typeTime_0_0=null;
        Token otherlv_1=null;
        Token lv_num_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_typeBatch_5_0=null;
        Token otherlv_6=null;
        Token lv_num_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:494:2: ( ( ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' ) | ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' ) ) )
            // InternalEsper2Maude.g:495:2: ( ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' ) | ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' ) )
            {
            // InternalEsper2Maude.g:495:2: ( ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' ) | ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            else if ( (LA7_0==30) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalEsper2Maude.g:496:3: ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' )
                    {
                    // InternalEsper2Maude.g:496:3: ( ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')' )
                    // InternalEsper2Maude.g:497:4: ( (lv_typeTime_0_0= 'win:time' ) ) otherlv_1= '(' ( (lv_num_2_0= RULE_INT ) ) otherlv_3= 'milliseconds' otherlv_4= ')'
                    {
                    // InternalEsper2Maude.g:497:4: ( (lv_typeTime_0_0= 'win:time' ) )
                    // InternalEsper2Maude.g:498:5: (lv_typeTime_0_0= 'win:time' )
                    {
                    // InternalEsper2Maude.g:498:5: (lv_typeTime_0_0= 'win:time' )
                    // InternalEsper2Maude.g:499:6: lv_typeTime_0_0= 'win:time'
                    {
                    lv_typeTime_0_0=(Token)match(input,28,FOLLOW_7); 

                    						newLeafNode(lv_typeTime_0_0, grammarAccess.getWindowAccess().getTypeTimeWinTimeKeyword_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(current, "typeTime", lv_typeTime_0_0, "win:time");
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_1, grammarAccess.getWindowAccess().getLeftParenthesisKeyword_0_1());
                    			
                    // InternalEsper2Maude.g:515:4: ( (lv_num_2_0= RULE_INT ) )
                    // InternalEsper2Maude.g:516:5: (lv_num_2_0= RULE_INT )
                    {
                    // InternalEsper2Maude.g:516:5: (lv_num_2_0= RULE_INT )
                    // InternalEsper2Maude.g:517:6: lv_num_2_0= RULE_INT
                    {
                    lv_num_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_num_2_0, grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num",
                    							lv_num_2_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_3, grammarAccess.getWindowAccess().getMillisecondsKeyword_0_3());
                    			
                    otherlv_4=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getWindowAccess().getRightParenthesisKeyword_0_4());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:543:3: ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' )
                    {
                    // InternalEsper2Maude.g:543:3: ( ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')' )
                    // InternalEsper2Maude.g:544:4: ( (lv_typeBatch_5_0= 'win:time_batch' ) ) otherlv_6= '(' ( (lv_num_7_0= RULE_INT ) ) otherlv_8= 'milliseconds' otherlv_9= ')'
                    {
                    // InternalEsper2Maude.g:544:4: ( (lv_typeBatch_5_0= 'win:time_batch' ) )
                    // InternalEsper2Maude.g:545:5: (lv_typeBatch_5_0= 'win:time_batch' )
                    {
                    // InternalEsper2Maude.g:545:5: (lv_typeBatch_5_0= 'win:time_batch' )
                    // InternalEsper2Maude.g:546:6: lv_typeBatch_5_0= 'win:time_batch'
                    {
                    lv_typeBatch_5_0=(Token)match(input,30,FOLLOW_7); 

                    						newLeafNode(lv_typeBatch_5_0, grammarAccess.getWindowAccess().getTypeBatchWinTime_batchKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(current, "typeBatch", lv_typeBatch_5_0, "win:time_batch");
                    					

                    }


                    }

                    otherlv_6=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_6, grammarAccess.getWindowAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:562:4: ( (lv_num_7_0= RULE_INT ) )
                    // InternalEsper2Maude.g:563:5: (lv_num_7_0= RULE_INT )
                    {
                    // InternalEsper2Maude.g:563:5: (lv_num_7_0= RULE_INT )
                    // InternalEsper2Maude.g:564:6: lv_num_7_0= RULE_INT
                    {
                    lv_num_7_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_num_7_0, grammarAccess.getWindowAccess().getNumINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWindowRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num",
                    							lv_num_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_8, grammarAccess.getWindowAccess().getMillisecondsKeyword_1_3());
                    			
                    otherlv_9=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_9, grammarAccess.getWindowAccess().getRightParenthesisKeyword_1_4());
                    			

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
    // $ANTLR end "ruleWindow"


    // $ANTLR start "entryRuleWhereFilter"
    // InternalEsper2Maude.g:593:1: entryRuleWhereFilter returns [EObject current=null] : iv_ruleWhereFilter= ruleWhereFilter EOF ;
    public final EObject entryRuleWhereFilter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleWhereFilter = null;


        try {
            // InternalEsper2Maude.g:593:52: (iv_ruleWhereFilter= ruleWhereFilter EOF )
            // InternalEsper2Maude.g:594:2: iv_ruleWhereFilter= ruleWhereFilter EOF
            {
             newCompositeNode(grammarAccess.getWhereFilterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleWhereFilter=ruleWhereFilter();

            state._fsp--;

             current =iv_ruleWhereFilter; 
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
    // $ANTLR end "entryRuleWhereFilter"


    // $ANTLR start "ruleWhereFilter"
    // InternalEsper2Maude.g:600:1: ruleWhereFilter returns [EObject current=null] : ( ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )? ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )? ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )? ) ;
    public final EObject ruleWhereFilter() throws RecognitionException {
        EObject current = null;

        Token lv_timer_2_0=null;
        Token otherlv_3=null;
        Token lv_num_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_filterEventL_0_0 = null;

        EObject lv_filterOpL_1_0 = null;

        EObject lv_filterOpR_7_0 = null;

        EObject lv_filterEventR_8_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:606:2: ( ( ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )? ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )? ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )? ) )
            // InternalEsper2Maude.g:607:2: ( ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )? ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )? ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )? )
            {
            // InternalEsper2Maude.g:607:2: ( ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )? ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )? ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )? )
            // InternalEsper2Maude.g:608:3: ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )? ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )? ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )?
            {
            // InternalEsper2Maude.g:608:3: ( ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_ID||(LA8_0>=RULE_STRING && LA8_0<=RULE_INT)||(LA8_0>=36 && LA8_0<=38)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEsper2Maude.g:609:4: ( (lv_filterEventL_0_0= ruleFilterEvent ) ) ( (lv_filterOpL_1_0= ruleFilterOperator ) )
                    {
                    // InternalEsper2Maude.g:609:4: ( (lv_filterEventL_0_0= ruleFilterEvent ) )
                    // InternalEsper2Maude.g:610:5: (lv_filterEventL_0_0= ruleFilterEvent )
                    {
                    // InternalEsper2Maude.g:610:5: (lv_filterEventL_0_0= ruleFilterEvent )
                    // InternalEsper2Maude.g:611:6: lv_filterEventL_0_0= ruleFilterEvent
                    {

                    						newCompositeNode(grammarAccess.getWhereFilterAccess().getFilterEventLFilterEventParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_filterEventL_0_0=ruleFilterEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereFilterRule());
                    						}
                    						set(
                    							current,
                    							"filterEventL",
                    							lv_filterEventL_0_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsper2Maude.g:628:4: ( (lv_filterOpL_1_0= ruleFilterOperator ) )
                    // InternalEsper2Maude.g:629:5: (lv_filterOpL_1_0= ruleFilterOperator )
                    {
                    // InternalEsper2Maude.g:629:5: (lv_filterOpL_1_0= ruleFilterOperator )
                    // InternalEsper2Maude.g:630:6: lv_filterOpL_1_0= ruleFilterOperator
                    {

                    						newCompositeNode(grammarAccess.getWhereFilterAccess().getFilterOpLFilterOperatorParserRuleCall_0_1_0());
                    					
                    pushFollow(FOLLOW_28);
                    lv_filterOpL_1_0=ruleFilterOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereFilterRule());
                    						}
                    						set(
                    							current,
                    							"filterOpL",
                    							lv_filterOpL_1_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalEsper2Maude.g:648:3: ( ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==31) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalEsper2Maude.g:649:4: ( (lv_timer_2_0= 'timer:within' ) ) otherlv_3= '(' ( (lv_num_4_0= RULE_INT ) ) otherlv_5= 'milliseconds' otherlv_6= ')'
                    {
                    // InternalEsper2Maude.g:649:4: ( (lv_timer_2_0= 'timer:within' ) )
                    // InternalEsper2Maude.g:650:5: (lv_timer_2_0= 'timer:within' )
                    {
                    // InternalEsper2Maude.g:650:5: (lv_timer_2_0= 'timer:within' )
                    // InternalEsper2Maude.g:651:6: lv_timer_2_0= 'timer:within'
                    {
                    lv_timer_2_0=(Token)match(input,31,FOLLOW_7); 

                    						newLeafNode(lv_timer_2_0, grammarAccess.getWhereFilterAccess().getTimerTimerWithinKeyword_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereFilterRule());
                    						}
                    						setWithLastConsumed(current, "timer", lv_timer_2_0, "timer:within");
                    					

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_3, grammarAccess.getWhereFilterAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:667:4: ( (lv_num_4_0= RULE_INT ) )
                    // InternalEsper2Maude.g:668:5: (lv_num_4_0= RULE_INT )
                    {
                    // InternalEsper2Maude.g:668:5: (lv_num_4_0= RULE_INT )
                    // InternalEsper2Maude.g:669:6: lv_num_4_0= RULE_INT
                    {
                    lv_num_4_0=(Token)match(input,RULE_INT,FOLLOW_26); 

                    						newLeafNode(lv_num_4_0, grammarAccess.getWhereFilterAccess().getNumINTTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getWhereFilterRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num",
                    							lv_num_4_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,29,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getWhereFilterAccess().getMillisecondsKeyword_1_3());
                    			
                    otherlv_6=(Token)match(input,17,FOLLOW_29); 

                    				newLeafNode(otherlv_6, grammarAccess.getWhereFilterAccess().getRightParenthesisKeyword_1_4());
                    			

                    }
                    break;

            }

            // InternalEsper2Maude.g:694:3: ( ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) ) )?
            int alt10=2;
            switch ( input.LA(1) ) {
                case 33:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                    {
                    alt10=1;
                    }
                    break;
                case 44:
                    {
                    int LA10_2 = input.LA(2);

                    if ( (LA10_2==RULE_ID) ) {
                        int LA10_5 = input.LA(3);

                        if ( (LA10_5==33) ) {
                            int LA10_6 = input.LA(4);

                            if ( (LA10_6==RULE_ID) ) {
                                int LA10_7 = input.LA(5);

                                if ( (LA10_7==EOF||LA10_7==17||(LA10_7>=26 && LA10_7<=27)||(LA10_7>=44 && LA10_7<=45)) ) {
                                    alt10=1;
                                }
                            }
                            else if ( ((LA10_6>=RULE_STRING && LA10_6<=RULE_INT)||(LA10_6>=36 && LA10_6<=38)) ) {
                                alt10=1;
                            }
                        }
                        else if ( (LA10_5==27||(LA10_5>=39 && LA10_5<=45)) ) {
                            alt10=1;
                        }
                    }
                    else if ( ((LA10_2>=RULE_STRING && LA10_2<=RULE_INT)||(LA10_2>=36 && LA10_2<=38)) ) {
                        alt10=1;
                    }
                    }
                    break;
                case 45:
                    {
                    int LA10_3 = input.LA(2);

                    if ( (LA10_3==RULE_ID) ) {
                        int LA10_5 = input.LA(3);

                        if ( (LA10_5==33) ) {
                            int LA10_6 = input.LA(4);

                            if ( (LA10_6==RULE_ID) ) {
                                int LA10_7 = input.LA(5);

                                if ( (LA10_7==EOF||LA10_7==17||(LA10_7>=26 && LA10_7<=27)||(LA10_7>=44 && LA10_7<=45)) ) {
                                    alt10=1;
                                }
                            }
                            else if ( ((LA10_6>=RULE_STRING && LA10_6<=RULE_INT)||(LA10_6>=36 && LA10_6<=38)) ) {
                                alt10=1;
                            }
                        }
                        else if ( (LA10_5==27||(LA10_5>=39 && LA10_5<=45)) ) {
                            alt10=1;
                        }
                    }
                    else if ( ((LA10_3>=RULE_STRING && LA10_3<=RULE_INT)||(LA10_3>=36 && LA10_3<=38)) ) {
                        alt10=1;
                    }
                    }
                    break;
            }

            switch (alt10) {
                case 1 :
                    // InternalEsper2Maude.g:695:4: ( (lv_filterOpR_7_0= ruleFilterOperator ) ) ( (lv_filterEventR_8_0= ruleFilterEvent ) )
                    {
                    // InternalEsper2Maude.g:695:4: ( (lv_filterOpR_7_0= ruleFilterOperator ) )
                    // InternalEsper2Maude.g:696:5: (lv_filterOpR_7_0= ruleFilterOperator )
                    {
                    // InternalEsper2Maude.g:696:5: (lv_filterOpR_7_0= ruleFilterOperator )
                    // InternalEsper2Maude.g:697:6: lv_filterOpR_7_0= ruleFilterOperator
                    {

                    						newCompositeNode(grammarAccess.getWhereFilterAccess().getFilterOpRFilterOperatorParserRuleCall_2_0_0());
                    					
                    pushFollow(FOLLOW_30);
                    lv_filterOpR_7_0=ruleFilterOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereFilterRule());
                    						}
                    						set(
                    							current,
                    							"filterOpR",
                    							lv_filterOpR_7_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsper2Maude.g:714:4: ( (lv_filterEventR_8_0= ruleFilterEvent ) )
                    // InternalEsper2Maude.g:715:5: (lv_filterEventR_8_0= ruleFilterEvent )
                    {
                    // InternalEsper2Maude.g:715:5: (lv_filterEventR_8_0= ruleFilterEvent )
                    // InternalEsper2Maude.g:716:6: lv_filterEventR_8_0= ruleFilterEvent
                    {

                    						newCompositeNode(grammarAccess.getWhereFilterAccess().getFilterEventRFilterEventParserRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_filterEventR_8_0=ruleFilterEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getWhereFilterRule());
                    						}
                    						set(
                    							current,
                    							"filterEventR",
                    							lv_filterEventR_8_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleWhereFilter"


    // $ANTLR start "entryRuleFilterFrom"
    // InternalEsper2Maude.g:738:1: entryRuleFilterFrom returns [EObject current=null] : iv_ruleFilterFrom= ruleFilterFrom EOF ;
    public final EObject entryRuleFilterFrom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterFrom = null;


        try {
            // InternalEsper2Maude.g:738:51: (iv_ruleFilterFrom= ruleFilterFrom EOF )
            // InternalEsper2Maude.g:739:2: iv_ruleFilterFrom= ruleFilterFrom EOF
            {
             newCompositeNode(grammarAccess.getFilterFromRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterFrom=ruleFilterFrom();

            state._fsp--;

             current =iv_ruleFilterFrom; 
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
    // $ANTLR end "entryRuleFilterFrom"


    // $ANTLR start "ruleFilterFrom"
    // InternalEsper2Maude.g:745:1: ruleFilterFrom returns [EObject current=null] : ( ( (lv_followedBy_0_0= ruleFollowedBy ) ) | (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' ) | (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? ) ) ;
    public final EObject ruleFilterFrom() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_eventVariable_7_0=null;
        Token otherlv_8=null;
        Token lv_eventName_9_0=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_followedBy_0_0 = null;

        EObject lv_left_2_0 = null;

        EObject lv_op_3_0 = null;

        EObject lv_right_4_0 = null;

        EObject lv_filter_11_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:751:2: ( ( ( (lv_followedBy_0_0= ruleFollowedBy ) ) | (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' ) | (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? ) ) )
            // InternalEsper2Maude.g:752:2: ( ( (lv_followedBy_0_0= ruleFollowedBy ) ) | (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' ) | (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? ) )
            {
            // InternalEsper2Maude.g:752:2: ( ( (lv_followedBy_0_0= ruleFollowedBy ) ) | (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' ) | (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? ) )
            int alt13=3;
            alt13 = dfa13.predict(input);
            switch (alt13) {
                case 1 :
                    // InternalEsper2Maude.g:753:3: ( (lv_followedBy_0_0= ruleFollowedBy ) )
                    {
                    // InternalEsper2Maude.g:753:3: ( (lv_followedBy_0_0= ruleFollowedBy ) )
                    // InternalEsper2Maude.g:754:4: (lv_followedBy_0_0= ruleFollowedBy )
                    {
                    // InternalEsper2Maude.g:754:4: (lv_followedBy_0_0= ruleFollowedBy )
                    // InternalEsper2Maude.g:755:5: lv_followedBy_0_0= ruleFollowedBy
                    {

                    					newCompositeNode(grammarAccess.getFilterFromAccess().getFollowedByFollowedByParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_followedBy_0_0=ruleFollowedBy();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterFromRule());
                    					}
                    					set(
                    						current,
                    						"followedBy",
                    						lv_followedBy_0_0,
                    						"org.xtext.example.mydsl.Esper2Maude.FollowedBy");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:773:3: (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' )
                    {
                    // InternalEsper2Maude.g:773:3: (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' )
                    // InternalEsper2Maude.g:774:4: otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')'
                    {
                    otherlv_1=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_1, grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalEsper2Maude.g:778:4: ( (lv_left_2_0= ruleFilterFrom ) )
                    // InternalEsper2Maude.g:779:5: (lv_left_2_0= ruleFilterFrom )
                    {
                    // InternalEsper2Maude.g:779:5: (lv_left_2_0= ruleFilterFrom )
                    // InternalEsper2Maude.g:780:6: lv_left_2_0= ruleFilterFrom
                    {

                    						newCompositeNode(grammarAccess.getFilterFromAccess().getLeftFilterFromParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_27);
                    lv_left_2_0=ruleFilterFrom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterFromRule());
                    						}
                    						set(
                    							current,
                    							"left",
                    							lv_left_2_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterFrom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsper2Maude.g:797:4: ( (lv_op_3_0= ruleLogicalOperator ) )
                    // InternalEsper2Maude.g:798:5: (lv_op_3_0= ruleLogicalOperator )
                    {
                    // InternalEsper2Maude.g:798:5: (lv_op_3_0= ruleLogicalOperator )
                    // InternalEsper2Maude.g:799:6: lv_op_3_0= ruleLogicalOperator
                    {

                    						newCompositeNode(grammarAccess.getFilterFromAccess().getOpLogicalOperatorParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_22);
                    lv_op_3_0=ruleLogicalOperator();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterFromRule());
                    						}
                    						set(
                    							current,
                    							"op",
                    							lv_op_3_0,
                    							"org.xtext.example.mydsl.Esper2Maude.LogicalOperator");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalEsper2Maude.g:816:4: ( (lv_right_4_0= ruleFilterFrom ) )
                    // InternalEsper2Maude.g:817:5: (lv_right_4_0= ruleFilterFrom )
                    {
                    // InternalEsper2Maude.g:817:5: (lv_right_4_0= ruleFilterFrom )
                    // InternalEsper2Maude.g:818:6: lv_right_4_0= ruleFilterFrom
                    {

                    						newCompositeNode(grammarAccess.getFilterFromAccess().getRightFilterFromParserRuleCall_1_3_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_right_4_0=ruleFilterFrom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFilterFromRule());
                    						}
                    						set(
                    							current,
                    							"right",
                    							lv_right_4_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterFrom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_5=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_5, grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_1_4());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:841:3: (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? )
                    {
                    // InternalEsper2Maude.g:841:3: (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? )
                    // InternalEsper2Maude.g:842:4: otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )?
                    {
                    otherlv_6=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_6, grammarAccess.getFilterFromAccess().getEveryKeyword_2_0());
                    			
                    // InternalEsper2Maude.g:846:4: ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) ) {
                        int LA11_1 = input.LA(2);

                        if ( (LA11_1==33) ) {
                            alt11=1;
                        }
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalEsper2Maude.g:847:5: ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '='
                            {
                            // InternalEsper2Maude.g:847:5: ( (lv_eventVariable_7_0= RULE_ID ) )
                            // InternalEsper2Maude.g:848:6: (lv_eventVariable_7_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:848:6: (lv_eventVariable_7_0= RULE_ID )
                            // InternalEsper2Maude.g:849:7: lv_eventVariable_7_0= RULE_ID
                            {
                            lv_eventVariable_7_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                            							newLeafNode(lv_eventVariable_7_0, grammarAccess.getFilterFromAccess().getEventVariableIDTerminalRuleCall_2_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFilterFromRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"eventVariable",
                            								lv_eventVariable_7_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_8=(Token)match(input,33,FOLLOW_6); 

                            					newLeafNode(otherlv_8, grammarAccess.getFilterFromAccess().getEqualsSignKeyword_2_1_1());
                            				

                            }
                            break;

                    }

                    // InternalEsper2Maude.g:870:4: ( (lv_eventName_9_0= RULE_ID ) )
                    // InternalEsper2Maude.g:871:5: (lv_eventName_9_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:871:5: (lv_eventName_9_0= RULE_ID )
                    // InternalEsper2Maude.g:872:6: lv_eventName_9_0= RULE_ID
                    {
                    lv_eventName_9_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_eventName_9_0, grammarAccess.getFilterFromAccess().getEventNameIDTerminalRuleCall_2_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterFromRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventName",
                    							lv_eventName_9_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEsper2Maude.g:888:4: (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==15) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalEsper2Maude.g:889:5: otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')'
                            {
                            otherlv_10=(Token)match(input,15,FOLLOW_30); 

                            					newLeafNode(otherlv_10, grammarAccess.getFilterFromAccess().getLeftParenthesisKeyword_2_3_0());
                            				
                            // InternalEsper2Maude.g:893:5: ( (lv_filter_11_0= ruleFilterEvent ) )
                            // InternalEsper2Maude.g:894:6: (lv_filter_11_0= ruleFilterEvent )
                            {
                            // InternalEsper2Maude.g:894:6: (lv_filter_11_0= ruleFilterEvent )
                            // InternalEsper2Maude.g:895:7: lv_filter_11_0= ruleFilterEvent
                            {

                            							newCompositeNode(grammarAccess.getFilterFromAccess().getFilterFilterEventParserRuleCall_2_3_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_filter_11_0=ruleFilterEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getFilterFromRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_11_0,
                            								"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_12=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_12, grammarAccess.getFilterFromAccess().getRightParenthesisKeyword_2_3_2());
                            				

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
    // $ANTLR end "ruleFilterFrom"


    // $ANTLR start "entryRuleFollowedBy"
    // InternalEsper2Maude.g:922:1: entryRuleFollowedBy returns [EObject current=null] : iv_ruleFollowedBy= ruleFollowedBy EOF ;
    public final EObject entryRuleFollowedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFollowedBy = null;


        try {
            // InternalEsper2Maude.g:922:51: (iv_ruleFollowedBy= ruleFollowedBy EOF )
            // InternalEsper2Maude.g:923:2: iv_ruleFollowedBy= ruleFollowedBy EOF
            {
             newCompositeNode(grammarAccess.getFollowedByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFollowedBy=ruleFollowedBy();

            state._fsp--;

             current =iv_ruleFollowedBy; 
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
    // $ANTLR end "entryRuleFollowedBy"


    // $ANTLR start "ruleFollowedBy"
    // InternalEsper2Maude.g:929:1: ruleFollowedBy returns [EObject current=null] : ( ( (lv_left_0_0= ruleSubFilterFollowedBy ) ) otherlv_1= '->' ( (lv_right_2_0= ruleSubFilterFollowedBy ) ) (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )? ) ;
    public final EObject ruleFollowedBy() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;

        EObject lv_whereFilter_4_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:935:2: ( ( ( (lv_left_0_0= ruleSubFilterFollowedBy ) ) otherlv_1= '->' ( (lv_right_2_0= ruleSubFilterFollowedBy ) ) (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )? ) )
            // InternalEsper2Maude.g:936:2: ( ( (lv_left_0_0= ruleSubFilterFollowedBy ) ) otherlv_1= '->' ( (lv_right_2_0= ruleSubFilterFollowedBy ) ) (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )? )
            {
            // InternalEsper2Maude.g:936:2: ( ( (lv_left_0_0= ruleSubFilterFollowedBy ) ) otherlv_1= '->' ( (lv_right_2_0= ruleSubFilterFollowedBy ) ) (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )? )
            // InternalEsper2Maude.g:937:3: ( (lv_left_0_0= ruleSubFilterFollowedBy ) ) otherlv_1= '->' ( (lv_right_2_0= ruleSubFilterFollowedBy ) ) (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )?
            {
            // InternalEsper2Maude.g:937:3: ( (lv_left_0_0= ruleSubFilterFollowedBy ) )
            // InternalEsper2Maude.g:938:4: (lv_left_0_0= ruleSubFilterFollowedBy )
            {
            // InternalEsper2Maude.g:938:4: (lv_left_0_0= ruleSubFilterFollowedBy )
            // InternalEsper2Maude.g:939:5: lv_left_0_0= ruleSubFilterFollowedBy
            {

            					newCompositeNode(grammarAccess.getFollowedByAccess().getLeftSubFilterFollowedByParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_33);
            lv_left_0_0=ruleSubFilterFollowedBy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowedByRule());
            					}
            					set(
            						current,
            						"left",
            						lv_left_0_0,
            						"org.xtext.example.mydsl.Esper2Maude.SubFilterFollowedBy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,34,FOLLOW_22); 

            			newLeafNode(otherlv_1, grammarAccess.getFollowedByAccess().getHyphenMinusGreaterThanSignKeyword_1());
            		
            // InternalEsper2Maude.g:960:3: ( (lv_right_2_0= ruleSubFilterFollowedBy ) )
            // InternalEsper2Maude.g:961:4: (lv_right_2_0= ruleSubFilterFollowedBy )
            {
            // InternalEsper2Maude.g:961:4: (lv_right_2_0= ruleSubFilterFollowedBy )
            // InternalEsper2Maude.g:962:5: lv_right_2_0= ruleSubFilterFollowedBy
            {

            					newCompositeNode(grammarAccess.getFollowedByAccess().getRightSubFilterFollowedByParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_34);
            lv_right_2_0=ruleSubFilterFollowedBy();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFollowedByRule());
            					}
            					set(
            						current,
            						"right",
            						lv_right_2_0,
            						"org.xtext.example.mydsl.Esper2Maude.SubFilterFollowedBy");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsper2Maude.g:979:3: (otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==35) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalEsper2Maude.g:980:4: otherlv_3= 'where' ( (lv_whereFilter_4_0= ruleWhereFilter ) )
                    {
                    otherlv_3=(Token)match(input,35,FOLLOW_35); 

                    				newLeafNode(otherlv_3, grammarAccess.getFollowedByAccess().getWhereKeyword_3_0());
                    			
                    // InternalEsper2Maude.g:984:4: ( (lv_whereFilter_4_0= ruleWhereFilter ) )
                    // InternalEsper2Maude.g:985:5: (lv_whereFilter_4_0= ruleWhereFilter )
                    {
                    // InternalEsper2Maude.g:985:5: (lv_whereFilter_4_0= ruleWhereFilter )
                    // InternalEsper2Maude.g:986:6: lv_whereFilter_4_0= ruleWhereFilter
                    {

                    						newCompositeNode(grammarAccess.getFollowedByAccess().getWhereFilterWhereFilterParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_whereFilter_4_0=ruleWhereFilter();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getFollowedByRule());
                    						}
                    						set(
                    							current,
                    							"whereFilter",
                    							lv_whereFilter_4_0,
                    							"org.xtext.example.mydsl.Esper2Maude.WhereFilter");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


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
    // $ANTLR end "ruleFollowedBy"


    // $ANTLR start "entryRuleSubFilterFollowedBy"
    // InternalEsper2Maude.g:1008:1: entryRuleSubFilterFollowedBy returns [EObject current=null] : iv_ruleSubFilterFollowedBy= ruleSubFilterFollowedBy EOF ;
    public final EObject entryRuleSubFilterFollowedBy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubFilterFollowedBy = null;


        try {
            // InternalEsper2Maude.g:1008:60: (iv_ruleSubFilterFollowedBy= ruleSubFilterFollowedBy EOF )
            // InternalEsper2Maude.g:1009:2: iv_ruleSubFilterFollowedBy= ruleSubFilterFollowedBy EOF
            {
             newCompositeNode(grammarAccess.getSubFilterFollowedByRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubFilterFollowedBy=ruleSubFilterFollowedBy();

            state._fsp--;

             current =iv_ruleSubFilterFollowedBy; 
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
    // $ANTLR end "entryRuleSubFilterFollowedBy"


    // $ANTLR start "ruleSubFilterFollowedBy"
    // InternalEsper2Maude.g:1015:1: ruleSubFilterFollowedBy returns [EObject current=null] : ( ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? ) | (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' ) | ( (lv_every_9_0= ruleEvery ) ) ) ;
    public final EObject ruleSubFilterFollowedBy() throws RecognitionException {
        EObject current = null;

        Token lv_eventVariable_0_0=null;
        Token otherlv_1=null;
        Token lv_eventName_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_filter_4_0 = null;

        EObject lv_filter_7_0 = null;

        EObject lv_every_9_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1021:2: ( ( ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? ) | (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' ) | ( (lv_every_9_0= ruleEvery ) ) ) )
            // InternalEsper2Maude.g:1022:2: ( ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? ) | (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' ) | ( (lv_every_9_0= ruleEvery ) ) )
            {
            // InternalEsper2Maude.g:1022:2: ( ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? ) | (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' ) | ( (lv_every_9_0= ruleEvery ) ) )
            int alt17=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt17=1;
                }
                break;
            case 15:
                {
                alt17=2;
                }
                break;
            case 32:
                {
                alt17=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalEsper2Maude.g:1023:3: ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? )
                    {
                    // InternalEsper2Maude.g:1023:3: ( ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )? )
                    // InternalEsper2Maude.g:1024:4: ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )? ( (lv_eventName_2_0= RULE_ID ) ) (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )?
                    {
                    // InternalEsper2Maude.g:1024:4: ( ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '=' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==RULE_ID) ) {
                        int LA15_1 = input.LA(2);

                        if ( (LA15_1==33) ) {
                            alt15=1;
                        }
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalEsper2Maude.g:1025:5: ( (lv_eventVariable_0_0= RULE_ID ) ) otherlv_1= '='
                            {
                            // InternalEsper2Maude.g:1025:5: ( (lv_eventVariable_0_0= RULE_ID ) )
                            // InternalEsper2Maude.g:1026:6: (lv_eventVariable_0_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:1026:6: (lv_eventVariable_0_0= RULE_ID )
                            // InternalEsper2Maude.g:1027:7: lv_eventVariable_0_0= RULE_ID
                            {
                            lv_eventVariable_0_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                            							newLeafNode(lv_eventVariable_0_0, grammarAccess.getSubFilterFollowedByAccess().getEventVariableIDTerminalRuleCall_0_0_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getSubFilterFollowedByRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"eventVariable",
                            								lv_eventVariable_0_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_1=(Token)match(input,33,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getSubFilterFollowedByAccess().getEqualsSignKeyword_0_0_1());
                            				

                            }
                            break;

                    }

                    // InternalEsper2Maude.g:1048:4: ( (lv_eventName_2_0= RULE_ID ) )
                    // InternalEsper2Maude.g:1049:5: (lv_eventName_2_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:1049:5: (lv_eventName_2_0= RULE_ID )
                    // InternalEsper2Maude.g:1050:6: lv_eventName_2_0= RULE_ID
                    {
                    lv_eventName_2_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_eventName_2_0, grammarAccess.getSubFilterFollowedByAccess().getEventNameIDTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSubFilterFollowedByRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventName",
                    							lv_eventName_2_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEsper2Maude.g:1066:4: (otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0==15) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalEsper2Maude.g:1067:5: otherlv_3= '(' ( (lv_filter_4_0= ruleFilterEvent ) ) otherlv_5= ')'
                            {
                            otherlv_3=(Token)match(input,15,FOLLOW_30); 

                            					newLeafNode(otherlv_3, grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_0_2_0());
                            				
                            // InternalEsper2Maude.g:1071:5: ( (lv_filter_4_0= ruleFilterEvent ) )
                            // InternalEsper2Maude.g:1072:6: (lv_filter_4_0= ruleFilterEvent )
                            {
                            // InternalEsper2Maude.g:1072:6: (lv_filter_4_0= ruleFilterEvent )
                            // InternalEsper2Maude.g:1073:7: lv_filter_4_0= ruleFilterEvent
                            {

                            							newCompositeNode(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_0_2_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_filter_4_0=ruleFilterEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getSubFilterFollowedByRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_4_0,
                            								"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_5=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_5, grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_0_2_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1097:3: (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' )
                    {
                    // InternalEsper2Maude.g:1097:3: (otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')' )
                    // InternalEsper2Maude.g:1098:4: otherlv_6= '(' ( (lv_filter_7_0= ruleFilterEvent ) ) otherlv_8= ')'
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_30); 

                    				newLeafNode(otherlv_6, grammarAccess.getSubFilterFollowedByAccess().getLeftParenthesisKeyword_1_0());
                    			
                    // InternalEsper2Maude.g:1102:4: ( (lv_filter_7_0= ruleFilterEvent ) )
                    // InternalEsper2Maude.g:1103:5: (lv_filter_7_0= ruleFilterEvent )
                    {
                    // InternalEsper2Maude.g:1103:5: (lv_filter_7_0= ruleFilterEvent )
                    // InternalEsper2Maude.g:1104:6: lv_filter_7_0= ruleFilterEvent
                    {

                    						newCompositeNode(grammarAccess.getSubFilterFollowedByAccess().getFilterFilterEventParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_filter_7_0=ruleFilterEvent();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getSubFilterFollowedByRule());
                    						}
                    						set(
                    							current,
                    							"filter",
                    							lv_filter_7_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_8, grammarAccess.getSubFilterFollowedByAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:1127:3: ( (lv_every_9_0= ruleEvery ) )
                    {
                    // InternalEsper2Maude.g:1127:3: ( (lv_every_9_0= ruleEvery ) )
                    // InternalEsper2Maude.g:1128:4: (lv_every_9_0= ruleEvery )
                    {
                    // InternalEsper2Maude.g:1128:4: (lv_every_9_0= ruleEvery )
                    // InternalEsper2Maude.g:1129:5: lv_every_9_0= ruleEvery
                    {

                    					newCompositeNode(grammarAccess.getSubFilterFollowedByAccess().getEveryEveryParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_every_9_0=ruleEvery();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getSubFilterFollowedByRule());
                    					}
                    					set(
                    						current,
                    						"every",
                    						lv_every_9_0,
                    						"org.xtext.example.mydsl.Esper2Maude.Every");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleSubFilterFollowedBy"


    // $ANTLR start "entryRuleEvery"
    // InternalEsper2Maude.g:1150:1: entryRuleEvery returns [EObject current=null] : iv_ruleEvery= ruleEvery EOF ;
    public final EObject entryRuleEvery() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvery = null;


        try {
            // InternalEsper2Maude.g:1150:46: (iv_ruleEvery= ruleEvery EOF )
            // InternalEsper2Maude.g:1151:2: iv_ruleEvery= ruleEvery EOF
            {
             newCompositeNode(grammarAccess.getEveryRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvery=ruleEvery();

            state._fsp--;

             current =iv_ruleEvery; 
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
    // $ANTLR end "entryRuleEvery"


    // $ANTLR start "ruleEvery"
    // InternalEsper2Maude.g:1157:1: ruleEvery returns [EObject current=null] : ( (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? ) | (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' ) ) ;
    public final EObject ruleEvery() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_eventVariable_1_0=null;
        Token otherlv_2=null;
        Token lv_eventName_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject lv_filter_5_0 = null;

        EObject lv_filterFrom_9_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1163:2: ( ( (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? ) | (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' ) ) )
            // InternalEsper2Maude.g:1164:2: ( (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? ) | (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' ) )
            {
            // InternalEsper2Maude.g:1164:2: ( (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? ) | (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==32) ) {
                int LA20_1 = input.LA(2);

                if ( (LA20_1==RULE_ID) ) {
                    alt20=1;
                }
                else if ( (LA20_1==15) ) {
                    alt20=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalEsper2Maude.g:1165:3: (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? )
                    {
                    // InternalEsper2Maude.g:1165:3: (otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )? )
                    // InternalEsper2Maude.g:1166:4: otherlv_0= 'every' ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )? ( (lv_eventName_3_0= RULE_ID ) ) (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )?
                    {
                    otherlv_0=(Token)match(input,32,FOLLOW_6); 

                    				newLeafNode(otherlv_0, grammarAccess.getEveryAccess().getEveryKeyword_0_0());
                    			
                    // InternalEsper2Maude.g:1170:4: ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '=' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) ) {
                        int LA18_1 = input.LA(2);

                        if ( (LA18_1==33) ) {
                            alt18=1;
                        }
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalEsper2Maude.g:1171:5: ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '='
                            {
                            // InternalEsper2Maude.g:1171:5: ( (lv_eventVariable_1_0= RULE_ID ) )
                            // InternalEsper2Maude.g:1172:6: (lv_eventVariable_1_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:1172:6: (lv_eventVariable_1_0= RULE_ID )
                            // InternalEsper2Maude.g:1173:7: lv_eventVariable_1_0= RULE_ID
                            {
                            lv_eventVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

                            							newLeafNode(lv_eventVariable_1_0, grammarAccess.getEveryAccess().getEventVariableIDTerminalRuleCall_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getEveryRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"eventVariable",
                            								lv_eventVariable_1_0,
                            								"org.eclipse.xtext.common.Terminals.ID");
                            						

                            }


                            }

                            otherlv_2=(Token)match(input,33,FOLLOW_6); 

                            					newLeafNode(otherlv_2, grammarAccess.getEveryAccess().getEqualsSignKeyword_0_1_1());
                            				

                            }
                            break;

                    }

                    // InternalEsper2Maude.g:1194:4: ( (lv_eventName_3_0= RULE_ID ) )
                    // InternalEsper2Maude.g:1195:5: (lv_eventName_3_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:1195:5: (lv_eventName_3_0= RULE_ID )
                    // InternalEsper2Maude.g:1196:6: lv_eventName_3_0= RULE_ID
                    {
                    lv_eventName_3_0=(Token)match(input,RULE_ID,FOLLOW_32); 

                    						newLeafNode(lv_eventName_3_0, grammarAccess.getEveryAccess().getEventNameIDTerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getEveryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventName",
                    							lv_eventName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    // InternalEsper2Maude.g:1212:4: (otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')' )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==15) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // InternalEsper2Maude.g:1213:5: otherlv_4= '(' ( (lv_filter_5_0= ruleFilterEvent ) ) otherlv_6= ')'
                            {
                            otherlv_4=(Token)match(input,15,FOLLOW_30); 

                            					newLeafNode(otherlv_4, grammarAccess.getEveryAccess().getLeftParenthesisKeyword_0_3_0());
                            				
                            // InternalEsper2Maude.g:1217:5: ( (lv_filter_5_0= ruleFilterEvent ) )
                            // InternalEsper2Maude.g:1218:6: (lv_filter_5_0= ruleFilterEvent )
                            {
                            // InternalEsper2Maude.g:1218:6: (lv_filter_5_0= ruleFilterEvent )
                            // InternalEsper2Maude.g:1219:7: lv_filter_5_0= ruleFilterEvent
                            {

                            							newCompositeNode(grammarAccess.getEveryAccess().getFilterFilterEventParserRuleCall_0_3_1_0());
                            						
                            pushFollow(FOLLOW_12);
                            lv_filter_5_0=ruleFilterEvent();

                            state._fsp--;


                            							if (current==null) {
                            								current = createModelElementForParent(grammarAccess.getEveryRule());
                            							}
                            							set(
                            								current,
                            								"filter",
                            								lv_filter_5_0,
                            								"org.xtext.example.mydsl.Esper2Maude.FilterEvent");
                            							afterParserOrEnumRuleCall();
                            						

                            }


                            }

                            otherlv_6=(Token)match(input,17,FOLLOW_2); 

                            					newLeafNode(otherlv_6, grammarAccess.getEveryAccess().getRightParenthesisKeyword_0_3_2());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1243:3: (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' )
                    {
                    // InternalEsper2Maude.g:1243:3: (otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')' )
                    // InternalEsper2Maude.g:1244:4: otherlv_7= 'every' otherlv_8= '(' ( (lv_filterFrom_9_0= ruleFilterFrom ) ) otherlv_10= ')'
                    {
                    otherlv_7=(Token)match(input,32,FOLLOW_7); 

                    				newLeafNode(otherlv_7, grammarAccess.getEveryAccess().getEveryKeyword_1_0());
                    			
                    otherlv_8=(Token)match(input,15,FOLLOW_22); 

                    				newLeafNode(otherlv_8, grammarAccess.getEveryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:1252:4: ( (lv_filterFrom_9_0= ruleFilterFrom ) )
                    // InternalEsper2Maude.g:1253:5: (lv_filterFrom_9_0= ruleFilterFrom )
                    {
                    // InternalEsper2Maude.g:1253:5: (lv_filterFrom_9_0= ruleFilterFrom )
                    // InternalEsper2Maude.g:1254:6: lv_filterFrom_9_0= ruleFilterFrom
                    {

                    						newCompositeNode(grammarAccess.getEveryAccess().getFilterFromFilterFromParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
                    lv_filterFrom_9_0=ruleFilterFrom();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getEveryRule());
                    						}
                    						set(
                    							current,
                    							"filterFrom",
                    							lv_filterFrom_9_0,
                    							"org.xtext.example.mydsl.Esper2Maude.FilterFrom");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_2); 

                    				newLeafNode(otherlv_10, grammarAccess.getEveryAccess().getRightParenthesisKeyword_1_3());
                    			

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
    // $ANTLR end "ruleEvery"


    // $ANTLR start "entryRuleFilterEvent"
    // InternalEsper2Maude.g:1280:1: entryRuleFilterEvent returns [EObject current=null] : iv_ruleFilterEvent= ruleFilterEvent EOF ;
    public final EObject entryRuleFilterEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterEvent = null;


        try {
            // InternalEsper2Maude.g:1280:52: (iv_ruleFilterEvent= ruleFilterEvent EOF )
            // InternalEsper2Maude.g:1281:2: iv_ruleFilterEvent= ruleFilterEvent EOF
            {
             newCompositeNode(grammarAccess.getFilterEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterEvent=ruleFilterEvent();

            state._fsp--;

             current =iv_ruleFilterEvent; 
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
    // $ANTLR end "entryRuleFilterEvent"


    // $ANTLR start "ruleFilterEvent"
    // InternalEsper2Maude.g:1287:1: ruleFilterEvent returns [EObject current=null] : ( ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) ) ( (lv_filterOp_1_0= ruleFilterOperator ) ) ( (lv_filterRightHandSide_2_0= ruleFilterPart ) ) ) ;
    public final EObject ruleFilterEvent() throws RecognitionException {
        EObject current = null;

        EObject lv_filterLeftHandSide_0_0 = null;

        EObject lv_filterOp_1_0 = null;

        EObject lv_filterRightHandSide_2_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1293:2: ( ( ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) ) ( (lv_filterOp_1_0= ruleFilterOperator ) ) ( (lv_filterRightHandSide_2_0= ruleFilterPart ) ) ) )
            // InternalEsper2Maude.g:1294:2: ( ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) ) ( (lv_filterOp_1_0= ruleFilterOperator ) ) ( (lv_filterRightHandSide_2_0= ruleFilterPart ) ) )
            {
            // InternalEsper2Maude.g:1294:2: ( ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) ) ( (lv_filterOp_1_0= ruleFilterOperator ) ) ( (lv_filterRightHandSide_2_0= ruleFilterPart ) ) )
            // InternalEsper2Maude.g:1295:3: ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) ) ( (lv_filterOp_1_0= ruleFilterOperator ) ) ( (lv_filterRightHandSide_2_0= ruleFilterPart ) )
            {
            // InternalEsper2Maude.g:1295:3: ( (lv_filterLeftHandSide_0_0= ruleFilterPart ) )
            // InternalEsper2Maude.g:1296:4: (lv_filterLeftHandSide_0_0= ruleFilterPart )
            {
            // InternalEsper2Maude.g:1296:4: (lv_filterLeftHandSide_0_0= ruleFilterPart )
            // InternalEsper2Maude.g:1297:5: lv_filterLeftHandSide_0_0= ruleFilterPart
            {

            					newCompositeNode(grammarAccess.getFilterEventAccess().getFilterLeftHandSideFilterPartParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_27);
            lv_filterLeftHandSide_0_0=ruleFilterPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterEventRule());
            					}
            					set(
            						current,
            						"filterLeftHandSide",
            						lv_filterLeftHandSide_0_0,
            						"org.xtext.example.mydsl.Esper2Maude.FilterPart");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsper2Maude.g:1314:3: ( (lv_filterOp_1_0= ruleFilterOperator ) )
            // InternalEsper2Maude.g:1315:4: (lv_filterOp_1_0= ruleFilterOperator )
            {
            // InternalEsper2Maude.g:1315:4: (lv_filterOp_1_0= ruleFilterOperator )
            // InternalEsper2Maude.g:1316:5: lv_filterOp_1_0= ruleFilterOperator
            {

            					newCompositeNode(grammarAccess.getFilterEventAccess().getFilterOpFilterOperatorParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_30);
            lv_filterOp_1_0=ruleFilterOperator();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterEventRule());
            					}
            					set(
            						current,
            						"filterOp",
            						lv_filterOp_1_0,
            						"org.xtext.example.mydsl.Esper2Maude.FilterOperator");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalEsper2Maude.g:1333:3: ( (lv_filterRightHandSide_2_0= ruleFilterPart ) )
            // InternalEsper2Maude.g:1334:4: (lv_filterRightHandSide_2_0= ruleFilterPart )
            {
            // InternalEsper2Maude.g:1334:4: (lv_filterRightHandSide_2_0= ruleFilterPart )
            // InternalEsper2Maude.g:1335:5: lv_filterRightHandSide_2_0= ruleFilterPart
            {

            					newCompositeNode(grammarAccess.getFilterEventAccess().getFilterRightHandSideFilterPartParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_filterRightHandSide_2_0=ruleFilterPart();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFilterEventRule());
            					}
            					set(
            						current,
            						"filterRightHandSide",
            						lv_filterRightHandSide_2_0,
            						"org.xtext.example.mydsl.Esper2Maude.FilterPart");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleFilterEvent"


    // $ANTLR start "entryRuleFilterPart"
    // InternalEsper2Maude.g:1356:1: entryRuleFilterPart returns [EObject current=null] : iv_ruleFilterPart= ruleFilterPart EOF ;
    public final EObject entryRuleFilterPart() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterPart = null;


        try {
            // InternalEsper2Maude.g:1356:51: (iv_ruleFilterPart= ruleFilterPart EOF )
            // InternalEsper2Maude.g:1357:2: iv_ruleFilterPart= ruleFilterPart EOF
            {
             newCompositeNode(grammarAccess.getFilterPartRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterPart=ruleFilterPart();

            state._fsp--;

             current =iv_ruleFilterPart; 
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
    // $ANTLR end "entryRuleFilterPart"


    // $ANTLR start "ruleFilterPart"
    // InternalEsper2Maude.g:1363:1: ruleFilterPart returns [EObject current=null] : ( ( (lv_eventPropName_0_0= RULE_ID ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) | ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? ) | ( (lv_str_8_0= RULE_STRING ) ) | ( (lv_t_9_0= 'true' ) ) | ( (lv_f_10_0= 'false' ) ) ) ;
    public final EObject ruleFilterPart() throws RecognitionException {
        EObject current = null;

        Token lv_eventPropName_0_0=null;
        Token lv_eventVariable_1_0=null;
        Token otherlv_2=null;
        Token lv_eventPropName_3_0=null;
        Token lv_neg_4_0=null;
        Token lv_num_5_0=null;
        Token otherlv_6=null;
        Token lv_dec_7_0=null;
        Token lv_str_8_0=null;
        Token lv_t_9_0=null;
        Token lv_f_10_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:1369:2: ( ( ( (lv_eventPropName_0_0= RULE_ID ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) | ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? ) | ( (lv_str_8_0= RULE_STRING ) ) | ( (lv_t_9_0= 'true' ) ) | ( (lv_f_10_0= 'false' ) ) ) )
            // InternalEsper2Maude.g:1370:2: ( ( (lv_eventPropName_0_0= RULE_ID ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) | ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? ) | ( (lv_str_8_0= RULE_STRING ) ) | ( (lv_t_9_0= 'true' ) ) | ( (lv_f_10_0= 'false' ) ) )
            {
            // InternalEsper2Maude.g:1370:2: ( ( (lv_eventPropName_0_0= RULE_ID ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) | ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? ) | ( (lv_str_8_0= RULE_STRING ) ) | ( (lv_t_9_0= 'true' ) ) | ( (lv_f_10_0= 'false' ) ) )
            int alt23=6;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                int LA23_1 = input.LA(2);

                if ( (LA23_1==27) ) {
                    alt23=2;
                }
                else if ( (LA23_1==EOF||LA23_1==17||LA23_1==26||LA23_1==33||(LA23_1>=39 && LA23_1<=45)) ) {
                    alt23=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 23, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
            case 36:
                {
                alt23=3;
                }
                break;
            case RULE_STRING:
                {
                alt23=4;
                }
                break;
            case 37:
                {
                alt23=5;
                }
                break;
            case 38:
                {
                alt23=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalEsper2Maude.g:1371:3: ( (lv_eventPropName_0_0= RULE_ID ) )
                    {
                    // InternalEsper2Maude.g:1371:3: ( (lv_eventPropName_0_0= RULE_ID ) )
                    // InternalEsper2Maude.g:1372:4: (lv_eventPropName_0_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:1372:4: (lv_eventPropName_0_0= RULE_ID )
                    // InternalEsper2Maude.g:1373:5: lv_eventPropName_0_0= RULE_ID
                    {
                    lv_eventPropName_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    					newLeafNode(lv_eventPropName_0_0, grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"eventPropName",
                    						lv_eventPropName_0_0,
                    						"org.eclipse.xtext.common.Terminals.ID");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1390:3: ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) )
                    {
                    // InternalEsper2Maude.g:1390:3: ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) )
                    // InternalEsper2Maude.g:1391:4: ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) )
                    {
                    // InternalEsper2Maude.g:1391:4: ( (lv_eventVariable_1_0= RULE_ID ) )
                    // InternalEsper2Maude.g:1392:5: (lv_eventVariable_1_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:1392:5: (lv_eventVariable_1_0= RULE_ID )
                    // InternalEsper2Maude.g:1393:6: lv_eventVariable_1_0= RULE_ID
                    {
                    lv_eventVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(lv_eventVariable_1_0, grammarAccess.getFilterPartAccess().getEventVariableIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventVariable",
                    							lv_eventVariable_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFilterPartAccess().getFullStopKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:1413:4: ( (lv_eventPropName_3_0= RULE_ID ) )
                    // InternalEsper2Maude.g:1414:5: (lv_eventPropName_3_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:1414:5: (lv_eventPropName_3_0= RULE_ID )
                    // InternalEsper2Maude.g:1415:6: lv_eventPropName_3_0= RULE_ID
                    {
                    lv_eventPropName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_eventPropName_3_0, grammarAccess.getFilterPartAccess().getEventPropNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventPropName",
                    							lv_eventPropName_3_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:1433:3: ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? )
                    {
                    // InternalEsper2Maude.g:1433:3: ( ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )? )
                    // InternalEsper2Maude.g:1434:4: ( (lv_neg_4_0= '-' ) )? ( (lv_num_5_0= RULE_INT ) ) (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )?
                    {
                    // InternalEsper2Maude.g:1434:4: ( (lv_neg_4_0= '-' ) )?
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==36) ) {
                        alt21=1;
                    }
                    switch (alt21) {
                        case 1 :
                            // InternalEsper2Maude.g:1435:5: (lv_neg_4_0= '-' )
                            {
                            // InternalEsper2Maude.g:1435:5: (lv_neg_4_0= '-' )
                            // InternalEsper2Maude.g:1436:6: lv_neg_4_0= '-'
                            {
                            lv_neg_4_0=(Token)match(input,36,FOLLOW_14); 

                            						newLeafNode(lv_neg_4_0, grammarAccess.getFilterPartAccess().getNegHyphenMinusKeyword_2_0_0());
                            					

                            						if (current==null) {
                            							current = createModelElement(grammarAccess.getFilterPartRule());
                            						}
                            						setWithLastConsumed(current, "neg", lv_neg_4_0, "-");
                            					

                            }


                            }
                            break;

                    }

                    // InternalEsper2Maude.g:1448:4: ( (lv_num_5_0= RULE_INT ) )
                    // InternalEsper2Maude.g:1449:5: (lv_num_5_0= RULE_INT )
                    {
                    // InternalEsper2Maude.g:1449:5: (lv_num_5_0= RULE_INT )
                    // InternalEsper2Maude.g:1450:6: lv_num_5_0= RULE_INT
                    {
                    lv_num_5_0=(Token)match(input,RULE_INT,FOLLOW_24); 

                    						newLeafNode(lv_num_5_0, grammarAccess.getFilterPartAccess().getNumINTTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFilterPartRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"num",
                    							lv_num_5_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalEsper2Maude.g:1466:4: (otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) ) )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==27) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // InternalEsper2Maude.g:1467:5: otherlv_6= '.' ( (lv_dec_7_0= RULE_INT ) )
                            {
                            otherlv_6=(Token)match(input,27,FOLLOW_14); 

                            					newLeafNode(otherlv_6, grammarAccess.getFilterPartAccess().getFullStopKeyword_2_2_0());
                            				
                            // InternalEsper2Maude.g:1471:5: ( (lv_dec_7_0= RULE_INT ) )
                            // InternalEsper2Maude.g:1472:6: (lv_dec_7_0= RULE_INT )
                            {
                            // InternalEsper2Maude.g:1472:6: (lv_dec_7_0= RULE_INT )
                            // InternalEsper2Maude.g:1473:7: lv_dec_7_0= RULE_INT
                            {
                            lv_dec_7_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                            							newLeafNode(lv_dec_7_0, grammarAccess.getFilterPartAccess().getDecINTTerminalRuleCall_2_2_1_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getFilterPartRule());
                            							}
                            							setWithLastConsumed(
                            								current,
                            								"dec",
                            								lv_dec_7_0,
                            								"org.eclipse.xtext.common.Terminals.INT");
                            						

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEsper2Maude.g:1492:3: ( (lv_str_8_0= RULE_STRING ) )
                    {
                    // InternalEsper2Maude.g:1492:3: ( (lv_str_8_0= RULE_STRING ) )
                    // InternalEsper2Maude.g:1493:4: (lv_str_8_0= RULE_STRING )
                    {
                    // InternalEsper2Maude.g:1493:4: (lv_str_8_0= RULE_STRING )
                    // InternalEsper2Maude.g:1494:5: lv_str_8_0= RULE_STRING
                    {
                    lv_str_8_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    					newLeafNode(lv_str_8_0, grammarAccess.getFilterPartAccess().getStrSTRINGTerminalRuleCall_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterPartRule());
                    					}
                    					setWithLastConsumed(
                    						current,
                    						"str",
                    						lv_str_8_0,
                    						"org.eclipse.xtext.common.Terminals.STRING");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEsper2Maude.g:1511:3: ( (lv_t_9_0= 'true' ) )
                    {
                    // InternalEsper2Maude.g:1511:3: ( (lv_t_9_0= 'true' ) )
                    // InternalEsper2Maude.g:1512:4: (lv_t_9_0= 'true' )
                    {
                    // InternalEsper2Maude.g:1512:4: (lv_t_9_0= 'true' )
                    // InternalEsper2Maude.g:1513:5: lv_t_9_0= 'true'
                    {
                    lv_t_9_0=(Token)match(input,37,FOLLOW_2); 

                    					newLeafNode(lv_t_9_0, grammarAccess.getFilterPartAccess().getTTrueKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterPartRule());
                    					}
                    					setWithLastConsumed(current, "t", lv_t_9_0, "true");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalEsper2Maude.g:1526:3: ( (lv_f_10_0= 'false' ) )
                    {
                    // InternalEsper2Maude.g:1526:3: ( (lv_f_10_0= 'false' ) )
                    // InternalEsper2Maude.g:1527:4: (lv_f_10_0= 'false' )
                    {
                    // InternalEsper2Maude.g:1527:4: (lv_f_10_0= 'false' )
                    // InternalEsper2Maude.g:1528:5: lv_f_10_0= 'false'
                    {
                    lv_f_10_0=(Token)match(input,38,FOLLOW_2); 

                    					newLeafNode(lv_f_10_0, grammarAccess.getFilterPartAccess().getFFalseKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFilterPartRule());
                    					}
                    					setWithLastConsumed(current, "f", lv_f_10_0, "false");
                    				

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
    // $ANTLR end "ruleFilterPart"


    // $ANTLR start "entryRuleFilterOperator"
    // InternalEsper2Maude.g:1544:1: entryRuleFilterOperator returns [EObject current=null] : iv_ruleFilterOperator= ruleFilterOperator EOF ;
    public final EObject entryRuleFilterOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFilterOperator = null;


        try {
            // InternalEsper2Maude.g:1544:55: (iv_ruleFilterOperator= ruleFilterOperator EOF )
            // InternalEsper2Maude.g:1545:2: iv_ruleFilterOperator= ruleFilterOperator EOF
            {
             newCompositeNode(grammarAccess.getFilterOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFilterOperator=ruleFilterOperator();

            state._fsp--;

             current =iv_ruleFilterOperator; 
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
    // $ANTLR end "entryRuleFilterOperator"


    // $ANTLR start "ruleFilterOperator"
    // InternalEsper2Maude.g:1551:1: ruleFilterOperator returns [EObject current=null] : ( ( (lv_comparison_0_0= ruleComparisonOperator ) ) | ( (lv_logical_1_0= ruleLogicalOperator ) ) ) ;
    public final EObject ruleFilterOperator() throws RecognitionException {
        EObject current = null;

        EObject lv_comparison_0_0 = null;

        EObject lv_logical_1_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1557:2: ( ( ( (lv_comparison_0_0= ruleComparisonOperator ) ) | ( (lv_logical_1_0= ruleLogicalOperator ) ) ) )
            // InternalEsper2Maude.g:1558:2: ( ( (lv_comparison_0_0= ruleComparisonOperator ) ) | ( (lv_logical_1_0= ruleLogicalOperator ) ) )
            {
            // InternalEsper2Maude.g:1558:2: ( ( (lv_comparison_0_0= ruleComparisonOperator ) ) | ( (lv_logical_1_0= ruleLogicalOperator ) ) )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33||(LA24_0>=39 && LA24_0<=43)) ) {
                alt24=1;
            }
            else if ( ((LA24_0>=44 && LA24_0<=45)) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // InternalEsper2Maude.g:1559:3: ( (lv_comparison_0_0= ruleComparisonOperator ) )
                    {
                    // InternalEsper2Maude.g:1559:3: ( (lv_comparison_0_0= ruleComparisonOperator ) )
                    // InternalEsper2Maude.g:1560:4: (lv_comparison_0_0= ruleComparisonOperator )
                    {
                    // InternalEsper2Maude.g:1560:4: (lv_comparison_0_0= ruleComparisonOperator )
                    // InternalEsper2Maude.g:1561:5: lv_comparison_0_0= ruleComparisonOperator
                    {

                    					newCompositeNode(grammarAccess.getFilterOperatorAccess().getComparisonComparisonOperatorParserRuleCall_0_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_comparison_0_0=ruleComparisonOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterOperatorRule());
                    					}
                    					set(
                    						current,
                    						"comparison",
                    						lv_comparison_0_0,
                    						"org.xtext.example.mydsl.Esper2Maude.ComparisonOperator");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1579:3: ( (lv_logical_1_0= ruleLogicalOperator ) )
                    {
                    // InternalEsper2Maude.g:1579:3: ( (lv_logical_1_0= ruleLogicalOperator ) )
                    // InternalEsper2Maude.g:1580:4: (lv_logical_1_0= ruleLogicalOperator )
                    {
                    // InternalEsper2Maude.g:1580:4: (lv_logical_1_0= ruleLogicalOperator )
                    // InternalEsper2Maude.g:1581:5: lv_logical_1_0= ruleLogicalOperator
                    {

                    					newCompositeNode(grammarAccess.getFilterOperatorAccess().getLogicalLogicalOperatorParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_logical_1_0=ruleLogicalOperator();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getFilterOperatorRule());
                    					}
                    					set(
                    						current,
                    						"logical",
                    						lv_logical_1_0,
                    						"org.xtext.example.mydsl.Esper2Maude.LogicalOperator");
                    					afterParserOrEnumRuleCall();
                    				

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
    // $ANTLR end "ruleFilterOperator"


    // $ANTLR start "entryRuleComparisonOperator"
    // InternalEsper2Maude.g:1602:1: entryRuleComparisonOperator returns [EObject current=null] : iv_ruleComparisonOperator= ruleComparisonOperator EOF ;
    public final EObject entryRuleComparisonOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComparisonOperator = null;


        try {
            // InternalEsper2Maude.g:1602:59: (iv_ruleComparisonOperator= ruleComparisonOperator EOF )
            // InternalEsper2Maude.g:1603:2: iv_ruleComparisonOperator= ruleComparisonOperator EOF
            {
             newCompositeNode(grammarAccess.getComparisonOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComparisonOperator=ruleComparisonOperator();

            state._fsp--;

             current =iv_ruleComparisonOperator; 
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
    // $ANTLR end "entryRuleComparisonOperator"


    // $ANTLR start "ruleComparisonOperator"
    // InternalEsper2Maude.g:1609:1: ruleComparisonOperator returns [EObject current=null] : ( ( (lv_gt_0_0= '>' ) ) | ( (lv_ge_1_0= '>=' ) ) | ( (lv_eq_2_0= '=' ) ) | ( (lv_neq_3_0= '<>' ) ) | ( (lv_lt_4_0= '<' ) ) | ( (lv_le_5_0= '<=' ) ) ) ;
    public final EObject ruleComparisonOperator() throws RecognitionException {
        EObject current = null;

        Token lv_gt_0_0=null;
        Token lv_ge_1_0=null;
        Token lv_eq_2_0=null;
        Token lv_neq_3_0=null;
        Token lv_lt_4_0=null;
        Token lv_le_5_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:1615:2: ( ( ( (lv_gt_0_0= '>' ) ) | ( (lv_ge_1_0= '>=' ) ) | ( (lv_eq_2_0= '=' ) ) | ( (lv_neq_3_0= '<>' ) ) | ( (lv_lt_4_0= '<' ) ) | ( (lv_le_5_0= '<=' ) ) ) )
            // InternalEsper2Maude.g:1616:2: ( ( (lv_gt_0_0= '>' ) ) | ( (lv_ge_1_0= '>=' ) ) | ( (lv_eq_2_0= '=' ) ) | ( (lv_neq_3_0= '<>' ) ) | ( (lv_lt_4_0= '<' ) ) | ( (lv_le_5_0= '<=' ) ) )
            {
            // InternalEsper2Maude.g:1616:2: ( ( (lv_gt_0_0= '>' ) ) | ( (lv_ge_1_0= '>=' ) ) | ( (lv_eq_2_0= '=' ) ) | ( (lv_neq_3_0= '<>' ) ) | ( (lv_lt_4_0= '<' ) ) | ( (lv_le_5_0= '<=' ) ) )
            int alt25=6;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt25=1;
                }
                break;
            case 40:
                {
                alt25=2;
                }
                break;
            case 33:
                {
                alt25=3;
                }
                break;
            case 41:
                {
                alt25=4;
                }
                break;
            case 42:
                {
                alt25=5;
                }
                break;
            case 43:
                {
                alt25=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;
            }

            switch (alt25) {
                case 1 :
                    // InternalEsper2Maude.g:1617:3: ( (lv_gt_0_0= '>' ) )
                    {
                    // InternalEsper2Maude.g:1617:3: ( (lv_gt_0_0= '>' ) )
                    // InternalEsper2Maude.g:1618:4: (lv_gt_0_0= '>' )
                    {
                    // InternalEsper2Maude.g:1618:4: (lv_gt_0_0= '>' )
                    // InternalEsper2Maude.g:1619:5: lv_gt_0_0= '>'
                    {
                    lv_gt_0_0=(Token)match(input,39,FOLLOW_2); 

                    					newLeafNode(lv_gt_0_0, grammarAccess.getComparisonOperatorAccess().getGtGreaterThanSignKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "gt", lv_gt_0_0, ">");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1632:3: ( (lv_ge_1_0= '>=' ) )
                    {
                    // InternalEsper2Maude.g:1632:3: ( (lv_ge_1_0= '>=' ) )
                    // InternalEsper2Maude.g:1633:4: (lv_ge_1_0= '>=' )
                    {
                    // InternalEsper2Maude.g:1633:4: (lv_ge_1_0= '>=' )
                    // InternalEsper2Maude.g:1634:5: lv_ge_1_0= '>='
                    {
                    lv_ge_1_0=(Token)match(input,40,FOLLOW_2); 

                    					newLeafNode(lv_ge_1_0, grammarAccess.getComparisonOperatorAccess().getGeGreaterThanSignEqualsSignKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "ge", lv_ge_1_0, ">=");
                    				

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEsper2Maude.g:1647:3: ( (lv_eq_2_0= '=' ) )
                    {
                    // InternalEsper2Maude.g:1647:3: ( (lv_eq_2_0= '=' ) )
                    // InternalEsper2Maude.g:1648:4: (lv_eq_2_0= '=' )
                    {
                    // InternalEsper2Maude.g:1648:4: (lv_eq_2_0= '=' )
                    // InternalEsper2Maude.g:1649:5: lv_eq_2_0= '='
                    {
                    lv_eq_2_0=(Token)match(input,33,FOLLOW_2); 

                    					newLeafNode(lv_eq_2_0, grammarAccess.getComparisonOperatorAccess().getEqEqualsSignKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "eq", lv_eq_2_0, "=");
                    				

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEsper2Maude.g:1662:3: ( (lv_neq_3_0= '<>' ) )
                    {
                    // InternalEsper2Maude.g:1662:3: ( (lv_neq_3_0= '<>' ) )
                    // InternalEsper2Maude.g:1663:4: (lv_neq_3_0= '<>' )
                    {
                    // InternalEsper2Maude.g:1663:4: (lv_neq_3_0= '<>' )
                    // InternalEsper2Maude.g:1664:5: lv_neq_3_0= '<>'
                    {
                    lv_neq_3_0=(Token)match(input,41,FOLLOW_2); 

                    					newLeafNode(lv_neq_3_0, grammarAccess.getComparisonOperatorAccess().getNeqLessThanSignGreaterThanSignKeyword_3_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "neq", lv_neq_3_0, "<>");
                    				

                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEsper2Maude.g:1677:3: ( (lv_lt_4_0= '<' ) )
                    {
                    // InternalEsper2Maude.g:1677:3: ( (lv_lt_4_0= '<' ) )
                    // InternalEsper2Maude.g:1678:4: (lv_lt_4_0= '<' )
                    {
                    // InternalEsper2Maude.g:1678:4: (lv_lt_4_0= '<' )
                    // InternalEsper2Maude.g:1679:5: lv_lt_4_0= '<'
                    {
                    lv_lt_4_0=(Token)match(input,42,FOLLOW_2); 

                    					newLeafNode(lv_lt_4_0, grammarAccess.getComparisonOperatorAccess().getLtLessThanSignKeyword_4_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "lt", lv_lt_4_0, "<");
                    				

                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalEsper2Maude.g:1692:3: ( (lv_le_5_0= '<=' ) )
                    {
                    // InternalEsper2Maude.g:1692:3: ( (lv_le_5_0= '<=' ) )
                    // InternalEsper2Maude.g:1693:4: (lv_le_5_0= '<=' )
                    {
                    // InternalEsper2Maude.g:1693:4: (lv_le_5_0= '<=' )
                    // InternalEsper2Maude.g:1694:5: lv_le_5_0= '<='
                    {
                    lv_le_5_0=(Token)match(input,43,FOLLOW_2); 

                    					newLeafNode(lv_le_5_0, grammarAccess.getComparisonOperatorAccess().getLeLessThanSignEqualsSignKeyword_5_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getComparisonOperatorRule());
                    					}
                    					setWithLastConsumed(current, "le", lv_le_5_0, "<=");
                    				

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
    // $ANTLR end "ruleComparisonOperator"


    // $ANTLR start "entryRuleLogicalOperator"
    // InternalEsper2Maude.g:1710:1: entryRuleLogicalOperator returns [EObject current=null] : iv_ruleLogicalOperator= ruleLogicalOperator EOF ;
    public final EObject entryRuleLogicalOperator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLogicalOperator = null;


        try {
            // InternalEsper2Maude.g:1710:56: (iv_ruleLogicalOperator= ruleLogicalOperator EOF )
            // InternalEsper2Maude.g:1711:2: iv_ruleLogicalOperator= ruleLogicalOperator EOF
            {
             newCompositeNode(grammarAccess.getLogicalOperatorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLogicalOperator=ruleLogicalOperator();

            state._fsp--;

             current =iv_ruleLogicalOperator; 
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
    // $ANTLR end "entryRuleLogicalOperator"


    // $ANTLR start "ruleLogicalOperator"
    // InternalEsper2Maude.g:1717:1: ruleLogicalOperator returns [EObject current=null] : ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) ) ;
    public final EObject ruleLogicalOperator() throws RecognitionException {
        EObject current = null;

        Token lv_and_0_0=null;
        Token lv_or_1_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:1723:2: ( ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) ) )
            // InternalEsper2Maude.g:1724:2: ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )
            {
            // InternalEsper2Maude.g:1724:2: ( ( (lv_and_0_0= 'and' ) ) | ( (lv_or_1_0= 'or' ) ) )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==44) ) {
                alt26=1;
            }
            else if ( (LA26_0==45) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }
            switch (alt26) {
                case 1 :
                    // InternalEsper2Maude.g:1725:3: ( (lv_and_0_0= 'and' ) )
                    {
                    // InternalEsper2Maude.g:1725:3: ( (lv_and_0_0= 'and' ) )
                    // InternalEsper2Maude.g:1726:4: (lv_and_0_0= 'and' )
                    {
                    // InternalEsper2Maude.g:1726:4: (lv_and_0_0= 'and' )
                    // InternalEsper2Maude.g:1727:5: lv_and_0_0= 'and'
                    {
                    lv_and_0_0=(Token)match(input,44,FOLLOW_2); 

                    					newLeafNode(lv_and_0_0, grammarAccess.getLogicalOperatorAccess().getAndAndKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "and", lv_and_0_0, "and");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:1740:3: ( (lv_or_1_0= 'or' ) )
                    {
                    // InternalEsper2Maude.g:1740:3: ( (lv_or_1_0= 'or' ) )
                    // InternalEsper2Maude.g:1741:4: (lv_or_1_0= 'or' )
                    {
                    // InternalEsper2Maude.g:1741:4: (lv_or_1_0= 'or' )
                    // InternalEsper2Maude.g:1742:5: lv_or_1_0= 'or'
                    {
                    lv_or_1_0=(Token)match(input,45,FOLLOW_2); 

                    					newLeafNode(lv_or_1_0, grammarAccess.getLogicalOperatorAccess().getOrOrKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLogicalOperatorRule());
                    					}
                    					setWithLastConsumed(current, "or", lv_or_1_0, "or");
                    				

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
    // $ANTLR end "ruleLogicalOperator"


    // $ANTLR start "entryRuleEvent"
    // InternalEsper2Maude.g:1758:1: entryRuleEvent returns [EObject current=null] : iv_ruleEvent= ruleEvent EOF ;
    public final EObject entryRuleEvent() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEvent = null;


        try {
            // InternalEsper2Maude.g:1758:46: (iv_ruleEvent= ruleEvent EOF )
            // InternalEsper2Maude.g:1759:2: iv_ruleEvent= ruleEvent EOF
            {
             newCompositeNode(grammarAccess.getEventRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEvent=ruleEvent();

            state._fsp--;

             current =iv_ruleEvent; 
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
    // $ANTLR end "entryRuleEvent"


    // $ANTLR start "ruleEvent"
    // InternalEsper2Maude.g:1765:1: ruleEvent returns [EObject current=null] : ( (lv_name_0_0= RULE_ID ) ) ;
    public final EObject ruleEvent() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:1771:2: ( ( (lv_name_0_0= RULE_ID ) ) )
            // InternalEsper2Maude.g:1772:2: ( (lv_name_0_0= RULE_ID ) )
            {
            // InternalEsper2Maude.g:1772:2: ( (lv_name_0_0= RULE_ID ) )
            // InternalEsper2Maude.g:1773:3: (lv_name_0_0= RULE_ID )
            {
            // InternalEsper2Maude.g:1773:3: (lv_name_0_0= RULE_ID )
            // InternalEsper2Maude.g:1774:4: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(lv_name_0_0, grammarAccess.getEventAccess().getNameIDTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getEventRule());
            				}
            				setWithLastConsumed(
            					current,
            					"name",
            					lv_name_0_0,
            					"org.eclipse.xtext.common.Terminals.ID");
            			

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
    // $ANTLR end "ruleEvent"


    // $ANTLR start "entryRuleNonLastSelectEntry"
    // InternalEsper2Maude.g:1793:1: entryRuleNonLastSelectEntry returns [EObject current=null] : iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF ;
    public final EObject entryRuleNonLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNonLastSelectEntry = null;


        try {
            // InternalEsper2Maude.g:1793:59: (iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF )
            // InternalEsper2Maude.g:1794:2: iv_ruleNonLastSelectEntry= ruleNonLastSelectEntry EOF
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
    // InternalEsper2Maude.g:1800:1: ruleNonLastSelectEntry returns [EObject current=null] : ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' ) ;
    public final EObject ruleNonLastSelectEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_entry_0_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1806:2: ( ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' ) )
            // InternalEsper2Maude.g:1807:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' )
            {
            // InternalEsper2Maude.g:1807:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ',' )
            // InternalEsper2Maude.g:1808:3: ( (lv_entry_0_0= ruleSelectEntry ) ) otherlv_1= ','
            {
            // InternalEsper2Maude.g:1808:3: ( (lv_entry_0_0= ruleSelectEntry ) )
            // InternalEsper2Maude.g:1809:4: (lv_entry_0_0= ruleSelectEntry )
            {
            // InternalEsper2Maude.g:1809:4: (lv_entry_0_0= ruleSelectEntry )
            // InternalEsper2Maude.g:1810:5: lv_entry_0_0= ruleSelectEntry
            {

            					newCompositeNode(grammarAccess.getNonLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_37);
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

            otherlv_1=(Token)match(input,16,FOLLOW_2); 

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
    // InternalEsper2Maude.g:1835:1: entryRuleLastSelectEntry returns [EObject current=null] : iv_ruleLastSelectEntry= ruleLastSelectEntry EOF ;
    public final EObject entryRuleLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLastSelectEntry = null;


        try {
            // InternalEsper2Maude.g:1835:56: (iv_ruleLastSelectEntry= ruleLastSelectEntry EOF )
            // InternalEsper2Maude.g:1836:2: iv_ruleLastSelectEntry= ruleLastSelectEntry EOF
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
    // InternalEsper2Maude.g:1842:1: ruleLastSelectEntry returns [EObject current=null] : ( (lv_entry_0_0= ruleSelectEntry ) ) ;
    public final EObject ruleLastSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject lv_entry_0_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1848:2: ( ( (lv_entry_0_0= ruleSelectEntry ) ) )
            // InternalEsper2Maude.g:1849:2: ( (lv_entry_0_0= ruleSelectEntry ) )
            {
            // InternalEsper2Maude.g:1849:2: ( (lv_entry_0_0= ruleSelectEntry ) )
            // InternalEsper2Maude.g:1850:3: (lv_entry_0_0= ruleSelectEntry )
            {
            // InternalEsper2Maude.g:1850:3: (lv_entry_0_0= ruleSelectEntry )
            // InternalEsper2Maude.g:1851:4: lv_entry_0_0= ruleSelectEntry
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
    // InternalEsper2Maude.g:1871:1: entryRuleSelectEntry returns [EObject current=null] : iv_ruleSelectEntry= ruleSelectEntry EOF ;
    public final EObject entryRuleSelectEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelectEntry = null;


        try {
            // InternalEsper2Maude.g:1871:52: (iv_ruleSelectEntry= ruleSelectEntry EOF )
            // InternalEsper2Maude.g:1872:2: iv_ruleSelectEntry= ruleSelectEntry EOF
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
    // InternalEsper2Maude.g:1878:1: ruleSelectEntry returns [EObject current=null] : ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) ) ;
    public final EObject ruleSelectEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_alias_2_0=null;
        Token lv_groupOp_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token lv_alias_8_0=null;
        EObject lv_field_0_0 = null;

        EObject lv_field_5_0 = null;



        	enterRule();

        try {
            // InternalEsper2Maude.g:1884:2: ( ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) ) )
            // InternalEsper2Maude.g:1885:2: ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) )
            {
            // InternalEsper2Maude.g:1885:2: ( ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? ) | ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID||LA29_0==47) ) {
                alt29=1;
            }
            else if ( (LA29_0==RULE_GROUP_OP) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEsper2Maude.g:1886:3: ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
                    {
                    // InternalEsper2Maude.g:1886:3: ( ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )? )
                    // InternalEsper2Maude.g:1887:4: ( (lv_field_0_0= ruleField ) ) (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
                    {
                    // InternalEsper2Maude.g:1887:4: ( (lv_field_0_0= ruleField ) )
                    // InternalEsper2Maude.g:1888:5: (lv_field_0_0= ruleField )
                    {
                    // InternalEsper2Maude.g:1888:5: (lv_field_0_0= ruleField )
                    // InternalEsper2Maude.g:1889:6: lv_field_0_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_38);
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

                    // InternalEsper2Maude.g:1906:4: (otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) ) )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==46) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalEsper2Maude.g:1907:5: otherlv_1= 'as' ( (lv_alias_2_0= RULE_ID ) )
                            {
                            otherlv_1=(Token)match(input,46,FOLLOW_6); 

                            					newLeafNode(otherlv_1, grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0());
                            				
                            // InternalEsper2Maude.g:1911:5: ( (lv_alias_2_0= RULE_ID ) )
                            // InternalEsper2Maude.g:1912:6: (lv_alias_2_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:1912:6: (lv_alias_2_0= RULE_ID )
                            // InternalEsper2Maude.g:1913:7: lv_alias_2_0= RULE_ID
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
                    // InternalEsper2Maude.g:1932:3: ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? )
                    {
                    // InternalEsper2Maude.g:1932:3: ( ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )? )
                    // InternalEsper2Maude.g:1933:4: ( (lv_groupOp_3_0= RULE_GROUP_OP ) ) otherlv_4= '(' ( (lv_field_5_0= ruleField ) ) otherlv_6= ')' (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
                    {
                    // InternalEsper2Maude.g:1933:4: ( (lv_groupOp_3_0= RULE_GROUP_OP ) )
                    // InternalEsper2Maude.g:1934:5: (lv_groupOp_3_0= RULE_GROUP_OP )
                    {
                    // InternalEsper2Maude.g:1934:5: (lv_groupOp_3_0= RULE_GROUP_OP )
                    // InternalEsper2Maude.g:1935:6: lv_groupOp_3_0= RULE_GROUP_OP
                    {
                    lv_groupOp_3_0=(Token)match(input,RULE_GROUP_OP,FOLLOW_7); 

                    						newLeafNode(lv_groupOp_3_0, grammarAccess.getSelectEntryAccess().getGroupOpGROUP_OPTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getSelectEntryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"groupOp",
                    							lv_groupOp_3_0,
                    							"org.xtext.example.mydsl.Esper2Maude.GROUP_OP");
                    					

                    }


                    }

                    otherlv_4=(Token)match(input,15,FOLLOW_39); 

                    				newLeafNode(otherlv_4, grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:1955:4: ( (lv_field_5_0= ruleField ) )
                    // InternalEsper2Maude.g:1956:5: (lv_field_5_0= ruleField )
                    {
                    // InternalEsper2Maude.g:1956:5: (lv_field_5_0= ruleField )
                    // InternalEsper2Maude.g:1957:6: lv_field_5_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_1_2_0());
                    					
                    pushFollow(FOLLOW_12);
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

                    otherlv_6=(Token)match(input,17,FOLLOW_38); 

                    				newLeafNode(otherlv_6, grammarAccess.getSelectEntryAccess().getRightParenthesisKeyword_1_3());
                    			
                    // InternalEsper2Maude.g:1978:4: (otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) ) )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==46) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // InternalEsper2Maude.g:1979:5: otherlv_7= 'as' ( (lv_alias_8_0= RULE_ID ) )
                            {
                            otherlv_7=(Token)match(input,46,FOLLOW_6); 

                            					newLeafNode(otherlv_7, grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0());
                            				
                            // InternalEsper2Maude.g:1983:5: ( (lv_alias_8_0= RULE_ID ) )
                            // InternalEsper2Maude.g:1984:6: (lv_alias_8_0= RULE_ID )
                            {
                            // InternalEsper2Maude.g:1984:6: (lv_alias_8_0= RULE_ID )
                            // InternalEsper2Maude.g:1985:7: lv_alias_8_0= RULE_ID
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
    // InternalEsper2Maude.g:2007:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalEsper2Maude.g:2007:46: (iv_ruleField= ruleField EOF )
            // InternalEsper2Maude.g:2008:2: iv_ruleField= ruleField EOF
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
    // InternalEsper2Maude.g:2014:1: ruleField returns [EObject current=null] : ( ( (lv_star_0_0= '*' ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_star_0_0=null;
        Token lv_eventVariable_1_0=null;
        Token otherlv_2=null;
        Token lv_eventPropName_3_0=null;


        	enterRule();

        try {
            // InternalEsper2Maude.g:2020:2: ( ( ( (lv_star_0_0= '*' ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) ) )
            // InternalEsper2Maude.g:2021:2: ( ( (lv_star_0_0= '*' ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) )
            {
            // InternalEsper2Maude.g:2021:2: ( ( (lv_star_0_0= '*' ) ) | ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) ) )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            else if ( (LA30_0==RULE_ID) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEsper2Maude.g:2022:3: ( (lv_star_0_0= '*' ) )
                    {
                    // InternalEsper2Maude.g:2022:3: ( (lv_star_0_0= '*' ) )
                    // InternalEsper2Maude.g:2023:4: (lv_star_0_0= '*' )
                    {
                    // InternalEsper2Maude.g:2023:4: (lv_star_0_0= '*' )
                    // InternalEsper2Maude.g:2024:5: lv_star_0_0= '*'
                    {
                    lv_star_0_0=(Token)match(input,47,FOLLOW_2); 

                    					newLeafNode(lv_star_0_0, grammarAccess.getFieldAccess().getStarAsteriskKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldRule());
                    					}
                    					setWithLastConsumed(current, "star", lv_star_0_0, "*");
                    				

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEsper2Maude.g:2037:3: ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) )
                    {
                    // InternalEsper2Maude.g:2037:3: ( ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) ) )
                    // InternalEsper2Maude.g:2038:4: ( (lv_eventVariable_1_0= RULE_ID ) ) otherlv_2= '.' ( (lv_eventPropName_3_0= RULE_ID ) )
                    {
                    // InternalEsper2Maude.g:2038:4: ( (lv_eventVariable_1_0= RULE_ID ) )
                    // InternalEsper2Maude.g:2039:5: (lv_eventVariable_1_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:2039:5: (lv_eventVariable_1_0= RULE_ID )
                    // InternalEsper2Maude.g:2040:6: lv_eventVariable_1_0= RULE_ID
                    {
                    lv_eventVariable_1_0=(Token)match(input,RULE_ID,FOLLOW_36); 

                    						newLeafNode(lv_eventVariable_1_0, grammarAccess.getFieldAccess().getEventVariableIDTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventVariable",
                    							lv_eventVariable_1_0,
                    							"org.eclipse.xtext.common.Terminals.ID");
                    					

                    }


                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getFieldAccess().getFullStopKeyword_1_1());
                    			
                    // InternalEsper2Maude.g:2060:4: ( (lv_eventPropName_3_0= RULE_ID ) )
                    // InternalEsper2Maude.g:2061:5: (lv_eventPropName_3_0= RULE_ID )
                    {
                    // InternalEsper2Maude.g:2061:5: (lv_eventPropName_3_0= RULE_ID )
                    // InternalEsper2Maude.g:2062:6: lv_eventPropName_3_0= RULE_ID
                    {
                    lv_eventPropName_3_0=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(lv_eventPropName_3_0, grammarAccess.getFieldAccess().getEventPropNameIDTerminalRuleCall_1_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getFieldRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"eventPropName",
                    							lv_eventPropName_3_0,
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

    // Delegated rules


    protected DFA5 dfa5 = new DFA5(this);
    protected DFA13 dfa13 = new DFA13(this);
    static final String dfa_1s = "\22\uffff";
    static final String dfa_2s = "\1\4\1\20\1\33\1\17\1\4\2\uffff\2\4\2\20\1\21\1\33\1\20\2\4\1\21\1\20";
    static final String dfa_3s = "\1\57\1\56\1\33\1\17\1\4\2\uffff\1\4\1\57\1\27\1\56\1\21\1\33\1\56\2\4\1\21\1\27";
    static final String dfa_4s = "\5\uffff\1\1\1\2\13\uffff";
    static final String dfa_5s = "\22\uffff}>";
    static final String[] dfa_6s = {
            "\1\2\3\uffff\1\3\46\uffff\1\1",
            "\1\5\6\uffff\1\6\26\uffff\1\4",
            "\1\7",
            "\1\10",
            "\1\11",
            "",
            "",
            "\1\12",
            "\1\14\52\uffff\1\13",
            "\1\5\6\uffff\1\6",
            "\1\5\6\uffff\1\6\26\uffff\1\4",
            "\1\15",
            "\1\16",
            "\1\5\6\uffff\1\6\26\uffff\1\17",
            "\1\20",
            "\1\21",
            "\1\15",
            "\1\5\6\uffff\1\6"
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
            return "()* loopback of 379:3: ( (lv_selectEntries_12_0= ruleNonLastSelectEntry ) )*";
        }
    }
    static final String dfa_7s = "\52\uffff";
    static final String dfa_8s = "\6\uffff\1\12\13\uffff\1\12\22\uffff\1\12\4\uffff";
    static final String dfa_9s = "\1\4\1\uffff\2\4\1\17\1\uffff\1\17\3\4\1\uffff\1\17\1\33\1\7\1\33\3\41\1\17\11\4\1\7\1\21\1\7\4\21\2\41\1\21\1\4\1\7\2\21";
    static final String dfa_10s = "\1\40\1\uffff\1\46\1\17\1\55\1\uffff\1\55\2\46\1\4\1\uffff\1\42\1\55\1\7\5\55\10\46\1\4\1\7\1\33\1\7\1\33\3\21\3\55\1\4\1\7\2\21";
    static final String dfa_11s = "\1\uffff\1\1\3\uffff\1\2\4\uffff\1\3\37\uffff";
    static final String dfa_12s = "\52\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\12\uffff\1\2\20\uffff\1\3",
            "",
            "\1\4\1\uffff\2\1\7\uffff\1\5\20\uffff\1\5\3\uffff\3\1",
            "\1\6\12\uffff\1\1",
            "\1\5\13\uffff\1\1\5\uffff\1\7\1\5\4\uffff\7\1",
            "",
            "\1\10\1\uffff\1\12\10\uffff\1\12\6\uffff\1\11\1\1\11\uffff\2\12",
            "\1\13\1\uffff\2\1\34\uffff\3\1",
            "\1\14\1\uffff\1\17\1\16\34\uffff\1\15\1\20\1\21",
            "\1\22",
            "",
            "\1\5\1\uffff\1\1\11\uffff\1\1\6\uffff\1\5",
            "\1\33\5\uffff\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\16",
            "\1\34\5\uffff\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\10\1\uffff\1\12\10\uffff\1\12\7\uffff\1\1\11\uffff\2\12",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\35\1\uffff\1\40\1\37\34\uffff\1\36\1\41\1\42",
            "\1\43",
            "\1\44",
            "\1\45\11\uffff\1\46",
            "\1\37",
            "\1\45\11\uffff\1\47",
            "\1\45",
            "\1\45",
            "\1\45",
            "\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\25\5\uffff\1\23\1\24\1\26\1\27\1\30\1\31\1\32",
            "\1\12\10\uffff\1\12\7\uffff\1\1\11\uffff\2\12",
            "\1\50",
            "\1\51",
            "\1\45",
            "\1\45"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "752:2: ( ( (lv_followedBy_0_0= ruleFollowedBy ) ) | (otherlv_1= '(' ( (lv_left_2_0= ruleFilterFrom ) ) ( (lv_op_3_0= ruleLogicalOperator ) ) ( (lv_right_4_0= ruleFilterFrom ) ) otherlv_5= ')' ) | (otherlv_6= 'every' ( ( (lv_eventVariable_7_0= RULE_ID ) ) otherlv_8= '=' )? ( (lv_eventName_9_0= RULE_ID ) ) (otherlv_10= '(' ( (lv_filter_11_0= ruleFilterEvent ) ) otherlv_12= ')' )? ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000042002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000800000000110L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000100008010L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000050000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00003F8200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x00003F8280000002L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x00003F8200000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00000070000000D0L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x00003FF2800000D0L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000800000000010L});

}