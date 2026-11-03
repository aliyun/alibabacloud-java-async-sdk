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

    @com.aliyun.core.annotation.NameInMap("GrantedPermission")
    private GrantedPermission grantedPermission;

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

    @com.aliyun.core.annotation.NameInMap("PolicyNames")
    private String policyNames;

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

    @com.aliyun.core.annotation.NameInMap("SupportTrialToPrivate")
    private Boolean supportTrialToPrivate;

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
        this.grantedPermission = builder.grantedPermission;
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
        this.policyNames = builder.policyNames;
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
        this.supportTrialToPrivate = builder.supportTrialToPrivate;
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

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return grantedPermission
     */
    public GrantedPermission getGrantedPermission() {
        return this.grantedPermission;
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
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
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
     * @return supportTrialToPrivate
     */
    public Boolean getSupportTrialToPrivate() {
        return this.supportTrialToPrivate;
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
        private GrantedPermission grantedPermission; 
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
        private String policyNames; 
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
        private Boolean supportTrialToPrivate; 
        private java.util.List<Tags> tags; 
        private String templateName; 
        private String updateTime; 
        private Long userId; 

        private Builder() {
        } 

        private Builder(GetServiceInstanceResponseBody model) {
            this.bizStatus = model.bizStatus;
            this.components = model.components;
            this.createTime = model.createTime;
            this.enableInstanceOps = model.enableInstanceOps;
            this.enableUserPrometheus = model.enableUserPrometheus;
            this.endTime = model.endTime;
            this.grafanaDashBoardUrl = model.grafanaDashBoardUrl;
            this.grantedPermission = model.grantedPermission;
            this.isOperated = model.isOperated;
            this.licenseEndTime = model.licenseEndTime;
            this.marketInstanceId = model.marketInstanceId;
            this.name = model.name;
            this.networkConfig = model.networkConfig;
            this.operatedServiceInstanceId = model.operatedServiceInstanceId;
            this.operationEndTime = model.operationEndTime;
            this.operationStartTime = model.operationStartTime;
            this.outputs = model.outputs;
            this.parameters = model.parameters;
            this.payType = model.payType;
            this.policyNames = model.policyNames;
            this.predefinedParameterName = model.predefinedParameterName;
            this.progress = model.progress;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.resources = model.resources;
            this.service = model.service;
            this.serviceInstanceId = model.serviceInstanceId;
            this.serviceType = model.serviceType;
            this.source = model.source;
            this.status = model.status;
            this.statusDetail = model.statusDetail;
            this.supplierUid = model.supplierUid;
            this.supportTrialToPrivate = model.supportTrialToPrivate;
            this.tags = model.tags;
            this.templateName = model.templateName;
            this.updateTime = model.updateTime;
            this.userId = model.userId;
        } 

        /**
         * <p>The business status of the service instance. Valid values:</p>
         * <ul>
         * <li><p>Normal: The service instance is normal.</p>
         * </li>
         * <li><p>Renewing: The service instance is being renewed.</p>
         * </li>
         * <li><p>RenewFoiled: The renewal failed.</p>
         * </li>
         * <li><p>Expired: The service instance has expired.</p>
         * </li>
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
         * <p>The extra billing items of Alibaba Cloud Marketplace.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TiKVServerCount&quot;:&quot;3&quot;,&quot;package_version&quot;:&quot;yuncode5398300001&quot;,&quot;PDServerCount&quot;:&quot;3&quot;,&quot;TiDBServerCount&quot;:&quot;2&quot;}</p>
         */
        public Builder components(String components) {
            this.components = components;
            return this;
        }

        /**
         * <p>The time when the service instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>Indicates whether the service instance supports managed O\&amp;M. Valid values:</p>
         * <ul>
         * <li><p>true: The service instance supports managed O\&amp;M.</p>
         * </li>
         * <li><p>false: The service instance does not support managed O\&amp;M.</p>
         * </li>
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
         * <p>Indicates whether Prometheus monitoring is enabled. Valid values:</p>
         * <ul>
         * <li><p>true: enabled.</p>
         * </li>
         * <li><p>false: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableUserPrometheus(Boolean enableUserPrometheus) {
            this.enableUserPrometheus = enableUserPrometheus;
            return this;
        }

        /**
         * <p>The time when the service instance expires.</p>
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
         * GrantedPermission.
         */
        public Builder grantedPermission(GrantedPermission grantedPermission) {
            this.grantedPermission = grantedPermission;
            return this;
        }

        /**
         * <p>Indicates whether managed O\&amp;M is enabled for the service instance. Valid values:</p>
         * <ul>
         * <li><p>true: Managed O\&amp;M is enabled for the service instance.</p>
         * </li>
         * <li><p>false: Managed O\&amp;M is not enabled for the service instance.</p>
         * </li>
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
         * <p>The time when the license expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-01T12:00:00</p>
         */
        public Builder licenseEndTime(String licenseEndTime) {
            this.licenseEndTime = licenseEndTime;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Marketplace instance ID.</p>
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
         * <p>Database B</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The network configuration.</p>
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         */
        public Builder networkConfig(NetworkConfig networkConfig) {
            this.networkConfig = networkConfig;
            return this;
        }

        /**
         * <p>The ID of the service instance that is managed.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
            this.operatedServiceInstanceId = operatedServiceInstanceId;
            return this;
        }

        /**
         * <p>The end time of the managed O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-28T06:48:56Z</p>
         */
        public Builder operationEndTime(String operationEndTime) {
            this.operationEndTime = operationEndTime;
            return this;
        }

        /**
         * <p>The start time of the managed O\&amp;M.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-29T06:48:56Z</p>
         */
        public Builder operationStartTime(String operationStartTime) {
            this.operationStartTime = operationStartTime;
            return this;
        }

        /**
         * <p>The output fields returned when the service instance is created.</p>
         * <ul>
         * <li><p>In ROS mode, all output fields of the template are returned.</p>
         * </li>
         * <li><p>In Service Provider Interface (SPI) mode, the output fields from the independent software vendor (ISV) and the additional features of Compute Nest are returned.</p>
         * </li>
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
         * <p>The parameters that are entered for deploying the service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param&quot;:&quot;value&quot;}</p>
         */
        public Builder parameters(String parameters) {
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><p>Permanent: permanent.</p>
         * </li>
         * <li><p>Subscription: subscription.</p>
         * </li>
         * <li><p>PayAsYouGo: pay-as-you-go.</p>
         * </li>
         * <li><p>CustomFixTime: a custom fixed duration.</p>
         * </li>
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
         * PolicyNames.
         */
        public Builder policyNames(String policyNames) {
            this.policyNames = policyNames;
            return this;
        }

        /**
         * <p>The name of the package.</p>
         * 
         * <strong>example:</strong>
         * <p>Package 1</p>
         */
        public Builder predefinedParameterName(String predefinedParameterName) {
            this.predefinedParameterName = predefinedParameterName;
            return this;
        }

        /**
         * <p>The deployment progress of the service instance. Unit: %.</p>
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
         * <p>The list of resources.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;StackId&quot;: &quot;stack-xxx&quot;}]</p>
         */
        public Builder resources(String resources) {
            this.resources = resources;
            return this;
        }

        /**
         * <p>The details of the service.</p>
         */
        public Builder service(Service service) {
            this.service = service;
            return this;
        }

        /**
         * <p>The service instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>si-d6ab3a63ccbb4b17****</p>
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><p>private: a service instance that is deployed in the user\&quot;s account.</p>
         * </li>
         * <li><p>managed: a service instance that is hosted in the service provider\&quot;s account.</p>
         * </li>
         * <li><p>operation: a managed service instance.</p>
         * </li>
         * <li><p>poc: a trial service instance.</p>
         * </li>
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
         * <p>The source of the service instance. Valid values:</p>
         * <ul>
         * <li><p>User: a Compute Nest user.</p>
         * </li>
         * <li><p>Market: Alibaba Cloud Marketplace.</p>
         * </li>
         * <li><p>Supplier: a Compute Nest service provider.</p>
         * </li>
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
         * <p>The deployment status of the service instance. Valid values:</p>
         * <ul>
         * <li><p>Created: The service instance is created.</p>
         * </li>
         * <li><p>Deploying: The service instance is being deployed.</p>
         * </li>
         * <li><p>DeployedFailed: The service instance failed to be deployed.</p>
         * </li>
         * <li><p>Deployed: The service instance is deployed.</p>
         * </li>
         * <li><p>Upgrading: The service instance is being upgraded.</p>
         * </li>
         * <li><p>Deleting: The service instance is being deleted.</p>
         * </li>
         * <li><p>Deleted: The service instance is deleted.</p>
         * </li>
         * <li><p>DeletedFailed: The service instance failed to be deleted.</p>
         * </li>
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
         * <p>The description of the deployment status of the instance.</p>
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
         * <p>Indicates whether the trial service can be converted to a paid service.</p>
         */
        public Builder supportTrialToPrivate(Boolean supportTrialToPrivate) {
            this.supportTrialToPrivate = supportTrialToPrivate;
            return this;
        }

        /**
         * <p>The custom tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>Template 1</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The time when the service instance was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The user\&quot;s Alibaba Cloud account ID.</p>
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
    public static class GrantedPermission extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperationEndTime")
        private String operationEndTime;

        @com.aliyun.core.annotation.NameInMap("PolicyNames")
        private String policyNames;

        private GrantedPermission(Builder builder) {
            this.operationEndTime = builder.operationEndTime;
            this.policyNames = builder.policyNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantedPermission create() {
            return builder().build();
        }

        /**
         * @return operationEndTime
         */
        public String getOperationEndTime() {
            return this.operationEndTime;
        }

        /**
         * @return policyNames
         */
        public String getPolicyNames() {
            return this.policyNames;
        }

        public static final class Builder {
            private String operationEndTime; 
            private String policyNames; 

            private Builder() {
            } 

            private Builder(GrantedPermission model) {
                this.operationEndTime = model.operationEndTime;
                this.policyNames = model.policyNames;
            } 

            /**
             * <p>The end time of the managed O\&amp;M.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-28T06:48:56Z</p>
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * PolicyNames.
             */
            public Builder policyNames(String policyNames) {
                this.policyNames = policyNames;
                return this;
            }

            public GrantedPermission build() {
                return new GrantedPermission(this);
            } 

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

            private Builder() {
            } 

            private Builder(ConnectionConfigs model) {
                this.connectBandwidth = model.connectBandwidth;
                this.domainName = model.domainName;
                this.endpointIps = model.endpointIps;
                this.ingressEndpointStatus = model.ingressEndpointStatus;
                this.networkServiceStatus = model.networkServiceStatus;
                this.regionId = model.regionId;
                this.securityGroups = model.securityGroups;
                this.vSwitches = model.vSwitches;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The bandwidth limit for the connection that is established in Compute Nest intranet-connected mode.</p>
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
             * <p>The IP address of the PrivateLink endpoint.</p>
             */
            public Builder endpointIps(java.util.List<String> endpointIps) {
                this.endpointIps = endpointIps;
                return this;
            }

            /**
             * <p>The status of the Ingress endpoint. Valid values:</p>
             * <ul>
             * <li><p>Ready: The Ingress endpoint is connected.</p>
             * </li>
             * <li><p>Pending: The Ingress endpoint is being connected.</p>
             * </li>
             * <li><p>Failed: The Ingress endpoint failed to be connected.</p>
             * </li>
             * <li><p>Deleted: The Ingress endpoint is deleted.</p>
             * </li>
             * <li><p>Deleting: The Ingress endpoint is being deleted.</p>
             * </li>
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
             * <p>The status of the network service. Valid values:</p>
             * <ul>
             * <li><p>Ready: The network service is connected.</p>
             * </li>
             * <li><p>Pending: The network service is being connected.</p>
             * </li>
             * <li><p>Failed: The network service failed to be connected.</p>
             * </li>
             * <li><p>Deleted: The network service is deleted.</p>
             * </li>
             * <li><p>Deleting: The network service is being deleted.</p>
             * </li>
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
             * <p>The region where the VPC of the endpoint is located when a private connection is established in Compute Nest intranet-connected mode.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The security group name.</p>
             */
            public Builder securityGroups(java.util.List<String> securityGroups) {
                this.securityGroups = securityGroups;
                return this;
            }

            /**
             * <p>The vSwitch name.</p>
             */
            public Builder vSwitches(java.util.List<String> vSwitches) {
                this.vSwitches = vSwitches;
                return this;
            }

            /**
             * <p>The virtual private cloud (VPC) ID.</p>
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

            private Builder() {
            } 

            private Builder(PrivateVpcConnections model) {
                this.connectionConfigs = model.connectionConfigs;
                this.endpointId = model.endpointId;
                this.privateZoneId = model.privateZoneId;
                this.privateZoneName = model.privateZoneName;
                this.regionId = model.regionId;
            } 

            /**
             * <p>The network configurations. This parameter is used for PrivateLink connections.</p>
             */
            public Builder connectionConfigs(java.util.List<ConnectionConfigs> connectionConfigs) {
                this.connectionConfigs = connectionConfigs;
                return this;
            }

            /**
             * <p>The endpoint ID of the PrivateLink connection.</p>
             * 
             * <strong>example:</strong>
             * <p>ep-m5ei37240541816b****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The ID of the PrivateZone for the custom private domain name.</p>
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
             * <p>The region ID of the endpoint for the PrivateLink connection.</p>
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

            private Builder() {
            } 

            private Builder(ReversePrivateVpcConnections model) {
                this.endpointId = model.endpointId;
            } 

            /**
             * <p>The endpoint ID of the reverse PrivateLink connection.</p>
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

            private Builder() {
            } 

            private Builder(NetworkConfig model) {
                this.endpointId = model.endpointId;
                this.privateVpcConnections = model.privateVpcConnections;
                this.privateZoneId = model.privateZoneId;
                this.reversePrivateVpcConnections = model.reversePrivateVpcConnections;
            } 

            /**
             * <p>The endpoint ID of the PrivateLink connection.</p>
             * <blockquote>
             * <p>This parameter is deprecated.</p>
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
             * <p>The information about the PrivateLink connection.</p>
             */
            public Builder privateVpcConnections(java.util.List<PrivateVpcConnections> privateVpcConnections) {
                this.privateVpcConnections = privateVpcConnections;
                return this;
            }

            /**
             * <p>The ID of the PrivateZone for the custom private domain name.</p>
             * <blockquote>
             * <p>This parameter is deprecated.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cb7f214f80ac348d87daaeac1f35****</p>
             */
            public Builder privateZoneId(String privateZoneId) {
                this.privateZoneId = privateZoneId;
                return this;
            }

            /**
             * <p>The information about the reverse PrivateLink connection.</p>
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

            private Builder() {
            } 

            private Builder(ServiceInfos model) {
                this.image = model.image;
                this.locale = model.locale;
                this.name = model.name;
                this.shortDescription = model.shortDescription;
            } 

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
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>B数据库</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The summary of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>B is an open-source distributed relational database independently designed and developed by Company A.</p>
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

            private Builder() {
            } 

            private Builder(UpgradableServiceInfos model) {
                this.version = model.version;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The service version.</p>
             * 
             * <strong>example:</strong>
             * <p>draft</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>20241112</p>
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

        @com.aliyun.core.annotation.NameInMap("OperationMetadata")
        private String operationMetadata;

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
            this.operationMetadata = builder.operationMetadata;
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
         * @return operationMetadata
         */
        public String getOperationMetadata() {
            return this.operationMetadata;
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
            private String operationMetadata; 
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

            private Builder() {
            } 

            private Builder(Service model) {
                this.deployMetadata = model.deployMetadata;
                this.deployType = model.deployType;
                this.operationMetadata = model.operationMetadata;
                this.publishTime = model.publishTime;
                this.serviceDocUrl = model.serviceDocUrl;
                this.serviceId = model.serviceId;
                this.serviceInfos = model.serviceInfos;
                this.serviceProductUrl = model.serviceProductUrl;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.supplierUrl = model.supplierUrl;
                this.upgradableServiceInfos = model.upgradableServiceInfos;
                this.upgradableServiceVersions = model.upgradableServiceVersions;
                this.upgradeMetadata = model.upgradeMetadata;
                this.version = model.version;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The information about the service deployment configuration. The information varies based on the deployment type. The data is stored in the JSON string format.</p>
             */
            public Builder deployMetadata(String deployMetadata) {
                this.deployMetadata = deployMetadata;
                return this;
            }

            /**
             * <p>The deployment type. Valid values:</p>
             * <ul>
             * <li><p>ros: The service is deployed using ROS.</p>
             * </li>
             * <li><p>terraform: The service is deployed using Terraform.</p>
             * </li>
             * <li><p>ack: The service is deployed using ACK.</p>
             * </li>
             * <li><p>spi: The service is deployed by calling SPI.</p>
             * </li>
             * <li><p>operation: The service is deployed using Alibaba Cloud Managed Services.</p>
             * </li>
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
             * <p>The parameters related to O\&amp;M operations, including service upgrade and downgrade, Prometheus, and log configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;SupportBackup&quot;:false,&quot;PrometheusConfigMap&quot;:{},&quot;ModifyParametersConfig&quot;:[{&quot;TemplateName&quot;:&quot;China edition&quot;,&quot;Operation&quot;:[{&quot;Name&quot;:&quot;Plan modification&quot;,&quot;Description&quot;:&quot;Plan modification&quot;,&quot;Type&quot;:&quot;Custom&quot;,&quot;SupportPredefinedParameters&quot;:true,&quot;EnableLogging&quot;:false},{&quot;Name&quot;:&quot;Parameter modification&quot;,&quot;Description&quot;:&quot;Parameter modification&quot;,&quot;Type&quot;:&quot;Custom&quot;,&quot;SupportPredefinedParameters&quot;:false,&quot;EnableLogging&quot;:false,&quot;Parameters&quot;:[&quot;DataDiskSize&quot;]}]}]}</p>
             */
            public Builder operationMetadata(String operationMetadata) {
                this.operationMetadata = operationMetadata;
                return this;
            }

            /**
             * <p>The time when the service was published.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21T00:00:00Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>The URL of the product documentation.</p>
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
             * <p>The service information.</p>
             */
            public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * <p>The URL of the product page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-info-private.oss-cn-hangzhou.aliyuncs.com">https://service-info-private.oss-cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder serviceProductUrl(String serviceProductUrl) {
                this.serviceProductUrl = serviceProductUrl;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li><p>private: The service is deployed in the user\&quot;s account.</p>
             * </li>
             * <li><p>managed: The service is hosted in the service provider\&quot;s account.</p>
             * </li>
             * <li><p>operation: The service is an Alibaba Cloud Managed Service.</p>
             * </li>
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
             * <p>The service status. Valid values:</p>
             * <ul>
             * <li><p>Draft: The service is pending registration submission.</p>
             * </li>
             * <li><p>Submitted: The registration is submitted.</p>
             * </li>
             * <li><p>Approved: The registration is approved.</p>
             * </li>
             * <li><p>Online: The service is published.</p>
             * </li>
             * <li><p>Offline: The service is unpublished.</p>
             * </li>
             * <li><p>Deleted: The service is deleted.</p>
             * </li>
             * <li><p>Launching: The service is being published.</p>
             * </li>
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
             * <p>Company A</p>
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
             * <p>The information about the service versions to which the service can be upgraded.</p>
             */
            public Builder upgradableServiceInfos(java.util.List<UpgradableServiceInfos> upgradableServiceInfos) {
                this.upgradableServiceInfos = upgradableServiceInfos;
                return this;
            }

            /**
             * <p>The list of service versions to which the service can be upgraded.</p>
             */
            public Builder upgradableServiceVersions(java.util.List<String> upgradableServiceVersions) {
                this.upgradableServiceVersions = upgradableServiceVersions;
                return this;
            }

            /**
             * <p>The upgrade metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;Type&quot;: &quot;OOS&quot;,
             *   &quot;Description&quot;: &quot;Changelog or something description&quot;,
             *   &quot;SupportUpgradeFromVersions&quot;: [1, 2],
             *   &quot;UpgradeSteps&quot;: {
             *     &quot;PreUpgradeStage&quot;: {
             *       &quot;Description&quot;: &quot;Initialize database&quot;,
             *       &quot;Type&quot;: &quot;RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     },
             *     &quot;UpgradeStage&quot;: [{
             *       &quot;Description&quot;: &quot;Update EcsRole1 instance&quot;,
             *       &quot;Type&quot;: &quot;RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;ArtifactsDownloadDirectory&quot;: &quot;/home/admin&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     }],
             *     &quot;PostUpgradeStage&quot;: {
             *       &quot;Description&quot;: &quot;Post-deployment check&quot;,
             *       &quot;Type&quot;: &quot;None/RunCommand&quot;,
             *       &quot;ResourceName&quot;: &quot;EcsRole1&quot;,
             *       &quot;CommandType&quot;: &quot;runShellScript&quot;,
             *       &quot;CommandContent&quot;: &quot;echo hello&quot;
             *     }
             *   }
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
             * <p>Version A</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

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
