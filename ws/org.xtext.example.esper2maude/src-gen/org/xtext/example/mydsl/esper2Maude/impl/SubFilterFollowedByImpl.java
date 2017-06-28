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
import org.xtext.example.mydsl.esper2Maude.Every;
import org.xtext.example.mydsl.esper2Maude.FilterEvent;
import org.xtext.example.mydsl.esper2Maude.SubFilterFollowedBy;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Filter Followed By</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.SubFilterFollowedByImpl#getEventVariable <em>Event Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.SubFilterFollowedByImpl#getEventName <em>Event Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.SubFilterFollowedByImpl#getFilter <em>Filter</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.SubFilterFollowedByImpl#getEvery <em>Every</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SubFilterFollowedByImpl extends MinimalEObjectImpl.Container implements SubFilterFollowedBy
{
  /**
   * The default value of the '{@link #getEventVariable() <em>Event Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventVariable()
   * @generated
   * @ordered
   */
  protected static final String EVENT_VARIABLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventVariable() <em>Event Variable</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventVariable()
   * @generated
   * @ordered
   */
  protected String eventVariable = EVENT_VARIABLE_EDEFAULT;

  /**
   * The default value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected static final String EVENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventName() <em>Event Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventName()
   * @generated
   * @ordered
   */
  protected String eventName = EVENT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getFilter() <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFilter()
   * @generated
   * @ordered
   */
  protected FilterEvent filter;

  /**
   * The cached value of the '{@link #getEvery() <em>Every</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvery()
   * @generated
   * @ordered
   */
  protected Every every;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SubFilterFollowedByImpl()
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
    return Esper2MaudePackage.Literals.SUB_FILTER_FOLLOWED_BY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventVariable()
  {
    return eventVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventVariable(String newEventVariable)
  {
    String oldEventVariable = eventVariable;
    eventVariable = newEventVariable;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_VARIABLE, oldEventVariable, eventVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventName()
  {
    return eventName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventName(String newEventName)
  {
    String oldEventName = eventName;
    eventName = newEventName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_NAME, oldEventName, eventName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FilterEvent getFilter()
  {
    return filter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFilter(FilterEvent newFilter, NotificationChain msgs)
  {
    FilterEvent oldFilter = filter;
    filter = newFilter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER, oldFilter, newFilter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFilter(FilterEvent newFilter)
  {
    if (newFilter != filter)
    {
      NotificationChain msgs = null;
      if (filter != null)
        msgs = ((InternalEObject)filter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER, null, msgs);
      if (newFilter != null)
        msgs = ((InternalEObject)newFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER, null, msgs);
      msgs = basicSetFilter(newFilter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER, newFilter, newFilter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Every getEvery()
  {
    return every;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEvery(Every newEvery, NotificationChain msgs)
  {
    Every oldEvery = every;
    every = newEvery;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY, oldEvery, newEvery);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvery(Every newEvery)
  {
    if (newEvery != every)
    {
      NotificationChain msgs = null;
      if (every != null)
        msgs = ((InternalEObject)every).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY, null, msgs);
      if (newEvery != null)
        msgs = ((InternalEObject)newEvery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY, null, msgs);
      msgs = basicSetEvery(newEvery, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY, newEvery, newEvery));
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
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER:
        return basicSetFilter(null, msgs);
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY:
        return basicSetEvery(null, msgs);
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
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_VARIABLE:
        return getEventVariable();
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_NAME:
        return getEventName();
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER:
        return getFilter();
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY:
        return getEvery();
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
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_VARIABLE:
        setEventVariable((String)newValue);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_NAME:
        setEventName((String)newValue);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER:
        setFilter((FilterEvent)newValue);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY:
        setEvery((Every)newValue);
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
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_VARIABLE:
        setEventVariable(EVENT_VARIABLE_EDEFAULT);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_NAME:
        setEventName(EVENT_NAME_EDEFAULT);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER:
        setFilter((FilterEvent)null);
        return;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY:
        setEvery((Every)null);
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
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_VARIABLE:
        return EVENT_VARIABLE_EDEFAULT == null ? eventVariable != null : !EVENT_VARIABLE_EDEFAULT.equals(eventVariable);
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVENT_NAME:
        return EVENT_NAME_EDEFAULT == null ? eventName != null : !EVENT_NAME_EDEFAULT.equals(eventName);
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__FILTER:
        return filter != null;
      case Esper2MaudePackage.SUB_FILTER_FOLLOWED_BY__EVERY:
        return every != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (eventVariable: ");
    result.append(eventVariable);
    result.append(", eventName: ");
    result.append(eventName);
    result.append(')');
    return result.toString();
  }

} //SubFilterFollowedByImpl
