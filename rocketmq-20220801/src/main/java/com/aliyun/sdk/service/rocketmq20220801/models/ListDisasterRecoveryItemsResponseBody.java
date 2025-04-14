// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rocketmq20220801.models;

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
 * {@link ListDisasterRecoveryItemsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDisasterRecoveryItemsResponseBody</p>
 */
public class ListDisasterRecoveryItemsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("dynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private ListDisasterRecoveryItemsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
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

    public static ListDisasterRecoveryItemsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListDisasterRecoveryItemsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Access denied details, provided only when access is denied due to lack of RAM permissions</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Return result</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Dynamic error code</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>Dynamic error message</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>C115601B-8736-5BBF-AC99-7FEAE12xxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the request was successful</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListDisasterRecoveryItemsResponseBody build() {
            return new ListDisasterRecoveryItemsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDisasterRecoveryItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryItemsResponseBody</p>
     */
    public static class Topics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerGroupId")
        private String consumerGroupId;

        @com.aliyun.core.annotation.NameInMap("deliveryOrderType")
        private String deliveryOrderType;

        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("instanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("regionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("topicName")
        private String topicName;

        private Topics(Builder builder) {
            this.consumerGroupId = builder.consumerGroupId;
            this.deliveryOrderType = builder.deliveryOrderType;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Topics create() {
            return builder().build();
        }

        /**
         * @return consumerGroupId
         */
        public String getConsumerGroupId() {
            return this.consumerGroupId;
        }

        /**
         * @return deliveryOrderType
         */
        public String getDeliveryOrderType() {
            return this.deliveryOrderType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private String consumerGroupId; 
            private String deliveryOrderType; 
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Topics model) {
                this.consumerGroupId = model.consumerGroupId;
                this.deliveryOrderType = model.deliveryOrderType;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>Consumer group ID</p>
             * 
             * <strong>example:</strong>
             * <p>group-test</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The order in which messages are delivered to the target instance.</p>
             * <p>Parameter values are as follows:</p>
             * <ul>
             * <li>Concurrently: concurrent delivery</li>
             * <li>Orderly: sequential delivery</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Concurrently</p>
             */
            public Builder deliveryOrderType(String deliveryOrderType) {
                this.deliveryOrderType = deliveryOrderType;
                return this;
            }

            /**
             * <p>Instance ID</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-kh43w0olz0c</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>Region ID</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The topic name.</p>
             * 
             * <strong>example:</strong>
             * <p>topic-test</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Topics build() {
                return new Topics(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryItemsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("extInfo")
        private java.util.Map<String, String> extInfo;

        @com.aliyun.core.annotation.NameInMap("itemId")
        private Long itemId;

        @com.aliyun.core.annotation.NameInMap("itemStatus")
        private String itemStatus;

        @com.aliyun.core.annotation.NameInMap("planId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("topics")
        private java.util.List<Topics> topics;

        @com.aliyun.core.annotation.NameInMap("updateTime")
        private String updateTime;

        private List(Builder builder) {
            this.createTime = builder.createTime;
            this.extInfo = builder.extInfo;
            this.itemId = builder.itemId;
            this.itemStatus = builder.itemStatus;
            this.planId = builder.planId;
            this.topics = builder.topics;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extInfo
         */
        public java.util.Map<String, String> getExtInfo() {
            return this.extInfo;
        }

        /**
         * @return itemId
         */
        public Long getItemId() {
            return this.itemId;
        }

        /**
         * @return itemStatus
         */
        public String getItemStatus() {
            return this.itemStatus;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return topics
         */
        public java.util.List<Topics> getTopics() {
            return this.topics;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.Map<String, String> extInfo; 
            private Long itemId; 
            private String itemStatus; 
            private Long planId; 
            private java.util.List<Topics> topics; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(List model) {
                this.createTime = model.createTime;
                this.extInfo = model.extInfo;
                this.itemId = model.itemId;
                this.itemStatus = model.itemStatus;
                this.planId = model.planId;
                this.topics = model.topics;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>Creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-20 03:38:28</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Extended information</p>
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>Backup plan ID</p>
             * 
             * <strong>example:</strong>
             * <p>100070284</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>Backup mapping status:</p>
             * <ul>
             * <li>CREATING (Creating)</li>
             * <li>CHANGING (Changing)</li>
             * <li>RUNNING (Running)</li>
             * <li>MANUAL_STOPPED (Manually Stopped)</li>
             * <li>OVERDUE_STOPPED (Stopped Due to Overdue)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder itemStatus(String itemStatus) {
                this.itemStatus = itemStatus;
                return this;
            }

            /**
             * <p>Mapping ID</p>
             * 
             * <strong>example:</strong>
             * <p>1300000016</p>
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>Topics included in the backup mapping</p>
             */
            public Builder topics(java.util.List<Topics> topics) {
                this.topics = topics;
                return this;
            }

            /**
             * <p>Update time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-10-04 02:19:44</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDisasterRecoveryItemsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDisasterRecoveryItemsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("list")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("scrollId")
        private String scrollId;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.scrollId = builder.scrollId;
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
        public java.util.List<List> getList() {
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
         * @return scrollId
         */
        public String getScrollId() {
            return this.scrollId;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Long pageNumber; 
            private Long pageSize; 
            private String scrollId; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.scrollId = model.scrollId;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>Paged data</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Current page number</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Request scroll ID.
             * Automatically generated by the system, subsequent pagination requests need to include this return value to continue pagination.</p>
             * 
             * <strong>example:</strong>
             * <p>B13D0B07-F24B-4790-88D8-D47A38063D00</p>
             */
            public Builder scrollId(String scrollId) {
                this.scrollId = scrollId;
                return this;
            }

            /**
             * <p>Total number of records</p>
             * 
             * <strong>example:</strong>
             * <p>49</p>
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
