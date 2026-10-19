// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mns_open20220119.models;

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
 * {@link GetSubscriptionAttributesResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionAttributesResponseBody</p>
 */
public class GetSubscriptionAttributesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetSubscriptionAttributesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionAttributesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Long code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetSubscriptionAttributesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.status = model.status;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>operation success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>06273500-249F-5863-121D-74D51123****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The status of the response.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSubscriptionAttributesResponseBody build() {
            return new GetSubscriptionAttributesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubscriptionAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionAttributesResponseBody</p>
     */
    public static class DlqPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeadLetterTargetQueue")
        private String deadLetterTargetQueue;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        private DlqPolicy(Builder builder) {
            this.deadLetterTargetQueue = builder.deadLetterTargetQueue;
            this.enabled = builder.enabled;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DlqPolicy create() {
            return builder().build();
        }

        /**
         * @return deadLetterTargetQueue
         */
        public String getDeadLetterTargetQueue() {
            return this.deadLetterTargetQueue;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        public static final class Builder {
            private String deadLetterTargetQueue; 
            private Boolean enabled; 

            private Builder() {
            } 

            private Builder(DlqPolicy model) {
                this.deadLetterTargetQueue = model.deadLetterTargetQueue;
                this.enabled = model.enabled;
            } 

            /**
             * <p>The destination queue for dead-letter message delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>deadLetterTargetQueue</p>
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * <p>Indicates whether dead-letter message delivery is enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            public DlqPolicy build() {
                return new DlqPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionAttributesResponseBody</p>
     */
    public static class TenantRateLimitPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("MaxReceivesPerSecond")
        private Integer maxReceivesPerSecond;

        private TenantRateLimitPolicy(Builder builder) {
            this.enabled = builder.enabled;
            this.maxReceivesPerSecond = builder.maxReceivesPerSecond;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantRateLimitPolicy create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return maxReceivesPerSecond
         */
        public Integer getMaxReceivesPerSecond() {
            return this.maxReceivesPerSecond;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Integer maxReceivesPerSecond; 

            private Builder() {
            } 

            private Builder(TenantRateLimitPolicy model) {
                this.enabled = model.enabled;
                this.maxReceivesPerSecond = model.maxReceivesPerSecond;
            } 

            /**
             * <p>Indicates whether throttling is enabled. Valid values: true or false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of messages received per second.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder maxReceivesPerSecond(Integer maxReceivesPerSecond) {
                this.maxReceivesPerSecond = maxReceivesPerSecond;
                return this;
            }

            public TenantRateLimitPolicy build() {
                return new TenantRateLimitPolicy(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubscriptionAttributesResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubscriptionAttributesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DlqPolicy")
        private DlqPolicy dlqPolicy;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("FilterTag")
        private String filterTag;

        @com.aliyun.core.annotation.NameInMap("LastModifyTime")
        private Long lastModifyTime;

        @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
        private String notifyContentFormat;

        @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
        private String notifyStrategy;

        @com.aliyun.core.annotation.NameInMap("SubscriptionName")
        private String subscriptionName;

        @com.aliyun.core.annotation.NameInMap("TenantRateLimitPolicy")
        private TenantRateLimitPolicy tenantRateLimitPolicy;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        @com.aliyun.core.annotation.NameInMap("TopicOwner")
        private String topicOwner;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.dlqPolicy = builder.dlqPolicy;
            this.endpoint = builder.endpoint;
            this.filterTag = builder.filterTag;
            this.lastModifyTime = builder.lastModifyTime;
            this.notifyContentFormat = builder.notifyContentFormat;
            this.notifyStrategy = builder.notifyStrategy;
            this.subscriptionName = builder.subscriptionName;
            this.tenantRateLimitPolicy = builder.tenantRateLimitPolicy;
            this.topicName = builder.topicName;
            this.topicOwner = builder.topicOwner;
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
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dlqPolicy
         */
        public DlqPolicy getDlqPolicy() {
            return this.dlqPolicy;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return filterTag
         */
        public String getFilterTag() {
            return this.filterTag;
        }

        /**
         * @return lastModifyTime
         */
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        /**
         * @return notifyContentFormat
         */
        public String getNotifyContentFormat() {
            return this.notifyContentFormat;
        }

        /**
         * @return notifyStrategy
         */
        public String getNotifyStrategy() {
            return this.notifyStrategy;
        }

        /**
         * @return subscriptionName
         */
        public String getSubscriptionName() {
            return this.subscriptionName;
        }

        /**
         * @return tenantRateLimitPolicy
         */
        public TenantRateLimitPolicy getTenantRateLimitPolicy() {
            return this.tenantRateLimitPolicy;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        /**
         * @return topicOwner
         */
        public String getTopicOwner() {
            return this.topicOwner;
        }

        public static final class Builder {
            private Long createTime; 
            private DlqPolicy dlqPolicy; 
            private String endpoint; 
            private String filterTag; 
            private Long lastModifyTime; 
            private String notifyContentFormat; 
            private String notifyStrategy; 
            private String subscriptionName; 
            private TenantRateLimitPolicy tenantRateLimitPolicy; 
            private String topicName; 
            private String topicOwner; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.createTime = model.createTime;
                this.dlqPolicy = model.dlqPolicy;
                this.endpoint = model.endpoint;
                this.filterTag = model.filterTag;
                this.lastModifyTime = model.lastModifyTime;
                this.notifyContentFormat = model.notifyContentFormat;
                this.notifyStrategy = model.notifyStrategy;
                this.subscriptionName = model.subscriptionName;
                this.tenantRateLimitPolicy = model.tenantRateLimitPolicy;
                this.topicName = model.topicName;
                this.topicOwner = model.topicOwner;
            } 

            /**
             * <p>The time when the subscription was created. The value is a UNIX timestamp in seconds in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554806</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The dead-letter queue policy.</p>
             */
            public Builder dlqPolicy(DlqPolicy dlqPolicy) {
                this.dlqPolicy = dlqPolicy;
                return this;
            }

            /**
             * <p>The endpoint address of the subscription.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example.com">http://example.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The tag used for message filtering in the subscription. Only messages with matching tags are pushed.</p>
             * 
             * <strong>example:</strong>
             * <p>important</p>
             */
            public Builder filterTag(String filterTag) {
                this.filterTag = filterTag;
                return this;
            }

            /**
             * <p>The time when the subscription attributes were last modified. The value is a UNIX timestamp in seconds in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1449554962</p>
             */
            public Builder lastModifyTime(Long lastModifyTime) {
                this.lastModifyTime = lastModifyTime;
                return this;
            }

            /**
             * <p>The format of the message content pushed to the endpoint. Valid values:</p>
             * <ul>
             * <li><p>XML</p>
             * </li>
             * <li><p>JSON</p>
             * </li>
             * <li><p>SIMPLIFIED</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>XML</p>
             */
            public Builder notifyContentFormat(String notifyContentFormat) {
                this.notifyContentFormat = notifyContentFormat;
                return this;
            }

            /**
             * <p>The retry strategy used when an error occurs while pushing messages to the endpoint. Valid values:</p>
             * <ul>
             * <li><p>BACKOFF_RETRY: backoff retry.</p>
             * </li>
             * <li><p>EXPONENTIAL_DECAY_RETRY: exponential decay retry.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BACKOFF_RETRY</p>
             */
            public Builder notifyStrategy(String notifyStrategy) {
                this.notifyStrategy = notifyStrategy;
                return this;
            }

            /**
             * <p>The name of the subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>MySubscription</p>
             */
            public Builder subscriptionName(String subscriptionName) {
                this.subscriptionName = subscriptionName;
                return this;
            }

            /**
             * <p>The throttling policy.</p>
             */
            public Builder tenantRateLimitPolicy(TenantRateLimitPolicy tenantRateLimitPolicy) {
                this.tenantRateLimitPolicy = tenantRateLimitPolicy;
                return this;
            }

            /**
             * <p>The name of the subscribed topic.</p>
             * 
             * <strong>example:</strong>
             * <p>MyTopic</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            /**
             * <p>The account ID of the owner of the subscribed topic.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789098****</p>
             */
            public Builder topicOwner(String topicOwner) {
                this.topicOwner = topicOwner;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
