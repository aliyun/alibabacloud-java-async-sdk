// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndpointGroupResponseBody</p>
 */
public class DescribeEndpointGroupResponseBody extends TeaModel {
    @NameInMap("AcceleratorId")
    private String acceleratorId;

    @NameInMap("AccessLogSwitch")
    private String accessLogSwitch;

    @NameInMap("Description")
    private String description;

    @NameInMap("EnableAccessLog")
    private Boolean enableAccessLog;

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

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceId")
    private String serviceId;

    @NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @NameInMap("ServiceManagedInfos")
    private java.util.List < ServiceManagedInfos> serviceManagedInfos;

    @NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @NameInMap("SlsProjectName")
    private String slsProjectName;

    @NameInMap("SlsRegion")
    private String slsRegion;

    @NameInMap("State")
    private String state;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("ThresholdCount")
    private Integer thresholdCount;

    @NameInMap("TrafficPercentage")
    private Integer trafficPercentage;

    private DescribeEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.accessLogSwitch = builder.accessLogSwitch;
        this.description = builder.description;
        this.enableAccessLog = builder.enableAccessLog;
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
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceManaged = builder.serviceManaged;
        this.serviceManagedInfos = builder.serviceManagedInfos;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegion = builder.slsRegion;
        this.state = builder.state;
        this.tags = builder.tags;
        this.thresholdCount = builder.thresholdCount;
        this.trafficPercentage = builder.trafficPercentage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEndpointGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return accessLogSwitch
     */
    public String getAccessLogSwitch() {
        return this.accessLogSwitch;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableAccessLog
     */
    public Boolean getEnableAccessLog() {
        return this.enableAccessLog;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return slsLogStoreName
     */
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    /**
     * @return slsRegion
     */
    public String getSlsRegion() {
        return this.slsRegion;
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
        private String accessLogSwitch; 
        private String description; 
        private Boolean enableAccessLog; 
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
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List < ServiceManagedInfos> serviceManagedInfos; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegion; 
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
         * Indicates the status of the binding between the Log Service project and the endpoint group. Valid values:
         * <p>
         * 
         * *   **on**: The Log Service project is bound to the endpoint group.
         * *   **off**: No Log Service projects are bound to the endpoint group.
         * *   **binding**: The Log Service project is being bound to the endpoint group.
         * *   **unbinding**: The Log Service project is being unbound from the endpoint group.
         */
        public Builder accessLogSwitch(String accessLogSwitch) {
            this.accessLogSwitch = accessLogSwitch;
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
         * Indicates whether the access log feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder enableAccessLog(Boolean enableAccessLog) {
            this.enableAccessLog = enableAccessLog;
            return this;
        }

        /**
         * The configurations of the endpoints in the endpoint group.
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
         * The active endpoint IP addresses of the endpoint group.
         */
        public Builder endpointGroupIpList(java.util.List < String > endpointGroupIpList) {
            this.endpointGroupIpList = endpointGroupIpList;
            return this;
        }

        /**
         * The ID of the region where the endpoint group is deployed.
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * The type of endpoint group. Valid values:
         * <p>
         * 
         * *   **default**: a default endpoint group
         * *   **virtual**: a virtual endpoint group
         */
        public Builder endpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }

        /**
         * The endpoint group IP addresses to be confirmed. After the GA instance is upgraded, the IP addresses that are added to the endpoint group need to be confirmed.
         */
        public Builder endpointGroupUnconfirmedIpList(java.util.List < String > endpointGroupUnconfirmedIpList) {
            this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
            return this;
        }

        /**
         * The protocol that is used by the backend service.
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
         * The ID of the forwarding rule that is associated with the endpoint group.
         */
        public Builder forwardingRuleIds(java.util.List < String > forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }

        /**
         * Indicates whether the health check feature is enabled. Valid values:
         * <p>
         * 
         * *   **true**: enabled
         * *   **false**: disabled
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * The interval between two consecutive health checks. Unit: seconds.
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * The path to which health check probes are sent.
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
         * *   **tcp**: TCP
         * *   **http**: HTTP
         * *   **https**: HTTPS
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
         * The mappings between ports.
         */
        public Builder portOverrides(java.util.List < PortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
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
         * The ID of the service that manages the GA instance.
         * <p>
         * 
         * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
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
         * >  This parameter takes effect only if **ServiceManaged** is set to **True**.
         * 
         * *   Users can perform only specific actions on a managed instance.
         */
        public Builder serviceManagedInfos(java.util.List < ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * The name of the Log Service project.
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * The region of the Log Service project.
         */
        public Builder slsRegion(String slsRegion) {
            this.slsRegion = slsRegion;
            return this;
        }

        /**
         * The status of the endpoint group. Valid values:
         * <p>
         * 
         * *   **init**: The endpoint group is being initialized.
         * *   **active**: The endpoint group is running as expected.
         * *   **updating**: The endpoint group is being updated.
         * *   **deleting**: The endpoint group is being deleted.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Tags.
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
         * The weight of the endpoint group. If the listener is associated with multiple endpoint groups, this parameter indicates the weight of the current endpoint group.
         */
        public Builder trafficPercentage(Integer trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }

        public DescribeEndpointGroupResponseBody build() {
            return new DescribeEndpointGroupResponseBody(this);
        } 

    } 

    public static class EndpointConfigurations extends TeaModel {
        @NameInMap("EnableClientIPPreservation")
        private Boolean enableClientIPPreservation;

        @NameInMap("EnableProxyProtocol")
        private Boolean enableProxyProtocol;

        @NameInMap("Endpoint")
        private String endpoint;

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
            this.enableProxyProtocol = builder.enableProxyProtocol;
            this.endpoint = builder.endpoint;
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
            private Boolean enableProxyProtocol; 
            private String endpoint; 
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
             * Indicates whether the proxy protocol is used to preserve client IP addresses.
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
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
             * The port that is used to monitor latency.
             */
            public Builder probePort(Integer probePort) {
                this.probePort = probePort;
                return this;
            }

            /**
             * The protocol that is used to monitor latency. Valid values:
             * <p>
             * 
             * *   **tcp**
             * *   **icmp**
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
             * *   **Domain**: a custom domain name
             * *   **Ip**: a custom IP address
             * *   **PublicIp**: a public IP address provided by Alibaba Cloud
             * *   **ECS**: an Elastic Compute Service (ECS) instance
             * *   **SLB**: a Server Load Balancer (SLB) instance
             * *   **ALB**: an Application Load Balancer (ALB) instance
             * *   **OSS**: an Object Storage Service (OSS) bucket
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
             * The name of the action on the managed instance. Valid values:
             * <p>
             * 
             * *   **Create**
             * *   **Update**
             * *   **Delete**
             * *   **Associate**
             * *   **UserUnmanaged**
             * *   **CreateChild**
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The type of the child resource. Valid values:
             * <p>
             * 
             * *   **Listener**: listener
             * *   **IpSet**: acceleration region
             * *   **EndpointGroup**: endpoint group
             * *   **ForwardingRule**: forwarding rule
             * *   **Endpoint**: endpoint
             * *   **EndpointGroupDestination**: protocol mapping of an endpoint group associated with a custom routing listener
             * *   **EndpointPolicy**: traffic policy of an endpoint associated with a custom routing listener
             * 
             * >  This parameter takes effect only if **Action** is set to **CreateChild**.
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
             * The tag key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value.
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
}
