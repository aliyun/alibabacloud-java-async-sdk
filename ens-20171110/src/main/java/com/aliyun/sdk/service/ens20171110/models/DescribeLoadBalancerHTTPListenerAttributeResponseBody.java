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
 * {@link DescribeLoadBalancerHTTPListenerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLoadBalancerHTTPListenerAttributeResponseBody</p>
 */
public class DescribeLoadBalancerHTTPListenerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    private Integer backendServerPort;

    @com.aliyun.core.annotation.NameInMap("Bandwidth")
    private Integer bandwidth;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ForwardPort")
    private Integer forwardPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheck")
    private String healthCheck;

    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    private String healthCheckDomain;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.NameInMap("HealthCheckMethod")
    private String healthCheckMethod;

    @com.aliyun.core.annotation.NameInMap("HealthCheckTimeout")
    private Integer healthCheckTimeout;

    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    private String healthCheckURI;

    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.NameInMap("IdleTimeout")
    private Integer idleTimeout;

    @com.aliyun.core.annotation.NameInMap("ListenerForward")
    private String listenerForward;

    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    private Integer listenerPort;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RequestTimeout")
    private Integer requestTimeout;

    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    private Integer unhealthyThreshold;

    @com.aliyun.core.annotation.NameInMap("XForwardedFor")
    private String xForwardedFor;

    private DescribeLoadBalancerHTTPListenerAttributeResponseBody(Builder builder) {
        this.backendServerPort = builder.backendServerPort;
        this.bandwidth = builder.bandwidth;
        this.description = builder.description;
        this.forwardPort = builder.forwardPort;
        this.healthCheck = builder.healthCheck;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckMethod = builder.healthCheckMethod;
        this.healthCheckTimeout = builder.healthCheckTimeout;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.idleTimeout = builder.idleTimeout;
        this.listenerForward = builder.listenerForward;
        this.listenerPort = builder.listenerPort;
        this.requestId = builder.requestId;
        this.requestTimeout = builder.requestTimeout;
        this.scheduler = builder.scheduler;
        this.serverCertificateId = builder.serverCertificateId;
        this.status = builder.status;
        this.unhealthyThreshold = builder.unhealthyThreshold;
        this.xForwardedFor = builder.xForwardedFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLoadBalancerHTTPListenerAttributeResponseBody create() {
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
     * @return forwardPort
     */
    public Integer getForwardPort() {
        return this.forwardPort;
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
     * @return healthCheckMethod
     */
    public String getHealthCheckMethod() {
        return this.healthCheckMethod;
    }

    /**
     * @return healthCheckTimeout
     */
    public Integer getHealthCheckTimeout() {
        return this.healthCheckTimeout;
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
     * @return idleTimeout
     */
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    /**
     * @return listenerForward
     */
    public String getListenerForward() {
        return this.listenerForward;
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
     * @return requestTimeout
     */
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    /**
     * @return scheduler
     */
    public String getScheduler() {
        return this.scheduler;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
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

    /**
     * @return xForwardedFor
     */
    public String getXForwardedFor() {
        return this.xForwardedFor;
    }

    public static final class Builder {
        private Integer backendServerPort; 
        private Integer bandwidth; 
        private String description; 
        private Integer forwardPort; 
        private String healthCheck; 
        private Integer healthCheckConnectPort; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckMethod; 
        private Integer healthCheckTimeout; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer idleTimeout; 
        private String listenerForward; 
        private Integer listenerPort; 
        private String requestId; 
        private Integer requestTimeout; 
        private String scheduler; 
        private String serverCertificateId; 
        private String status; 
        private Integer unhealthyThreshold; 
        private String xForwardedFor; 

        private Builder() {
        } 

        private Builder(DescribeLoadBalancerHTTPListenerAttributeResponseBody model) {
            this.backendServerPort = model.backendServerPort;
            this.bandwidth = model.bandwidth;
            this.description = model.description;
            this.forwardPort = model.forwardPort;
            this.healthCheck = model.healthCheck;
            this.healthCheckConnectPort = model.healthCheckConnectPort;
            this.healthCheckDomain = model.healthCheckDomain;
            this.healthCheckHttpCode = model.healthCheckHttpCode;
            this.healthCheckInterval = model.healthCheckInterval;
            this.healthCheckMethod = model.healthCheckMethod;
            this.healthCheckTimeout = model.healthCheckTimeout;
            this.healthCheckURI = model.healthCheckURI;
            this.healthyThreshold = model.healthyThreshold;
            this.idleTimeout = model.idleTimeout;
            this.listenerForward = model.listenerForward;
            this.listenerPort = model.listenerPort;
            this.requestId = model.requestId;
            this.requestTimeout = model.requestTimeout;
            this.scheduler = model.scheduler;
            this.serverCertificateId = model.serverCertificateId;
            this.status = model.status;
            this.unhealthyThreshold = model.unhealthyThreshold;
            this.xForwardedFor = model.xForwardedFor;
        } 

        /**
         * <p>The port used by the backend server of the load balancing instance. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The peak bandwidth of load balancing. Default value: -1, which indicates that bandwidth is not limited.</p>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        public Builder bandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }

        /**
         * <p>The description of the listener. The description must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p>It cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The forwarding port for HTTP-to-HTTPS listeners.</p>
         * 
         * <strong>example:</strong>
         * <p>10002</p>
         */
        public Builder forwardPort(Integer forwardPort) {
            this.forwardPort = forwardPort;
            return this;
        }

        /**
         * <p>Indicates whether health checks are enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
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
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If this parameter is not specified, the backend server port (BackendServerPort) is used.</p>
         * <blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The domain name used for health checks.</p>
         * <blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status code that indicates a successful health check. Valid values:</p>
         * <ul>
         * <li><strong>http_2xx</strong> (default)</li>
         * <li><strong>http_3xx</strong></li>
         * <li><strong>http_4xx</strong></li>
         * <li><strong>http_5xx</strong><blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_2xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.healthCheckHttpCode = healthCheckHttpCode;
            return this;
        }

        /**
         * <p>The interval between two consecutive health checks. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
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
         * <p>The HTTP method used for health checks. Valid values:</p>
         * <ul>
         * <li><strong>head</strong>: Requests only the header of the page.</li>
         * <li><strong>get</strong>: Requests the specified page information and returns the entity body.<blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>head</p>
         */
        public Builder healthCheckMethod(String healthCheckMethod) {
            this.healthCheckMethod = healthCheckMethod;
            return this;
        }

        /**
         * <p>The timeout period for a health check response. If a backend ENS instance does not respond within the specified timeout period, the health check fails.</p>
         * <ul>
         * <li>Default value: 5.</li>
         * <li>Valid values: <strong>1</strong> to <strong>300</strong>.</li>
         * <li>Unit: seconds.<blockquote>
         * <ul>
         * <li>This parameter takes effect only when HealthCheck is set to on.</li>
         * <li>If the value of HealthCheckTimeout is less than the value of HealthCheckInterval, HealthCheckTimeout becomes invalid and the timeout period equals the value of HealthCheckInterval.</li>
         * </ul>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder healthCheckTimeout(Integer healthCheckTimeout) {
            this.healthCheckTimeout = healthCheckTimeout;
            return this;
        }

        /**
         * <p>The URI used for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <ul>
         * <li>The URI cannot be only a forward slash (<code>/</code>), but it must start with a forward slash (<code>/</code>).</li>
         * <li>This parameter takes effect only when HealthCheck is set to on.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/checkpreload.htm</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks that must occur before the health check status of a backend server is changed from fail (unreachable) to success (reachable). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The idle connection timeout period. Default value: 15. Valid values: <strong>1</strong> to <strong>60</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p>If no request is received within the specified timeout period, load balancing temporarily interrupts the current connection and establishes a new connection when the next request arrives.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }

        /**
         * <p>Indicates whether HTTP-to-HTTPS forwarding is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: enabled.</li>
         * <li><strong>off</strong> (default): disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>off</p>
         */
        public Builder listenerForward(String listenerForward) {
            this.listenerForward = listenerForward;
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
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The request timeout period. Default value: 60. Valid values: <strong>1</strong> to <strong>180</strong>. Unit: seconds.</p>
         * <blockquote>
         * <p>If a backend server does not return a response within the specified timeout period, load balancing stops waiting and returns an HTTP 504 error code to the client.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder requestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests.</li>
         * <li><strong>wlc</strong>: Requests are distributed based on the weights and actual loads (connections) of backend servers. If two backend servers have the same weight, the backend server with fewer connections receives more requests.</li>
         * <li><strong>rr</strong>: Requests are evenly and sequentially distributed to backend servers.</li>
         * <li><strong>sch</strong>: Consistent hashing based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>qch</strong>: Consistent hashing based on QUIC Connection IDs. Requests with the same QUIC Connection ID are distributed to the same backend server.</li>
         * <li><strong>iqch</strong>: Consistent hashing based on specific three bytes of the iQUIC CID. Requests with the same second to fourth bytes are distributed to the same backend server.</li>
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
         * <p>The ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>6027667</p>
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * <p>The status of the listener. Valid values:</p>
         * <ul>
         * <li><strong>Running</strong>: The listener is running.</li>
         * <li><strong>Stopped</strong>: The listener is stopped.</li>
         * <li><strong>Starting</strong>: The listener is starting.</li>
         * <li><strong>Configuring</strong>: The listener is being configured.</li>
         * <li><strong>Stopping</strong>: The listener is being stopped.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The number of consecutive failed health checks that must occur before the health check status of a backend server is changed from success (reachable) to fail (unreachable). Valid values: <strong>2</strong> to <strong>10</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when HealthCheck is set to on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        /**
         * <p>Indicates whether the X-Forwarded-For header is used to retrieve the originating IP addresses of clients. Valid values:</p>
         * <ul>
         * <li><strong>on</strong> (default): enabled.</li>
         * <li><strong>off</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder xForwardedFor(String xForwardedFor) {
            this.xForwardedFor = xForwardedFor;
            return this;
        }

        public DescribeLoadBalancerHTTPListenerAttributeResponseBody build() {
            return new DescribeLoadBalancerHTTPListenerAttributeResponseBody(this);
        } 

    } 

}
