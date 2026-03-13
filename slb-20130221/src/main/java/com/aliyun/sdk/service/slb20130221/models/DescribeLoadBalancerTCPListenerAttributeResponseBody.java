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
 * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("ConnectPort")
    private Integer connectPort;

    @com.aliyun.core.annotation.NameInMap("ConnectTimeout")
    private Integer connectTimeout;

    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("Interval")
    private Integer interval;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("MasterSlaveServerGroupId")
    private String masterSlaveServerGroupId;

    @com.aliyun.core.annotation.NameInMap("MaxConnection")
    private Integer maxConnection;

    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SynProxy")
    private String synProxy;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("VServerGroupId")
    private String vServerGroupId;

    private DescribeLoadBalancerTCPListenerAttributeResponseBody(Builder builder) {
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
        this.masterSlaveServerGroupId = builder.masterSlaveServerGroupId;
        this.maxConnection = builder.maxConnection;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.status = builder.status;
        this.synProxy = builder.synProxy;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.vServerGroupId = builder.vServerGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerTCPListenerAttributeResponseBody create() {
        return builder().build();
    }

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
     * @return persistenceTimeout
     */
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
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
        private String masterSlaveServerGroupId; 
        private Integer maxConnection; 
        private Integer persistenceTimeout; 
        private String requestId; 
        private String scheduler; 
        private String status; 
        private String synProxy; 
        private Integer unhealthyThreshold; 
        private String vServerGroupId; 

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerTCPListenerAttributeResponseBody model) {
            this.backendServerPort = model.backendServerPort;
            this.bandwidth = model.bandwidth;
            this.connectPort = model.connectPort;
            this.connectTimeout = model.connectTimeout;
            this.establishedTimeout = model.establishedTimeout;
            this.healthCheck = model.healthCheck;
            this.healthCheckDomain = model.healthCheckDomain;
            this.healthCheckHttpCode = model.healthCheckHttpCode;
            this.healthCheckType = model.healthCheckType;
            this.healthCheckURI = model.healthCheckURI;
            this.healthyThreshold = model.healthyThreshold;
            this.interval = model.interval;
            this.listenerPort = model.listenerPort;
            this.masterSlaveServerGroupId = model.masterSlaveServerGroupId;
            this.maxConnection = model.maxConnection;
            this.persistenceTimeout = model.persistenceTimeout;
            this.requestId = model.requestId;
            this.scheduler = model.scheduler;
            this.status = model.status;
            this.synProxy = model.synProxy;
            this.unhealthyThreshold = model.unhealthyThreshold;
            this.vServerGroupId = model.vServerGroupId;
        } 

        /**
         * BackendServerPort.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * Bandwidth.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * ConnectPort.
         */
        public Builder connectPort(Integer connectPort) {
            this.connectPort = connectPort;
            return this;
        }

        /**
         * ConnectTimeout.
         */
        public Builder connectTimeout(Integer connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }

        /**
         * EstablishedTimeout.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * HealthCheck.
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * HealthCheckDomain.
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * HealthCheckHttpCode.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * HealthCheckType.
         */
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * HealthCheckURI.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * HealthyThreshold.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.interval = interval;
            return this;
        }

        /**
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * MasterSlaveServerGroupId.
         */
        public Builder masterSlaveServerGroupId(String masterSlaveServerGroupId) {
            this.masterSlaveServerGroupId = masterSlaveServerGroupId;
            return this;
        }

        /**
         * MaxConnection.
         */
        public Builder maxConnection(Integer maxConnection) {
            this.maxConnection = maxConnection;
            return this;
        }

        /**
         * PersistenceTimeout.
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scheduler.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * SynProxy.
         */
        public Builder synProxy(String synProxy) {
            this.synProxy = synProxy;
            return this;
        }

        /**
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * VServerGroupId.
         */
        public Builder vServerGroupId(String vServerGroupId) {
            this.vServerGroupId = vServerGroupId;
            return this;
        }

        public DescribeLoadBalancerTCPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerTCPListenerAttributeResponseBody(this);
        } 

    } 

}
