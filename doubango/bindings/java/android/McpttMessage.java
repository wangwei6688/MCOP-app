/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class McpttMessage {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected McpttMessage(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(McpttMessage obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_McpttMessage(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public McpttMessage() {
    this(tinyWRAPJNI.new_McpttMessage(), true);
  }

  public short getRCode() {
    return tinyWRAPJNI.McpttMessage_getRCode(swigCPtr, this);
  }

  public String getPhrase() {
    return tinyWRAPJNI.McpttMessage_getPhrase(swigCPtr, this);
  }

  public String getUser() {
    return tinyWRAPJNI.McpttMessage_getUser(swigCPtr, this);
  }

  public short getParticipants() {
    return tinyWRAPJNI.McpttMessage_getParticipants(swigCPtr, this);
  }

  public short getTime() {
    return tinyWRAPJNI.McpttMessage_getTime(swigCPtr, this);
  }

}
