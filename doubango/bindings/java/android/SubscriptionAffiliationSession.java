/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SubscriptionAffiliationSession extends SipSession {
  private long swigCPtr;

  protected SubscriptionAffiliationSession(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.SubscriptionAffiliationSession_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SubscriptionAffiliationSession obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SubscriptionAffiliationSession(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SubscriptionAffiliationSession(SipStack pStack) {
    this(tinyWRAPJNI.new_SubscriptionAffiliationSession(SipStack.getCPtr(pStack), pStack), true);
  }

  public boolean subscribeAffiliation() {
    return tinyWRAPJNI.SubscriptionAffiliationSession_subscribeAffiliation(swigCPtr, this);
  }

  public boolean unSubscribeAffiliation() {
    return tinyWRAPJNI.SubscriptionAffiliationSession_unSubscribeAffiliation(swigCPtr, this);
  }

}
