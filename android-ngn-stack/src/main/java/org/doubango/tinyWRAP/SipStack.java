/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.doubango.tinyWRAP;

public class SipStack extends SafeObject {
  private long swigCPtr;

  protected SipStack(long cPtr, boolean cMemoryOwn) {
    super(tinyWRAPJNI.SipStack_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SipStack obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        tinyWRAPJNI.delete_SipStack(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public SipStack(SipCallback pCallback, String realm_uri, String impi_uri, String impu_uri) {
    this(tinyWRAPJNI.new_SipStack(SipCallback.getCPtr(pCallback), pCallback, realm_uri, impi_uri, impu_uri), true);
  }

  public boolean start() {
    return tinyWRAPJNI.SipStack_start(swigCPtr, this);
  }

  public boolean setDebugCallback(DDebugCallback pCallback) {
    return tinyWRAPJNI.SipStack_setDebugCallback(swigCPtr, this, DDebugCallback.getCPtr(pCallback), pCallback);
  }

  public boolean setRegisterCallback(DRegisterCallback pCallback, java.nio.ByteBuffer dataResponseRegisterCallback, int size) {
    return tinyWRAPJNI.SipStack_setRegisterCallback(swigCPtr, this, DRegisterCallback.getCPtr(pCallback), pCallback, dataResponseRegisterCallback, size);
  }

  public boolean setDisplayName(String display_name) {
    return tinyWRAPJNI.SipStack_setDisplayName(swigCPtr, this, display_name);
  }

  public boolean setRealm(String realm_uri) {
    return tinyWRAPJNI.SipStack_setRealm(swigCPtr, this, realm_uri);
  }

  public boolean setIMPI(String impi) {
    return tinyWRAPJNI.SipStack_setIMPI(swigCPtr, this, impi);
  }

  public boolean setIMPU(String impu_uri) {
    return tinyWRAPJNI.SipStack_setIMPU(swigCPtr, this, impu_uri);
  }

  public boolean setIMPUIP(String impuip_uri) {
    return tinyWRAPJNI.SipStack_setIMPUIP(swigCPtr, this, impuip_uri);
  }

  public boolean setPassword(String password) {
    return tinyWRAPJNI.SipStack_setPassword(swigCPtr, this, password);
  }

  public boolean setAMF(String amf) {
    return tinyWRAPJNI.SipStack_setAMF(swigCPtr, this, amf);
  }

  public boolean setOperatorId(String opid) {
    return tinyWRAPJNI.SipStack_setOperatorId(swigCPtr, this, opid);
  }

  public boolean setProxyCSCF(String fqdn, int port, String transport, String ipversion) {
    return tinyWRAPJNI.SipStack_setProxyCSCF(swigCPtr, this, fqdn, port, transport, ipversion);
  }

  public boolean setLocalIP(String ip, String transport) {
    return tinyWRAPJNI.SipStack_setLocalIP__SWIG_0(swigCPtr, this, ip, transport);
  }

  public boolean setLocalIP(String ip) {
    return tinyWRAPJNI.SipStack_setLocalIP__SWIG_1(swigCPtr, this, ip);
  }

  public boolean setLocalPort(int port, String transport) {
    return tinyWRAPJNI.SipStack_setLocalPort__SWIG_0(swigCPtr, this, port, transport);
  }

  public boolean setLocalPort(int port) {
    return tinyWRAPJNI.SipStack_setLocalPort__SWIG_1(swigCPtr, this, port);
  }

  public boolean setEarlyIMS(boolean enabled) {
    return tinyWRAPJNI.SipStack_setEarlyIMS(swigCPtr, this, enabled);
  }

  public boolean addHeader(String name, String value) {
    return tinyWRAPJNI.SipStack_addHeader(swigCPtr, this, name, value);
  }

  public boolean removeHeader(String name) {
    return tinyWRAPJNI.SipStack_removeHeader(swigCPtr, this, name);
  }

  public boolean addDnsServer(String ip) {
    return tinyWRAPJNI.SipStack_addDnsServer(swigCPtr, this, ip);
  }

  public boolean setDnsDiscovery(boolean enabled) {
    return tinyWRAPJNI.SipStack_setDnsDiscovery(swigCPtr, this, enabled);
  }

  public boolean setAoR(String ip, int port) {
    return tinyWRAPJNI.SipStack_setAoR(swigCPtr, this, ip, port);
  }

  public boolean setSigCompParams(long dms, long sms, long cpb, boolean enablePresDict) {
    return tinyWRAPJNI.SipStack_setSigCompParams(swigCPtr, this, dms, sms, cpb, enablePresDict);
  }

  public boolean addSigCompCompartment(String compId) {
    return tinyWRAPJNI.SipStack_addSigCompCompartment(swigCPtr, this, compId);
  }

  public boolean removeSigCompCompartment(String compId) {
    return tinyWRAPJNI.SipStack_removeSigCompCompartment(swigCPtr, this, compId);
  }

  public boolean setSTUNEnabledForICE(boolean enabled) {
    return tinyWRAPJNI.SipStack_setSTUNEnabledForICE(swigCPtr, this, enabled);
  }

  public boolean setSTUNServer(String hostname, int port) {
    return tinyWRAPJNI.SipStack_setSTUNServer(swigCPtr, this, hostname, port);
  }

  public boolean setSTUNCred(String login, String password) {
    return tinyWRAPJNI.SipStack_setSTUNCred(swigCPtr, this, login, password);
  }

  public boolean setSTUNEnabled(boolean enabled) {
    return tinyWRAPJNI.SipStack_setSTUNEnabled(swigCPtr, this, enabled);
  }

  public boolean setTLSSecAgree(boolean enabled) {
    return tinyWRAPJNI.SipStack_setTLSSecAgree(swigCPtr, this, enabled);
  }

  public boolean setSSLCertificates(String privKey, String pubKey, String caKey, boolean verify) {
    return tinyWRAPJNI.SipStack_setSSLCertificates__SWIG_0(swigCPtr, this, privKey, pubKey, caKey, verify);
  }

  public boolean setSSLCertificates(String privKey, String pubKey, String caKey) {
    return tinyWRAPJNI.SipStack_setSSLCertificates__SWIG_1(swigCPtr, this, privKey, pubKey, caKey);
  }

  public boolean setSSLCretificates(String privKey, String pubKey, String caKey, boolean verify) {
    return tinyWRAPJNI.SipStack_setSSLCretificates__SWIG_0(swigCPtr, this, privKey, pubKey, caKey, verify);
  }

  public boolean setSSLCretificates(String privKey, String pubKey, String caKey) {
    return tinyWRAPJNI.SipStack_setSSLCretificates__SWIG_1(swigCPtr, this, privKey, pubKey, caKey);
  }

  public boolean setIPSecSecAgree(boolean enabled) {
    return tinyWRAPJNI.SipStack_setIPSecSecAgree(swigCPtr, this, enabled);
  }

  public boolean setIPSecParameters(String algo, String ealgo, String mode, String proto) {
    return tinyWRAPJNI.SipStack_setIPSecParameters(swigCPtr, this, algo, ealgo, mode, proto);
  }

  public boolean setMCPTTPSIPrivate(String mcptt_psi_private) {
    return tinyWRAPJNI.SipStack_setMCPTTPSIPrivate(swigCPtr, this, mcptt_psi_private);
  }

  public boolean setMCPTTPSIGroup(String mcptt_psi_group) {
    return tinyWRAPJNI.SipStack_setMCPTTPSIGroup(swigCPtr, this, mcptt_psi_group);
  }

  public boolean setMCPTTPSIPreestablished(String mcptt_psi_preestablished) {
    return tinyWRAPJNI.SipStack_setMCPTTPSIPreestablished(swigCPtr, this, mcptt_psi_preestablished);
  }

  public boolean setMCPTTID(String mcptt_id) {
    return tinyWRAPJNI.SipStack_setMCPTTID(swigCPtr, this, mcptt_id);
  }

  public boolean setMCPTTPriority(int mcptt_priority) {
    return tinyWRAPJNI.SipStack_setMCPTTPriority(swigCPtr, this, mcptt_priority);
  }

  public boolean setMCPTTImplicit(boolean mcptt_implicit) {
    return tinyWRAPJNI.SipStack_setMCPTTImplicit(swigCPtr, this, mcptt_implicit);
  }

  public boolean setMCPTTGranted(boolean mcptt_granted) {
    return tinyWRAPJNI.SipStack_setMCPTTGranted(swigCPtr, this, mcptt_granted);
  }

  public boolean setMCPTTAnswerMode(boolean mcptt_answer_mode) {
    return tinyWRAPJNI.SipStack_setMCPTTAnswerMode(swigCPtr, this, mcptt_answer_mode);
  }

  public boolean setMCPTTPrivAnswerMode(boolean mcptt_priv_answer_mode) {
    return tinyWRAPJNI.SipStack_setMCPTTPrivAnswerMode(swigCPtr, this, mcptt_priv_answer_mode);
  }

  public boolean setMCPTTNameSpace(boolean mcptt_namespace) {
    return tinyWRAPJNI.SipStack_setMCPTTNameSpace(swigCPtr, this, mcptt_namespace);
  }

  public boolean setMCPTTInsertXFramedIP(boolean mcptt_insert_x_framed_ip) {
    return tinyWRAPJNI.SipStack_setMCPTTInsertXFramedIP(swigCPtr, this, mcptt_insert_x_framed_ip);
  }

  public boolean setMCPTTTimerT100(int mcptt_timer_t100) {
    return tinyWRAPJNI.SipStack_setMCPTTTimerT100(swigCPtr, this, mcptt_timer_t100);
  }

  public boolean setMCPTTTimerT101(int mcptt_timer_t101) {
    return tinyWRAPJNI.SipStack_setMCPTTTimerT101(swigCPtr, this, mcptt_timer_t101);
  }

  public boolean setMCPTTTimerT103(int mcptt_timer_t103) {
    return tinyWRAPJNI.SipStack_setMCPTTTimerT103(swigCPtr, this, mcptt_timer_t103);
  }

  public boolean setMCPTTTimerT104(int mcptt_timer_t104) {
    return tinyWRAPJNI.SipStack_setMCPTTTimerT104(swigCPtr, this, mcptt_timer_t104);
  }

  public boolean setMCPTTTimerT132(int mcptt_timer_t132) {
    return tinyWRAPJNI.SipStack_setMCPTTTimerT132(swigCPtr, this, mcptt_timer_t132);
  }

  public boolean setLocationPAssertedIdentityServer(String serverUriSIP) {
    return tinyWRAPJNI.SipStack_setLocationPAssertedIdentityServer(swigCPtr, this, serverUriSIP);
  }

  public boolean setMbmsPAssertedIdentityServer(String serverUriSIP) {
    return tinyWRAPJNI.SipStack_setMbmsPAssertedIdentityServer(swigCPtr, this, serverUriSIP);
  }

  public boolean setMbmsPortManager(long portManager) {
    return tinyWRAPJNI.SipStack_setMbmsPortManager(swigCPtr, this, portManager);
  }

  public boolean setMbmsAddrManager(String addrManager) {
    return tinyWRAPJNI.SipStack_setMbmsAddrManager(swigCPtr, this, addrManager);
  }

  public boolean setMbmsIsRTCPMux(boolean isRTCPMux) {
    return tinyWRAPJNI.SipStack_setMbmsIsRTCPMux(swigCPtr, this, isRTCPMux);
  }

  public boolean setMCPTTPSIAffiliation(String mcptt_psi_affiliation) {
    return tinyWRAPJNI.SipStack_setMCPTTPSIAffiliation(swigCPtr, this, mcptt_psi_affiliation);
  }

  public boolean setMCPTTAffiliationIsEnable(boolean mcptt_affiliation_is_enable) {
    return tinyWRAPJNI.SipStack_setMCPTTAffiliationIsEnable(swigCPtr, this, mcptt_affiliation_is_enable);
  }

  public boolean setMCPTTAffiliationGroupsDefualt(String mcptt_affiliation_groups_default) {
    return tinyWRAPJNI.SipStack_setMCPTTAffiliationGroupsDefualt(swigCPtr, this, mcptt_affiliation_groups_default);
  }

  public String dnsENUM(String service, String e164num, String domain) {
    return tinyWRAPJNI.SipStack_dnsENUM(swigCPtr, this, service, e164num, domain);
  }

  public String dnsNaptrSrv(String domain, String service, int[] OUTPUT) {
    return tinyWRAPJNI.SipStack_dnsNaptrSrv(swigCPtr, this, domain, service, OUTPUT);
  }

  public String dnsSrv(String service, int[] OUTPUT) {
    return tinyWRAPJNI.SipStack_dnsSrv(swigCPtr, this, service, OUTPUT);
  }

  public boolean setMaxFDs(long max_fds) {
    return tinyWRAPJNI.SipStack_setMaxFDs(swigCPtr, this, max_fds);
  }

  public String getLocalIPnPort(String protocol, int[] OUTPUT) {
    return tinyWRAPJNI.SipStack_getLocalIPnPort(swigCPtr, this, protocol, OUTPUT);
  }

  public String getPreferredIdentity() {
    return tinyWRAPJNI.SipStack_getPreferredIdentity(swigCPtr, this);
  }

  public boolean isValid() {
    return tinyWRAPJNI.SipStack_isValid(swigCPtr, this);
  }

  public boolean stop() {
    return tinyWRAPJNI.SipStack_stop(swigCPtr, this);
  }

  public static boolean initialize() {
    return tinyWRAPJNI.SipStack_initialize();
  }

  public static boolean deInitialize() {
    return tinyWRAPJNI.SipStack_deInitialize();
  }

  public static void setCodecs(tdav_codec_id_t codecs) {
    tinyWRAPJNI.SipStack_setCodecs(codecs.swigValue());
  }

  public static void setCodecs_2(long codecs) {
    tinyWRAPJNI.SipStack_setCodecs_2(codecs);
  }

  public static boolean setCodecPriority(tdav_codec_id_t codec_id, int priority) {
    return tinyWRAPJNI.SipStack_setCodecPriority(codec_id.swigValue(), priority);
  }

  public static boolean setCodecPriority_2(int codec, int priority) {
    return tinyWRAPJNI.SipStack_setCodecPriority_2(codec, priority);
  }

  public static boolean isCodecSupported(tdav_codec_id_t codec_id) {
    return tinyWRAPJNI.SipStack_isCodecSupported(codec_id.swigValue());
  }

  public static boolean isIPSecSupported() {
    return tinyWRAPJNI.SipStack_isIPSecSupported();
  }

}
