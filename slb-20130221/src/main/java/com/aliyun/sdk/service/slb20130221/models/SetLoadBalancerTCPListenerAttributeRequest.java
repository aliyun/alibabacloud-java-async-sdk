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
 * {@link SetLoadBalancerTCPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerTCPListenerAttributeRequest</p>
 */
public class SetLoadBalancerTCPListenerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectPort")
    private Integer connectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
    private Integer connectTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HostId")
    private String hostId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerAccount")
    private String ownerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 1)
    private Integer unhealthyThreshold;

    private SetLoadBalancerTCPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.connectPort = builder.connectPort;
        this.connectTimeout = builder.connectTimeout;
        this.healthCheck = builder.healthCheck;
        this.healthyThreshold = builder.healthyThreshold;
        this.hostId = builder.hostId;
        this.interval = builder.interval;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.ownerAccount = builder.ownerAccount;
        this.ownerId = builder.ownerId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetLoadBalancerTCPListenerAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return healthCheck
     */
    public String getHealthCheck() {
        return this.healthCheck;
    }

    /**
     * @return healthyThreshold
     */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }

    /**
     * @return hostId
     */
    public String getHostId() {
        return this.hostId;
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
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
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

    public static final class Builder extends Request.Builder<SetLoadBalancerTCPListenerAttributeRequest, Builder> {
        private Integer connectPort; 
        private Integer connectTimeout; 
        private String healthCheck; 
        private Integer healthyThreshold; 
        private String hostId; 
        private Integer interval; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String ownerAccount; 
        private String ownerId; 
        private Integer persistenceTimeout; 
        private String scheduler; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(SetLoadBalancerTCPListenerAttributeRequest request) {
            super(request);
            this.connectPort = request.connectPort;
            this.connectTimeout = request.connectTimeout;
            this.healthCheck = request.healthCheck;
            this.healthyThreshold = request.healthyThreshold;
            this.hostId = request.hostId;
            this.interval = request.interval;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.ownerAccount = request.ownerAccount;
            this.ownerId = request.ownerId;
            this.persistenceTimeout = request.persistenceTimeout;
            this.scheduler = request.scheduler;
            this.unhealthyThreshold = request.unhealthyThreshold;
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
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.putQueryParameter("HealthCheck", healthCheck);
            this.healthCheck = healthCheck;
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
         * HostId.
         */
        public Builder hostId(String hostId) {
            this.putQueryParameter("HostId", hostId);
            this.hostId = hostId;
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
        public Builder ownerId(String ownerId) {
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

        @Override
        public SetLoadBalancerTCPListenerAttributeRequest build() {
            return new SetLoadBalancerTCPListenerAttributeRequest(this);
        } 

    } 

}
