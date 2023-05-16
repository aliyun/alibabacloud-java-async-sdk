// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceInstanceResponseBody</p>
 */
public class GetServiceInstanceResponseBody extends TeaModel {
    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("EnableInstanceOps")
    private Boolean enableInstanceOps;

    @NameInMap("EnableUserPrometheus")
    private String enableUserPrometheus;

    @NameInMap("EndTime")
    private String endTime;

    @NameInMap("IsOperated")
    private Boolean isOperated;

    @NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @NameInMap("Name")
    private String name;

    @NameInMap("NetworkConfig")
    private NetworkConfig networkConfig;

    @NameInMap("OperatedServiceInstanceId")
    private String operatedServiceInstanceId;

    @NameInMap("OperationEndTime")
    private String operationEndTime;

    @NameInMap("OperationStartTime")
    private String operationStartTime;

    @NameInMap("Outputs")
    private String outputs;

    @NameInMap("Parameters")
    private String parameters;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("Progress")
    private Long progress;

    @NameInMap("RdAccountLoginUrl")
    private String rdAccountLoginUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resources")
    private String resources;

    @NameInMap("Service")
    private Service service;

    @NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @NameInMap("ServiceType")
    private String serviceType;

    @NameInMap("Source")
    private String source;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusDetail")
    private String statusDetail;

    @NameInMap("SupplierUid")
    private Long supplierUid;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("TemplateName")
    private String templateName;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UserId")
    private Long userId;

