/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterLeftHandSide <em>Filter Left Hand Side</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterOp <em>Filter Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterRightHandSide <em>Filter Right Hand Side</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getFilterEvent()
 * @model
 * @generated
 */
public interface FilterEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Filter Left Hand Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter Left Hand Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Left Hand Side</em>' containment reference.
   * @see #setFilterLeftHandSide(FilterPart)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getFilterEvent_FilterLeftHandSide()
   * @model containment="true"
   * @generated
   */
  FilterPart getFilterLeftHandSide();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterLeftHandSide <em>Filter Left Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Left Hand Side</em>' containment reference.
   * @see #getFilterLeftHandSide()
   * @generated
   */
  void setFilterLeftHandSide(FilterPart value);

  /**
   * Returns the value of the '<em><b>Filter Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Op</em>' containment reference.
   * @see #setFilterOp(FilterOperator)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getFilterEvent_FilterOp()
   * @model containment="true"
   * @generated
   */
  FilterOperator getFilterOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterOp <em>Filter Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Op</em>' containment reference.
   * @see #getFilterOp()
   * @generated
   */
  void setFilterOp(FilterOperator value);

  /**
   * Returns the value of the '<em><b>Filter Right Hand Side</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter Right Hand Side</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter Right Hand Side</em>' containment reference.
   * @see #setFilterRightHandSide(FilterPart)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getFilterEvent_FilterRightHandSide()
   * @model containment="true"
   * @generated
   */
  FilterPart getFilterRightHandSide();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.FilterEvent#getFilterRightHandSide <em>Filter Right Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter Right Hand Side</em>' containment reference.
   * @see #getFilterRightHandSide()
   * @generated
   */
  void setFilterRightHandSide(FilterPart value);

} // FilterEvent