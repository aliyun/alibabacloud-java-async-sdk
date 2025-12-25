// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("addresses")
    private java.util.List<String> addresses;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("agentServiceConfig")
    private AgentServiceConfig agentServiceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("aiServiceConfig")
    private AiServiceConfig aiServiceConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dnsServers")
    private java.util.List<String> dnsServers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("healthCheckConfig")
    private HealthCheckConfig healthCheckConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("healthyPanicThreshold")
    private Float healthyPanicThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("outlierDetectionConfig")
    private OutlierDetectionConfig outlierDetectionConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ports")
    private java.util.List<Ports> ports;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("protocol")
    private String protocol;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.serviceId = builder.serviceId;
        this.addresses = builder.addresses;
        this.agentServiceConfig = builder.agentServiceConfig;
        this.aiServiceConfig = builder.aiServiceConfig;
        this.dnsServers = builder.dnsServers;
        this.healthCheckConfig = builder.healthCheckConfig;
        this.healthyPanicThreshold = builder.healthyPanicThreshold;
        this.outlierDetectionConfig = builder.outlierDetectionConfig;
        this.ports = builder.ports;
        this.protocol = builder.protocol;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return addresses
     */
    public java.util.List<String> getAddresses() {
        return this.addresses;
    }

    /**
     * @return agentServiceConfig
     */
    public AgentServiceConfig getAgentServiceConfig() {
        return this.agentServiceConfig;
    }

    /**
     * @return aiServiceConfig
     */
    public AiServiceConfig getAiServiceConfig() {
        return this.aiServiceConfig;
    }

    /**
     * @return dnsServers
     */
    public java.util.List<String> getDnsServers() {
        return this.dnsServers;
    }

    /**
     * @return healthCheckConfig
     */
    public HealthCheckConfig getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * @return healthyPanicThreshold
     */
    public Float getHealthyPanicThreshold() {
        return this.healthyPanicThreshold;
    }

    /**
     * @return outlierDetectionConfig
     */
    public OutlierDetectionConfig getOutlierDetectionConfig() {
        return this.outlierDetectionConfig;
    }

    /**
     * @return ports
     */
    public java.util.List<Ports> getPorts() {
        return this.ports;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String serviceId; 
        private java.util.List<String> addresses; 
        private AgentServiceConfig agentServiceConfig; 
        private AiServiceConfig aiServiceConfig; 
        private java.util.List<String> dnsServers; 
        private HealthCheckConfig healthCheckConfig; 
        private Float healthyPanicThreshold; 
        private OutlierDetectionConfig outlierDetectionConfig; 
        private java.util.List<Ports> ports; 
        private String protocol; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.serviceId = request.serviceId;
            this.addresses = request.addresses;
            this.agentServiceConfig = request.agentServiceConfig;
            this.aiServiceConfig = request.aiServiceConfig;
            this.dnsServers = request.dnsServers;
            this.healthCheckConfig = request.healthCheckConfig;
            this.healthyPanicThreshold = request.healthyPanicThreshold;
            this.outlierDetectionConfig = request.outlierDetectionConfig;
            this.ports = request.ports;
            this.protocol = request.protocol;
        } 

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.putPathParameter("serviceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The list of domain names or fixed addresses.</p>
         */
        public Builder addresses(java.util.List<String> addresses) {
            this.putBodyParameter("addresses", addresses);
            this.addresses = addresses;
            return this;
        }

        /**
         * <p>The agent service configurations.</p>
         */
        public Builder agentServiceConfig(AgentServiceConfig agentServiceConfig) {
            this.putBodyParameter("agentServiceConfig", agentServiceConfig);
            this.agentServiceConfig = agentServiceConfig;
            return this;
        }

        /**
         * <p>The AI service configurations.</p>
         */
        public Builder aiServiceConfig(AiServiceConfig aiServiceConfig) {
            this.putBodyParameter("aiServiceConfig", aiServiceConfig);
            this.aiServiceConfig = aiServiceConfig;
            return this;
        }

        /**
         * <p>A DNS service address.</p>
         */
        public Builder dnsServers(java.util.List<String> dnsServers) {
            this.putBodyParameter("dnsServers", dnsServers);
            this.dnsServers = dnsServers;
            return this;
        }

        /**
         * <p>The health check configurations.</p>
         */
        public Builder healthCheckConfig(HealthCheckConfig healthCheckConfig) {
            this.putBodyParameter("healthCheckConfig", healthCheckConfig);
            this.healthCheckConfig = healthCheckConfig;
            return this;
        }

        /**
         * <p>The health check threshold.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder healthyPanicThreshold(Float healthyPanicThreshold) {
            this.putBodyParameter("healthyPanicThreshold", healthyPanicThreshold);
            this.healthyPanicThreshold = healthyPanicThreshold;
            return this;
        }

        /**
         * <p>The passive health check configurations.</p>
         */
        public Builder outlierDetectionConfig(OutlierDetectionConfig outlierDetectionConfig) {
            this.putBodyParameter("outlierDetectionConfig", outlierDetectionConfig);
            this.outlierDetectionConfig = outlierDetectionConfig;
            return this;
        }

        /**
         * <p>The port information.</p>
         */
        public Builder ports(java.util.List<Ports> ports) {
            this.putBodyParameter("ports", ports);
            this.ports = ports;
            return this;
        }

        /**
         * <p>The service protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("protocol", protocol);
            this.protocol = protocol;
            return this;
        }

        @Override
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class HealthCheckConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("expectedStatuses")
        private java.util.List<String> expectedStatuses;

        @com.aliyun.core.annotation.NameInMap("healthyThreshold")
        private Integer healthyThreshold;

        @com.aliyun.core.annotation.NameInMap("httpHost")
        private String httpHost;

        @com.aliyun.core.annotation.NameInMap("httpPath")
        private String httpPath;

        @com.aliyun.core.annotation.NameInMap("interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("timeout")
        private Integer timeout;

        @com.aliyun.core.annotation.NameInMap("unhealthyThreshold")
        private Integer unhealthyThreshold;

        private HealthCheckConfig(Builder builder) {
            this.enable = builder.enable;
            this.expectedStatuses = builder.expectedStatuses;
            this.healthyThreshold = builder.healthyThreshold;
            this.httpHost = builder.httpHost;
            this.httpPath = builder.httpPath;
            this.interval = builder.interval;
            this.protocol = builder.protocol;
            this.timeout = builder.timeout;
            this.unhealthyThreshold = builder.unhealthyThreshold;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HealthCheckConfig create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return expectedStatuses
         */
        public java.util.List<String> getExpectedStatuses() {
            return this.expectedStatuses;
        }

        /**
         * @return healthyThreshold
         */
        public Integer getHealthyThreshold() {
            return this.healthyThreshold;
        }

        /**
         * @return httpHost
         */
        public String getHttpHost() {
            return this.httpHost;
        }

        /**
         * @return httpPath
         */
        public String getHttpPath() {
            return this.httpPath;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        /**
         * @return unhealthyThreshold
         */
        public Integer getUnhealthyThreshold() {
            return this.unhealthyThreshold;
        }

        public static final class Builder {
            private Boolean enable; 
            private java.util.List<String> expectedStatuses; 
            private Integer healthyThreshold; 
            private String httpHost; 
            private String httpPath; 
            private Integer interval; 
            private String protocol; 
            private Integer timeout; 
            private Integer unhealthyThreshold; 

            private Builder() {
            } 

            private Builder(HealthCheckConfig model) {
                this.enable = model.enable;
                this.expectedStatuses = model.expectedStatuses;
                this.healthyThreshold = model.healthyThreshold;
                this.httpHost = model.httpHost;
                this.httpPath = model.httpPath;
                this.interval = model.interval;
                this.protocol = model.protocol;
                this.timeout = model.timeout;
                this.unhealthyThreshold = model.unhealthyThreshold;
            } 

            /**
             * <p>Specifies whether to enable health checks.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The normal status codes to be returned. This parameter is required if the health check protocol is HTTP.</p>
             */
            public Builder expectedStatuses(java.util.List<String> expectedStatuses) {
                this.expectedStatuses = expectedStatuses;
                return this;
            }

            /**
             * <p>The healthy threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder healthyThreshold(Integer healthyThreshold) {
                this.healthyThreshold = healthyThreshold;
                return this;
            }

            /**
             * <p>The domain name that you want to use for health checks. Optional. This parameter is available if the health check protocol is HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>dev.itemcener.com</p>
             */
            public Builder httpHost(String httpHost) {
                this.httpHost = httpHost;
                return this;
            }

            /**
             * <p>The request path of health checks. This parameter is required if the health check protocol is HTTP.</p>
             * 
             * <strong>example:</strong>
             * <p>/healthz</p>
             */
            public Builder httpPath(String httpPath) {
                this.httpPath = httpPath;
                return this;
            }

            /**
             * <p>The health check interval. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The protocol over which the system performs health checks.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>TCP</li>
             * <li>HTTP</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>The timeout period for a health check response. Unit: seconds</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            /**
             * <p>The unhealthy threshold.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder unhealthyThreshold(Integer unhealthyThreshold) {
                this.unhealthyThreshold = unhealthyThreshold;
                return this;
            }

            public HealthCheckConfig build() {
                return new HealthCheckConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class OutlierDetectionConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("baseEjectionTime")
        private Integer baseEjectionTime;

        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("failurePercentageMinimumHosts")
        private Integer failurePercentageMinimumHosts;

        @com.aliyun.core.annotation.NameInMap("failurePercentageThreshold")
        private Integer failurePercentageThreshold;

        @com.aliyun.core.annotation.NameInMap("interval")
        private Integer interval;

        private OutlierDetectionConfig(Builder builder) {
            this.baseEjectionTime = builder.baseEjectionTime;
            this.enable = builder.enable;
            this.failurePercentageMinimumHosts = builder.failurePercentageMinimumHosts;
            this.failurePercentageThreshold = builder.failurePercentageThreshold;
            this.interval = builder.interval;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutlierDetectionConfig create() {
            return builder().build();
        }

        /**
         * @return baseEjectionTime
         */
        public Integer getBaseEjectionTime() {
            return this.baseEjectionTime;
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return failurePercentageMinimumHosts
         */
        public Integer getFailurePercentageMinimumHosts() {
            return this.failurePercentageMinimumHosts;
        }

        /**
         * @return failurePercentageThreshold
         */
        public Integer getFailurePercentageThreshold() {
            return this.failurePercentageThreshold;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        public static final class Builder {
            private Integer baseEjectionTime; 
            private Boolean enable; 
            private Integer failurePercentageMinimumHosts; 
            private Integer failurePercentageThreshold; 
            private Integer interval; 

            private Builder() {
            } 

            private Builder(OutlierDetectionConfig model) {
                this.baseEjectionTime = model.baseEjectionTime;
                this.enable = model.enable;
                this.failurePercentageMinimumHosts = model.failurePercentageMinimumHosts;
                this.failurePercentageThreshold = model.failurePercentageThreshold;
                this.interval = model.interval;
            } 

            /**
             * <p>The initial isolation duration after a node is isolated (e.g., 30 seconds). The isolation time is calculated as: k * base_ejection_time (with k initially set to 1). Each subsequent isolation increases the isolation time (k is incremented by 1), while consecutive healthy checks gradually decrease the isolation time (k is decremented by 1).</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder baseEjectionTime(Integer baseEjectionTime) {
                this.baseEjectionTime = baseEjectionTime;
                return this;
            }

            /**
             * <p>enable</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * <p>The panic threshold.</p>
             * <p>When the proportion of healthy nodes in the service is greater than the panic threshold, health checks take effect normally, and requests are only sent to healthy nodes, not to ejected nodes. When the proportion of healthy nodes in the service is less than or equal to the panic threshold, health checks are effectively disabled, and requests are sent to all nodes, including those that have been ejected nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder failurePercentageMinimumHosts(Integer failurePercentageMinimumHosts) {
                this.failurePercentageMinimumHosts = failurePercentageMinimumHosts;
                return this;
            }

            /**
             * <p>When the request failure rate of a node reaches this threshold, the system triggers the isolation mechanism of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder failurePercentageThreshold(Integer failurePercentageThreshold) {
                this.failurePercentageThreshold = failurePercentageThreshold;
                return this;
            }

            /**
             * <p>The detection interval.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            public OutlierDetectionConfig build() {
                return new OutlierDetectionConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateServiceRequest} extends {@link TeaModel}
     *
     * <p>UpdateServiceRequest</p>
     */
    public static class Ports extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        private Ports(Builder builder) {
            this.name = builder.name;
            this.port = builder.port;
            this.protocol = builder.protocol;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ports create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        public static final class Builder {
            private String name; 
            private Integer port; 
            private String protocol; 

            private Builder() {
            } 

            private Builder(Ports model) {
                this.name = model.name;
                this.port = model.port;
                this.protocol = model.protocol;
            } 

            /**
             * <p>The port name.</p>
             * 
             * <strong>example:</strong>
             * <p>catalog</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP|UDP</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            public Ports build() {
                return new Ports(this);
            } 

        } 

    }
}
