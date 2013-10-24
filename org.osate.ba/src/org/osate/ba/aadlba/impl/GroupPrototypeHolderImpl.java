/**
 * AADL-BA-FrontEnd
 * 
 * Copyright © 2011 TELECOM ParisTech and CNRS
 * 
 * TELECOM ParisTech/LTCI
 * 
 * Authors: see AUTHORS
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the Eclipse Public License as published by Eclipse, either
 * version 1.0 of the License, or (at your option) any later version. This
 * program is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the Eclipse Public License for
 * more details. You should have received a copy of the Eclipse Public License
 * along with this program. If not, see
 * http://www.eclipse.org/org/documents/epl-v10.php
 */
package org.osate.ba.aadlba.impl;


import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.osate.aadl2.Prototype;
import org.osate.aadl2.PrototypeBinding;
import org.osate.ba.aadlba.AadlBaPackage ;
import org.osate.ba.aadlba.GroupPrototypeHolder ;
import org.osate.ba.aadlba.PrototypeHolder ;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Group Prototype Holder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.osate.ba.aadlba.impl.GroupPrototypeHolderImpl#getPrototypeBinding <em>Prototype Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GroupPrototypeHolderImpl extends GroupHolderImpl implements GroupPrototypeHolder
{
  /**
   * The cached value of the '{@link #getPrototypeBinding() <em>Prototype Binding</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrototypeBinding()
   * @generated
   * @ordered
   */
  protected PrototypeBinding prototypeBinding;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GroupPrototypeHolderImpl()
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
    return AadlBaPackage.Literals.GROUP_PROTOTYPE_HOLDER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrototypeBinding getPrototypeBinding()
  {
    if (prototypeBinding != null && ((EObject)prototypeBinding).eIsProxy())
    {
      InternalEObject oldPrototypeBinding = (InternalEObject)prototypeBinding;
      prototypeBinding = (PrototypeBinding)eResolveProxy(oldPrototypeBinding);
      if (prototypeBinding != oldPrototypeBinding)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING, oldPrototypeBinding, prototypeBinding));
      }
    }
    return prototypeBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrototypeBinding basicGetPrototypeBinding()
  {
    return prototypeBinding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrototypeBinding(PrototypeBinding newPrototypeBinding)
  {
    PrototypeBinding oldPrototypeBinding = prototypeBinding;
    prototypeBinding = newPrototypeBinding;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING, oldPrototypeBinding, prototypeBinding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrototype(Prototype prototype)
  {
    element = prototype ;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Prototype getPrototype()
  {
    return (Prototype) element;
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
      case AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING:
        if (resolve) return getPrototypeBinding();
        return basicGetPrototypeBinding();
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
      case AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING:
        setPrototypeBinding((PrototypeBinding)newValue);
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
      case AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING:
        setPrototypeBinding((PrototypeBinding)null);
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
      case AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING:
        return prototypeBinding != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == PrototypeHolder.class)
    {
      switch (derivedFeatureID)
      {
        case AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING: return AadlBaPackage.PROTOTYPE_HOLDER__PROTOTYPE_BINDING;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == PrototypeHolder.class)
    {
      switch (baseFeatureID)
      {
        case AadlBaPackage.PROTOTYPE_HOLDER__PROTOTYPE_BINDING: return AadlBaPackage.GROUP_PROTOTYPE_HOLDER__PROTOTYPE_BINDING;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //GroupPrototypeHolderImpl
