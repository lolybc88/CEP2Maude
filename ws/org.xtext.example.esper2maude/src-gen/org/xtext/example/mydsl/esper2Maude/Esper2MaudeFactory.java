/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage
 * @generated
 */
public interface Esper2MaudeFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  Esper2MaudeFactory eINSTANCE = org.xtext.example.mydsl.esper2Maude.impl.Esper2MaudeFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Schema</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Schema</em>'.
   * @generated
   */
  Schema createSchema();

  /**
   * Returns a new object of class '<em>Event Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event Property</em>'.
   * @generated
   */
  EventProperty createEventProperty();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Window</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Window</em>'.
   * @generated
   */
  Window createWindow();

  /**
   * Returns a new object of class '<em>Where Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where Filter</em>'.
   * @generated
   */
  WhereFilter createWhereFilter();

  /**
   * Returns a new object of class '<em>Filter From</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter From</em>'.
   * @generated
   */
  FilterFrom createFilterFrom();

  /**
   * Returns a new object of class '<em>Followed By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Followed By</em>'.
   * @generated
   */
  FollowedBy createFollowedBy();

  /**
   * Returns a new object of class '<em>Sub Filter Followed By</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Filter Followed By</em>'.
   * @generated
   */
  SubFilterFollowedBy createSubFilterFollowedBy();

  /**
   * Returns a new object of class '<em>Every</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Every</em>'.
   * @generated
   */
  Every createEvery();

  /**
   * Returns a new object of class '<em>Filter Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Event</em>'.
   * @generated
   */
  FilterEvent createFilterEvent();

  /**
   * Returns a new object of class '<em>Filter Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Part</em>'.
   * @generated
   */
  FilterPart createFilterPart();

  /**
   * Returns a new object of class '<em>Filter Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Operator</em>'.
   * @generated
   */
  FilterOperator createFilterOperator();

  /**
   * Returns a new object of class '<em>Comparison Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison Operator</em>'.
   * @generated
   */
  ComparisonOperator createComparisonOperator();

  /**
   * Returns a new object of class '<em>Logical Operator</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Logical Operator</em>'.
   * @generated
   */
  LogicalOperator createLogicalOperator();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Non Last Select Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Non Last Select Entry</em>'.
   * @generated
   */
  NonLastSelectEntry createNonLastSelectEntry();

  /**
   * Returns a new object of class '<em>Last Select Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Last Select Entry</em>'.
   * @generated
   */
  LastSelectEntry createLastSelectEntry();

  /**
   * Returns a new object of class '<em>Select Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Select Entry</em>'.
   * @generated
   */
  SelectEntry createSelectEntry();

  /**
   * Returns a new object of class '<em>Field</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field</em>'.
   * @generated
   */
  Field createField();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  Esper2MaudePackage getEsper2MaudePackage();

} //Esper2MaudeFactory
