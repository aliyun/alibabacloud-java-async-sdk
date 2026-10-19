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
    @com.aliyun.core.annotation.NameInMap("DmAttributes")
    private DmAttributes dmAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DysmsAttributes")
    private DysmsAttributes dysmsAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KafkaAttributes")
    private KafkaAttributes kafkaAttributes;

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
    @com.aliyun.core.annotation.NameInMap("TenantRateLimitPolicy")
    private TenantRateLimitPolicy tenantRateLimitPolicy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TopicName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String topicName;

    private SubscribeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dlqPolicy = builder.dlqPolicy;
        this.dmAttributes = builder.dmAttributes;
        this.dysmsAttributes = builder.dysmsAttributes;
        this.endpoint = builder.endpoint;
        this.kafkaAttributes = builder.kafkaAttributes;
        this.messageTag = builder.messageTag;
        this.notifyContentFormat = builder.notifyContentFormat;
        this.notifyStrategy = builder.notifyStrategy;
        this.pushType = builder.pushType;
        this.stsRoleArn = builder.stsRoleArn;
        this.subscriptionName = builder.subscriptionName;
        this.tenantRateLimitPolicy = builder.tenantRateLimitPolicy;
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
     * @return dmAttributes
     */
    public DmAttributes getDmAttributes() {
        return this.dmAttributes;
    }

    /**
     * @return dysmsAttributes
     */
    public DysmsAttributes getDysmsAttributes() {
        return this.dysmsAttributes;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return kafkaAttributes
     */
    public KafkaAttributes getKafkaAttributes() {
        return this.kafkaAttributes;
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

    public static final class Builder extends Request.Builder<SubscribeRequest, Builder> {
        private String regionId; 
        private DlqPolicy dlqPolicy; 
        private DmAttributes dmAttributes; 
        private DysmsAttributes dysmsAttributes; 
        private String endpoint; 
        private KafkaAttributes kafkaAttributes; 
        private String messageTag; 
        private String notifyContentFormat; 
        private String notifyStrategy; 
        private String pushType; 
        private String stsRoleArn; 
        private String subscriptionName; 
        private TenantRateLimitPolicy tenantRateLimitPolicy; 
        private String topicName; 

        private Builder() {
            super();
        } 

        private Builder(SubscribeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dlqPolicy = request.dlqPolicy;
            this.dmAttributes = request.dmAttributes;
            this.dysmsAttributes = request.dysmsAttributes;
            this.endpoint = request.endpoint;
            this.kafkaAttributes = request.kafkaAttributes;
            this.messageTag = request.messageTag;
            this.notifyContentFormat = request.notifyContentFormat;
            this.notifyStrategy = request.notifyStrategy;
            this.pushType = request.pushType;
            this.stsRoleArn = request.stsRoleArn;
            this.subscriptionName = request.subscriptionName;
            this.tenantRateLimitPolicy = request.tenantRateLimitPolicy;
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
         * <p>The email push attributes. This parameter is required when PushType is set to dm. The value is in JSON format and contains the following fields:</p>
         * <ul>
         * <li>AccountName: The sender address configured in DirectMail (such as <a href="mailto:notify@example.com">notify@example.com</a>).</li>
         * <li>Subject: The email subject.</li>
         * </ul>
         */
        public Builder dmAttributes(DmAttributes dmAttributes) {
            String dmAttributesShrink = shrink(dmAttributes, "DmAttributes", "json");
            this.putQueryParameter("DmAttributes", dmAttributesShrink);
            this.dmAttributes = dmAttributes;
            return this;
        }

        /**
         * <p>The SMS push attributes. This parameter is required when PushType is set to alisms. The value is in JSON format and contains the following fields:</p>
         * <ul>
         * <li>TemplateCode: The SMS template code, which can be obtained from the Short Message Service console.</li>
         * <li>SignName: The SMS signature name.</li>
         * </ul>
         */
        public Builder dysmsAttributes(DysmsAttributes dysmsAttributes) {
            String dysmsAttributesShrink = shrink(dysmsAttributes, "DysmsAttributes", "json");
            this.putQueryParameter("DysmsAttributes", dysmsAttributesShrink);
            this.dysmsAttributes = dysmsAttributes;
            return this;
        }

        /**
         * <h2>Endpoint address for receiving messages</h2>
         * <p>The format varies depending on the value of <code>PushType</code>:</p>
         * <ul>
         * <li><code>PushType=http</code>: An HTTP/HTTPS callback URL, such as <code>http://example.com/callback</code> or <code>https://example.com/callback</code>.</li>
         * <li><code>PushType=queue</code>: The ARN of the destination queue, in the format <code>acs:mns:{RegionId}:{Alibaba Cloud account ID}:queues/{QueueName}</code>.</li>
         * <li><code>PushType=dm</code>: The email push endpoint, in the fixed format <code>smq-ep:dm:{Alibaba Cloud account ID}:__dynamic</code>. Replace <code>{Alibaba Cloud account ID}</code> with your Alibaba Cloud account ID.</li>
         * <li><code>PushType=dysms</code>: The SMS push endpoint, in the format <code>smq-ep:dysms:{Alibaba Cloud account ID}:{PhoneNumber}</code>.</li>
         * <li><code>PushType=kafka</code>: The Kafka push endpoint. The Kafka push type is deprecated.</li>
         * <li><code>PushType=fc</code>: The Function Compute endpoint, in the format <code>acs:fc:{RegionId}:{Alibaba Cloud account ID}:services/{ServiceName}/functions/{FunctionName}</code>.</li>
         * <li><code>PushType=eventbus</code>: The EventBridge endpoint, in the format <code>acs:eventbridge:{RegionId}:{Alibaba Cloud account ID}:eventbus/{EventBusName}</code>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>http://*****.com/uri1/xxx</p>
         */
        public Builder endpoint(String endpoint) {
            this.putQueryParameter("Endpoint", endpoint);
            this.endpoint = endpoint;
            return this;
        }

        /**
         * <p>The Kafka push type is deprecated.</p>
         */
        public Builder kafkaAttributes(KafkaAttributes kafkaAttributes) {
            String kafkaAttributesShrink = shrink(kafkaAttributes, "KafkaAttributes", "json");
            this.putQueryParameter("KafkaAttributes", kafkaAttributesShrink);
            this.kafkaAttributes = kafkaAttributes;
            return this;
        }

        /**
         * <p>The tag used for message filtering in this subscription. Only messages with a matching tag are pushed. The value is a string of up to 16 characters.</p>
         * <p>By default, no message filtering is applied.</p>
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
         * <h2>Format of the pushed message content</h2>
         * <p>Valid values:</p>
         * <ul>
         * <li><code>XML</code>: The message body is pushed in XML format. This is the default value.</li>
         * <li><code>JSON</code>: The message body is pushed in JSON format.</li>
         * <li><code>SIMPLIFIED</code>: Only the raw message body content is pushed, without SMQ metadata wrapping.</li>
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
         * <p>The retry strategy when an error occurs while pushing messages to the endpoint. Valid values:</p>
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
            this.putQueryParameter("NotifyStrategy", notifyStrategy);
            this.notifyStrategy = notifyStrategy;
            return this;
        }

        /**
         * <h2>Push type of the subscription</h2>
         * <p>Valid values:</p>
         * <ul>
         * <li><p><code>http</code>: HTTP/HTTPS push. Pushes messages to a specified HTTP or HTTPS callback URL.</p>
         * </li>
         * <li><p><code>queue</code>: Queue push. Pushes messages to a specified SMQ queue.</p>
         * </li>
         * <li><p><code>dm</code>: Email push. Sends notifications through DirectMail. You must also set the <code>DmAttributes</code> and <code>StsRoleArn</code> parameters.</p>
         * </li>
         * <li><p><code>dysms</code>: SMS push. Sends notifications through Alibaba Cloud Short Message Service. You must also set the <code>DysmsAttributes</code> parameter.</p>
         * </li>
         * <li><p><code>fc</code>: Function Compute push. Pushes messages to Alibaba Cloud Function Compute (FC).</p>
         * </li>
         * <li><p><code>eventbus</code>: EventBridge push. Pushes messages to an EventBridge event bus.</p>
         * </li>
         * </ul>
         * <p><strong>Note:</strong>
         * The following values are deprecated and are only used for compatibility with legacy subscriptions:</p>
         * <ul>
         * <li><code>mpush</code>: Mobile push.</li>
         * <li><code>alisms</code>: Legacy SMS.</li>
         * <li><code>email</code>: Legacy email. Use <code>dm</code> instead.</li>
         * <li><code>kafka</code>: Kafka push type is deprecated.</li>
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
         * <p>The ARN of the RAM role assumed by the service. The format is acs:ram::{Alibaba Cloud account ID}:role/{RoleName}. Replace {Alibaba Cloud account ID} with the Alibaba Cloud account ID that calls the API operation.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:role/AliyunMNSNotificationRole</p>
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
         * <p>The throttling policy.</p>
         */
        public Builder tenantRateLimitPolicy(TenantRateLimitPolicy tenantRateLimitPolicy) {
            String tenantRateLimitPolicyShrink = shrink(tenantRateLimitPolicy, "TenantRateLimitPolicy", "json");
            this.putQueryParameter("TenantRateLimitPolicy", tenantRateLimitPolicyShrink);
            this.tenantRateLimitPolicy = tenantRateLimitPolicy;
            return this;
        }

        /**
         * <p>The name of the topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>topic****1</p>
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
             * <p>Specifies whether to enable dead-letter message delivery.</p>
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
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class DmAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Subject")
        private String subject;

        private DmAttributes(Builder builder) {
            this.accountName = builder.accountName;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DmAttributes create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private String accountName; 
            private String subject; 

            private Builder() {
            } 

            private Builder(DmAttributes model) {
                this.accountName = model.accountName;
                this.subject = model.subject;
            } 

            /**
             * <p>The sender address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:notify@example.com">notify@example.com</a></p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>The email subject.</p>
             * 
             * <strong>example:</strong>
             * <p>notify</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public DmAttributes build() {
                return new DmAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class DysmsAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private DysmsAttributes(Builder builder) {
            this.signName = builder.signName;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DysmsAttributes create() {
            return builder().build();
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private String signName; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(DysmsAttributes model) {
                this.signName = model.signName;
                this.templateCode = model.templateCode;
            } 

            /**
             * <p>The SMS signature name.</p>
             * 
             * <strong>example:</strong>
             * <p>阿里云短信测试专用</p>
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * <p>The SMS template code.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public DysmsAttributes build() {
                return new DysmsAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
     */
    public static class KafkaAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BusinessMode")
        private String businessMode;

        private KafkaAttributes(Builder builder) {
            this.businessMode = builder.businessMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static KafkaAttributes create() {
            return builder().build();
        }

        /**
         * @return businessMode
         */
        public String getBusinessMode() {
            return this.businessMode;
        }

        public static final class Builder {
            private String businessMode; 

            private Builder() {
            } 

            private Builder(KafkaAttributes model) {
                this.businessMode = model.businessMode;
            } 

            /**
             * <p>The Kafka push type is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>Default empty string</p>
             */
            public Builder businessMode(String businessMode) {
                this.businessMode = businessMode;
                return this;
            }

            public KafkaAttributes build() {
                return new KafkaAttributes(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubscribeRequest} extends {@link TeaModel}
     *
     * <p>SubscribeRequest</p>
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
             * <p>Specifies whether to enable the throttling policy. Valid values: true and false.</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The maximum number of pushes or consumptions per second.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
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
}
