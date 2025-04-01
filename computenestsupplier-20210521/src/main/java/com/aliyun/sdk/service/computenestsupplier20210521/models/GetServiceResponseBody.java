// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @com.aliyun.core.annotation.NameInMap("ApprovalType")
    private String approvalType;

    @com.aliyun.core.annotation.NameInMap("BuildInfo")
    private String buildInfo;

    @com.aliyun.core.annotation.NameInMap("Categories")
    private String categories;

    @com.aliyun.core.annotation.NameInMap("Commodity")
    private Commodity commodity;

    @com.aliyun.core.annotation.NameInMap("ComplianceMetadata")
    private ComplianceMetadata complianceMetadata;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CrossRegionConnectionStatus")
    private String crossRegionConnectionStatus;

    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("EntitySource")
    private java.util.Map<String, String> entitySource;

    @com.aliyun.core.annotation.NameInMap("IsSupportOperated")
    private Boolean isSupportOperated;

    @com.aliyun.core.annotation.NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @com.aliyun.core.annotation.NameInMap("LogMetadata")
    private String logMetadata;

    @com.aliyun.core.annotation.NameInMap("OperationMetadata")
    private String operationMetadata;

    @com.aliyun.core.annotation.NameInMap("PayFromType")
    private String payFromType;

    @com.aliyun.core.annotation.NameInMap("Permission")
    private String permission;

    @com.aliyun.core.annotation.NameInMap("PolicyNames")
    private String policyNames;

    @com.aliyun.core.annotation.NameInMap("Progress")
    private Long progress;

    @com.aliyun.core.annotation.NameInMap("PublishTime")
    private String publishTime;

    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Resellable")
    private Boolean resellable;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServiceAuditDocumentUrl")
    private String serviceAuditDocumentUrl;

    @com.aliyun.core.annotation.NameInMap("ServiceDiscoverable")
    private String serviceDiscoverable;

    @com.aliyun.core.annotation.NameInMap("ServiceDocumentInfos")
    private java.util.List<ServiceDocumentInfos> serviceDocumentInfos;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceInfos")
    private java.util.List<ServiceInfos> serviceInfos;

    @com.aliyun.core.annotation.NameInMap("ServiceProductUrl")
    private String serviceProductUrl;

    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.NameInMap("ShareType")
    private String shareType;

    @com.aliyun.core.annotation.NameInMap("ShareTypeStatus")
    private String shareTypeStatus;

    @com.aliyun.core.annotation.NameInMap("SourceServiceId")
    private String sourceServiceId;

    @com.aliyun.core.annotation.NameInMap("SourceServiceVersion")
    private String sourceServiceVersion;

    @com.aliyun.core.annotation.NameInMap("SourceSupplierName")
    private String sourceSupplierName;

    @com.aliyun.core.annotation.NameInMap("Statistic")
    private Statistic statistic;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("StatusDetail")
    private String statusDetail;

    @com.aliyun.core.annotation.NameInMap("SupplierName")
    private String supplierName;

    @com.aliyun.core.annotation.NameInMap("SupplierUrl")
    private String supplierUrl;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.NameInMap("TenantType")
    private String tenantType;

    @com.aliyun.core.annotation.NameInMap("TestStatus")
    private String testStatus;

    @com.aliyun.core.annotation.NameInMap("TrialDuration")
    private Long trialDuration;

    @com.aliyun.core.annotation.NameInMap("TrialType")
    private String trialType;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UpgradeMetadata")
    private String upgradeMetadata;

    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    @com.aliyun.core.annotation.NameInMap("VirtualInternetService")
    private String virtualInternetService;

    @com.aliyun.core.annotation.NameInMap("VirtualInternetServiceId")
    private String virtualInternetServiceId;

    private GetServiceResponseBody(Builder builder) {
        this.alarmMetadata = builder.alarmMetadata;
        this.approvalType = builder.approvalType;
        this.buildInfo = builder.buildInfo;
        this.categories = builder.categories;
        this.commodity = builder.commodity;
        this.complianceMetadata = builder.complianceMetadata;
        this.createTime = builder.createTime;
        this.crossRegionConnectionStatus = builder.crossRegionConnectionStatus;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.entitySource = builder.entitySource;
        this.isSupportOperated = builder.isSupportOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.logMetadata = builder.logMetadata;
        this.operationMetadata = builder.operationMetadata;
        this.payFromType = builder.payFromType;
        this.permission = builder.permission;
        this.policyNames = builder.policyNames;
        this.progress = builder.progress;
        this.publishTime = builder.publishTime;
        this.registrationId = builder.registrationId;
        this.requestId = builder.requestId;
        this.resellable = builder.resellable;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceAuditDocumentUrl = builder.serviceAuditDocumentUrl;
        this.serviceDiscoverable = builder.serviceDiscoverable;
        this.serviceDocumentInfos = builder.serviceDocumentInfos;
        this.serviceId = builder.serviceId;
        this.serviceInfos = builder.serviceInfos;
        this.serviceProductUrl = builder.serviceProductUrl;
        this.serviceType = builder.serviceType;
        this.shareType = builder.shareType;
        this.shareTypeStatus = builder.shareTypeStatus;
        this.sourceServiceId = builder.sourceServiceId;
        this.sourceServiceVersion = builder.sourceServiceVersion;
        this.sourceSupplierName = builder.sourceSupplierName;
        this.statistic = builder.statistic;
        this.status = builder.status;
        this.statusDetail = builder.statusDetail;
        this.supplierName = builder.supplierName;
        this.supplierUrl = builder.supplierUrl;
        this.tags = builder.tags;
        this.tenantType = builder.tenantType;
        this.testStatus = builder.testStatus;
        this.trialDuration = builder.trialDuration;
        this.trialType = builder.trialType;
        this.updateTime = builder.updateTime;
        this.upgradeMetadata = builder.upgradeMetadata;
        this.version = builder.version;
        this.versionName = builder.versionName;
        this.virtualInternetService = builder.virtualInternetService;
        this.virtualInternetServiceId = builder.virtualInternetServiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmMetadata
     */
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return buildInfo
     */
    public String getBuildInfo() {
        return this.buildInfo;
    }

    /**
     * @return categories
     */
    public String getCategories() {
        return this.categories;
    }

    /**
     * @return commodity
     */
    public Commodity getCommodity() {
        return this.commodity;
    }

    /**
     * @return complianceMetadata
     */
    public ComplianceMetadata getComplianceMetadata() {
        return this.complianceMetadata;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return crossRegionConnectionStatus
     */
    public String getCrossRegionConnectionStatus() {
        return this.crossRegionConnectionStatus;
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
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return entitySource
     */
    public java.util.Map<String, String> getEntitySource() {
        return this.entitySource;
    }

    /**
     * @return isSupportOperated
     */
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    /**
     * @return licenseMetadata
     */
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    /**
     * @return logMetadata
     */
    public String getLogMetadata() {
        return this.logMetadata;
    }

    /**
     * @return operationMetadata
     */
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    /**
     * @return payFromType
     */
    public String getPayFromType() {
        return this.payFromType;
    }

    /**
     * @return permission
     */
    public String getPermission() {
        return this.permission;
    }

    /**
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
    }

    /**
     * @return progress
     */
    public Long getProgress() {
        return this.progress;
    }

    /**
     * @return publishTime
     */
    public String getPublishTime() {
        return this.publishTime;
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resellable
     */
    public Boolean getResellable() {
        return this.resellable;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceAuditDocumentUrl
     */
    public String getServiceAuditDocumentUrl() {
        return this.serviceAuditDocumentUrl;
    }

    /**
     * @return serviceDiscoverable
     */
    public String getServiceDiscoverable() {
        return this.serviceDiscoverable;
    }

    /**
     * @return serviceDocumentInfos
     */
    public java.util.List<ServiceDocumentInfos> getServiceDocumentInfos() {
        return this.serviceDocumentInfos;
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
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return shareTypeStatus
     */
    public String getShareTypeStatus() {
        return this.shareTypeStatus;
    }

    /**
     * @return sourceServiceId
     */
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    /**
     * @return sourceServiceVersion
     */
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    /**
     * @return sourceSupplierName
     */
    public String getSourceSupplierName() {
        return this.sourceSupplierName;
    }

    /**
     * @return statistic
     */
    public Statistic getStatistic() {
        return this.statistic;
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
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return tenantType
     */
    public String getTenantType() {
        return this.tenantType;
    }

    /**
     * @return testStatus
     */
    public String getTestStatus() {
        return this.testStatus;
    }

    /**
     * @return trialDuration
     */
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    /**
     * @return trialType
     */
    public String getTrialType() {
        return this.trialType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
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

    /**
     * @return virtualInternetService
     */
    public String getVirtualInternetService() {
        return this.virtualInternetService;
    }

    /**
     * @return virtualInternetServiceId
     */
    public String getVirtualInternetServiceId() {
        return this.virtualInternetServiceId;
    }

    public static final class Builder {
        private String alarmMetadata; 
        private String approvalType; 
        private String buildInfo; 
        private String categories; 
        private Commodity commodity; 
        private ComplianceMetadata complianceMetadata; 
        private String createTime; 
        private String crossRegionConnectionStatus; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private java.util.Map<String, String> entitySource; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String payFromType; 
        private String permission; 
        private String policyNames; 
        private Long progress; 
        private String publishTime; 
        private String registrationId; 
        private String requestId; 
        private Boolean resellable; 
        private String resourceGroupId; 
        private String serviceAuditDocumentUrl; 
        private String serviceDiscoverable; 
        private java.util.List<ServiceDocumentInfos> serviceDocumentInfos; 
        private String serviceId; 
        private java.util.List<ServiceInfos> serviceInfos; 
        private String serviceProductUrl; 
        private String serviceType; 
        private String shareType; 
        private String shareTypeStatus; 
        private String sourceServiceId; 
        private String sourceServiceVersion; 
        private String sourceSupplierName; 
        private Statistic statistic; 
        private String status; 
        private String statusDetail; 
        private String supplierName; 
        private String supplierUrl; 
        private java.util.List<Tags> tags; 
        private String tenantType; 
        private String testStatus; 
        private Long trialDuration; 
        private String trialType; 
        private String updateTime; 
        private String upgradeMetadata; 
        private String version; 
        private String versionName; 
        private String virtualInternetService; 
        private String virtualInternetServiceId; 

        private Builder() {
        } 

        private Builder(GetServiceResponseBody model) {
            this.alarmMetadata = model.alarmMetadata;
            this.approvalType = model.approvalType;
            this.buildInfo = model.buildInfo;
            this.categories = model.categories;
            this.commodity = model.commodity;
            this.complianceMetadata = model.complianceMetadata;
            this.createTime = model.createTime;
            this.crossRegionConnectionStatus = model.crossRegionConnectionStatus;
            this.deployMetadata = model.deployMetadata;
            this.deployType = model.deployType;
            this.duration = model.duration;
            this.entitySource = model.entitySource;
            this.isSupportOperated = model.isSupportOperated;
            this.licenseMetadata = model.licenseMetadata;
            this.logMetadata = model.logMetadata;
            this.operationMetadata = model.operationMetadata;
            this.payFromType = model.payFromType;
            this.permission = model.permission;
            this.policyNames = model.policyNames;
            this.progress = model.progress;
            this.publishTime = model.publishTime;
            this.registrationId = model.registrationId;
            this.requestId = model.requestId;
            this.resellable = model.resellable;
            this.resourceGroupId = model.resourceGroupId;
            this.serviceAuditDocumentUrl = model.serviceAuditDocumentUrl;
            this.serviceDiscoverable = model.serviceDiscoverable;
            this.serviceDocumentInfos = model.serviceDocumentInfos;
            this.serviceId = model.serviceId;
            this.serviceInfos = model.serviceInfos;
            this.serviceProductUrl = model.serviceProductUrl;
            this.serviceType = model.serviceType;
            this.shareType = model.shareType;
            this.shareTypeStatus = model.shareTypeStatus;
            this.sourceServiceId = model.sourceServiceId;
            this.sourceServiceVersion = model.sourceServiceVersion;
            this.sourceSupplierName = model.sourceSupplierName;
            this.statistic = model.statistic;
            this.status = model.status;
            this.statusDetail = model.statusDetail;
            this.supplierName = model.supplierName;
            this.supplierUrl = model.supplierUrl;
            this.tags = model.tags;
            this.tenantType = model.tenantType;
            this.testStatus = model.testStatus;
            this.trialDuration = model.trialDuration;
            this.trialType = model.trialType;
            this.updateTime = model.updateTime;
            this.upgradeMetadata = model.upgradeMetadata;
            this.version = model.version;
            this.versionName = model.versionName;
            this.virtualInternetService = model.virtualInternetService;
            this.virtualInternetServiceId = model.virtualInternetServiceId;
        } 

        /**
         * <p>The alert configurations of the service.</p>
         * <blockquote>
         * <p> This parameter takes effect only when you specify an alert policy for <strong>PolicyNames</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;TemplateUrl&quot;: &quot;<a href="http://template.file.url">http://template.file.url</a>&quot;,
         *   // 应用分组级别告警元数据
         *   &quot;ApplicationGroups&quot;: [
         *     {
         *       &quot;Name&quot;: &quot;applicationGroup1&quot;,
         *       &quot;TemplateUrl&quot;: &quot;url1&quot;
         *     },
         *     {
         *       &quot;Name&quot;: &quot;applicationGroup2&quot;,
         *       &quot;TemplateUrl&quot;: &quot;url2&quot;
         *     }
         *   ]
         * }</p>
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * <p>The approval type of the service usage application. Valid values:</p>
         * <ul>
         * <li>Manual: The application is manually approved.</li>
         * <li>AutoPass: The application is automatically approved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        public Builder approvalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }

        /**
         * <p>The information of build service information.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;RepoUrl&quot;: &quot;<a href="https://github.com/user/repo.git">https://github.com/user/repo.git</a>&quot;, &quot;Brancn&quot;: &quot;main&quot;}</p>
         */
        public Builder buildInfo(String buildInfo) {
            this.buildInfo = buildInfo;
            return this;
        }

        /**
         * <p>The category of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>DevOps</p>
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * <p>The commodity details.</p>
         */
        public Builder commodity(Commodity commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * <p>Compliance check metadata.</p>
         */
        public Builder complianceMetadata(ComplianceMetadata complianceMetadata) {
            this.complianceMetadata = complianceMetadata;
            return this;
        }

        /**
         * <p>The time when the service was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-20T00:00:00Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The binding configurations of the commodity module.</p>
         * 
         * <strong>example:</strong>
         * <p>componesConfigs</p>
         */
        public Builder crossRegionConnectionStatus(String crossRegionConnectionStatus) {
            this.crossRegionConnectionStatus = crossRegionConnectionStatus;
            return this;
        }

        /**
         * <p>The storage configurations of the service. The format in which the deployment information of a service is stored varies based on the deployment type of the service. In this case, the deployment information is stored in the JSON string format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;TemplateConfigs&quot;:[{&quot;Name&quot;:&quot;模板1&quot;,&quot;Url&quot;:&quot;oss://computenest-test/template&quot; 
         *             + &quot;.json?RegionId=cn-beijing&quot;,&quot;PredefinedParameters&quot;:[{&quot;Name&quot;:&quot;低配版&quot;,&quot; 
         *             + &quot;&quot;Parameters&quot;:{&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,&quot;DataDiskSize&quot;:40}},{&quot;Name&quot;:&quot;高配版&quot;,&quot; 
         *             + &quot;&quot;Parameters&quot;:{&quot;InstanceType&quot;:&quot;ecs.g5.large&quot;,&quot;DataDiskSize&quot;:200}}]}]}</p>
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
         * <li>spi: The service is deployed by calling a service provider interface (SPI).</li>
         * <li>operation: The service is deployed by using a hosted O&amp;M service.</li>
         * <li>container: The service is deployed by using a container.</li>
         * <li>pkg: The service is deployed by using a package.</li>
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
         * <p>The duration for which hosted O&amp;M is implemented. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>259200</p>
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * <p>The report source.</p>
         */
        public Builder entitySource(java.util.Map<String, String> entitySource) {
            this.entitySource = entitySource;
            return this;
        }

        /**
         * <p>Indicates whether the hosted O&amp;M feature is enabled for the service. Default value: false. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned if you set <strong>ServiceType</strong> to <strong>private</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.isSupportOperated = isSupportOperated;
            return this;
        }

        /**
         * <p>The license metadata.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;renewType&quot;:&quot;MONTHLY&quot;}</p>
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * <p>The logging configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Logstores&quot;: [ { &quot;LogstoreName&quot;: &quot;access-log&quot;, &quot;LogPath&quot;: &quot;/home/admin/app/logs&quot;, # This parameter is not required for containers. Configure the parameter in the YAML file. &quot;FilePattern&quot;: &quot;access.log*&quot; # This parameter is not required for containers. Configure the parameter in the YAML file. } ] }</p>
         */
        public Builder logMetadata(String logMetadata) {
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * <p>The hosted O&amp;M configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;PrometheusConfigMap&quot;:{&quot;New_Vpc_Ack_And_Jumpserver&quot;:{}}}</p>
         */
        public Builder operationMetadata(String operationMetadata) {
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * <p>The source for which fees are generated. Valid values:</p>
         * <ul>
         * <li>None: No fees are generated.</li>
         * <li>Marketplace: Fees are generated for Alibaba Cloud Marketplace.</li>
         * <li>Custom: The custom fees.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder payFromType(String payFromType) {
            this.payFromType = payFromType;
            return this;
        }

        /**
         * <p>The permissions on the service. Valid values:</p>
         * <ul>
         * <li>Deployable: Permissions to deploy the service.</li>
         * <li>Accessible: Permissions to access the service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Deployable</p>
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * <p>The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O&amp;M policies are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>policyName1, policyName2</p>
         */
        public Builder policyNames(String policyNames) {
            this.policyNames = policyNames;
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
         * <p>The registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-04056c2ab4b94bxxxxxx</p>
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B1A0198B-F316-1B72-B8DD-28B6F6D6XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the distribution is supported. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder resellable(Boolean resellable) {
            this.resellable = resellable;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzuqyxxxxxx</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The URL of the service audit file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/1690707531xxxxxx/service-document/be3382cd-xxxx-xxxx-xxxx-f8707ec12879.docx">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/1690707531xxxxxx/service-document/be3382cd-xxxx-xxxx-xxxx-f8707ec12879.docx</a></p>
         */
        public Builder serviceAuditDocumentUrl(String serviceAuditDocumentUrl) {
            this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
            return this;
        }

        /**
         * <p>Indicates whether the service is visible. Valid values:</p>
         * <ul>
         * <li>INVISIBLE</li>
         * <li>DISCOVERABLE</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DISCOVERABLE</p>
         */
        public Builder serviceDiscoverable(String serviceDiscoverable) {
            this.serviceDiscoverable = serviceDiscoverable;
            return this;
        }

        /**
         * <p>Service document information.</p>
         */
        public Builder serviceDocumentInfos(java.util.List<ServiceDocumentInfos> serviceDocumentInfos) {
            this.serviceDocumentInfos = serviceDocumentInfos;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
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
         * <p><a href="http://example2.com">http://example2.com</a></p>
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
         * <p>The permission type of the deployment URL. Valid values:</p>
         * <ul>
         * <li>Public: All users can go to the URL to create a service instance or a trial service instance.</li>
         * <li>Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.</li>
         * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.</li>
         * <li>OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.</li>
         * <li>Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * <p>The share status of the instance.</p>
         * <blockquote>
         * <p>This parameter is discontinued.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>This parameter is discontinued.</p>
         */
        public Builder shareTypeStatus(String shareTypeStatus) {
            this.shareTypeStatus = shareTypeStatus;
            return this;
        }

        /**
         * <p>The ID of the distribution source service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * <p>The version of the distribution source service.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * <p>The name of the distribution source service provider.</p>
         * 
         * <strong>example:</strong>
         * <p>SourceSupplier</p>
         */
        public Builder sourceSupplierName(String sourceSupplierName) {
            this.sourceSupplierName = sourceSupplierName;
            return this;
        }

        /**
         * <p>The statistics.</p>
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * <p>The status of the service. Valid values:</p>
         * <ul>
         * <li>Draft: The service is a draft.</li>
         * <li>Submitted: The service is submitted for review. You cannot modify services in this state.</li>
         * <li>Approved: The service is approved. You cannot modify services in this state. You can publish services in this state.</li>
         * <li>Launching: The service is being published.</li>
         * <li>Online: The service is published.</li>
         * <li>Offline: The service is unpublished.</li>
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
         * <p>The description of the service status.</p>
         * 
         * <strong>example:</strong>
         * <p>deploy successfully</p>
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
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
         * <p>The service tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The type of the tenant. Valid values:</p>
         * <ul>
         * <li>SingleTenant</li>
         * <li>MultiTenant</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SingleTenant</p>
         */
        public Builder tenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }

        /**
         * <p>The status of the test. Valid values:</p>
         * <ul>
         * <li><code>CONFIG_IS_NULL</code>: No test configurations exist.</li>
         * <li><code>SERVICE_TEST_SUCCEED</code>: The service passed the test.</li>
         * <li><code>SERVICE_TSET_DOING</code>: The service does not pass the test.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SERVICE_TEST_SUCCEED</p>
         */
        public Builder testStatus(String testStatus) {
            this.testStatus = testStatus;
            return this;
        }

        /**
         * <p>The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder trialDuration(Long trialDuration) {
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * <p>The trial policy. Valid values:</p>
         * <ul>
         * <li>Trial: Trials are supported.</li>
         * <li>NotTrial: Trials are not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Trial</p>
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
            return this;
        }

        /**
         * <p>The time when the service was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-22T00:00:00Z</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * <p>The metadata about the upgrade.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Description&quot;:&quot;xxx&quot;,&quot;SupportRollback&quot;:true,&quot;SupportUpgradeFromVersions&quot;:[],&quot;UpgradeComponents&quot;:[&quot;Configuration&quot;]}</p>
         */
        public Builder upgradeMetadata(String upgradeMetadata) {
            this.upgradeMetadata = upgradeMetadata;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }

        /**
         * <p>The version name.</p>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>Indicates whether the service is a virtual Internet service. Valid values:</p>
         * <ul>
         * <li>false</li>
         * <li>true</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder virtualInternetService(String virtualInternetService) {
            this.virtualInternetService = virtualInternetService;
            return this;
        }

        /**
         * <p>The ID of the virtual Internet service.</p>
         * 
         * <strong>example:</strong>
         * <p>service-70a3b15bb62643xxxxxx</p>
         */
        public Builder virtualInternetServiceId(String virtualInternetServiceId) {
            this.virtualInternetServiceId = virtualInternetServiceId;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ComponentsMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mappings")
        private java.util.Map<String, String> mappings;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ComponentsMappings(Builder builder) {
            this.mappings = builder.mappings;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsMappings create() {
            return builder().build();
        }

        /**
         * @return mappings
         */
        public java.util.Map<String, String> getMappings() {
            return this.mappings;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.Map<String, String> mappings; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(ComponentsMappings model) {
                this.mappings = model.mappings;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The mappings.</p>
             */
            public Builder mappings(java.util.Map<String, String> mappings) {
                this.mappings = mappings;
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

            public ComponentsMappings build() {
                return new ComponentsMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MeteringEntityExtraInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Promql")
        private String promql;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MeteringEntityExtraInfos(Builder builder) {
            this.entityId = builder.entityId;
            this.metricName = builder.metricName;
            this.promql = builder.promql;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringEntityExtraInfos create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return promql
         */
        public String getPromql() {
            return this.promql;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String entityId; 
            private String metricName; 
            private String promql; 
            private String type; 

            private Builder() {
            } 

            private Builder(MeteringEntityExtraInfos model) {
                this.entityId = model.entityId;
                this.metricName = model.metricName;
                this.promql = model.promql;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgj0048****-Frequency-1</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>Name of a measurement indicator.</p>
             * 
             * <strong>example:</strong>
             * <p>AvgMemory</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>Custom PromQL.</p>
             * 
             * <strong>example:</strong>
             * <p>avg_over_time(count(kube_pod_info{namespace=&quot;default&quot;})[1h:1m])</p>
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * <p>Measurement indicators.</p>
             * 
             * <strong>example:</strong>
             * <p>ComputeNestPrometheus</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MeteringEntityExtraInfos build() {
                return new MeteringEntityExtraInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MeteringEntityMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityIds")
        private String entityIds;

        @com.aliyun.core.annotation.NameInMap("SpecificationName")
        private String specificationName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private MeteringEntityMappings(Builder builder) {
            this.entityIds = builder.entityIds;
            this.specificationName = builder.specificationName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringEntityMappings create() {
            return builder().build();
        }

        /**
         * @return entityIds
         */
        public String getEntityIds() {
            return this.entityIds;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String entityIds; 
            private String specificationName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(MeteringEntityMappings model) {
                this.entityIds = model.entityIds;
                this.specificationName = model.specificationName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The ID of the entity.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgj0015****-Frequency-1</p>
             */
            public Builder entityIds(String entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * <p>The package name.</p>
             * 
             * <strong>example:</strong>
             * <p>按量付费套餐</p>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>模板1</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public MeteringEntityMappings build() {
                return new MeteringEntityMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class CssMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentsMappings")
        private java.util.List<ComponentsMappings> componentsMappings;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List<MeteringEntityMappings> meteringEntityMappings;

        private CssMetadata(Builder builder) {
            this.componentsMappings = builder.componentsMappings;
            this.meteringEntityExtraInfos = builder.meteringEntityExtraInfos;
            this.meteringEntityMappings = builder.meteringEntityMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CssMetadata create() {
            return builder().build();
        }

        /**
         * @return componentsMappings
         */
        public java.util.List<ComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        /**
         * @return meteringEntityExtraInfos
         */
        public java.util.List<MeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List<MeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        public static final class Builder {
            private java.util.List<ComponentsMappings> componentsMappings; 
            private java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List<MeteringEntityMappings> meteringEntityMappings; 

            private Builder() {
            } 

            private Builder(CssMetadata model) {
                this.componentsMappings = model.componentsMappings;
                this.meteringEntityExtraInfos = model.meteringEntityExtraInfos;
                this.meteringEntityMappings = model.meteringEntityMappings;
            } 

            /**
             * <p>The mapping information about the billing items.</p>
             */
            public Builder componentsMappings(java.util.List<ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            /**
             * <p>Metering item configuration information.</p>
             */
            public Builder meteringEntityExtraInfos(java.util.List<MeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * <p>The binding relationship between package and measurement dimension.</p>
             */
            public Builder meteringEntityMappings(java.util.List<MeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            public CssMetadata build() {
                return new CssMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MarketplaceMetadataMeteringEntityExtraInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("MetricName")
        private String metricName;

        @com.aliyun.core.annotation.NameInMap("Promql")
        private String promql;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private MarketplaceMetadataMeteringEntityExtraInfos(Builder builder) {
            this.entityId = builder.entityId;
            this.metricName = builder.metricName;
            this.promql = builder.promql;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketplaceMetadataMeteringEntityExtraInfos create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return metricName
         */
        public String getMetricName() {
            return this.metricName;
        }

        /**
         * @return promql
         */
        public String getPromql() {
            return this.promql;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String entityId; 
            private String metricName; 
            private String promql; 
            private String type; 

            private Builder() {
            } 

            private Builder(MarketplaceMetadataMeteringEntityExtraInfos model) {
                this.entityId = model.entityId;
                this.metricName = model.metricName;
                this.promql = model.promql;
                this.type = model.type;
            } 

            /**
             * <p>The ID of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgjxxxxxxxx-NetworkOut-2</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The metric name.</p>
             * 
             * <strong>example:</strong>
             * <p>NetworkLantency</p>
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * <p>The custom prometheus statement.</p>
             * 
             * <strong>example:</strong>
             * <p>avg_over_time(count(kube_pod_info{namespace=&quot;default&quot;})[1h:1m])</p>
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * <p>The metric.</p>
             * 
             * <strong>example:</strong>
             * <p>AvgPod</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MarketplaceMetadataMeteringEntityExtraInfos build() {
                return new MarketplaceMetadataMeteringEntityExtraInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MarketplaceMetadataMeteringEntityMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityIds")
        private String entityIds;

        @com.aliyun.core.annotation.NameInMap("SpecificationName")
        private String specificationName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private MarketplaceMetadataMeteringEntityMappings(Builder builder) {
            this.entityIds = builder.entityIds;
            this.specificationName = builder.specificationName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketplaceMetadataMeteringEntityMappings create() {
            return builder().build();
        }

        /**
         * @return entityIds
         */
        public String getEntityIds() {
            return this.entityIds;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String entityIds; 
            private String specificationName; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(MarketplaceMetadataMeteringEntityMappings model) {
                this.entityIds = model.entityIds;
                this.specificationName = model.specificationName;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The ID of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgjxxxxxxxx-NetworkOut-2</p>
             */
            public Builder entityIds(String entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * <p>The name of the specification package.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay-as-you-go Package</p>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
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

            public MarketplaceMetadataMeteringEntityMappings build() {
                return new MarketplaceMetadataMeteringEntityMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class SpecificationMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SpecificationCode")
        private String specificationCode;

        @com.aliyun.core.annotation.NameInMap("SpecificationName")
        private String specificationName;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TrialType")
        private String trialType;

        private SpecificationMappings(Builder builder) {
            this.specificationCode = builder.specificationCode;
            this.specificationName = builder.specificationName;
            this.templateName = builder.templateName;
            this.trialType = builder.trialType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SpecificationMappings create() {
            return builder().build();
        }

        /**
         * @return specificationCode
         */
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        /**
         * @return specificationName
         */
        public String getSpecificationName() {
            return this.specificationName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return trialType
         */
        public String getTrialType() {
            return this.trialType;
        }

        public static final class Builder {
            private String specificationCode; 
            private String specificationName; 
            private String templateName; 
            private String trialType; 

            private Builder() {
            } 

            private Builder(SpecificationMappings model) {
                this.specificationCode = model.specificationCode;
                this.specificationName = model.specificationName;
                this.templateName = model.templateName;
                this.trialType = model.trialType;
            } 

            /**
             * <p>The specification code of the service in Alibaba Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00xxxx</p>
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * <p>The name of the specification package.</p>
             * 
             * <strong>example:</strong>
             * <p>Pay-as-you-go</p>
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
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
             * <p>The trial policy. Valid values:</p>
             * <ul>
             * <li>Trial: Trials are supported.</li>
             * <li>NotTrial: Trials are not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NotTrial</p>
             */
            public Builder trialType(String trialType) {
                this.trialType = trialType;
                return this;
            }

            public SpecificationMappings build() {
                return new SpecificationMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MarketplaceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List<MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List<MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings;

        @com.aliyun.core.annotation.NameInMap("SpecificationMappings")
        private java.util.List<SpecificationMappings> specificationMappings;

        private MarketplaceMetadata(Builder builder) {
            this.meteringEntityExtraInfos = builder.meteringEntityExtraInfos;
            this.meteringEntityMappings = builder.meteringEntityMappings;
            this.specificationMappings = builder.specificationMappings;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MarketplaceMetadata create() {
            return builder().build();
        }

        /**
         * @return meteringEntityExtraInfos
         */
        public java.util.List<MarketplaceMetadataMeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List<MarketplaceMetadataMeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        /**
         * @return specificationMappings
         */
        public java.util.List<SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List<MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List<MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings; 
            private java.util.List<SpecificationMappings> specificationMappings; 

            private Builder() {
            } 

            private Builder(MarketplaceMetadata model) {
                this.meteringEntityExtraInfos = model.meteringEntityExtraInfos;
                this.meteringEntityMappings = model.meteringEntityMappings;
                this.specificationMappings = model.specificationMappings;
            } 

            /**
             * <p>The configurations of the billable items.</p>
             */
            public Builder meteringEntityExtraInfos(java.util.List<MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * <p>The billable items that are associated with the package.</p>
             */
            public Builder meteringEntityMappings(java.util.List<MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            /**
             * <p>The mappings between the service specifications and the template or package.</p>
             */
            public Builder specificationMappings(java.util.List<SpecificationMappings> specificationMappings) {
                this.specificationMappings = specificationMappings;
                return this;
            }

            public MarketplaceMetadata build() {
                return new MarketplaceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class MeteringEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityId")
        private String entityId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private MeteringEntities(Builder builder) {
            this.entityId = builder.entityId;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeteringEntities create() {
            return builder().build();
        }

        /**
         * @return entityId
         */
        public String getEntityId() {
            return this.entityId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String entityId; 
            private String name; 

            private Builder() {
            } 

            private Builder(MeteringEntities model) {
                this.entityId = model.entityId;
                this.name = model.name;
            } 

            /**
             * <p>The ID of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>cmgjxxxxxxxx-NetworkOut</p>
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * <p>The name of the billable item.</p>
             * 
             * <strong>example:</strong>
             * <p>spring-boot-demo</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public MeteringEntities build() {
                return new MeteringEntities(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Specifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List<String> times;

        private Specifications(Builder builder) {
            this.code = builder.code;
            this.name = builder.name;
            this.times = builder.times;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Specifications create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return times
         */
        public java.util.List<String> getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.List<String> times; 

            private Builder() {
            } 

            private Builder(Specifications model) {
                this.code = model.code;
                this.name = model.name;
                this.times = model.times;
            } 

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00xxxx</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The specification name.</p>
             * 
             * <strong>example:</strong>
             * <p>specifications1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The subscription duration. Unit: week or year.</p>
             */
            public Builder times(java.util.List<String> times) {
                this.times = times;
                return this;
            }

            public Specifications build() {
                return new Specifications(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<String> components;

        @com.aliyun.core.annotation.NameInMap("CssMetadata")
        private CssMetadata cssMetadata;

        @com.aliyun.core.annotation.NameInMap("MarketplaceMetadata")
        private MarketplaceMetadata marketplaceMetadata;

        @com.aliyun.core.annotation.NameInMap("MeteringEntities")
        private java.util.List<MeteringEntities> meteringEntities;

        @com.aliyun.core.annotation.NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @com.aliyun.core.annotation.NameInMap("Specifications")
        private java.util.List<Specifications> specifications;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commodity(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.components = builder.components;
            this.cssMetadata = builder.cssMetadata;
            this.marketplaceMetadata = builder.marketplaceMetadata;
            this.meteringEntities = builder.meteringEntities;
            this.saasBoostMetadata = builder.saasBoostMetadata;
            this.specifications = builder.specifications;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return components
         */
        public java.util.List<String> getComponents() {
            return this.components;
        }

        /**
         * @return cssMetadata
         */
        public CssMetadata getCssMetadata() {
            return this.cssMetadata;
        }

        /**
         * @return marketplaceMetadata
         */
        public MarketplaceMetadata getMarketplaceMetadata() {
            return this.marketplaceMetadata;
        }

        /**
         * @return meteringEntities
         */
        public java.util.List<MeteringEntities> getMeteringEntities() {
            return this.meteringEntities;
        }

        /**
         * @return saasBoostMetadata
         */
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        /**
         * @return specifications
         */
        public java.util.List<Specifications> getSpecifications() {
            return this.specifications;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String chargeType; 
            private String commodityCode; 
            private java.util.List<String> components; 
            private CssMetadata cssMetadata; 
            private MarketplaceMetadata marketplaceMetadata; 
            private java.util.List<MeteringEntities> meteringEntities; 
            private String saasBoostMetadata; 
            private java.util.List<Specifications> specifications; 
            private String type; 

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.chargeType = model.chargeType;
                this.commodityCode = model.commodityCode;
                this.components = model.components;
                this.cssMetadata = model.cssMetadata;
                this.marketplaceMetadata = model.marketplaceMetadata;
                this.meteringEntities = model.meteringEntities;
                this.saasBoostMetadata = model.saasBoostMetadata;
                this.specifications = model.specifications;
                this.type = model.type;
            } 

            /**
             * <p>The billing method of the service. Valid values:</p>
             * <ul>
             * <li><strong>PREPAY</strong> (default): subscription.</li>
             * <li><strong>POSTPAY</strong>: pay-as-you-go.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PREPAY</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The commodity code of the service in Alibaba Cloud Marketplace.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00xxxx</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity modules.</p>
             */
            public Builder components(java.util.List<String> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The configuration metadata related to Lingxiao.</p>
             */
            public Builder cssMetadata(CssMetadata cssMetadata) {
                this.cssMetadata = cssMetadata;
                return this;
            }

            /**
             * <p>The metadata of Alibaba Cloud Marketplace.</p>
             */
            public Builder marketplaceMetadata(MarketplaceMetadata marketplaceMetadata) {
                this.marketplaceMetadata = marketplaceMetadata;
                return this;
            }

            /**
             * <p>The information about the billable item.</p>
             */
            public Builder meteringEntities(java.util.List<MeteringEntities> meteringEntities) {
                this.meteringEntities = meteringEntities;
                return this;
            }

            /**
             * <p>The configuration metadata related to Saas Boost.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;Enabled&quot;:false // The public endpoint of the SaaS Boost instance. &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot; }</p>
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * <p>The specification details of the service in Alibaba Cloud Marketplace.</p>
             */
            public Builder specifications(java.util.List<Specifications> specifications) {
                this.specifications = specifications;
                return this;
            }

            /**
             * <p>The service type. Valid values:</p>
             * <ul>
             * <li>marketplace: Alibaba Cloud Marketplace.</li>
             * <li>Css: Lingxiao.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Marketplace</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Commodity build() {
                return new Commodity(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ComplianceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompliancePacks")
        private java.util.List<String> compliancePacks;

        private ComplianceMetadata(Builder builder) {
            this.compliancePacks = builder.compliancePacks;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComplianceMetadata create() {
            return builder().build();
        }

        /**
         * @return compliancePacks
         */
        public java.util.List<String> getCompliancePacks() {
            return this.compliancePacks;
        }

        public static final class Builder {
            private java.util.List<String> compliancePacks; 

            private Builder() {
            } 

            private Builder(ComplianceMetadata model) {
                this.compliancePacks = model.compliancePacks;
            } 

            /**
             * <p>The compliance package is selected.</p>
             */
            public Builder compliancePacks(java.util.List<String> compliancePacks) {
                this.compliancePacks = compliancePacks;
                return this;
            }

            public ComplianceMetadata build() {
                return new ComplianceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ServiceDocumentInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DocumentUrl")
        private String documentUrl;

        @com.aliyun.core.annotation.NameInMap("Locale")
        private String locale;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private ServiceDocumentInfos(Builder builder) {
            this.documentUrl = builder.documentUrl;
            this.locale = builder.locale;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceDocumentInfos create() {
            return builder().build();
        }

        /**
         * @return documentUrl
         */
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        /**
         * @return locale
         */
        public String getLocale() {
            return this.locale;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String documentUrl; 
            private String locale; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(ServiceDocumentInfos model) {
                this.documentUrl = model.documentUrl;
                this.locale = model.locale;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The URL that is used to access the document.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://docurl">http://docurl</a></p>
             */
            public Builder documentUrl(String documentUrl) {
                this.documentUrl = documentUrl;
                return this;
            }

            /**
             * <p>The language of the return data. Valid values: zh-CN and en-US.</p>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>Default Template.</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ServiceDocumentInfos build() {
                return new ServiceDocumentInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Agreements extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Agreements(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agreements create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            private Builder() {
            } 

            private Builder(Agreements model) {
                this.name = model.name;
                this.url = model.url;
            } 

            /**
             * <p>The agreement name.</p>
             * 
             * <strong>example:</strong>
             * <p>Name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The agreement URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com/xxxxxxxx.html">https://aliyun.com/xxxxxxxx.html</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Agreements build() {
                return new Agreements(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Softwares extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Softwares(Builder builder) {
            this.name = builder.name;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Softwares create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String name; 
            private String version; 

            private Builder() {
            } 

            private Builder(Softwares model) {
                this.name = model.name;
                this.version = model.version;
            } 

            /**
             * <p>The name of the software</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The version of the software.</p>
             * 
             * <strong>example:</strong>
             * <p>5.7</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Softwares build() {
                return new Softwares(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class ServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List<Agreements> agreements;

        @com.aliyun.core.annotation.NameInMap("Image")
        private String image;

        @com.aliyun.core.annotation.NameInMap("Locale")
        private String locale;

        @com.aliyun.core.annotation.NameInMap("LongDescriptionUrl")
        private String longDescriptionUrl;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShortDescription")
        private String shortDescription;

        @com.aliyun.core.annotation.NameInMap("Softwares")
        private java.util.List<Softwares> softwares;

        private ServiceInfos(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.longDescriptionUrl = builder.longDescriptionUrl;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
            this.softwares = builder.softwares;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfos create() {
            return builder().build();
        }

        /**
         * @return agreements
         */
        public java.util.List<Agreements> getAgreements() {
            return this.agreements;
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
         * @return longDescriptionUrl
         */
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
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

        /**
         * @return softwares
         */
        public java.util.List<Softwares> getSoftwares() {
            return this.softwares;
        }

        public static final class Builder {
            private java.util.List<Agreements> agreements; 
            private String image; 
            private String locale; 
            private String longDescriptionUrl; 
            private String name; 
            private String shortDescription; 
            private java.util.List<Softwares> softwares; 

            private Builder() {
            } 

            private Builder(ServiceInfos model) {
                this.agreements = model.agreements;
                this.image = model.image;
                this.locale = model.locale;
                this.longDescriptionUrl = model.longDescriptionUrl;
                this.name = model.name;
                this.shortDescription = model.shortDescription;
                this.softwares = model.softwares;
            } 

            /**
             * <p>The agreement information about the service.</p>
             */
            public Builder agreements(java.util.List<Agreements> agreements) {
                this.agreements = agreements;
                return this;
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
             * <p>The language of the service. Valid values:</p>
             * <ul>
             * <li>zh-CN: Chinese</li>
             * <li>en-US: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh-CN</p>
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * <p>The URL of the detailed description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
                return this;
            }

            /**
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>WordPress</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The description of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>B是A公司自主设计并研发的开源分布式的关系型数据库</p>
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * <p>The list of the information about the software in the service.</p>
             */
            public Builder softwares(java.util.List<Softwares> softwares) {
                this.softwares = softwares;
                return this;
            }

            public ServiceInfos build() {
                return new ServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccumulativeInstanceCount")
        private Integer accumulativeInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AccumulativePocAmount")
        private Double accumulativePocAmount;

        @com.aliyun.core.annotation.NameInMap("AccumulativeUserCount")
        private Integer accumulativeUserCount;

        @com.aliyun.core.annotation.NameInMap("AveragePocAmount")
        private Double averagePocAmount;

        @com.aliyun.core.annotation.NameInMap("AveragePocDuration")
        private Double averagePocDuration;

        @com.aliyun.core.annotation.NameInMap("AveragePocUnitAmount")
        private Double averagePocUnitAmount;

        @com.aliyun.core.annotation.NameInMap("DeployedServiceInstanceCount")
        private Integer deployedServiceInstanceCount;

        @com.aliyun.core.annotation.NameInMap("DeployedUserCount")
        private Integer deployedUserCount;

        @com.aliyun.core.annotation.NameInMap("SubmittedUsageCount")
        private Integer submittedUsageCount;

        private Statistic(Builder builder) {
            this.accumulativeInstanceCount = builder.accumulativeInstanceCount;
            this.accumulativePocAmount = builder.accumulativePocAmount;
            this.accumulativeUserCount = builder.accumulativeUserCount;
            this.averagePocAmount = builder.averagePocAmount;
            this.averagePocDuration = builder.averagePocDuration;
            this.averagePocUnitAmount = builder.averagePocUnitAmount;
            this.deployedServiceInstanceCount = builder.deployedServiceInstanceCount;
            this.deployedUserCount = builder.deployedUserCount;
            this.submittedUsageCount = builder.submittedUsageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return accumulativeInstanceCount
         */
        public Integer getAccumulativeInstanceCount() {
            return this.accumulativeInstanceCount;
        }

        /**
         * @return accumulativePocAmount
         */
        public Double getAccumulativePocAmount() {
            return this.accumulativePocAmount;
        }

        /**
         * @return accumulativeUserCount
         */
        public Integer getAccumulativeUserCount() {
            return this.accumulativeUserCount;
        }

        /**
         * @return averagePocAmount
         */
        public Double getAveragePocAmount() {
            return this.averagePocAmount;
        }

        /**
         * @return averagePocDuration
         */
        public Double getAveragePocDuration() {
            return this.averagePocDuration;
        }

        /**
         * @return averagePocUnitAmount
         */
        public Double getAveragePocUnitAmount() {
            return this.averagePocUnitAmount;
        }

        /**
         * @return deployedServiceInstanceCount
         */
        public Integer getDeployedServiceInstanceCount() {
            return this.deployedServiceInstanceCount;
        }

        /**
         * @return deployedUserCount
         */
        public Integer getDeployedUserCount() {
            return this.deployedUserCount;
        }

        /**
         * @return submittedUsageCount
         */
        public Integer getSubmittedUsageCount() {
            return this.submittedUsageCount;
        }

        public static final class Builder {
            private Integer accumulativeInstanceCount; 
            private Double accumulativePocAmount; 
            private Integer accumulativeUserCount; 
            private Double averagePocAmount; 
            private Double averagePocDuration; 
            private Double averagePocUnitAmount; 
            private Integer deployedServiceInstanceCount; 
            private Integer deployedUserCount; 
            private Integer submittedUsageCount; 

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.accumulativeInstanceCount = model.accumulativeInstanceCount;
                this.accumulativePocAmount = model.accumulativePocAmount;
                this.accumulativeUserCount = model.accumulativeUserCount;
                this.averagePocAmount = model.averagePocAmount;
                this.averagePocDuration = model.averagePocDuration;
                this.averagePocUnitAmount = model.averagePocUnitAmount;
                this.deployedServiceInstanceCount = model.deployedServiceInstanceCount;
                this.deployedUserCount = model.deployedUserCount;
                this.submittedUsageCount = model.submittedUsageCount;
            } 

            /**
             * <p>The total number of service instances that belong to the service. The service instances that are deleted are counted.</p>
             * 
             * <strong>example:</strong>
             * <p>75</p>
             */
            public Builder accumulativeInstanceCount(Integer accumulativeInstanceCount) {
                this.accumulativeInstanceCount = accumulativeInstanceCount;
                return this;
            }

            /**
             * <p>The total amount consumed for trial service instances. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>80.35</p>
             */
            public Builder accumulativePocAmount(Double accumulativePocAmount) {
                this.accumulativePocAmount = accumulativePocAmount;
                return this;
            }

            /**
             * <p>The total number of users who use the service. The historical users are counted.</p>
             * 
             * <strong>example:</strong>
             * <p>60</p>
             */
            public Builder accumulativeUserCount(Integer accumulativeUserCount) {
                this.accumulativeUserCount = accumulativeUserCount;
                return this;
            }

            /**
             * <p>The average amount consumed for trial service instances per instance. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>40.17</p>
             */
            public Builder averagePocAmount(Double averagePocAmount) {
                this.averagePocAmount = averagePocAmount;
                return this;
            }

            /**
             * <p>The average duration for which trial service instances are in use. Unit: Hour.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder averagePocDuration(Double averagePocDuration) {
                this.averagePocDuration = averagePocDuration;
                return this;
            }

            /**
             * <p>The average amount consumed for trial service instances per a period of time. Unit: CNY.</p>
             * 
             * <strong>example:</strong>
             * <p>167.9</p>
             */
            public Builder averagePocUnitAmount(Double averagePocUnitAmount) {
                this.averagePocUnitAmount = averagePocUnitAmount;
                return this;
            }

            /**
             * <p>The number of online service instances. It means the number of service instances that are successfully deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder deployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
                this.deployedServiceInstanceCount = deployedServiceInstanceCount;
                return this;
            }

            /**
             * <p>The number of online users. It means the number of users who successfully deployed the service instances.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder deployedUserCount(Integer deployedUserCount) {
                this.deployedUserCount = deployedUserCount;
                return this;
            }

            /**
             * <p>The number of service applications that are in the Submitted state.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder submittedUsageCount(Integer submittedUsageCount) {
                this.submittedUsageCount = submittedUsageCount;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceResponseBody</p>
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
