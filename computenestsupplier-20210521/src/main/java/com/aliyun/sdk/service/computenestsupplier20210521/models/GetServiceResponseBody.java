// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    private String commodityCode;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CrossRegionConnectionStatus")
    private String crossRegionConnectionStatus;

    @com.aliyun.core.annotation.NameInMap("DefaultLicenseDays")
    private Long defaultLicenseDays;

    @com.aliyun.core.annotation.NameInMap("DeployMetadata")
    private String deployMetadata;

    @com.aliyun.core.annotation.NameInMap("DeployType")
    private String deployType;

    @com.aliyun.core.annotation.NameInMap("Duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("EntitySource")
    private java.util.Map < String, String > entitySource;

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

    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

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
    private java.util.List < Tags> tags;

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
        this.commodityCode = builder.commodityCode;
        this.createTime = builder.createTime;
        this.crossRegionConnectionStatus = builder.crossRegionConnectionStatus;
        this.defaultLicenseDays = builder.defaultLicenseDays;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.entitySource = builder.entitySource;
        this.isSupportOperated = builder.isSupportOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.logMetadata = builder.logMetadata;
        this.operationMetadata = builder.operationMetadata;
        this.payFromType = builder.payFromType;
        this.payType = builder.payType;
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
        this.serviceDocUrl = builder.serviceDocUrl;
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
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
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
     * @return defaultLicenseDays
     */
    public Long getDefaultLicenseDays() {
        return this.defaultLicenseDays;
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
    public java.util.Map < String, String > getEntitySource() {
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
     * @return payType
     */
    public String getPayType() {
        return this.payType;
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
    public java.util.List < Tags> getTags() {
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
        private String commodityCode; 
        private String createTime; 
        private String crossRegionConnectionStatus; 
        private Long defaultLicenseDays; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private java.util.Map < String, String > entitySource; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String payFromType; 
        private String payType; 
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
        private String serviceDocUrl; 
        private String serviceId; 
        private java.util.List < ServiceInfos> serviceInfos; 
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
        private java.util.List < Tags> tags; 
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

        /**
         * The alert configurations of the service.
         * <p>
         * 
         * >  This parameter takes effect only when you specify an alert policy for **PolicyNames**.
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * The approval type of the service usage application. Valid values:
         * <p>
         * 
         * *   Manual: The application is manually approved.
         * *   AutoPass: The application is automatically approved.
         */
        public Builder approvalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }

        /**
         * The information of build service information.
         */
        public Builder buildInfo(String buildInfo) {
            this.buildInfo = buildInfo;
            return this;
        }

        /**
         * The category of the service.
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * The commodity details.
         */
        public Builder commodity(Commodity commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * The commodity code of the service in Alibaba Cloud Marketplace.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * The time when the service was created.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The binding configurations of the commodity module.
         */
        public Builder crossRegionConnectionStatus(String crossRegionConnectionStatus) {
            this.crossRegionConnectionStatus = crossRegionConnectionStatus;
            return this;
        }

        /**
         * The validity period of the default license. Unit: day. Valid values: 1 to 1000.
         */
        public Builder defaultLicenseDays(Long defaultLicenseDays) {
            this.defaultLicenseDays = defaultLicenseDays;
            return this;
        }

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
         * *   spi: The service is deployed by calling a service provider interface (SPI).
         * *   operation: The service is deployed by using a hosted O\&M service.
         * *   container: The service is deployed by using a container.
         * *   pkg: The service is deployed by using a package.
         */
        public Builder deployType(String deployType) {
            this.deployType = deployType;
            return this;
        }

        /**
         * The duration for which hosted O\&M is implemented. Unit: seconds.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * The report source.
         */
        public Builder entitySource(java.util.Map < String, String > entitySource) {
            this.entitySource = entitySource;
            return this;
        }

        /**
         * Indicates whether the hosted O\&M feature is enabled for the service. Default value: false. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         * 
         * >  This parameter is returned if you set **ServiceType** to **private**.
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.isSupportOperated = isSupportOperated;
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
         * The logging configurations.
         */
        public Builder logMetadata(String logMetadata) {
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * The hosted O\&M configurations.
         */
        public Builder operationMetadata(String operationMetadata) {
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * The source for which fees are generated. Valid values:
         * <p>
         * 
         * *   None: No fees are generated.
         * *   Marketplace: Fees are generated for Alibaba Cloud Marketplace.
         * *   Custom: The custom fees.
         */
        public Builder payFromType(String payFromType) {
            this.payFromType = payFromType;
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
         * The permissions on the service. Valid values:
         * <p>
         * 
         * *   Deployable: Permissions to deploy the service.
         * *   Accessible: Permissions to access the service.
         */
        public Builder permission(String permission) {
            this.permission = permission;
            return this;
        }

        /**
         * The policy name. The name can be up to 128 characters in length. Separate multiple names with commas (,). Only hosted O\&M policies are supported.
         */
        public Builder policyNames(String policyNames) {
            this.policyNames = policyNames;
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
         * The time when the service was published.
         */
        public Builder publishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }

        /**
         * The registration ID.
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
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
         * Indicates whether the distribution is supported. Valid values:
         * <p>
         * 
         * *   false
         * *   true
         */
        public Builder resellable(Boolean resellable) {
            this.resellable = resellable;
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
         * The URL of the service audit file.
         */
        public Builder serviceAuditDocumentUrl(String serviceAuditDocumentUrl) {
            this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
            return this;
        }

        /**
         * Indicates whether the service is visible. Valid values:
         * <p>
         * 
         * *   INVISIBLE
         * *   DISCOVERABLE
         */
        public Builder serviceDiscoverable(String serviceDiscoverable) {
            this.serviceDiscoverable = serviceDiscoverable;
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
         * The permission type of the deployment URL. Valid values:
         * <p>
         * 
         * *   Public: All users can go to the URL to create a service instance or a trial service instance.
         * *   Restricted: Only users in the whitelist can go to the URL to create a service instance or a trial service instance.
         * *   OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a service instance.
         * *   OnlyTrailRestricted: Only users in the whitelist can go to the URL to create a trial service instance.
         * *   Hidden: Users not in the whitelist cannot see the service details page when they go to the URL and cannot request deployment permissions.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * The share status of the instance.
         * <p>
         * 
         * > This parameter is discontinued.
         */
        public Builder shareTypeStatus(String shareTypeStatus) {
            this.shareTypeStatus = shareTypeStatus;
            return this;
        }

        /**
         * The ID of the distribution source service.
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * The version of the distribution source service.
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * The name of the distribution source service provider.
         */
        public Builder sourceSupplierName(String sourceSupplierName) {
            this.sourceSupplierName = sourceSupplierName;
            return this;
        }

        /**
         * The statistics.
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * The status of the service. Valid values:
         * <p>
         * 
         * *   Draft: The service is a draft.
         * *   Submitted: The service is submitted for review. You cannot modify services in this state.
         * *   Approved: The service is approved. You cannot modify services in this state. You can publish services in this state.
         * *   Launching: The service is being published.
         * *   Online: The service is published.
         * *   Offline: The service is unpublished.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * The description of the service status.
         */
        public Builder statusDetail(String statusDetail) {
            this.statusDetail = statusDetail;
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
         * The service tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * The type of the tenant. Valid values:
         * <p>
         * 
         * *   SingleTenant
         * *   MultiTenant
         */
        public Builder tenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }

        /**
         * The status of the test. Valid values:
         * <p>
         * 
         * *   `CONFIG_IS_NULL`: No test configurations exist.
         * *   `SERVICE_TEST_SUCCEED`: The service passed the test.
         * *   `SERVICE_TSET_DOING`: The service does not pass the test.
         */
        public Builder testStatus(String testStatus) {
            this.testStatus = testStatus;
            return this;
        }

        /**
         * The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.
         */
        public Builder trialDuration(Long trialDuration) {
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * The trial policy. Valid values:
         * <p>
         * 
         * *   Trial: Trials are supported.
         * *   NotTrial: Trials are not supported.
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
            return this;
        }

        /**
         * The time when the service was updated.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * The metadata about the upgrade.
         */
        public Builder upgradeMetadata(String upgradeMetadata) {
            this.upgradeMetadata = upgradeMetadata;
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
         * The version name.
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        /**
         * Indicates whether the service is a virtual Internet service. Valid values:
         * <p>
         * 
         * *   false
         * *   true
         */
        public Builder virtualInternetService(String virtualInternetService) {
            this.virtualInternetService = virtualInternetService;
            return this;
        }

        /**
         * The ID of the virtual Internet service.
         */
        public Builder virtualInternetServiceId(String virtualInternetServiceId) {
            this.virtualInternetServiceId = virtualInternetServiceId;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    public static class ComponentsMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Mappings")
        private java.util.Map < String, String > mappings;

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
        public java.util.Map < String, String > getMappings() {
            return this.mappings;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.Map < String, String > mappings; 
            private String templateName; 

            /**
             * The mappings.
             */
            public Builder mappings(java.util.Map < String, String > mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * The template name.
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

            /**
             * The ID of the entity.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * Name of a measurement indicator.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Custom PromQL.
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * Measurement indicators.
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

            /**
             * The ID of the entity.
             */
            public Builder entityIds(String entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * The package name.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * The template name.
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
    public static class CssMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentsMappings")
        private java.util.List < ComponentsMappings> componentsMappings;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List < MeteringEntityMappings> meteringEntityMappings;

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
        public java.util.List < ComponentsMappings> getComponentsMappings() {
            return this.componentsMappings;
        }

        /**
         * @return meteringEntityExtraInfos
         */
        public java.util.List < MeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List < MeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        public static final class Builder {
            private java.util.List < ComponentsMappings> componentsMappings; 
            private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List < MeteringEntityMappings> meteringEntityMappings; 

            /**
             * The mapping information about the billing items.
             */
            public Builder componentsMappings(java.util.List < ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            /**
             * Metering item configuration information.
             */
            public Builder meteringEntityExtraInfos(java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * The binding relationship between package and measurement dimension.
             */
            public Builder meteringEntityMappings(java.util.List < MeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            public CssMetadata build() {
                return new CssMetadata(this);
            } 

        } 

    }
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

            /**
             * The ID of the billable item.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The metric name.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * The custom prometheus statement.
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * The metric.
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

            /**
             * The ID of the billable item.
             */
            public Builder entityIds(String entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * The name of the specification package.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * The template name.
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

            /**
             * The specification code of the service in Alibaba Cloud Marketplace.
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * The name of the specification package.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
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
             * The trial policy. Valid values:
             * <p>
             * 
             * *   Trial: Trials are supported.
             * *   NotTrial: Trials are not supported.
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
    public static class MarketplaceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MeteringEntityExtraInfos")
        private java.util.List < MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos;

        @com.aliyun.core.annotation.NameInMap("MeteringEntityMappings")
        private java.util.List < MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings;

        @com.aliyun.core.annotation.NameInMap("SpecificationMappings")
        private java.util.List < SpecificationMappings> specificationMappings;

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
        public java.util.List < MarketplaceMetadataMeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List < MarketplaceMetadataMeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        /**
         * @return specificationMappings
         */
        public java.util.List < SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List < MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List < MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings; 
            private java.util.List < SpecificationMappings> specificationMappings; 

            /**
             * The configurations of the billable items.
             */
            public Builder meteringEntityExtraInfos(java.util.List < MarketplaceMetadataMeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * The billable items that are associated with the package.
             */
            public Builder meteringEntityMappings(java.util.List < MarketplaceMetadataMeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            /**
             * The mappings between the service specifications and the template or package.
             */
            public Builder specificationMappings(java.util.List < SpecificationMappings> specificationMappings) {
                this.specificationMappings = specificationMappings;
                return this;
            }

            public MarketplaceMetadata build() {
                return new MarketplaceMetadata(this);
            } 

        } 

    }
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

            /**
             * The ID of the billable item.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * The name of the billable item.
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
    public static class Specifications extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Times")
        private java.util.List < String > times;

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
        public java.util.List < String > getTimes() {
            return this.times;
        }

        public static final class Builder {
            private String code; 
            private String name; 
            private java.util.List < String > times; 

            /**
             * The commodity code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The specification name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The subscription duration. Unit: week or year.
             */
            public Builder times(java.util.List < String > times) {
                this.times = times;
                return this;
            }

            public Specifications build() {
                return new Specifications(this);
            } 

        } 

    }
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List < String > components;

        @com.aliyun.core.annotation.NameInMap("CssMetadata")
        private CssMetadata cssMetadata;

        @com.aliyun.core.annotation.NameInMap("MarketplaceMetadata")
        private MarketplaceMetadata marketplaceMetadata;

        @com.aliyun.core.annotation.NameInMap("MeteringEntities")
        private java.util.List < MeteringEntities> meteringEntities;

        @com.aliyun.core.annotation.NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @com.aliyun.core.annotation.NameInMap("Specifications")
        private java.util.List < Specifications> specifications;

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
        public java.util.List < String > getComponents() {
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
        public java.util.List < MeteringEntities> getMeteringEntities() {
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
        public java.util.List < Specifications> getSpecifications() {
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
            private java.util.List < String > components; 
            private CssMetadata cssMetadata; 
            private MarketplaceMetadata marketplaceMetadata; 
            private java.util.List < MeteringEntities> meteringEntities; 
            private String saasBoostMetadata; 
            private java.util.List < Specifications> specifications; 
            private String type; 

            /**
             * The billing method of the service. Valid values:
             * <p>
             * 
             * *   **PREPAY** (default): subscription.
             * *   **POSTPAY**: pay-as-you-go.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * The commodity code of the service in Alibaba Cloud Marketplace.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The commodity modules.
             */
            public Builder components(java.util.List < String > components) {
                this.components = components;
                return this;
            }

            /**
             * The configuration metadata related to Lingxiao.
             */
            public Builder cssMetadata(CssMetadata cssMetadata) {
                this.cssMetadata = cssMetadata;
                return this;
            }

            /**
             * The metadata of Alibaba Cloud Marketplace.
             */
            public Builder marketplaceMetadata(MarketplaceMetadata marketplaceMetadata) {
                this.marketplaceMetadata = marketplaceMetadata;
                return this;
            }

            /**
             * The information about the billable item.
             */
            public Builder meteringEntities(java.util.List < MeteringEntities> meteringEntities) {
                this.meteringEntities = meteringEntities;
                return this;
            }

            /**
             * The configuration metadata related to Saas Boost.
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * The specification details of the service in Alibaba Cloud Marketplace.
             */
            public Builder specifications(java.util.List < Specifications> specifications) {
                this.specifications = specifications;
                return this;
            }

            /**
             * The service type. Valid values:
             * <p>
             * 
             * *   marketplace: Alibaba Cloud Marketplace.
             * *   Css: Lingxiao.
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

            /**
             * The agreement name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The agreement URL.
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
    public static class ServiceInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Agreements")
        private java.util.List < Agreements> agreements;

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

        private ServiceInfos(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.longDescriptionUrl = builder.longDescriptionUrl;
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
         * @return agreements
         */
        public java.util.List < Agreements> getAgreements() {
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

        public static final class Builder {
            private java.util.List < Agreements> agreements; 
            private String image; 
            private String locale; 
            private String longDescriptionUrl; 
            private String name; 
            private String shortDescription; 

            /**
             * The agreement information about the service.
             */
            public Builder agreements(java.util.List < Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

            /**
             * The URL of the service icon.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * The language of the service. Valid values:
             * <p>
             * 
             * *   zh-CN: Chinese
             * *   en-US: English
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * The URL of the detailed description of the service.
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
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

            /**
             * The total number of service instances that belong to the service. The service instances that are deleted are counted.
             */
            public Builder accumulativeInstanceCount(Integer accumulativeInstanceCount) {
                this.accumulativeInstanceCount = accumulativeInstanceCount;
                return this;
            }

            /**
             * The total amount consumed for trial service instances. Unit: CNY.
             */
            public Builder accumulativePocAmount(Double accumulativePocAmount) {
                this.accumulativePocAmount = accumulativePocAmount;
                return this;
            }

            /**
             * The total number of users who use the service. The historical users are counted.
             */
            public Builder accumulativeUserCount(Integer accumulativeUserCount) {
                this.accumulativeUserCount = accumulativeUserCount;
                return this;
            }

            /**
             * The average amount consumed for trial service instances per instance. Unit: CNY.
             */
            public Builder averagePocAmount(Double averagePocAmount) {
                this.averagePocAmount = averagePocAmount;
                return this;
            }

            /**
             * The average duration for which trial service instances are in use. Unit: Hour.
             */
            public Builder averagePocDuration(Double averagePocDuration) {
                this.averagePocDuration = averagePocDuration;
                return this;
            }

            /**
             * The average amount consumed for trial service instances per a period of time. Unit: CNY.
             */
            public Builder averagePocUnitAmount(Double averagePocUnitAmount) {
                this.averagePocUnitAmount = averagePocUnitAmount;
                return this;
            }

            /**
             * The number of online service instances. It means the number of service instances that are successfully deployed.
             */
            public Builder deployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
                this.deployedServiceInstanceCount = deployedServiceInstanceCount;
                return this;
            }

            /**
             * The number of online users. It means the number of users who successfully deployed the service instances.
             */
            public Builder deployedUserCount(Integer deployedUserCount) {
                this.deployedUserCount = deployedUserCount;
                return this;
            }

            /**
             * The number of service applications that are in the Submitted state.
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
