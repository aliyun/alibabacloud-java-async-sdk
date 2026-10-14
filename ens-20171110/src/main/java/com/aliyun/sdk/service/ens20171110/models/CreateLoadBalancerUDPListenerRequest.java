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
 * {@link CreateLoadBalancerUDPListenerRequest} extends {@link RequestModel}
 *
 * <p>CreateLoadBalancerUDPListenerRequest</p>
 */
public class CreateLoadBalancerUDPListenerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BackendServerPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer backendServerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EipTransmit")
    private String eipTransmit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EstablishedTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 900, minimum = 10)
    private Integer establishedTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectPort")
    @com.aliyun.core.annotation.Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckConnectTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckExp")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String healthCheckExp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckReq")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String healthCheckReq;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer healthyThreshold;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerPort")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LoadBalancerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String loadBalancerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer unhealthyThreshold;

    private CreateLoadBalancerUDPListenerRequest(Builder builder) {
        super(builder);
        this.backendServerPort = builder.backendServerPort;
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckExp = builder.healthCheckExp;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckReq = builder.healthCheckReq;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
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
     * @return backendServerPort
     */
    public Integer getBackendServerPort() {
        return this.backendServerPort;
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
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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

    public static final class Builder extends Request.Builder<CreateLoadBalancerUDPListenerRequest, Builder> {
        private Integer backendServerPort; 
        private String description; 
        private String eipTransmit; 
        private Integer establishedTimeout; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckExp; 
        private Integer healthCheckInterval; 
        private String healthCheckReq; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private String scheduler; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerUDPListenerRequest request) {
            super(request);
            this.backendServerPort = request.backendServerPort;
            this.description = request.description;
            this.eipTransmit = request.eipTransmit;
            this.establishedTimeout = request.establishedTimeout;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckConnectTimeout = request.healthCheckConnectTimeout;
            this.healthCheckExp = request.healthCheckExp;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckReq = request.healthCheckReq;
            this.healthyThreshold = request.healthyThreshold;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.scheduler = request.scheduler;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * <p>The port used by the backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder backendServerPort(Integer backendServerPort) {
            this.putQueryParameter("BackendServerPort", backendServerPort);
            this.backendServerPort = backendServerPort;
            return this;
        }

        /**
         * <p>The name of the listener. The name must be <strong>1</strong> to <strong>80</strong> characters long.</p>
         * <blockquote>
         * <p>The name cannot start with <code>http://</code> or <code>https://</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>Specifies whether EIP pass-through is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables EIP pass-through.</p>
         * </li>
         * <li><p><strong>off</strong> (default): Disables EIP pass-through.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder eipTransmit(String eipTransmit) {
            this.putQueryParameter("EipTransmit", eipTransmit);
            this.eipTransmit = eipTransmit;
            return this;
        }

        /**
         * <p>The timeout for established connections. Valid values: <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder establishedTimeout(Integer establishedTimeout) {
            this.putQueryParameter("EstablishedTimeout", establishedTimeout);
            this.establishedTimeout = establishedTimeout;
            return this;
        }

        /**
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you do not specify this parameter, the port specified by <code>BackendServerPort</code> is used.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * <p>The maximum time to wait for a response to a health check. A health check fails if a backend ENS instance does not respond within this time.</p>
         * <ul>
         * <li><p>Default value: 5.</p>
         * </li>
         * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * </li>
         * <li><p>Unit: seconds.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this timeout is shorter than the health check interval (<code>HealthCheckInterval</code>), the interval value is used for the timeout instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * <p>The expected response string for UDP health checks. The string must be up to 64 characters long and contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.putQueryParameter("HealthCheckExp", healthCheckExp);
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * <p>The interval between health checks, in seconds. Valid values: <strong>1</strong> to <strong>50</strong>. Default value: <strong>2</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The request string for UDP health checks. The string must be up to 64 characters long and contain only letters and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.putQueryParameter("HealthCheckReq", healthCheckReq);
            this.healthCheckReq = healthCheckReq;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks required for a backend server to be considered healthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * <p>The listener port used to receive requests and forward them to backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
         * <blockquote>
         * <p>For UDP listeners, ports 250, 4789, and 4790 are system-reserved and not available for use.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * <p>The ID of the load balancer instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-5q73cv04zeyh43lh74lp4****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong> (default): Weighted Round Robin. Backend servers with a higher weight receive more requests.</p>
         * </li>
         * <li><p><strong>wlc</strong>: Weighted Least Connections. Requests are distributed based on both the weight and the number of current connections of each backend server. If multiple backend servers have the same weight, the one with the fewest active connections receives the next request.</p>
         * </li>
         * <li><p><strong>rr</strong>: Round Robin. Requests are distributed to backend servers sequentially.</p>
         * </li>
         * <li><p><strong>sch</strong>: Source IP Hash. Requests from the same source IP address are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>tch</strong>: Four-tuple Hash. Requests are routed to backend servers based on a hash of four values: source IP address, destination IP address, source port, and destination port. Flows with the same four values are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>qch</strong>: QUIC Connection ID Hash. Requests with the same QUIC Connection ID are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>iqch</strong>: A consistent hash algorithm for iQUIC Connection IDs. Flows with the same second, third, and fourth bytes in the iQUIC CID are routed to the same backend server.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wrr</p>
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * <p>The number of consecutive failed health checks required for a backend server to be considered unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.putQueryParameter("UnhealthyThreshold", unhealthyThreshold);
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        @Override
        public CreateLoadBalancerUDPListenerRequest build() {
            return new CreateLoadBalancerUDPListenerRequest(this);
        } 

    } 

}
