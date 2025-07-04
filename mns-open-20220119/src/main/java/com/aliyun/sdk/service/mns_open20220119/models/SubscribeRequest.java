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
 * {@link SubscribeRequest} extends {@link RequestModel}
 *
 * <p>SubscribeRequest</p>
 */
public class SubscribeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DlqPolicy")
    private DlqPolicy dlqPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageTag")
    private String messageTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyContentFormat")
    private String notifyContentFormat;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NotifyStrategy")
    private String notifyStrategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pushType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StsRoleArn")
    private String stsRoleArn;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String subscriptionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private SubscribeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dlqPolicy = builder.dlqPolicy;
        this.endpoint = builder.endpoint;
        this.messageTag = builder.messageTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
        this.pushType = builder.pushType;
        this.stsRoleArn = builder.stsRoleArn;
        this.subscriptionName = builder.subscriptionName;
        this.topicName = builder.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubscribeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return messageTag
     */
    public String getMessageTag() {
        return this.messageTag;
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
     * @return pushType
     */
    public String getPushType() {
        return this.pushType;
    }

    /**
     * @return stsRoleArn
     */
    public String getStsRoleArn() {
        return this.stsRoleArn;
    }

    /**
     * @return subscriptionName
     */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    public static final class Builder extends Request.Builder<SubscribeRequest, Builder> {
        private String regionId; 
        private DlqPolicy dlqPolicy; 
        private String endpoint; 
        private String messageTag; 
        private String notifyContentFormat; 
        private String notifyStrategy; 
        private String pushType; 
        private String stsRoleArn; 
        private String subscriptionName; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dlqPolicy = request.dlqPolicy;
            this.endpoint = request.endpoint;
            this.messageTag = request.messageTag;
            this.notifyContentFormat = request.notifyContentFormat;
            this.notifyStrategy = request.notifyStrategy;
            this.pushType = request.pushType;
            this.stsRoleArn = request.stsRoleArn;
            this.subscriptionName = request.subscriptionName;
            this.topicName = request.topicName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The dead-letter queue policy.</p>
         */
        public Builder dlqPolicy(DlqPolicy dlqPolicy) {
            String dlqPolicyShrink = shrink(dlqPolicy, "DlqPolicy", "json");
            this.putQueryParameter("DlqPolicy", dlqPolicyShrink);
            this.dlqPolicy = dlqPolicy;
            return this;
        }

        /**
         * <p>The receiver endpoint. The format of the endpoint varies based on the terminal type.</p>
         * <ul>
         * <li>If you set PushType to http, set Endpoint to an <code>HTTP URL that starts with http:// or https://</code>.</li>
         * <li>If you set PushType to queue, set Endpoint to a <code>queue name</code>.</li>
         * <li>If you set PushType to mpush, set Endpoint to an <code>AppKey</code>.</li>
         * <li>If you set PushType to alisms, set Endpoint to a <code>mobile number</code>.</li>
         * <li>If you set PushType to email, set Endpoint to an <code>email address</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com">http://example.com</a></p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The tag that is used to filter messages. Only messages that have the same tag can be pushed. Set the value to a string of no more than 16 characters.</p>
         * <p>By default, no tag is specified to filter messages.</p>
         * 
         * <strong>example:</strong>
         * <p>important</p>
         */
        public Builder messageTag(String messageTag) {
            this.putQueryParameter("MessageTag", messageTag);
            this.messageTag = messageTag;
            return this;
        }

        /**
         * <p>The content format of the messages that are pushed to the endpoint. Valid values:</p>
         * <ul>
         * <li>XML</li>
         * <li>JSON</li>
         * <li>SIMPLIFIED</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>XML</p>
         */
        public Builder notifyContentFormat(String notifyContentFormat) {
            this.putQueryParameter("NotifyContentFormat", notifyContentFormat);
            this.notifyContentFormat = notifyContentFormat;
            return this;
        }

        /**
         * <p>The retry policy that is applied if an error occurs when Message Service (MNS) pushes messages to the endpoint. Valid values:</p>
         * <ul>
         * <li>BACKOFF_RETRY</li>
         * <li>EXPONENTIAL_DECAY_RETRY</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKOFF_RETRY</p>
         */
        public Builder notifyStrategy(String notifyStrategy) {
            this.putQueryParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <p>The terminal type. Valid values:</p>
         * <ul>
         * <li>http: HTTP services</li>
         * <li>queue: queues</li>
         * <li>mpush: mobile devices</li>
         * <li>alisms: Alibaba Cloud Short Message Service (SMS)</li>
         * <li>email: emails</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>queue</p>
         */
        public Builder pushType(String pushType) {
            this.putQueryParameter("PushType", pushType);
            this.pushType = pushType;
            return this;
        }

        /**
         * StsRoleArn.
         */
        public Builder stsRoleArn(String stsRoleArn) {
            this.putQueryParameter("StsRoleArn", stsRoleArn);
            this.stsRoleArn = stsRoleArn;
            return this;
        }

        /**
         * <p>The name of the subscription.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSubscription</p>
         */
        public Builder subscriptionName(String subscriptionName) {
            this.putQueryParameter("SubscriptionName", subscriptionName);
            this.subscriptionName = subscriptionName;
            return this;
        }

        /**
         * <p>The name of the topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder topicName(String topicName) {
            this.putQueryParameter("TopicName", topicName);
            this.topicName = topicName;
            return this;
        }

        @Override
        public SubscribeRequest build() {
            return new SubscribeRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
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
             * <p>The queue to which dead-letter messages are delivered.</p>
             * 
             * <strong>example:</strong>
             * <p>deadLetterTargetQueue</p>
             */
            public Builder deadLetterTargetQueue(String deadLetterTargetQueue) {
                this.deadLetterTargetQueue = deadLetterTargetQueue;
                return this;
            }

            /**
             * <p>Specifies whether to enable the dead-letter message delivery.</p>
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
}
