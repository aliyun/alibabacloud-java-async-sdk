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
 * {@link SetLoadBalancerHTTPSListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerHTTPSListenerAttributeRequest</p>
 */
public class SetLoadBalancerHTTPSListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclId")
    private String aclId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclStatus")
    private String aclStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclType")
    private String aclType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 5120)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CACertificateId")
    private String CACertificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableHttp2")
    private String enableHttp2;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Gzip")
    private String gzip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 9999, minimum = 1)
    private Integer idleTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 9999, minimum = 1)
    private Integer requestTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySession")
    private String stickySession;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TLSCipherPolicy")
    private String TLSCipherPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroup")
    private String vServerGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor_ClientSrcPort")
    private String xForwardedForClientSrcPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBID")
    private String xForwardedForSLBID;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBIP")
    private String xForwardedForSLBIP;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor_SLBPORT")
    private String xForwardedForSLBPORT;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("XForwardedFor_proto")
    private String xForwardedForProto;

    private SetLoadBalancerHTTPSListenerAttributeRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.bandwidth = builder.bandwidth;
        this.CACertificateId = builder.CACertificateId;
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.description = builder.description;
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
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.requestTimeout = builder.requestTimeout;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.serverCertificateId = builder.serverCertificateId;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.TLSCipherPolicy = builder.TLSCipherPolicy;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroup = builder.vServerGroup;
        this.vServerGroupId = builder.vServerGroupId;
        this.xForwardedFor = builder.xForwardedFor;
        this.xForwardedForClientSrcPort = builder.xForwardedForClientSrcPort;
        this.xForwardedForSLBID = builder.xForwardedForSLBID;
        this.xForwardedForSLBIP = builder.xForwardedForSLBIP;
        this.xForwardedForSLBPORT = builder.xForwardedForSLBPORT;
        this.xForwardedForProto = builder.xForwardedForProto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerHTTPSListenerAttributeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return ownerAccount
     */
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
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
     * @return vServerGroup
     */
    public String getVServerGroup() {
        return this.vServerGroup;
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

    public static final class Builder extends Request.Builder<SetLoadBalancerHTTPSListenerAttributeRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer bandwidth; 
        private String CACertificateId; 
        private String cookie; 
        private Integer cookieTimeout; 
        private String description; 
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
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private Integer requestTimeout; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private String serverCertificateId; 
        private String stickySession; 
        private String stickySessionType; 
        private String TLSCipherPolicy; 
        private Integer unhealthyThreshold; 
        private String vServerGroup; 
        private String vServerGroupId; 
        private String xForwardedFor; 
        private String xForwardedForClientSrcPort; 
        private String xForwardedForSLBID; 
        private String xForwardedForSLBIP; 
        private String xForwardedForSLBPORT; 
        private String xForwardedForProto; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerHTTPSListenerAttributeRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclStatus = request.aclStatus;
            this.aclType = request.aclType;
            this.bandwidth = request.bandwidth;
            this.CACertificateId = request.CACertificateId;
            this.cookie = request.cookie;
            this.cookieTimeout = request.cookieTimeout;
            this.description = request.description;
            this.enableHttp2 = request.enableHttp2;
            this.gzip = request.gzip;
            this.healthCheck = request.healthCheck;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckMethod = request.healthCheckMethod;
            this.healthCheckTimeout = request.healthCheckTimeout;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.idleTimeout = request.idleTimeout;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.requestTimeout = request.requestTimeout;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduler = request.scheduler;
            this.serverCertificateId = request.serverCertificateId;
            this.stickySession = request.stickySession;
            this.stickySessionType = request.stickySessionType;
            this.TLSCipherPolicy = request.TLSCipherPolicy;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.vServerGroup = request.vServerGroup;
            this.vServerGroupId = request.vServerGroupId;
            this.xForwardedFor = request.xForwardedFor;
            this.xForwardedForClientSrcPort = request.xForwardedForClientSrcPort;
            this.xForwardedForSLBID = request.xForwardedForSLBID;
            this.xForwardedForSLBIP = request.xForwardedForSLBIP;
            this.xForwardedForSLBPORT = request.xForwardedForSLBPORT;
            this.xForwardedForProto = request.xForwardedForProto;
        } 

        /**
         * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
         * <p>This parameter is required if <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>nacl-a2do9e413e0spzasx****</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>Specifies whether to enable access control. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enables access control</li>
         * <li><strong>off</strong>: disables access control</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * <p>The type of network ACL. Valid values:</p>
         * <ul>
         * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your business may be adversely affected if the whitelist is not set properly. After a whitelist is configured, only IP addresses in the whitelist can access the CLB listener.</p>
         * <p>If no IP address is added to the whitelist, the CLB listener forwards all requests.</p>
         * </li>
         * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists apply to scenarios where you want to deny access from specified IP addresses to an application.</p>
         * <p>If no IP address is added to the blacklist, the listener forwards all requests.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>white</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: If you set the value to -1, the bandwidth of the listener is unlimited.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The ID of the CA certificate.</p>
         * <ul>
         * <li>If both the CA certificate and the server certificate are uploaded, mutual authentication is used.</li>
         * <li>If you upload only the server certificate, one-way authentication is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>139a00604ad-cn-east-****</p>
         */
        public Builder CACertificateId(String CACertificateId) {
            this.putQueryParameter("CACertificateId", CACertificateId);
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * <p>The cookie that you want to configure for the server.</p>
         * <p>The cookie must be 1 to 200 characters in length, and can contain only ASCII letters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).</p>
         * <blockquote>
         * <p> This parameter is required when you set the <strong>StickySession</strong> parameter to <strong>on</strong> and the <strong>StickySessionType</strong> parameter to <strong>server</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>B490B5EBF6F3CD4****</p>
         */
        public Builder cookie(String cookie) {
            this.putQueryParameter("Cookie", cookie);
            this.cookie = cookie;
            return this;
        }

        /**
         * <p>The timeout period of the cookie. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>86400</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if the <strong>StickySession</strong> parameter is set to <strong>on</strong> and the <strong>StickySessionType</strong> parameter is set to <strong>insert</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * <p>The description of the listener.
         * The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>Listener1</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to use <code>HTTP 2.0</code>. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder enableHttp2(String enableHttp2) {
            this.putQueryParameter("EnableHttp2", enableHttp2);
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * <p>Specifies whether to enable <code>Gzip</code> compression to compress specific types of files. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder gzip(String gzip) {
            this.putQueryParameter("Gzip", gzip);
            this.gzip = gzip;
            return this;
        }

        /**
         * <p>Specifies whether to enable health checks. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$_ip</strong>: the private IP address of a backend server. If you do not set this parameter or set the parameter to $_ip, the CLB instance uses the private IP address of each backend server as the domain name for health checks.</li>
         * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.),and hyphens (-).</li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.16</p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code of a successful health check. Separate multiple HTTP status codes with commas (,).</p>
         * <p>Valid values: <strong>http_2xx</strong>, <strong>http_3xx</strong>, <strong>http_4xx</strong>, and <strong>http_5xx</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http_2xx,http_3xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The HTTP method that is used for health checks. Valid values: <strong>head</strong> and <strong>get</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>get</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putQueryParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The timeout period of a health check response. If a backend ECS instance does not respond within the specified timeout period, the ECS instance fails the health check. Unit: seconds Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only if the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The URL that is used for health checks.</p>
         * <p>The URL must be 1 to 80 characters in length and can contain letters, digits, and the following characters: - / . % ? # &amp;. The URL must not be a single forward slash (/) but it must start with a forward slash (/).</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of health checks that an unhealthy backend server must consecutively pass before it can be declared healthy (from <strong>fail</strong> to <strong>success</strong>).</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1 to 60</strong>. Default value: <strong>15</strong>.</p>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When another request is received, CLB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>The frontend port that is used by the CLB instance.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the CLB instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-sjhfdji****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * OwnerAccount.
         */
        public Builder ownerAccount(String ownerAccount) {
            this.putQueryParameter("OwnerAccount", ownerAccount);
            this.ownerAccount = ownerAccount;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the CLB instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1 to 180</strong>. Default value: <strong>60</strong>.</p>
         * <p>If no response is received from the backend server during the request timeout period, CLB sends an HTTP 504 error code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>223</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.putQueryParameter("RequestTimeout", requestTimeout);
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>idkp-123-cn-te****</p>
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.putQueryParameter("ServerCertificateId", serverCertificateId);
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * <p>Specifies whether to enable session persistence. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder stickySession(String stickySession) {
            this.putQueryParameter("StickySession", stickySession);
            this.stickySession = stickySession;
            return this;
        }

        /**
         * <p>The method that is used to handle a cookie. Valid values:</p>
         * <ul>
         * <li><p><strong>insert</strong>: inserts a cookie.</p>
         * <p>CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.</p>
         * </li>
         * <li><p><strong>server</strong>: rewrites a cookie.</p>
         * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client will contain the user-defined cookie, and the listener will distribute this request to the recorded backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> This parameter is required if the <strong>StickySession</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        public Builder stickySessionType(String stickySessionType) {
            this.putQueryParameter("StickySessionType", stickySessionType);
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * <p>The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.</p>
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
         * <p>tls_cipher_policy_1_2</p>
         */
        public Builder TLSCipherPolicy(String TLSCipherPolicy) {
            this.putQueryParameter("TLSCipherPolicy", TLSCipherPolicy);
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }

        /**
         * <p>The number of health checks that a healthy backend server must consecutively fail before it can be declared unhealthy (from <strong>success</strong> to <strong>fail</strong>).</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the <strong>HealthCheck</strong> parameter is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * <p>Specifies whether to use a vServer group. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder vServerGroup(String vServerGroup) {
            this.putQueryParameter("VServerGroup", vServerGroup);
            this.vServerGroup = vServerGroup;
            return this;
        }

        /**
         * <p>The ID of the vServer group.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.putQueryParameter("XForwardedFor", xForwardedFor);
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>XForwardedFor_ClientSrcPort</code> header to retrieve the client port. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
            this.putQueryParameter("XForwardedFor_ClientSrcPort", xForwardedForClientSrcPort);
            this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForSLBID(String xForwardedForSLBID) {
            this.putQueryParameter("XForwardedFor_SLBID", xForwardedForSLBID);
            this.xForwardedForSLBID = xForwardedForSLBID;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>SLB-IP</code> header to obtain the virtual IP address (VIP) requested by the client. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
            this.putQueryParameter("XForwardedFor_SLBIP", xForwardedForSLBIP);
            this.xForwardedForSLBIP = xForwardedForSLBIP;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>XForwardedFor_SLBPORT</code> header to retrieve the listener port of the CLB instance. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
            this.putQueryParameter("XForwardedFor_SLBPORT", xForwardedForSLBPORT);
            this.xForwardedForSLBPORT = xForwardedForSLBPORT;
            return this;
        }

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedForProto(String xForwardedForProto) {
            this.putQueryParameter("XForwardedFor_proto", xForwardedForProto);
            this.xForwardedForProto = xForwardedForProto;
            return this;
        }

        @Override
        public SetLoadBalancerHTTPSListenerAttributeRequest build() {
            return new SetLoadBalancerHTTPSListenerAttributeRequest(this);
        } 

    } 

}
