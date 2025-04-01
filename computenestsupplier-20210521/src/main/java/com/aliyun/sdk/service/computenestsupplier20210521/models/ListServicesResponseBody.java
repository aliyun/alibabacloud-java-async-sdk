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
    private java.util.List<Services> services;

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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Services> getServices() {
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
        private java.util.List<Services> services; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListServicesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.services = model.services;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI4=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>51945B04-6AA6-410D-93BA-236E0248B104</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The services.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServicesResponseBody build() {
            return new ListServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.commodityCode = model.commodityCode;
                this.saasBoostMetadata = model.saasBoostMetadata;
                this.type = model.type;
            } 

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00xxxx</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The configuration metadata related to Saas Boost.</p>
             * 
             * <strong>example:</strong>
             * <p>{ // Specifies whether to associate the service with the SaaS Boost commodity. Default value: false. &quot;Enabled&quot;:true/false // The public endpoint of the SaaS Boost instance. &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot; }</p>
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * <p>The platform type. Valid values:</p>
             * <ul>
             * <li>marketplace: Alibaba Cloud Marketplace.</li>
             * <li>Css: Lingxiao.</li>
             * <li>SaasBoost: Saas Boost.</li>
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
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
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
             * <p><a href="http://img.tidb.oss.url">http://img.tidb.oss.url</a></p>
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * <p>The language of the service. Valid values:</p>
             * <ul>
             * <li>zh-CN: Chinese.</li>
             * <li>en-US: English.</li>
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
             * <p>The name of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>SpringBoot-ECS容器版</p>
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

            public ServiceInfos build() {
                return new ServiceInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
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
    /**
     * 
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
     */
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
        private java.util.List<ServiceInfos> serviceInfos;

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
        private java.util.List<Tags> tags;

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
        public java.util.List<ServiceInfos> getServiceInfos() {
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
            private java.util.List<ServiceInfos> serviceInfos; 
            private String serviceType; 
            private String shareType; 
            private String sourceImage; 
            private String sourceServiceId; 
            private String sourceServiceVersion; 
            private String sourceSupplierName; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private java.util.List<Tags> tags; 
            private String tenantType; 
            private String trialType; 
            private String updateTime; 
            private String version; 
            private String versionName; 
            private String virtualInternetService; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.approvalType = model.approvalType;
                this.artifactId = model.artifactId;
                this.artifactVersion = model.artifactVersion;
                this.buildInfo = model.buildInfo;
                this.categories = model.categories;
                this.commodity = model.commodity;
                this.commodityCode = model.commodityCode;
                this.createTime = model.createTime;
                this.defaultVersion = model.defaultVersion;
                this.deployType = model.deployType;
                this.hasBeta = model.hasBeta;
                this.hasDraft = model.hasDraft;
                this.latestResellSourceServiceVersion = model.latestResellSourceServiceVersion;
                this.publishTime = model.publishTime;
                this.relationType = model.relationType;
                this.resellApplyStatus = model.resellApplyStatus;
                this.resellServiceId = model.resellServiceId;
                this.resourceGroupId = model.resourceGroupId;
                this.serviceDiscoverable = model.serviceDiscoverable;
                this.serviceId = model.serviceId;
                this.serviceInfos = model.serviceInfos;
                this.serviceType = model.serviceType;
                this.shareType = model.shareType;
                this.sourceImage = model.sourceImage;
                this.sourceServiceId = model.sourceServiceId;
                this.sourceServiceVersion = model.sourceServiceVersion;
                this.sourceSupplierName = model.sourceSupplierName;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.supplierUrl = model.supplierUrl;
                this.tags = model.tags;
                this.tenantType = model.tenantType;
                this.trialType = model.trialType;
                this.updateTime = model.updateTime;
                this.version = model.version;
                this.versionName = model.versionName;
                this.virtualInternetService = model.virtualInternetService;
            } 

            /**
             * <p>The approval type for applications for using the service. Valid values:</p>
             * <ul>
             * <li>Manual: The applications are manual reviewed.</li>
             * <li>AutoPass: The applications are automatically approved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AutoPass</p>
             */
            public Builder approvalType(String approvalType) {
                this.approvalType = approvalType;
                return this;
            }

            /**
             * <p>The ID of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>artifact-21ca53ac16a643xxxxxx</p>
             */
            public Builder artifactId(String artifactId) {
                this.artifactId = artifactId;
                return this;
            }

            /**
             * <p>The version of the artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>draft</p>
             */
            public Builder artifactVersion(String artifactVersion) {
                this.artifactVersion = artifactVersion;
                return this;
            }

            /**
             * <p>The informathon for build service.</p>
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
             * <p>OpenSource</p>
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
             * <p>Indicates whether the version is the default version. Valid values:</p>
             * <ul>
             * <li>false</li>
             * <li>true</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultVersion(Boolean defaultVersion) {
                this.defaultVersion = defaultVersion;
                return this;
            }

            /**
             * <p>The deployment type of the service. Valid values:</p>
             * <ul>
             * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
             * <li>terraform: The service is deployed by using Terraform.</li>
             * <li>spi: The service is deployed by calling the Service Provider Interface (SPI).</li>
             * <li>operation: The service is deployed by using a hosted O&amp;M service.</li>
             * <li>container: The service is deployed by using a container.</li>
             * <li></li>
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
             * <p>Indicates whether the service has a beta version. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasBeta(Boolean hasBeta) {
                this.hasBeta = hasBeta;
                return this;
            }

            /**
             * <p>Indicates whether the service has a draft version. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasDraft(Boolean hasDraft) {
                this.hasDraft = hasDraft;
                return this;
            }

            /**
             * <p>The latest version of the distribution source service.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder latestResellSourceServiceVersion(String latestResellSourceServiceVersion) {
                this.latestResellSourceServiceVersion = latestResellSourceServiceVersion;
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
             * <p>The purpose of the artifact. Valid values:</p>
             * <ul>
             * <li>ServiceDeployment: The artifact is used to create service instances.</li>
             * <li>ServiceUpgrade: The artifact is used to upgrade service instances.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ServiceDeployment</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>The state of distribution authorization of the service. Valid values:</p>
             * <ul>
             * <li>CanApply: Distributors can apply for distribution permissions.</li>
             * <li>Applied: The application for distribution permissions is submitted.</li>
             * <li>Approved: The application for distribution permissions is approved.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CanApply</p>
             */
            public Builder resellApplyStatus(String resellApplyStatus) {
                this.resellApplyStatus = resellApplyStatus;
                return this;
            }

            /**
             * <p>The ID of the distribution service.</p>
             * 
             * <strong>example:</strong>
             * <p>service-70a3b15bb62643xxxxxx</p>
             */
            public Builder resellServiceId(String resellServiceId) {
                this.resellServiceId = resellServiceId;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz5b555xxxxxx</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * <p>INVISIBLE</p>
             */
            public Builder serviceDiscoverable(String serviceDiscoverable) {
                this.serviceDiscoverable = serviceDiscoverable;
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
             * <li>Public: All users can go to the URL to create a formal service instance or a trial service instance.</li>
             * <li>Restricted: Only users in the whitelist can go to the URL to create a formal service instance or a trial service instance.</li>
             * <li>OnlyFormalRestricted: Only users in the whitelist can go to the URL to create a formal service instance.</li>
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
             * <p>The source image.</p>
             * 
             * <strong>example:</strong>
             * <p>centos_7</p>
             */
            public Builder sourceImage(String sourceImage) {
                this.sourceImage = sourceImage;
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
             * <p>The state of the service. Valid values:</p>
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
             * <p>The tenant type of the managed service. Valid values:</p>
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
             * <p>The time when the service was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21T00:00:00Z</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The custom version name defined by the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>v2.0.0</p>
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

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
