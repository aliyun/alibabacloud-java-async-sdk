// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerHTTPSListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerHTTPSListenerAttributeRequest</p>
 */
public class SetLoadBalancerHTTPSListenerAttributeRequest extends Request {
    @Query
    @NameInMap("AclId")
    private String aclId;

    @Query
    @NameInMap("AclStatus")
    private String aclStatus;

    @Query
    @NameInMap("AclType")
    private String aclType;

    @Query
    @NameInMap("Bandwidth")
    @Validation(maximum = 5120)
    private Integer bandwidth;

    @Query
    @NameInMap("CACertificateId")
    private String CACertificateId;

    @Query
    @NameInMap("Cookie")
    private String cookie;

    @Query
    @NameInMap("CookieTimeout")
    @Validation(maximum = 86400, minimum = 1)
    private Integer cookieTimeout;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnableHttp2")
    private String enableHttp2;

    @Query
    @NameInMap("Gzip")
    private String gzip;

    @Query
    @NameInMap("HealthCheck")
    private String healthCheck;

    @Query
    @NameInMap("HealthCheckConnectPort")
    @Validation(maximum = 65535)
    private Integer healthCheckConnectPort;

    @Query
    @NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @Query
    @NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @Query
    @NameInMap("HealthCheckInterval")
    @Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @Query
    @NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @Query
    @NameInMap("HealthCheckTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckTimeout;

    @Query
    @NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @Query
    @NameInMap("HealthyThreshold")
    @Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @Query
    @NameInMap("IdleTimeout")
    @Validation(maximum = 9999, minimum = 1)
    private Integer idleTimeout;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RequestTimeout")
    @Validation(maximum = 9999, minimum = 1)
    private Integer requestTimeout;

    @Query
    @NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("Scheduler")
    private String scheduler;

    @Query
    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @Query
    @NameInMap("StickySession")
    private String stickySession;

    @Query
    @NameInMap("StickySessionType")
    private String stickySessionType;

    @Query
    @NameInMap("TLSCipherPolicy")
    private String TLSCipherPolicy;

    @Query
    @NameInMap("UnhealthyThreshold")
    @Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @Query
    @NameInMap("VServerGroup")
    private String vServerGroup;

    @Query
    @NameInMap("VServerGroupId")
    private String vServerGroupId;

    @Query
    @NameInMap("XForwardedFor")
    private String xForwardedFor;

    @Query
    @NameInMap("XForwardedFor_ClientSrcPort")
    private String xForwardedForClientSrcPort;

    @Query
    @NameInMap("XForwardedFor_SLBID")
    private String xForwardedForSLBID;

    @Query
    @NameInMap("XForwardedFor_SLBIP")
    private String xForwardedForSLBIP;

    @Query
    @NameInMap("XForwardedFor_SLBPORT")
    private String xForwardedForSLBPORT;

    @Query
    @NameInMap("XForwardedFor_proto")
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
         * The ID of the network access control list (ACL) that you want to associate with the listener.
         * <p>
         * 
         * If **AclStatus** is set to **on**, this parameter is required.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * Specifies whether to enable access control. Valid values:
         * <p>
         * 
         * *   **on**: enables access control
         * *   **off**: disables access control
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * The type of network ACL. Valid values:
         * <p>
         * 
         * *   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your business may be adversely affected if the whitelist is not set properly. After a whitelist is configured, only IP addresses in the whitelist can access the CLB listener.
         * 
         *     If no IP address is added to the whitelist, the CLB listener forwards all requests.
         * 
         * *   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists apply to scenarios where you want to deny access from specified IP addresses to an application.
         * 
         *     If no IP address is added to the blacklist, the listener forwards all requests.
         * 
         * >  This parameter takes effect only when **AclStatus** is set to **on**.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * The bandwidth limit of the listener. Unit: Mbit/s.
         * <p>
         * 
         * Valid values: **-1** and **1** to **5120**.
         * 
         * *   **-1**: If you set the value to -1, the bandwidth of the listener is unlimited.
         * *   **1** to **5120**: If you set a value from 1 to 5120, the value that you specify equals the bandwidth limit of the listener. The sum of bandwidth limit values that you specify for all listeners of the CLB instance cannot exceed the bandwidth limit of the CLB instance.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The ID of the CA certificate.
         * <p>
         * 
         * *   If both the CA certificate and the server certificate are uploaded, mutual authentication is used.
         * *   If you upload only the server certificate, one-way authentication is used.
         */
        public Builder CACertificateId(String CACertificateId) {
            this.putQueryParameter("CACertificateId", CACertificateId);
            this.CACertificateId = CACertificateId;
            return this;
        }

        /**
         * The cookie to be configured on the backend server.
         * <p>
         * 
         * The cookie must be 1 to 200 characters in length, and can contain only ASCII characters and digits. It cannot contain commas (,), semicolons (;), or space characters. It cannot start with a dollar sign ($).
         * 
         * >  This parameter is required if the **StickySession** parameter is set to **on** and the **StickySessionType** parameter is set to **server**.
         */
        public Builder cookie(String cookie) {
            this.putQueryParameter("Cookie", cookie);
            this.cookie = cookie;
            return this;
        }

        /**
         * The timeout period of the cookie. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **86400**.
         * 
         * >  This parameter is required if the **StickySession** parameter is set to **on** and the **StickySessionType** parameter is set to **insert**.
         */
        public Builder cookieTimeout(Integer cookieTimeout) {
            this.putQueryParameter("CookieTimeout", cookieTimeout);
            this.cookieTimeout = cookieTimeout;
            return this;
        }

        /**
         * The description of the listener.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Specifies whether to use `HTTP 2.0`. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder enableHttp2(String enableHttp2) {
            this.putQueryParameter("EnableHttp2", enableHttp2);
            this.enableHttp2 = enableHttp2;
            return this;
        }

        /**
         * Specifies whether to enable `Gzip` compression to compress specific types of files. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder gzip(String gzip) {
            this.putQueryParameter("Gzip", gzip);
            this.gzip = gzip;
            return this;
        }

        /**
         * Specifies whether to enable health checks. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * The port that is used for health checks.
         * <p>
         * 
         * Valid values: **1** to **65535**.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * The domain name that is used for health checks. Valid values:
         * <p>
         * 
         * *   **$\_ip**: the private IP address of a backend server. If you do not set this parameter or set the parameter to $\_ip, the CLB instance uses the private IP address of each backend server as the domain name for health checks.
         * *   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.),and hyphens (-).
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * The HTTP status code of a successful health check. Separate multiple HTTP status codes with commas (,).
         * <p>
         * 
         * Valid values: **http\_2xx**, **http\_3xx**, **http\_4xx**, and **http\_5xx**.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * The interval between two consecutive health checks. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **50**.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * The HTTP method that is used for health checks. Valid values: **head** and **get**.
         * <p>
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.putQueryParameter("HealthCheckMethod", healthCheckMethod);
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the health check fails. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **300**.
         * 
         * If the value of the **HealthCheckTimeout** parameter is smaller than that of the **HealthCheckInterval** parameter, the timeout period specified by the **HealthCheckTimeout** parameter is ignored and the period of time specified by the **HealthCheckInterval** parameter is used as the timeout period.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.putQueryParameter("HealthCheckTimeout", healthCheckTimeout);
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * The URL that is used for health checks.
         * <p>
         * 
         * The URL must be 1 to 80 characters in length and can contain letters, digits, and the following characters: - / . % ? # &. The URL must not be a single forward slash (/) but it must start with a forward slash (/).
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * The number of health checks that an unhealthy backend server must consecutively pass before it can be declared healthy (from **fail** to **success**).
         * <p>
         * 
         * Valid values: **2** to **10**.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * The timeout period of an idle connection. Unit: seconds. Valid values: **1 to 60**. Default value: **15**.
         * <p>
         * 
         * If no request is received within the specified timeout period, CLB closes the connection. When another request is received, CLB establishes a new connection.
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.putQueryParameter("IdleTimeout", idleTimeout);
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * The frontend port that is used by the CLB instance.
         * <p>
         * 
         * Valid values: **1** to **65535**.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The ID of the CLB instance.
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
         * The ID of the region where the CLB instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~25609~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The timeout period of a request. Unit: seconds. Valid values: **1 to 180**. Default value: **60**.
         * <p>
         * 
         * If no response is received from the backend server during the request timeout period, CLB sends an HTTP 504 error code to the client.
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
         * The scheduling algorithm. Valid values:
         * <p>
         * 
         * *   **wrr**: Backend servers that have higher weights receive more requests than backend servers that have lower weights.
         * *   **rr**: Requests are distributed to backend servers in sequence.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * The ID of the server certificate.
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.putQueryParameter("ServerCertificateId", serverCertificateId);
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * Specifies whether to enable session persistence. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder stickySession(String stickySession) {
            this.putQueryParameter("StickySession", stickySession);
            this.stickySession = stickySession;
            return this;
        }

        /**
         * The method that is used to handle a cookie. Valid values:
         * <p>
         * 
         * *   **insert**: inserts a cookie.
         * 
         *     CLB inserts a cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. The next request from the client will contain this cookie, and the listener will distribute this request to the recorded backend server.
         * 
         * *   **server**: rewrites a cookie.
         * 
         *     When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client will contain the user-defined cookie, and the listener will distribute this request to the recorded backend server.
         * 
         * >  This parameter is required if the **StickySession** parameter is set to **on**.
         */
        public Builder stickySessionType(String stickySessionType) {
            this.putQueryParameter("StickySessionType", stickySessionType);
            this.stickySessionType = stickySessionType;
            return this;
        }

        /**
         * The Transport Layer Security (TLS) security policy. Each security policy contains TLS protocol versions and cipher suites available for HTTPS.
         * <p>
         * 
         * *   **tls_cipher_policy\_1\_0**:
         * 
         *     Supported TLS versions: TLS 1.0, TLS 1.1, and TLS 1.2
         * 
         *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
         * 
         * *   **tls_cipher_policy\_1\_1**:
         * 
         *     Supported TLS versions: TLS 1.1 and TLS 1.2
         * 
         *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
         * 
         * *   **tls_cipher_policy\_1\_2**
         * 
         *     Supported TLS version: TLS 1.2
         * 
         *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, AES128-GCM-SHA256, AES256-GCM-SHA384, AES128-SHA256, AES256-SHA256, ECDHE-RSA-AES128-SHA, ECDHE-RSA-AES256-SHA, AES128-SHA, AES256-SHA, and DES-CBC3-SHA
         * 
         * *   **tls_cipher_policy\_1\_2\_strict**
         * 
         *     Supported TLS version: TLS 1.2
         * 
         *     Supported cipher suites: ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
         * 
         * *   **tls_cipher_policy\_1\_2\_strict_with\_1\_3**
         * 
         *     Supported TLS versions: TLS 1.2 and TLS 1.3
         * 
         *     Supported cipher suites: TLS_AES\_128\_GCM_SHA256, TLS_AES\_256\_GCM_SHA384, TLS_CHACHA20\_POLY1305\_SHA256, TLS_AES\_128\_CCM_SHA256, TLS_AES\_128\_CCM\_8\_SHA256, ECDHE-ECDSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384, ECDHE-ECDSA-AES128-SHA256, ECDHE-ECDSA-AES256-SHA384, ECDHE-RSA-AES128-GCM-SHA256, ECDHE-RSA-AES256-GCM-SHA384, ECDHE-RSA-AES128-SHA256, ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA, ECDHE-ECDSA-AES256-SHA, ECDHE-RSA-AES128-SHA, and ECDHE-RSA-AES256-SHA
         */
        public Builder TLSCipherPolicy(String TLSCipherPolicy) {
            this.putQueryParameter("TLSCipherPolicy", TLSCipherPolicy);
            this.TLSCipherPolicy = TLSCipherPolicy;
            return this;
        }

        /**
         * The number of health checks that a healthy backend server must consecutively fail before it can be declared unhealthy (from **success** to **fail**).
         * <p>
         * 
         * Valid values: **2** to **10**.
         * 
         * >  This parameter takes effect only when the **HealthCheck** parameter is set to **on**.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * Specifies whether to use a vServer group. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder vServerGroup(String vServerGroup) {
            this.putQueryParameter("VServerGroup", vServerGroup);
            this.vServerGroup = vServerGroup;
            return this;
        }

        /**
         * The ID of the vServer group.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * Specifies whether to use the `X-Forwarded-For` header to retrieve client IP addresses. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.putQueryParameter("XForwardedFor", xForwardedFor);
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        /**
         * XForwardedFor_ClientSrcPort.
         */
        public Builder xForwardedForClientSrcPort(String xForwardedForClientSrcPort) {
            this.putQueryParameter("XForwardedFor_ClientSrcPort", xForwardedForClientSrcPort);
            this.xForwardedForClientSrcPort = xForwardedForClientSrcPort;
            return this;
        }

        /**
         * Specifies whether to use the `SLB-ID` header to retrieve the ID of the CLB instance. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder xForwardedForSLBID(String xForwardedForSLBID) {
            this.putQueryParameter("XForwardedFor_SLBID", xForwardedForSLBID);
            this.xForwardedForSLBID = xForwardedForSLBID;
            return this;
        }

        /**
         * Specifies whether to use the `SLB-IP` header to obtain the virtual IP address (VIP) requested by the client. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder xForwardedForSLBIP(String xForwardedForSLBIP) {
            this.putQueryParameter("XForwardedFor_SLBIP", xForwardedForSLBIP);
            this.xForwardedForSLBIP = xForwardedForSLBIP;
            return this;
        }

        /**
         * XForwardedFor_SLBPORT.
         */
        public Builder xForwardedForSLBPORT(String xForwardedForSLBPORT) {
            this.putQueryParameter("XForwardedFor_SLBPORT", xForwardedForSLBPORT);
            this.xForwardedForSLBPORT = xForwardedForSLBPORT;
            return this;
        }

        /**
         * Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listener protocol. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
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
