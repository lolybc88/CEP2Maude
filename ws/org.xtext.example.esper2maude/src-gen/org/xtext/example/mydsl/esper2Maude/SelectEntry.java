/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Select Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getField <em>Field</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getGroupOp <em>Group Op</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSelectEntry()
 * @model
 * @generated
 */
public interface SelectEntry extends EObject
{
  /**
   * Returns the value of the '<em><b>Field</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field</em>' containment reference.
   * @see #setField(Field)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSelectEntry_Field()
   * @model containment="true"
   * @generated
   */
  Field getField();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getField <em>Field</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field</em>' containment reference.
   * @see #getField()
   * @generated
   */
  void setField(Field value);

  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSelectEntry_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Group Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Group Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Op</em>' attribute.
   * @see #setGroupOp(String)
   * @see org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage#getSelectEntry_GroupOp()
   * @model
   * @generated
   */
  String getGroupOp();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.esper2Maude.SelectEntry#getGroupOp <em>Group Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Group Op</em>' attribute.
   * @see #getGroupOp()
   * @generated
   */
  void setGroupOp(String value);

} // SelectEntry
