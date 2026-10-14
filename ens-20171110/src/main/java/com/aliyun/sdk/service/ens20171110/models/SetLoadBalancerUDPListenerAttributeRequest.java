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
 * {@link SetLoadBalancerUDPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerUDPListenerAttributeRequest</p>
 */
public class SetLoadBalancerUDPListenerAttributeRequest extends Request {
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

    private SetLoadBalancerUDPListenerAttributeRequest(Builder builder) {
        super(builder);
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

    public static SetLoadBalancerUDPListenerAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SetLoadBalancerUDPListenerAttributeRequest, Builder> {
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

        private Builder(SetLoadBalancerUDPListenerAttributeRequest request) {
            super(request);
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
         * <p>Specifies whether to enable EIP passthrough. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: Enables EIP passthrough.</p>
         * </li>
         * <li><p><strong>off</strong> (default): Disables EIP passthrough.</p>
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
         * <p>The timeout for established connections, in seconds. The value must be an integer from <strong>10</strong> to <strong>900</strong>. The default value is <strong>900</strong>.</p>
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
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. Defaults to the backend server port (<code>BackendServerPort</code>) if not specified.</p>
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
         * <p>The timeout for a health check response. If a backend ENS instance does not respond within this timeout period, the health check fails.</p>
         * <ul>
         * <li><p>Default value: 5</p>
         * </li>
         * <li><p>Valid values: <strong>1</strong> to <strong>300</strong></p>
         * </li>
         * <li><p>Unit: seconds</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the value of <code>HealthCheckConnectTimeout</code> is less than the value of <code>HealthCheckInterval</code>, the system ignores <code>HealthCheckConnectTimeout</code> and uses the value of <code>HealthCheckInterval</code> as the timeout period.</p>
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
         * <p>The expected response string for a UDP listener health check. The string can contain only letters and digits and must be at most 64 characters long.</p>
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
         * <p>The interval, in seconds, between consecutive health checks. Valid values: <strong>1</strong> to <strong>50</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * <p>The request string for a UDP listener health check. The string can contain only letters and digits and must be at most 64 characters long.</p>
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
         * <p>The number of consecutive successful health checks required to mark an unhealthy backend server as healthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>The listener port to modify. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>lb-5pzipr2fszqtl2xf64uy5****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong>: Weighted Round Robin. Backend servers with higher weights receive a larger proportion of requests.</p>
         * </li>
         * <li><p><strong>wlc</strong>: Weighted Least Connections. Requests are distributed based on both the weights and the number of active connections of backend servers. If servers have the same weight, the server with the fewest active connections receives more requests.</p>
         * </li>
         * <li><p><strong>rr</strong>: Round Robin. Requests are distributed to backend servers in sequence.</p>
         * </li>
         * <li><p><strong>sch</strong>: Source IP Hash. A consistent hash based on the source IP address. Requests from the same source IP address are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>tch</strong>: 4-Tuple Hash. A consistent hash based on the 4-tuple (source IP, destination IP, source port, and destination port). Flows with the same 4-tuple are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>qch</strong>: QUIC Connection ID Hash. A consistent hash based on the QUIC Connection ID. Requests with the same QUIC Connection ID are routed to the same backend server.</p>
         * </li>
         * <li><p><strong>iqch</strong>: iQUIC CID Hash. A consistent hash based on three specific bytes (from the second to the fourth byte) of the iQUIC CID. Requests with identical values in these three bytes are routed to the same backend server.</p>
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
         * <p>The number of consecutive failed health checks required to mark a healthy backend server as unhealthy. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
        public SetLoadBalancerUDPListenerAttributeRequest build() {
            return new SetLoadBalancerUDPListenerAttributeRequest(this);
        } 

    } 

}
