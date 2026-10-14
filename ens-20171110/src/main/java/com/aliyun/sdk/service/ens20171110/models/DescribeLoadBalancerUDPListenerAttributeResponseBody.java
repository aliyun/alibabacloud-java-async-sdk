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
 * {@link DescribeLoadBalancerUDPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerUDPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerUDPListenerAttributeResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("HealthCheckExp")
    private String healthCheckExp;

    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.NameInMap("HealthCheckReq")
    private String healthCheckReq;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    private DescribeLoadBalancerUDPListenerAttributeResponseBody(Builder builder) {
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
        this.establishedTimeout = builder.establishedTimeout;
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
        private Integer establishedTimeout; 
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

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerUDPListenerAttributeResponseBody model) {
            this.backendServerPort = model.backendServerPort;
            this.bandwidth = model.bandwidth;
            this.description = model.description;
            this.eipTransmit = model.eipTransmit;
            this.establishedTimeout = model.establishedTimeout;
            this.healthCheck = model.healthCheck;
            this.healthCheckConnectPort = model.healthCheckConnectPort;
            this.healthCheckConnectTimeout = model.healthCheckConnectTimeout;
            this.healthCheckExp = model.healthCheckExp;
            this.healthCheckInterval = model.healthCheckInterval;
            this.healthCheckReq = model.healthCheckReq;
            this.healthyThreshold = model.healthyThreshold;
            this.listenerPort = model.listenerPort;
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
         * <p>The peak bandwidth of the load balancer. A value of -1 indicates that no rate limit is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The listener name.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether to enable EIP passthrough. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong> (default): Disabled.</p>
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
         * <p>The connection timeout period. Valid values: <strong>10</strong> to <strong>900</strong>. Unit: seconds.</p>
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
         * <li><p><strong>on</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>off</strong>: Disabled.</p>
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
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you do not specify this parameter, the value of <code>BackendServerPort</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>8000</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The timeout period for a health check response. If a backend ENS instance does not respond within the specified timeout period, the health check fails.</p>
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
         * <li><p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
         * </li>
         * <li><p>If the value of <code>HealthCheckConnectTimeout</code> is less than the value of <code>HealthCheckInterval</code>, the value of <code>HealthCheckInterval</code> is used as the timeout period.</p>
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
         * <p>The response string for UDP health checks. The string can contain only letters and digits and can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * <p>The interval between health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The request string for UDP health checks. The string can contain only letters and digits and can be up to 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.healthCheckReq = healthCheckReq;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks that must occur before a backend server can be declared healthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
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
         * <p>The listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5D7597CF-1630-54EC-A945-624A33F2E7E8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong> (Weighted Round Robin): Backend servers with higher weights receive a larger proportion of requests.</p>
         * </li>
         * <li><p><strong>wlc</strong> (Weighted Least Connections): Requests are distributed based on both the weight and the current connection count of each backend server. If backend servers have the same weight, the server with the fewest connections receives more new requests.</p>
         * </li>
         * <li><p><strong>rr</strong> (Round Robin): Requests are distributed to backend servers sequentially.</p>
         * </li>
         * <li><p><strong>sch</strong> (Source IP Hash): Routes requests from the same source IP address to the same backend server by using a consistent hash of the source IP address.</p>
         * </li>
         * <li><p><strong>tch</strong> (4-tuple Hash): Routes packets from the same flow to the same backend server by using a consistent hash of the 4-tuple (source IP address, destination IP address, source port, and destination port).</p>
         * </li>
         * <li><p><strong>qch</strong> (QUIC Connection ID Hash): Uses a consistent hashing algorithm on the QUIC Connection ID to ensure that requests with the same connection ID are always routed to the same backend server.</p>
         * </li>
         * <li><p><strong>iqch</strong> (iQUIC CID Hash): Uses a consistent hashing algorithm on bytes 2, 3, and 4 of the iQUIC CID. Requests where these three bytes are the same are routed to the same backend server.</p>
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
         * <li><p><strong>Starting</strong>: The listener is starting.</p>
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
         * <p>The number of consecutive failed health checks that must occur before a backend server can be declared unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <code>HealthCheck</code> is set to <code>on</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
