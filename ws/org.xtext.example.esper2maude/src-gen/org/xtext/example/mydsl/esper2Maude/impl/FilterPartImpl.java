/**
 * generated by Xtext 2.10.0
 */
package org.xtext.example.mydsl.esper2Maude.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.mydsl.esper2Maude.Esper2MaudePackage;
import org.xtext.example.mydsl.esper2Maude.FilterPart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Part</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getEventPropName <em>Event Prop Name</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getEventVariable <em>Event Variable</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getNeg <em>Neg</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getNum <em>Num</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getDec <em>Dec</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getStr <em>Str</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getT <em>T</em>}</li>
 *   <li>{@link org.xtext.example.mydsl.esper2Maude.impl.FilterPartImpl#getF <em>F</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FilterPartImpl extends MinimalEObjectImpl.Container implements FilterPart
{
  /**
   * The default value of the '{@link #getEventPropName() <em>Event Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventPropName()
   * @generated
   * @ordered
   */
  protected static final String EVENT_PROP_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getEventPropName() <em>Event Prop Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventPropName()
   * @generated
   * @ordered
   */
  protected String eventPropName = EVENT_PROP_NAME_EDEFAULT;

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
   * The default value of the '{@link #getNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeg()
   * @generated
   * @ordered
   */
  protected static final String NEG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNeg() <em>Neg</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeg()
   * @generated
   * @ordered
   */
  protected String neg = NEG_EDEFAULT;

  /**
   * The default value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected static final int NUM_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNum() <em>Num</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNum()
   * @generated
   * @ordered
   */
  protected int num = NUM_EDEFAULT;

  /**
   * The default value of the '{@link #getDec() <em>Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected static final int DEC_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDec() <em>Dec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDec()
   * @generated
   * @ordered
   */
  protected int dec = DEC_EDEFAULT;

  /**
   * The default value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected static final String STR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStr() <em>Str</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStr()
   * @generated
   * @ordered
   */
  protected String str = STR_EDEFAULT;

  /**
   * The default value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected static final String T_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getT() <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getT()
   * @generated
   * @ordered
   */
  protected String t = T_EDEFAULT;

  /**
   * The default value of the '{@link #getF() <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected static final String F_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getF() <em>F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getF()
   * @generated
   * @ordered
   */
  protected String f = F_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FilterPartImpl()
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
    return Esper2MaudePackage.Literals.FILTER_PART;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getEventPropName()
  {
    return eventPropName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventPropName(String newEventPropName)
  {
    String oldEventPropName = eventPropName;
    eventPropName = newEventPropName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__EVENT_PROP_NAME, oldEventPropName, eventPropName));
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
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__EVENT_VARIABLE, oldEventVariable, eventVariable));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNeg()
  {
    return neg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeg(String newNeg)
  {
    String oldNeg = neg;
    neg = newNeg;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__NEG, oldNeg, neg));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNum()
  {
    return num;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNum(int newNum)
  {
    int oldNum = num;
    num = newNum;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__NUM, oldNum, num));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDec()
  {
    return dec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDec(int newDec)
  {
    int oldDec = dec;
    dec = newDec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__DEC, oldDec, dec));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStr()
  {
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStr(String newStr)
  {
    String oldStr = str;
    str = newStr;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__STR, oldStr, str));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getT()
  {
    return t;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setT(String newT)
  {
    String oldT = t;
    t = newT;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__T, oldT, t));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getF()
  {
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setF(String newF)
  {
    String oldF = f;
    f = newF;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, Esper2MaudePackage.FILTER_PART__F, oldF, f));
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
      case Esper2MaudePackage.FILTER_PART__EVENT_PROP_NAME:
        return getEventPropName();
      case Esper2MaudePackage.FILTER_PART__EVENT_VARIABLE:
        return getEventVariable();
      case Esper2MaudePackage.FILTER_PART__NEG:
        return getNeg();
      case Esper2MaudePackage.FILTER_PART__NUM:
        return getNum();
      case Esper2MaudePackage.FILTER_PART__DEC:
        return getDec();
      case Esper2MaudePackage.FILTER_PART__STR:
        return getStr();
      case Esper2MaudePackage.FILTER_PART__T:
        return getT();
      case Esper2MaudePackage.FILTER_PART__F:
        return getF();
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
      case Esper2MaudePackage.FILTER_PART__EVENT_PROP_NAME:
        setEventPropName((String)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__EVENT_VARIABLE:
        setEventVariable((String)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__NEG:
        setNeg((String)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__NUM:
        setNum((Integer)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__DEC:
        setDec((Integer)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__STR:
        setStr((String)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__T:
        setT((String)newValue);
        return;
      case Esper2MaudePackage.FILTER_PART__F:
        setF((String)newValue);
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
      case Esper2MaudePackage.FILTER_PART__EVENT_PROP_NAME:
        setEventPropName(EVENT_PROP_NAME_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__EVENT_VARIABLE:
        setEventVariable(EVENT_VARIABLE_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__NEG:
        setNeg(NEG_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__NUM:
        setNum(NUM_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__DEC:
        setDec(DEC_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__STR:
        setStr(STR_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__T:
        setT(T_EDEFAULT);
        return;
      case Esper2MaudePackage.FILTER_PART__F:
        setF(F_EDEFAULT);
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
      case Esper2MaudePackage.FILTER_PART__EVENT_PROP_NAME:
        return EVENT_PROP_NAME_EDEFAULT == null ? eventPropName != null : !EVENT_PROP_NAME_EDEFAULT.equals(eventPropName);
      case Esper2MaudePackage.FILTER_PART__EVENT_VARIABLE:
        return EVENT_VARIABLE_EDEFAULT == null ? eventVariable != null : !EVENT_VARIABLE_EDEFAULT.equals(eventVariable);
      case Esper2MaudePackage.FILTER_PART__NEG:
        return NEG_EDEFAULT == null ? neg != null : !NEG_EDEFAULT.equals(neg);
      case Esper2MaudePackage.FILTER_PART__NUM:
        return num != NUM_EDEFAULT;
      case Esper2MaudePackage.FILTER_PART__DEC:
        return dec != DEC_EDEFAULT;
      case Esper2MaudePackage.FILTER_PART__STR:
        return STR_EDEFAULT == null ? str != null : !STR_EDEFAULT.equals(str);
      case Esper2MaudePackage.FILTER_PART__T:
        return T_EDEFAULT == null ? t != null : !T_EDEFAULT.equals(t);
      case Esper2MaudePackage.FILTER_PART__F:
        return F_EDEFAULT == null ? f != null : !F_EDEFAULT.equals(f);
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
    result.append(" (eventPropName: ");
    result.append(eventPropName);
    result.append(", eventVariable: ");
    result.append(eventVariable);
    result.append(", neg: ");
    result.append(neg);
    result.append(", num: ");
    result.append(num);
    result.append(", dec: ");
    result.append(dec);
    result.append(", str: ");
    result.append(str);
    result.append(", t: ");
    result.append(t);
    result.append(", f: ");
    result.append(f);
    result.append(')');
    return result.toString();
  }

} //FilterPartImpl
