// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupsRequest} extends {@link RequestModel}
 *
 * <p>UpdateEndpointGroupsRequest</p>
 */
public class UpdateEndpointGroupsRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EndpointGroupConfigurations")
    @Validation(required = true)
    private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private UpdateEndpointGroupsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.endpointGroupConfigurations = builder.endpointGroupConfigurations;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEndpointGroupsRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return endpointGroupConfigurations
     */
    public java.util.List < EndpointGroupConfigurations> getEndpointGroupConfigurations() {
        return this.endpointGroupConfigurations;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateEndpointGroupsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEndpointGroupsRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.endpointGroupConfigurations = response.endpointGroupConfigurations;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EndpointGroupConfigurations.
         */
        public Builder endpointGroupConfigurations(java.util.List < EndpointGroupConfigurations> endpointGroupConfigurations) {
            this.putQueryParameter("EndpointGroupConfigurations", endpointGroupConfigurations);
            this.endpointGroupConfigurations = endpointGroupConfigurations;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
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

        @Override
        public UpdateEndpointGroupsRequest build() {
            return new UpdateEndpointGroupsRequest(this);
        } 

    } 

    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Long weight;

        private EndpointConfigurations(Builder builder) {
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
        public Long getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private String endpoint; 
            private String type; 
            private Long weight; 

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
            public Builder weight(Long weight) {
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
        private Long endpointPort;

        @NameInMap("ListenerPort")
        private Long listenerPort;

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
        public Long getEndpointPort() {
            return this.endpointPort;
        }

        /**
         * @return listenerPort
         */
        public Long getListenerPort() {
            return this.listenerPort;
        }

        public static final class Builder {
            private Long endpointPort; 
            private Long listenerPort; 

            /**
             * EndpointPort.
             */
            public Builder endpointPort(Long endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * ListenerPort.
             */
            public Builder listenerPort(Long listenerPort) {
                this.listenerPort = listenerPort;
                return this;
            }

            public PortOverrides build() {
                return new PortOverrides(this);
            } 

        } 

    }
    public static class EndpointGroupConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservationProxyProtocol")
        private Boolean enableClientIPPreservationProxyProtocol;

        @NameInMap("EnableClientIPPreservationToa")
        private Boolean enableClientIPPreservationToa;

        @NameInMap("EndpointConfigurations")
        private java.util.List < EndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupDescription")
        private String endpointGroupDescription;

        @NameInMap("EndpointGroupId")
        @Validation(required = true)
        private String endpointGroupId;

        @NameInMap("EndpointGroupName")
        private String endpointGroupName;

        @NameInMap("EndpointRequestProtocol")
        private String endpointRequestProtocol;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        private Long healthCheckIntervalSeconds;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckPort")
        private Long healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("PortOverrides")
        private java.util.List < PortOverrides> portOverrides;

        @NameInMap("ThresholdCount")
        private Long thresholdCount;

        @NameInMap("TrafficPercentage")
        private Long trafficPercentage;

        private EndpointGroupConfigurations(Builder builder) {
            this.enableClientIPPreservationProxyProtocol = builder.enableClientIPPreservationProxyProtocol;
            this.enableClientIPPreservationToa = builder.enableClientIPPreservationToa;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupDescription = builder.endpointGroupDescription;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupName = builder.endpointGroupName;
            this.endpointRequestProtocol = builder.endpointRequestProtocol;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckIntervalSeconds = builder.healthCheckIntervalSeconds;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckPort = builder.healthCheckPort;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.portOverrides = builder.portOverrides;
            this.thresholdCount = builder.thresholdCount;
            this.trafficPercentage = builder.trafficPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroupConfigurations create() {
            return builder().build();
        }

        /**
         * @return enableClientIPPreservationProxyProtocol
         */
        public Boolean getEnableClientIPPreservationProxyProtocol() {
            return this.enableClientIPPreservationProxyProtocol;
        }

        /**
         * @return enableClientIPPreservationToa
         */
        public Boolean getEnableClientIPPreservationToa() {
            return this.enableClientIPPreservationToa;
        }

        /**
         * @return endpointConfigurations
         */
        public java.util.List < EndpointConfigurations> getEndpointConfigurations() {
            return this.endpointConfigurations;
        }

        /**
         * @return endpointGroupDescription
         */
        public String getEndpointGroupDescription() {
            return this.endpointGroupDescription;
        }

        /**
         * @return endpointGroupId
         */
        public String getEndpointGroupId() {
            return this.endpointGroupId;
        }

        /**
         * @return endpointGroupName
         */
        public String getEndpointGroupName() {
            return this.endpointGroupName;
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
        public Long getHealthCheckIntervalSeconds() {
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
        public Long getHealthCheckPort() {
            return this.healthCheckPort;
        }

        /**
         * @return healthCheckProtocol
         */
        public String getHealthCheckProtocol() {
            return this.healthCheckProtocol;
        }

        /**
         * @return portOverrides
         */
        public java.util.List < PortOverrides> getPortOverrides() {
            return this.portOverrides;
        }

        /**
         * @return thresholdCount
         */
        public Long getThresholdCount() {
            return this.thresholdCount;
        }

        /**
         * @return trafficPercentage
         */
        public Long getTrafficPercentage() {
            return this.trafficPercentage;
        }

        public static final class Builder {
            private Boolean enableClientIPPreservationProxyProtocol; 
            private Boolean enableClientIPPreservationToa; 
            private java.util.List < EndpointConfigurations> endpointConfigurations; 
            private String endpointGroupDescription; 
            private String endpointGroupId; 
            private String endpointGroupName; 
            private String endpointRequestProtocol; 
            private Boolean healthCheckEnabled; 
            private Long healthCheckIntervalSeconds; 
            private String healthCheckPath; 
            private Long healthCheckPort; 
            private String healthCheckProtocol; 
            private java.util.List < PortOverrides> portOverrides; 
            private Long thresholdCount; 
            private Long trafficPercentage; 

            /**
             * EnableClientIPPreservationProxyProtocol.
             */
            public Builder enableClientIPPreservationProxyProtocol(Boolean enableClientIPPreservationProxyProtocol) {
                this.enableClientIPPreservationProxyProtocol = enableClientIPPreservationProxyProtocol;
                return this;
            }

            /**
             * EnableClientIPPreservationToa.
             */
            public Builder enableClientIPPreservationToa(Boolean enableClientIPPreservationToa) {
                this.enableClientIPPreservationToa = enableClientIPPreservationToa;
                return this;
            }

            /**
             * EndpointConfigurations.
             */
            public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * EndpointGroupDescription.
             */
            public Builder endpointGroupDescription(String endpointGroupDescription) {
                this.endpointGroupDescription = endpointGroupDescription;
                return this;
            }

            /**
             * EndpointGroupId.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * EndpointGroupName.
             */
            public Builder endpointGroupName(String endpointGroupName) {
                this.endpointGroupName = endpointGroupName;
                return this;
            }

            /**
             * EndpointRequestProtocol.
             */
            public Builder endpointRequestProtocol(String endpointRequestProtocol) {
                this.endpointRequestProtocol = endpointRequestProtocol;
                return this;
            }

            /**
             * HealthCheckEnabled.
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * HealthCheckIntervalSeconds.
             */
            public Builder healthCheckIntervalSeconds(Long healthCheckIntervalSeconds) {
                this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
                return this;
            }

            /**
             * HealthCheckPath.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * HealthCheckPort.
             */
            public Builder healthCheckPort(Long healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * HealthCheckProtocol.
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * PortOverrides.
             */
            public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
                this.portOverrides = portOverrides;
                return this;
            }

            /**
             * ThresholdCount.
             */
            public Builder thresholdCount(Long thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * TrafficPercentage.
             */
            public Builder trafficPercentage(Long trafficPercentage) {
                this.trafficPercentage = trafficPercentage;
                return this;
            }

            public EndpointGroupConfigurations build() {
                return new EndpointGroupConfigurations(this);
            } 

        } 

    }
}
