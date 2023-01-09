// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayServiceDetailResponseBody</p>
 */
public class GetGatewayServiceDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetGatewayServiceDetailResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayServiceDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The response code returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The details of the data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayServiceDetailResponseBody build() {
            return new GetGatewayServiceDetailResponseBody(this);
        } 

    } 

    public static class LabelDetails extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Values")
        private java.util.List < String > values;

        private LabelDetails(Builder builder) {
            this.key = builder.key;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelDetails create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List < String > values; 

            /**
             * The tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public LabelDetails build() {
                return new LabelDetails(this);
            } 

        } 

    }
    public static class PortTrafficPolicyList extends TeaModel {
        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ServiceId")
        private Long serviceId;

        @NameInMap("ServicePort")
        private Integer servicePort;

        @NameInMap("TrafficPolicy")
        private TrafficPolicy trafficPolicy;

        private PortTrafficPolicyList(Builder builder) {
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.serviceId = builder.serviceId;
            this.servicePort = builder.servicePort;
            this.trafficPolicy = builder.trafficPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PortTrafficPolicyList create() {
            return builder().build();
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return serviceId
         */
        public Long getServiceId() {
            return this.serviceId;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
        }

        /**
         * @return trafficPolicy
         */
        public TrafficPolicy getTrafficPolicy() {
            return this.trafficPolicy;
        }

        public static final class Builder {
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long serviceId; 
            private Integer servicePort; 
            private TrafficPolicy trafficPolicy; 

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the port configuration.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The service port number.
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * The traffic policy.
             */
            public Builder trafficPolicy(TrafficPolicy trafficPolicy) {
                this.trafficPolicy = trafficPolicy;
                return this;
            }

            public PortTrafficPolicyList build() {
                return new PortTrafficPolicyList(this);
            } 

        } 

    }
    public static class Labels extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
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
             * The tag.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    public static class ServiceVersion extends TeaModel {
        @NameInMap("Labels")
        private java.util.List < Labels> labels;

        @NameInMap("Name")
        private String name;

        private ServiceVersion(Builder builder) {
            this.labels = builder.labels;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceVersion create() {
            return builder().build();
        }

        /**
         * @return labels
         */
        public java.util.List < Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List < Labels> labels; 
            private String name; 

            /**
             * The tag.
             */
            public Builder labels(java.util.List < Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * The version number.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ServiceVersion build() {
                return new ServiceVersion(this);
            } 

        } 

    }
    public static class VersionDetails extends TeaModel {
        @NameInMap("EndpointNum")
        private Integer endpointNum;

        @NameInMap("EndpointNumPercent")
        private String endpointNumPercent;

        @NameInMap("ServiceVersion")
        private ServiceVersion serviceVersion;

        private VersionDetails(Builder builder) {
            this.endpointNum = builder.endpointNum;
            this.endpointNumPercent = builder.endpointNumPercent;
            this.serviceVersion = builder.serviceVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionDetails create() {
            return builder().build();
        }

        /**
         * @return endpointNum
         */
        public Integer getEndpointNum() {
            return this.endpointNum;
        }

        /**
         * @return endpointNumPercent
         */
        public String getEndpointNumPercent() {
            return this.endpointNumPercent;
        }

        /**
         * @return serviceVersion
         */
        public ServiceVersion getServiceVersion() {
            return this.serviceVersion;
        }

        public static final class Builder {
            private Integer endpointNum; 
            private String endpointNumPercent; 
            private ServiceVersion serviceVersion; 

            /**
             * The number of instances.
             */
            public Builder endpointNum(Integer endpointNum) {
                this.endpointNum = endpointNum;
                return this;
            }

            /**
             * The percentage of instances.
             */
            public Builder endpointNumPercent(String endpointNumPercent) {
                this.endpointNumPercent = endpointNumPercent;
                return this;
            }

            /**
             * The version of the service.
             */
            public Builder serviceVersion(ServiceVersion serviceVersion) {
                this.serviceVersion = serviceVersion;
                return this;
            }

            public VersionDetails build() {
                return new VersionDetails(this);
            } 

        } 

    }
    public static class Versions extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Versions(Builder builder) {
            this.label = builder.label;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Versions create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String type; 
            private String value; 

            /**
             * The tag.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * The type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The key of the tag.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Versions build() {
                return new Versions(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("GatewayId")
        private Long gatewayId;

        @NameInMap("GatewayTrafficPolicy")
        private TrafficPolicy gatewayTrafficPolicy;

        @NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("HealthCheck")
        private String healthCheck;

        @NameInMap("HealthStatus")
        private String healthStatus;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Ips")
        private java.util.List < String > ips;

        @NameInMap("LabelDetails")
        private java.util.List < LabelDetails> labelDetails;

        @NameInMap("MetaInfo")
        private String metaInfo;

        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        @NameInMap("PortTrafficPolicyList")
        private java.util.List < PortTrafficPolicyList> portTrafficPolicyList;

        @NameInMap("Ports")
        private java.util.List < Integer > ports;

        @NameInMap("ServiceNameInRegistry")
        private String serviceNameInRegistry;

        @NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @NameInMap("SourceId")
        private Long sourceId;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("VersionDetails")
        private java.util.List < VersionDetails> versionDetails;

        @NameInMap("Versions")
        private java.util.List < Versions> versions;

        private Data(Builder builder) {
            this.gatewayId = builder.gatewayId;
            this.gatewayTrafficPolicy = builder.gatewayTrafficPolicy;
            this.gatewayUniqueId = builder.gatewayUniqueId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.groupName = builder.groupName;
            this.healthCheck = builder.healthCheck;
            this.healthStatus = builder.healthStatus;
            this.id = builder.id;
            this.ips = builder.ips;
            this.labelDetails = builder.labelDetails;
            this.metaInfo = builder.metaInfo;
            this.name = builder.name;
            this.namespace = builder.namespace;
            this.portTrafficPolicyList = builder.portTrafficPolicyList;
            this.ports = builder.ports;
            this.serviceNameInRegistry = builder.serviceNameInRegistry;
            this.serviceProtocol = builder.serviceProtocol;
            this.sourceId = builder.sourceId;
            this.sourceType = builder.sourceType;
            this.versionDetails = builder.versionDetails;
            this.versions = builder.versions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return gatewayId
         */
        public Long getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return gatewayTrafficPolicy
         */
        public TrafficPolicy getGatewayTrafficPolicy() {
            return this.gatewayTrafficPolicy;
        }

        /**
         * @return gatewayUniqueId
         */
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return healthCheck
         */
        public String getHealthCheck() {
            return this.healthCheck;
        }

        /**
         * @return healthStatus
         */
        public String getHealthStatus() {
            return this.healthStatus;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return labelDetails
         */
        public java.util.List < LabelDetails> getLabelDetails() {
            return this.labelDetails;
        }

        /**
         * @return metaInfo
         */
        public String getMetaInfo() {
            return this.metaInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return portTrafficPolicyList
         */
        public java.util.List < PortTrafficPolicyList> getPortTrafficPolicyList() {
            return this.portTrafficPolicyList;
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return serviceNameInRegistry
         */
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        /**
         * @return serviceProtocol
         */
        public String getServiceProtocol() {
            return this.serviceProtocol;
        }

        /**
         * @return sourceId
         */
        public Long getSourceId() {
            return this.sourceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return versionDetails
         */
        public java.util.List < VersionDetails> getVersionDetails() {
            return this.versionDetails;
        }

        /**
         * @return versions
         */
        public java.util.List < Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private Long gatewayId; 
            private TrafficPolicy gatewayTrafficPolicy; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupName; 
            private String healthCheck; 
            private String healthStatus; 
            private Long id; 
            private java.util.List < String > ips; 
            private java.util.List < LabelDetails> labelDetails; 
            private String metaInfo; 
            private String name; 
            private String namespace; 
            private java.util.List < PortTrafficPolicyList> portTrafficPolicyList; 
            private java.util.List < Integer > ports; 
            private String serviceNameInRegistry; 
            private String serviceProtocol; 
            private Long sourceId; 
            private String sourceType; 
            private java.util.List < VersionDetails> versionDetails; 
            private java.util.List < Versions> versions; 

            /**
             * The ID of the gateway.
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * The traffic policy of the service.
             */
            public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
                this.gatewayTrafficPolicy = gatewayTrafficPolicy;
                return this;
            }

            /**
             * The unique ID of the gateway.
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * The creation time.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The last modification time.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The name of the group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * Indicates whether the health check is enabled.
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * The status of the health check. Valid values:
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * The ID of the service.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The IP address of the service.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * The details of the tag.
             */
            public Builder labelDetails(java.util.List < LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * The basic information about the service.
             */
            public Builder metaInfo(String metaInfo) {
                this.metaInfo = metaInfo;
                return this;
            }

            /**
             * The name of the service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * The traffic policy of service ports.
             */
            public Builder portTrafficPolicyList(java.util.List < PortTrafficPolicyList> portTrafficPolicyList) {
                this.portTrafficPolicyList = portTrafficPolicyList;
                return this;
            }

            /**
             * The array of service ports.
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The name of the service registered with the service registry.
             */
            public Builder serviceNameInRegistry(String serviceNameInRegistry) {
                this.serviceNameInRegistry = serviceNameInRegistry;
                return this;
            }

            /**
             * The protocol of the service.
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * The ID of the service source.
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * The source type of the service.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * The details of versions.
             */
            public Builder versionDetails(java.util.List < VersionDetails> versionDetails) {
                this.versionDetails = versionDetails;
                return this;
            }

            /**
             * The version of the service.
             */
            public Builder versions(java.util.List < Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
