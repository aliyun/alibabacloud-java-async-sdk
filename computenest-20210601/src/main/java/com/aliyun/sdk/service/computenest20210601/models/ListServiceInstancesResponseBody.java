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

        private Builder() {
        } 

        private Builder(ListServiceInstancesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serviceInstances = model.serviceInstances;
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
         * <p>The total number of results.</p>
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
             * OperationEndTime.
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

            private Builder() {
            } 

            private Builder(Commodity model) {
                this.saasBoostMetadata = model.saasBoostMetadata;
                this.type = model.type;
            } 

            /**
             * <p>The metadata of the Software as a Service (SaaS) Boost configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *      //Enable/disable SaaS Boost binding
             *     &quot;Enabled&quot;:true/false,default is false
             *     //Public access URL
             *     &quot;PublicAccessUrl&quot;:&quot;<a href="https://example.com">https://example.com</a>&quot;
             * }</p>
             */
            public Builder saasBoostMetadata(String saasBoostMetadata) {
                this.saasBoostMetadata = saasBoostMetadata;
                return this;
            }

            /**
             * <p>The type. Possible values:</p>
             * <ul>
             * <li><p>Marketplace: Alibaba Cloud Marketplace.</p>
             * </li>
             * <li><p>Css: Lingxiao.</p>
             * </li>
             * <li><p>SaasBoost: SaaS Boost.</p>
             * </li>
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

            private Builder() {
            } 

            private Builder(Service model) {
                this.commodity = model.commodity;
                this.deployType = model.deployType;
                this.publishTime = model.publishTime;
                this.serviceId = model.serviceId;
                this.serviceInfos = model.serviceInfos;
                this.serviceType = model.serviceType;
                this.status = model.status;
                this.supplierName = model.supplierName;
                this.supplierUrl = model.supplierUrl;
                this.version = model.version;
                this.versionName = model.versionName;
            } 

            /**
             * <p>The commodity specifications.</p>
             */
            public Builder commodity(Commodity commodity) {
                this.commodity = commodity;
                return this;
            }

            /**
             * <p>The deployment type. Possible values:</p>
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
             * <p>The publishing time.</p>
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
             * <p>The service information.</p>
             */
            public Builder serviceInfos(java.util.List<ServiceInfos> serviceInfos) {
                this.serviceInfos = serviceInfos;
                return this;
            }

            /**
             * <p>The service type. Possible values:</p>
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
             * <p>The service status.</p>
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
             * <p>Company A Ltd.</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
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

        @com.aliyun.core.annotation.NameInMap("GrantedPermission")
        private GrantedPermission grantedPermission;

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

        @com.aliyun.core.annotation.NameInMap("PolicyNames")
        private String policyNames;

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

        @com.aliyun.core.annotation.NameInMap("SupportTrialToPrivate")
        private Boolean supportTrialToPrivate;

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
            this.grantedPermission = builder.grantedPermission;
            this.marketInstanceId = builder.marketInstanceId;
            this.name = builder.name;
            this.operatedServiceInstanceId = builder.operatedServiceInstanceId;
            this.operationEndTime = builder.operationEndTime;
            this.operationStartTime = builder.operationStartTime;
            this.orderId = builder.orderId;
            this.outputs = builder.outputs;
            this.parameters = builder.parameters;
            this.payType = builder.payType;
            this.policyNames = builder.policyNames;
            this.progress = builder.progress;
            this.resourceGroupId = builder.resourceGroupId;
            this.resources = builder.resources;
            this.service = builder.service;
            this.serviceInstanceId = builder.serviceInstanceId;
            this.serviceType = builder.serviceType;
            this.source = builder.source;
            this.status = builder.status;
            this.statusDetail = builder.statusDetail;
            this.supportTrialToPrivate = builder.supportTrialToPrivate;
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
         * @return grantedPermission
         */
        public GrantedPermission getGrantedPermission() {
            return this.grantedPermission;
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

        public static final class Builder {
            private String bizStatus; 
            private String createTime; 
            private Boolean enableInstanceOps; 
            private String endTime; 
            private GrantedPermission grantedPermission; 
            private String marketInstanceId; 
            private String name; 
            private String operatedServiceInstanceId; 
            private String operationEndTime; 
            private String operationStartTime; 
            private String orderId; 
            private String outputs; 
            private String parameters; 
            private String payType; 
            private String policyNames; 
            private Long progress; 
            private String resourceGroupId; 
            private String resources; 
            private Service service; 
            private String serviceInstanceId; 
            private String serviceType; 
            private String source; 
            private String status; 
            private String statusDetail; 
            private Boolean supportTrialToPrivate; 
            private java.util.List<Tags> tags; 
            private String templateName; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(ServiceInstances model) {
                this.bizStatus = model.bizStatus;
                this.createTime = model.createTime;
                this.enableInstanceOps = model.enableInstanceOps;
                this.endTime = model.endTime;
                this.grantedPermission = model.grantedPermission;
                this.marketInstanceId = model.marketInstanceId;
                this.name = model.name;
                this.operatedServiceInstanceId = model.operatedServiceInstanceId;
                this.operationEndTime = model.operationEndTime;
                this.operationStartTime = model.operationStartTime;
                this.orderId = model.orderId;
                this.outputs = model.outputs;
                this.parameters = model.parameters;
                this.payType = model.payType;
                this.policyNames = model.policyNames;
                this.progress = model.progress;
                this.resourceGroupId = model.resourceGroupId;
                this.resources = model.resources;
                this.service = model.service;
                this.serviceInstanceId = model.serviceInstanceId;
                this.serviceType = model.serviceType;
                this.source = model.source;
                this.status = model.status;
                this.statusDetail = model.statusDetail;
                this.supportTrialToPrivate = model.supportTrialToPrivate;
                this.tags = model.tags;
                this.templateName = model.templateName;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The business status of the service instance. Possible values:</p>
             * <ul>
             * <li><p>Normal: The service instance is running as expected.</p>
             * </li>
             * <li><p>Renewing: The service instance is being renewed.</p>
             * </li>
             * <li><p>RenewFoiled: The renewal of the service instance failed.</p>
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-20T00:00:00Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Indicates whether the service instance has the Alibaba Cloud Managed Services feature. Possible values:</p>
             * <ul>
             * <li><p>true: The service instance has the Alibaba Cloud Managed Services feature.</p>
             * </li>
             * <li><p>false: The service instance does not have the Alibaba Cloud Managed Services feature.</p>
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
             * <p>The expiration time of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-01T12:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * <p>The ID of the service instance that is managed by Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>si-d6ab3a63ccbb4b17****</p>
             */
            public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
                this.operatedServiceInstanceId = operatedServiceInstanceId;
                return this;
            }

            /**
             * <p>The end time of the Alibaba Cloud Managed Services.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-01-28T06:48:56Z</p>
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * <p>The start time of the Alibaba Cloud Managed Services.</p>
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
             * <p>The output information of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;managementUrl&quot;: &quot;<a href="http://xx.xx%22%7D">http://xx.xx&quot;}</a></p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The parameter information of the service instance.</p>
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
             * <li><p>Permanent: The service is purchased permanently.</p>
             * </li>
             * <li><p>Subscription: The service is a subscription instance from Alibaba Cloud Marketplace.</p>
             * </li>
             * <li><p>PayAsYouGo: The service is a pay-as-you-go instance from Alibaba Cloud Marketplace.</p>
             * </li>
             * <li><p>CustomFixTime: The service has a custom fixed duration.</p>
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
             * <p>The service.</p>
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
             * <p>The service type. Possible values:</p>
             * <ul>
             * <li><p>private: The service is deployed in the user\&quot;s account.</p>
             * </li>
             * <li><p>managed: The service is hosted in the service provider\&quot;s account.</p>
             * </li>
             * <li><p>operation: The service is an Alibaba Cloud Managed Service.</p>
             * </li>
             * <li><p>poc: The service instance is a trial instance.</p>
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
             * <p>The source from which the service instance was created.</p>
             * 
             * <strong>example:</strong>
             * <p>Supplier</p>
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * <p>The status of the service instance. Possible values:</p>
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
             * <p>The description of the deployment information of the service instance.</p>
             * 
             * <strong>example:</strong>
             * <p>deploy successfully</p>
             */
            public Builder statusDetail(String statusDetail) {
                this.statusDetail = statusDetail;
                return this;
            }

            /**
             * <p>Indicates whether the trial instance can be converted to a regular instance.</p>
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
             * <p>The update time.</p>
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
