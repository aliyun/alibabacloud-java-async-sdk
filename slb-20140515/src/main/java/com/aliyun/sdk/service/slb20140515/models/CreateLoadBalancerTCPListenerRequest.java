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
 * {@link CreateLoadBalancerTCPListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerTCPListenerRequest</p>
 */
public class CreateLoadBalancerTCPListenerRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer backendServerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 5120)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionDrain")
    private String connectionDrain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionDrainTimeout")
    private Integer connectionDrainTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckSwitch")
    private String healthCheckSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProxyProtocolV2Enabled")
    private Boolean proxyProtocolV2Enabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("healthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    private CreateLoadBalancerTCPListenerRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.connectionDrain = builder.connectionDrain;
        this.connectionDrainTimeout = builder.connectionDrainTimeout;
        this.description = builder.description;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckSwitch = builder.healthCheckSwitch;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.proxyProtocolV2Enabled = builder.proxyProtocolV2Enabled;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.tag = builder.tag;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
        this.healthCheckInterval = builder.healthCheckInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerTCPListenerRequest create() {
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
     * @return healthCheckSwitch
     */
    public String getHealthCheckSwitch() {
        return this.healthCheckSwitch;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerTCPListenerRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String connectionDrain; 
        private Integer connectionDrainTimeout; 
        private String description; 
        private Integer establishedTimeout; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private String healthCheckSwitch; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String masterSlaveServerGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer persistenceTimeout; 
        private Boolean proxyProtocolV2Enabled; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private java.util.List<Tag> tag; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 
        private Integer healthCheckInterval; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerTCPListenerRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclStatus = request.aclStatus;
            this.aclType = request.aclType;
            this.backendServerPort = request.backendServerPort;
            this.bandwidth = request.bandwidth;
            this.connectionDrain = request.connectionDrain;
            this.connectionDrainTimeout = request.connectionDrainTimeout;
            this.description = request.description;
            this.establishedTimeout = request.establishedTimeout;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckConnectTimeout = request.healthCheckConnectTimeout;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckSwitch = request.healthCheckSwitch;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.masterSlaveServerGroupId = request.masterSlaveServerGroupId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.persistenceTimeout = request.persistenceTimeout;
            this.proxyProtocolV2Enabled = request.proxyProtocolV2Enabled;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduler = request.scheduler;
            this.tag = request.tag;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.vServerGroupId = request.vServerGroupId;
            this.healthCheckInterval = request.healthCheckInterval;
        } 

        /**
         * <p>The ID of the network ACL that is associated with the listener.</p>
         * <blockquote>
         * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1323</p>
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * <p>Specifies whether to enable access control. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong> (default): no</li>
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
         * <p>The type of the ACL. Valid values:</p>
         * <ul>
         * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application.</p>
         * <p>Your service may be adversely affected if the whitelist is not properly configured.</p>
         * <p>If a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener. If a whitelist is configured but no IP address is added to the whitelist, the listener forwards all requests.</p>
         * </li>
         * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
         * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>black</p>
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * <p>The backend port used by the CLB instance.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>If the <strong>VServerGroupId</strong> parameter is not set, this parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.putQueryParameter("BackendServerPort", backendServerPort);
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: For a pay-by-data-transfer Internet-facing CLB instance, this value can be set to -1, which specifies unlimited bandwidth.</li>
         * <li><strong>1</strong> to <strong>5120</strong>: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth values that you set for all listeners cannot exceed the maximum bandwidth of the CLB instance.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>Specifies whether to enable connection draining. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder connectionDrain(String connectionDrain) {
            this.putQueryParameter("ConnectionDrain", connectionDrain);
            this.connectionDrain = connectionDrain;
            return this;
        }

        /**
         * <p>The timeout period of connection draining. Unit: seconds.</p>
         * <p>Valid values: <strong>10</strong> to <strong>900</strong>.</p>
         * <blockquote>
         * <p> This parameter is required if <strong>ConnectionDrain</strong> is set to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            this.putQueryParameter("ConnectionDrainTimeout", connectionDrainTimeout);
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }

        /**
         * <p>The name of the listener.</p>
         * <p>The name must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_80</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The timeout period of a connection. Unit: seconds.</p>
         * <p>Valid values: <strong>10</strong> to <strong>900</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <p>If this parameter is not set, the backend port specified by <strong>BackendServerPort</strong> is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The maximum timeout period of a health check response. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <p>Default value: <strong>5</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * <p>The domain name that you want to use for health checks. Valid values:</p>
         * <ul>
         * <li><strong>$_ip</strong>: the private IP address of a backend server. If you do not set the HealthCheckDomain parameter or set the parameter to $_ip, the CLB instance uses the private IP address of each backend server for health checks.</li>
         * <li><strong>domain</strong>: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.6</p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code for a successful health check. Separate multiple HTTP status codes with commas (,). Valid values:</p>
         * <ul>
         * <li><strong>http_2xx</strong>(default)</li>
         * <li><strong>http_3xx</strong></li>
         * <li><strong>http_4xx</strong></li>
         * <li><strong>http_5xx</strong></li>
         * </ul>
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
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li><strong>on</strong> (default): yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder healthCheckSwitch(String healthCheckSwitch) {
            this.putQueryParameter("HealthCheckSwitch", healthCheckSwitch);
            this.healthCheckSwitch = healthCheckSwitch;
            return this;
        }

        /**
         * <p>The type of health checks. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong> (default)</li>
         * <li><strong>http</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * <p>The URI that is used for health checks. The URI must be 1 to 80 characters in length, and can contain only digits, letters, hyphens (-), forward slashes (/), periods (.), percent signs (%), number signs (#), and ampersands (&amp;). The URI must start with a forward slash (/) but cannot be a single forward slash (/).</p>
         * <p>You can set this parameter when the TCP listener requires HTTP health checks. If you do not set this parameter, TCP health checks are performed.</p>
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
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from <strong>fail</strong> to <strong>success</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>The frontend port used by the CLB instance.</p>
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
         * <p>lb-bp1b6c719dfa08ex****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The ID of the primary/secondary server group.</p>
         * <blockquote>
         * <p> You cannot set both VServerGroupId and MasterSlaveServerGroupId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rsp-0bfucw****</p>
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.putQueryParameter("MasterSlaveServerGroupId", masterSlaveServerGroupId);
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
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
         * <p>The timeout period of session persistence. Unit: seconds.</p>
         * <p>Valid values: <strong>0 to 3600</strong>.</p>
         * <p>Default value: <strong>0</strong>. If the default value is used, the system disables session persistence.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.putQueryParameter("PersistenceTimeout", persistenceTimeout);
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong> (default): no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder proxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
            this.putQueryParameter("ProxyProtocolV2Enabled", proxyProtocolV2Enabled);
            this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            return this;
        }

        /**
         * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
         * <p>You can query the region ID from the <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a> list or by calling the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation.</p>
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
         * <p>The routing algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong> (default): Backend servers with higher weights receive more requests than backend servers with lower weights.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * <li><strong>sch</strong>: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>tch</strong>: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.</li>
         * </ul>
         * <blockquote>
         * <p> Only high-performance CLB instances support the <strong>sch</strong> and <strong>tch</strong> consistent hashing algorithms.</p>
         * </blockquote>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("healthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        @Override
        public CreateLoadBalancerTCPListenerRequest build() {
            return new CreateLoadBalancerTCPListenerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateLoadBalancerTCPListenerRequest} extends {@link TeaModel}
     *
     * <p>CreateLoadBalancerTCPListenerRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.</p>
             * <p>The tag key must be 1 to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.</p>
             * <p>The tag value can be at most 128 characters in length and cannot start with <code>acs:</code> or <code>aliyun</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>TestValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
