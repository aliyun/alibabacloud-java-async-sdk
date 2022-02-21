// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEndpointGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEndpointGroupsResponseBody</p>
 */
public class ListEndpointGroupsResponseBody extends TeaModel {
    @NameInMap("EndpointGroups")
    private java.util.List < EndpointGroups> endpointGroups;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListEndpointGroupsResponseBody(Builder builder) {
        this.endpointGroups = builder.endpointGroups;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEndpointGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroups
     */
    public java.util.List < EndpointGroups> getEndpointGroups() {
        return this.endpointGroups;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < EndpointGroups> endpointGroups; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * EndpointGroups.
         */
        public Builder endpointGroups(java.util.List < EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListEndpointGroupsResponseBody build() {
            return new ListEndpointGroupsResponseBody(this);
        } 

    } 

    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        private Boolean enableClientIPPreservation;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("ProbePort")
        private Integer probePort;

        @NameInMap("ProbeProtocol")
        private String probeProtocol;

        @NameInMap("Type")
        private String type;

        @NameInMap("Weight")
        private Integer weight;

        private EndpointConfigurations(Builder builder) {
            this.enableClientIPPreservation = builder.enableClientIPPreservation;
            this.endpoint = builder.endpoint;
            this.endpointId = builder.endpointId;
            this.probePort = builder.probePort;
            this.probeProtocol = builder.probeProtocol;
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
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return probePort
         */
        public Integer getProbePort() {
            return this.probePort;
        }

        /**
         * @return probeProtocol
         */
        public String getProbeProtocol() {
            return this.probeProtocol;
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
            private String endpointId; 
            private Integer probePort; 
            private String probeProtocol; 
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
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * ProbePort.
             */
            public Builder probePort(Integer probePort) {
                this.probePort = probePort;
                return this;
            }

            /**
             * ProbeProtocol.
             */
            public Builder probeProtocol(String probeProtocol) {
                this.probeProtocol = probeProtocol;
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
    public static class EndpointGroups extends TeaModel {
        @NameInMap("AcceleratorId")
        private String acceleratorId;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndpointConfigurations")
        private java.util.List < EndpointConfigurations> endpointConfigurations;

        @NameInMap("EndpointGroupId")
        private String endpointGroupId;

        @NameInMap("EndpointGroupIpList")
        private java.util.List < String > endpointGroupIpList;

        @NameInMap("EndpointGroupRegion")
        private String endpointGroupRegion;

        @NameInMap("EndpointGroupType")
        private String endpointGroupType;

        @NameInMap("EndpointGroupUnconfirmedIpList")
        private java.util.List < String > endpointGroupUnconfirmedIpList;

        @NameInMap("EndpointRequestProtocol")
        private String endpointRequestProtocol;

        @NameInMap("ForwardingRuleIds")
        private java.util.List < String > forwardingRuleIds;

        @NameInMap("HealthCheckEnabled")
        private Boolean healthCheckEnabled;

        @NameInMap("HealthCheckIntervalSeconds")
        private Integer healthCheckIntervalSeconds;

        @NameInMap("HealthCheckPath")
        private String healthCheckPath;

        @NameInMap("HealthCheckPort")
        private Integer healthCheckPort;

        @NameInMap("HealthCheckProtocol")
        private String healthCheckProtocol;

        @NameInMap("ListenerId")
        private String listenerId;

        @NameInMap("Name")
        private String name;

        @NameInMap("PortOverrides")
        private java.util.List < PortOverrides> portOverrides;

        @NameInMap("State")
        private String state;

        @NameInMap("ThresholdCount")
        private Integer thresholdCount;

        @NameInMap("TrafficPercentage")
        private Integer trafficPercentage;

        private EndpointGroups(Builder builder) {
            this.acceleratorId = builder.acceleratorId;
            this.description = builder.description;
            this.endpointConfigurations = builder.endpointConfigurations;
            this.endpointGroupId = builder.endpointGroupId;
            this.endpointGroupIpList = builder.endpointGroupIpList;
            this.endpointGroupRegion = builder.endpointGroupRegion;
            this.endpointGroupType = builder.endpointGroupType;
            this.endpointGroupUnconfirmedIpList = builder.endpointGroupUnconfirmedIpList;
            this.endpointRequestProtocol = builder.endpointRequestProtocol;
            this.forwardingRuleIds = builder.forwardingRuleIds;
            this.healthCheckEnabled = builder.healthCheckEnabled;
            this.healthCheckIntervalSeconds = builder.healthCheckIntervalSeconds;
            this.healthCheckPath = builder.healthCheckPath;
            this.healthCheckPort = builder.healthCheckPort;
            this.healthCheckProtocol = builder.healthCheckProtocol;
            this.listenerId = builder.listenerId;
            this.name = builder.name;
            this.portOverrides = builder.portOverrides;
            this.state = builder.state;
            this.thresholdCount = builder.thresholdCount;
            this.trafficPercentage = builder.trafficPercentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointGroups create() {
            return builder().build();
        }

        /**
         * @return acceleratorId
         */
        public String getAcceleratorId() {
            return this.acceleratorId;
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
         * @return endpointGroupIpList
         */
        public java.util.List < String > getEndpointGroupIpList() {
            return this.endpointGroupIpList;
        }

        /**
         * @return endpointGroupRegion
         */
        public String getEndpointGroupRegion() {
            return this.endpointGroupRegion;
        }

        /**
         * @return endpointGroupType
         */
        public String getEndpointGroupType() {
            return this.endpointGroupType;
        }

        /**
         * @return endpointGroupUnconfirmedIpList
         */
        public java.util.List < String > getEndpointGroupUnconfirmedIpList() {
            return this.endpointGroupUnconfirmedIpList;
        }

        /**
         * @return endpointRequestProtocol
         */
        public String getEndpointRequestProtocol() {
            return this.endpointRequestProtocol;
        }

        /**
         * @return forwardingRuleIds
         */
        public java.util.List < String > getForwardingRuleIds() {
            return this.forwardingRuleIds;
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
         * @return listenerId
         */
        public String getListenerId() {
            return this.listenerId;
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
         * @return state
         */
        public String getState() {
            return this.state;
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

        public static final class Builder {
            private String acceleratorId; 
            private String description; 
            private java.util.List < EndpointConfigurations> endpointConfigurations; 
            private String endpointGroupId; 
            private java.util.List < String > endpointGroupIpList; 
            private String endpointGroupRegion; 
            private String endpointGroupType; 
            private java.util.List < String > endpointGroupUnconfirmedIpList; 
            private String endpointRequestProtocol; 
            private java.util.List < String > forwardingRuleIds; 
            private Boolean healthCheckEnabled; 
            private Integer healthCheckIntervalSeconds; 
            private String healthCheckPath; 
            private Integer healthCheckPort; 
            private String healthCheckProtocol; 
            private String listenerId; 
            private String name; 
            private java.util.List < PortOverrides> portOverrides; 
            private String state; 
            private Integer thresholdCount; 
            private Integer trafficPercentage; 

            /**
             * AcceleratorId.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * EndpointGroupId.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * EndpointGroupIpList.
             */
            public Builder endpointGroupIpList(java.util.List < String > endpointGroupIpList) {
                this.endpointGroupIpList = endpointGroupIpList;
                return this;
            }

            /**
             * EndpointGroupRegion.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * EndpointGroupType.
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * EndpointGroupUnconfirmedIpList.
             */
            public Builder endpointGroupUnconfirmedIpList(java.util.List < String > endpointGroupUnconfirmedIpList) {
                this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
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
             * ForwardingRuleIds.
             */
            public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
                this.forwardingRuleIds = forwardingRuleIds;
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
            public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
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
            public Builder healthCheckPort(Integer healthCheckPort) {
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
             * ListenerId.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * ThresholdCount.
             */
            public Builder thresholdCount(Integer thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * TrafficPercentage.
             */
            public Builder trafficPercentage(Integer trafficPercentage) {
                this.trafficPercentage = trafficPercentage;
                return this;
            }

            public EndpointGroups build() {
                return new EndpointGroups(this);
            } 

        } 

    }
}
