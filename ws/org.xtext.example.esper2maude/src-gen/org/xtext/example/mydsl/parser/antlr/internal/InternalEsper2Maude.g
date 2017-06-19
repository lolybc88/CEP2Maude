/*
 * generated by Xtext 2.10.0
 */
grammar InternalEsper2Maude;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.example.mydsl.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleModel
entryRuleModel returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getModelRule()); }
	iv_ruleModel=ruleModel
	{ $current=$iv_ruleModel.current; }
	EOF;

// Rule Model
ruleModel returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getModelAccess().getPatternsPatternParserRuleCall_0());
			}
			lv_patterns_0_0=rulePattern
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getModelRule());
				}
				add(
					$current,
					"patterns",
					lv_patterns_0_0,
					"org.xtext.example.mydsl.Esper2Maude.Pattern");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRulePattern
entryRulePattern returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getPatternRule()); }
	iv_rulePattern=rulePattern
	{ $current=$iv_rulePattern.current; }
	EOF;

// Rule Pattern
rulePattern returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='@Name('
		{
			newLeafNode(otherlv_0, grammarAccess.getPatternAccess().getNameKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_STRING
				{
					newLeafNode(lv_name_1_0, grammarAccess.getPatternAccess().getNameSTRINGTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPatternRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.STRING");
				}
			)
		)
		otherlv_2=')'
		{
			newLeafNode(otherlv_2, grammarAccess.getPatternAccess().getRightParenthesisKeyword_2());
		}
		otherlv_3='insert into'
		{
			newLeafNode(otherlv_3, grammarAccess.getPatternAccess().getInsertIntoKeyword_3());
		}
		(
			(
				lv_event_4_0=RULE_ID
				{
					newLeafNode(lv_event_4_0, grammarAccess.getPatternAccess().getEventIDTerminalRuleCall_4_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getPatternRule());
					}
					setWithLastConsumed(
						$current,
						"event",
						lv_event_4_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_5='select'
		{
			newLeafNode(otherlv_5, grammarAccess.getPatternAccess().getSelectKeyword_5());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntriesNonLastSelectEntryParserRuleCall_6_0());
				}
				lv_selectEntries_6_0=ruleNonLastSelectEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					add(
						$current,
						"selectEntries",
						lv_selectEntries_6_0,
						"org.xtext.example.mydsl.Esper2Maude.NonLastSelectEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		(
			(
				{
					newCompositeNode(grammarAccess.getPatternAccess().getSelectEntryLastSelectEntryParserRuleCall_7_0());
				}
				lv_selectEntry_7_0=ruleLastSelectEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getPatternRule());
					}
					set(
						$current,
						"selectEntry",
						lv_selectEntry_7_0,
						"org.xtext.example.mydsl.Esper2Maude.LastSelectEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_8='from'
		{
			newLeafNode(otherlv_8, grammarAccess.getPatternAccess().getFromKeyword_8());
		}
		(
			otherlv_9='group by'
			{
				newLeafNode(otherlv_9, grammarAccess.getPatternAccess().getGroupByKeyword_9());
			}
		)?
	)
;

// Entry rule entryRuleNonLastSelectEntry
entryRuleNonLastSelectEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getNonLastSelectEntryRule()); }
	iv_ruleNonLastSelectEntry=ruleNonLastSelectEntry
	{ $current=$iv_ruleNonLastSelectEntry.current; }
	EOF;

// Rule NonLastSelectEntry
ruleNonLastSelectEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getNonLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0_0());
				}
				lv_entry_0_0=ruleSelectEntry
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getNonLastSelectEntryRule());
					}
					set(
						$current,
						"entry",
						lv_entry_0_0,
						"org.xtext.example.mydsl.Esper2Maude.SelectEntry");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1=','
		{
			newLeafNode(otherlv_1, grammarAccess.getNonLastSelectEntryAccess().getCommaKeyword_1());
		}
	)
;

// Entry rule entryRuleLastSelectEntry
entryRuleLastSelectEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getLastSelectEntryRule()); }
	iv_ruleLastSelectEntry=ruleLastSelectEntry
	{ $current=$iv_ruleLastSelectEntry.current; }
	EOF;

