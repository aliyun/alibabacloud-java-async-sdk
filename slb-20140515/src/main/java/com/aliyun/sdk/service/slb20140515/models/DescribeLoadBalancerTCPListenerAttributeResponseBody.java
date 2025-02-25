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
 * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("ConnectionDrain")
    private String connectionDrain;

    @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
    private Integer connectionDrainTimeout;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
    private Integer healthCheckConnectTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Enabled")
    private Boolean proxyProtocolV2Enabled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SynProxy")
    private String synProxy;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    private DescribeLoadBalancerTCPListenerAttributeResponseBody(Builder builder) {
        this.aclId = builder.aclId;
        this.aclIds = builder.aclIds;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.connectionDrain = builder.connectionDrain;
        this.connectionDrainTimeout = builder.connectionDrainTimeout;
        this.description = builder.description;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.proxyProtocolV2Enabled = builder.proxyProtocolV2Enabled;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.status = builder.status;
        this.synProxy = builder.synProxy;
        this.tags = builder.tags;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerTCPListenerAttributeResponseBody create() {
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
     * @return connectionDrain
     */
    public String getConnectionDrain() {
        return this.connectionDrain;
    }

    /**
     * @return connectionDrainTimeout
     */
    public Integer getConnectionDrainTimeout() {
        return this.connectionDrainTimeout;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return establishedTimeout
     */
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
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
     * @return healthCheckConnectTimeout
     */
    public Integer getHealthCheckConnectTimeout() {
        return this.healthCheckConnectTimeout;
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
     * @return healthCheckType
     */
    public String getHealthCheckType() {
        return this.healthCheckType;
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
     * @return masterSlaveServerGroupId
     */
    public String getMasterSlaveServerGroupId() {
        return this.masterSlaveServerGroupId;
    }

    /**
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    /**
     * @return proxyProtocolV2Enabled
     */
    public Boolean getProxyProtocolV2Enabled() {
        return this.proxyProtocolV2Enabled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return synProxy
     */
    public String getSynProxy() {
        return this.synProxy;
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

    public static final class Builder {
        private String aclId; 
        private AclIds aclIds; 
        private String aclStatus; 
        private String aclType; 
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String connectionDrain; 
        private Integer connectionDrainTimeout; 
        private String description; 
        private Integer establishedTimeout; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String masterSlaveServerGroupId; 
        private Integer persistenceTimeout; 
        private Boolean proxyProtocolV2Enabled; 
        private String requestId; 
        private String scheduler; 
        private String status; 
        private String synProxy; 
        private Tags tags; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 

        /**
         * <p>The ID of the network ACL that is associated with the listener.</p>
         * <p>If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-uf60jwfi******</p>
         */
        public Builder aclId(String aclId) {
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>The IDs of the ACLs.</p>
         */
        public Builder aclIds(AclIds aclIds) {
            this.aclIds = aclIds;
            return this;
        }

        /**
         * <p>Indicates whether access control is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
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
         * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios in which you want to allow only specific IP addresses to access an application.</p>
         * <p>Your service may be adversely affected if the whitelist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
         * <p>If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
         * </li>
         * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are rejected. Blacklists apply to scenarios in which you want to block access from specified IP addresses to an application.</p>
         * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is returned.</p>
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
         * <p>The backend port used by the CLB instance.</p>
         * <blockquote>
         * <p> If the listener is associated with a vServer group, this parameter is not returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: For a pay-by-data-transfer Internet-facing CLB instance, this parameter is set to -1. This indicates that the bandwidth of the listener is unlimited.</li>
         * <li><strong>1</strong> to <strong>5120</strong>: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of maximum bandwidth of all listeners cannot exceed the maximum bandwidth of the CLB instance.</li>
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
         * <p>Indicates whether connection draining is enabled. If <strong>ConnectionDrain</strong> is set to <strong>on</strong>, the parameter is returned. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder connectionDrain(String connectionDrain) {
            this.connectionDrain = connectionDrain;
            return this;
        }

        /**
         * <p>The timeout period of connection draining. If <strong>ConnectionDrain</strong> is set to <strong>on</strong>, the parameter is returned.</p>
         * <p>Valid values: 10 to 900. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }

        /**
         * <p>The description of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>TCP listener</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The timeout period of a connection.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
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
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If this parameter is not set, the port specified by BackendServerPort is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * <p>The domain name that is used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$_ip</strong>: the private IP addresses of backend servers. If you do not set the HealthCheckDomain parameter or set the parameter to $_ip, the CLB instance uses the private IP address of each backend server for health checks.</li>
         * <li><strong>domain</strong>: The domain name is 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
         * </ul>
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
         * <p>http_2xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval between two consecutive health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The health check method.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The health check method that is used by the TCP listener.</p>
         * <p>Valid values: <strong>tcp</strong> and <strong>http</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * <p>The URL that is used for health checks. The URL must be 1 to 80 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), percent signs (%), question marks (?), number signs (#), and ampersands (&amp;). The URL is not a single forward slash (/) but it starts with a forward slash (/).</p>
         * 
         * <strong>example:</strong>
         * <p>/test/index.html</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The healthy threshold. The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The frontend port used by the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the CLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-bp1ygod3yctvg1y****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The ID of the primary/secondary server group that is associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-0bfucw****</p>
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * <p>The timeout period of session persistence.</p>
         * <p>Valid values: <strong>0</strong> to <strong>3600</strong>. Unit: seconds. Default value: <strong>0</strong>. If the default value is used, the system disables session persistence.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * <p>Indicates whether the Proxy protocol is used to pass client IP addresses to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder proxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
            this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scheduling algorithm.</p>
         * <ul>
         * <li><strong>wrr</strong> (default): Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * <li><strong>sch</strong>: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>tch</strong>: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p>Only high-performance CLB instances support the sch and tch algorithms.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
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
         * <p>Indicates whether the SynProxy feature of CLB is enabled for protection.</p>
         * <p>We recommend that you use the default value of this parameter. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder synProxy(String synProxy) {
            this.synProxy = synProxy;
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
         * <p>The unhealthy threshold. The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>rsp-cige6******8</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        public DescribeLoadBalancerTCPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerTCPListenerAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
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
             * <p>The ID of the network ACL that is associated with the listener.</p>
             * <p>If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>acl-uf60jwfi******</p>
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
     * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
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
             * <p>The key of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value cannot be an empty string. The tag key can be up to 128 characters in length, and cannot contain <code>http://</code> or <code>https://</code>. It cannot start with <code>acs:</code> or <code>aliyun</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The value of tag N. Valid values of N: <strong>1</strong> to <strong>20</strong>. The tag value can be an empty string. The tag value can be up to 128 characters in length, and cannot start with <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
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
     * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
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
