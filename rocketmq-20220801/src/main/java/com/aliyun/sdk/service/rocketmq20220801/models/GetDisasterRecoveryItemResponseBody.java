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
 * {@link GetDisasterRecoveryItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetDisasterRecoveryItemResponseBody</p>
 */
public class GetDisasterRecoveryItemResponseBody extends TeaModel {
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

    private GetDisasterRecoveryItemResponseBody(Builder builder) {
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

    public static GetDisasterRecoveryItemResponseBody create() {
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

        private Builder(GetDisasterRecoveryItemResponseBody model) {
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
         * <p>The details about the access denial. This parameter is returned only if the access is denied because the Resource Access Management (RAM) user does not have the required permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>InstanceId</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic error message.</p>
         * 
         * <strong>example:</strong>
         * <p>instanceId</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The error message.</p>
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
         * <p>AF9A8B10-C426-530F-A0DD-96320B39****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDisasterRecoveryItemResponseBody build() {
            return new GetDisasterRecoveryItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDisasterRecoveryItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetDisasterRecoveryItemResponseBody</p>
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
             * <p>The consumer group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx_reserve_group</p>
             */
            public Builder consumerGroupId(String consumerGroupId) {
                this.consumerGroupId = consumerGroupId;
                return this;
            }

            /**
             * <p>The order in which messages are delivered to the target instance. The parameter values ​​are as follows:</p>
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
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>rmq-cn-wwo3xxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Instance type</p>
             * <ul>
             * <li>ALIYUN_ROCKETMQ: Alibaba Cloud instance</li>
             * <li>EXTERNAL_ROCKETMQ: External instance, open-source instance, open-source cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN_ROCKETMQ</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>regionId</p>
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
             * <p>order_push_xxx</p>
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
     * {@link GetDisasterRecoveryItemResponseBody} extends {@link TeaModel}
     *
     * <p>GetDisasterRecoveryItemResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.extInfo = model.extInfo;
                this.itemId = model.itemId;
                this.itemStatus = model.itemStatus;
                this.planId = model.planId;
                this.topics = model.topics;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The time when the topic mapping task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-24 02:57:31</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>Additional Information</p>
             */
            public Builder extInfo(java.util.Map<String, String> extInfo) {
                this.extInfo = extInfo;
                return this;
            }

            /**
             * <p>The ID of the topic mapping</p>
             * 
             * <strong>example:</strong>
             * <p>100070284</p>
             */
            public Builder itemId(Long itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * <p>The topic mapping task status.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder itemStatus(String itemStatus) {
                this.itemStatus = itemStatus;
                return this;
            }

            /**
             * <p>The ID of the global message backup plan.</p>
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
             * <p>The time when the topic mapping task was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-09-26 02:13:10</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
