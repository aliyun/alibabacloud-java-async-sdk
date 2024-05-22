// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLoadBalancerTCPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerTCPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerTCPListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EipTransmit")
    private String eipTransmit;

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

    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private DescribeLoadBalancerTCPListenerAttributeResponseBody(Builder builder) {
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.requestId = builder.requestId;
        this.scheduler = builder.scheduler;
        this.status = builder.status;
        this.unhealthyThreshold = builder.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerTCPListenerAttributeResponseBody create() {
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
        private Integer establishedTimeout; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private Integer persistenceTimeout; 
        private String requestId; 
        private String scheduler; 
        private String status; 
        private Integer unhealthyThreshold; 

        /**
         * The backend port that is used by the ELB instance. Valid values: **1** to **65535**.
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * The maximum bandwidth of the elastic IP address (EIP). Default value: 5. Valid values: **5** to **10000**. Unit: Mbit/s.
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * The description of the listener.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether EIP pass-through is enabled. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off** (default)
         */
        public Builder eipTransmit(String eipTransmit) {
            this.eipTransmit = eipTransmit;
            return this;
        }

        /**
         * The timeout period of a connection. Valid values: **10** to **900**. Unit: seconds.
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * Indicates whether the health check feature is enabled. Valid values:
         * <p>
         * 
         * *   **on**
         * *   **off**
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * The port that is used for health checks. Valid values: **1** to **65535**. If an empty string is returned for this parameter, the port specified by BackendServerPort is used for health checks.
         * <p>
         * 
         * >  This parameter is returned only if you set HealthCheck to on.
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * The timeout period of a health check response. If a backend server does not respond within the specified timeout period, the server fails to pass the health check.
         * <p>
         * 
         * *   Default value: 5.
         * *   Valid values: **1** to **300**.
         * *   Unit: seconds.
         * 
         * > 
         * 
         * *   This parameter is returned only if you set HealthCheck to on.
         * 
         * *   If the value of the HealthCheckConnectTimeout parameter is smaller than that of the HealthCheckInterval parameter, the timeout period specified by the HealthCheckConnectTimeout parameter becomes invalid and the value of the HealthCheckInterval parameter is used as the timeout period.
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * The domain name that is used for health checks.
         * <p>
         * 
         * >  This parameter is returned only if you set HealthCheck to on.
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * The HTTP status codes for a successful health check. Valid values:
         * <p>
         * 
         * *   **http\_2xx** (default)
         * *   **http\_3xx**
         * *   **http\_4xx**
         * *   **http\_5xx**
         * 
         * >  This parameter is returned only if you set HealthCheck to on.
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * The interval at which health checks are performed. Valid values: **1** to **50**. Unit: seconds.
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
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
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * The Uniform Resource Identifier (URI) that is used for health checks. The URI must be **1** to **80** characters in length.
         * <p>
         * 
         * > 
         * 
         * *   The URL must start with a forward slash (`/`) and contain characters other than forward slashes (`/`).
         * 
         * *   This parameter is returned only if you set HealthCheck to on.
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: **2** to **10**.
         * <p>
         * 
         * >  This parameter is returned only if you set HealthCheck to on.
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * The frontend port that is used by the ELB instance.
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * The timeout period of session persistence.
         * <p>
         * 
         * *   Default value: 0. If the default value is used, the system disables session persistence.
         * *   Valid values: **0** to **3600**.
         * *   Unit: seconds.
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The routing algorithm. Valid values:
         * <p>
         * 
         * *   **wrr**: Backend servers with higher weights receive more requests than those with lower weights.
         * *   **wlc**: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections to a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.
         * *   **rr**: Requests are distributed to backend servers in sequence.
         * *   **sch**: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.
         * *   **qch**: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.
         * *   **iqch**: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * The status of the listener. Valid values:
         * <p>
         * 
         * *   **Running**
         * *   **Stopped**
         * *   **Starting**
         * *   **Configuring**
         * *   **Stopping**
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: **2** to **10**.
         * <p>
         * 
         * >  This parameter is returned only if you set HealthCheck to on.
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public DescribeLoadBalancerTCPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerTCPListenerAttributeResponseBody(this);
        } 

    } 

}
