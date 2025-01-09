// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    private java.util.List<Tags> tags;

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
    public java.util.List<Tags> getTags() {
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
        private java.util.List<Tags> tags; 
        private String templateName; 
        private String updateTime; 
        private Long userId; 

        /**
         * <p>The business state of the service instance. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Renewing</li>
         * <li>RenewFailed</li>
         * <li>Expired</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder bizStatus(String bizStatus) {
            this.bizStatus = bizStatus;
            return this;
        }

        /**
         * <p>Cloud Marketplace additional billing items.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TiKVServerCount&quot;:&quot;3&quot;,&quot;package_version&quot;:&quot;yuncode5398300001&quot;,&quot;PDServerCount&quot;:&quot;3&quot;,&quot;TiDBServerCount&quot;:&quot;2&quot;}</p>
         */
        public Builder components(String components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The time when the serviceInstance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the service instance supports the operation feature. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableInstanceOps(Boolean enableInstanceOps) {
            this.enableInstanceOps = enableInstanceOps;
            return this;
        }

        /**
         * <p>Whether to enable Prometheus monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * <p>The expiration time of service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The URL of the Grafana dashboard.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.console.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxx-xxxxxxxx-and-dashboard?orgId=355401&refresh=10s">https://g.console.aliyun.com/d/xxxxxxxx-cn-mariadb/mysql-xxxxxx-xxxxxxxx-and-dashboard?orgId=355401&amp;refresh=10s</a></p>
         */
        public Builder grafanaDashBoardUrl(String grafanaDashBoardUrl) {
            this.grafanaDashBoardUrl = grafanaDashBoardUrl;
            return this;
        }

        /**
         * <p>Indicates whether the hosted O&amp;M feature is enabled for the service instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isOperated(Boolean isOperated) {
            this.isOperated = isOperated;
            return this;
        }

        /**
         * <p>The expiration time of licence.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        public Builder licenseEndTime(String licenseEndTime) {
            this.licenseEndTime = licenseEndTime;
            return this;
        }

        /**
         * <p>The market Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>704***59</p>
         */
        public Builder marketInstanceId(String marketInstanceId) {
            this.marketInstanceId = marketInstanceId;
            return this;
        }

        /**
         * <p>The name of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>TestName</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network configurations.</p>
         * <blockquote>
         * <p> This parameter is discontinued.</p>
         * </blockquote>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The serviceInstance  to be operated.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }

        /**
         * <p>The operation end time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-28T06:48:56Z</p>
         */
        public Builder operationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }

        /**
         * <p>The operation start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T06:48:56Z</p>
         */
        public Builder operationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }

        /**
         * <p>The outputs returned from creating the service instance.</p>
         * <ul>
         * <li>If the service is deployed by using a ROS template, all output fields of the template are returned.</li>
         * <li>If the service is deployed by calling an SPI operation, the output fields of the service provider and for the Compute Nest additional features are returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;InstanceIds&quot;:[&quot;i-hp38ofxl0dsyfi7z****&quot;]}</p>
         */
        public Builder outputs(String outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * <p>The parameters configured for the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param&quot;:&quot;value&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The billing method of the instance for market. Valid values:</p>
         * <ul>
         * <li>Permanent: Permanent purchase</li>
         * <li>Subscription: Subscription.</li>
         * <li>PayAsYouGo: Pay-as-you-go.</li>
         * <li>CustomFixTime: Merchant custom fixed duration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Subscription</p>
         */
        public Builder payType(String payType) {
            this.payType = payType;
            return this;
        }

        /**
         * <p>The package name.</p>
         * 
         * <strong>example:</strong>
         * <p>Package one</p>
         */
        public Builder predefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
            return this;
        }

        /**
         * <p>The deployment progress of the service instance. Unit: percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        public Builder progress(Long progress) {
            this.progress = progress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4DB0F536-B3BE-4F0D-BD29-E83FB56D550C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-bp67acfmxazb4p****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The resources.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;StackId&quot;: &quot;stack-xxx&quot;}]</p>
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The information about the service to which the service instance belongs.</p>
         */
        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        /**
         * <p>The ID of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The type of the service. Valid values:</p>
         * <ul>
         * <li>private: The service is a private service and is deployed within the account of a customer.</li>
         * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
         * <li>operation: The service is a hosted O&amp;M service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>private</p>
         */
        public Builder serviceType(String serviceType) {
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>The source of the serviceInstance. Valid values:</p>
         * <ul>
         * <li>User</li>
         * <li>Market</li>
         * <li>Supplier</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The deploy status of the serviceInstance. Valid values:</p>
         * <ul>
         * <li>Created</li>
         * <li>Deploying</li>
         * <li>DeployedFailed</li>
         * <li>Deployed</li>
         * <li>Upgrading</li>
         * <li>Deleting</li>
         * <li>Deleted</li>
         * <li>DeletedFailed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployed</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The description of the deployment state of the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy successfully</p>
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID of the service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>158927391332*****</p>
         */
        public Builder supplierUid(Long supplierUid) {
            this.supplierUid = supplierUid;
            return this;
        }

        /**
         * <p>The tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template one</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The time when the serviceInstance  was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The AliUid of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>130920852836****</p>
         */
        public Builder userId(Long userId) {
            this.userId = userId;
            return this;
        }

        public GetServiceInstanceResponseBody build() {
            return new GetServiceInstanceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
    public static class ConnectionConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectBandwidth")
        private Integer connectBandwidth;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("EndpointIps")
        private java.util.List<String> endpointIps;

        @com.aliyun.core.annotation.NameInMap("IngressEndpointStatus")
        private String ingressEndpointStatus;

        @com.aliyun.core.annotation.NameInMap("NetworkServiceStatus")
        private String networkServiceStatus;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityGroups")
        private java.util.List<String> securityGroups;

        @com.aliyun.core.annotation.NameInMap("VSwitches")
        private java.util.List<String> vSwitches;

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
        public java.util.List<String> getEndpointIps() {
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
        public java.util.List<String> getSecurityGroups() {
            return this.securityGroups;
        }

        /**
         * @return vSwitches
         */
        public java.util.List<String> getVSwitches() {
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
            private java.util.List<String> endpointIps; 
            private String ingressEndpointStatus; 
            private String networkServiceStatus; 
            private String regionId; 
            private java.util.List<String> securityGroups; 
            private java.util.List<String> vSwitches; 
            private String vpcId; 

            /**
             * <p>The bandwidth limit for the private connection established based on the private network interconnection mode of Compute Nest.</p>
             * 
             * <strong>example:</strong>
             * <p>1536Mbps</p>
             */
            public Builder connectBandwidth(Integer connectBandwidth) {
                this.connectBandwidth = connectBandwidth;
                return this;
            }

            /**
             * <p>The domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>ie-569a9be34f5534f6bc6559b5c1xxxxxx.service-51f80502802e48xxxxxx.cn-hangzhou.computenest.aliyuncs.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The IP addresses of the endpoints of the private connections.</p>
             */
            public Builder endpointIps(java.util.List<String> endpointIps) {
                this.endpointIps = endpointIps;
                return this;
            }

            /**
             * <p>The state of the ingress endpoint. Valid values:</p>
             * <ul>
             * <li>Ready: The ingress endpoint is connected.</li>
             * <li>Pending: The ingress endpoint is being connected.</li>
             * <li>Failed: The ingress endpoint fails to be connected.</li>
             * <li>Deleted: The ingress endpoint is deleted.</li>
             * <li>Deleting: The ingress endpoint is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder ingressEndpointStatus(String ingressEndpointStatus) {
                this.ingressEndpointStatus = ingressEndpointStatus;
                return this;
            }

            /**
             * <p>The state of the network service. Valid values:</p>
             * <ul>
             * <li>Ready: The network service is connected.</li>
             * <li>Pending: The network service is being connected.</li>
             * <li>Failed: The network service fails to be connected.</li>
             * <li>Deleted: The network service is deleted.</li>
             * <li>Deleting: The network service is being deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder networkServiceStatus(String networkServiceStatus) {
                this.networkServiceStatus = networkServiceStatus;
                return this;
            }

            /**
             * <p>The region ID of the VPC to which the endpoint of the private connection established based on the private network interconnection mode of Compute Nest belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The names of the security groups.</p>
             */
            public Builder securityGroups(java.util.List<String> securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * <p>The names of the vSwitches.</p>
             */
            public Builder vSwitches(java.util.List<String> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1vwnn14rqpyiczj****</p>
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
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
    public static class PrivateVpcConnections extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConnectionConfigs")
        private java.util.List<ConnectionConfigs> connectionConfigs;

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
        public java.util.List<ConnectionConfigs> getConnectionConfigs() {
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
            private java.util.List<ConnectionConfigs> connectionConfigs; 
            private String endpointId; 
            private String privateZoneId; 
            private String privateZoneName; 
            private String regionId; 

            /**
             * <p>The network configurations, which are mainly used for private connections.</p>
             */
            public Builder connectionConfigs(java.util.List<ConnectionConfigs> connectionConfigs) {
                this.connectionConfigs = connectionConfigs;
                return this;
            }

            /**
             * <p>The endpoint ID of the private connection.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-m5ei37240541816b****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the private zone of the custom private domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>cb7f214f80ac348d87daaeac1f35****</p>
             */
            public Builder privateZoneId(String privateZoneId) {
                this.privateZoneId = privateZoneId;
                return this;
            }

            /**
             * <p>The custom domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.computenest.aliyuncs.com</p>
             */
            public Builder privateZoneName(String privateZoneName) {
                this.privateZoneName = privateZoneName;
                return this;
            }

            /**
             * <p>The region ID of the endpoint of the PrivateLink connection.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
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
             * <p>The endpoint ID of the reverse private connection.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-m5ei42370541816b****</p>
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
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
    public static class NetworkConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("PrivateVpcConnections")
        private java.util.List<PrivateVpcConnections> privateVpcConnections;

        @com.aliyun.core.annotation.NameInMap("PrivateZoneId")
        private String privateZoneId;

        @com.aliyun.core.annotation.NameInMap("ReversePrivateVpcConnections")
        private java.util.List<ReversePrivateVpcConnections> reversePrivateVpcConnections;

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
        public java.util.List<PrivateVpcConnections> getPrivateVpcConnections() {
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
        public java.util.List<ReversePrivateVpcConnections> getReversePrivateVpcConnections() {
            return this.reversePrivateVpcConnections;
        }

        public static final class Builder {
            private String endpointId; 
            private java.util.List<PrivateVpcConnections> privateVpcConnections; 
            private String privateZoneId; 
            private java.util.List<ReversePrivateVpcConnections> reversePrivateVpcConnections; 

            /**
             * <p>The ID of the endpoint for the private connection.</p>
             * <blockquote>
             * <p> This parameter is discontinued.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ep-m5ei37240541816b****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The information about private connections.</p>
             */
            public Builder privateVpcConnections(java.util.List<PrivateVpcConnections> privateVpcConnections) {
                this.privateVpcConnections = privateVpcConnections;
                return this;
            }

            /**
             * <p>The PrivateZone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb7f214f80ac348d87daaeac1f35****</p>
             */
            public Builder privateZoneId(String privateZoneId) {
                this.privateZoneId = privateZoneId;
                return this;
            }

            /**
             * <p>The information about the reverse private connection.</p>
             */
            public Builder reversePrivateVpcConnections(java.util.List<ReversePrivateVpcConnections> reversePrivateVpcConnections) {
                this.reversePrivateVpcConnections = reversePrivateVpcConnections;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
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
             * <p>The URL of the service icon.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png">https://example.com/service-image/c1c4a559-cc60-4af1-b976-98f356602462.png</a></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The language of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Docker Community Edition</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>Docker Community Edition (CE) is a free version of the Docker project, aimed at developers, enthusiasts, and individuals and organizations who want to use container technology.</p>
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
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
    public static class UpgradableServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private UpgradableServiceInfos(Builder builder) {
            this.version = builder.version;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpgradableServiceInfos create() {
            return builder().build();
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
            private String version; 
            private String versionName; 

            /**
             * <p>An upgradable service version.</p>
             * 
             * <strong>example:</strong>
             * <p>draft</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version name of an upgradable service version.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public UpgradableServiceInfos build() {
                return new UpgradableServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
     */
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
        private java.util.List<ServiceInfos> serviceInfos;

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

        @com.aliyun.core.annotation.NameInMap("UpgradableServiceInfos")
        private java.util.List<UpgradableServiceInfos> upgradableServiceInfos;

        @com.aliyun.core.annotation.NameInMap("UpgradableServiceVersions")
        private java.util.List<String> upgradableServiceVersions;

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
            this.upgradableServiceInfos = builder.upgradableServiceInfos;
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
        public java.util.List<ServiceInfos> getServiceInfos() {
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
         * @return upgradableServiceInfos
         */
        public java.util.List<UpgradableServiceInfos> getUpgradableServiceInfos() {
            return this.upgradableServiceInfos;
        }

        /**
         * @return upgradableServiceVersions
         */
        public java.util.List<String> getUpgradableServiceVersions() {
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
            private java.util.List<ServiceInfos> serviceInfos; 
            private String serviceProductUrl; 
            private String serviceType; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private java.util.List<UpgradableServiceInfos> upgradableServiceInfos; 
            private java.util.List<String> upgradableServiceVersions; 
            private String upgradeMetadata; 
            private String version; 
            private String versionName; 

            /**
             * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
             */
            public Builder deployMetadata(String deployMetadata) {
                this.deployMetadata = deployMetadata;
                return this;
            }

            /**
             * <p>The deployment type of the service. Valid values:</p>
             * <ul>
             * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
             * <li>terraform: The service is deployed by using Terraform.</li>
             * <li>ack: The service is deployed by using Container Service for Kubernetes (ACK).</li>
             * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
             * <li>operation: The service is deployed by using a hosted O&amp;M service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ros</p>
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
                return this;
            }

            /**
             * <p>The time when the service version was published.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21T00:00:00Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The URL of the service documentation.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder serviceDocUrl(String serviceDocUrl) {
                this.serviceDocUrl = serviceDocUrl;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-9c8a3522528b4fe8****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The information about the service.</p>
             */
            public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * <p>The URL of the service page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com">https://service-info-private.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder serviceProductUrl(String serviceProductUrl) {
                this.serviceProductUrl = serviceProductUrl;
                return this;
            }

            /**
             * <p>The type of the service. Valid values:</p>
             * <ul>
             * <li>private: The service is a private service and is deployed within the account of a customer.</li>
             * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
             * <li>operation: The service is a hosted O&amp;M service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The status of the service. Valid values:</p>
             * <ul>
             * <li>Draft</li>
             * <li>Submited</li>
             * <li>Approved</li>
             * <li>Online</li>
             * <li>Offline</li>
             * <li>Deleted</li>
             * <li>Launching</li>
             * <li>Beta</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The name of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The URL of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            /**
             * <p>The upgradable service version.</p>
             */
            public Builder upgradableServiceInfos(java.util.List<UpgradableServiceInfos> upgradableServiceInfos) {
                this.upgradableServiceInfos = upgradableServiceInfos;
                return this;
            }

            /**
             * <p>The service version that can be updated.</p>
             */
            public Builder upgradableServiceVersions(java.util.List<String> upgradableServiceVersions) {
                this.upgradableServiceVersions = upgradableServiceVersions;
                return this;
            }

            /**
             * <p>The metadata about the upgrade.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;Type&quot;: &quot;OOS&quot;,
             *   &quot;Description&quot;: &quot;Changelog or something description&quot;,
             *   &quot;SupportUpgradeFromVersions&quot;: [1, 2],
             *   &quot;UpgradeSteps&quot;: {
             *     &quot;PreUpgradeStage&quot;: {
             *       &quot;Description&quot;: &quot;初始化数据库&quot;,
             *       &quot;Type&quot;: &quot;RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     },
             *     &quot;UpgradeStage&quot;: [{
             *       &quot;Description&quot;: &quot;更新EcsRole1实例&quot;,
             *       &quot;Type&quot;: &quot;RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;ArtifactsDownloadDirectory&quot;: &quot;/home/admin&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     }],
             *     &quot;PostUpgradeStage&quot;: {
             *       &quot;Description&quot;: &quot;部署后post check&quot;,
             *       &quot;Type&quot;: &quot;None/RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     }
             *   }
             * }</p>
             */
            public Builder upgradeMetadata(String upgradeMetadata) {
                this.upgradeMetadata = upgradeMetadata;
                return this;
            }

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The custom version name defined by the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>1.1.0</p>
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
    /**
     * 
     * {@link GetServiceInstanceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceInstanceResponseBody</p>
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

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
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
