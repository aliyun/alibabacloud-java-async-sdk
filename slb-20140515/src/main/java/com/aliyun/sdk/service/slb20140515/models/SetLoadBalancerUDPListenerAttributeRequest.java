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
 * {@link SetLoadBalancerUDPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerUDPListenerAttributeRequest</p>
 */
public class SetLoadBalancerUDPListenerAttributeRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckSwitch")
    private String healthCheckSwitch;

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
    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroup")
    private String masterSlaveServerGroup;

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
    @com.aliyun.core.annotation.NameInMap("healthCheckExp")
    private String healthCheckExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("healthCheckReq")
    private String healthCheckReq;

    private SetLoadBalancerUDPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckSwitch = builder.healthCheckSwitch;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroup = builder.masterSlaveServerGroup;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.proxyProtocolV2Enabled = builder.proxyProtocolV2Enabled;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroup = builder.vServerGroup;
        this.vServerGroupId = builder.vServerGroupId;
        this.healthCheckExp = builder.healthCheckExp;
        this.healthCheckReq = builder.healthCheckReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerUDPListenerAttributeRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckSwitch
     */
    public String getHealthCheckSwitch() {
        return this.healthCheckSwitch;
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
     * @return masterSlaveServerGroup
     */
    public String getMasterSlaveServerGroup() {
        return this.masterSlaveServerGroup;
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
     * @return healthCheckExp
     */
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    /**
     * @return healthCheckReq
     */
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public static final class Builder extends Request.Builder<SetLoadBalancerUDPListenerAttributeRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer bandwidth; 
        private String description; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private Integer healthCheckInterval; 
        private String healthCheckSwitch; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String masterSlaveServerGroup; 
        private String masterSlaveServerGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Boolean proxyProtocolV2Enabled; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private Integer unhealthyThreshold; 
        private String vServerGroup; 
        private String vServerGroupId; 
        private String healthCheckExp; 
        private String healthCheckReq; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerUDPListenerAttributeRequest request) {
            super(request);
            this.aclId = request.aclId;
            this.aclStatus = request.aclStatus;
            this.aclType = request.aclType;
            this.bandwidth = request.bandwidth;
            this.description = request.description;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckConnectTimeout = request.healthCheckConnectTimeout;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckSwitch = request.healthCheckSwitch;
            this.healthyThreshold = request.healthyThreshold;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.masterSlaveServerGroup = request.masterSlaveServerGroup;
            this.masterSlaveServerGroupId = request.masterSlaveServerGroupId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.proxyProtocolV2Enabled = request.proxyProtocolV2Enabled;
            this.regionId = request.regionId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduler = request.scheduler;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.vServerGroup = request.vServerGroup;
            this.vServerGroupId = request.vServerGroupId;
            this.healthCheckExp = request.healthCheckExp;
            this.healthCheckReq = request.healthCheckReq;
        } 

        /**
         * <p>The ID of the network access control list (ACL) that is associated with the listener.</p>
         * <blockquote>
         * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
         * <li><strong>off</strong>: no</li>
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
         * <p>The type of the network ACL. Valid values:</p>
         * <ul>
         * <li><p><strong>white</strong>: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists apply to scenarios where you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. After a whitelist is configured, only requests from IP addresses that are added to the whitelist are forwarded by the listener.</p>
         * <p>If you enable a whitelist but do not add an IP address to the ACL, the listener forwards all requests.</p>
         * </li>
         * <li><p><strong>black</strong>: a blacklist. All requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists apply to scenarios where you want to block access from specified IP addresses to an application.</p>
         * <p>If a blacklist is configured for a listener but no IP address is added to the blacklist, the listener forwards all requests.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p> If <strong>AclStatus</strong> is set to <strong>on</strong>, this parameter is required.</p>
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
         * <p>The maximum bandwidth of the listener. Unit: Mbit/s. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: For a pay-by-data-transfer Internet-facing CLB instance, you can set this parameter to <strong>-1</strong>. This way, the bandwidth of the listener is unlimited.</li>
         * <li><strong>1</strong> to <strong>5120</strong>: For a pay-by-bandwidth Internet-facing CLB instance, you can specify the maximum bandwidth of each listener. The sum of bandwidth limits that you set for all listeners cannot exceed the maximum bandwidth of the CLB instance.</li>
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
         * <p>The name of the listener.</p>
         * <p>The name must be 1 to 256 characters in length and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_).</p>
         * 
         * <strong>example:</strong>
         * <p>udp_80</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * <p>Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>The timeout period of a health check. If a backend server, such as an Elastic Compute Service (ECS) instance, does not return a health check response within the specified timeout period, the server fails the health check. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * <blockquote>
         * <p> If the value of the <strong>HealthCheckConnectTimeout</strong> parameter is smaller than that of the <strong>HealthCheckInterval</strong> parameter, the timeout period specified by the <strong>HealthCheckConnectTimeout</strong> parameter is ignored and the period of time specified by the <strong>HealthCheckInterval</strong> parameter is used as the timeout period.</p>
         * </blockquote>
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
         * <p>The interval at which health checks are performed. Unit: seconds.</p>
         * <p>Valid values: <strong>1</strong> to <strong>50</strong>.</p>
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
         * <p>The number of times that an unhealthy backend server must consecutively pass health checks before it can be declared healthy (from <strong>fail</strong> to <strong>success</strong>).</p>
         * <p>Valid values: <strong>1</strong> to <strong>10</strong>.</p>
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
         * <p>lb-bp1rtfnodmywb43ecu4sf-c****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>Specifies whether to use a primary/secondary server group. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: yes</li>
         * <li><strong>off</strong>: no</li>
         * </ul>
         * <blockquote>
         * <p> You cannot set <strong>VserverGroup</strong> and <strong>MasterSlaveServerGroup</strong> both to <strong>on</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder masterSlaveServerGroup(String masterSlaveServerGroup) {
            this.putQueryParameter("MasterSlaveServerGroup", masterSlaveServerGroup);
            this.masterSlaveServerGroup = masterSlaveServerGroup;
            return this;
        }

        /**
         * <p>The ID of the primary/secondary server group.</p>
         * <blockquote>
         * <p> You cannot specify both VServerGroupId and MasterSlaveServerGroupId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rsp-0bfuc****</p>
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
         * <p>The region ID of the CLB instance.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/36063.html">DescribeRegions</a> operation to query the most recent region list.</p>
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
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</p>
         * <p>If two backend servers have the same weight, the backend server that has fewer connections is expected to receive more requests.</p>
         * </li>
         * <li><p><strong>rr</strong>: Requests are distributed to backend servers in sequence.</p>
         * </li>
         * <li><p><strong>sch</strong>: specifies consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</p>
         * </li>
         * <li><p><strong>tch</strong>: specifies consistent hashing that is based on the following parameters: source IP address, destination IP address, source port, and destination port. Requests that contain the same preceding information are distributed to the same backend server.</p>
         * </li>
         * <li><p><strong>qch</strong>: specifies consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</p>
         * </li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>Only high-performance CLB instances support <strong>sch</strong>, <strong>tch</strong>, and <strong>qch</strong>.</li>
         * <li>You cannot switch the algorithm used by a CLB instance from <strong>wrr</strong> or <strong>rr</strong> to consistent hashing or from consistent hashing to weighted round robin or round robin.</li>
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
         * <p>The number of times that a healthy backend server must consecutively fail health checks before it is declared unhealthy. In this case, the health status is changed from <strong>success</strong> to <strong>fail</strong>.</p>
         * <p>Valid values: <strong>1</strong> to <strong>10</strong>.</p>
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
         * <blockquote>
         * <p> You cannot set both <strong>VserverGroup</strong> and <strong>MasterSlaveServerGroup</strong> to <strong>on</strong>.</p>
         * </blockquote>
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
         * <p>rsp-cige6****</p>
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * <p>The response string for UDP listener health checks. The string must be 1 to 64 characters in length and can contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.putQueryParameter("healthCheckExp", healthCheckExp);
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * <p>The request string for UDP listener health checks. The string must be 1 to 64 characters in length and can contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.putQueryParameter("healthCheckReq", healthCheckReq);
            this.healthCheckReq = healthCheckReq;
            return this;
        }

        @Override
        public SetLoadBalancerUDPListenerAttributeRequest build() {
            return new SetLoadBalancerUDPListenerAttributeRequest(this);
        } 

    } 

}
