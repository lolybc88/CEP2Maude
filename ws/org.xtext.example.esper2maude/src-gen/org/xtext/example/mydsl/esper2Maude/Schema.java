/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.Schema#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.Schema#getProp <em>Prop</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.Schema#getProps <em>Props</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSchema_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.Schema#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Prop</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' containment reference.
   * @see #setProp(EventProperty)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSchema_Prop()
   * @model containment="true"
   * @generated
   */
  EventProperty getProp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.Schema#getProp <em>Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' containment reference.
   * @see #getProp()
   * @generated
   */
  void setProp(EventProperty value);

  /**
   * Returns the value of the '<em><b>Props</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.example.mydsl.esper2Maude.EventProperty}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Props</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Props</em>' containment reference list.
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSchema_Props()
   * @model containment="true"
   * @generated
   */
  EList<EventProperty> getProps();

} // Schema
