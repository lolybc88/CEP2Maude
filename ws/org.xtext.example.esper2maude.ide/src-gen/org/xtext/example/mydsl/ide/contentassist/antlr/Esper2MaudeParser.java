/*
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalEsper2MaudeParser;
import org.xtext.example.mydsl.services.Esper2MaudeGrammarAccess;

public class Esper2MaudeParser extends AbstractContentAssistParser {

	@Inject
	private Esper2MaudeGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalEsper2MaudeParser createParser() {
		InternalEsper2MaudeParser result = new InternalEsper2MaudeParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getWindowAccess().getAlternatives(), "rule__Window__Alternatives");
					put(grammarAccess.getFilterFromAccess().getAlternatives(), "rule__FilterFrom__Alternatives");
					put(grammarAccess.getSubFilterFollowedByAccess().getAlternatives(), "rule__SubFilterFollowedBy__Alternatives");
					put(grammarAccess.getEveryAccess().getAlternatives(), "rule__Every__Alternatives");
					put(grammarAccess.getFilterPartAccess().getAlternatives(), "rule__FilterPart__Alternatives");
					put(grammarAccess.getFilterOperatorAccess().getAlternatives(), "rule__FilterOperator__Alternatives");
					put(grammarAccess.getComparisonOperatorAccess().getAlternatives(), "rule__ComparisonOperator__Alternatives");
					put(grammarAccess.getLogicalOperatorAccess().getAlternatives(), "rule__LogicalOperator__Alternatives");
					put(grammarAccess.getSelectEntryAccess().getAlternatives(), "rule__SelectEntry__Alternatives");
					put(grammarAccess.getFieldAccess().getAlternatives(), "rule__Field__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getSchemaAccess().getGroup(), "rule__Schema__Group__0");
					put(grammarAccess.getSchemaAccess().getGroup_5(), "rule__Schema__Group_5__0");
					put(grammarAccess.getEventPropertyAccess().getGroup(), "rule__EventProperty__Group__0");
					put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
					put(grammarAccess.getPatternAccess().getGroup_19(), "rule__Pattern__Group_19__0");
					put(grammarAccess.getWindowAccess().getGroup_0(), "rule__Window__Group_0__0");
					put(grammarAccess.getWindowAccess().getGroup_1(), "rule__Window__Group_1__0");
					put(grammarAccess.getWhereFilterAccess().getGroup(), "rule__WhereFilter__Group__0");
					put(grammarAccess.getWhereFilterAccess().getGroup_0(), "rule__WhereFilter__Group_0__0");
					put(grammarAccess.getWhereFilterAccess().getGroup_1(), "rule__WhereFilter__Group_1__0");
					put(grammarAccess.getWhereFilterAccess().getGroup_2(), "rule__WhereFilter__Group_2__0");
					put(grammarAccess.getFilterFromAccess().getGroup_1(), "rule__FilterFrom__Group_1__0");
					put(grammarAccess.getFilterFromAccess().getGroup_2(), "rule__FilterFrom__Group_2__0");
					put(grammarAccess.getFilterFromAccess().getGroup_2_1(), "rule__FilterFrom__Group_2_1__0");
					put(grammarAccess.getFilterFromAccess().getGroup_2_3(), "rule__FilterFrom__Group_2_3__0");
					put(grammarAccess.getFollowedByAccess().getGroup(), "rule__FollowedBy__Group__0");
					put(grammarAccess.getFollowedByAccess().getGroup_3(), "rule__FollowedBy__Group_3__0");
					put(grammarAccess.getSubFilterFollowedByAccess().getGroup_0(), "rule__SubFilterFollowedBy__Group_0__0");
					put(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_0(), "rule__SubFilterFollowedBy__Group_0_0__0");
					put(grammarAccess.getSubFilterFollowedByAccess().getGroup_0_2(), "rule__SubFilterFollowedBy__Group_0_2__0");
					put(grammarAccess.getSubFilterFollowedByAccess().getGroup_1(), "rule__SubFilterFollowedBy__Group_1__0");
					put(grammarAccess.getEveryAccess().getGroup_0(), "rule__Every__Group_0__0");
					put(grammarAccess.getEveryAccess().getGroup_0_1(), "rule__Every__Group_0_1__0");
					put(grammarAccess.getEveryAccess().getGroup_0_3(), "rule__Every__Group_0_3__0");
					put(grammarAccess.getEveryAccess().getGroup_1(), "rule__Every__Group_1__0");
					put(grammarAccess.getFilterEventAccess().getGroup(), "rule__FilterEvent__Group__0");
					put(grammarAccess.getFilterPartAccess().getGroup_1(), "rule__FilterPart__Group_1__0");
					put(grammarAccess.getFilterPartAccess().getGroup_2(), "rule__FilterPart__Group_2__0");
					put(grammarAccess.getFilterPartAccess().getGroup_2_2(), "rule__FilterPart__Group_2_2__0");
					put(grammarAccess.getNonLastSelectEntryAccess().getGroup(), "rule__NonLastSelectEntry__Group__0");
					put(grammarAccess.getSelectEntryAccess().getGroup_0(), "rule__SelectEntry__Group_0__0");
					put(grammarAccess.getSelectEntryAccess().getGroup_0_1(), "rule__SelectEntry__Group_0_1__0");
					put(grammarAccess.getSelectEntryAccess().getGroup_1(), "rule__SelectEntry__Group_1__0");
					put(grammarAccess.getSelectEntryAccess().getGroup_1_4(), "rule__SelectEntry__Group_1_4__0");
					put(grammarAccess.getFieldAccess().getGroup_1(), "rule__Field__Group_1__0");
					put(grammarAccess.getModelAccess().getSchemasAssignment_0(), "rule__Model__SchemasAssignment_0");
					put(grammarAccess.getModelAccess().getPatternsAssignment_1(), "rule__Model__PatternsAssignment_1");
					put(grammarAccess.getSchemaAccess().getNameAssignment_2(), "rule__Schema__NameAssignment_2");
					put(grammarAccess.getSchemaAccess().getPropAssignment_4(), "rule__Schema__PropAssignment_4");
					put(grammarAccess.getSchemaAccess().getPropsAssignment_5_1(), "rule__Schema__PropsAssignment_5_1");
					put(grammarAccess.getEventPropertyAccess().getNameAssignment_0(), "rule__EventProperty__NameAssignment_0");
					put(grammarAccess.getEventPropertyAccess().getTypeAssignment_1(), "rule__EventProperty__TypeAssignment_1");
					put(grammarAccess.getPatternAccess().getNameAssignment_2(), "rule__Pattern__NameAssignment_2");
					put(grammarAccess.getPatternAccess().getNumAssignment_6(), "rule__Pattern__NumAssignment_6");
					put(grammarAccess.getPatternAccess().getEventAssignment_10(), "rule__Pattern__EventAssignment_10");
					put(grammarAccess.getPatternAccess().getSelectEntriesAssignment_12(), "rule__Pattern__SelectEntriesAssignment_12");
					put(grammarAccess.getPatternAccess().getSelectEntryAssignment_13(), "rule__Pattern__SelectEntryAssignment_13");
					put(grammarAccess.getPatternAccess().getFromFilterAssignment_17(), "rule__Pattern__FromFilterAssignment_17");
					put(grammarAccess.getPatternAccess().getWinAssignment_19_1(), "rule__Pattern__WinAssignment_19_1");
					put(grammarAccess.getWindowAccess().getTypeTimeAssignment_0_0(), "rule__Window__TypeTimeAssignment_0_0");
					put(grammarAccess.getWindowAccess().getNumAssignment_0_2(), "rule__Window__NumAssignment_0_2");
					put(grammarAccess.getWindowAccess().getTypeBatchAssignment_1_0(), "rule__Window__TypeBatchAssignment_1_0");
					put(grammarAccess.getWindowAccess().getNumAssignment_1_2(), "rule__Window__NumAssignment_1_2");
					put(grammarAccess.getWhereFilterAccess().getFilterEventLAssignment_0_0(), "rule__WhereFilter__FilterEventLAssignment_0_0");
					put(grammarAccess.getWhereFilterAccess().getFilterOpLAssignment_0_1(), "rule__WhereFilter__FilterOpLAssignment_0_1");
					put(grammarAccess.getWhereFilterAccess().getTimerAssignment_1_0(), "rule__WhereFilter__TimerAssignment_1_0");
					put(grammarAccess.getWhereFilterAccess().getNumAssignment_1_2(), "rule__WhereFilter__NumAssignment_1_2");
					put(grammarAccess.getWhereFilterAccess().getFilterOpRAssignment_2_0(), "rule__WhereFilter__FilterOpRAssignment_2_0");
					put(grammarAccess.getWhereFilterAccess().getFilterEventRAssignment_2_1(), "rule__WhereFilter__FilterEventRAssignment_2_1");
					put(grammarAccess.getFilterFromAccess().getFollowedByAssignment_0(), "rule__FilterFrom__FollowedByAssignment_0");
					put(grammarAccess.getFilterFromAccess().getLeftAssignment_1_1(), "rule__FilterFrom__LeftAssignment_1_1");
					put(grammarAccess.getFilterFromAccess().getOpAssignment_1_2(), "rule__FilterFrom__OpAssignment_1_2");
					put(grammarAccess.getFilterFromAccess().getRightAssignment_1_3(), "rule__FilterFrom__RightAssignment_1_3");
					put(grammarAccess.getFilterFromAccess().getEventVariableAssignment_2_1_0(), "rule__FilterFrom__EventVariableAssignment_2_1_0");
					put(grammarAccess.getFilterFromAccess().getEventNameAssignment_2_2(), "rule__FilterFrom__EventNameAssignment_2_2");
					put(grammarAccess.getFilterFromAccess().getFilterAssignment_2_3_1(), "rule__FilterFrom__FilterAssignment_2_3_1");
					put(grammarAccess.getFollowedByAccess().getLeftAssignment_0(), "rule__FollowedBy__LeftAssignment_0");
					put(grammarAccess.getFollowedByAccess().getRightAssignment_2(), "rule__FollowedBy__RightAssignment_2");
					put(grammarAccess.getFollowedByAccess().getWhereFilterAssignment_3_1(), "rule__FollowedBy__WhereFilterAssignment_3_1");
					put(grammarAccess.getSubFilterFollowedByAccess().getEventVariableAssignment_0_0_0(), "rule__SubFilterFollowedBy__EventVariableAssignment_0_0_0");
					put(grammarAccess.getSubFilterFollowedByAccess().getEventNameAssignment_0_1(), "rule__SubFilterFollowedBy__EventNameAssignment_0_1");
					put(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_0_2_1(), "rule__SubFilterFollowedBy__FilterAssignment_0_2_1");
					put(grammarAccess.getSubFilterFollowedByAccess().getFilterAssignment_1_1(), "rule__SubFilterFollowedBy__FilterAssignment_1_1");
					put(grammarAccess.getSubFilterFollowedByAccess().getEveryAssignment_2(), "rule__SubFilterFollowedBy__EveryAssignment_2");
					put(grammarAccess.getEveryAccess().getEventVariableAssignment_0_1_0(), "rule__Every__EventVariableAssignment_0_1_0");
					put(grammarAccess.getEveryAccess().getEventNameAssignment_0_2(), "rule__Every__EventNameAssignment_0_2");
					put(grammarAccess.getEveryAccess().getFilterAssignment_0_3_1(), "rule__Every__FilterAssignment_0_3_1");
					put(grammarAccess.getEveryAccess().getFilterFromAssignment_1_2(), "rule__Every__FilterFromAssignment_1_2");
					put(grammarAccess.getFilterEventAccess().getFilterLeftHandSideAssignment_0(), "rule__FilterEvent__FilterLeftHandSideAssignment_0");
					put(grammarAccess.getFilterEventAccess().getFilterOpAssignment_1(), "rule__FilterEvent__FilterOpAssignment_1");
					put(grammarAccess.getFilterEventAccess().getFilterRightHandSideAssignment_2(), "rule__FilterEvent__FilterRightHandSideAssignment_2");
					put(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_0(), "rule__FilterPart__EventPropNameAssignment_0");
					put(grammarAccess.getFilterPartAccess().getEventVariableAssignment_1_0(), "rule__FilterPart__EventVariableAssignment_1_0");
					put(grammarAccess.getFilterPartAccess().getEventPropNameAssignment_1_2(), "rule__FilterPart__EventPropNameAssignment_1_2");
					put(grammarAccess.getFilterPartAccess().getNegAssignment_2_0(), "rule__FilterPart__NegAssignment_2_0");
					put(grammarAccess.getFilterPartAccess().getNumAssignment_2_1(), "rule__FilterPart__NumAssignment_2_1");
					put(grammarAccess.getFilterPartAccess().getDecAssignment_2_2_1(), "rule__FilterPart__DecAssignment_2_2_1");
					put(grammarAccess.getFilterPartAccess().getStrAssignment_3(), "rule__FilterPart__StrAssignment_3");
					put(grammarAccess.getFilterPartAccess().getTAssignment_4(), "rule__FilterPart__TAssignment_4");
					put(grammarAccess.getFilterPartAccess().getFAssignment_5(), "rule__FilterPart__FAssignment_5");
					put(grammarAccess.getFilterOperatorAccess().getComparisonAssignment_0(), "rule__FilterOperator__ComparisonAssignment_0");
					put(grammarAccess.getFilterOperatorAccess().getLogicalAssignment_1(), "rule__FilterOperator__LogicalAssignment_1");
					put(grammarAccess.getComparisonOperatorAccess().getGtAssignment_0(), "rule__ComparisonOperator__GtAssignment_0");
					put(grammarAccess.getComparisonOperatorAccess().getGeAssignment_1(), "rule__ComparisonOperator__GeAssignment_1");
					put(grammarAccess.getComparisonOperatorAccess().getEqAssignment_2(), "rule__ComparisonOperator__EqAssignment_2");
					put(grammarAccess.getComparisonOperatorAccess().getNeqAssignment_3(), "rule__ComparisonOperator__NeqAssignment_3");
					put(grammarAccess.getComparisonOperatorAccess().getLtAssignment_4(), "rule__ComparisonOperator__LtAssignment_4");
					put(grammarAccess.getComparisonOperatorAccess().getLeAssignment_5(), "rule__ComparisonOperator__LeAssignment_5");
					put(grammarAccess.getLogicalOperatorAccess().getAndAssignment_0(), "rule__LogicalOperator__AndAssignment_0");
					put(grammarAccess.getLogicalOperatorAccess().getOrAssignment_1(), "rule__LogicalOperator__OrAssignment_1");
					put(grammarAccess.getEventAccess().getNameAssignment(), "rule__Event__NameAssignment");
					put(grammarAccess.getNonLastSelectEntryAccess().getEntryAssignment_0(), "rule__NonLastSelectEntry__EntryAssignment_0");
					put(grammarAccess.getLastSelectEntryAccess().getEntryAssignment(), "rule__LastSelectEntry__EntryAssignment");
					put(grammarAccess.getSelectEntryAccess().getFieldAssignment_0_0(), "rule__SelectEntry__FieldAssignment_0_0");
					put(grammarAccess.getSelectEntryAccess().getAliasAssignment_0_1_1(), "rule__SelectEntry__AliasAssignment_0_1_1");
					put(grammarAccess.getSelectEntryAccess().getGroupOpAssignment_1_0(), "rule__SelectEntry__GroupOpAssignment_1_0");
					put(grammarAccess.getSelectEntryAccess().getFieldAssignment_1_2(), "rule__SelectEntry__FieldAssignment_1_2");
					put(grammarAccess.getSelectEntryAccess().getAliasAssignment_1_4_1(), "rule__SelectEntry__AliasAssignment_1_4_1");
					put(grammarAccess.getFieldAccess().getStarAssignment_0(), "rule__Field__StarAssignment_0");
					put(grammarAccess.getFieldAccess().getEventVariableAssignment_1_0(), "rule__Field__EventVariableAssignment_1_0");
					put(grammarAccess.getFieldAccess().getEventPropNameAssignment_1_2(), "rule__Field__EventPropNameAssignment_1_2");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalEsper2MaudeParser typedParser = (InternalEsper2MaudeParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public Esper2MaudeGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Esper2MaudeGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
