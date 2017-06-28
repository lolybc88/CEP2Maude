/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage;
import org.xtext.example.mydsl.esper2Maude.FilterEvent;
import org.xtext.example.mydsl.esper2Maude.FilterOperator;
import org.xtext.example.mydsl.esper2Maude.FilterPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterEventImpl#getFilterLeftHandSide <em>Filter Left Hand Side</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterEventImpl#getFilterOp <em>Filter Op</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterEventImpl#getFilterRightHandSide <em>Filter Right Hand Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterEventImpl extends MinimalEObjectImpl.Container implements FilterEvent
{
  /**
   * The cached value of the '{@link #getFilterLeftHandSide() <em>Filter Left Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterLeftHandSide()
   * @generated
   * @ordered
   */
  protected FilterPart filterLeftHandSide;

  /**
   * The cached value of the '{@link #getFilterOp() <em>Filter Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterOp()
   * @generated
   * @ordered
   */
  protected FilterOperator filterOp;

  /**
   * The cached value of the '{@link #getFilterRightHandSide() <em>Filter Right Hand Side</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilterRightHandSide()
   * @generated
   * @ordered
   */
  protected FilterPart filterRightHandSide;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterEventImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return Esper2MaudePackage.Literals.FILTER_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterPart getFilterLeftHandSide()
  {
    return filterLeftHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterLeftHandSide(FilterPart newFilterLeftHandSide, NotificationChain msgs)
  {
    FilterPart oldFilterLeftHandSide = filterLeftHandSide;
    filterLeftHandSide = newFilterLeftHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE, oldFilterLeftHandSide, newFilterLeftHandSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilterLeftHandSide(FilterPart newFilterLeftHandSide)
  {
    if (newFilterLeftHandSide != filterLeftHandSide)
    {
      NotificationChain msgs = null;
      if (filterLeftHandSide != null)
        msgs = ((InternalEObject)filterLeftHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE, null, msgs);
      if (newFilterLeftHandSide != null)
        msgs = ((InternalEObject)newFilterLeftHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE, null, msgs);
      msgs = basicSetFilterLeftHandSide(newFilterLeftHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE, newFilterLeftHandSide, newFilterLeftHandSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterOperator getFilterOp()
  {
    return filterOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterOp(FilterOperator newFilterOp, NotificationChain msgs)
  {
    FilterOperator oldFilterOp = filterOp;
    filterOp = newFilterOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_OP, oldFilterOp, newFilterOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilterOp(FilterOperator newFilterOp)
  {
    if (newFilterOp != filterOp)
    {
      NotificationChain msgs = null;
      if (filterOp != null)
        msgs = ((InternalEObject)filterOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_OP, null, msgs);
      if (newFilterOp != null)
        msgs = ((InternalEObject)newFilterOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_OP, null, msgs);
      msgs = basicSetFilterOp(newFilterOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_OP, newFilterOp, newFilterOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterPart getFilterRightHandSide()
  {
    return filterRightHandSide;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilterRightHandSide(FilterPart newFilterRightHandSide, NotificationChain msgs)
  {
    FilterPart oldFilterRightHandSide = filterRightHandSide;
    filterRightHandSide = newFilterRightHandSide;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE, oldFilterRightHandSide, newFilterRightHandSide);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilterRightHandSide(FilterPart newFilterRightHandSide)
  {
    if (newFilterRightHandSide != filterRightHandSide)
    {
      NotificationChain msgs = null;
      if (filterRightHandSide != null)
        msgs = ((InternalEObject)filterRightHandSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE, null, msgs);
      if (newFilterRightHandSide != null)
        msgs = ((InternalEObject)newFilterRightHandSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE, null, msgs);
      msgs = basicSetFilterRightHandSide(newFilterRightHandSide, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE, newFilterRightHandSide, newFilterRightHandSide));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE:
        return basicSetFilterLeftHandSide(null, msgs);
      case Esper2MaudePackage.FILTER_EVENT__FILTER_OP:
        return basicSetFilterOp(null, msgs);
      case Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE:
        return basicSetFilterRightHandSide(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE:
        return getFilterLeftHandSide();
      case Esper2MaudePackage.FILTER_EVENT__FILTER_OP:
        return getFilterOp();
      case Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE:
        return getFilterRightHandSide();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE:
        setFilterLeftHandSide((FilterPart)newValue);
        return;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_OP:
        setFilterOp((FilterOperator)newValue);
        return;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE:
        setFilterRightHandSide((FilterPart)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE:
        setFilterLeftHandSide((FilterPart)null);
        return;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_OP:
        setFilterOp((FilterOperator)null);
        return;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE:
        setFilterRightHandSide((FilterPart)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case Esper2MaudePackage.FILTER_EVENT__FILTER_LEFT_HAND_SIDE:
        return filterLeftHandSide != null;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_OP:
        return filterOp != null;
      case Esper2MaudePackage.FILTER_EVENT__FILTER_RIGHT_HAND_SIDE:
        return filterRightHandSide != null;
    }
    return super.eIsSet(featureID);
  }

} //FilterEventImpl
