// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceResponseBody</p>
 */
public class GetServiceResponseBody extends TeaModel {
    @NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @NameInMap("ApprovalType")
    private String approvalType;

    @NameInMap("BillEntityMappings")
    private BillEntityMappings billEntityMappings;

    @NameInMap("Categories")
    private String categories;

    @NameInMap("Commodity")
    private Commodity commodity;

    @NameInMap("CommodityCode")
    private String commodityCode;

    @NameInMap("CommodityEntities")
    private java.util.List < CommodityEntities> commodityEntities;

    @NameInMap("CommoditySpecifications")
    private java.util.List < CommoditySpecifications> commoditySpecifications;

    @NameInMap("ComponentsConfigs")
    private java.util.List < ComponentsConfigs> componentsConfigs;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CrossRegionConnectionStatus")
    private String crossRegionConnectionStatus;

    @NameInMap("DefaultLicenseDays")
    private Long defaultLicenseDays;

    @NameInMap("DeployMetadata")
    private String deployMetadata;

    @NameInMap("DeployType")
    private String deployType;

    @NameInMap("Duration")
    private Long duration;

    @NameInMap("EntityAdditionalInfo")
    private java.util.Map < String, EntityAdditionalInfoValue > entityAdditionalInfo;

    @NameInMap("EntitySource")
    private java.util.Map < String, String > entitySource;

    @NameInMap("IsSupportOperated")
    private Boolean isSupportOperated;

    @NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @NameInMap("LogMetadata")
    private String logMetadata;

    @NameInMap("OperationMetadata")
    private String operationMetadata;

    @NameInMap("PayFromType")
    private String payFromType;

    @NameInMap("PayType")
    private String payType;

    @NameInMap("Permission")
    private String permission;

    @NameInMap("PolicyNames")
    private String policyNames;

    @NameInMap("Progress")
    private Long progress;

    @NameInMap("PublishTime")
    private String publishTime;

    @NameInMap("RegistrationId")
    private String registrationId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Resellable")
    private Boolean resellable;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServiceAuditDocumentUrl")
    private String serviceAuditDocumentUrl;

    @NameInMap("ServiceDiscoverable")
    private String serviceDiscoverable;

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

    @NameInMap("ShareType")
    private String shareType;

    @NameInMap("ShareTypeStatus")
    private String shareTypeStatus;

    @NameInMap("SourceServiceId")
    private String sourceServiceId;

    @NameInMap("SourceServiceVersion")
    private String sourceServiceVersion;

    @NameInMap("SourceSupplierName")
    private String sourceSupplierName;

    @NameInMap("Statistic")
    private Statistic statistic;

    @NameInMap("Status")
    private String status;

    @NameInMap("StatusDetail")
    private String statusDetail;

    @NameInMap("SupplierName")
    private String supplierName;

    @NameInMap("SupplierUrl")
    private String supplierUrl;

    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @NameInMap("TenantType")
    private String tenantType;

    @NameInMap("TestStatus")
    private String testStatus;

    @NameInMap("TrialDuration")
    private Long trialDuration;

    @NameInMap("TrialType")
    private String trialType;

    @NameInMap("UpdateTime")
    private String updateTime;

    @NameInMap("UpgradeMetadata")
    private String upgradeMetadata;

    @NameInMap("Version")
    private String version;

    @NameInMap("VersionName")
    private String versionName;

    @NameInMap("VirtualInternetService")
    private String virtualInternetService;

    @NameInMap("VirtualInternetServiceId")
    private String virtualInternetServiceId;

