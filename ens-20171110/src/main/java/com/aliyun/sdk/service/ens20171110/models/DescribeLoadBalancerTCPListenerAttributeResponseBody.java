// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerTCPListenerAttributeResponseBody model) {
            this.backendServerPort = model.backendServerPort;
            this.bandwidth = model.bandwidth;
            this.description = model.description;
            this.eipTransmit = model.eipTransmit;
            this.establishedTimeout = model.establishedTimeout;
            this.healthCheck = model.healthCheck;
            this.healthCheckConnectPort = model.healthCheckConnectPort;
            this.healthCheckConnectTimeout = model.healthCheckConnectTimeout;
            this.healthCheckDomain = model.healthCheckDomain;
            this.healthCheckHttpCode = model.healthCheckHttpCode;
            this.healthCheckInterval = model.healthCheckInterval;
            this.healthCheckType = model.healthCheckType;
            this.healthCheckURI = model.healthCheckURI;
            this.healthyThreshold = model.healthyThreshold;
            this.listenerPort = model.listenerPort;
            this.persistenceTimeout = model.persistenceTimeout;
            this.requestId = model.requestId;
            this.scheduler = model.scheduler;
            this.status = model.status;
            this.unhealthyThreshold = model.unhealthyThreshold;
        } 

        /**
         * <p>The port used by the backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The peak bandwidth of the load balancer. The default value is -1, which indicates unlimited bandwidth.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The description of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether EIP passthrough is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enable</p>
         * </li>
         * <li><p><strong>off</strong> (Default): disable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder eipTransmit(String eipTransmit) {
            this.eipTransmit = eipTransmit;
            return this;
        }

        /**
         * <p>The connection timeout. Valid values: <strong>10</strong> to <strong>900</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * <p>Specifies whether to enable health checks. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: enable</p>
         * </li>
         * <li><p><strong>off</strong>: disable</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder healthCheck(String healthCheck) {
            this.healthCheck = healthCheck;
            return this;
        }

        /**
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If this parameter is not specified, the value of <code>BackendServerPort</code> is used.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The response timeout for a health check. If a backend ENS instance does not respond within this timeout period, the health check fails.</p>
         * <ul>
         * <li><p>Default value: 5.</p>
         * </li>
         * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * </li>
         * <li><p>Unit: seconds.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li><p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </li>
         * <li><p>If this value is less than the <code>HealthCheckInterval</code> value, the <code>HealthCheckInterval</code> value is used as the timeout period instead.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * <p>The domain name used for health checks.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status codes that indicate a successful health check. Valid values:</p>
         * <ul>
         * <li><p><strong>http_2xx</strong> (Default)</p>
         * </li>
         * <li><p><strong>http_3xx</strong></p>
         * </li>
         * <li><p><strong>http_4xx</strong></p>
         * </li>
         * <li><p><strong>http_5xx</strong></p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http_2xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval between health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The health check type. Valid values:</p>
         * <ul>
         * <li><p><strong>tcp</strong> (Default)</p>
         * </li>
         * <li><p><strong>http</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckType(String healthCheckType) {
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * <p>The URI used for health checks. Length: <strong>1</strong> to <strong>80</strong> characters.</p>
         * <blockquote>
         * <ul>
         * <li><p>The URI must start with <code>/</code> but cannot consist solely of <code>/</code>.</p>
         * </li>
         * <li><p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/example/index.html</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks required to change the health status of a backend server from <code>fail</code> (unhealthy) to <code>success</code> (healthy). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The frontend port used by the load balancer instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The session persistence timeout.</p>
         * <ul>
         * <li><p>Default value: 0. A value of 0 indicates that session persistence is disabled.</p>
         * </li>
         * <li><p>Valid values: <strong>0</strong> to <strong>3600</strong>.</p>
         * </li>
         * <li><p>Unit: seconds.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder persistenceTimeout(Integer persistenceTimeout) {
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong>: Weighted Round Robin. Backend servers with higher weights receive more requests.</p>
         * </li>
         * <li><p><strong>wlc</strong>: Weighted Least Connections. In addition to weights, the system considers the number of active connections to each backend server. If multiple backend servers have the same weight, the system selects the backend server with the fewest active connections.</p>
         * </li>
         * <li><p><strong>rr</strong>: Round Robin. The system distributes requests sequentially to the backend servers.</p>
         * </li>
         * <li><p><strong>sch</strong>: Source IP Hash. The system routes requests from the same source IP address to the same backend server.</p>
         * </li>
         * <li><p><strong>tch</strong>: 4-Tuple Hash. The system routes requests that share the same 4-tuple (source IP address, destination IP address, source port, and destination port) to the same backend server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><p><strong>Running</strong>: The listener is running.</p>
         * </li>
         * <li><p><strong>Stopped</strong>: The listener is stopped.</p>
         * </li>
         * <li><p><strong>Starting</strong>: The listener is being started.</p>
         * </li>
         * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
         * </li>
         * <li><p><strong>Stopping</strong>: The listener is being stopped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Stopped</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of consecutive failed health checks required to change the health status of a backend server from <code>success</code> (healthy) to <code>fail</code> (unhealthy). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when the HealthCheck parameter is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
