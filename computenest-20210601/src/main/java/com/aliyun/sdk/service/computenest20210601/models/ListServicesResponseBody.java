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

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAfu+XtuBE55iRLHEYYuojI41</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3F976EF8-C10A-57DC-917C-BB7BEB508FFB</p>
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
         * <p>1</p>
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

        @com.aliyun.core.annotation.NameInMap("DeployPage")
        private String deployPage;

        private Commodity(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.deployPage = builder.deployPage;
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
         * @return deployPage
         */
        public String getDeployPage() {
            return this.deployPage;
        }

        public static final class Builder {
            private String commodityCode; 
            private String deployPage; 

            /**
             * <p>The commodity code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00****</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>Deploy Page.</p>
             * 
             * <strong>example:</strong>
             * <p>Order： Order Page
             * Detail： Detail Page</p>
             */
            public Builder deployPage(String deployPage) {
                this.deployPage = deployPage;
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

            /**
             * <p>The tag key.</p>
             * <blockquote>
             * <p> This parameter is required.</p>
             * </blockquote>
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
        @com.aliyun.core.annotation.NameInMap("Categories")
        private String categories;

        @com.aliyun.core.annotation.NameInMap("Commodity")
        private Commodity commodity;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("DeployFrom")
        private String deployFrom;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("Score")
        private Integer score;

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

        @com.aliyun.core.annotation.NameInMap("SupplierNameEng")
        private String supplierNameEng;

        @com.aliyun.core.annotation.NameInMap("SupplierUid")
        private Long supplierUid;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TenantType")
        private String tenantType;

        @com.aliyun.core.annotation.NameInMap("TrialDuration")
        private String trialDuration;

        @com.aliyun.core.annotation.NameInMap("TrialType")
        private String trialType;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        @com.aliyun.core.annotation.NameInMap("VirtualInternetService")
        private String virtualInternetService;

        private Services(Builder builder) {
            this.categories = builder.categories;
            this.commodity = builder.commodity;
            this.commodityCode = builder.commodityCode;
            this.deployFrom = builder.deployFrom;
            this.deployType = builder.deployType;
            this.publishTime = builder.publishTime;
            this.score = builder.score;
            this.serviceId = builder.serviceId;
            this.serviceInfos = builder.serviceInfos;
            this.serviceProductUrl = builder.serviceProductUrl;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.supplierNameEng = builder.supplierNameEng;
            this.supplierUid = builder.supplierUid;
            this.supplierUrl = builder.supplierUrl;
            this.tags = builder.tags;
            this.tenantType = builder.tenantType;
            this.trialDuration = builder.trialDuration;
            this.trialType = builder.trialType;
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
         * @return deployFrom
         */
        public String getDeployFrom() {
            return this.deployFrom;
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
         * @return score
         */
        public Integer getScore() {
            return this.score;
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
         * @return supplierNameEng
         */
        public String getSupplierNameEng() {
            return this.supplierNameEng;
        }

        /**
         * @return supplierUid
         */
        public Long getSupplierUid() {
            return this.supplierUid;
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
         * @return trialDuration
         */
        public String getTrialDuration() {
            return this.trialDuration;
        }

        /**
         * @return trialType
         */
        public String getTrialType() {
            return this.trialType;
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
            private String categories; 
            private Commodity commodity; 
            private String commodityCode; 
            private String deployFrom; 
            private String deployType; 
            private String publishTime; 
            private Integer score; 
            private String serviceId; 
            private java.util.List<ServiceInfos> serviceInfos; 
            private String serviceProductUrl; 
            private String serviceType; 
            private String status; 
            private String supplierName; 
            private String supplierNameEng; 
            private Long supplierUid; 
            private String supplierUrl; 
            private java.util.List<Tags> tags; 
            private String tenantType; 
            private String trialDuration; 
            private String trialType; 
            private String version; 
            private String versionName; 
            private String virtualInternetService; 

            /**
             * <p>The category of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
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
             * <p>Service deployment approach. Valid values:</p>
             * <ul>
             * <li><p>NoWhere</p>
             * </li>
             * <li><p>Marketplace</p>
             * </li>
             * <li><p>ComputeNest</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ComputeNest</p>
             */
            public Builder deployFrom(String deployFrom) {
                this.deployFrom = deployFrom;
                return this;
            }

            /**
             * <p>The deployment type of the service. Valid values:</p>
             * <ul>
             * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
             * <li>terraform: The service is deployed by using Terraform.</li>
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
             * <p>The time when the service was published.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-21T10:35:44Z</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * <p>Service recommendation score.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder score(Integer score) {
                this.score = score;
                return this;
            }

            /**
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-6b5d632edd394dxxxxxx</p>
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
             * <p><a href="http://example1.com">http://example1.com</a></p>
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
             * <p>The name of service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud</p>
             */
            public Builder supplierNameEng(String supplierNameEng) {
                this.supplierNameEng = supplierNameEng;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>1436322xxxxx</p>
             */
            public Builder supplierUid(Long supplierUid) {
                this.supplierUid = supplierUid;
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
             * <p>The tags.</p>
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
             * <p>The trial duration. Unit: day. The maximum trial duration cannot exceed 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder trialDuration(String trialDuration) {
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
             * <p>The version of the service.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
