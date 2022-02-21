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

        private Builder(UpdateEndpointGroupRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.endpointConfigurations = response.endpointConfigurations;
            this.endpointGroupId = response.endpointGroupId;
            this.endpointGroupRegion = response.endpointGroupRegion;
            this.endpointRequestProtocol = response.endpointRequestProtocol;
            this.healthCheckEnabled = response.healthCheckEnabled;
            this.healthCheckIntervalSeconds = response.healthCheckIntervalSeconds;
            this.healthCheckPath = response.healthCheckPath;
            this.healthCheckPort = response.healthCheckPort;
            this.healthCheckProtocol = response.healthCheckProtocol;
            this.name = response.name;
            this.portOverrides = response.portOverrides;
            this.regionId = response.regionId;
            this.thresholdCount = response.thresholdCount;
            this.trafficPercentage = response.trafficPercentage;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndpointConfigurations.
         */
        public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
            this.putQueryParameter("EndpointConfigurations", endpointConfigurations);
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * EndpointGroupId.
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.putQueryParameter("EndpointGroupId", endpointGroupId);
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * EndpointGroupRegion.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.putQueryParameter("EndpointGroupRegion", endpointGroupRegion);
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * EndpointRequestProtocol.
         */
        public Builder endpointRequestProtocol(String endpointRequestProtocol) {
            this.putQueryParameter("EndpointRequestProtocol", endpointRequestProtocol);
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }

        /**
         * HealthCheckEnabled.
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            this.putQueryParameter("HealthCheckEnabled", healthCheckEnabled);
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * HealthCheckIntervalSeconds.
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.putQueryParameter("HealthCheckIntervalSeconds", healthCheckIntervalSeconds);
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * HealthCheckPath.
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.putQueryParameter("HealthCheckPath", healthCheckPath);
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * HealthCheckPort.
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.putQueryParameter("HealthCheckPort", healthCheckPort);
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * HealthCheckProtocol.
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.putQueryParameter("HealthCheckProtocol", healthCheckProtocol);
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * PortOverrides.
         */
        public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
            this.putQueryParameter("PortOverrides", portOverrides);
            this.portOverrides = portOverrides;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ThresholdCount.
         */
        public Builder thresholdCount(Integer thresholdCount) {
            this.putQueryParameter("ThresholdCount", thresholdCount);
            this.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * TrafficPercentage.
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
            private String endpoint; 
            private String type; 
            private Integer weight; 

            /**
             * EnableClientIPPreservation.
             */
            public Builder enableClientIPPreservation(Boolean enableClientIPPreservation) {
                this.enableClientIPPreservation = enableClientIPPreservation;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Weight.
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
             * EndpointPort.
             */
            public Builder endpointPort(Integer endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * ListenerPort.
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
