// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("dynamicCode")
    private String dynamicCode;

    @NameInMap("dynamicMessage")
    private String dynamicMessage;

    @NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("message")
    private String message;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private ListInstancesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The error code returned if the call failed.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The dynamic error code.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * The dynamic error message.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request. Each request has a unique ID. You can use this ID to troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    public static class ProductInfo extends TeaModel {
        @NameInMap("traceOn")
        private Boolean traceOn;

        private ProductInfo(Builder builder) {
            this.traceOn = builder.traceOn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return traceOn
         */
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public static final class Builder {
            private Boolean traceOn; 

            /**
             * traceOn.
             */
            public Builder traceOn(Boolean traceOn) {
                this.traceOn = traceOn;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("value")
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
             * The tag key of the resource.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The tag value of the resource.
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
    public static class List extends TeaModel {
        @NameInMap("commodityCode")
        private String commodityCode;

        @NameInMap("createTime")
        private String createTime;

        @NameInMap("expireTime")
        private String expireTime;

        @NameInMap("groupCount")
        private Long groupCount;

        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("instanceName")
        private String instanceName;

        @NameInMap("paymentType")
        private String paymentType;

        @NameInMap("productInfo")
        private ProductInfo productInfo;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("releaseTime")
        private String releaseTime;

        @NameInMap("remark")
        private String remark;

        @NameInMap("resourceGroupId")
        private String resourceGroupId;

        @NameInMap("seriesCode")
        private String seriesCode;

        @NameInMap("serviceCode")
        private String serviceCode;

        @NameInMap("startTime")
        private String startTime;

        @NameInMap("status")
        private String status;

        @NameInMap("subSeriesCode")
        private String subSeriesCode;

        @NameInMap("tags")
        private java.util.List < Tags> tags;

        @NameInMap("topicCount")
        private Long topicCount;

        @NameInMap("updateTime")
        private String updateTime;

        @NameInMap("userId")
        private String userId;

        private List(Builder builder) {
            this.commodityCode = builder.commodityCode;
            this.createTime = builder.createTime;
            this.expireTime = builder.expireTime;
            this.groupCount = builder.groupCount;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.paymentType = builder.paymentType;
            this.productInfo = builder.productInfo;
            this.regionId = builder.regionId;
            this.releaseTime = builder.releaseTime;
            this.remark = builder.remark;
            this.resourceGroupId = builder.resourceGroupId;
            this.seriesCode = builder.seriesCode;
            this.serviceCode = builder.serviceCode;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.subSeriesCode = builder.subSeriesCode;
            this.tags = builder.tags;
            this.topicCount = builder.topicCount;
            this.updateTime = builder.updateTime;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
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
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return groupCount
         */
        public Long getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return paymentType
         */
        public String getPaymentType() {
            return this.paymentType;
        }

        /**
         * @return productInfo
         */
        public ProductInfo getProductInfo() {
            return this.productInfo;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return releaseTime
         */
        public String getReleaseTime() {
            return this.releaseTime;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return seriesCode
         */
        public String getSeriesCode() {
            return this.seriesCode;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return subSeriesCode
         */
        public String getSubSeriesCode() {
            return this.subSeriesCode;
        }

        /**
         * @return tags
         */
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return topicCount
         */
        public Long getTopicCount() {
            return this.topicCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String commodityCode; 
            private String createTime; 
            private String expireTime; 
            private Long groupCount; 
            private String instanceId; 
            private String instanceName; 
            private String paymentType; 
            private ProductInfo productInfo; 
            private String regionId; 
            private String releaseTime; 
            private String remark; 
            private String resourceGroupId; 
            private String seriesCode; 
            private String serviceCode; 
            private String startTime; 
            private String status; 
            private String subSeriesCode; 
            private java.util.List < Tags> tags; 
            private Long topicCount; 
            private String updateTime; 
            private String userId; 

            /**
             * The commodity code of the instance. The commodity code of ApsaraMQ for RocketMQ 5.0 instances has a similar format to ons_rmqsub_public_cn.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * The time when the instance was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The time when the instance expires.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The number of consumer groups that are created on the instance.
             */
            public Builder groupCount(Long groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The instance name.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * The billing method of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   PayAsYouGo
             * *   Subscription
             */
            public Builder paymentType(String paymentType) {
                this.paymentType = paymentType;
                return this;
            }

            /**
             * productInfo.
             */
            public Builder productInfo(ProductInfo productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            /**
             * The ID of the region in which the instance resides.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The time when the instance was released.
             */
            public Builder releaseTime(String releaseTime) {
                this.releaseTime = releaseTime;
                return this;
            }

            /**
             * The instance description.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * The ID of the resource group to which the instance belongs.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The primary edition of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   standard: Standard Edition
             * *   ultimate: Enterprise Platinum Edition
             * *   professional: Professional Edition
             */
            public Builder seriesCode(String seriesCode) {
                this.seriesCode = seriesCode;
                return this;
            }

            /**
             * The code of the service to which the instance belongs. The service code of ApsaraMQ for RocketMQ is rmq.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * The time when the instance was started.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The instance status.
             * <p>
             * 
             * Valid values:
             * 
             * *   RELEASED
             * *   RUNNING
             * *   STOPPED
             * *   CHANGING
             * *   CREATING
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The sub-category edition of the instance.
             * <p>
             * 
             * Valid values:
             * 
             * *   cluster_ha: Cluster High-availability Edition
             * *   single_node: Standalone Edition
             */
            public Builder subSeriesCode(String subSeriesCode) {
                this.subSeriesCode = subSeriesCode;
                return this;
            }

            /**
             * The resource tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The number of topics that are created on the instance.
             */
            public Builder topicCount(Long topicCount) {
                this.topicCount = topicCount;
                return this;
            }

            /**
             * The time when the instance was last modified.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * The ID of the user who owns the instance.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        @NameInMap("pageNumber")
        private Long pageNumber;

        @NameInMap("pageSize")
        private Long pageSize;

        @NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The paginated data.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries returned on each page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
