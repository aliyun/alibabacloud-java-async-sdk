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
         * <p>The name of the listener. The valuemust be <strong>1</strong> to <strong>80</strong> characters in length.</p>
         * <blockquote>
         * <p> The value cannot start with <code>http://</code> or <code>https://</code>.</p>
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
         * <p>Specifies whether to enable Elastic IP address (EIP) pass-through. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong> (default)</li>
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
         * <p>The timeout period of a connection. Valid values: <strong>10</strong> to <strong>900</strong>. Default value: <strong>900</strong>. Unit: seconds.</p>
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
         * <p>The port that is used for health checks. Valid values: <strong>1</strong> to <strong>65535</strong>. If you leave this parameter empty, the port specified for BackendServerPort is used for health checks.</p>
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
         * <p>The timeout period of a health check response. If the backend ENS does not respond within the specified time, the health check fails.</p>
         * <ul>
         * <li>Default value: 5.</li>
         * <li>Valid values: <strong>1</strong> to <strong>300</strong>.</li>
         * <li>Unit: seconds.</li>
         * </ul>
         * <blockquote>
         * <p> If the value of the HealthCheckTimeout property is smaller than the value of the HealthCheckInterval property, the timeout period specified by the HealthCheckTimeout property becomes invalid and the value of the HealthCheckInterval property is used as the timeout period.</p>
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
         * <p>The response string for UDP listener health checks. The string can be up to 64 characters in length and can contain only letters and digits.</p>
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
         * <p>The interval at which health checks are performed. Valid values: <strong>1</strong> to <strong>50</strong>. Unit: seconds.</p>
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
         * <p>The request string for UDP listener health checks. The string can be up to 64 characters in length and can contain only letters and digits.</p>
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
         * <p>The number of consecutive successful health checks that must occur before an unhealthy and inaccessible backend server is declared healthy and accessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
         * <p>The listener port whose attributes are to be modified. Valid values: <strong>1</strong> to <strong>65535</strong>.</p>
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
         * <p>The ID of the Edge Load Balancer (ELB) instance.</p>
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
         * <p>The routing algorithm. Valid values:</p>
         * <ul>
         * <li><strong>wrr</strong>: Backend servers with higher weights receive more requests than those with lower weights.</li>
         * <li><strong>wlc</strong>: Requests are distributed based on the weight and load of each backend server. The load refers to the number of connections on a backend server. If two backend servers have the same weight, the backend server that has fewer connections receives more requests.</li>
         * <li><strong>rr</strong>: Requests are distributed to backend servers in sequence.</li>
         * <li><strong>sch</strong>: consistent hashing that is based on source IP addresses. Requests from the same source IP address are distributed to the same backend server.</li>
         * <li><strong>qch</strong>: consistent hashing that is based on QUIC connection IDs. Requests that contain the same QUIC connection ID are distributed to the same backend server.</li>
         * <li><strong>iqch</strong>: consistent hashing that is based on specific three bytes of the iQUIC CIDs. Requests whose second to fourth bytes are the same are distributed to the same backend server.</li>
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
         * <p>The number of consecutive failed health checks that must occur before a healthy and accessible backend server is declared unhealthy and inaccessible. Valid values: <strong>2</strong> to <strong>10</strong>.</p>
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
