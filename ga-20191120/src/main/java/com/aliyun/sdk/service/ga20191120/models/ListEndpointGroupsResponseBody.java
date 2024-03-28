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
         * The configurations of the endpoint group.
         */
        public Builder endpointGroups(java.util.List < EndpointGroups> endpointGroups) {
            this.endpointGroups = endpointGroups;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
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

        @NameInMap("SubAddress")
        private String subAddress;

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
            this.subAddress = builder.subAddress;
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
         * @return subAddress
         */
        public String getSubAddress() {
            return this.subAddress;
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
            private String subAddress; 
            private String type; 
            private Integer weight; 

            /**
             * Indicates whether the client IP address preservation feature is enabled. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder enableClientIPPreservation(Boolean enableClientIPPreservation) {
                this.enableClientIPPreservation = enableClientIPPreservation;
                return this;
            }

            /**
             * The IP address or domain name of the endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * The ID of the endpoint.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The port that is used to monitor latency.
             */
            public Builder probePort(Integer probePort) {
                this.probePort = probePort;
                return this;
            }

            /**
             * The protocol that is used to monitor latency.
             * <p>
             * 
             * *   **icmp**
             * *   **tcp**
             */
            public Builder probeProtocol(String probeProtocol) {
                this.probeProtocol = probeProtocol;
                return this;
            }

            /**
             * The private IP address of the ENI.
             */
            public Builder subAddress(String subAddress) {
                this.subAddress = subAddress;
                return this;
            }

            /**
             * The type of the endpoint. Valid values:
             * <p>
             * 
             * *   **Domain:** a custom domain name.
             * *   **Ip:** a custom IP address.
             * *   **PublicIp:** a public IP address provided by Alibaba Cloud.
             * *   **ECS:** an Elastic Compute Service (ECS) instance.
             * *   **SLB:** a Classic Load Balancer (SLB) instance.
             * *   **ALB:** an Application Load Balancer (ALB) instance.
             * *   **OSS:** an Object Storage Service (OSS) bucket.
             * *   **ENI:** an elastic network interface (ENI).
             * *   **NLB:** a Network Load Balancer (NLB) instance.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The weight of the endpoint.
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
             * The endpoint port.
             */
            public Builder endpointPort(Integer endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * The listener port.
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
    public static class ServiceManagedInfos extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ChildType")
        private String childType;

        @NameInMap("IsManaged")
        private Boolean isManaged;

        private ServiceManagedInfos(Builder builder) {
            this.action = builder.action;
            this.childType = builder.childType;
            this.isManaged = builder.isManaged;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceManagedInfos create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return childType
         */
        public String getChildType() {
            return this.childType;
        }

        /**
         * @return isManaged
         */
        public Boolean getIsManaged() {
            return this.isManaged;
        }

        public static final class Builder {
            private String action; 
            private String childType; 
            private Boolean isManaged; 

            /**
             * The name of the action that was performed on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create:** Create an instance.
             * *   **Update:** Update the current instance.
             * *   **Delete:** Delete the current instance.
             * *   **Associate:** Reference the current instance.
             * *   **UserUnmanaged:** Unmanage the instance.
             * *   **CreateChild:** Create a child resource in the current instance.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener:** listener.
             * *   **IpSet:** acceleration region.
             * *   **EndpointGroup:** endpoint group.
             * *   **ForwardingRule:** forwarding rule.
             * *   **Endpoint:** endpoint.
             * *   **EndpointGroupDestination:** the protocol mapping of an endpoint group associated with a custom routing listener.
             * *   **EndpointPolicy:** the traffic policy of an endpoint associated with a custom routing listener.
             * 
             * >  This parameter takes effect only if you set **Action** to **CreateChild**.
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * Indicates whether the specified actions are managed. Valid values:
             * <p>
             * 
             * *   **true**: The specified actions are managed, and users cannot perform the specified actions on the managed instance.
             * *   **false**: The specified actions are not managed, and users can perform the specified actions on the managed instance.
             */
            public Builder isManaged(Boolean isManaged) {
                this.isManaged = isManaged;
                return this;
            }

            public ServiceManagedInfos build() {
                return new ServiceManagedInfos(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The tag key of the endpoint group.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the endpoint group.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
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

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceManaged")
        private Boolean serviceManaged;

        @NameInMap("ServiceManagedInfos")
        private java.util.List < ServiceManagedInfos> serviceManagedInfos;

        @NameInMap("State")
        private String state;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

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
            this.serviceId = builder.serviceId;
            this.serviceManaged = builder.serviceManaged;
            this.serviceManagedInfos = builder.serviceManagedInfos;
            this.state = builder.state;
            this.tags = builder.tags;
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
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceManaged
         */
        public Boolean getServiceManaged() {
            return this.serviceManaged;
        }

        /**
         * @return serviceManagedInfos
         */
        public java.util.List < ServiceManagedInfos> getServiceManagedInfos() {
            return this.serviceManagedInfos;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
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
            private String serviceId; 
            private Boolean serviceManaged; 
            private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
            private String state; 
            private java.util.List < Tags> tags; 
            private Integer thresholdCount; 
            private Integer trafficPercentage; 

            /**
             * The ID of the GA instance.
             */
            public Builder acceleratorId(String acceleratorId) {
                this.acceleratorId = acceleratorId;
                return this;
            }

            /**
             * The description of the endpoint group.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The configurations of endpoints in the endpoint group.
             */
            public Builder endpointConfigurations(java.util.List < EndpointConfigurations> endpointConfigurations) {
                this.endpointConfigurations = endpointConfigurations;
                return this;
            }

            /**
             * The ID of the endpoint group.
             */
            public Builder endpointGroupId(String endpointGroupId) {
                this.endpointGroupId = endpointGroupId;
                return this;
            }

            /**
             * The endpoint group IP addresses.
             */
            public Builder endpointGroupIpList(java.util.List < String > endpointGroupIpList) {
                this.endpointGroupIpList = endpointGroupIpList;
                return this;
            }

            /**
             * The ID of the region where the endpoint group is created.
             */
            public Builder endpointGroupRegion(String endpointGroupRegion) {
                this.endpointGroupRegion = endpointGroupRegion;
                return this;
            }

            /**
             * The type of the endpoint group. Valid values:
             * <p>
             * 
             * *   **default**: a default endpoint group
             * *   **virtual:** a virtual endpoint group.
             */
            public Builder endpointGroupType(String endpointGroupType) {
                this.endpointGroupType = endpointGroupType;
                return this;
            }

            /**
             * The endpoint group IP addresses to be confirmed after the GA instance is upgraded.
             */
            public Builder endpointGroupUnconfirmedIpList(java.util.List < String > endpointGroupUnconfirmedIpList) {
                this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
                return this;
            }

            /**
             * The protocol that is used by the backend server.
             * <p>
             * 
             * *   **HTTP**
             * *   **HTTPS**
             */
            public Builder endpointRequestProtocol(String endpointRequestProtocol) {
                this.endpointRequestProtocol = endpointRequestProtocol;
                return this;
            }

            /**
             * The IDs of the forwarding rules that are associated with the endpoint group.
             */
            public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
                this.forwardingRuleIds = forwardingRuleIds;
                return this;
            }

            /**
             * Indicates whether the health check feature is enabled.
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
                this.healthCheckEnabled = healthCheckEnabled;
                return this;
            }

            /**
             * The interval at which you want to perform health checks. Unit: seconds.
             */
            public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
                this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
                return this;
            }

            /**
             * The path that is used for health checks.
             */
            public Builder healthCheckPath(String healthCheckPath) {
                this.healthCheckPath = healthCheckPath;
                return this;
            }

            /**
             * The port that is used for health checks.
             */
            public Builder healthCheckPort(Integer healthCheckPort) {
                this.healthCheckPort = healthCheckPort;
                return this;
            }

            /**
             * The protocol over which health check requests are sent. Valid values:
             * <p>
             * 
             * *   **tcp** or **TCP**
             * *   **http** or **HTTP**
             * *   **https** or **HTTPS**
             */
            public Builder healthCheckProtocol(String healthCheckProtocol) {
                this.healthCheckProtocol = healthCheckProtocol;
                return this;
            }

            /**
             * The ID of the listener.
             */
            public Builder listenerId(String listenerId) {
                this.listenerId = listenerId;
                return this;
            }

            /**
             * The name of the endpoint group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The port mapping.
             */
            public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
                this.portOverrides = portOverrides;
                return this;
            }

            /**
             * The service that manages the instance.
             * <p>
             * 
             * >  This parameter takes effect only if the value of **Service managed** is **true**.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Indicates whether the GA instance is managed. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder serviceManaged(Boolean serviceManaged) {
                this.serviceManaged = serviceManaged;
                return this;
            }

            /**
             * The actions that users can perform on the managed instance.
             * <p>
             * 
             * > 
             * 
             * *   This parameter takes effect only if the value of **ServiceManaged** is **true**.
             * 
             * *   Users can perform only specific actions on a managed instance.
             */
            public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
                this.serviceManagedInfos = serviceManagedInfos;
                return this;
            }

            /**
             * The status of the endpoint group. Valid values:
             * <p>
             * 
             * *   **init:** The endpoint group is being initialized.
             * *   **active:** The endpoint group is running normally.
             * *   **updating:**The endpoint group is being updated.
             * *   **deleteing:** The endpoint group is being deleted.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The tag of the endpoint group.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.
             */
            public Builder thresholdCount(Integer thresholdCount) {
                this.thresholdCount = thresholdCount;
                return this;
            }

            /**
             * The value of the traffic distribution ratio. If a listener is associated with multiple endpoint groups, you can set this parameter to distribute different percentages of traffic to the endpoint groups.
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
