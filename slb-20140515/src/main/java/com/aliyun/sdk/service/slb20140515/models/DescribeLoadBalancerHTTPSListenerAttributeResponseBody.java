// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerHTTPSListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.NameInMap("AclIds")
    private AclIds aclIds;

    @com.aliyun.core.annotation.NameInMap("AclStatus")
    private String aclStatus;

    @com.aliyun.core.annotation.NameInMap("AclType")
    private String aclType;

    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("CACertificateId")
    private String CACertificateId;

    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("DomainExtensions")
    private DomainExtensions domainExtensions;

    @com.aliyun.core.annotation.NameInMap("EnableHttp2")
    private String enableHttp2;

    @com.aliyun.core.annotation.NameInMap("Gzip")
    private String gzip;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private Rules rules;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("SecurityStatus")
    private String securityStatus;

    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StickySession")
    private String stickySession;

    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicy")
    private String TLSCipherPolicy;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertClientVerify")
    private String xForwardedForClientCertClientVerify;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertFingerprint")
    private String xForwardedForClientCertFingerprint;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertIssuerDN")
    private String xForwardedForClientCertIssuerDN;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientCertSubjectDN")
    private String xForwardedForClientCertSubjectDN;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientSrcPort")
    private String xForwardedForClientSrcPort;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBID")
    private String xForwardedForSLBID;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBIP")
    private String xForwardedForSLBIP;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBPORT")
    private String xForwardedForSLBPORT;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor_proto")
    private String xForwardedForProto;

    private DescribeLoadBalancerHTTPSListenerAttributeResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.aclIds = builder.aclIds;
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
        this.loadBalancerId = builder.loadBalancerId;
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
        this.tags = builder.tags;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
        this.xForwardedFor = builder.xForwardedFor;
        this.xForwardedForClientCertClientVerify = builder.xForwardedForClientCertClientVerify;
        this.xForwardedForClientCertFingerprint = builder.xForwardedForClientCertFingerprint;
        this.xForwardedForClientCertIssuerDN = builder.xForwardedForClientCertIssuerDN;
        this.xForwardedForClientCertSubjectDN = builder.xForwardedForClientCertSubjectDN;
        this.xForwardedForClientSrcPort = builder.xForwardedForClientSrcPort;
        this.xForwardedForSLBID = builder.xForwardedForSLBID;
        this.xForwardedForSLBIP = builder.xForwardedForSLBIP;
        this.xForwardedForSLBPORT = builder.xForwardedForSLBPORT;
        this.xForwardedForProto = builder.xForwardedForProto;
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
     * @return aclIds
     */
    public AclIds getAclIds() {
        return this.aclIds;
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
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    /**
     * @return vServerGroupId
     */
    public String getVServerGroupId() {
        return this.vServerGroupId;
    }

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    /**
     * @return xForwardedForClientCertClientVerify
     */
    public String getXForwardedForClientCertClientVerify() {
        return this.xForwardedForClientCertClientVerify;
    }

    /**
     * @return xForwardedForClientCertFingerprint
     */
    public String getXForwardedForClientCertFingerprint() {
        return this.xForwardedForClientCertFingerprint;
    }

    /**
     * @return xForwardedForClientCertIssuerDN
     */
    public String getXForwardedForClientCertIssuerDN() {
        return this.xForwardedForClientCertIssuerDN;
    }

    /**
     * @return xForwardedForClientCertSubjectDN
     */
    public String getXForwardedForClientCertSubjectDN() {
        return this.xForwardedForClientCertSubjectDN;
    }

    /**
     * @return xForwardedForClientSrcPort
     */
    public String getXForwardedForClientSrcPort() {
        return this.xForwardedForClientSrcPort;
    }

    /**
     * @return xForwardedForSLBID
     */
    public String getXForwardedForSLBID() {
        return this.xForwardedForSLBID;
    }

    /**
     * @return xForwardedForSLBIP
     */
    public String getXForwardedForSLBIP() {
        return this.xForwardedForSLBIP;
    }

    /**
     * @return xForwardedForSLBPORT
     */
    public String getXForwardedForSLBPORT() {
        return this.xForwardedForSLBPORT;
    }

    /**
     * @return xForwardedForProto
     */
    public String getXForwardedForProto() {
        return this.xForwardedForProto;
    }

    public static final class Builder {
        private String aclId; 
        private AclIds aclIds; 
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
        private String loadBalancerId; 
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
        private Tags tags; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 
        private String xForwardedFor; 
        private String xForwardedForClientCertClientVerify; 
        private String xForwardedForClientCertFingerprint; 
        private String xForwardedForClientCertIssuerDN; 
        private String xForwardedForClientCertSubjectDN; 
        private String xForwardedForClientSrcPort; 
        private String xForwardedForSLBID; 
        private String xForwardedForSLBIP; 
        private String xForwardedForSLBPORT; 
        private String xForwardedForProto; 

        /**
         * <p>The ID of the network ACL that is associated with a listener.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spzasx****</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * AclIds.
         */
        public Builder aclIds(AclIds aclIds) {
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>Indicates whether access control is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder aclStatus(String aclStatus) {
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * <p>The type of the access control list (ACL). Valid values:</p>
         * <ul>
         * <li><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</li>
         * </ul>
         * <p>If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
         * <ul>
         * <li><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</li>
         * </ul>
         * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        public Builder aclType(String aclType) {
            this.aclType = aclType;
            return this;
        }

        /**
         * <p>The backend port that is used by the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The ID of the certification authority (CA) certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idkp-234-cn-test-0**</p>
         */
        public Builder CACertificateId(String CACertificateId) {
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * <p>The cookie that is configured on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD402E515D22BCDA1598</p>
         */
        public Builder cookie(String cookie) {
            this.cookie = cookie;
            return this;
        }

        /**
         * <p>The timeout period of a cookie.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>A list of additional certificates.</p>
         */
        public Builder domainExtensions(DomainExtensions domainExtensions) {
            this.domainExtensions = domainExtensions;
            return this;
        }

        /**
         * <p>Indicates whether <code>HTTP/2</code> is used. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder enableHttp2(String enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * <p>Indicates whether <code>Gzip</code> compression is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder gzip(String gzip) {
            this.gzip = gzip;
            return this;
        }

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The domain name that you want to use for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.test.com">www.test.com</a></p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code for a successful health check.</p>
         * 
         * <strong>example:</strong>
         * <p>http_2xx,http_3xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The health check method used by HTTP listeners. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
         * <blockquote>
         * <p>This parameter is available only when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The maximum timeout period of a health check. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The URL path that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The healthy threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The timeout period of an idle connection. Valid values: <strong>1</strong> to <strong>60</strong>. Default value: <strong>15</strong>. Unit: seconds.</p>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The frontend port that is used by the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The CLB instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1mxu5r8lau****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF3********</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timeout period of a request. Valid values: <strong>1</strong> to <strong>180</strong>. Default value: <strong>60</strong>. Unit: seconds.</p>
         * <p>If no response is received from a backend server within the specified timeout period, CLB returns the HTTP 504 status code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>43</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The list of forwarding rules that are associated with the listener.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The routing algorithm. Valid values: <strong>wrr</strong> and <strong>rr</strong>.</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>Indicates whether the listener is in the Secure state. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder securityStatus(String securityStatus) {
            this.securityStatus = securityStatus;
            return this;
        }

        /**
         * <p>The ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idkp-123-cn-test-0**</p>
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><strong>running</strong></li>
         * <li><strong>stopped</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stopped</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether session persistence is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder stickySession(String stickySession) {
            this.stickySession = stickySession;
            return this;
        }

        /**
         * <p>The method that is used to handle a cookie.</p>
         * <p>Valid values: <strong>insert</strong> and <strong>server</strong>.</p>
         * <ul>
         * <li><p><strong>insert</strong>: inserts a cookie.</p>
         * <p>CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response packet that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
         * </li>
         * <li><p><strong>server</strong>: rewrites a cookie.</p>
         * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener will distribute the request to the recorded backend server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) security policy for a high-performance CLB instance.</p>
         * <p>Each security policy contains TLS protocol versions and cipher suites available for HTTPS. Valid values:</p>
         * <ul>
         * <li><p><strong>tls_cipher_policy_1_0</strong>:</p>
         * <p>Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_1</strong>:</p>
         * <p>Supported TLS versions: TLS 1.1 and TLS 1.2</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2</strong></p>
         * <p>Supported TLS version: TLS 1.2</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict</strong></p>
         * <p>Supported TLS version: TLS 1.2</p>
         * <p>Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
         * </li>
         * <li><p><strong>tls_cipher_policy_1_2_strict_with_1_3</strong></p>
         * <p>Supported TLS versions: TLS 1.2 and TLS 1.3</p>
         * <p>Supported cipher suites: TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384, TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256, TLS_AES_128_CCM_8_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tls_cipher_policy_1_0</p>
         */
        public Builder TLSCipherPolicy(String TLSCipherPolicy) {
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The unhealthy threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * <p>The ID of the associated server group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j5e********</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertClientVerify</code> header is used to retrieve the verification result of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientCertClientVerify(String xForwardedForClientCertClientVerify) {
            this.xForwardedForClientCertClientVerify = xForwardedForClientCertClientVerify;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertFingerprint</code> header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientCertFingerprint(String xForwardedForClientCertFingerprint) {
            this.xForwardedForClientCertFingerprint = xForwardedForClientCertFingerprint;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertIssuerDN</code> header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientCertIssuerDN(String xForwardedForClientCertIssuerDN) {
            this.xForwardedForClientCertIssuerDN = xForwardedForClientCertIssuerDN;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientCertSubjectDN</code> header is used to retrieve information about the owner of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientCertSubjectDN(String xForwardedForClientCertSubjectDN) {
            this.xForwardedForClientCertSubjectDN = xForwardedForClientCertSubjectDN;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_ClientSrcPort</code> header is used to retrieve the client port. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
            this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
            return this;
        }

        /**
         * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForSLBID(String xForwardedForSLBID) {
            this.xForwardedForSLBID = xForwardedForSLBID;
            return this;
        }

        /**
         * <p>Indicates whether the <code>SLB-IP</code> header is used to retrieve the virtual IP address requested by the client. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
            this.xForwardedForSLBIP = xForwardedForSLBIP;
            return this;
        }

        /**
         * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listening port. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
            this.xForwardedForSLBPORT = xForwardedForSLBPORT;
            return this;
        }

        /**
         * <p>Indicates whether the <code>X-Forwarded-Proto</code> header is used to retrieve the listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForProto(String xForwardedForProto) {
            this.xForwardedForProto = xForwardedForProto;
            return this;
        }

        public DescribeLoadBalancerHTTPSListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerHTTPSListenerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class AclIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclId")
        private java.util.List<String> aclId;

        private AclIds(Builder builder) {
            this.aclId = builder.aclId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AclIds create() {
            return builder().build();
        }

        /**
         * @return aclId
         */
        public java.util.List<String> getAclId() {
            return this.aclId;
        }

        public static final class Builder {
            private java.util.List<String> aclId; 

            /**
             * <p>The ID of the network ACL that is associated with a listener.</p>
             * <blockquote>
             * <p>This parameter is required when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>nacl-a2do9e413e0spzasx****</p>
             */
            public Builder aclId(java.util.List<String> aclId) {
                this.aclId = aclId;
                return this;
            }

            public AclIds build() {
                return new AclIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class DomainExtension extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainExtensionId")
        private String domainExtensionId;

        @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
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
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the additional domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder domainExtensionId(String domainExtensionId) {
                this.domainExtensionId = domainExtensionId;
                return this;
            }

            /**
             * <p>The ID of the server certificate that is associated with the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>13344444****</p>
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
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class DomainExtensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainExtension")
        private java.util.List<DomainExtension> domainExtension;

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
        public java.util.List<DomainExtension> getDomainExtension() {
            return this.domainExtension;
        }

        public static final class Builder {
            private java.util.List<DomainExtension> domainExtension; 

            /**
             * DomainExtension.
             */
            public Builder domainExtension(java.util.List<DomainExtension> domainExtension) {
                this.domainExtension = domainExtension;
                return this;
            }

            public DomainExtensions build() {
                return new DomainExtensions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class Rule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private String ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("VServerGroupId")
        private String vServerGroupId;

        private Rule(Builder builder) {
            this.domain = builder.domain;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.url = builder.url;
            this.vServerGroupId = builder.vServerGroupId;
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
         * @return vServerGroupId
         */
        public String getVServerGroupId() {
            return this.vServerGroupId;
        }

        public static final class Builder {
            private String domain; 
            private String ruleId; 
            private String ruleName; 
            private String url; 
            private String vServerGroupId; 

            /**
             * <p>The endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.example.com">www.example.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The request path.</p>
             * 
             * <strong>example:</strong>
             * <p>/example</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The ID of the server group that is associated with the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder vServerGroupId(String vServerGroupId) {
                this.vServerGroupId = vServerGroupId;
                return this;
            }

            public Rule build() {
                return new Rule(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class Rules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Rule")
        private java.util.List<Rule> rule;

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
        public java.util.List<Rule> getRule() {
            return this.rule;
        }

        public static final class Builder {
            private java.util.List<Rule> rule; 

            /**
             * Rule.
             */
            public Builder rule(java.util.List<Rule> rule) {
                this.rule = rule;
                return this;
            }

            public Rules build() {
                return new Rules(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            /**
             * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string. The tag key can be up to 64 characters in length, and cannot start with <code>aliyun</code> or <code>acs:</code>. The tag key cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code>. The tag value cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLoadBalancerHTTPSListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPSListenerAttributeResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Tag")
        private java.util.List<Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List<Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List<Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List<Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
