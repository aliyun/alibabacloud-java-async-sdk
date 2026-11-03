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
         * <p>The number of entries returned per page. Maximum value: 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query.</p>
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
         * <p>The list of services.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The total number of results.</p>
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

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.commodityCode = model.commodityCode;
                this.deployPage = model.deployPage;
            } 

            /**
             * <p>The commodity specification code.</p>
             * 
             * <strong>example:</strong>
             * <p>cmjj00****</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The deployment page.</p>
             * 
             * <strong>example:</strong>
             * <p>Order: Order page
             * Detail: Details page</p>
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
             * <p>The software name.</p>
             * 
             * <strong>example:</strong>
             * <p>wordpress</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The software version.</p>
             * 
             * <strong>example:</strong>
             * <p>6.0.1</p>
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

        @com.aliyun.core.annotation.NameInMap("Softwares")
        private java.util.List<Softwares> softwares;

        private ServiceInfos(Builder builder) {
            this.image = builder.image;
            this.locale = builder.locale;
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

        /**
         * @return softwares
         */
        public java.util.List<Softwares> getSoftwares() {
            return this.softwares;
        }

        public static final class Builder {
            private String image; 
            private String locale; 
            private String name; 
            private String shortDescription; 
            private java.util.List<Softwares> softwares; 

            private Builder() {
            } 

            private Builder(ServiceInfos model) {
                this.image = model.image;
                this.locale = model.locale;
                this.name = model.name;
                this.shortDescription = model.shortDescription;
                this.softwares = model.softwares;
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
             * <p>The language of the service configuration. Valid values:</p>
             * <ul>
             * <li><p>zh-CN: Chinese.</p>
             * </li>
             * <li><p>en-US: English.</p>
             * </li>
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
             * <p>The service name.</p>
             * 
             * <strong>example:</strong>
             * <p>Database B</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The service overview.</p>
             * 
             * <strong>example:</strong>
             * <p>B is an open-source distributed relational database independently designed and developed by Company A.</p>
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            /**
             * <p>The software information of the service.</p>
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
     * {@link ListServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServicesResponseBody</p>
     */
    public static class ServiceLocaleConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnValue")
        private String enValue;

        @com.aliyun.core.annotation.NameInMap("OriginalValue")
        private String originalValue;

        @com.aliyun.core.annotation.NameInMap("ZhValue")
        private String zhValue;

        private ServiceLocaleConfigs(Builder builder) {
            this.enValue = builder.enValue;
            this.originalValue = builder.originalValue;
            this.zhValue = builder.zhValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceLocaleConfigs create() {
            return builder().build();
        }

        /**
         * @return enValue
         */
        public String getEnValue() {
            return this.enValue;
        }

        /**
         * @return originalValue
         */
        public String getOriginalValue() {
            return this.originalValue;
        }

        /**
         * @return zhValue
         */
        public String getZhValue() {
            return this.zhValue;
        }

        public static final class Builder {
            private String enValue; 
            private String originalValue; 
            private String zhValue; 

            private Builder() {
            } 

            private Builder(ServiceLocaleConfigs model) {
                this.enValue = model.enValue;
                this.originalValue = model.originalValue;
                this.zhValue = model.zhValue;
            } 

            /**
             * <p>The English value of the business information.</p>
             * 
             * <strong>example:</strong>
             * <p>Service Name</p>
             */
            public Builder enValue(String enValue) {
                this.enValue = enValue;
                return this;
            }

            /**
             * <p>The raw data value of the business information.</p>
             * 
             * <strong>example:</strong>
             * <p>Service Name</p>
             */
            public Builder originalValue(String originalValue) {
                this.originalValue = originalValue;
                return this;
            }

            /**
             * <p>The Chinese value of the business information.</p>
             * 
             * <strong>example:</strong>
             * <p>服务名称</p>
             */
            public Builder zhValue(String zhValue) {
                this.zhValue = zhValue;
                return this;
            }

            public ServiceLocaleConfigs build() {
                return new ServiceLocaleConfigs(this);
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

        @com.aliyun.core.annotation.NameInMap("ServiceLocaleConfigs")
        private java.util.List<ServiceLocaleConfigs> serviceLocaleConfigs;

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
            this.serviceLocaleConfigs = builder.serviceLocaleConfigs;
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
         * @return serviceLocaleConfigs
         */
        public java.util.List<ServiceLocaleConfigs> getServiceLocaleConfigs() {
            return this.serviceLocaleConfigs;
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
            private java.util.List<ServiceLocaleConfigs> serviceLocaleConfigs; 
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

            private Builder() {
            } 

            private Builder(Services model) {
                this.categories = model.categories;
                this.commodity = model.commodity;
                this.commodityCode = model.commodityCode;
                this.deployFrom = model.deployFrom;
                this.deployType = model.deployType;
                this.publishTime = model.publishTime;
                this.score = model.score;
                this.serviceId = model.serviceId;
                this.serviceInfos = model.serviceInfos;
                this.serviceLocaleConfigs = model.serviceLocaleConfigs;
                this.serviceProductUrl = model.serviceProductUrl;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.supplierNameEng = model.supplierNameEng;
                this.supplierUid = model.supplierUid;
                this.supplierUrl = model.supplierUrl;
                this.tags = model.tags;
                this.tenantType = model.tenantType;
                this.trialDuration = model.trialDuration;
                this.trialType = model.trialType;
                this.version = model.version;
                this.versionName = model.versionName;
                this.virtualInternetService = model.virtualInternetService;
            } 

            /**
             * <p>The category of the data disk. Valid values:</p>
             * <ul>
             * <li><p>cloud_efficiency: ultra disk.</p>
             * </li>
             * <li><p>cloud_ssd: standard SSD.</p>
             * </li>
             * <li><p>cloud_essd: ESSD.</p>
             * </li>
             * <li><p>cloud: basic disk.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cloud_ssd</p>
             */
            public Builder categories(String categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The commodity specifications.</p>
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
             * <p>The deployment source of the service. Valid values:</p>
             * <ul>
             * <li><p>NoWhere: The service has no deployment source.</p>
             * </li>
             * <li><p>Marketplace: The service is deployed from Alibaba Cloud Marketplace.</p>
             * </li>
             * <li><p>ComputeNest: The service is deployed from Compute Nest.</p>
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
             * <p>The deployment type. Valid values:</p>
             * <ul>
             * <li><p>ros: The service is deployed using ROS.</p>
             * </li>
             * <li><p>terraform: The service is deployed using Terraform.</p>
             * </li>
             * <li><p>spi: The service is deployed by calling SPI.</p>
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
             * <p>The service score.</p>
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
             * <p>The service information.</p>
             */
            public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * <p>The multi-language configurations of the service.</p>
             */
            public Builder serviceLocaleConfigs(java.util.List<ServiceLocaleConfigs> serviceLocaleConfigs) {
                this.serviceLocaleConfigs = serviceLocaleConfigs;
                return this;
            }

            /**
             * <p>The URL of the product page.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example1.com">http://example1.com</a></p>
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
             * <li><p>Draft: The service is in the draft state.</p>
             * </li>
             * <li><p>Submitted: The service is submitted for review. You cannot modify the service.</p>
             * </li>
             * <li><p>Approved: The service is approved. You cannot modify the service, but you can publish it.</p>
             * </li>
             * <li><p>Launching: The service is being published.</p>
             * </li>
             * <li><p>Online: The service is published.</p>
             * </li>
             * <li><p>Offline: The service is unpublished.</p>
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
             * <p>The service provider name.</p>
             * 
             * <strong>example:</strong>
             * <p>Company A Ltd.</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The English name of the service provider.</p>
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
             * <p>The service provider\&quot;s URL.</p>
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
             * <p>The tenant type. Valid values:</p>
             * <ul>
             * <li><p>SingleTenant: single-tenant.</p>
             * </li>
             * <li><p>MultiTenant: multi-tenant.</p>
             * </li>
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
             * <p>The trial duration. Unit: days. The maximum trial duration is 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder trialDuration(String trialDuration) {
                this.trialDuration = trialDuration;
                return this;
            }

            /**
             * <p>The trial type. Valid values:</p>
             * <ul>
             * <li><p>Trial: The service supports trial.</p>
             * </li>
             * <li><p>NotTrial: The service does not support trial.</p>
             * </li>
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
             * <p>The service version.</p>
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
             * <li><p>false: No.</p>
             * </li>
             * <li><p>true: Yes.</p>
             * </li>
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
