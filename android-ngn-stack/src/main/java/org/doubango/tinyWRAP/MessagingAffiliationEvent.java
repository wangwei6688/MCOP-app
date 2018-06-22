/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class MessagingAffiliationEvent extends SipEvent {
  private long swigCPtr;

  protected MessagingAffiliationEvent(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.MessagingAffiliationEvent_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MessagingAffiliationEvent obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_MessagingAffiliationEvent(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public tsip_message_event_type_t getType() {
    return tsip_message_event_type_t.swigToEnum(tinyWRAPJNI.MessagingAffiliationEvent_getType(swigCPtr, this));
  }

  public MessagingAffiliationSession getSession() {
    long cPtr = tinyWRAPJNI.MessagingAffiliationEvent_getSession(swigCPtr, this);
    return (cPtr == 0) ? null : new MessagingAffiliationSession(cPtr, false);
  }

  public MessagingAffiliationSession takeSessionOwnership() {
    long cPtr = tinyWRAPJNI.MessagingAffiliationEvent_takeSessionOwnership(swigCPtr, this);
    return (cPtr == 0) ? null : new MessagingAffiliationSession(cPtr, true);
  }

}
