// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateLoadBalancerUDPListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerUDPListenerRequest</p>
 */
public class CreateLoadBalancerUDPListenerRequest extends Request {
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
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("HealthCheckConnectPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @Query
    @NameInMap("HealthCheckConnectTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

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
    @NameInMap("UnhealthyThreshold")
    @Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @Query
    @NameInMap("VServerGroupId")
    private String VServerGroupId;

    @Query
    @NameInMap("healthCheckExp")
    private String healthCheckExp;

    @Query
    @NameInMap("healthCheckInterval")
    @Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @Query
    @NameInMap("healthCheckReq")
    private String healthCheckReq;

    private CreateLoadBalancerUDPListenerRequest(Builder builder) {
        super(builder);
        this.aclId = builder.aclId;
        this.aclStatus = builder.aclStatus;
        this.aclType = builder.aclType;
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.VServerGroupId = builder.VServerGroupId;
        this.healthCheckExp = builder.healthCheckExp;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckReq = builder.healthCheckReq;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateLoadBalancerUDPListenerRequest create() {
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
     * @return VServerGroupId
     */
    public String getVServerGroupId() {
        return this.VServerGroupId;
    }

    /**
     * @return healthCheckExp
     */
    public String getHealthCheckExp() {
        return this.healthCheckExp;
    }

    /**
     * @return healthCheckInterval
     */
    public Integer getHealthCheckInterval() {
        return this.healthCheckInterval;
    }

    /**
     * @return healthCheckReq
     */
    public String getHealthCheckReq() {
        return this.healthCheckReq;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerUDPListenerRequest, Builder> {
        private String aclId; 
        private String aclStatus; 
        private String aclType; 
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String description; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String masterSlaveServerGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private Integer unhealthyThreshold; 
        private String VServerGroupId; 
        private String healthCheckExp; 
        private Integer healthCheckInterval; 
        private String healthCheckReq; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerUDPListenerRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.aclStatus = response.aclStatus;
            this.aclType = response.aclType;
            this.backendServerPort = response.backendServerPort;
            this.bandwidth = response.bandwidth;
            this.description = response.description;
            this.healthCheckConnectPort = response.healthCheckConnectPort;
            this.healthCheckConnectTimeout = response.healthCheckConnectTimeout;
            this.healthyThreshold = response.healthyThreshold;
            this.listenerPort = response.listenerPort;
            this.loadBalancerId = response.loadBalancerId;
            this.masterSlaveServerGroupId = response.masterSlaveServerGroupId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scheduler = response.scheduler;
            this.unhealthyThreshold = response.unhealthyThreshold;
            this.VServerGroupId = response.VServerGroupId;
            this.healthCheckExp = response.healthCheckExp;
            this.healthCheckInterval = response.healthCheckInterval;
            this.healthCheckReq = response.healthCheckReq;
        } 

        /**
         * AclId.
         */
        public Builder aclId(String aclId) {
            this.putQueryParameter("AclId", aclId);
            this.aclId = aclId;
            return this;
        }

        /**
         * AclStatus.
         */
        public Builder aclStatus(String aclStatus) {
            this.putQueryParameter("AclStatus", aclStatus);
            this.aclStatus = aclStatus;
            return this;
        }

        /**
         * AclType.
         */
        public Builder aclType(String aclType) {
            this.putQueryParameter("AclType", aclType);
            this.aclType = aclType;
            return this;
        }

        /**
         * BackendServerPort.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.putQueryParameter("BackendServerPort", backendServerPort);
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.putQueryParameter("Bandwidth", bandwidth);
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * HealthCheckConnectPort.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * HealthCheckConnectTimeout.
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * LoadBalancerId.
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * MasterSlaveServerGroupId.
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
         * RegionId.
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
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * VServerGroupId.
         */
        public Builder VServerGroupId(String VServerGroupId) {
            this.putQueryParameter("VServerGroupId", VServerGroupId);
            this.VServerGroupId = VServerGroupId;
            return this;
        }

        /**
         * healthCheckExp.
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.putQueryParameter("healthCheckExp", healthCheckExp);
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * healthCheckInterval.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("healthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * healthCheckReq.
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.putQueryParameter("healthCheckReq", healthCheckReq);
            this.healthCheckReq = healthCheckReq;
            return this;
        }

        @Override
        public CreateLoadBalancerUDPListenerRequest build() {
            return new CreateLoadBalancerUDPListenerRequest(this);
        } 

    } 

}
