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
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.regionId = builder.regionId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.VServerGroupId = builder.VServerGroupId;
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
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String masterSlaveServerGroupId; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer persistenceTimeout; 
        private String regionId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private Integer unhealthyThreshold; 
        private String VServerGroupId; 
        private Integer healthCheckInterval; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerTCPListenerRequest response) {
            super(response);
            this.aclId = response.aclId;
            this.aclStatus = response.aclStatus;
            this.aclType = response.aclType;
            this.backendServerPort = response.backendServerPort;
            this.bandwidth = response.bandwidth;
            this.connectionDrain = response.connectionDrain;
            this.connectionDrainTimeout = response.connectionDrainTimeout;
            this.description = response.description;
            this.establishedTimeout = response.establishedTimeout;
            this.healthCheckConnectPort = response.healthCheckConnectPort;
            this.healthCheckConnectTimeout = response.healthCheckConnectTimeout;
            this.healthCheckDomain = response.healthCheckDomain;
            this.healthCheckHttpCode = response.healthCheckHttpCode;
            this.healthCheckType = response.healthCheckType;
            this.healthCheckURI = response.healthCheckURI;
            this.healthyThreshold = response.healthyThreshold;
            this.listenerPort = response.listenerPort;
            this.loadBalancerId = response.loadBalancerId;
            this.masterSlaveServerGroupId = response.masterSlaveServerGroupId;
            this.ownerAccount = response.ownerAccount;
            this.ownerId = response.ownerId;
            this.persistenceTimeout = response.persistenceTimeout;
            this.regionId = response.regionId;
            this.resourceOwnerAccount = response.resourceOwnerAccount;
            this.resourceOwnerId = response.resourceOwnerId;
            this.scheduler = response.scheduler;
            this.unhealthyThreshold = response.unhealthyThreshold;
            this.VServerGroupId = response.VServerGroupId;
            this.healthCheckInterval = response.healthCheckInterval;
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
         * ConnectionDrain.
         */
        public Builder connectionDrain(String connectionDrain) {
            this.putQueryParameter("ConnectionDrain", connectionDrain);
            this.connectionDrain = connectionDrain;
            return this;
        }

        /**
         * ConnectionDrainTimeout.
         */
        public Builder connectionDrainTimeout(Integer connectionDrainTimeout) {
            this.putQueryParameter("ConnectionDrainTimeout", connectionDrainTimeout);
            this.connectionDrainTimeout = connectionDrainTimeout;
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
         * EstablishedTimeout.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
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
         * HealthCheckDomain.
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * HealthCheckHttpCode.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * HealthCheckType.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * HealthCheckURI.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
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
         * PersistenceTimeout.
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.putQueryParameter("PersistenceTimeout", persistenceTimeout);
            this.persistenceTimeout = persistenceTimeout;
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
         * healthCheckInterval.
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

}