// Rule LastSelectEntry
ruleLastSelectEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getLastSelectEntryAccess().getEntrySelectEntryParserRuleCall_0());
			}
			lv_entry_0_0=ruleSelectEntry
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getLastSelectEntryRule());
				}
				set(
					$current,
					"entry",
					lv_entry_0_0,
					"org.xtext.example.mydsl.Esper2Maude.SelectEntry");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleSelectEntry
entryRuleSelectEntry returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectEntryRule()); }
	iv_ruleSelectEntry=ruleSelectEntry
	{ $current=$iv_ruleSelectEntry.current; }
	EOF;

// Rule SelectEntry
ruleSelectEntry returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_0_0_0());
					}
					lv_field_0_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectEntryRule());
						}
						set(
							$current,
							"field",
							lv_field_0_0,
							"org.xtext.example.mydsl.Esper2Maude.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			(
				otherlv_1='as'
				{
					newLeafNode(otherlv_1, grammarAccess.getSelectEntryAccess().getAsKeyword_0_1_0());
				}
				(
					(
						lv_alias_2_0=RULE_ID
						{
							newLeafNode(lv_alias_2_0, grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_0_1_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelectEntryRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_2_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)?
		)
		    |
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectEntryAccess().getGroupOpGroupOpParserRuleCall_1_0_0());
					}
					lv_groupOp_3_0=ruleGroupOp
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectEntryRule());
						}
						set(
							$current,
							"groupOp",
							lv_groupOp_3_0,
							"org.xtext.example.mydsl.Esper2Maude.GroupOp");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_4='('
			{
				newLeafNode(otherlv_4, grammarAccess.getSelectEntryAccess().getLeftParenthesisKeyword_1_1());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getSelectEntryAccess().getFieldFieldParserRuleCall_1_2_0());
					}
					lv_field_5_0=ruleField
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getSelectEntryRule());
						}
						set(
							$current,
							"field",
							lv_field_5_0,
							"org.xtext.example.mydsl.Esper2Maude.Field");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_6=')'
			{
				newLeafNode(otherlv_6, grammarAccess.getSelectEntryAccess().getRightParenthesisKeyword_1_3());
			}
			(
				otherlv_7='as'
				{
					newLeafNode(otherlv_7, grammarAccess.getSelectEntryAccess().getAsKeyword_1_4_0());
				}
				(
					(
						lv_alias_8_0=RULE_ID
						{
							newLeafNode(lv_alias_8_0, grammarAccess.getSelectEntryAccess().getAliasIDTerminalRuleCall_1_4_1_0());
						}
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getSelectEntryRule());
							}
							setWithLastConsumed(
								$current,
								"alias",
								lv_alias_8_0,
								"org.eclipse.xtext.common.Terminals.ID");
						}
					)
				)
			)?
		)
	)
;

// Entry rule entryRuleField
entryRuleField returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFieldRule()); }
	iv_ruleField=ruleField
	{ $current=$iv_ruleField.current; }
	EOF;

// Rule Field
ruleField returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='*'
		{
			newLeafNode(otherlv_0, grammarAccess.getFieldAccess().getAsteriskKeyword_0());
		}
		    |
		(
			otherlv_1='e.'
			{
				newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getEKeyword_1_0());
			}
			(
				(
					lv_name_2_0=RULE_ID
					{
						newLeafNode(lv_name_2_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_1_1_0());
					}
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getFieldRule());
						}
						setWithLastConsumed(
							$current,
							"name",
							lv_name_2_0,
							"org.eclipse.xtext.common.Terminals.ID");
					}
				)
			)
		)
	)
;

// Entry rule entryRuleGroupOp
entryRuleGroupOp returns [String current=null]:
	{ newCompositeNode(grammarAccess.getGroupOpRule()); }
	iv_ruleGroupOp=ruleGroupOp
	{ $current=$iv_ruleGroupOp.current.getText(); }
	EOF;

// Rule GroupOp
ruleGroupOp returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		kw='count'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupOpAccess().getCountKeyword_0());
		}
		    |
		kw='max'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupOpAccess().getMaxKeyword_1());
		}
		    |
		kw='min'
		{
			$current.merge(kw);
			newLeafNode(kw, grammarAccess.getGroupOpAccess().getMinKeyword_2());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;