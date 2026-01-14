// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEndpointGroupResponseBody</p>
 */
public class DescribeEndpointGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AcceleratorId")
    private String acceleratorId;

    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeaderList")
    private java.util.List<String> accessLogRecordCustomizedHeaderList;

    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    private Boolean accessLogRecordCustomizedHeadersEnabled;

    @com.aliyun.core.annotation.NameInMap("AccessLogSwitch")
    private String accessLogSwitch;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnableAccessLog")
    private Boolean enableAccessLog;

    @com.aliyun.core.annotation.NameInMap("EndpointConfigurations")
    private java.util.List<EndpointConfigurations> endpointConfigurations;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupId")
    private String endpointGroupId;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupIpList")
    private java.util.List<String> endpointGroupIpList;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupRegion")
    private String endpointGroupRegion;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupType")
    private String endpointGroupType;

    @com.aliyun.core.annotation.NameInMap("EndpointGroupUnconfirmedIpList")
    private java.util.List<String> endpointGroupUnconfirmedIpList;

    @com.aliyun.core.annotation.NameInMap("EndpointIpVersion")
    private String endpointIpVersion;

    @com.aliyun.core.annotation.NameInMap("EndpointPrivateIpList")
    private java.util.List<EndpointPrivateIpList> endpointPrivateIpList;

    @com.aliyun.core.annotation.NameInMap("EndpointProtocolVersion")
    private String endpointProtocolVersion;

    @com.aliyun.core.annotation.NameInMap("EndpointRequestProtocol")
    private String endpointRequestProtocol;

    @com.aliyun.core.annotation.NameInMap("ForwardingRuleIds")
    private java.util.List<String> forwardingRuleIds;

    @com.aliyun.core.annotation.NameInMap("HealthCheckEnabled")
    private Boolean healthCheckEnabled;

    @com.aliyun.core.annotation.NameInMap("HealthCheckHost")
    private String healthCheckHost;

    @com.aliyun.core.annotation.NameInMap("HealthCheckIntervalSeconds")
    private Integer healthCheckIntervalSeconds;

    @com.aliyun.core.annotation.NameInMap("HealthCheckPath")
    private String healthCheckPath;

    @com.aliyun.core.annotation.NameInMap("HealthCheckPort")
    private Integer healthCheckPort;

    @com.aliyun.core.annotation.NameInMap("HealthCheckProtocol")
    private String healthCheckProtocol;

    @com.aliyun.core.annotation.NameInMap("ListenerId")
    private String listenerId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PortOverrides")
    private java.util.List<PortOverrides> portOverrides;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceManaged")
    private Boolean serviceManaged;

    @com.aliyun.core.annotation.NameInMap("ServiceManagedInfos")
    private java.util.List<ServiceManagedInfos> serviceManagedInfos;

    @com.aliyun.core.annotation.NameInMap("SlsLogStoreName")
    private String slsLogStoreName;

    @com.aliyun.core.annotation.NameInMap("SlsProjectName")
    private String slsProjectName;

    @com.aliyun.core.annotation.NameInMap("SlsRegion")
    private String slsRegion;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("ThresholdCount")
    private Integer thresholdCount;

    @com.aliyun.core.annotation.NameInMap("TrafficPercentage")
    private Integer trafficPercentage;

    private DescribeEndpointGroupResponseBody(Builder builder) {
        this.acceleratorId = builder.acceleratorId;
        this.accessLogRecordCustomizedHeaderList = builder.accessLogRecordCustomizedHeaderList;
        this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
        this.accessLogSwitch = builder.accessLogSwitch;
        this.description = builder.description;
        this.enableAccessLog = builder.enableAccessLog;
        this.endpointConfigurations = builder.endpointConfigurations;
        this.endpointGroupId = builder.endpointGroupId;
        this.endpointGroupIpList = builder.endpointGroupIpList;
        this.endpointGroupRegion = builder.endpointGroupRegion;
        this.endpointGroupType = builder.endpointGroupType;
        this.endpointGroupUnconfirmedIpList = builder.endpointGroupUnconfirmedIpList;
        this.endpointIpVersion = builder.endpointIpVersion;
        this.endpointPrivateIpList = builder.endpointPrivateIpList;
        this.endpointProtocolVersion = builder.endpointProtocolVersion;
        this.endpointRequestProtocol = builder.endpointRequestProtocol;
        this.forwardingRuleIds = builder.forwardingRuleIds;
        this.healthCheckEnabled = builder.healthCheckEnabled;
        this.healthCheckHost = builder.healthCheckHost;
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return accessLogRecordCustomizedHeaderList
     */
    public java.util.List<String> getAccessLogRecordCustomizedHeaderList() {
        return this.accessLogRecordCustomizedHeaderList;
    }

    /**
     * @return accessLogRecordCustomizedHeadersEnabled
     */
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
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
    public java.util.List<EndpointConfigurations> getEndpointConfigurations() {
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
    public java.util.List<String> getEndpointGroupIpList() {
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
    public java.util.List<String> getEndpointGroupUnconfirmedIpList() {
        return this.endpointGroupUnconfirmedIpList;
    }

    /**
     * @return endpointIpVersion
     */
    public String getEndpointIpVersion() {
        return this.endpointIpVersion;
    }

    /**
     * @return endpointPrivateIpList
     */
    public java.util.List<EndpointPrivateIpList> getEndpointPrivateIpList() {
        return this.endpointPrivateIpList;
    }

    /**
     * @return endpointProtocolVersion
     */
    public String getEndpointProtocolVersion() {
        return this.endpointProtocolVersion;
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
    public java.util.List<String> getForwardingRuleIds() {
        return this.forwardingRuleIds;
    }

    /**
     * @return healthCheckEnabled
     */
    public Boolean getHealthCheckEnabled() {
        return this.healthCheckEnabled;
    }

    /**
     * @return healthCheckHost
     */
    public String getHealthCheckHost() {
        return this.healthCheckHost;
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
    public java.util.List<PortOverrides> getPortOverrides() {
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
    public java.util.List<ServiceManagedInfos> getServiceManagedInfos() {
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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<String> accessLogRecordCustomizedHeaderList; 
        private Boolean accessLogRecordCustomizedHeadersEnabled; 
        private String accessLogSwitch; 
        private String description; 
        private Boolean enableAccessLog; 
        private java.util.List<EndpointConfigurations> endpointConfigurations; 
        private String endpointGroupId; 
        private java.util.List<String> endpointGroupIpList; 
        private String endpointGroupRegion; 
        private String endpointGroupType; 
        private java.util.List<String> endpointGroupUnconfirmedIpList; 
        private String endpointIpVersion; 
        private java.util.List<EndpointPrivateIpList> endpointPrivateIpList; 
        private String endpointProtocolVersion; 
        private String endpointRequestProtocol; 
        private java.util.List<String> forwardingRuleIds; 
        private Boolean healthCheckEnabled; 
        private String healthCheckHost; 
        private Integer healthCheckIntervalSeconds; 
        private String healthCheckPath; 
        private Integer healthCheckPort; 
        private String healthCheckProtocol; 
        private String listenerId; 
        private String name; 
        private java.util.List<PortOverrides> portOverrides; 
        private String requestId; 
        private String serviceId; 
        private Boolean serviceManaged; 
        private java.util.List<ServiceManagedInfos> serviceManagedInfos; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegion; 
        private String state; 
        private java.util.List<Tags> tags; 
        private Integer thresholdCount; 
        private Integer trafficPercentage; 

        private Builder() {
        } 

        private Builder(DescribeEndpointGroupResponseBody model) {
            this.acceleratorId = model.acceleratorId;
            this.accessLogRecordCustomizedHeaderList = model.accessLogRecordCustomizedHeaderList;
            this.accessLogRecordCustomizedHeadersEnabled = model.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogSwitch = model.accessLogSwitch;
            this.description = model.description;
            this.enableAccessLog = model.enableAccessLog;
            this.endpointConfigurations = model.endpointConfigurations;
            this.endpointGroupId = model.endpointGroupId;
            this.endpointGroupIpList = model.endpointGroupIpList;
            this.endpointGroupRegion = model.endpointGroupRegion;
            this.endpointGroupType = model.endpointGroupType;
            this.endpointGroupUnconfirmedIpList = model.endpointGroupUnconfirmedIpList;
            this.endpointIpVersion = model.endpointIpVersion;
            this.endpointPrivateIpList = model.endpointPrivateIpList;
            this.endpointProtocolVersion = model.endpointProtocolVersion;
            this.endpointRequestProtocol = model.endpointRequestProtocol;
            this.forwardingRuleIds = model.forwardingRuleIds;
            this.healthCheckEnabled = model.healthCheckEnabled;
            this.healthCheckHost = model.healthCheckHost;
            this.healthCheckIntervalSeconds = model.healthCheckIntervalSeconds;
            this.healthCheckPath = model.healthCheckPath;
            this.healthCheckPort = model.healthCheckPort;
            this.healthCheckProtocol = model.healthCheckProtocol;
            this.listenerId = model.listenerId;
            this.name = model.name;
            this.portOverrides = model.portOverrides;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
            this.serviceManaged = model.serviceManaged;
            this.serviceManagedInfos = model.serviceManagedInfos;
            this.slsLogStoreName = model.slsLogStoreName;
            this.slsProjectName = model.slsProjectName;
            this.slsRegion = model.slsRegion;
            this.state = model.state;
            this.tags = model.tags;
            this.thresholdCount = model.thresholdCount;
            this.trafficPercentage = model.trafficPercentage;
        } 

        /**
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1odcab8tmno0hdq****</p>
         */
        public Builder acceleratorId(String acceleratorId) {
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeaderList.
         */
        public Builder accessLogRecordCustomizedHeaderList(java.util.List<String> accessLogRecordCustomizedHeaderList) {
            this.accessLogRecordCustomizedHeaderList = accessLogRecordCustomizedHeaderList;
            return this;
        }

        /**
         * AccessLogRecordCustomizedHeadersEnabled.
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * <p>Indicates the binding status between the Simple Log Service project and the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>on:</strong> The endpoint group is bound to the Simple Log Service project.</li>
         * <li><strong>off:</strong> The endpoint group is not bound to the Simple Log Service project.</li>
         * <li><strong>binding:</strong> The endpoint group is being bound to the Simple Log Service project.</li>
         * <li><strong>unbinding:</strong> The endpoint group is being unbound from the Simple Log Service project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder accessLogSwitch(String accessLogSwitch) {
            this.accessLogSwitch = accessLogSwitch;
            return this;
        }

        /**
         * <p>The description of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the access log feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAccessLog(Boolean enableAccessLog) {
            this.enableAccessLog = enableAccessLog;
            return this;
        }

        /**
         * <p>The configurations of endpoints in the endpoint group.</p>
         */
        public Builder endpointConfigurations(java.util.List<EndpointConfigurations> endpointConfigurations) {
            this.endpointConfigurations = endpointConfigurations;
            return this;
        }

        /**
         * <p>The ID of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>epg-bp14sz7ftcwwjgrdm****</p>
         */
        public Builder endpointGroupId(String endpointGroupId) {
            this.endpointGroupId = endpointGroupId;
            return this;
        }

        /**
         * <p>The active endpoint IP addresses of the endpoint group.</p>
         */
        public Builder endpointGroupIpList(java.util.List<String> endpointGroupIpList) {
            this.endpointGroupIpList = endpointGroupIpList;
            return this;
        }

        /**
         * <p>The ID of the region where the endpoint group is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder endpointGroupRegion(String endpointGroupRegion) {
            this.endpointGroupRegion = endpointGroupRegion;
            return this;
        }

        /**
         * <p>The type of endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>default</strong>: a default endpoint group</li>
         * <li><strong>virtual</strong>: a virtual endpoint group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder endpointGroupType(String endpointGroupType) {
            this.endpointGroupType = endpointGroupType;
            return this;
        }

        /**
         * <p>The endpoint group IP addresses to be confirmed. After the GA instance is upgraded, the IP addresses that are added to the endpoint group need to be confirmed.</p>
         */
        public Builder endpointGroupUnconfirmedIpList(java.util.List<String> endpointGroupUnconfirmedIpList) {
            this.endpointGroupUnconfirmedIpList = endpointGroupUnconfirmedIpList;
            return this;
        }

        /**
         * EndpointIpVersion.
         */
        public Builder endpointIpVersion(String endpointIpVersion) {
            this.endpointIpVersion = endpointIpVersion;
            return this;
        }

        /**
         * EndpointPrivateIpList.
         */
        public Builder endpointPrivateIpList(java.util.List<EndpointPrivateIpList> endpointPrivateIpList) {
            this.endpointPrivateIpList = endpointPrivateIpList;
            return this;
        }

        /**
         * <p>The version of the protocol that is used by the backend service.</p>
         * <ul>
         * <li><strong>HTTP1.1</strong></li>
         * <li><strong>HTTP2</strong></li>
         * </ul>
         */
        public Builder endpointProtocolVersion(String endpointProtocolVersion) {
            this.endpointProtocolVersion = endpointProtocolVersion;
            return this;
        }

        /**
         * <p>The protocol that is used by the backend service.</p>
         * <ul>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        public Builder endpointRequestProtocol(String endpointRequestProtocol) {
            this.endpointRequestProtocol = endpointRequestProtocol;
            return this;
        }

        /**
         * <p>The ID of the forwarding rule that is associated with the endpoint group.</p>
         */
        public Builder forwardingRuleIds(java.util.List<String> forwardingRuleIds) {
            this.forwardingRuleIds = forwardingRuleIds;
            return this;
        }

        /**
         * <p>Indicates whether the health check feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled</li>
         * <li><strong>false</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder healthCheckEnabled(Boolean healthCheckEnabled) {
            this.healthCheckEnabled = healthCheckEnabled;
            return this;
        }

        /**
         * HealthCheckHost.
         */
        public Builder healthCheckHost(String healthCheckHost) {
            this.healthCheckHost = healthCheckHost;
            return this;
        }

        /**
         * <p>The interval between two consecutive health checks. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder healthCheckIntervalSeconds(Integer healthCheckIntervalSeconds) {
            this.healthCheckIntervalSeconds = healthCheckIntervalSeconds;
            return this;
        }

        /**
         * <p>The path to which health check probes are sent.</p>
         * 
         * <strong>example:</strong>
         * <p>/healthcheck</p>
         */
        public Builder healthCheckPath(String healthCheckPath) {
            this.healthCheckPath = healthCheckPath;
            return this;
        }

        /**
         * <p>The port that is used for health checks.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder healthCheckPort(Integer healthCheckPort) {
            this.healthCheckPort = healthCheckPort;
            return this;
        }

        /**
         * <p>The protocol over which health check requests are sent. Valid values:</p>
         * <ul>
         * <li><strong>tcp</strong> or <strong>TCP</strong></li>
         * <li><strong>http</strong> or <strong>HTTP</strong></li>
         * <li><strong>https</strong> or <strong>HTTPS</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        public Builder healthCheckProtocol(String healthCheckProtocol) {
            this.healthCheckProtocol = healthCheckProtocol;
            return this;
        }

        /**
         * <p>The ID of the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }

        /**
         * <p>The name of the endpoint group.</p>
         * 
         * <strong>example:</strong>
         * <p>group1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The mappings between ports.</p>
         */
        public Builder portOverrides(java.util.List<PortOverrides> portOverrides) {
            this.portOverrides = portOverrides;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6FEA0CF3-D3B9-43E5-A304-D217037876A8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the service that manages the GA instance.</p>
         * <blockquote>
         * <p> This parameter takes effect only if <strong>ServiceManaged</strong> is set to <strong>True</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ALB</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>Indicates whether the instance is managed.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceManaged(Boolean serviceManaged) {
            this.serviceManaged = serviceManaged;
            return this;
        }

        /**
         * <p>The actions that users can perform on the managed instance.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only if the value of <strong>ServiceManaged</strong> is <strong>true</strong>.</li>
         * <li>Users can perform only specific actions on a managed instance.</li>
         * </ul>
         * </blockquote>
         */
        public Builder serviceManagedInfos(java.util.List<ServiceManagedInfos> serviceManagedInfos) {
            this.serviceManagedInfos = serviceManagedInfos;
            return this;
        }

        /**
         * <p>The name of the Logstore.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-01</p>
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * <p>The name of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>pn-01</p>
         */
        public Builder slsProjectName(String slsProjectName) {
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * <p>The region of the Log Service project.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder slsRegion(String slsRegion) {
            this.slsRegion = slsRegion;
            return this;
        }

        /**
         * <p>The status of the endpoint group. Valid values:</p>
         * <ul>
         * <li><strong>init</strong>: The endpoint group is being initialized.</li>
         * <li><strong>active</strong>: The endpoint group is running as expected.</li>
         * <li><strong>updating</strong>: The endpoint group is being updated.</li>
         * <li><strong>deleting</strong>: The endpoint group is being deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The tag of the endpoint group.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The number of consecutive failed health checks that must occur before an endpoint is considered unhealthy.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder thresholdCount(Integer thresholdCount) {
            this.thresholdCount = thresholdCount;
            return this;
        }

        /**
         * <p>The traffic ratio of the endpoint group when the specified listener is associated with multiple endpoint groups.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder trafficPercentage(Integer trafficPercentage) {
            this.trafficPercentage = trafficPercentage;
            return this;
        }

        public DescribeEndpointGroupResponseBody build() {
            return new DescribeEndpointGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointGroupResponseBody</p>
     */
    public static class EndpointConfigurations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableClientIPPreservation")
        private Boolean enableClientIPPreservation;

        @com.aliyun.core.annotation.NameInMap("EnableProxyProtocol")
        private Boolean enableProxyProtocol;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("ProbePort")
        private Integer probePort;

        @com.aliyun.core.annotation.NameInMap("ProbeProtocol")
        private String probeProtocol;

        @com.aliyun.core.annotation.NameInMap("SubAddress")
        private String subAddress;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VSwitchIds")
        private java.util.List<String> vSwitchIds;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private EndpointConfigurations(Builder builder) {
            this.enableClientIPPreservation = builder.enableClientIPPreservation;
            this.enableProxyProtocol = builder.enableProxyProtocol;
            this.endpoint = builder.endpoint;
            this.probePort = builder.probePort;
            this.probeProtocol = builder.probeProtocol;
            this.subAddress = builder.subAddress;
            this.type = builder.type;
            this.vSwitchIds = builder.vSwitchIds;
            this.vpcId = builder.vpcId;
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
         * @return vSwitchIds
         */
        public java.util.List<String> getVSwitchIds() {
            return this.vSwitchIds;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
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
            private java.util.List<String> vSwitchIds; 
            private String vpcId; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(EndpointConfigurations model) {
                this.enableClientIPPreservation = model.enableClientIPPreservation;
                this.enableProxyProtocol = model.enableProxyProtocol;
                this.endpoint = model.endpoint;
                this.probePort = model.probePort;
                this.probeProtocol = model.probeProtocol;
                this.subAddress = model.subAddress;
                this.type = model.type;
                this.vSwitchIds = model.vSwitchIds;
                this.vpcId = model.vpcId;
                this.weight = model.weight;
            } 

            /**
             * <p>Indicates whether the client IP address preservation feature is enabled. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableClientIPPreservation(Boolean enableClientIPPreservation) {
                this.enableClientIPPreservation = enableClientIPPreservation;
                return this;
            }

            /**
             * <p>Indicates whether the proxy protocol is used to preserve client IP addresses.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableProxyProtocol(Boolean enableProxyProtocol) {
                this.enableProxyProtocol = enableProxyProtocol;
                return this;
            }

            /**
             * <p>The IP address, domain name, or ID of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>120.XX.XX.21</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The port that is used to monitor latency.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder probePort(Integer probePort) {
                this.probePort = probePort;
                return this;
            }

            /**
             * <p>The protocol that is used to monitor latency. Valid values:</p>
             * <ul>
             * <li><strong>tcp</strong></li>
             * <li><strong>icmp</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>tcp</p>
             */
            public Builder probeProtocol(String probeProtocol) {
                this.probeProtocol = probeProtocol;
                return this;
            }

            /**
             * <p>The private IP address of the ENI.</p>
             * 
             * <strong>example:</strong>
             * <p>172.168.XX.XX</p>
             */
            public Builder subAddress(String subAddress) {
                this.subAddress = subAddress;
                return this;
            }

            /**
             * <p>The type of the endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Domain</strong>: a custom domain name.</li>
             * <li><strong>Ip</strong>: a custom IP address.</li>
             * <li><strong>IpTarget</strong>: a custom private IP address.</li>
             * <li><strong>PublicIp</strong>: a public IP address provided by Alibaba Cloud.</li>
             * <li><strong>ECS</strong>: an Elastic Compute Service (ECS) instance.</li>
             * <li><strong>SLB</strong>: a Server Load Balancer (SLB) instance.</li>
             * <li><strong>ALB</strong> an Application Load Balancer (ALB) instance.</li>
             * <li><strong>OSS</strong>: an Object Storage Service (OSS) bucket.</li>
             * <li><strong>ENI</strong>: an elastic network interface (ENI).</li>
             * <li><strong>NLB</strong>: a Network Load Balancer (NLB) instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ip</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The IDs of vSwitches that are deployed in the VPC.</p>
             */
            public Builder vSwitchIds(java.util.List<String> vSwitchIds) {
                this.vSwitchIds = vSwitchIds;
                return this;
            }

            /**
             * <p>The VPC ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-hp30gtnxkfxj1l2xt****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The weight of the endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
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
    /**
     * 
     * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointGroupResponseBody</p>
     */
    public static class EndpointPrivateIpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CIDR")
        private String CIDR;

        @com.aliyun.core.annotation.NameInMap("PrivateIp")
        private String privateIp;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        private EndpointPrivateIpList(Builder builder) {
            this.CIDR = builder.CIDR;
            this.privateIp = builder.privateIp;
            this.vSwitchId = builder.vSwitchId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EndpointPrivateIpList create() {
            return builder().build();
        }

        /**
         * @return CIDR
         */
        public String getCIDR() {
            return this.CIDR;
        }

        /**
         * @return privateIp
         */
        public String getPrivateIp() {
            return this.privateIp;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public static final class Builder {
            private String CIDR; 
            private String privateIp; 
            private String vSwitchId; 

            private Builder() {
            } 

            private Builder(EndpointPrivateIpList model) {
                this.CIDR = model.CIDR;
                this.privateIp = model.privateIp;
                this.vSwitchId = model.vSwitchId;
            } 

            /**
             * CIDR.
             */
            public Builder CIDR(String CIDR) {
                this.CIDR = CIDR;
                return this;
            }

            /**
             * PrivateIp.
             */
            public Builder privateIp(String privateIp) {
                this.privateIp = privateIp;
                return this;
            }

            /**
             * VSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            public EndpointPrivateIpList build() {
                return new EndpointPrivateIpList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointGroupResponseBody</p>
     */
    public static class PortOverrides extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointPort")
        private Integer endpointPort;

        @com.aliyun.core.annotation.NameInMap("ListenerPort")
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

            private Builder() {
            } 

            private Builder(PortOverrides model) {
                this.endpointPort = model.endpointPort;
                this.listenerPort = model.listenerPort;
            } 

            /**
             * <p>The endpoint port.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder endpointPort(Integer endpointPort) {
                this.endpointPort = endpointPort;
                return this;
            }

            /**
             * <p>The listener port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
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
    /**
     * 
     * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointGroupResponseBody</p>
     */
    public static class ServiceManagedInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ChildType")
        private String childType;

        @com.aliyun.core.annotation.NameInMap("IsManaged")
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

            private Builder() {
            } 

            private Builder(ServiceManagedInfos model) {
                this.action = model.action;
                this.childType = model.childType;
                this.isManaged = model.isManaged;
            } 

            /**
             * <p>The name of the action on the managed instance.</p>
             * <ul>
             * <li><strong>Create</strong></li>
             * <li><strong>Update</strong></li>
             * <li><strong>Delete</strong></li>
             * <li><strong>Associate</strong></li>
             * <li><strong>UserUnmanaged</strong></li>
             * <li><strong>CreateChild</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Update</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The type of the child resource.</p>
             * <ul>
             * <li><strong>Listener:</strong> listener.</li>
             * <li><strong>IpSet:</strong> acceleration region.</li>
             * <li><strong>EndpointGroup:</strong> endpoint group.</li>
             * <li><strong>ForwardingRule:</strong> forwarding rule.</li>
             * <li><strong>Endpoint:</strong> endpoint.</li>
             * <li><strong>EndpointGroupDestination:</strong> protocol mapping of an endpoint group associated with a custom routing listener.</li>
             * <li><strong>EndpointPolicy:</strong> traffic policy of an endpoint associated with a custom routing listener.</li>
             * </ul>
             * <blockquote>
             * <p> This parameter takes effect only if the value of <strong>Action</strong> is <strong>CreateChild</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Listener</p>
             */
            public Builder childType(String childType) {
                this.childType = childType;
                return this;
            }

            /**
             * <p>Indicates whether the specified actions are managed.</p>
             * <ul>
             * <li><strong>true:</strong> The specified actions are managed. Users cannot perform the specified actions on the managed instance.****</li>
             * <li><strong>false:</strong> The specified actions are not managed. Users can perform the specified actions on the managed instance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link DescribeEndpointGroupResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEndpointGroupResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>test-key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value of the endpoint group.</p>
             * 
             * <strong>example:</strong>
             * <p>test-value</p>
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
