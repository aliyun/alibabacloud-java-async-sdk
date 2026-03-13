// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20130221.models;

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
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer backendServerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    @com.aliyun.core.annotation.Validation(maximum = 5000)
    private Integer bandwidth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer connectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer connectTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

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
    @com.aliyun.core.annotation.NameInMap("Interval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerStatus")
    private String listenerStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxConnection")
    @com.aliyun.core.annotation.Validation(maximum = 5000000, minimum = 5000)
    private Integer maxConnection;

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
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("access_key_id")
    private String accessKeyId;

    private CreateLoadBalancerTCPListenerRequest(Builder builder) {
        super(builder);
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.connectPort = builder.connectPort;
        this.connectTimeout = builder.connectTimeout;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheck = builder.healthCheck;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.interval = builder.interval;
        this.listenerPort = builder.listenerPort;
        this.listenerStatus = builder.listenerStatus;
        this.loadBalancerId = builder.loadBalancerId;
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.maxConnection = builder.maxConnection;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.scheduler = builder.scheduler;
        this.tags = builder.tags;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
        this.accessKeyId = builder.accessKeyId;
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
     * @return connectPort
     */
    public Integer getConnectPort() {
        return this.connectPort;
    }

    /**
     * @return connectTimeout
     */
    public Integer getConnectTimeout() {
        return this.connectTimeout;
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
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return listenerPort
     */
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    /**
     * @return listenerStatus
     */
    public String getListenerStatus() {
        return this.listenerStatus;
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
     * @return maxConnection
     */
    public Integer getMaxConnection() {
        return this.maxConnection;
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
     * @return tags
     */
    public String getTags() {
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
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public static final class Builder extends Request.Builder<CreateLoadBalancerTCPListenerRequest, Builder> {
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private Integer connectPort; 
        private Integer connectTimeout; 
        private Integer establishedTimeout; 
        private String healthCheck; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer interval; 
        private Integer listenerPort; 
        private String listenerStatus; 
        private String loadBalancerId; 
        private String masterSlaveServerGroupId; 
        private Integer maxConnection; 
        private String ownerAccount; 
        private Long ownerId; 
        private Integer persistenceTimeout; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String scheduler; 
        private String tags; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 
        private String accessKeyId; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerTCPListenerRequest request) {
            super(request);
            this.backendServerPort = request.backendServerPort;
            this.bandwidth = request.bandwidth;
            this.connectPort = request.connectPort;
            this.connectTimeout = request.connectTimeout;
            this.establishedTimeout = request.establishedTimeout;
            this.healthCheck = request.healthCheck;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.interval = request.interval;
            this.listenerPort = request.listenerPort;
            this.listenerStatus = request.listenerStatus;
            this.loadBalancerId = request.loadBalancerId;
            this.masterSlaveServerGroupId = request.masterSlaveServerGroupId;
            this.maxConnection = request.maxConnection;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.persistenceTimeout = request.persistenceTimeout;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.scheduler = request.scheduler;
            this.tags = request.tags;
            this.unhealthyThreshold = request.unhealthyThreshold;
            this.vServerGroupId = request.vServerGroupId;
            this.accessKeyId = request.accessKeyId;
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
         * ConnectPort.
         */
        public Builder connectPort(Integer connectPort) {
            this.putQueryParameter("ConnectPort", connectPort);
            this.connectPort = connectPort;
            return this;
        }

        /**
         * ConnectTimeout.
         */
        public Builder connectTimeout(Integer connectTimeout) {
            this.putQueryParameter("ConnectTimeout", connectTimeout);
            this.connectTimeout = connectTimeout;
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
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
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
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * ListenerStatus.
         */
        public Builder listenerStatus(String listenerStatus) {
            this.putQueryParameter("ListenerStatus", listenerStatus);
            this.listenerStatus = listenerStatus;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * MaxConnection.
         */
        public Builder maxConnection(Integer maxConnection) {
            this.putQueryParameter("MaxConnection", maxConnection);
            this.maxConnection = maxConnection;
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
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
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
        public Builder vServerGroupId(String vServerGroupId) {
            this.putQueryParameter("VServerGroupId", vServerGroupId);
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        /**
         * access_key_id.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.putQueryParameter("access_key_id", accessKeyId);
            this.accessKeyId = accessKeyId;
            return this;
        }

        @Override
        public CreateLoadBalancerTCPListenerRequest build() {
            return new CreateLoadBalancerTCPListenerRequest(this);
        } 

    } 

}
