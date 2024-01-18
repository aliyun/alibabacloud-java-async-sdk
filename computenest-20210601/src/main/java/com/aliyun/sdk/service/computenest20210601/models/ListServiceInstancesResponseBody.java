// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceInstancesResponseBody</p>
 */
public class ListServiceInstancesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceInstances")
    private java.util.List < ServiceInstances> serviceInstances;

    @NameInMap("TotalCount")
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
    public java.util.List < ServiceInstances> getServiceInstances() {
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
        private java.util.List < ServiceInstances> serviceInstances; 
        private Long totalCount; 

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
         * ServiceInstances.
         */
        public Builder serviceInstances(java.util.List < ServiceInstances> serviceInstances) {
            this.serviceInstances = serviceInstances;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceInstancesResponseBody build() {
            return new ListServiceInstancesResponseBody(this);
        } 

    } 

    public static class ServiceInfos extends TeaModel {
        @NameInMap("Image")
        private String image;

        @NameInMap("Locale")
        private String locale;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShortDescription")
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
    public static class Service extends TeaModel {
        @NameInMap("DeployType")
        private String deployType;

        @NameInMap("PublishTime")
        private String publishTime;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceInfos")
        private java.util.List < ServiceInfos> serviceInfos;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("SupplierUrl")
        private String supplierUrl;

        @NameInMap("Version")
        private String version;

        @NameInMap("VersionName")
        private String versionName;

        private Service(Builder builder) {
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
            private String deployType; 
            private String publishTime; 
            private String serviceId; 
            private java.util.List < ServiceInfos> serviceInfos; 
            private String serviceType; 
            private String status; 
            private String supplierName; 
            private String supplierUrl; 
            private String version; 
            private String versionName; 

            /**
             * DeployType.
             */
            public Builder deployType(String deployType) {
                this.deployType = deployType;
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

            public Service build() {
                return new Service(this);
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
    public static class ServiceInstances extends TeaModel {
        @NameInMap("BizStatus")
        private String bizStatus;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EnableInstanceOps")
        private Boolean enableInstanceOps;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("MarketInstanceId")
        private String marketInstanceId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OperatedServiceInstanceId")
        private String operatedServiceInstanceId;

        @NameInMap("OperationEndTime")
        private String operationEndTime;

        @NameInMap("OperationStartTime")
        private String operationStartTime;

        @NameInMap("Outputs")
        private String outputs;

        @NameInMap("Parameters")
        private String parameters;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("Progress")
        private Long progress;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Resources")
        private String resources;

        @NameInMap("Service")
        private Service service;

        @NameInMap("ServiceInstanceId")
        private String serviceInstanceId;

        @NameInMap("ServiceType")
        private String serviceType;

        @NameInMap("Source")
        private String source;

        @NameInMap("Status")
        private String status;

        @NameInMap("StatusDetail")
        private String statusDetail;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("UpdateTime")
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
        public java.util.List < Tags> getTags() {
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
            private java.util.List < Tags> tags; 
            private String templateName; 
            private String updateTime; 

            /**
             * BizStatus.
             */
            public Builder bizStatus(String bizStatus) {
                this.bizStatus = bizStatus;
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
             * EnableInstanceOps.
             */
            public Builder enableInstanceOps(Boolean enableInstanceOps) {
                this.enableInstanceOps = enableInstanceOps;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * MarketInstanceId.
             */
            public Builder marketInstanceId(String marketInstanceId) {
                this.marketInstanceId = marketInstanceId;
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
             * OperatedServiceInstanceId.
             */
            public Builder operatedServiceInstanceId(String operatedServiceInstanceId) {
                this.operatedServiceInstanceId = operatedServiceInstanceId;
                return this;
            }

            /**
             * OperationEndTime.
             */
            public Builder operationEndTime(String operationEndTime) {
                this.operationEndTime = operationEndTime;
                return this;
            }

            /**
             * OperationStartTime.
             */
            public Builder operationStartTime(String operationStartTime) {
                this.operationStartTime = operationStartTime;
                return this;
            }

            /**
             * Outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
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
             * Progress.
             */
            public Builder progress(Long progress) {
                this.progress = progress;
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
             * Resources.
             */
            public Builder resources(String resources) {
                this.resources = resources;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(Service service) {
                this.service = service;
                return this;
            }

            /**
             * ServiceInstanceId.
             */
            public Builder serviceInstanceId(String serviceInstanceId) {
                this.serviceInstanceId = serviceInstanceId;
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
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
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
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
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
             * UpdateTime.
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