    private GetServiceResponseBody(Builder builder) {
        this.alarmMetadata = builder.alarmMetadata;
        this.approvalType = builder.approvalType;
        this.billEntityMappings = builder.billEntityMappings;
        this.categories = builder.categories;
        this.commodity = builder.commodity;
        this.commodityCode = builder.commodityCode;
        this.commodityEntities = builder.commodityEntities;
        this.commoditySpecifications = builder.commoditySpecifications;
        this.componentsConfigs = builder.componentsConfigs;
        this.createTime = builder.createTime;
        this.crossRegionConnectionStatus = builder.crossRegionConnectionStatus;
        this.defaultLicenseDays = builder.defaultLicenseDays;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.entityAdditionalInfo = builder.entityAdditionalInfo;
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
     * @return billEntityMappings
     */
    public BillEntityMappings getBillEntityMappings() {
        return this.billEntityMappings;
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
     * @return commodityEntities
     */
    public java.util.List < CommodityEntities> getCommodityEntities() {
        return this.commodityEntities;
    }

    /**
     * @return commoditySpecifications
     */
    public java.util.List < CommoditySpecifications> getCommoditySpecifications() {
        return this.commoditySpecifications;
    }

    /**
     * @return componentsConfigs
     */
    public java.util.List < ComponentsConfigs> getComponentsConfigs() {
        return this.componentsConfigs;
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
     * @return entityAdditionalInfo
     */
    public java.util.Map < String, EntityAdditionalInfoValue > getEntityAdditionalInfo() {
        return this.entityAdditionalInfo;
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
        private BillEntityMappings billEntityMappings; 
        private String categories; 
        private Commodity commodity; 
        private String commodityCode; 
        private java.util.List < CommodityEntities> commodityEntities; 
        private java.util.List < CommoditySpecifications> commoditySpecifications; 
        private java.util.List < ComponentsConfigs> componentsConfigs; 
        private String createTime; 
        private String crossRegionConnectionStatus; 
        private Long defaultLicenseDays; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private java.util.Map < String, EntityAdditionalInfoValue > entityAdditionalInfo; 
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
         * AlarmMetadata.
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * ApprovalType.
         */
        public Builder approvalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }

        /**
         * BillEntityMappings.
         */
        public Builder billEntityMappings(BillEntityMappings billEntityMappings) {
            this.billEntityMappings = billEntityMappings;
            return this;
        }

        /**
         * Categories.
         */
        public Builder categories(String categories) {
            this.categories = categories;
            return this;
        }

        /**
         * Commodity.
         */
        public Builder commodity(Commodity commodity) {
            this.commodity = commodity;
            return this;
        }

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * CommodityEntities.
         */
        public Builder commodityEntities(java.util.List < CommodityEntities> commodityEntities) {
            this.commodityEntities = commodityEntities;
            return this;
        }

        /**
         * CommoditySpecifications.
         */
        public Builder commoditySpecifications(java.util.List < CommoditySpecifications> commoditySpecifications) {
            this.commoditySpecifications = commoditySpecifications;
            return this;
        }

        /**
         * ComponentsConfigs.
         */
        public Builder componentsConfigs(java.util.List < ComponentsConfigs> componentsConfigs) {
            this.componentsConfigs = componentsConfigs;
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
         * CrossRegionConnectionStatus.
         */
        public Builder crossRegionConnectionStatus(String crossRegionConnectionStatus) {
            this.crossRegionConnectionStatus = crossRegionConnectionStatus;
            return this;
        }

        /**
         * DefaultLicenseDays.
         */
        public Builder defaultLicenseDays(Long defaultLicenseDays) {
            this.defaultLicenseDays = defaultLicenseDays;
            return this;
        }

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
         * Duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
            return this;
        }

        /**
         * EntityAdditionalInfo.
         */
        public Builder entityAdditionalInfo(java.util.Map < String, EntityAdditionalInfoValue > entityAdditionalInfo) {
            this.entityAdditionalInfo = entityAdditionalInfo;
            return this;
        }

        /**
         * EntitySource.
         */
        public Builder entitySource(java.util.Map < String, String > entitySource) {
            this.entitySource = entitySource;
            return this;
        }

        /**
         * IsSupportOperated.
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.isSupportOperated = isSupportOperated;
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
         * LogMetadata.
         */
        public Builder logMetadata(String logMetadata) {
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * OperationMetadata.
         */
        public Builder operationMetadata(String operationMetadata) {
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * PayFromType.
         */
        public Builder payFromType(String payFromType) {
            this.payFromType = payFromType;
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
         * Permission.
         */
        public Builder permission(String permission) {
            this.permission = permission;
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
         * Progress.
         */
        public Builder progress(Long progress) {
            this.progress = progress;
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
         * RegistrationId.
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
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
         * Resellable.
         */
        public Builder resellable(Boolean resellable) {
            this.resellable = resellable;
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
         * ServiceAuditDocumentUrl.
         */
        public Builder serviceAuditDocumentUrl(String serviceAuditDocumentUrl) {
            this.serviceAuditDocumentUrl = serviceAuditDocumentUrl;
            return this;
        }

        /**
         * ServiceDiscoverable.
         */
        public Builder serviceDiscoverable(String serviceDiscoverable) {
            this.serviceDiscoverable = serviceDiscoverable;
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
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.shareType = shareType;
            return this;
        }

        /**
         * ShareTypeStatus.
         */
        public Builder shareTypeStatus(String shareTypeStatus) {
            this.shareTypeStatus = shareTypeStatus;
            return this;
        }

        /**
         * SourceServiceId.
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * SourceServiceVersion.
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * SourceSupplierName.
         */
        public Builder sourceSupplierName(String sourceSupplierName) {
            this.sourceSupplierName = sourceSupplierName;
            return this;
        }

        /**
         * Statistic.
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
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
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TenantType.
         */
        public Builder tenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }

        /**
         * TestStatus.
         */
        public Builder testStatus(String testStatus) {
            this.testStatus = testStatus;
            return this;
        }

        /**
         * TrialDuration.
         */
        public Builder trialDuration(Long trialDuration) {
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * TrialType.
         */
        public Builder trialType(String trialType) {
            this.trialType = trialType;
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

        /**
         * VirtualInternetService.
         */
        public Builder virtualInternetService(String virtualInternetService) {
            this.virtualInternetService = virtualInternetService;
            return this;
        }

        /**
         * VirtualInternetServiceId.
         */
        public Builder virtualInternetServiceId(String virtualInternetServiceId) {
            this.virtualInternetServiceId = virtualInternetServiceId;
            return this;
        }

        public GetServiceResponseBody build() {
            return new GetServiceResponseBody(this);
        } 

    } 

    public static class Mappings extends TeaModel {
        @NameInMap("BillCode")
        private String billCode;

        @NameInMap("Entity")
        private String entity;

        @NameInMap("MeteringAssist")
        private String meteringAssist;

        private Mappings(Builder builder) {
            this.billCode = builder.billCode;
            this.entity = builder.entity;
            this.meteringAssist = builder.meteringAssist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mappings create() {
            return builder().build();
        }

        /**
         * @return billCode
         */
        public String getBillCode() {
            return this.billCode;
        }

        /**
         * @return entity
         */
        public String getEntity() {
            return this.entity;
        }

        /**
         * @return meteringAssist
         */
        public String getMeteringAssist() {
            return this.meteringAssist;
        }

        public static final class Builder {
            private String billCode; 
            private String entity; 
            private String meteringAssist; 

            /**
             * BillCode.
             */
            public Builder billCode(String billCode) {
                this.billCode = billCode;
                return this;
            }

            /**
             * Entity.
             */
            public Builder entity(String entity) {
                this.entity = entity;
                return this;
            }

            /**
             * MeteringAssist.
             */
            public Builder meteringAssist(String meteringAssist) {
                this.meteringAssist = meteringAssist;
                return this;
            }

            public Mappings build() {
                return new Mappings(this);
            } 

        } 

    }
    public static class MappingConfig extends TeaModel {
        @NameInMap("Mappings")
        private java.util.List < Mappings> mappings;

        @NameInMap("PredefinedParameters")
        private String predefinedParameters;

        @NameInMap("TemplateName")
        private String templateName;

        private MappingConfig(Builder builder) {
            this.mappings = builder.mappings;
            this.predefinedParameters = builder.predefinedParameters;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MappingConfig create() {
            return builder().build();
        }

        /**
         * @return mappings
         */
        public java.util.List < Mappings> getMappings() {
            return this.mappings;
        }

        /**
         * @return predefinedParameters
         */
        public String getPredefinedParameters() {
            return this.predefinedParameters;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.List < Mappings> mappings; 
            private String predefinedParameters; 
            private String templateName; 

            /**
             * Mappings.
             */
            public Builder mappings(java.util.List < Mappings> mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * PredefinedParameters.
             */
            public Builder predefinedParameters(String predefinedParameters) {
                this.predefinedParameters = predefinedParameters;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public MappingConfig build() {
                return new MappingConfig(this);
            } 

        } 

    }
    public static class BillEntityMappings extends TeaModel {
        @NameInMap("MappingConfig")
        private java.util.List < MappingConfig> mappingConfig;

        @NameInMap("Type")
        private String type;

        private BillEntityMappings(Builder builder) {
            this.mappingConfig = builder.mappingConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BillEntityMappings create() {
            return builder().build();
        }

        /**
         * @return mappingConfig
         */
        public java.util.List < MappingConfig> getMappingConfig() {
            return this.mappingConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < MappingConfig> mappingConfig; 
            private String type; 

            /**
             * MappingConfig.
             */
            public Builder mappingConfig(java.util.List < MappingConfig> mappingConfig) {
                this.mappingConfig = mappingConfig;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public BillEntityMappings build() {
                return new BillEntityMappings(this);
            } 

        } 

    }
    public static class ComponentsMappings extends TeaModel {
        @NameInMap("Mappings")
        private java.util.Map < String, String > mappings;

        @NameInMap("TemplateName")
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
             * Mappings.
             */
            public Builder mappings(java.util.Map < String, String > mappings) {
                this.mappings = mappings;
                return this;
            }

            /**
             * TemplateName.
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
    public static class CssMetadata extends TeaModel {
        @NameInMap("ComponentsMappings")
        private java.util.List < ComponentsMappings> componentsMappings;

        private CssMetadata(Builder builder) {
            this.componentsMappings = builder.componentsMappings;
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

        public static final class Builder {
            private java.util.List < ComponentsMappings> componentsMappings; 

            /**
             * ComponentsMappings.
             */
            public Builder componentsMappings(java.util.List < ComponentsMappings> componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            public CssMetadata build() {
                return new CssMetadata(this);
            } 

        } 

    }
    public static class MeteringEntityExtraInfos extends TeaModel {
        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("MetricName")
        private String metricName;

        @NameInMap("Promql")
        private String promql;

        @NameInMap("Type")
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
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * MetricName.
             */
            public Builder metricName(String metricName) {
                this.metricName = metricName;
                return this;
            }

            /**
             * Promql.
             */
            public Builder promql(String promql) {
                this.promql = promql;
                return this;
            }

            /**
             * Type.
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
        @NameInMap("EntityIds")
        private String entityIds;

        @NameInMap("SpecificationName")
        private String specificationName;

        @NameInMap("TemplateName")
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
             * EntityIds.
             */
            public Builder entityIds(String entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * SpecificationName.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
                return this;
            }

            /**
             * TemplateName.
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
    public static class SpecificationMappings extends TeaModel {
        @NameInMap("SpecificationCode")
        private String specificationCode;

        @NameInMap("SpecificationName")
        private String specificationName;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TrialType")
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
             * SpecificationCode.
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * SpecificationName.
             */
            public Builder specificationName(String specificationName) {
                this.specificationName = specificationName;
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
             * TrialType.
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
        @NameInMap("MeteringEntityExtraInfos")
        private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos;

        @NameInMap("MeteringEntityMappings")
        private java.util.List < MeteringEntityMappings> meteringEntityMappings;

        @NameInMap("SpecificationMappings")
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
        public java.util.List < MeteringEntityExtraInfos> getMeteringEntityExtraInfos() {
            return this.meteringEntityExtraInfos;
        }

        /**
         * @return meteringEntityMappings
         */
        public java.util.List < MeteringEntityMappings> getMeteringEntityMappings() {
            return this.meteringEntityMappings;
        }

        /**
         * @return specificationMappings
         */
        public java.util.List < SpecificationMappings> getSpecificationMappings() {
            return this.specificationMappings;
        }

        public static final class Builder {
            private java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos; 
            private java.util.List < MeteringEntityMappings> meteringEntityMappings; 
            private java.util.List < SpecificationMappings> specificationMappings; 

            /**
             * MeteringEntityExtraInfos.
             */
            public Builder meteringEntityExtraInfos(java.util.List < MeteringEntityExtraInfos> meteringEntityExtraInfos) {
                this.meteringEntityExtraInfos = meteringEntityExtraInfos;
                return this;
            }

            /**
             * MeteringEntityMappings.
             */
            public Builder meteringEntityMappings(java.util.List < MeteringEntityMappings> meteringEntityMappings) {
                this.meteringEntityMappings = meteringEntityMappings;
                return this;
            }

            /**
             * SpecificationMappings.
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
        @NameInMap("EntityId")
        private String entityId;

        @NameInMap("Name")
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
             * EntityId.
             */
            public Builder entityId(String entityId) {
                this.entityId = entityId;
                return this;
            }

            /**
             * Name.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("Name")
        private String name;

        @NameInMap("Times")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
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
             * Times.
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
        @NameInMap("ChargeType")
        private String chargeType;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("Components")
        private java.util.List < String > components;

        @NameInMap("CssMetadata")
        private CssMetadata cssMetadata;

        @NameInMap("MarketplaceMetadata")
        private MarketplaceMetadata marketplaceMetadata;

        @NameInMap("MeteringEntities")
        private java.util.List < MeteringEntities> meteringEntities;

        @NameInMap("OrderTime")
        private java.util.Map < String, java.util.List<String>> orderTime;

        @NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @NameInMap("Specifications")
        private java.util.List < Specifications> specifications;

        @NameInMap("Type")
        private String type;

        private Commodity(Builder builder) {
            this.chargeType = builder.chargeType;
            this.commodityCode = builder.commodityCode;
            this.components = builder.components;
            this.cssMetadata = builder.cssMetadata;
            this.marketplaceMetadata = builder.marketplaceMetadata;
            this.meteringEntities = builder.meteringEntities;
            this.orderTime = builder.orderTime;
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
         * @return orderTime
         */
        public java.util.Map < String, java.util.List<String>> getOrderTime() {
            return this.orderTime;
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
            private java.util.Map < String, java.util.List<String>> orderTime; 
            private String saasBoostMetadata; 
            private java.util.List < Specifications> specifications; 
            private String type; 

            /**
             * ChargeType.
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * Components.
             */
            public Builder components(java.util.List < String > components) {
                this.components = components;
                return this;
            }

            /**
             * CssMetadata.
             */
            public Builder cssMetadata(CssMetadata cssMetadata) {
                this.cssMetadata = cssMetadata;
                return this;
            }

            /**
             * MarketplaceMetadata.
             */
            public Builder marketplaceMetadata(MarketplaceMetadata marketplaceMetadata) {
                this.marketplaceMetadata = marketplaceMetadata;
                return this;
            }

            /**
             * MeteringEntities.
             */
            public Builder meteringEntities(java.util.List < MeteringEntities> meteringEntities) {
                this.meteringEntities = meteringEntities;
                return this;
            }

            /**
             * OrderTime.
             */
            public Builder orderTime(java.util.Map < String, java.util.List<String>> orderTime) {
                this.orderTime = orderTime;
                return this;
            }

            /**
             * SaasBoostMetadata.
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * Specifications.
             */
            public Builder specifications(java.util.List < Specifications> specifications) {
                this.specifications = specifications;
                return this;
            }

            /**
             * Type.
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
    public static class CommodityEntities extends TeaModel {
        @NameInMap("EntityIds")
        private java.util.List < String > entityIds;

        @NameInMap("PredefinedParameterName")
        private String predefinedParameterName;

        @NameInMap("TemplateName")
        private String templateName;

        private CommodityEntities(Builder builder) {
            this.entityIds = builder.entityIds;
            this.predefinedParameterName = builder.predefinedParameterName;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommodityEntities create() {
            return builder().build();
        }

        /**
         * @return entityIds
         */
        public java.util.List < String > getEntityIds() {
            return this.entityIds;
        }

        /**
         * @return predefinedParameterName
         */
        public String getPredefinedParameterName() {
            return this.predefinedParameterName;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.List < String > entityIds; 
            private String predefinedParameterName; 
            private String templateName; 

            /**
             * EntityIds.
             */
            public Builder entityIds(java.util.List < String > entityIds) {
                this.entityIds = entityIds;
                return this;
            }

            /**
             * PredefinedParameterName.
             */
            public Builder predefinedParameterName(String predefinedParameterName) {
                this.predefinedParameterName = predefinedParameterName;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public CommodityEntities build() {
                return new CommodityEntities(this);
            } 

        } 

    }
    public static class CommoditySpecifications extends TeaModel {
        @NameInMap("PredefinedParameterName")
        private String predefinedParameterName;

        @NameInMap("SpecificationCode")
        private String specificationCode;

        @NameInMap("TemplateName")
        private String templateName;

        private CommoditySpecifications(Builder builder) {
            this.predefinedParameterName = builder.predefinedParameterName;
            this.specificationCode = builder.specificationCode;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CommoditySpecifications create() {
            return builder().build();
        }

        /**
         * @return predefinedParameterName
         */
        public String getPredefinedParameterName() {
            return this.predefinedParameterName;
        }

        /**
         * @return specificationCode
         */
        public String getSpecificationCode() {
            return this.specificationCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String predefinedParameterName; 
            private String specificationCode; 
            private String templateName; 

            /**
             * PredefinedParameterName.
             */
            public Builder predefinedParameterName(String predefinedParameterName) {
                this.predefinedParameterName = predefinedParameterName;
                return this;
            }

            /**
             * SpecificationCode.
             */
            public Builder specificationCode(String specificationCode) {
                this.specificationCode = specificationCode;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public CommoditySpecifications build() {
                return new CommoditySpecifications(this);
            } 

        } 

    }
    public static class ComponentsConfigs extends TeaModel {
        @NameInMap("ComponentsMappings")
        private java.util.Map < String, String > componentsMappings;

        @NameInMap("TemplateName")
        private String templateName;

        private ComponentsConfigs(Builder builder) {
            this.componentsMappings = builder.componentsMappings;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentsConfigs create() {
            return builder().build();
        }

        /**
         * @return componentsMappings
         */
        public java.util.Map < String, String > getComponentsMappings() {
            return this.componentsMappings;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private java.util.Map < String, String > componentsMappings; 
            private String templateName; 

            /**
             * ComponentsMappings.
             */
            public Builder componentsMappings(java.util.Map < String, String > componentsMappings) {
                this.componentsMappings = componentsMappings;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public ComponentsConfigs build() {
                return new ComponentsConfigs(this);
            } 

        } 

    }
    public static class Agreements extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Url")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
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
        @NameInMap("Agreements")
        private java.util.List < Agreements> agreements;

        @NameInMap("Image")
        private String image;

        @NameInMap("Locale")
        private String locale;

        @NameInMap("LongDescriptionUrl")
        private String longDescriptionUrl;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShortDescription")
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
             * Agreements.
             */
            public Builder agreements(java.util.List < Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

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
             * LongDescriptionUrl.
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
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
    public static class Statistic extends TeaModel {
        @NameInMap("AccumulativeInstanceCount")
        private Integer accumulativeInstanceCount;

        @NameInMap("AccumulativePocAmount")
        private Double accumulativePocAmount;

        @NameInMap("AccumulativeUserCount")
        private Integer accumulativeUserCount;

        @NameInMap("AveragePocAmount")
        private Double averagePocAmount;

        @NameInMap("AveragePocDuration")
        private Double averagePocDuration;

        @NameInMap("AveragePocUnitAmount")
        private Double averagePocUnitAmount;

        @NameInMap("DeployedServiceInstanceCount")
        private Integer deployedServiceInstanceCount;

        @NameInMap("DeployedUserCount")
        private Integer deployedUserCount;

        @NameInMap("SubmittedUsageCount")
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
             * AccumulativeInstanceCount.
             */
            public Builder accumulativeInstanceCount(Integer accumulativeInstanceCount) {
                this.accumulativeInstanceCount = accumulativeInstanceCount;
                return this;
            }

            /**
             * AccumulativePocAmount.
             */
            public Builder accumulativePocAmount(Double accumulativePocAmount) {
                this.accumulativePocAmount = accumulativePocAmount;
                return this;
            }

            /**
             * AccumulativeUserCount.
             */
            public Builder accumulativeUserCount(Integer accumulativeUserCount) {
                this.accumulativeUserCount = accumulativeUserCount;
                return this;
            }

            /**
             * AveragePocAmount.
             */
            public Builder averagePocAmount(Double averagePocAmount) {
                this.averagePocAmount = averagePocAmount;
                return this;
            }

            /**
             * AveragePocDuration.
             */
            public Builder averagePocDuration(Double averagePocDuration) {
                this.averagePocDuration = averagePocDuration;
                return this;
            }

            /**
             * AveragePocUnitAmount.
             */
            public Builder averagePocUnitAmount(Double averagePocUnitAmount) {
                this.averagePocUnitAmount = averagePocUnitAmount;
                return this;
            }

            /**
             * DeployedServiceInstanceCount.
             */
            public Builder deployedServiceInstanceCount(Integer deployedServiceInstanceCount) {
                this.deployedServiceInstanceCount = deployedServiceInstanceCount;
                return this;
            }

            /**
             * DeployedUserCount.
             */
            public Builder deployedUserCount(Integer deployedUserCount) {
                this.deployedUserCount = deployedUserCount;
                return this;
            }

            /**
             * SubmittedUsageCount.
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
