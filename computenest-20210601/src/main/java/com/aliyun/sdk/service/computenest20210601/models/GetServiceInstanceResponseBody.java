// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceInstanceResponseBody</p>
 */
public class GetServiceInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BizStatus")
    private String bizStatus;

    @com.aliyun.core.annotation.NameInMap("Components")
    private String components;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("EnableInstanceOps")
    private Boolean enableInstanceOps;

    @com.aliyun.core.annotation.NameInMap("EnableUserPrometheus")
    private Boolean enableUserPrometheus;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("GrafanaDashBoardUrl")
    private String grafanaDashBoardUrl;

    @com.aliyun.core.annotation.NameInMap("IsOperated")
    private Boolean isOperated;

    @com.aliyun.core.annotation.NameInMap("LicenseEndTime")
    private String licenseEndTime;

    @com.aliyun.core.annotation.NameInMap("MarketInstanceId")
    private String marketInstanceId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("NetworkConfig")
    private NetworkConfig networkConfig;

    @com.aliyun.core.annotation.NameInMap("OperatedServiceInstanceId")
    private String operatedServiceInstanceId;

    @com.aliyun.core.annotation.NameInMap("OperationEndTime")
    private String operationEndTime;

    @com.aliyun.core.annotation.NameInMap("OperationStartTime")
    private String operationStartTime;

    @com.aliyun.core.annotation.NameInMap("Outputs")
    private String outputs;

    @com.aliyun.core.annotation.NameInMap("Parameters")
    private String parameters;

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.NameInMap("PredefinedParameterName")
    private String predefinedParameterName;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("Resources")
    private String resources;

    @com.aliyun.core.annotation.NameInMap("Service")
    private Service service;

    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    private String serviceInstanceId;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusDetail")
    private String statusDetail;

    @com.aliyun.core.annotation.NameInMap("SupplierUid")
    private Long supplierUid;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private Long userId;

    private GetServiceInstanceResponseBody(Builder builder) {
        this.bizStatus = builder.bizStatus;
        this.components = builder.components;
        this.createTime = builder.createTime;
        this.enableInstanceOps = builder.enableInstanceOps;
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.endTime = builder.endTime;
        this.grafanaDashBoardUrl = builder.grafanaDashBoardUrl;
        this.isOperated = builder.isOperated;
        this.licenseEndTime = builder.licenseEndTime;
        this.marketInstanceId = builder.marketInstanceId;
        this.name = builder.name;
        this.networkConfig = builder.networkConfig;
        this.operatedServiceInstanceId = builder.operatedServiceInstanceId;
        this.operationEndTime = builder.operationEndTime;
        this.operationStartTime = builder.operationStartTime;
        this.outputs = builder.outputs;
        this.parameters = builder.parameters;
        this.payType = builder.payType;
        this.predefinedParameterName = builder.predefinedParameterName;
        this.progress = builder.progress;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
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
     * @return bizStatus
     */
    public String getBizStatus() {
        return this.bizStatus;
    }

    /**
     * @return components
     */
    public String getComponents() {
        return this.components;
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
    public Boolean getEnableUserPrometheus() {
        return this.enableUserPrometheus;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return grafanaDashBoardUrl
     */
    public String getGrafanaDashBoardUrl() {
        return this.grafanaDashBoardUrl;
    }

    /**
     * @return isOperated
     */
    public Boolean getIsOperated() {
        return this.isOperated;
    }

    /**
     * @return licenseEndTime
     */
    public String getLicenseEndTime() {
        return this.licenseEndTime;
    }

    /**
     * @return marketInstanceId
     */
    public String getMarketInstanceId() {
        return this.marketInstanceId;
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
     * @return predefinedParameterName
     */
    public String getPredefinedParameterName() {
        return this.predefinedParameterName;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
        private String bizStatus; 
        private String components; 
        private String createTime; 
        private Boolean enableInstanceOps; 
        private Boolean enableUserPrometheus; 
        private String endTime; 
        private String grafanaDashBoardUrl; 
        private Boolean isOperated; 
        private String licenseEndTime; 
        private String marketInstanceId; 
        private String name; 
        private NetworkConfig networkConfig; 
        private String operatedServiceInstanceId; 
        private String operationEndTime; 
        private String operationStartTime; 
        private String outputs; 
        private String parameters; 
        private String payType; 
        private String predefinedParameterName; 
        private Long progress; 
        private String requestId; 
        private String resourceGroupId; 
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
         * BizStatus.
         */
        public Builder bizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }

        /**
         * 云市场额外计费项。
         */
        public Builder components(String components) {
            this.components = components;
            return this;
        }

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
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
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
         * GrafanaDashBoardUrl.
         */
        public Builder grafanaDashBoardUrl(String grafanaDashBoardUrl) {
            this.grafanaDashBoardUrl = grafanaDashBoardUrl;
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
         * LicenseEndTime.
         */
        public Builder licenseEndTime(String licenseEndTime) {
            this.licenseEndTime = licenseEndTime;
            return this;
        }

        /**
         * MarketInstanceId.
         */
        public Builder marketInstanceId(String marketInstanceId) {
            this.marketInstanceId = marketInstanceId;
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
         * 套餐名称。
         */
        public Builder predefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
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
        @com.aliyun.core.annotation.NameInMap("ConnectBandwidth")
        private Integer connectBandwidth;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndpointIps")
        private java.util.List < String > endpointIps;

        @com.aliyun.core.annotation.NameInMap("IngressEndpointStatus")
        private String ingressEndpointStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkServiceStatus")
        private String networkServiceStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroups")
        private java.util.List < String > securityGroups;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List < String > vSwitches;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ConnectionConfigs(Builder builder) {
            this.connectBandwidth = builder.connectBandwidth;
            this.domainName = builder.domainName;
            this.endpointIps = builder.endpointIps;
            this.ingressEndpointStatus = builder.ingressEndpointStatus;
            this.networkServiceStatus = builder.networkServiceStatus;
            this.regionId = builder.regionId;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
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
            private String regionId; 
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
             * 域名名称。
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
        @com.aliyun.core.annotation.NameInMap("ConnectionConfigs")
        private java.util.List < ConnectionConfigs> connectionConfigs;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneId")
        private String privateZoneId;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneName")
        private String privateZoneName;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private PrivateVpcConnections(Builder builder) {
            this.connectionConfigs = builder.connectionConfigs;
            this.endpointId = builder.endpointId;
            this.privateZoneId = builder.privateZoneId;
            this.privateZoneName = builder.privateZoneName;
            this.regionId = builder.regionId;
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
         * @return privateZoneId
         */
        public String getPrivateZoneId() {
            return this.privateZoneId;
        }

        /**
         * @return privateZoneName
         */
        public String getPrivateZoneName() {
            return this.privateZoneName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private java.util.List < ConnectionConfigs> connectionConfigs; 
            private String endpointId; 
            private String privateZoneId; 
            private String privateZoneName; 
            private String regionId; 

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
             * PrivateZoneId.
             */
            public Builder privateZoneId(String privateZoneId) {
                this.privateZoneId = privateZoneId;
                return this;
            }

            /**
             * PrivateZoneName.
             */
            public Builder privateZoneName(String privateZoneName) {
                this.privateZoneName = privateZoneName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public PrivateVpcConnections build() {
                return new PrivateVpcConnections(this);
            } 

        } 

    }
    public static class ReversePrivateVpcConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        private ReversePrivateVpcConnections(Builder builder) {
            this.endpointId = builder.endpointId;
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

        public static final class Builder {
            private String endpointId; 

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            public ReversePrivateVpcConnections build() {
                return new ReversePrivateVpcConnections(this);
            } 

        } 

    }
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("PrivateVpcConnections")
        private java.util.List < PrivateVpcConnections> privateVpcConnections;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneId")
        private String privateZoneId;

        @com.aliyun.core.annotation.NameInMap("ReversePrivateVpcConnections")
        private java.util.List < ReversePrivateVpcConnections> reversePrivateVpcConnections;

        private NetworkConfig(Builder builder) {
            this.endpointId = builder.endpointId;
            this.privateVpcConnections = builder.privateVpcConnections;
            this.privateZoneId = builder.privateZoneId;
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
         * @return privateVpcConnections
         */
        public java.util.List < PrivateVpcConnections> getPrivateVpcConnections() {
            return this.privateVpcConnections;
        }

        /**
         * @return privateZoneId
         */
        public String getPrivateZoneId() {
            return this.privateZoneId;
        }

        /**
         * @return reversePrivateVpcConnections
         */
        public java.util.List < ReversePrivateVpcConnections> getReversePrivateVpcConnections() {
            return this.reversePrivateVpcConnections;
        }

        public static final class Builder {
            private String endpointId; 
            private java.util.List < PrivateVpcConnections> privateVpcConnections; 
            private String privateZoneId; 
            private java.util.List < ReversePrivateVpcConnections> reversePrivateVpcConnections; 

            /**
             * EndpointId.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
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
             * PrivateZoneId.
             */
            public Builder privateZoneId(String privateZoneId) {
                this.privateZoneId = privateZoneId;
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
        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Locale")
        private String locale;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
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
        @com.aliyun.core.annotation.NameInMap("DeployMetadata")
        private String deployMetadata;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("ServiceDocUrl")
        private String serviceDocUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceInfos")
        private java.util.List < ServiceInfos> serviceInfos;

        @com.aliyun.core.annotation.NameInMap("ServiceProductUrl")
        private String serviceProductUrl;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        @com.aliyun.core.annotation.NameInMap("UpgradableServiceVersions")
        private java.util.List < String > upgradableServiceVersions;

        @com.aliyun.core.annotation.NameInMap("UpgradeMetadata")
        private String upgradeMetadata;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
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
            this.upgradeMetadata = builder.upgradeMetadata;
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
         * @return upgradeMetadata
         */
        public String getUpgradeMetadata() {
            return this.upgradeMetadata;
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
            private String upgradeMetadata; 
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
             * UpgradeMetadata.
             */
            public Builder upgradeMetadata(String upgradeMetadata) {
                this.upgradeMetadata = upgradeMetadata;
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
