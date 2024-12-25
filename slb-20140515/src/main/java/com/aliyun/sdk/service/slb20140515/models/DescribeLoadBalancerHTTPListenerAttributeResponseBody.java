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
 * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("Cookie")
    private String cookie;

    @com.aliyun.core.annotation.NameInMap("CookieTimeout")
    private Integer cookieTimeout;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ForwardPort")
    private Integer forwardPort;

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

    @com.aliyun.core.annotation.NameInMap("ListenerForward")
    private String listenerForward;

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

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StickySession")
    private String stickySession;

    @com.aliyun.core.annotation.NameInMap("StickySessionType")
    private String stickySessionType;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

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

    private DescribeLoadBalancerHTTPListenerAttributeResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.aclIds = builder.aclIds;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.cookie = builder.cookie;
        this.cookieTimeout = builder.cookieTimeout;
        this.description = builder.description;
        this.forwardPort = builder.forwardPort;
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
        this.listenerForward = builder.listenerForward;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.requestId = builder.requestId;
        this.requestTimeout = builder.requestTimeout;
        this.rules = builder.rules;
        this.scheduler = builder.scheduler;
        this.securityStatus = builder.securityStatus;
        this.status = builder.status;
        this.stickySession = builder.stickySession;
        this.stickySessionType = builder.stickySessionType;
        this.tags = builder.tags;
        this.unhealthyThreshold = builder.unhealthyThreshold;
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

    public static DescribeLoadBalancerHTTPListenerAttributeResponseBody create() {
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
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return this.forwardPort;
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
     * @return listenerForward
     */
    public String getListenerForward() {
        return this.listenerForward;
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
        private String cookie; 
        private Integer cookieTimeout; 
        private String description; 
        private Integer forwardPort; 
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
        private String listenerForward; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String requestId; 
        private Integer requestTimeout; 
        private Rules rules; 
        private String scheduler; 
        private String securityStatus; 
        private String status; 
        private String stickySession; 
        private String stickySessionType; 
        private Tags tags; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 
        private String xForwardedFor; 
        private String xForwardedForClientSrcPort; 
        private String xForwardedForSLBID; 
        private String xForwardedForSLBIP; 
        private String xForwardedForSLBPORT; 
        private String xForwardedForProto; 

        /**
         * <p>The ID of the network ACL that is associated with a listener.</p>
         * <blockquote>
         * <p>This parameter is returned when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>on</p>
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
         * <p>The type of the ACL. Valid values:</p>
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
         * <p>80</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s.</p>
         * <ul>
         * <li><strong>-1</strong>: If -1 is returned, it indicates that the bandwidth of the listener is unlimited.</li>
         * <li><strong>1 to 5120</strong>: If a value from 1 to 5120 is returned, the value indicates the maximum bandwidth of the listener. The sum of the maximum bandwidth of all listeners added to a CLB instance does not exceed the maximum bandwidth of the CLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
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
         * <p>The timeout period of a cookie. Unit: seconds.</p>
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
         * <p>The listener port that is used to redirect HTTP requests to HTTPS.</p>
         * <blockquote>
         * <p> If the <strong>ListenerForward</strong> parameter is set to <strong>off</strong>, this parameter is not displayed.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder forwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }

        /**
         * <p>Indicates whether <code>Gzip</code> compression is enabled to compress specific types of files. Valid values:</p>
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
         * <p>This parameter takes effect only when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
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
         * <p><a href="http://www.domain.com">www.domain.com</a></p>
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
         * <p>This parameter is returned when <strong>HealthCheck</strong> is set to <strong>on</strong>.</p>
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
         * <p>The timeout period of each health check. Unit: seconds.</p>
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
         * <p>The URI must be 1 to 80 characters in length, and can contain only digits, letters, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&amp;). The URI must start with a forward slash (/) but cannot be a single forward slash (/).</p>
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
         * <p>The timeout period of an idle connection. Unit: seconds.</p>
         * <p>Default value: <strong>15</strong>. Valid values: <strong>1 to 60</strong>.</p>
         * <p>If no request is received within the specified timeout period, CLB closes the connection. When a request is received, CLB establishes a new connection.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>Indicates whether HTTP-to-HTTPS redirection is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder listenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
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
         * <p>lb-bp1uaunez0uho0zf0****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The timeout period of a request. Unit: seconds.</p>
         * <p>Default value: <strong>60</strong>. Valid values: <strong>1 to 180</strong>.</p>
         * <p>If no response is received from a backend server within the specified timeout period, CLB returns the HTTP 504 status code to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>34</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The list of forwarding rules.</p>
         */
        public Builder rules(Rules rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The routing algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers that have higher weights receive more requests than backend servers that have lower weights.</li>
         * <li>** rr**: Requests are sequentially distributed to backend servers.</li>
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
         * <p>CLB inserts a session cookie (SERVERID) into the first HTTP or HTTPS response that is sent to a client. Subsequent requests to CLB carry this cookie, and CLB determines the destination servers of the requests based on the cookies.</p>
         * </li>
         * <li><p><strong>server</strong>: rewrites a cookie.</p>
         * <p>When CLB detects a user-defined cookie, it overwrites the original cookie with the user-defined cookie. The next request from the client carries the user-defined cookie, and the listener forwards this request to the recorded backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required when <strong>StickySession</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>insert</p>
         */
        public Builder stickySessionType(String stickySessionType) {
            this.stickySessionType = stickySessionType;
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
         * <p>rsp-cige6j****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>Indicates whether the <code>X-Forwarded-For</code> header is used to preserve the real IP address of the client. Valid values:</p>
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
         * <p>Indicates whether the <code>SLB-ID</code> header is used to retrieve the ID of the CLB instance. Valid values:</p>
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
         * <p>Indicates whether the <code>XForwardedFor_SLBPORT</code> header is used to retrieve the listener port of the CLB instance. Valid values:</p>
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

        public DescribeLoadBalancerHTTPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerHTTPListenerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
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
             * <p>This parameter is returned when <strong>AclStatus</strong> is set to <strong>on</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>on</p>
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
     * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
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
             * <p>The domain name.</p>
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
             * <p>1234</p>
             */
            public Builder ruleId(String ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The request URL.</p>
             * 
             * <strong>example:</strong>
             * <p>/example</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The ID of the server group specified in the forwarding rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
     * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
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
     * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
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
             * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag key cannot be an empty string. The tag key can be up to 64 characters in length. The key cannot start with <code>acs:</code> or <code>aliyun</code> or contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string. The tag value must be 0 to 128 characters in length, and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
     * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
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
