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
    @com.aliyun.core.annotation.NameInMap("HealthCheckDomain")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String healthCheckDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckHttpCode")
    private String healthCheckHttpCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckInterval")
    @com.aliyun.core.annotation.Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckType")
    private String healthCheckType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HealthCheckURI")
    @com.aliyun.core.annotation.Validation(maxLength = 80, minLength = 1)
    private String healthCheckURI;

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
    @com.aliyun.core.annotation.NameInMap("PersistenceTimeout")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer persistenceTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scheduler")
    private String scheduler;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UnhealthyThreshold")
    @com.aliyun.core.annotation.Validation(maximum = 10, minimum = 2)
    private Integer unhealthyThreshold;

    private CreateLoadBalancerTCPListenerRequest(Builder builder) {
        super(builder);
        this.backendServerPort = builder.backendServerPort;
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
        this.establishedTimeout = builder.establishedTimeout;
        this.healthCheckConnectPort = builder.healthCheckConnectPort;
        this.healthCheckConnectTimeout = builder.healthCheckConnectTimeout;
        this.healthCheckDomain = builder.healthCheckDomain;
        this.healthCheckHttpCode = builder.healthCheckHttpCode;
        this.healthCheckInterval = builder.healthCheckInterval;
        this.healthCheckType = builder.healthCheckType;
        this.healthCheckURI = builder.healthCheckURI;
        this.healthyThreshold = builder.healthyThreshold;
        this.listenerPort = builder.listenerPort;
        this.loadBalancerId = builder.loadBalancerId;
        this.persistenceTimeout = builder.persistenceTimeout;
        this.scheduler = builder.scheduler;
        this.unhealthyThreshold = builder.unhealthyThreshold;
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
     * @return loadBalancerId
     */
    public String getLoadBalancerId() {
        return this.loadBalancerId;
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

    public static final class Builder extends Request.Builder<CreateLoadBalancerTCPListenerRequest, Builder> {
        private Integer backendServerPort; 
        private String description; 
        private String eipTransmit; 
        private Integer establishedTimeout; 
        private Integer healthCheckConnectPort; 
        private Integer healthCheckConnectTimeout; 
        private String healthCheckDomain; 
        private String healthCheckHttpCode; 
        private Integer healthCheckInterval; 
        private String healthCheckType; 
        private String healthCheckURI; 
        private Integer healthyThreshold; 
        private Integer listenerPort; 
        private String loadBalancerId; 
        private Integer persistenceTimeout; 
        private String scheduler; 
        private Integer unhealthyThreshold; 

        private Builder() {
            super();
        } 

        private Builder(CreateLoadBalancerTCPListenerRequest request) {
            super(request);
            this.backendServerPort = request.backendServerPort;
            this.description = request.description;
            this.eipTransmit = request.eipTransmit;
            this.establishedTimeout = request.establishedTimeout;
            this.healthCheckConnectPort = request.healthCheckConnectPort;
            this.healthCheckConnectTimeout = request.healthCheckConnectTimeout;
            this.healthCheckDomain = request.healthCheckDomain;
            this.healthCheckHttpCode = request.healthCheckHttpCode;
            this.healthCheckInterval = request.healthCheckInterval;
            this.healthCheckType = request.healthCheckType;
            this.healthCheckURI = request.healthCheckURI;
            this.healthyThreshold = request.healthyThreshold;
            this.listenerPort = request.listenerPort;
            this.loadBalancerId = request.loadBalancerId;
            this.persistenceTimeout = request.persistenceTimeout;
            this.scheduler = request.scheduler;
            this.unhealthyThreshold = request.unhealthyThreshold;
        } 

        /**
         * <p>The port used by backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>The description of the listener. The description must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p>The description cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>The timeout period for established connections, in seconds. Valid values: <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>.</p>
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
         * <p>The port used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you do not specify this parameter, the port specified by <code>BackendServerPort</code> is used by default.</p>
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
         * <p>The maximum time to wait for a health check response. If a backend ENS instance does not respond within this timeout period, the health check fails.</p>
         * <ul>
         * <li><p>Default value: 5.</p>
         * </li>
         * <li><p>Valid values: <strong>1</strong> to <strong>300</strong>.</p>
         * </li>
         * <li><p>Unit: seconds.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If the value of this parameter is less than the value of <code>HealthCheckInterval</code>, this parameter is ignored and the value of <code>HealthCheckInterval</code> is used as the timeout period.</p>
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
         * <p>The domain name used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
         */
        public Builder healthCheckDomain(String healthCheckDomain) {
            this.putQueryParameter("HealthCheckDomain", healthCheckDomain);
            this.healthCheckDomain = healthCheckDomain;
            return this;
        }

        /**
         * <p>The HTTP status codes that indicate a successful health check. Valid values:</p>
         * <ul>
         * <li><p><strong>http_2xx</strong> (default)</p>
         * </li>
         * <li><p><strong>http_3xx</strong></p>
         * </li>
         * <li><p><strong>http_4xx</strong></p>
         * </li>
         * <li><p><strong>http_5xx</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_2xx</p>
         */
        public Builder healthCheckHttpCode(String healthCheckHttpCode) {
            this.putQueryParameter("HealthCheckHttpCode", healthCheckHttpCode);
            this.healthCheckHttpCode = healthCheckHttpCode;
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
         * <p>The health check type. Valid values:</p>
         * <ul>
         * <li><p><strong>tcp</strong> (default)</p>
         * </li>
         * <li><p><strong>http</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckType(String healthCheckType) {
            this.putQueryParameter("HealthCheckType", healthCheckType);
            this.healthCheckType = healthCheckType;
            return this;
        }

        /**
         * <p>The URI for health checks. The URI must be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p>The URI must start with a forward slash (/) but cannot be only a forward slash (/).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>/checkpreload.htm</p>
         */
        public Builder healthCheckURI(String healthCheckURI) {
            this.putQueryParameter("HealthCheckURI", healthCheckURI);
            this.healthCheckURI = healthCheckURI;
            return this;
        }

        /**
         * <p>The number of consecutive successful health checks required for a backend server to be considered healthy (from a <code>fail</code> to <code>success</code> state). Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
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
         * <p>The listener port that receives and forwards requests to backend servers. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>lb-5ovkn1piwqmoqrfjdyhq4****</p>
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * <p>The timeout period for session persistence.</p>
         * <ul>
         * <li><p>Default value: <strong>0</strong>, which indicates that session persistence is disabled.</p>
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
            this.putQueryParameter("PersistenceTimeout", persistenceTimeout);
            this.persistenceTimeout = persistenceTimeout;
            return this;
        }

        /**
         * <p>The scheduling algorithm. Valid values:</p>
         * <ul>
         * <li><p><strong>wrr</strong> (default): Weighted Round Robin. Requests are distributed to backend servers based on their weights. Backend servers with higher weights receive more requests.</p>
         * </li>
         * <li><p><strong>wlc</strong>: Weighted Least Connections. Requests are distributed to backend servers based on both their weights and the number of connections. If multiple backend servers have the same weight, the one with the fewest connections receives more requests.</p>
         * </li>
         * <li><p><strong>rr</strong>: Round Robin. Requests are distributed to backend servers in sequential order.</p>
         * </li>
         * <li><p><strong>sch</strong>: Source IP Hash. Requests are routed based on a consistent hash of the source IP address, ensuring that requests from the same source IP address are sent to the same backend server.</p>
         * </li>
         * <li><p><strong>tch</strong>: Four-tuple Hash. Requests are routed based on a consistent hash of a four-tuple (source IP address, destination IP address, source port, and destination port), ensuring that requests from the same flow are sent to the same backend server.</p>
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
         * <p>The number of consecutive failed health checks required for a backend server to be considered unhealthy (from a <code>success</code> to <code>fail</code> state). Valid values: <strong>2</strong> to <strong>10</strong>. Default value: <strong>3</strong>.</p>
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
        public CreateLoadBalancerTCPListenerRequest build() {
            return new CreateLoadBalancerTCPListenerRequest(this);
        } 

    } 

}
