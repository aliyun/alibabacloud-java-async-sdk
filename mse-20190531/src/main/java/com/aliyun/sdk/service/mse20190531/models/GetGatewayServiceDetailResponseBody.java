// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetGatewayServiceDetailResponseBody</p>
 */
public class GetGatewayServiceDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetGatewayServiceDetailResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9802C54E-5CC5-5706-927B-993DBB6DCF2F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetGatewayServiceDetailResponseBody build() {
            return new GetGatewayServiceDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class LabelDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Values")
        private java.util.List<String> values;

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
        public java.util.List<String> getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private java.util.List<String> values; 

            private Builder() {
            } 

            private Builder(LabelDetails model) {
                this.key = model.key;
                this.values = model.values;
            } 

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>label</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             */
            public Builder values(java.util.List<String> values) {
                this.values = values;
                return this;
            }

            public LabelDetails build() {
                return new LabelDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class PortTrafficPolicyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private Long serviceId;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("TrafficPolicy")
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

            private Builder() {
            } 

            private Builder(PortTrafficPolicyList model) {
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.serviceId = model.serviceId;
                this.servicePort = model.servicePort;
                this.trafficPolicy = model.trafficPolicy;
            } 

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-2837hfd91h34dbg87364g*****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1667460287386</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1667460287386</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The port ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder serviceId(Long serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The traffic policy.</p>
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
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Labels model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class ServiceVersion extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
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
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<Labels> labels; 
            private String name; 

            private Builder() {
            } 

            private Builder(ServiceVersion model) {
                this.labels = model.labels;
                this.name = model.name;
            } 

            /**
             * <p>The tag.</p>
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>v2</p>
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
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class VersionDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointNum")
        private Integer endpointNum;

        @com.aliyun.core.annotation.NameInMap("EndpointNumPercent")
        private String endpointNumPercent;

        @com.aliyun.core.annotation.NameInMap("ServiceVersion")
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

            private Builder() {
            } 

            private Builder(VersionDetails model) {
                this.endpointNum = model.endpointNum;
                this.endpointNumPercent = model.endpointNumPercent;
                this.serviceVersion = model.serviceVersion;
            } 

            /**
             * <p>The number of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder endpointNum(Integer endpointNum) {
                this.endpointNum = endpointNum;
                return this;
            }

            /**
             * <p>The percentage of instances.</p>
             * 
             * <strong>example:</strong>
             * <p>20%</p>
             */
            public Builder endpointNumPercent(String endpointNumPercent) {
                this.endpointNumPercent = endpointNumPercent;
                return this;
            }

            /**
             * <p>The service version.</p>
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
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class Versions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Versions model) {
                this.label = model.label;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The tag.</p>
             * 
             * <strong>example:</strong>
             * <p>version</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The type.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link GetGatewayServiceDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetGatewayServiceDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DnsServerList")
        private java.util.List<String> dnsServerList;

        @com.aliyun.core.annotation.NameInMap("GatewayId")
        private Long gatewayId;

        @com.aliyun.core.annotation.NameInMap("GatewayTrafficPolicy")
        private TrafficPolicy gatewayTrafficPolicy;

        @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
        private String gatewayUniqueId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("HealthCheck")
        private String healthCheck;

        @com.aliyun.core.annotation.NameInMap("HealthStatus")
        private String healthStatus;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("LabelDetails")
        private java.util.List<LabelDetails> labelDetails;

        @com.aliyun.core.annotation.NameInMap("MetaInfo")
        private String metaInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("PortTrafficPolicyList")
        private java.util.List<PortTrafficPolicyList> portTrafficPolicyList;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Integer> ports;

        @com.aliyun.core.annotation.NameInMap("ServiceFQDN")
        private String serviceFQDN;

        @com.aliyun.core.annotation.NameInMap("ServiceNameInRegistry")
        private String serviceNameInRegistry;

        @com.aliyun.core.annotation.NameInMap("ServicePort")
        private Integer servicePort;

        @com.aliyun.core.annotation.NameInMap("ServiceProtocol")
        private String serviceProtocol;

        @com.aliyun.core.annotation.NameInMap("SourceId")
        private Long sourceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        @com.aliyun.core.annotation.NameInMap("VersionDetails")
        private java.util.List<VersionDetails> versionDetails;

        @com.aliyun.core.annotation.NameInMap("Versions")
        private java.util.List<Versions> versions;

        private Data(Builder builder) {
            this.dnsServerList = builder.dnsServerList;
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
            this.serviceFQDN = builder.serviceFQDN;
            this.serviceNameInRegistry = builder.serviceNameInRegistry;
            this.servicePort = builder.servicePort;
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
         * @return dnsServerList
         */
        public java.util.List<String> getDnsServerList() {
            return this.dnsServerList;
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
        public java.util.List<String> getIps() {
            return this.ips;
        }

        /**
         * @return labelDetails
         */
        public java.util.List<LabelDetails> getLabelDetails() {
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
        public java.util.List<PortTrafficPolicyList> getPortTrafficPolicyList() {
            return this.portTrafficPolicyList;
        }

        /**
         * @return ports
         */
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        /**
         * @return serviceFQDN
         */
        public String getServiceFQDN() {
            return this.serviceFQDN;
        }

        /**
         * @return serviceNameInRegistry
         */
        public String getServiceNameInRegistry() {
            return this.serviceNameInRegistry;
        }

        /**
         * @return servicePort
         */
        public Integer getServicePort() {
            return this.servicePort;
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
        public java.util.List<VersionDetails> getVersionDetails() {
            return this.versionDetails;
        }

        /**
         * @return versions
         */
        public java.util.List<Versions> getVersions() {
            return this.versions;
        }

        public static final class Builder {
            private java.util.List<String> dnsServerList; 
            private Long gatewayId; 
            private TrafficPolicy gatewayTrafficPolicy; 
            private String gatewayUniqueId; 
            private String gmtCreate; 
            private String gmtModified; 
            private String groupName; 
            private String healthCheck; 
            private String healthStatus; 
            private Long id; 
            private java.util.List<String> ips; 
            private java.util.List<LabelDetails> labelDetails; 
            private String metaInfo; 
            private String name; 
            private String namespace; 
            private java.util.List<PortTrafficPolicyList> portTrafficPolicyList; 
            private java.util.List<Integer> ports; 
            private String serviceFQDN; 
            private String serviceNameInRegistry; 
            private Integer servicePort; 
            private String serviceProtocol; 
            private Long sourceId; 
            private String sourceType; 
            private java.util.List<VersionDetails> versionDetails; 
            private java.util.List<Versions> versions; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dnsServerList = model.dnsServerList;
                this.gatewayId = model.gatewayId;
                this.gatewayTrafficPolicy = model.gatewayTrafficPolicy;
                this.gatewayUniqueId = model.gatewayUniqueId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.groupName = model.groupName;
                this.healthCheck = model.healthCheck;
                this.healthStatus = model.healthStatus;
                this.id = model.id;
                this.ips = model.ips;
                this.labelDetails = model.labelDetails;
                this.metaInfo = model.metaInfo;
                this.name = model.name;
                this.namespace = model.namespace;
                this.portTrafficPolicyList = model.portTrafficPolicyList;
                this.ports = model.ports;
                this.serviceFQDN = model.serviceFQDN;
                this.serviceNameInRegistry = model.serviceNameInRegistry;
                this.servicePort = model.servicePort;
                this.serviceProtocol = model.serviceProtocol;
                this.sourceId = model.sourceId;
                this.sourceType = model.sourceType;
                this.versionDetails = model.versionDetails;
                this.versions = model.versions;
            } 

            /**
             * DnsServerList.
             */
            public Builder dnsServerList(java.util.List<String> dnsServerList) {
                this.dnsServerList = dnsServerList;
                return this;
            }

            /**
             * <p>The ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder gatewayId(Long gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * <p>The traffic policy of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder gatewayTrafficPolicy(TrafficPolicy gatewayTrafficPolicy) {
                this.gatewayTrafficPolicy = gatewayTrafficPolicy;
                return this;
            }

            /**
             * <p>The unique ID of the gateway.</p>
             * 
             * <strong>example:</strong>
             * <p>gw-7ea3da97b96543e19f6c597c****</p>
             */
            public Builder gatewayUniqueId(String gatewayUniqueId) {
                this.gatewayUniqueId = gatewayUniqueId;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07 18:07:57</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-07T10:07:57.000+0000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The name of the group.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>Indicates whether the health check is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder healthCheck(String healthCheck) {
                this.healthCheck = healthCheck;
                return this;
            }

            /**
             * <p>The status of the health check. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder healthStatus(String healthStatus) {
                this.healthStatus = healthStatus;
                return this;
            }

            /**
             * <p>The ID of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The IP address of the service.</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The details of the tag.</p>
             */
            public Builder labelDetails(java.util.List<LabelDetails> labelDetails) {
                this.labelDetails = labelDetails;
                return this;
            }

            /**
             * <p>The basic information about the service.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder metaInfo(String metaInfo) {
                this.metaInfo = metaInfo;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The traffic policy of service ports.</p>
             */
            public Builder portTrafficPolicyList(java.util.List<PortTrafficPolicyList> portTrafficPolicyList) {
                this.portTrafficPolicyList = portTrafficPolicyList;
                return this;
            }

            /**
             * <p>The array of service ports.</p>
             */
            public Builder ports(java.util.List<Integer> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * ServiceFQDN.
             */
            public Builder serviceFQDN(String serviceFQDN) {
                this.serviceFQDN = serviceFQDN;
                return this;
            }

            /**
             * <p>The name of the service registered with the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder serviceNameInRegistry(String serviceNameInRegistry) {
                this.serviceNameInRegistry = serviceNameInRegistry;
                return this;
            }

            /**
             * <p>The service port number.</p>
             * 
             * <strong>example:</strong>
             * <p>8080</p>
             */
            public Builder servicePort(Integer servicePort) {
                this.servicePort = servicePort;
                return this;
            }

            /**
             * <p>The protocol of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder serviceProtocol(String serviceProtocol) {
                this.serviceProtocol = serviceProtocol;
                return this;
            }

            /**
             * <p>The ID of the service source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sourceId(Long sourceId) {
                this.sourceId = sourceId;
                return this;
            }

            /**
             * <p>The source type of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>MSE</p>
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * <p>The details of versions.</p>
             */
            public Builder versionDetails(java.util.List<VersionDetails> versionDetails) {
                this.versionDetails = versionDetails;
                return this;
            }

            /**
             * <p>The service version. This parameter is deprecated.</p>
             */
            public Builder versions(java.util.List<Versions> versions) {
                this.versions = versions;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
