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
 * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstancesResponseBody</p>
 */
public class ListServiceInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceInstances")
    private java.util.List<ServiceInstances> serviceInstances;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListServiceInstancesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceInstances = builder.serviceInstances;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceInstancesResponseBody create() {
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
     * @return serviceInstances
     */
    public java.util.List<ServiceInstances> getServiceInstances() {
        return this.serviceInstances;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ServiceInstances> serviceInstances; 
        private Long totalCount; 

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
         * <p>E50287CB-AABF-4877-92C0-289B339A1546</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the service instances.</p>
         */
        public Builder serviceInstances(java.util.List<ServiceInstances> serviceInstances) {
            this.serviceInstances = serviceInstances;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceInstancesResponseBody build() {
            return new ListServiceInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstancesResponseBody</p>
     */
    public static class Commodity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaasBoostMetadata")
        private String saasBoostMetadata;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Commodity(Builder builder) {
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
            private String saasBoostMetadata; 
            private String type; 

            /**
             * <p>The configuration metadata related to SaaS Boost.</p>
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
             * <li>SaasBoost: SaaS Boost.</li>
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
     * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstancesResponseBody</p>
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
             * <p>wordpress</p>
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
     * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstancesResponseBody</p>
     */
    public static class Service extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Commodity")
        private Commodity commodity;

        @com.aliyun.core.annotation.NameInMap("DeployType")
        private String deployType;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceInfos")
        private java.util.List<ServiceInfos> serviceInfos;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private Service(Builder builder) {
            this.commodity = builder.commodity;
            this.deployType = builder.deployType;
            this.publishTime = builder.publishTime;
            this.serviceId = builder.serviceId;
            this.serviceInfos = builder.serviceInfos;
            this.serviceType = builder.serviceType;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.supplierUrl = builder.supplierUrl;
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
         * @return commodity
         */
        public Commodity getCommodity() {
            return this.commodity;
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
            private Commodity commodity; 
            private String deployType; 
            private String publishTime; 
            private String serviceId; 
            private java.util.List<ServiceInfos> serviceInfos; 
            private String serviceType; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private String version; 
            private String versionName; 

            /**
             * <p>The commodity details.</p>
             */
            public Builder commodity(Commodity commodity) {
                this.commodity = commodity;
                return this;
            }

            /**
             * <p>The deployment type of the service. Valid values:</p>
             * <ul>
             * <li>ros: The service is deployed by using Resource Orchestration Service (ROS).</li>
             * <li>terraform: The service is deployed by using Terraform.</li>
             * <li>ack: The service is deployed by using Alibaba Cloud Container Service for Kubernetes (ACK).</li>
             * <li>spi: The service is deployed by calling the Service Provider Interface (SPI).</li>
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
             * <p>The service ID.</p>
             * 
             * <strong>example:</strong>
             * <p>service-0e6fca6a51a54420****</p>
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
             * <p>The service state.</p>
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
     * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstancesResponseBody</p>
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
    /**
     * 
     * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceInstancesResponseBody</p>
     */
    public static class ServiceInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizStatus")
        private String bizStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EnableInstanceOps")
        private Boolean enableInstanceOps;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("MarketInstanceId")
        private String marketInstanceId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OperatedServiceInstanceId")
        private String operatedServiceInstanceId;

        @com.aliyun.core.annotation.NameInMap("OperationEndTime")
        private String operationEndTime;

        @com.aliyun.core.annotation.NameInMap("OperationStartTime")
        private String operationStartTime;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private String orderId;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private String parameters;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Long progress;

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

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private ServiceInstances(Builder builder) {
            this.bizStatus = builder.bizStatus;
            this.createTime = builder.createTime;
            this.enableInstanceOps = builder.enableInstanceOps;
            this.endTime = builder.endTime;
            this.marketInstanceId = builder.marketInstanceId;
            this.name = builder.name;
            this.operatedServiceInstanceId = builder.operatedServiceInstanceId;
            this.operationEndTime = builder.operationEndTime;
            this.operationStartTime = builder.operationStartTime;
            this.orderId = builder.orderId;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.payType = builder.payType;
            this.progress = builder.progress;
            this.resourceGroupId = builder.resourceGroupId;
            this.resources = builder.resources;
            this.service = builder.service;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.serviceType = builder.serviceType;
            this.source = builder.source;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.tags = builder.tags;
            this.templateName = builder.templateName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInstances create() {
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
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
         * @return orderId
         */
        public String getOrderId() {
            return this.orderId;
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
         * @return progress
         */
        public Long getProgress() {
            return this.progress;
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

        public static final class Builder {
            private String bizStatus; 
            private String createTime; 
            private Boolean enableInstanceOps; 
            private String endTime; 
            private String marketInstanceId; 
            private String name; 
            private String operatedServiceInstanceId; 
            private String operationEndTime; 
            private String operationStartTime; 
            private String orderId; 
            private String outputs; 
            private String parameters; 
            private String payType; 
            private Long progress; 
            private String resourceGroupId; 
            private String resources; 
            private Service service; 
            private String serviceInstanceId; 
            private String serviceType; 
            private String source; 
            private String status; 
            private String statusDetail; 
            private java.util.List<Tags> tags; 
            private String templateName; 
            private String updateTime; 

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
             * <p>Indicates whether the service instance supports the hosted O&amp;M feature. Valid values:</p>
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
             * <p>The ID of the Alibaba Cloud Marketplace instance.</p>
             * 
             * <strong>example:</strong>
             * <p>5827****</p>
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
             * <p>The ID of the managed service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>si-d6ab3a63ccbb4b17****</p>
             */
            public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
                this.operatedServiceInstanceId = operatedServiceInstanceId;
                return this;
            }

            /**
             * <p>The end of the time range during which hosted O&amp;M is implemented.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-28T06:48:56Z</p>
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * <p>The beginning of the time range during which hosted O&amp;M is implemented.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-29T06:48:56Z</p>
             */
            public Builder operationStartTime(String operationStartTime) {
                this.operationStartTime = operationStartTime;
                return this;
            }

            /**
             * <p>The order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2306175xxxxxxxx</p>
             */
            public Builder orderId(String orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The information returned after the service instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;managementUrl&quot;: &quot;<a href="http://xx.xx%22%7D">http://xx.xx&quot;}</a></p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The parameters of the service instance.</p>
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
             * <li>Permanent: Once you purchase the service, you can use it permanently.</li>
             * <li>Subscription: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a subscription basis.</li>
             * <li>PayAsYouGo: You purchase the service from Alibaba Cloud Marketplace and are charged for the service on a pay-as-you-go basis.</li>
             * <li>CustomFixTime: You are charged for the service based on a custom duration fixed by the service provider.</li>
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
             * <p>The deployment progress of the service instance, in percentage.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder progress(Long progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aekz6scpcxxxxxx</p>
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
             * <p>The services.</p>
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
             * <p>The type of the service. Valid values:</p>
             * <ul>
             * <li>private: The service is a private service and is deployed within the account of a customer.</li>
             * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
             * <li>operation: The service is a hosted O&amp;M service.</li>
             * <li>poc: The service is a trial service.</li>
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
             * <p>The source from which the service instance is created.</p>
             * 
             * <strong>example:</strong>
             * <p>Supplier</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The state of the service instance. Valid values:</p>
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
             * <p>The description of the deployment of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy successfully</p>
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
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
             * <p>模板1</p>
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

            public ServiceInstances build() {
                return new ServiceInstances(this);
            } 

        } 

    }
}
