// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateEndpointGroupRequest</p>
 */
public class UpdateEndpointGroupRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EndpointConfigurations")
    @Validation(required = true)
    private java.util.List < EndpointConfigurations> endpointConfigurations;

    @Query
    @NameInMap("EndpointGroupId")
    @Validation(required = true)
    private String endpointGroupId;

    @Query
    @NameInMap("EndpointGroupRegion")
    @Validation(required = true)
    private String endpointGroupRegion;

    @Query
    @NameInMap("EndpointRequestProtocol")
    private String endpointRequestProtocol;

    @Query
    @NameInMap("HealthCheckEnabled")
    private Boolean healthCheckEnabled;

    @Query
    @NameInMap("HealthCheckIntervalSeconds")
    private Integer healthCheckIntervalSeconds;

    @Query
    @NameInMap("HealthCheckPath")
    private String healthCheckPath;

    @Query
    @NameInMap("HealthCheckPort")
    private Integer healthCheckPort;

    @Query
    @NameInMap("HealthCheckProtocol")
    private String healthCheckProtocol;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PortOverrides")
    private java.util.List < PortOverrides> portOverrides;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ThresholdCount")
    private Integer thresholdCount;

    @Query
    @NameInMap("TrafficPercentage")
    private Integer trafficPercentage;

    private UpdateEndpointGroupRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.endpointConfigurations = builder.endpointConfigurations;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointRequestProtocol = builder.endpointRequestProtocol;
        this.healthCheckEnabled = builder.healthCheckEnabled;
        this.healthCheckIntervalSeconds = builder.healthCheckIntervalSeconds;
        this.healthCheckPath = builder.healthCheckPath;
        this.healthCheckPort = builder.healthCheckPort;
        this.healthCheckProtocol = builder.healthCheckProtocol;
        this.name = builder.name;
        this.portOverrides = builder.portOverrides;
        this.regionId = builder.regionId;
        this.thresholdCount = builder.thresholdCount;
        this.trafficPercentage = builder.trafficPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEndpointGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endpointConfigurations
     */
    public java.util.List < EndpointConfigurations> getEndpointConfigurations() {
        return this.endpointConfigurations;
    }

    /**
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return this.endpointGroupId;
    }

    /**
     * @return endpointGroupRegion
     */
    public String getEndpointGroupRegion() {
        return this.endpointGroupRegion;
    }

    /**
     * @return endpointRequestProtocol
     */
    public String getEndpointRequestProtocol() {
        return this.endpointRequestProtocol;
    }

    /**
     * @return healthCheckEnabled
     */
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * @return healthCheckIntervalSeconds
     */
    public Integer getHealthCheckIntervalSeconds() {
        return this.healthCheckIntervalSeconds;
    }

    /**
     * @return healthCheckPath
     */
    public String getHealthCheckPath() {
        return this.healthCheckPath;
    }

    /**
     * @return healthCheckPort
     */
    public Integer getHealthCheckPort() {
        return this.healthCheckPort;
    }

    /**
     * @return healthCheckProtocol
     */
    public String getHealthCheckProtocol() {
        return this.healthCheckProtocol;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portOverrides
     */
    public java.util.List < PortOverrides> getPortOverrides() {
        return this.portOverrides;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return thresholdCount
     */
    public Integer getThresholdCount() {
        return this.thresholdCount;
    }

    /**
     * @return trafficPercentage
     */
    public Integer getTrafficPercentage() {
        return this.trafficPercentage;
    }

    public static final class Builder extends Request.Builder<UpdateEndpointGroupRequest, Builder> {
        private String clientToken; 
        private String description; 
        private java.util.List < EndpointConfigurations> endpointConfigurations; 
        private String endpointGroupId; 
        private String endpointGroupRegion; 
        private String endpointRequestProtocol; 
        private Boolean healthCheckEnabled; 
        private Integer healthCheckIntervalSeconds; 
        private String healthCheckPath; 
        private Integer healthCheckPort; 
        private String healthCheckProtocol; 
        private String name; 
        private java.util.List < PortOverrides> portOverrides; 
        private String regionId; 
        private Integer thresholdCount; 
        private Integer trafficPercentage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEndpointGroupRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.endpointConfigurations = request.endpointConfigurations;
            this.endpointGroupId = request.endpointGroupId;
            this.endpointGroupRegion = request.endpointGroupRegion;
            this.endpointRequestProtocol = request.endpointRequestProtocol;
            this.healthCheckEnabled = request.healthCheckEnabled;
            this.healthCheckIntervalSeconds = request.healthCheckIntervalSeconds;
            this.healthCheckPath = request.healthCheckPath;
            this.healthCheckPort = request.healthCheckPort;
            this.healthCheckProtocol = request.healthCheckProtocol;
            this.name = request.name;
            this.portOverrides = request.portOverrides;
            this.regionId = request.regionId;
            this.thresholdCount = request.thresholdCount;
            this.trafficPercentage = request.trafficPercentage;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the value, but you must make sure that it is unique among different requests. The client token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. The value of **RequestId** for each API request may be different.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the endpoint group.
         * <p>
         * 
         * The description can be up to 256 characters in length and cannot contain `http://` or `https://`.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The configurations of the endpoint.
         */
        public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
            this.putQueryParameter("EndpointConfigurations", endpointConfigurations);
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * The ID of the endpoint group.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * The ID of the region where the endpoint group is deployed.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * The protocol that is used by the backend service. Valid values:
         * <p>
         * 
         * *   **HTTP**
         * *   **HTTPS**
         * 
         * > 
         * 
         * *   You can set this parameter only when the listener that is associated with the endpoint group uses the HTTP or HTTPS protocol.
         * 
         * *   For an HTTP listener, the backend service protocol must be HTTP.
         */
        public Builder endpointRequestProtocol(String endpointRequestProtocol) {
            this.putQueryParameter("EndpointRequestProtocol", endpointRequestProtocol);
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }

        /**
         * Specifies whether to enable the health check feature. Valid values:
         * <p>
         * 
         * *   **true:** enables the health check feature. This is the default value.
         * *   **false:** disables the health check feature.
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            this.putQueryParameter("HealthCheckEnabled", healthCheckEnabled);
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * The interval between consecutive health checks. Unit: seconds. Valid values: **1** to **50**.
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.putQueryParameter("HealthCheckIntervalSeconds", healthCheckIntervalSeconds);
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * The path to which health check requests are sent.
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.putQueryParameter("HealthCheckPath", healthCheckPath);
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * The port that is used for health checks. Valid values: **1** to **65535**.
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putQueryParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * The protocol over which health check requests are sent. Valid values:
         * <p>
         * 
         * *   **tcp**: TCP
         * *   **http**: HTTP
         * *   **https**: HTTPS
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * The name of the endpoint group.
         * <p>
         * 
         * The name must be 2 to 128 characters in length, and can contain letters, digits, underscores (\_), and hyphens (-). The name must start with a letter.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The mappings between ports.
         */
        public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
            this.putQueryParameter("PortOverrides", portOverrides);
            this.portOverrides = portOverrides;
            return this;
        }

        /**
         * The ID of the region where the GA instance is deployed. Set the value to **cn-hangzhou**.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of consecutive health check failures that must occur before a healthy endpoint group is considered unhealthy, or the number of consecutive health check successes that must occur before an unhealthy endpoint group is considered healthy.
         * <p>
         * 
         * Valid values: **2** to **10**.
         */
        public Builder thresholdCount(Integer thresholdCount) {
            this.putQueryParameter("ThresholdCount", thresholdCount);
            this.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * The weight of the endpoint group when the listener is associated with multiple endpoint groups.
         */
        public Builder trafficPercentage(Integer trafficPercentage) {
            this.putQueryParameter("TrafficPercentage", trafficPercentage);
            this.trafficPercentage = trafficPercentage;
            return this;
        }

        @Override
        public UpdateEndpointGroupRequest build() {
            return new UpdateEndpointGroupRequest(this);
        } 

    } 

    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        private Boolean enableClientIPPreservation;

        @NameInMap("EnableProxyProtocol")
        private Boolean enableProxyProtocol;

        @NameInMap("Endpoint")
        @Validation(required = true)
        private String endpoint;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Weight")
        @Validation(required = true)
        private Integer weight;

        private EndpointConfigurations(Builder builder) {
            this.enableClientIPPreservation = builder.enableClientIPPreservation;
            this.enableProxyProtocol = builder.enableProxyProtocol;
            this.endpoint = builder.endpoint;
            this.type = builder.type;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointConfigurations create() {
            return builder().build();
        }

        /**
         * @return enableClientIPPreservation
         */
        public Boolean getEnableClientIPPreservation() {
            return this.enableClientIPPreservation;
        }

        /**
         * @return enableProxyProtocol
         */
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Boolean enableClientIPPreservation; 
            private Boolean enableProxyProtocol; 
            private String endpoint; 
            private String type; 
            private Integer weight; 

            /**
             * Specifies whether to reserve client IP addresses. Default value: false. Valid values:
             * <p>
             * 
             * *   **true:** reserves client IP addresses.
             * *   **false:** does not preserve client IP addresses.
             */
            public Builder enableClientIPPreservation(Boolean enableClientIPPreservation) {
                this.enableClientIPPreservation = enableClientIPPreservation;
                return this;
            }

            /**
             * Specifies whether to preserve the IP addresses of clients that access the endpoint by using the ProxyProtocol module. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
                return this;
            }

            /**
             * The IP address, domain name or instance id according to the type of the endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Domain:** a custom domain name
             * *   **Ip:** a custom IP address
             * *   **PublicIp:** a public IP address provided by Alibaba Cloud
             * *   **ECS:** an ECS instance
             * *   **SLB:** a Server Load Balancer (SLB) instance
             * *   **ALB:** an Application Load Balancer (ALB) instance
             * *   **OSS:** an Object Storage Service (OSS) bucket
             * 
             * > 
             * 
             * *   If you set this parameter to **ECS** or **SLB** and the service-linked role AliyunServiceRoleForGaVpcEndpoint does not exist, the system creates the service-linked role.
             * 
             * *   If you set this parameter to **ALB** and the service-linked role AliyunServiceRoleForGaAlb does not exist, the system automatically creates the service-linked role.
             * 
             * *   If you set this parameter to **OSS** and the service-linked role AliyunServiceRoleForGaOss does not exist, the system automatically creates the service-linked role.
             * 
             * For more information, see [Service-linked roles](~~178360~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the endpoint.
             * <p>
             * 
             * Valid values: **0** to **255**.
             * 
             * > If you set the weight of an endpoint to 0, GA does not route network traffic to the endpoint. Make sure that you are aware of the impact on your business before you set the endpoint weight to 0.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public EndpointConfigurations build() {
                return new EndpointConfigurations(this);
            } 

        } 

    }
    public static class PortOverrides extends TeaModel {
        @NameInMap("EndpointPort")
        private Integer endpointPort;

        @NameInMap("ListenerPort")
        private Integer listenerPort;

        private PortOverrides(Builder builder) {
            this.endpointPort = builder.endpointPort;
            this.listenerPort = builder.listenerPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortOverrides create() {
            return builder().build();
        }

        /**
         * @return endpointPort
         */
        public Integer getEndpointPort() {
            return this.endpointPort;
        }

        /**
         * @return listenerPort
         */
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private Integer endpointPort; 
            private Integer listenerPort; 

            /**
             * The endpoint port that is mapped to the listener port.
             */
            public Builder endpointPort(Integer endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * The listener port that is mapped to the endpoint port.
             * <p>
             * 
             * > 
             * 
             * *   Only HTTP and HTTPS listeners support port mappings.
             * 
             * *   The listener port in a port mapping must be the one used by the current listener.
             */
            public Builder listenerPort(Integer listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public PortOverrides build() {
                return new PortOverrides(this);
            } 

        } 

    }
}
