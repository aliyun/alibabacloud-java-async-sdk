// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServicesResponseBody</p>
 */
public class ListServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List < Services> services;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListServicesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Services> services; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * Services.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commodity(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.saasBoostMetadata = builder.saasBoostMetadata;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commodity create() {
            return builder().build();
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return saasBoostMetadata
         */
        public String getSaasBoostMetadata() {
            return this.saasBoostMetadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String commodityCode; 
            private String saasBoostMetadata; 
            private String type; 

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
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
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApprovalType")
        private String approvalType;

        @com.aliyun.core.annotation.NameInMap("ArtifactId")
        private String artifactId;

        @com.aliyun.core.annotation.NameInMap("ArtifactVersion")
        private String artifactVersion;

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

        @com.aliyun.core.annotation.NameInMap("DefaultVersion")
        private Boolean defaultVersion;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("HasBeta")
        private Boolean hasBeta;

        @com.aliyun.core.annotation.NameInMap("HasDraft")
        private Boolean hasDraft;

        @com.aliyun.core.annotation.NameInMap("LatestResellSourceServiceVersion")
        private String latestResellSourceServiceVersion;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("ResellApplyStatus")
        private String resellApplyStatus;

        @com.aliyun.core.annotation.NameInMap("ResellServiceId")
        private String resellServiceId;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceDiscoverable")
        private String serviceDiscoverable;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceInfos")
        private java.util.List < ServiceInfos> serviceInfos;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("ShareType")
        private String shareType;

        @com.aliyun.core.annotation.NameInMap("SourceImage")
        private String sourceImage;

        @com.aliyun.core.annotation.NameInMap("SourceServiceId")
        private String sourceServiceId;

        @com.aliyun.core.annotation.NameInMap("SourceServiceVersion")
        private String sourceServiceVersion;

        @com.aliyun.core.annotation.NameInMap("SourceSupplierName")
        private String sourceSupplierName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantType")
        private String tenantType;

        @com.aliyun.core.annotation.NameInMap("TrialType")
        private String trialType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VirtualInternetService")
        private String virtualInternetService;

        private Services(Builder builder) {
            this.approvalType = builder.approvalType;
            this.artifactId = builder.artifactId;
            this.artifactVersion = builder.artifactVersion;
            this.buildInfo = builder.buildInfo;
            this.categories = builder.categories;
            this.commodity = builder.commodity;
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.defaultVersion = builder.defaultVersion;
            this.deployType = builder.deployType;
            this.hasBeta = builder.hasBeta;
            this.hasDraft = builder.hasDraft;
            this.latestResellSourceServiceVersion = builder.latestResellSourceServiceVersion;
            this.publishTime = builder.publishTime;
            this.relationType = builder.relationType;
            this.resellApplyStatus = builder.resellApplyStatus;
            this.resellServiceId = builder.resellServiceId;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceDiscoverable = builder.serviceDiscoverable;
            this.serviceId = builder.serviceId;
            this.serviceInfos = builder.serviceInfos;
            this.serviceType = builder.serviceType;
            this.shareType = builder.shareType;
            this.sourceImage = builder.sourceImage;
            this.sourceServiceId = builder.sourceServiceId;
            this.sourceServiceVersion = builder.sourceServiceVersion;
            this.sourceSupplierName = builder.sourceSupplierName;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.supplierUrl = builder.supplierUrl;
            this.tags = builder.tags;
            this.tenantType = builder.tenantType;
            this.trialType = builder.trialType;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
            this.versionName = builder.versionName;
            this.virtualInternetService = builder.virtualInternetService;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return approvalType
         */
        public String getApprovalType() {
            return this.approvalType;
        }

        /**
         * @return artifactId
         */
        public String getArtifactId() {
            return this.artifactId;
        }

        /**
         * @return artifactVersion
         */
        public String getArtifactVersion() {
            return this.artifactVersion;
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
         * @return defaultVersion
         */
        public Boolean getDefaultVersion() {
            return this.defaultVersion;
        }

        /**
         * @return deployType
         */
        public String getDeployType() {
            return this.deployType;
        }

        /**
         * @return hasBeta
         */
        public Boolean getHasBeta() {
            return this.hasBeta;
        }

        /**
         * @return hasDraft
         */
        public Boolean getHasDraft() {
            return this.hasDraft;
        }

        /**
         * @return latestResellSourceServiceVersion
         */
        public String getLatestResellSourceServiceVersion() {
            return this.latestResellSourceServiceVersion;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return resellApplyStatus
         */
        public String getResellApplyStatus() {
            return this.resellApplyStatus;
        }

        /**
         * @return resellServiceId
         */
        public String getResellServiceId() {
            return this.resellServiceId;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceDiscoverable
         */
        public String getServiceDiscoverable() {
            return this.serviceDiscoverable;
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
         * @return sourceImage
         */
        public String getSourceImage() {
            return this.sourceImage;
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

        public static final class Builder {
            private String approvalType; 
            private String artifactId; 
            private String artifactVersion; 
            private String buildInfo; 
            private String categories; 
            private Commodity commodity; 
            private String commodityCode; 
            private String createTime; 
            private Boolean defaultVersion; 
            private String deployType; 
            private Boolean hasBeta; 
            private Boolean hasDraft; 
            private String latestResellSourceServiceVersion; 
            private String publishTime; 
            private String relationType; 
            private String resellApplyStatus; 
            private String resellServiceId; 
            private String resourceGroupId; 
            private String serviceDiscoverable; 
            private String serviceId; 
            private java.util.List < ServiceInfos> serviceInfos; 
            private String serviceType; 
            private String shareType; 
            private String sourceImage; 
            private String sourceServiceId; 
            private String sourceServiceVersion; 
            private String sourceSupplierName; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private java.util.List < Tags> tags; 
            private String tenantType; 
            private String trialType; 
            private String updateTime; 
            private String version; 
            private String versionName; 
            private String virtualInternetService; 

            /**
             * ApprovalType.
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * ArtifactId.
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * ArtifactVersion.
             */
            public Builder artifactVersion(String artifactVersion) {
                this.artifactVersion = artifactVersion;
                return this;
            }

            /**
             * BuildInfo.
             */
            public Builder buildInfo(String buildInfo) {
                this.buildInfo = buildInfo;
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DefaultVersion.
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
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
             * HasBeta.
             */
            public Builder hasBeta(Boolean hasBeta) {
                this.hasBeta = hasBeta;
                return this;
            }

            /**
             * HasDraft.
             */
            public Builder hasDraft(Boolean hasDraft) {
                this.hasDraft = hasDraft;
                return this;
            }

            /**
             * LatestResellSourceServiceVersion.
             */
            public Builder latestResellSourceServiceVersion(String latestResellSourceServiceVersion) {
                this.latestResellSourceServiceVersion = latestResellSourceServiceVersion;
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
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * ResellApplyStatus.
             */
            public Builder resellApplyStatus(String resellApplyStatus) {
                this.resellApplyStatus = resellApplyStatus;
                return this;
            }

            /**
             * ResellServiceId.
             */
            public Builder resellServiceId(String resellServiceId) {
                this.resellServiceId = resellServiceId;
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
             * ServiceDiscoverable.
             */
            public Builder serviceDiscoverable(String serviceDiscoverable) {
                this.serviceDiscoverable = serviceDiscoverable;
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
             * SourceImage.
             */
            public Builder sourceImage(String sourceImage) {
                this.sourceImage = sourceImage;
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

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
