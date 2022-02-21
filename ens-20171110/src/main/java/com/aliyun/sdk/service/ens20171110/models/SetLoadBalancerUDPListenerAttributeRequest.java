// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetLoadBalancerUDPListenerAttributeRequest} extends {@link RequestModel}
 *
 * <p>SetLoadBalancerUDPListenerAttributeRequest</p>
 */
public class SetLoadBalancerUDPListenerAttributeRequest extends Request {
    @Query
    @NameInMap("Description")
    @Validation(maxLength = 80, minLength = 1)
    private String description;

    @Query
    @NameInMap("EipTransmit")
    private String eipTransmit;

    @Query
    @NameInMap("HealthCheckConnectPort")
    @Validation(maximum = 65535, minimum = 1)
    private Integer healthCheckConnectPort;

    @Query
    @NameInMap("HealthCheckConnectTimeout")
    @Validation(maximum = 300, minimum = 1)
    private Integer healthCheckConnectTimeout;

    @Query
    @NameInMap("HealthCheckExp")
    @Validation(maxLength = 64)
    private String healthCheckExp;

    @Query
    @NameInMap("HealthCheckInterval")
    @Validation(maximum = 50, minimum = 1)
    private Integer healthCheckInterval;

    @Query
    @NameInMap("HealthCheckReq")
    @Validation(maxLength = 64)
    private String healthCheckReq;

    @Query
    @NameInMap("HealthyThreshold")
    @Validation(maximum = 10, minimum = 2)
    private Integer healthyThreshold;

    @Query
    @NameInMap("ListenerPort")
    @Validation(required = true, maximum = 65535, minimum = 1)
    private Integer listenerPort;

    @Query
    @NameInMap("LoadBalancerId")
    @Validation(required = true)
    private String loadBalancerId;

    @Query
    @NameInMap("Scheduler")
    private String scheduler;

    @Query
    @NameInMap("UnhealthyThreshold")
    @Validation(maximum = 10, minimum = 2)
    private Integer unhealthyThreshold;

    private SetLoadBalancerUDPListenerAttributeRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.eipTransmit = builder.eipTransmit;
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

        private Builder(SetLoadBalancerUDPListenerAttributeRequest response) {
            super(response);
            this.description = response.description;
            this.eipTransmit = response.eipTransmit;
            this.healthCheckConnectPort = response.healthCheckConnectPort;
            this.healthCheckConnectTimeout = response.healthCheckConnectTimeout;
            this.healthCheckExp = response.healthCheckExp;
            this.healthCheckInterval = response.healthCheckInterval;
            this.healthCheckReq = response.healthCheckReq;
            this.healthyThreshold = response.healthyThreshold;
            this.listenerPort = response.listenerPort;
            this.loadBalancerId = response.loadBalancerId;
            this.scheduler = response.scheduler;
            this.unhealthyThreshold = response.unhealthyThreshold;
        } 

        /**
         * 设置监听的描述信息。  长度限制为1-80个字符，允许包含字母、数字、“-”、“/”、“.”和“_”等字符。支持中文描述。
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EipTransmit.
         */
        public Builder eipTransmit(String eipTransmit) {
            this.putQueryParameter("EipTransmit", eipTransmit);
            this.eipTransmit = eipTransmit;
            return this;
        }

        /**
         * 健康检查使用的端口。取值：1-65535  不设置此参数时，表示使用后端服务端口（BackendServerPort）
         */
        public Builder healthCheckConnectPort(Integer healthCheckConnectPort) {
            this.putQueryParameter("HealthCheckConnectPort", healthCheckConnectPort);
            this.healthCheckConnectPort = healthCheckConnectPort;
            return this;
        }

        /**
         * 接收来自运行状况检查的响应需要等待的时间。  如果后端ENS在指定的时间内没有正确响应，则判定为健康检查失败。  取值：1-300（秒）。默认为5秒
         */
        public Builder healthCheckConnectTimeout(Integer healthCheckConnectTimeout) {
            this.putQueryParameter("HealthCheckConnectTimeout", healthCheckConnectTimeout);
            this.healthCheckConnectTimeout = healthCheckConnectTimeout;
            return this;
        }

        /**
         * UDP监听健康检查的响应串，只允许包含字母、数字，最大长度限制为64个字符。
         */
        public Builder healthCheckExp(String healthCheckExp) {
            this.putQueryParameter("HealthCheckExp", healthCheckExp);
            this.healthCheckExp = healthCheckExp;
            return this;
        }

        /**
         * 健康检查的时间间隔。  取值：1-50（秒）。
         */
        public Builder healthCheckInterval(Integer healthCheckInterval) {
            this.putQueryParameter("HealthCheckInterval", healthCheckInterval);
            this.healthCheckInterval = healthCheckInterval;
            return this;
        }

        /**
         * UDP监听健康检查的请求串，只允许包含字母、数字，最大长度限制为64个字符。
         */
        public Builder healthCheckReq(String healthCheckReq) {
            this.putQueryParameter("HealthCheckReq", healthCheckReq);
            this.healthCheckReq = healthCheckReq;
            return this;
        }

        /**
         * 健康检查连续成功多少次后，将后端服务器的健康检查状态由fail判定为success。  取值：2-10。
         */
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.putQueryParameter("HealthyThreshold", healthyThreshold);
            this.healthyThreshold = healthyThreshold;
            return this;
        }

        /**
         * 负载均衡实例前端使用的端口。  取值：1-65535。
         */
        public Builder listenerPort(Integer listenerPort) {
            this.putQueryParameter("ListenerPort", listenerPort);
            this.listenerPort = listenerPort;
            return this;
        }

        /**
         * 负载均衡实例的ID。
         */
        public Builder loadBalancerId(String loadBalancerId) {
            this.putQueryParameter("LoadBalancerId", loadBalancerId);
            this.loadBalancerId = loadBalancerId;
            return this;
        }

        /**
         * 调度算法。取值：  wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。 wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。 rr：按照访问顺序依次将外部请求依序分发到后端服务器。 sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
         */
        public Builder scheduler(String scheduler) {
            this.putQueryParameter("Scheduler", scheduler);
            this.scheduler = scheduler;
            return this;
        }

        /**
         * 健康检查连续失败多少次后，将后端服务器的健康检查状态由success判定为fail。  取值：2-10。
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
