// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AclId")
    private String aclId;

    @NameInMap("AclStatus")
    private String aclStatus;

    @NameInMap("AclType")
    private String aclType;

    @NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("CACertificateId")
    private String CACertificateId;

    @NameInMap("Cookie")
    private String cookie;

    @NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @NameInMap("Description")
    private String description;

    @NameInMap("DomainExtensions")
    private DomainExtensions domainExtensions;

    @NameInMap("EnableHttp2")
    private String enableHttp2;

    @NameInMap("Gzip")
    private String gzip;

    @NameInMap("HealthCheck")
    private String healthCheck;

    @NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @NameInMap("ListenerPort")
    private Integer listenerPort;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @NameInMap("Rules")
    private Rules rules;

    @NameInMap("Scheduler")
    private String scheduler;

    @NameInMap("SecurityStatus")
    private String securityStatus;

    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @NameInMap("Status")
    private String status;

    @NameInMap("StickySession")
    private String stickySession;

    @NameInMap("StickySessionType")
    private String stickySessionType;

    @NameInMap("TLSCipherPolicy")
    private String TLSCipherPolicy;

    @NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @NameInMap("VServerGroupId")
    private String VServerGroupId;

    @NameInMap("XForwardedFor")
    private String XForwardedFor;

    @NameInMap("XForwardedFor_ClientCertClientVerify")
    private String XForwardedFor_ClientCertClientVerify;

    @NameInMap("XForwardedFor_ClientCertFingerprint")
    private String XForwardedFor_ClientCertFingerprint;

    @NameInMap("XForwardedFor_ClientCertIssuerDN")
    private String XForwardedFor_ClientCertIssuerDN;

    @NameInMap("XForwardedFor_ClientCertSubjectDN")
    private String XForwardedFor_ClientCertSubjectDN;

    @NameInMap("XForwardedFor_ClientSrcPort")
    private String XForwardedFor_ClientSrcPort;

    @NameInMap("XForwardedFor_SLBID")
    private String XForwardedFor_SLBID;

    @NameInMap("XForwardedFor_SLBIP")
    private String XForwardedFor_SLBIP;

    @NameInMap("XForwardedFor_SLBPORT")
    private String XForwardedFor_SLBPORT;

    @NameInMap("XForwardedFor_proto")
    private String XForwardedFor_proto;

    private DescribeLoadBalancerHTTPSListenerAttributeResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.CACertificateId = builder.CACertificateId;
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.description = builder.description;
        this.domainExtensions = builder.domainExtensions;
        this.enableHttp2 = builder.enableHttp2;
        this.gzip = builder.gzip;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.idleTimeout = builder.idleTimeout;
        this.listenerPort = builder.listenerPort;
        this.requestId = builder.requestId;
        this.requestTimeout = builder.requestTimeout;
        this.rules = builder.rules;
        this.scheduler = builder.scheduler;
        this.securityStatus = builder.securityStatus;
        this.serverCertificateId = builder.serverCertificateId;
        this.status = builder.status;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.TLSCipherPolicy = builder.TLSCipherPolicy;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.VServerGroupId = builder.VServerGroupId;
        this.XForwardedFor = builder.XForwardedFor;
        this.XForwardedFor_ClientCertClientVerify = builder.XForwardedFor_ClientCertClientVerify;
        this.XForwardedFor_ClientCertFingerprint = builder.XForwardedFor_ClientCertFingerprint;
        this.XForwardedFor_ClientCertIssuerDN = builder.XForwardedFor_ClientCertIssuerDN;
        this.XForwardedFor_ClientCertSubjectDN = builder.XForwardedFor_ClientCertSubjectDN;
        this.XForwardedFor_ClientSrcPort = builder.XForwardedFor_ClientSrcPort;
        this.XForwardedFor_SLBID = builder.XForwardedFor_SLBID;
        this.XForwardedFor_SLBIP = builder.XForwardedFor_SLBIP;
        this.XForwardedFor_SLBPORT = builder.XForwardedFor_SLBPORT;
        this.XForwardedFor_proto = builder.XForwardedFor_proto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerHTTPSListenerAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return aclId
     */
    public String getAclId() {
        return this.aclId;
    }

    /**
     * @return aclStatus
     */
    public String getAclStatus() {
        return this.aclStatus;
    }

    /**
     * @return aclType
     */
    public String getAclType() {
        return this.aclType;
    }

    /**
     * @return backendServerPort
     */
    public Integer getBackendServerPort() {
        return this.backendServerPort;
    }

    /**
     * @return bandwidth
     */
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * @return CACertificateId
     */
    public String getCACertificateId() {
        return this.CACertificateId;
    }

    /**
     * @return cookie
     */
    public String getCookie() {
        return this.cookie;
    }

    /**
     * @return cookieTimeout
     */
    public Integer getCookieTimeout() {
        return this.cookieTimeout;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return domainExtensions
     */
    public DomainExtensions getDomainExtensions() {
        return this.domainExtensions;
    }

    /**
     * @return enableHttp2
     */
    public String getEnableHttp2() {
        return this.enableHttp2;
    }

    /**
     * @return gzip
     */
    public String getGzip() {
        return this.gzip;
    }

    /**
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthCheckConnectPort
     */
    public Integer getHealthCheckConnectPort() {
        return this.healthCheckConnectPort;
    }

    /**
     * @return healthCheckDomain
     */
    public String getHealthCheckDomain() {
        return this.healthCheckDomain;
    }

    /**
     * @return healthCheckHttpCode
     */
    public String getHealthCheckHttpCode() {
        return this.healthCheckHttpCode;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckMethod
     */
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
    }

    /**
     * @return healthCheckURI
     */
    public String getHealthCheckURI() {
        return this.healthCheckURI;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return rules
     */
    public Rules getRules() {
        return this.rules;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return securityStatus
     */
    public String getSecurityStatus() {
        return this.securityStatus;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return stickySession
     */
    public String getStickySession() {
        return this.stickySession;
    }

    /**
     * @return stickySessionType
     */
    public String getStickySessionType() {
        return this.stickySessionType;
    }

    /**
     * @return TLSCipherPolicy
     */
    public String getTLSCipherPolicy() {
        return this.TLSCipherPolicy;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * @return VServerGroupId
     */
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    /**
     * @return XForwardedFor
     */
    public String getXForwardedFor() {
        return this.XForwardedFor;
    }

    /**
     * @return XForwardedFor_ClientCertClientVerify
     */
    public String getXForwardedFor_ClientCertClientVerify() {
        return this.XForwardedFor_ClientCertClientVerify;
    }

    /**
     * @return XForwardedFor_ClientCertFingerprint
     */
    public String getXForwardedFor_ClientCertFingerprint() {
        return this.XForwardedFor_ClientCertFingerprint;
    }

    /**
     * @return XForwardedFor_ClientCertIssuerDN
     */
    public String getXForwardedFor_ClientCertIssuerDN() {
        return this.XForwardedFor_ClientCertIssuerDN;
    }

    /**
     * @return XForwardedFor_ClientCertSubjectDN
     */
    public String getXForwardedFor_ClientCertSubjectDN() {
        return this.XForwardedFor_ClientCertSubjectDN;
    }

    /**
     * @return XForwardedFor_ClientSrcPort
     */
    public String getXForwardedFor_ClientSrcPort() {
        return this.XForwardedFor_ClientSrcPort;
    }

    /**
     * @return XForwardedFor_SLBID
     */
    public String getXForwardedFor_SLBID() {
        return this.XForwardedFor_SLBID;
    }

    /**
     * @return XForwardedFor_SLBIP
     */
    public String getXForwardedFor_SLBIP() {
        return this.XForwardedFor_SLBIP;
    }

    /**
     * @return XForwardedFor_SLBPORT
     */
    public String getXForwardedFor_SLBPORT() {
        return this.XForwardedFor_SLBPORT;
    }

    /**
     * @return XForwardedFor_proto
     */
    public String getXForwardedFor_proto() {
        return this.XForwardedFor_proto;
    }

    public static final class Builder {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String CACertificateId; 
        private String cookie; 
        private Integer cookieTimeout; 
        private String description; 
        private DomainExtensions domainExtensions; 
        private String enableHttp2; 
        private String gzip; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private Integer healthCheckTimeout; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer idleTimeout; 
        private Integer listenerPort; 
        private String requestId; 
        private Integer requestTimeout; 
        private Rules rules; 
        private String scheduler; 
        private String securityStatus; 
        private String serverCertificateId; 
        private String status; 
        private String stickySession; 
        private String stickySessionType; 
        private String TLSCipherPolicy; 
        private Integer unhealthyThreshold; 
        private String VServerGroupId; 
        private String XForwardedFor; 
        private String XForwardedFor_ClientCertClientVerify; 
        private String XForwardedFor_ClientCertFingerprint; 
        private String XForwardedFor_ClientCertIssuerDN; 
        private String XForwardedFor_ClientCertSubjectDN; 
        private String XForwardedFor_ClientSrcPort; 
        private String XForwardedFor_SLBID; 
        private String XForwardedFor_SLBIP; 
        private String XForwardedFor_SLBPORT; 
        private String XForwardedFor_proto; 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * AclStatus.
         */
        public Builder aclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.aclType = aclType;
            return this;
        }

        /**
         * BackendServerPort.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * CACertificateId.
         */
        public Builder CACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * Cookie.
         */
        public Builder cookie(String cookie) {
            this.cookie = cookie;
            return this;
        }

        /**
         * CookieTimeout.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * DomainExtensions.
         */
        public Builder domainExtensions(DomainExtensions domainExtensions) {
            this.domainExtensions = domainExtensions;
            return this;
        }

        /**
         * EnableHttp2.
         */
        public Builder enableHttp2(String enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * Gzip.
         */
        public Builder gzip(String gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * HealthCheckConnectPort.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * HealthCheckDomain.
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * HealthCheckHttpCode.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * HealthCheckInterval.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * HealthCheckMethod.
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * HealthCheckTimeout.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * HealthCheckURI.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * IdleTimeout.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RequestTimeout.
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * Rules.
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * SecurityStatus.
         */
        public Builder securityStatus(String securityStatus) {
            this.securityStatus = securityStatus;
            return this;
        }

        /**
         * ServerCertificateId.
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StickySession.
         */
        public Builder stickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }

        /**
         * StickySessionType.
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * TLSCipherPolicy.
         */
        public Builder TLSCipherPolicy(String TLSCipherPolicy) {
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * VServerGroupId.
         */
        public Builder VServerGroupId(String VServerGroupId) {
            this.VServerGroupId = VServerGroupId;
            return this;
        }

        /**
         * XForwardedFor.
         */
        public Builder XForwardedFor(String XForwardedFor) {
            this.XForwardedFor = XForwardedFor;
            return this;
        }

        /**
         * XForwardedFor_ClientCertClientVerify.
         */
        public Builder XForwardedFor_ClientCertClientVerify(String XForwardedFor_ClientCertClientVerify) {
            this.XForwardedFor_ClientCertClientVerify = XForwardedFor_ClientCertClientVerify;
            return this;
        }

        /**
         * XForwardedFor_ClientCertFingerprint.
         */
        public Builder XForwardedFor_ClientCertFingerprint(String XForwardedFor_ClientCertFingerprint) {
            this.XForwardedFor_ClientCertFingerprint = XForwardedFor_ClientCertFingerprint;
            return this;
        }

        /**
         * XForwardedFor_ClientCertIssuerDN.
         */
        public Builder XForwardedFor_ClientCertIssuerDN(String XForwardedFor_ClientCertIssuerDN) {
            this.XForwardedFor_ClientCertIssuerDN = XForwardedFor_ClientCertIssuerDN;
            return this;
        }

        /**
         * XForwardedFor_ClientCertSubjectDN.
         */
        public Builder XForwardedFor_ClientCertSubjectDN(String XForwardedFor_ClientCertSubjectDN) {
            this.XForwardedFor_ClientCertSubjectDN = XForwardedFor_ClientCertSubjectDN;
            return this;
        }

        /**
         * XForwardedFor_ClientSrcPort.
         */
        public Builder XForwardedFor_ClientSrcPort(String XForwardedFor_ClientSrcPort) {
            this.XForwardedFor_ClientSrcPort = XForwardedFor_ClientSrcPort;
            return this;
        }

        /**
         * XForwardedFor_SLBID.
         */
        public Builder XForwardedFor_SLBID(String XForwardedFor_SLBID) {
            this.XForwardedFor_SLBID = XForwardedFor_SLBID;
            return this;
        }

        /**
         * XForwardedFor_SLBIP.
         */
        public Builder XForwardedFor_SLBIP(String XForwardedFor_SLBIP) {
            this.XForwardedFor_SLBIP = XForwardedFor_SLBIP;
            return this;
        }

        /**
         * XForwardedFor_SLBPORT.
         */
        public Builder XForwardedFor_SLBPORT(String XForwardedFor_SLBPORT) {
            this.XForwardedFor_SLBPORT = XForwardedFor_SLBPORT;
            return this;
        }

        /**
         * XForwardedFor_proto.
         */
        public Builder XForwardedFor_proto(String XForwardedFor_proto) {
            this.XForwardedFor_proto = XForwardedFor_proto;
            return this;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerHTTPSListenerAttributeResponseBody(this);
        } 

    } 

    public static class DomainExtension extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainExtensionId")
        private String domainExtensionId;

        @NameInMap("ServerCertificateId")
        private String serverCertificateId;

        private DomainExtension(Builder builder) {
            this.domain = builder.domain;
            this.domainExtensionId = builder.domainExtensionId;
            this.serverCertificateId = builder.serverCertificateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainExtension create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainExtensionId
         */
        public String getDomainExtensionId() {
            return this.domainExtensionId;
        }

        /**
         * @return serverCertificateId
         */
        public String getServerCertificateId() {
            return this.serverCertificateId;
        }

        public static final class Builder {
            private String domain; 
            private String domainExtensionId; 
            private String serverCertificateId; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * DomainExtensionId.
             */
            public Builder domainExtensionId(String domainExtensionId) {
                this.domainExtensionId = domainExtensionId;
                return this;
            }

            /**
             * ServerCertificateId.
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            public DomainExtension build() {
                return new DomainExtension(this);
            } 

        } 

    }
    public static class DomainExtensions extends TeaModel {
        @NameInMap("DomainExtension")
        private java.util.List < DomainExtension> domainExtension;

        private DomainExtensions(Builder builder) {
            this.domainExtension = builder.domainExtension;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainExtensions create() {
            return builder().build();
        }

        /**
         * @return domainExtension
         */
        public java.util.List < DomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

        public static final class Builder {
            private java.util.List < DomainExtension> domainExtension; 

            /**
             * DomainExtension.
             */
            public Builder domainExtension(java.util.List < DomainExtension> domainExtension) {
                this.domainExtension = domainExtension;
                return this;
            }

            public DomainExtensions build() {
                return new DomainExtensions(this);
            } 

        } 

    }
    public static class Rule extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("RuleId")
        private String ruleId;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Url")
        private String url;

        @NameInMap("VServerGroupId")
        private String VServerGroupId;

        private Rule(Builder builder) {
            this.domain = builder.domain;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.url = builder.url;
            this.VServerGroupId = builder.VServerGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rule create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return ruleId
         */
        public String getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return VServerGroupId
         */
        public String getVServerGroupId() {
            return this.VServerGroupId;
        }

        public static final class Builder {
            private String domain; 
            private String ruleId; 
            private String ruleName; 
            private String url; 
            private String VServerGroupId; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * VServerGroupId.
             */
            public Builder VServerGroupId(String VServerGroupId) {
                this.VServerGroupId = VServerGroupId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    public static class Rules extends TeaModel {
        @NameInMap("Rule")
        private java.util.List < Rule> rule;

        private Rules(Builder builder) {
            this.rule = builder.rule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rules create() {
            return builder().build();
        }

        /**
         * @return rule
         */
        public java.util.List < Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List < Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List < Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
}
