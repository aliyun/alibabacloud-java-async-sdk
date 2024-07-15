// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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

    @com.aliyun.core.annotation.NameInMap("LicenseMetadata")
    private String licenseMetadata;

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

    @com.aliyun.core.annotation.NameInMap("RdAccountLoginUrl")
    private String rdAccountLoginUrl;

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
        this.createTime = builder.createTime;
        this.enableInstanceOps = builder.enableInstanceOps;
        this.enableUserPrometheus = builder.enableUserPrometheus;
        this.endTime = builder.endTime;
        this.grafanaDashBoardUrl = builder.grafanaDashBoardUrl;
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
        this.predefinedParameterName = builder.predefinedParameterName;
        this.progress = builder.progress;
        this.rdAccountLoginUrl = builder.rdAccountLoginUrl;
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
        private String createTime; 
        private Boolean enableInstanceOps; 
        private Boolean enableUserPrometheus; 
        private String endTime; 
        private String grafanaDashBoardUrl; 
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
        private String predefinedParameterName; 
        private Long progress; 
        private String rdAccountLoginUrl; 
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
         * The business status of the service instance. Valid values:
         * <p>
         * 
         * *   Normal: The service instance is normal.
         * *   Renewing: The service instance is being renewed.
         * *   RenewFailed: The service instance failed to be renewed.
         * *   Expired: The service instance expired.
         */
        public Builder bizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }

        /**
         * The time when the service instance was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Indicates whether the service instance supports the hosted O\&M feature. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder enableInstanceOps(Boolean enableInstanceOps) {
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }

        /**
         * Indicates whether the Prometheus monitoring feature is enabled on the user side.
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * The time when the service instance expires.
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * The URL of the Grafana dashboard.
         */
        public Builder grafanaDashBoardUrl(String grafanaDashBoardUrl) {
            this.grafanaDashBoardUrl = grafanaDashBoardUrl;
            return this;
        }

        /**
         * Indicates whether the hosted O\&M feature is enabled for the service instance. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder isOperated(Boolean isOperated) {
            this.isOperated = isOperated;
            return this;
        }

        /**
         * The license metadata.
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * The name of the service instance.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * The network configurations.
         * <p>
         * 
         * >  This parameter is discontinued.
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * The ID of the service instance that is used to implement hosted O\&M.
         */
        public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }

        /**
         * The end of the time range during which hosted O\&M is implemented.
         */
        public Builder operationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }

        /**
         * The beginning of the time range during which hosted O\&M is implemented.
         */
        public Builder operationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }

        /**
         * The outputs returned from creating the service instance.
         * <p>
         * 
         * *   If the service is deployed by using a ROS template, all output fields of the template are returned.
         * *   If the service is deployed by calling an SPI operation, the output fields of the service provider and for the Compute Nest additional features are returned.
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * The parameters that are specified to deploy the service instance.
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * The billing method of the service. Valid values:
         * <p>
         * 
         * *   Permanent: Once you purchase the service, you can use it permanently.
         * *   Subscription: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a subscription basis.
         * *   PayAsYouGo: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a pay-as-you-go basis.
         * *   CustomFixTime: You are charged for the service based on a custom duration fixed by the service provider.
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * The package name.
         */
        public Builder predefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
            return this;
        }

        /**
         * The deployment progress of the service instance. Unit: percentage.
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * The logon URL for the accounts in the resource directory corresponding to the service instance.
         */
        public Builder rdAccountLoginUrl(String rdAccountLoginUrl) {
            this.rdAccountLoginUrl = rdAccountLoginUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The list of resources.
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        /**
         * The information about the service to which the service instance belongs.
         */
        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        /**
         * The ID of the service instance.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * The type of the service. Valid values:
         * <p>
         * 
         * *   private: The service is a private service and is deployed within the account of a customer.
         * *   managed: The service is a fully managed service and is deployed within the account of a service provider.
         * *   operation: The service is a hosted O\&M service.
         * *   poc: The service is a trial service.
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * The source of the service instance. Valid values:
         * <p>
         * 
         * *   User: Compute Nest customer
         * *   Market: Alibaba Cloud Marketplace
         * *   Supplier: Compute Nest service provider
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * The deployment state of the service instance. Valid values:
         * <p>
         * 
         * *   Created
         * *   Deploying
         * *   DeployedFailed
         * *   Deployed
         * *   Upgrading
         * *   Deleting
         * *   Deleted
         * *   DeletedFailed
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The description of the deployment state of the service instance.
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the service provider.
         */
        public Builder supplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }

        /**
         * The custom tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The template name.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * The time when the service instance was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * The Alibaba Cloud account ID of the user.
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
             * The bandwidth limit for the private connection established based on the private network interconnection mode of Compute Nest.
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * The domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The IP addresses of the endpoints for private connections.
             */
            public Builder endpointIps(java.util.List < String > endpointIps) {
                this.endpointIps = endpointIps;
                return this;
            }

            /**
             * The status of the Ingress endpoint. Valid values:
             * <p>
             * 
             * *   Ready: The Ingress endpoint is connected.
             * *   Pending: The Ingress endpoint is being connected.
             * *   Failed: The Ingress endpoint fails to be connected.
             * *   Deleted: The Ingress endpoint is deleted.
             * *   Deleting: The Ingress endpoint is being deleted.
             */
            public Builder ingressEndpointStatus(String ingressEndpointStatus) {
                this.ingressEndpointStatus = ingressEndpointStatus;
                return this;
            }

            /**
             * The status of the network service. Valid values:
             * <p>
             * 
             * *   Ready: The network service is connected.
             * *   Pending: The network service is being connected.
             * *   Failed: The network service fails to be connected.
             * *   Deleted: The network service is deleted.
             * *   Deleting: The network service is being deleted.
             */
            public Builder networkServiceStatus(String networkServiceStatus) {
                this.networkServiceStatus = networkServiceStatus;
                return this;
            }

            /**
             * The names of the security groups.
             */
            public Builder securityGroups(java.util.List < String > securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * The names of the vSwitches.
             */
            public Builder vSwitches(java.util.List < String > vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * The virtual private cloud (VPC) ID.
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

        @com.aliyun.core.annotation.NameInMap("EndpointServiceId")
        private String endpointServiceId;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneName")
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
             * The network configurations, which are mainly used for the private connection.
             */
            public Builder connectionConfigs(java.util.List < ConnectionConfigs> connectionConfigs) {
                this.connectionConfigs = connectionConfigs;
                return this;
            }

            /**
             * The ID of the endpoint for the private connection.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the endpoint service for the private connection.
             */
            public Builder endpointServiceId(String endpointServiceId) {
                this.endpointServiceId = endpointServiceId;
                return this;
            }

            /**
             * The custom domain name.
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
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointServiceId")
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
             * The ID of the endpoint for the reverse private connection.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the endpoint service for the reverse private connection.
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
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointServiceId")
        private String endpointServiceId;

        @com.aliyun.core.annotation.NameInMap("PrivateVpcConnections")
        private java.util.List < PrivateVpcConnections> privateVpcConnections;

        @com.aliyun.core.annotation.NameInMap("ReversePrivateVpcConnections")
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
             * The ID of the endpoint for the private connection.
             * <p>
             * 
             * >  This parameter is discontinued.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The ID of the endpoint service for the private connection.
             * <p>
             * 
             * >  This parameter is discontinued.
             */
            public Builder endpointServiceId(String endpointServiceId) {
                this.endpointServiceId = endpointServiceId;
                return this;
            }

            /**
             * The information about private connections.
             */
            public Builder privateVpcConnections(java.util.List < PrivateVpcConnections> privateVpcConnections) {
                this.privateVpcConnections = privateVpcConnections;
                return this;
            }

            /**
             * The information about the reverse private connection.
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
             * The URL of the service icon.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The language of the service instance.
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * The service name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The description of the service.
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
             * The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.
             */
            public Builder deployMetadata(String deployMetadata) {
                this.deployMetadata = deployMetadata;
                return this;
            }

            /**
             * The deployment type of the service. Valid values:
             * <p>
             * 
             * *   ros: The service is deployed by using Resource Orchestration Service (ROS).
             * *   terraform: The service is deployed by using Terraform.
             * *   ack: The service is deployed by using Container Service for Kubernetes (ACK).
             * *   spi: The service is deployed by calling a service provider interface (SPI).
             * *   operation: The service is deployed by using a hosted O\&M service.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * The time when the service was published.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * The URL of the service documentation.
             */
            public Builder serviceDocUrl(String serviceDocUrl) {
                this.serviceDocUrl = serviceDocUrl;
                return this;
            }

            /**
             * The service ID.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * The information about the service.
             */
            public Builder serviceInfos(java.util.List < ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * The URL of the service page.
             */
            public Builder serviceProductUrl(String serviceProductUrl) {
                this.serviceProductUrl = serviceProductUrl;
                return this;
            }

            /**
             * The type of the service. Valid values:
             * <p>
             * 
             * *   private: The service is a private service and is deployed within the account of a customer.
             * *   managed: The service is a fully managed service and is deployed within the account of a service provider.
             * *   operation: The service is a hosted O\&M service.
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * The status of the service. Valid values:
             * <p>
             * 
             * Draft: The registration request of the service is pending to be submitted.
             * 
             * Submitted: The registration request of the service is submitted.
             * 
             * Approved: The registration request of the service is approved.
             * 
             * Online: The service is published.
             * 
             * Offline: The service is unpublished.
             * 
             * Deleted: The service is deleted.
             * 
             * Launching: The service is being published.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The name of the service provider.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * The URL of the service provider.
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            /**
             * The service versions that can be updated.
             */
            public Builder upgradableServiceVersions(java.util.List < String > upgradableServiceVersions) {
                this.upgradableServiceVersions = upgradableServiceVersions;
                return this;
            }

            /**
             * The service version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * The custom version name defined by the service provider.
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