    private GetServiceInstanceResponseBody(Builder builder) {
        this.createTime = builder.createTime;
        this.enableInstanceOps = builder.enableInstanceOps;
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.endTime = builder.endTime;
        this.isOperated = builder.isOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.name = builder.name;
        this.networkConfig = builder.networkConfig;
        this.operatedServiceInstanceId = builder.operatedServiceInstanceId;
        this.operationEndTime = builder.operationEndTime;
        this.operationStartTime = builder.operationStartTime;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.payType = builder.payType;
        this.progress = builder.progress;
        this.rdAccountLoginUrl = builder.rdAccountLoginUrl;
        this.requestId = builder.requestId;
        this.resources = builder.resources;
        this.service = builder.service;
        this.serviceInstanceId = builder.serviceInstanceId;
        this.serviceType = builder.serviceType;
        this.source = builder.source;
        this.status = builder.status;
        this.statusDetail = builder.statusDetail;
        this.supplierUid = builder.supplierUid;
        this.tags = builder.tags;
        this.templateName = builder.templateName;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return enableInstanceOps
     */
    public Boolean getEnableInstanceOps() {
        return this.enableInstanceOps;
    }

    /**
     * @return enableUserPrometheus
     */
    public String getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return isOperated
     */
    public Boolean getIsOperated() {
        return this.isOperated;
    }

    /**
     * @return licenseMetadata
     */
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return networkConfig
     */
    public NetworkConfig getNetworkConfig() {
        return this.networkConfig;
    }

    /**
     * @return operatedServiceInstanceId
     */
    public String getOperatedServiceInstanceId() {
        return this.operatedServiceInstanceId;
    }

    /**
     * @return operationEndTime
     */
    public String getOperationEndTime() {
        return this.operationEndTime;
    }

    /**
     * @return operationStartTime
     */
    public String getOperationStartTime() {
        return this.operationStartTime;
    }

    /**
     * @return outputs
     */
    public String getOutputs() {
        return this.outputs;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return rdAccountLoginUrl
     */
    public String getRdAccountLoginUrl() {
        return this.rdAccountLoginUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    /**
     * @return service
     */
    public Service getService() {
        return this.service;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return statusDetail
     */
    public String getStatusDetail() {
        return this.statusDetail;
    }

    /**
     * @return supplierUid
     */
    public Long getSupplierUid() {
        return this.supplierUid;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String createTime; 
        private Boolean enableInstanceOps; 
        private String enableUserPrometheus; 
        private String endTime; 
        private Boolean isOperated; 
        private String licenseMetadata; 
        private String name; 
        private NetworkConfig networkConfig; 
        private String operatedServiceInstanceId; 
        private String operationEndTime; 
        private String operationStartTime; 
        private String outputs; 
        private String parameters; 
        private String payType; 
        private Long progress; 
        private String rdAccountLoginUrl; 
        private String requestId; 
        private String resources; 
        private Service service; 
        private String serviceInstanceId; 
        private String serviceType; 
        private String source; 
        private String status; 
        private String statusDetail; 
        private Long supplierUid; 
        private java.util.List < Tags> tags; 
        private String templateName; 
        private String updateTime; 
        private Long userId; 

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * EnableInstanceOps.
         */
        public Builder enableInstanceOps(Boolean enableInstanceOps) {
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }

        /**
         * EnableUserPrometheus.
         */
        public Builder enableUserPrometheus(String enableUserPrometheus) {
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * IsOperated.
         */
        public Builder isOperated(Boolean isOperated) {
            this.isOperated = isOperated;
            return this;
        }

        /**
         * LicenseMetadata.
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
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
         * NetworkConfig.
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * OperatedServiceInstanceId.
         */
        public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }

        /**
         * OperationEndTime.
         */
        public Builder operationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }

        /**
         * OperationStartTime.
         */
        public Builder operationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }

        /**
         * Outputs.
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * PayType.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * Progress.
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * RdAccountLoginUrl.
         */
        public Builder rdAccountLoginUrl(String rdAccountLoginUrl) {
            this.rdAccountLoginUrl = rdAccountLoginUrl;
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
         * Resources.
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        /**
         * Service.
         */
        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        /**
         * ServiceInstanceId.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * StatusDetail.
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        /**
         * SupplierUid.
         */
        public Builder supplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public GetServiceInstanceResponseBody build() {
            return new GetServiceInstanceResponseBody(this);
        } 

    } 

    public static class ConnectionConfigs extends TeaModel {
        @NameInMap("ConnectBandwidth")
        private Integer connectBandwidth;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("EndpointIps")
        private java.util.List < String > endpointIps;

        @NameInMap("IngressEndpointStatus")
        private String ingressEndpointStatus;

        @NameInMap("NetworkServiceStatus")
        private String networkServiceStatus;

        @NameInMap("SecurityGroups")
        private java.util.List < String > securityGroups;

        @NameInMap("VSwitches")
        private java.util.List < String > vSwitches;

        @NameInMap("VpcId")
        private String vpcId;

        private ConnectionConfigs(Builder builder) {
            this.connectBandwidth = builder.connectBandwidth;
            this.domainName = builder.domainName;
            this.endpointIps = builder.endpointIps;
            this.ingressEndpointStatus = builder.ingressEndpointStatus;
            this.networkServiceStatus = builder.networkServiceStatus;
            this.securityGroups = builder.securityGroups;
            this.vSwitches = builder.vSwitches;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConnectionConfigs create() {
            return builder().build();
        }

        /**
         * @return connectBandwidth
         */
        public Integer getConnectBandwidth() {
            return this.connectBandwidth;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return endpointIps
         */
        public java.util.List < String > getEndpointIps() {
            return this.endpointIps;
        }

        /**
         * @return ingressEndpointStatus
         */
        public String getIngressEndpointStatus() {
            return this.ingressEndpointStatus;
        }

        /**
         * @return networkServiceStatus
         */
        public String getNetworkServiceStatus() {
            return this.networkServiceStatus;
        }

        /**
         * @return securityGroups
         */
        public java.util.List < String > getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return vSwitches
         */
        public java.util.List < String > getVSwitches() {
            return this.vSwitches;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private Integer connectBandwidth; 
            private String domainName; 
            private java.util.List < String > endpointIps; 
            private String ingressEndpointStatus; 
            private String networkServiceStatus; 
            private java.util.List < String > securityGroups; 
            private java.util.List < String > vSwitches; 
            private String vpcId; 

            /**
             * ConnectBandwidth.
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * EndpointIps.
             */
            public Builder endpointIps(java.util.List < String > endpointIps) {
                this.endpointIps = endpointIps;
                return this;
            }

            /**
             * IngressEndpointStatus.
             */
            public Builder ingressEndpointStatus(String ingressEndpointStatus) {
                this.ingressEndpointStatus = ingressEndpointStatus;
                return this;
            }

            /**
             * NetworkServiceStatus.
             */
            public Builder networkServiceStatus(String networkServiceStatus) {
                this.networkServiceStatus = networkServiceStatus;
                return this;
            }

            /**
             * SecurityGroups.
             */
            public Builder securityGroups(java.util.List < String > securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * VSwitches.
             */
            public Builder vSwitches(java.util.List < String > vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ConnectionConfigs build() {
                return new ConnectionConfigs(this);
            } 

        } 

    }
    public static class PrivateVpcConnections extends TeaModel {
        @NameInMap("ConnectionConfigs")
        private java.util.List < ConnectionConfigs> connectionConfigs;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointServiceId")
        private String endpointServiceId;

        @NameInMap("PrivateZoneName")
        private String privateZoneName;

        private PrivateVpcConnections(Builder builder) {
            this.connectionConfigs = builder.connectionConfigs;
            this.endpointId = builder.endpointId;
            this.endpointServiceId = builder.endpointServiceId;
            this.privateZoneName = builder.privateZoneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateVpcConnections create() {
            return builder().build();
        }

        /**
         * @return connectionConfigs
         */
        public java.util.List < ConnectionConfigs> getConnectionConfigs() {
            return this.connectionConfigs;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointServiceId
         */
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

        /**
         * @return privateZoneName
         */
        public String getPrivateZoneName() {
            return this.privateZoneName;
        }

        public static final class Builder {
            private java.util.List < ConnectionConfigs> connectionConfigs; 
            private String endpointId; 
            private String endpointServiceId; 
            private String privateZoneName; 

            /**
             * ConnectionConfigs.
             */
            public Builder connectionConfigs(java.util.List < ConnectionConfigs> connectionConfigs) {
                this.connectionConfigs = connectionConfigs;
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
             * EndpointServiceId.
             */
            public Builder endpointServiceId(String endpointServiceId) {
                this.endpointServiceId = endpointServiceId;
                return this;
            }

            /**
             * PrivateZoneName.
             */
            public Builder privateZoneName(String privateZoneName) {
                this.privateZoneName = privateZoneName;
                return this;
            }

            public PrivateVpcConnections build() {
                return new PrivateVpcConnections(this);
            } 

        } 

    }
    public static class ReversePrivateVpcConnections extends TeaModel {
        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointServiceId")
        private String endpointServiceId;

        private ReversePrivateVpcConnections(Builder builder) {
            this.endpointId = builder.endpointId;
            this.endpointServiceId = builder.endpointServiceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReversePrivateVpcConnections create() {
            return builder().build();
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointServiceId
         */
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

        public static final class Builder {
            private String endpointId; 
            private String endpointServiceId; 

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointServiceId.
             */
            public Builder endpointServiceId(String endpointServiceId) {
                this.endpointServiceId = endpointServiceId;
                return this;
            }

            public ReversePrivateVpcConnections build() {
                return new ReversePrivateVpcConnections(this);
            } 

        } 

    }
    public static class NetworkConfig extends TeaModel {
        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointServiceId")
        private String endpointServiceId;

        @NameInMap("PrivateVpcConnections")
        private java.util.List < PrivateVpcConnections> privateVpcConnections;

        @NameInMap("ReversePrivateVpcConnections")
        private java.util.List < ReversePrivateVpcConnections> reversePrivateVpcConnections;

        private NetworkConfig(Builder builder) {
            this.endpointId = builder.endpointId;
            this.endpointServiceId = builder.endpointServiceId;
            this.privateVpcConnections = builder.privateVpcConnections;
            this.reversePrivateVpcConnections = builder.reversePrivateVpcConnections;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointServiceId
         */
        public String getEndpointServiceId() {
            return this.endpointServiceId;
        }

        /**
         * @return privateVpcConnections
         */
        public java.util.List < PrivateVpcConnections> getPrivateVpcConnections() {
            return this.privateVpcConnections;
        }

        /**
         * @return reversePrivateVpcConnections
         */
        public java.util.List < ReversePrivateVpcConnections> getReversePrivateVpcConnections() {
            return this.reversePrivateVpcConnections;
        }

        public static final class Builder {
            private String endpointId; 
            private String endpointServiceId; 
            private java.util.List < PrivateVpcConnections> privateVpcConnections; 
            private java.util.List < ReversePrivateVpcConnections> reversePrivateVpcConnections; 

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * EndpointServiceId.
             */
            public Builder endpointServiceId(String endpointServiceId) {
                this.endpointServiceId = endpointServiceId;
                return this;
            }

            /**
             * PrivateVpcConnections.
             */
            public Builder privateVpcConnections(java.util.List < PrivateVpcConnections> privateVpcConnections) {
                this.privateVpcConnections = privateVpcConnections;
                return this;
            }

            /**
             * ReversePrivateVpcConnections.
             */
            public Builder reversePrivateVpcConnections(java.util.List < ReversePrivateVpcConnections> reversePrivateVpcConnections) {
                this.reversePrivateVpcConnections = reversePrivateVpcConnections;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    public static class ServiceInfos extends TeaModel {
        @NameInMap("Image")
        private String image;

        @NameInMap("Locale")
        private String locale;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShortDescription")
        private String shortDescription;

        private ServiceInfos(Builder builder) {
            this.image = builder.image;
            this.locale = builder.locale;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfos create() {
            return builder().build();
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return locale
         */
        public String getLocale() {
            return this.locale;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        public static final class Builder {
            private String image; 
            private String locale; 
            private String name; 
            private String shortDescription; 

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * Locale.
             */
            public Builder locale(String locale) {
                this.locale = locale;
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
             * ShortDescription.
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            public ServiceInfos build() {
                return new ServiceInfos(this);
            } 

        } 

    }
    public static class Service extends TeaModel {
        @NameInMap("DeployMetadata")
        private String deployMetadata;

        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("PublishTime")
        private String publishTime;

        @NameInMap("ServiceDocUrl")
        private String serviceDocUrl;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceInfos")
        private java.util.List < ServiceInfos> serviceInfos;

        @NameInMap("ServiceProductUrl")
        private String serviceProductUrl;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("SupplierUrl")
        private String supplierUrl;

        @NameInMap("UpgradableServiceVersions")
        private java.util.List < String > upgradableServiceVersions;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionName")
        private String versionName;

        private Service(Builder builder) {
            this.deployMetadata = builder.deployMetadata;
            this.deployType = builder.deployType;
            this.publishTime = builder.publishTime;
            this.serviceDocUrl = builder.serviceDocUrl;
            this.serviceId = builder.serviceId;
            this.serviceInfos = builder.serviceInfos;
            this.serviceProductUrl = builder.serviceProductUrl;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.supplierUrl = builder.supplierUrl;
            this.upgradableServiceVersions = builder.upgradableServiceVersions;
            this.version = builder.version;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Service create() {
            return builder().build();
        }

        /**
         * @return deployMetadata
         */
        public String getDeployMetadata() {
            return this.deployMetadata;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return serviceDocUrl
         */
        public String getServiceDocUrl() {
            return this.serviceDocUrl;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceInfos
         */
        public java.util.List < ServiceInfos> getServiceInfos() {
            return this.serviceInfos;
        }

        /**
         * @return serviceProductUrl
         */
        public String getServiceProductUrl() {
            return this.serviceProductUrl;
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supplierUrl
         */
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        /**
         * @return upgradableServiceVersions
         */
        public java.util.List < String > getUpgradableServiceVersions() {
            return this.upgradableServiceVersions;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String deployMetadata; 
            private String deployType; 
            private String publishTime; 
            private String serviceDocUrl; 
            private String serviceId; 
            private java.util.List < ServiceInfos> serviceInfos; 
            private String serviceProductUrl; 
            private String serviceType; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private java.util.List < String > upgradableServiceVersions; 
            private String version; 
            private String versionName; 

            /**
             * DeployMetadata.
             */
            public Builder deployMetadata(String deployMetadata) {
                this.deployMetadata = deployMetadata;
                return this;
            }

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * ServiceDocUrl.
             */
            public Builder serviceDocUrl(String serviceDocUrl) {
                this.serviceDocUrl = serviceDocUrl;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceInfos.
             */
            public Builder serviceInfos(java.util.List < ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * ServiceProductUrl.
             */
            public Builder serviceProductUrl(String serviceProductUrl) {
                this.serviceProductUrl = serviceProductUrl;
                return this;
            }

            /**
             * ServiceType.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * SupplierUrl.
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            /**
             * UpgradableServiceVersions.
             */
            public Builder upgradableServiceVersions(java.util.List < String > upgradableServiceVersions) {
                this.upgradableServiceVersions = upgradableServiceVersions;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * VersionName.
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public Service build() {
                return new Service(this);
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
