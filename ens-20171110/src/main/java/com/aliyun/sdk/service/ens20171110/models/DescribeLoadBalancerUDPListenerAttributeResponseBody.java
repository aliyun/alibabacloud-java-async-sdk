// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerUDPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerUDPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerUDPListenerAttributeResponseBody extends TeaModel {
    @NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @NameInMap("Bandwidth")
    private Integer bandwidth;

    @NameInMap("Description")
    private String description;

    @NameInMap("EipTransmit")
    private String eipTransmit;

    @NameInMap("HealthCheck")
    private String healthCheck;

    @NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @NameInMap("HealthCheckConnectTimeout")
    private Integer healthCheckConnectTimeout;

    @NameInMap("HealthCheckExp")
    private String healthCheckExp;

    @NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @NameInMap("HealthCheckReq")
    private String healthCheckReq;

    @NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @NameInMap("ListenerPort")
    private Integer listenerPort;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scheduler")
    private String scheduler;

    @NameInMap("Status")
    private String status;

    @NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private DescribeLoadBalancerUDPListenerAttributeResponseBody(Builder builder) {
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckExp = builder.healthCheckExp;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckReq = builder.healthCheckReq;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.status = builder.status;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerUDPListenerAttributeResponseBody create() {
        return builder().build();
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
     * @return eipTransmit
     */
    public String getEipTransmit() {
        return this.eipTransmit;
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
     * @return unhealthyThreshold
     */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static final class Builder {
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String description; 
        private String eipTransmit; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckExp; 
        private Integer healthCheckInterval; 
        private String healthCheckReq; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String requestId; 
        private String scheduler; 
        private String status; 
        private Integer unhealthyThreshold; 

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
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * EipTransmit.
         */
        public Builder eipTransmit(String eipTransmit) {
            this.eipTransmit = eipTransmit;
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
         * HealthCheckConnectPort.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * HealthCheckConnectTimeout.
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * HealthCheckExp.
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * HealthCheckInterval.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * HealthCheckReq.
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
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
         * ListenerPort.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * Id of the request
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
         * UnhealthyThreshold.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public DescribeLoadBalancerUDPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerUDPListenerAttributeResponseBody(this);
        } 

    } 

}
