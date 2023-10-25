// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerTCPListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerTCPListenerRequest</p>
 */
public class CreateLoadBalancerTCPListenerRequest extends Request {
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
    @NameInMap("BackendServerPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer backendServerPort;

    @Query
    @NameInMap("Bandwidth")
    @Validation(required = true, maximum = 5120)
    private Integer bandwidth;

    @Query
    @NameInMap("ConnectionDrain")
    private String connectionDrain;

    @Query
    @NameInMap("ConnectionDrainTimeout")
    private Integer connectionDrainTimeout;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EstablishedTimeout")
    @Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @Query
    @NameInMap("HealthCheckConnectPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @Query
    @NameInMap("HealthCheckConnectTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @Query
    @NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @Query
    @NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @Query
    @NameInMap("HealthCheckSwitch")
    private String healthCheckSwitch;

    @Query
    @NameInMap("HealthCheckType")
    private String healthCheckType;

    @Query
    @NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @Query
    @NameInMap("HealthyThreshold")
    @Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535)
    private Integer listenerPort;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @Query
    @NameInMap("OwnerAccount")
    private String ownerAccount;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PersistenceTimeout")
    @Validation(maximum = 3600)
    private Integer persistenceTimeout;

    @Query
    @NameInMap("ProxyProtocolV2Enabled")
    private Boolean proxyProtocolV2Enabled;

    @Query
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("UnhealthyThreshold")
    @Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @Query
    @NameInMap("VServerGroupId")
    private String vServerGroupId;

    @Query
    @NameInMap("healthCheckInterval")
    @Validation(maximum = 50, minimum = 1)
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
    public java.util.List < Tag> getTag() {
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
        private java.util.List < Tag> tag; 
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
         * The ID of the network ACL that is associated with the listener.
         * <p>
         * 
         * >  If **AclStatus** is set to **on**, this parameter is required.
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
         * *   **on**: yes
         * *   **off** (default): no
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * The type of the ACL. Valid values:
         * <p>
         * 
         * *   **white**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application.
         * 
         *     Your service may be adversely affected if the whitelist is not properly configured.
         * 
         *     If a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener. If a whitelist is configured but no IP address is added to the whitelist, the listener forwards all requests.
         * 
         * *   **black**: a blacklist. All requests from the IP addresses or CIDR blocks in the ACL are rejected. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.
         * 
         *     If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.
         * 
         * >  If **AclStatus** is set to **on**, this parameter is required.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * The backend port used by the CLB instance.
         * <p>
         * 
         * Valid values: **1** to **65535**.
         * 
         * If the **VServerGroupId** parameter is not set, this parameter is required.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.putQueryParameter("BackendServerPort", backendServerPort);
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:
         * <p>
         * 
         * *   **-1**: For a pay-by-data-transfer Internet-facing CLB instance, this value can be set to -1, which specifies unlimited bandwidth.
         * *   **1** to **5120**: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of the maximum bandwidth values that you set for all listeners cannot exceed the maximum bandwidth of the CLB instance.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * Specifies whether to enable connection draining. Valid values:
         * <p>
         * 
         * *   **on**: yes
         * *   **off**: no
         */
        public Builder connectionDrain(String connectionDrain) {
            this.putQueryParameter("ConnectionDrain", connectionDrain);
            this.connectionDrain = connectionDrain;
            return this;
        }

        /**
         * The timeout period of connection draining. Unit: seconds.
         * <p>
         * 
         * Valid values: **10** to **900**.
         * 
         * >  This parameter is required if **ConnectionDrain** is set to **on**.
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            this.putQueryParameter("ConnectionDrainTimeout", connectionDrainTimeout);
            this.connectionDrainTimeout = connectionDrainTimeout;
            return this;
        }

        /**
         * The name of the listener.
         * <p>
         * 
         * The name must be 1 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_).
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The timeout period of a connection. Unit: seconds.
         * <p>
         * 
         * Valid values: **10** to **900**.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * The port that is used for health checks.
         * <p>
         * 
         * Valid values: **1** to **65535**.
         * 
         * If this parameter is not set, the backend port specified by **BackendServerPort** is used for health checks.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * The maximum timeout period of a health check response. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **300**.
         * 
         * Default value: **5**.
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * The domain name that you want to use for health checks. Valid values:
         * <p>
         * 
         * *   **$\_ip**: the private IP address of a backend server. If you do not set the HealthCheckDomain parameter or set the parameter to $\_ip, the CLB instance uses the private IP address of each backend server for health checks.
         * *   **domain**: The domain name must be 1 to 80 characters in length, and can contain letters, digits, periods (.), and hyphens (-).
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * The HTTP status code for a successful health check. Separate multiple HTTP status codes with commas (,). Valid values:
         * <p>
         * 
         * *   **http\_2xx**(default)
         * *   **http\_3xx**
         * *   **http\_4xx**
         * *   **http\_5xx**
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * Specifies whether to enable the health check feature. Valid values:
         * <p>
         * 
         * *   **on** (default): yes
         * *   **off**: no
         */
        public Builder healthCheckSwitch(String healthCheckSwitch) {
            this.putQueryParameter("HealthCheckSwitch", healthCheckSwitch);
            this.healthCheckSwitch = healthCheckSwitch;
            return this;
        }

        /**
         * The type of health checks. Valid values:
         * <p>
         * 
         * *   **tcp** (default)
         * *   **http**
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * The URI that is used for health checks. The URI must be 1 to 80 characters in length, and can contain only digits, letters, hyphens (-), forward slashes (/), periods (.), percent signs (%), number signs (#), and ampersands (&). The URI must start with a forward slash (/) but cannot be a single forward slash (/).
         * <p>
         * 
         * You can set this parameter when the TCP listener requires HTTP health checks. If you do not set this parameter, TCP health checks are performed.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * The number of times that an unhealthy backend server must consecutively pass health checks before it is declared healthy. In this case, the health status is changed from **fail** to **success**.
         * <p>
         * 
         * Valid values: **2** to **10**.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * The frontend port used by the CLB instance.
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
         * The ID of the primary/secondary server group.
         * <p>
         * 
         * >  You cannot set both VServerGroupId and MasterSlaveServerGroupId.
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
         * The timeout period of session persistence. Unit: seconds.
         * <p>
         * 
         * Valid values: **0 to 3600**.
         * 
         * Default value: **0**. If the default value is used, the system disables session persistence.
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.putQueryParameter("PersistenceTimeout", persistenceTimeout);
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * Specifies whether to use the Proxy protocol to pass client IP addresses to backend servers. Valid values:
         * <p>
         * 
         * *   **true**: yes
         * *   **false** (default): no
         */
        public Builder proxyProtocolV2Enabled(Boolean proxyProtocolV2Enabled) {
            this.putQueryParameter("ProxyProtocolV2Enabled", proxyProtocolV2Enabled);
            this.proxyProtocolV2Enabled = proxyProtocolV2Enabled;
            return this;
        }

        /**
         * The ID of the region where the Classic Load Balancer (CLB) instance is deployed.
         * <p>
         * 
         * You can query the region ID from the [Regions and zones](~~40654~~) list or by calling the [DescribeRegions](~~25609~~) operation.
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
         * The routing algorithm. Valid values:
         * <p>
         * 
         * *   **wrr** (default): Backend servers with higher weights receive more requests than backend servers with lower weights.
         * *   **rr**: Requests are distributed to backend servers in sequence.
         * *   **sch**: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.
         * *   **tch**: specifies consistent hashing that is based on four factors: source IP address, destination IP address, source port, and destination port. Requests that contain the same information based on the four factors are distributed to the same backend server.
         * 
         * >  Only high-performance CLB instances support the **sch** and **tch** consistent hashing algorithms.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * The tags.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from **success** to **fail**.
         * <p>
         * 
         * Valid values: **2** to **10**.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
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
         * The interval between two consecutive health checks. Unit: seconds.
         * <p>
         * 
         * Valid values: **1** to **50**.
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

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * The key of the tag. You can specify up to 20 tag keys. The tag key cannot be an empty string.
             * <p>
             * 
             * The tag key must be 1 to 64 characters in length and cannot start with `aliyun` or `acs:`. It cannot contain `http://` or `https://`.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the tag. You can specify up to 20 tag values. The tag value can be an empty string.
             * <p>
             * 
             * The tag value can be at most 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.
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
